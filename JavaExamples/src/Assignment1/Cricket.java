package Assignment1;
/*
 * Question 2: Write a program to create a static Array, having following cricket data:
--name, age, team name, DOB, gender, Strike Rate
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console
 */
public class Cricket {
	
	String name;
	int age;
	String teamName;
	String dob;
	char gender;
	double strikeRate;

	public Cricket(String name, int age, String teamName, String dob, char gender, double strikeRate) {
		
		this.name=name;
		this.age=age;
		this.teamName=teamName;
		this.dob=dob;
		this.gender=gender;
		this.strikeRate=strikeRate;
		
	}

	public static void main(String[] args) {
	
		Cricket[] players  = new Cricket[3];
		players[0] = new Cricket("Ganguly",25,"KKR","01/01/1981",'M',92.5);
		players[1] = new Cricket("Sachin",30,"MI","01/01/1971",'M',66);
		players[2] = new Cricket("Dravid",32,"RCB","05/05/2005",'M',45);
		
		System.out.println("Players");
		System.out.println("************************************************");
		for(int i=0;i<players.length;i++)
		{
			System.out.println(players[i].name);
		}

	}

}
