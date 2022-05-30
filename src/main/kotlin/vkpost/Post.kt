package vkpost

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createBy: Int,
    val date: Int,
    var text: String,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    var comments: Comments,
    val copyright: String,
    var likes: Likes,
    var reports: Reports
) {

}