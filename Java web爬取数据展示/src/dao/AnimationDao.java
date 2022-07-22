package dao;

import vo.Animation;
import java.sql.*;
import java.util.ArrayList;

public class AnimationDao {
	public ArrayList<Animation> getAllAnimation() throws Exception {
		Animation anime = null;
		ArrayList<Animation> animations = new ArrayList<Animation>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_crawler", "root", "root");
		String sql="select * from animation order by star_time desc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			anime = new Animation();
			anime.setId(rs.getInt("id"));
			anime.setChinese_name(rs.getString("chinese_name"));
			anime.setOriginal_name(rs.getString("original_name"));
			anime.setEpisodes(rs.getInt("episodes"));
			anime.setBroadcast_time(rs.getString("broadcast_time"));
			anime.setPeople(rs.getString("people"));
			anime.setStar_time(rs.getString("star_time"));
			anime.setScore(rs.getInt("score"));
			anime.setTag(rs.getString("tag"));
			anime.setUrl(rs.getString("URL"));
			anime.setLow_image_url(rs.getString("low_image_URL"));
			anime.setLow_image_path(rs.getString("low_image_path"));
			anime.setHigh_image_url(rs.getString("high_image_URL"));
			anime.setHigh_image_path(rs.getString("high_image_path"));
			animations.add(anime);
		}
		rs.close();
		ps.close();
		con.close();
		return animations;
	}
}