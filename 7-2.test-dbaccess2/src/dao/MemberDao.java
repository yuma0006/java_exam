package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import common.DBManager;
import exam.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {

	private static final String TABLE_NAME = "test_members";
	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<Member> findAll(){
		Connection con = DBManager.createConnection();
		String sql = "ここにSQL文を書く"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに全件検索処理を書く
			
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return　メンバー情報(検索されなかった場合はnullが返ります)
	 */
	public Member load(int id){
		Connection con = DBManager.createConnection();
		String sql = "SELECT id,name,age,dep_id FROM " + TABLE_NAME + " WHERE id =" +id;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに主キー検索処理を書く
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				Member member = new Member();

				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setAge(rs.getInt("age"));
				member.setDep_id(rs.getInt("dep_id"));
				System.out.println("id =" + id + "name = " + name + "age = " + age + "dep_id =" + dep_id );
				

				
			}
			
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public void insert(Member member){
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO " + TABLE_NAME + "(id,name,age,dep_id) VALUSE (?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書く

			Member member2 = new Member();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

}
