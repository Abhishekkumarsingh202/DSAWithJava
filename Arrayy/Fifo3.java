import java.util.Scanner;

public class Fifo3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pages: ");
        int n = sc.nextInt();

        int[] pages = new int[n];

        System.out.println("Enter page reference string:");
        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
        }

        System.out.print("Enter number of frames: ");
        int f = sc.nextInt();

        int[] frames = new int[f];

        for (int i = 0; i < f; i++) {
            frames[i] = -1;
        }

        int pointer = 0;
        int pageFaults = 0;
        int pageHits = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < f; j++) {
                if (frames[j] == pages[i]) {
                    found = true;
                    pageHits++;
                    break;
                }
            }

            if (!found) {
                frames[pointer] = pages[i];
                pointer = (pointer + 1) % f;
                pageFaults++;
            }

            System.out.print("Page " + pages[i] + " : ");

            for (int j = 0; j < f; j++) {
                if (frames[j] == -1)
                    System.out.print("- ");
                else
                    System.out.print(frames[j] + " ");
            }

            if (found)
                System.out.println("-> HIT");
            else
                System.out.println("-> FAULT");
        }

        System.out.println("\nTotal Page Faults = " + pageFaults);
        System.out.println("Total Page Hits = " + pageHits);

        sc.close();
    }
}
