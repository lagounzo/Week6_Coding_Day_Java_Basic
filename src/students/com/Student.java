/**
 * Exercice 1 : 

Les concepts de base de Java tels que les classes, les objets, les propriétés, les constructeurs, 
les méthodes, les boucles, les structures de contrôle, les fonctions et les algorithmes de tri.

1 - Créez une classe appelée "Student" avec les propriétés suivantes : nom (String), numéro d'étudiant (int), note (double).

2 - Créez un constructeur qui accepte un nom, un numéro d'étudiant et une note en entrée et initialise les propriétés de la classe.

3 - Créez une méthode appelée "displayDetails" qui affiche les détails de l'étudiant.

4 - Créez une classe appelée "Main" avec une méthode "main" qui instancie 3 objets "Student" 
avec des données différentes et appelle la méthode "displayDetails" pour chaque objet.

5 - Utilisez les boucles "for" pour parcourir les objets "Student" et afficher les détails de tous les étudiants.

6 - Utilisez les structures de contrôle telles que "if-else" pour vérifier la note d'un étudiant et afficher "pass" ou "fail" en conséquence.

7 - Créez une méthode qui calcule la moyenne des notes de tous les étudiants.

8 - Ajoutez une fonction pour trier les étudiants en fonction de leur nom ou de leur numéro d'étudiant 
en utilisant les algorithmes de tri tels que "trier par sélection" ou "trier par insertion".
8 h 09
 */

package students.com;

public class Student {

	private String nom;

	private int numeroEtudiant;

	private double note;

// construtor without parameter
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
// constructor with parameter

	public Student(String nom, int numeroEtudiant, double note) {
		super();
		this.nom = nom;
		this.numeroEtudiant = numeroEtudiant;
		this.note = note;
	}

// getter and setter

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public void setNumeroEtudiant(int numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

// class method
	
/*3 - Créez une méthode appelée "displayDetails" qui affiche les détails de l'étudiant */
	public String displayDetails() {
		return "Student [nom = " + nom + ", numeroEtudiant = " + numeroEtudiant + ", note = " + note + "]";
	}
	
	

}
