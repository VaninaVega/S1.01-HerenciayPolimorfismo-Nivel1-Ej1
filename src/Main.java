//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

      Play  instrument1 = new Windinst("Violin", 13);
      StringInst instrument2 = new StringInst("Guitar", 34);
      Play instrument3 = new PercussionInst("Drum", 56);


        instrument1.play();
        instrument2.play();
        instrument3.play();

        }
    }
