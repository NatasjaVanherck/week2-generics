package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class Team<T extends Player>{
	private String name;
	private int played;
	private int won;
	private int lost;
	private int tied;
	private ArrayList<T> members = new ArrayList<>();
	
	public Team (String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPlayed() {
		return played;
	}

	public int getLost() {
		return lost;
	}

	public int getTied() {
		return tied;
	}
	
	public int getWon(){
		return won;
	}

	public ArrayList<T> getMembers() {
		return members;
	}
	
	public void addPlayer (T player){
			if(!(members.contains(player))){
				members.add(player);
			}
	}
	
	public int numberOfPlayers (){
		return members.size();
	}
	
	public <E extends Player> void matchResult(Team<E> opponent, int ourScore, int theirScore){	
		if(opponent != null){
			opponent.played++;
			this.played++;
			if (ourScore == theirScore) {
				this.tied++;
				opponent.tied++;
			} else{
				if (ourScore > theirScore) {
					this.won++;
					opponent.lost++;
				} else {
					this.lost++;
					opponent.won++;
				}
			}
		} else {
			this.played++;
			if (ourScore == theirScore) {
				this.tied++;
			} else{
				if (ourScore > theirScore) {
					this.won++;
				} else {
					this.lost++;
				}
			}
		}
	}
	
	public int ranking(){
		int score;	
		score = 3 * won;
		score = score + tied;
		return score;
	}
}
