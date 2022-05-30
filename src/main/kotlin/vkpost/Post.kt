package vkpost

data class Post(
    var id: Int=1,
    var ownerId: Int=1,
    val fromId: Int=1,
    val createBy: Int=0,
    var date: Int=23052022,
    val text: String="",
    val replyPostId: Int=3,
    val friendsOnly: Boolean=false,
    val comments: Comments = Comments(1,true,true,true,true),
    val copyright: String="",
    val likes: Likes = Likes(1,true,true,1),
    val reports: Reports = Reports(1,true)
) {

}