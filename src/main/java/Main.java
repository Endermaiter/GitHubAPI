import org.kohsuke.github.*;

import javax.swing.*;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        GitHub github = null;
        try {
            github = new GitHubBuilder().withOAuthToken(JOptionPane.showInputDialog("Inserte el token:")).build();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            GHRepository repo = github.createRepository("new-repository").create();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
