package vkpost

object WallService {
    private var posts = emptyArray<Post>()

    object private

    var idPost: Int = 0


    fun add(post: Post): Post {
        idPost++
        post.id = idPost
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (postVK in posts.withIndex()) {
            if (postVK.value.id == post.id) {
                post.ownerId = postVK.value.ownerId
                post.date = postVK.value.date
                posts[postVK.index] = post
                return true
            }
        }
        return false
    }

}
fun main(args: Array<String>) {
    var post: Post = Post(
        id = 1,
        ownerId = 1,
        fromId = 1,
        createBy = 0,
        date = 23052022,
        text = "",
        replyPostId = 3,
        friendsOnly = false,
        comments = Comments(1, true, true, true, true),
        copyright = "",
        likes = Likes(1, true, true, 1),
        reports = Reports(1, true)
    )
    var wall = WallService
    val result = wall.add(post)
    print(result)
}