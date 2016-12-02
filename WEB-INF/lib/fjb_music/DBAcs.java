package apli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.driver.OracleDriver;

//DB�A�N�Z�X�N���X
public class DBAcs {
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	//���I���N���ŗ��p����id�ƃp�X���[�h��ݒ肵�Ă�������
	private String  id = "x15gc";
	private String  pw = "fjbgc";

	//�R���X�g���N�^
	public DBAcs(){
		System.out.println("���O�C���������s");
		try {
			String url = "jdbc:oracle:thin:@ux2.chiba-fjb.ac.jp:1521:orcl";
			OracleDriver driver = new OracleDriver();
			// DB�ɐڑ�
			con = DriverManager.getConnection(url,id,pw);
		    stmt = con.createStatement();
			System.out.println("���O�C������");

		} catch (Exception e) {
			System.out.println("���O�C�����s");
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	//select�����s���\�b�h
	public ResultSet selectExe(String sql){
		System.out.println("SELECT�����s");
		System.out.println("SQL���F"+sql);
		try{
			rs = stmt.executeQuery(sql);
		}catch(Exception ex){
			System.out.println("SELECT�����s");
			this.closeDB();
			ex.printStackTrace();
		}
		System.out.println("SELECT������");
		return rs;
	}

	//insert�Aupdate�����s���\�b�h
	public int UpdateExe(String sql){
		System.out.println("INSERT�A����UPDATE�����s");
		System.out.println("SQL��"+sql);
		int cnt =0;
		try {
			cnt = stmt.executeUpdate(sql);
		} catch (Exception ex) {
			System.out.println("INSERT�A����UPDATE�����s");
			this.closeDB();
			ex.printStackTrace();
		}
		System.out.println("INSERT�A����UPDATE������");
		return cnt;
	}

	//DB�ؒf���\�b�h
	public void closeDB(){
		try{
			System.out.println("DB�ؒf����");
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(con!=null){
				con.close();
			}
			System.out.println("DB�ؒf����");
		}catch(Exception ex){
			System.out.println("DB�ؒf���s");
			ex.printStackTrace();
		}
	}

}
