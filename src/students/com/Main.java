package students.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Student student1 = new Student("gbess ", 01, 17.07);
		Student student2 = new Student("nightWalker ", 02, 18.15);
		Student student3 = new Student("mouhamed ", 03, 7);

		System.out.println(student1.displayDetails());
		System.out.println(student2.displayDetails());
		System.out.println(student3.displayDetails());

		// boucle for detail student
		/*
		 * Utilisez les boucles "for" pour parcourir les objets "Student" et afficher
		 * les détails de tous les
		 */
		// arrayList et list viennent de la meme collection ils permet de
		/* tableau dynamique */
		ArrayList<Student> studentList1 = new ArrayList<>();
		studentList1.add(student1);
		studentList1.add(student2);
		studentList1.add(student3);

		List<Student> studentList2 = new ArrayList<>();
		studentList2.add(student2);
		studentList2.add(student3);
		studentList2.add(student1);

		// Student[] students3 = new ArrayList<Student>() ;
		/* tableau non dynamique index fixe */
		Student[] studentList3 = new Student[3];
		studentList3[0] = student1;
		studentList3[1] = student2;
		studentList3[2] = student3;
		System.out.println("Methode 1");

		for (int i = 0; i < studentList1.size(); i++) {
			System.out.println("index = " + i);
			// tjr mettre element à recuperer à <null>
			Student student = null;
			student = studentList1.get(i);

			System.out.println(student.displayDetails());

		}

		/* 2ieme methode */
		System.out.println();
		System.out.println("Methode 2");

		for (Student student : studentList1) {

			System.out.println(student.displayDetails());
		}

		/* 3iem methode */
		System.out.println();
		System.out.println("Methode 3");
		studentList1.forEach(p -> {

			// 6

			if (p.getNote() < 10) {
				System.out.println("Vous avez echoué");
			} else {
				System.out.println("Vous êtes admis");
			}

			System.out.println();

			// premiere condition ternaire
			String message = (p.getNote() < 10) ? "Vous avez echouer" : "Vous êtes admis";
			System.out.println(message);

			System.out.println();
			// 2ieme condition ternaire
			System.out.println((p.getNote() < 10) ? "Vous avez echouer" : "Vous êtes admis");

		}

		);

		// ne marche pas sur les tableaux non dynamiques
		// studentList3.forEach(k -> System.out.println(k.displayDetails()));
		
		// 7
		//
		System.out.println(new Main().calculeDeMoyenne(studentList1));
		System.out.println("La moyenne de la classe est : " + calculeDeMoyenne(studentList2));
		System.out.println("La moyenne de la classe est : " + Main.calculeDeMoyenne(studentList2));
		
	}
	
	// le static est mis pour appeler la methos
	private static double calculeDeMoyenne(List<Student> studentsList) {
		
		double sommeNote = 0;
		double moyenne = 0;
		int nombreEtudiant = studentsList.size();
		for (Student student : studentsList) {	
			sommeNote = sommeNote + student.getNote(); 
		}
		System.out.println("sommeNote = " + sommeNote );
		System.out.println("Nombre etudiants = " + nombreEtudiant );
		
		moyenne = sommeNote / nombreEtudiant;
		return moyenne;
		
	}
}

	
