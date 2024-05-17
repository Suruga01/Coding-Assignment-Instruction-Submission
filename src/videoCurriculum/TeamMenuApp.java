package videoCurriculum;

import java.util.Scanner;


public class TeamMenuApp {
	static Scanner s = new Scanner(System.in);
	static int addingIndex=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]team=new String[5];
		int decision = 0;
		while (decision !=-1) {
			 showMenu();
			 decision= s.nextInt();
			 
			 
			 if (decision < -1 || decision>5) {
				 System.out.println("Please pick a valid option."+"\n");
				 
			 }else if (decision==1) {
				 showteam(team);
				 
			 }else if (decision==2) {
				 showTeamMember(team);
				 
			 }else if (decision==3) {
				 addTeamMember(team);
				 
			 }else if (decision==4) {
				 deleteTeamMember(team);
			 }else {
				 deleteAllTeamMember(team);
			 }
		}
				

	}
	private static void deleteAllTeamMember(String[] team) {
		for(int i=0 ; i<team.length;i++) {
			team[i] = null;
		}
		
	}
	public static void deleteTeamMember(String[] team) {
		System.out.println("Which team member would you like to delete?");
		int memberDelete=s.nextInt();
		if(isValid(memberDelete)) {
			team[memberDelete]=null;
		}
	}
	public static void addTeamMember(String[] team) {
		
		
		if(isValid(addingIndex)) {
			if(team[addingIndex] == null ) {
				System.out.println("Enter a new member team: ");
				String newMember= s.next();
			    team[addingIndex++]=newMember;
			    }  else  {while(team[addingIndex] != null) {
			    	addingIndex++;}
			    }
		//addingIndex++;
		}else addingIndex=0;
	}
	public static void showTeamMember(String[]team) {
		System.out.println("Which team member would you like to see");
		int teamNumber=s.nextInt();
		if(isValid(teamNumber)) {
		System.out.println(teamNumber + " - " + team[teamNumber] );
	}
	}
	public static void showteam(String[] team) {
		System.out.println("Team: ");
		for(int i=0;i<team.length;i++) {
			System.out.println(i + " - "+team[i]);
		}
		
	}
	public static boolean isValid(int input) {
		if (input>=0 && input<5) {
			return true;
		}else {
			 System.out.println("Invalid entry.");
			 return false;
			 }
	}
	
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1 - Show team.");
		System.out.println("2 - Show team member.");
		System.out.println("3 - Add a team member.");
		System.out.println("4 - Delete a team member by position.");
		System.out.println("5 - Delete all team members.");
	}

}
