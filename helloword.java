import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {
    // Le temps de votre chronomètre, ici 5 minutes (300 secondes)
    // C'est cette valeur que vous devez modifier pour changer la durée de votre chronomètre
    // Pourquoi ne pas lire la valeur depuis l'entrée standard plutôt ?
    public static int time = 300;

    public void run() {
		int minutes = (time % 3600) / 60;
		int seconds = time % 60;

        // Permet de formater le temps comme on veut (00:00)
		String timeString = String.format("%02d:%02d", minutes, seconds);

        System.out.println(timeString);

		time--;

        // On quite proprement le programme après la fin du timer
		if (time < 0) System.exit(0);
    }
}

class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();

        // On utilise notre objet timer avec lequel on va executer
        // une tache toutes les secondes (1000) sans attendre (0)
        timer.schedule(task, 0, 1000);
    }
}
public class helloword {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

    @Override
    public String toString() {
        return "helloword []";
    }
}

