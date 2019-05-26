package lesson6.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;

import java.util.ResourceBundle;


    public class Controller implements Initializable {
        @FXML
        TextArea textArea;

        @FXML
        TextField textField;

        @FXML
        Button sendBtn;

        Socket socket;
        DataInputStream inStream;
        DataOutputStream outStream;

        final String IP_ADRESS = "localhost";
        final int PORT = 8170;

        @Override
        public void initialize(URL location, ResourceBundle resources) {
            try {
                socket = new Socket(IP_ADRESS, PORT);
                inStream = new DataInputStream(socket.getInputStream());
                outStream = new DataOutputStream(socket.getOutputStream());

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (true) {
                                String str = inStream.readUTF();
                                textArea.appendText(str + "\n");
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                socket.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void sendMsg() {
            try {
                outStream.writeUTF(textField.getText());
                textField.clear();
                textField.requestFocus();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}


