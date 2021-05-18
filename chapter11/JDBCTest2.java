package chapter11;

public class JDBCTest2 {
	public static void main(String[] args) throws Exception {
		LprodDao lprodDao = new LprodDao();
		LprodVO[] vos = lprodDao.select();
		System.out.println("ID\t\t구분\t\t이름");
		for (LprodVO vo : vos) {
			System.out.println(vo.getLprodId() + "\t\t" + vo.getLprodGu() + "\t\t" + vo.getLprodNm());
		}
	}
}
