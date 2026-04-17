import java.io.*;

public class StopAndWait {

    public static void main(String[] args) throws IOException {

        // Create pipes to simulate network communication
        // Sender -> Receiver
        PipedOutputStream senderOut = new PipedOutputStream();
        PipedInputStream receiverIn = new PipedInputStream(senderOut);

        // Receiver -> Sender (for ACK/NACk)
        PipedOutputStream receiverOut = new PipedOutputStream();
        PipedInputStream senderIn = new PipedInputStream(receiverOut);

        //  RECEIVER 
        Thread receiver = new Thread(() -> {
            try {
                // Input stream to receive frames
                DataInputStream in = new DataInputStream(receiverIn);
                // Output stream to send ACK/NACK
                DataOutputStream out = new DataOutputStream(receiverOut);

                // Flag to simulate corruption only once
                boolean isCorruptedOnce = false;

                // Continuously receive frames
                while (true) {
                    // Read frame from sender
                    String msg = in.readUTF();
                    System.out.println("[Receiver] Received: " + msg);

                    // Simulate network delay
                    Thread.sleep(1000);

                    // Simulate corruption for Frame 2 
                    if (msg.equals("Frame 2") && !isCorruptedOnce) {
                        System.out.println("[Receiver] Frame corrupted! Sending NACK...");
                        out.writeUTF("NACK");  // Send negative acknowledgment
                        isCorruptedOnce = true;
                        continue; // Wait for resend
                    }

                    // Send acknowledgment if frame is correct
                    System.out.println("[Receiver] Sending ACK...");
                    out.writeUTF("ACK");

                    // Stop after receiving last frame
                    if (msg.equals("Frame 3")) break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //SENDER 
        Thread sender = new Thread(() -> {
            try {
                // Output stream to send frames
                DataOutputStream out = new DataOutputStream(senderOut);
                // Input stream to receive ACK/NACK
                DataInputStream in = new DataInputStream(senderIn);

                // Frames to be sent
                String[] frames = {"Frame 1", "Frame 2", "Frame 3"};

                // Send each frame one by one
                for (String frame : frames) {

                    boolean acknowledged = false;

                    // Stop-and-Wait logic: wait until ACK is received
                    while (!acknowledged) {
                        System.out.println("[Sender] Sending: " + frame);
                        out.writeUTF(frame); // Send frame

                        // Wait for receiver response
                        String response = in.readUTF();

                        // If ACK received, move to next frame
                        if (response.equals("ACK")) {
                            System.out.println("[Sender] ACK received. Moving to next.\n");
                            acknowledged = true;
                        } else {
                            // If NACK received, resend same frame
                            System.out.println("[Sender] NACK received! Resending...\n");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Start both sender and receiver threads
        receiver.start();
        sender.start();
    }
}