package chapter10;

public class Unit {
	int currentHp;//유닛의 체력
	int x;//유닛의 x좌표
	int y;//유닛의 y좌표
}

interface Fightable extends Movable, Attackable{ }

	interface Movable{
		void move(int x, int y);
	}

	interface Attackable{
		void attack(Unit u);
	}


