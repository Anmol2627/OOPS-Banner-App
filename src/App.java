/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using inline array initia
 *
 * @author Anmol
 * @version 5.0
 */
public class App {
    public static void main(String[] args) {

        String[] lines = {
            String.join("", "      ***      ***      *****       ***** "),
            String.join("", "     ** **    ** **    **   **    **      "),
            String.join("", "    **   **  **   **   **   **   **       "),
            String.join("", "    **   **  **   **   *****      ***     "),
            String.join("", "    **   **  **   **   **            **   "),
            String.join("", "     ** **    ** **    **             **  "),
            String.join("", "      ***      ***     **        *****    ")
        };
        for (String line : lines) {
            System.out.println(line);
        }
    }
}