package vo;

public class Animation {
	
	private int id; //id
	private String chinese_name; //中文名
	private String original_name; //原名
	private int episodes; //话数
	private String broadcast_time; //放送开始时间
	private String people; //导演/原作者/等人
	private String star_time; //收藏时间
	private int score; //个人评分
	private String tag; //个人标签
	private String url; //页面网址
	private String low_image_url; //缩略封面图网址
	private String low_image_path; //缩略封面图本地路径
	private String high_image_url; //高清封面图网址
	private String high_image_path; //高清封面图本地路径
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChinese_name() {
		return chinese_name;
	}
	public void setChinese_name(String chinese_name) {
		this.chinese_name = chinese_name;
	}
	public String getOriginal_name() {
		return original_name;
	}
	public void setOriginal_name(String original_name) {
		this.original_name = original_name;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	public String getBroadcast_time() {
		return broadcast_time;
	}
	public void setBroadcast_time(String broadcast_time) {
		this.broadcast_time = broadcast_time;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getStar_time() {
		return star_time;
	}
	public void setStar_time(String star_time) {
		this.star_time = star_time;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLow_image_url() {
		return low_image_url;
	}
	public void setLow_image_url(String low_image_url) {
		this.low_image_url = low_image_url;
	}
	public String getLow_image_path() {
		return low_image_path;
	}
	public void setLow_image_path(String low_image_path) {
		this.low_image_path = low_image_path;
	}
	public String getHigh_image_url() {
		return high_image_url;
	}
	public void setHigh_image_url(String high_image_url) {
		this.high_image_url = high_image_url;
	}
	public String getHigh_image_path() {
		return high_image_path;
	}
	public void setHigh_image_path(String high_image_path) {
		this.high_image_path = high_image_path;
	}
}