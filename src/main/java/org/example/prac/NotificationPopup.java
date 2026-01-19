package org.example.prac;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
public class NotificationPopup {
    Frame notificationFrame;
    Frame detailFrame;
    Label notificationLabel;
    TextArea detailText;
    Timer timer;
    TextArea textEditor;


    NotificationPopup() {

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        notificationFrame = new Frame();
        notificationFrame.setSize(300, 80);
        notificationFrame.setLayout(new FlowLayout());
        notificationFrame.setLocation(d.width - 320, d.height - 120);
        notificationFrame.setAlwaysOnTop(true);

        notificationLabel = new Label("🔔 New Notification!");
        notificationFrame.add(notificationLabel);


        detailFrame = new Frame("Notification Details");
        detailFrame.setSize(400, 300);
        detailText = new TextArea("This is a detailed notification message.");
        detailFrame.add(detailText);

        notificationFrame.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                notificationLabel.setText("🔔 You have a new message!");
                notificationFrame.setVisible(true);
                cancelTimer();
            }

            public void mouseClicked(MouseEvent e) {
                detailFrame.setVisible(true);
            }

            public void mouseExited(MouseEvent e) {
                startAutoHide();
            }
        });
    }

    void startAutoHide() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                notificationFrame.setVisible(false);
            }
        }, 3000);
    }

    void cancelTimer() {
        if (timer != null)
            timer.cancel();
    }

    public static void main(String[] args) {
        NotificationPopup np = new NotificationPopup();
        np.notificationFrame.setVisible(true);
    }
}
