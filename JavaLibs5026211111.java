import javax.swing.*;
public class JavaLibs5026211111 {
    public static void main (String[] args) {
        String[] places = {"Park", "Mall", "Beach", "Restaurant"};
        String name = JOptionPane.showInputDialog(null, "Who is your idol?","Question 1",3);
        String place = (String) JOptionPane.showInputDialog(null, "Where would you like to go?","Question 2",3, null, places, places[0]);
        String animal = JOptionPane.showInputDialog(null, "What is your favorite animal?","Question 3",3);
        String animal2 = JOptionPane.showInputDialog(null, "How would you describe "+animal+"?","Question 4",3);
        String item = JOptionPane.showInputDialog(null, "What is your prized item?","Question 5",3);
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick a number between 1-10","Question 6", 3));
        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your height (cm)?", "Question 7",3));
        String person = JOptionPane.showInputDialog(null, "Who is the last person you contacted?","Question 8",3);
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your favorite number","Question 11",3));
        int odd = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an odd number", "Question 12",3));
        int sum = num1+num2;
        double half = odd/2.0;
        System.out.println("I dreamt that "+name+" and I went to the "+place+". On our way there, we saw some "+animal2+" "+animal+"s on a bike. We also saw a big "+item+" tied to a bench.");
        System.out.println("Once we got to the "+place+", I bought "+num1+"balloons and I started floating. Before I knew it I was on top of the clouds and there was a big gate. ");
        System.out.println("I was about to go in, but then "+person+" stopped me and said I was only "+height+" cm and was too short to go in");
        System.out.println("So I turned back and found an old lady selling balloons and cakes. Then, I bought "+num2+" more balloons and "+odd+" cakes.");
        System.out.println("So now I have "+sum+" balloons and went back down. Once my feet reached the ground I let go of the balloons.");
        System.out.println("Then, I shared my cakes with "+name+" so now I only have "+half+" cakes left.");
        System.out.println("After that, I woke up from my dream and bought some cakes.");
    }
}
