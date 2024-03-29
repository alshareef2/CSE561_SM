import java.sql.Time;
import java.util.LinkedList;
import java.util.List;


public class Tweet {

	private int tweetID;
	private Time time;
	private int numberOfRT;
	private int UserID;
	private List<Hashtag> hashtags = new LinkedList<Hashtag>();

	/**
	 * @param tweetID
	 */
	public Tweet(int tweetID) {
		super();
		this.tweetID = tweetID;
		numberOfRT = 0;
	}

	/**
	 * @return the tweetID
	 */
	public int getTweetID() {
		return tweetID;
	}

	/**
	 * @param tweetID the tweetID to set
	 */
	public void setTweetID(int tweetID) {
		this.tweetID = tweetID;
	}

	/**
	 * @return the time
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Time time) {
		this.time = time;
	}
	
	
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return UserID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		UserID = userID;
	}

	/**
	 * @return the numberOfRT
	 */
	public void incrementNumberOfRT() {
		numberOfRT++;
	}
	
	/**
	 * @return the numberOfRT
	 */
	public int getNumberOfRT() {
		return numberOfRT;
	}

	/**
	 * @return the hashtags
	 */
	public List<Hashtag> getHashtags() {
		return hashtags;
	}

	/**
	 * @param hashtags the hashtags to set
	 */
	public void setHashtags(List<Hashtag> hashtags) {
		this.hashtags = hashtags;
	}
	
	
}
