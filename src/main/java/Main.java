import org.kohsuke.github.*;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        GitHub github = null;
        try {

            String pathAlFich = "/home/dam1/Documentos/ENDERMAITER/COD/accessToken.properties";
            github = new GitHubBuilder()
                    .fromPropertyFile(pathAlFich)
                    .build();
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
