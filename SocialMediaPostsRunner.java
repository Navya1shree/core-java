class SocialMediaPostsRunner{

public static void main(String[]posts){
	
SocialMediaPosts  ref=new SocialMediaPosts("its__me__navya04","education",18.7f,"34-05-2026","instagram",1000000l,155500l);
ref.userName="its__me__navya04";
ref.content="education";
ref.views=18.7f;
ref.postsDate="34-05-2026";
ref.platformName="instagram";
ref.noOfLikes=1000000l;
ref.noOfShares=155500l;

ref.getSocialMediaPosts();


}
}