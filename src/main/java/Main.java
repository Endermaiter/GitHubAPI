import org.kohsuke.github.*;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        GitHub github = null;
        try {

            String pathAlFich = '';
            github = new GitHubBuilder().fromPropertyFile(pathAlFich).build();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
