import org.kohsuke.github.*;

import javax.swing.*;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        //en la rama master tenemos la creacion del repositoro con el token insertado en el codigo.
        GitHub github = null;
        try {
            github = new GitHubBuilder().withOAuthToken("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").build();
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
