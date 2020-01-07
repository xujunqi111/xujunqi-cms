package com.xujunqi.cms.pojo;

public class Article {
	/**  **/
	private Integer id;
	/** 标题 **/
	private String title;
	/** 文章内容 **/
	private String content;
	/** 标题图片 **/
	private String picture;
	/** 所属栏目 **/
	private Integer channel_id;
	/** 所属分类 **/
	private Integer category_id;
	/** 用户Id **/
	private Integer user_id;
	/** 点击次数 **/
	private Integer hits;
	/** 是否热门 **/
	private Integer hot;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", picture=" + picture
				+ ", channel_id=" + channel_id + ", category_id=" + category_id + ", user_id=" + user_id + ", hits="
				+ hits + ", hot=" + hot + "]";
	}

	public Article(Integer id, String title, String content, String picture, Integer channel_id, Integer category_id,
			Integer user_id, Integer hits, Integer hot) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.picture = picture;
		this.channel_id = channel_id;
		this.category_id = category_id;
		this.user_id = user_id;
		this.hits = hits;
		this.hot = hot;
	}

	public Article() {
		super();
	}

}
