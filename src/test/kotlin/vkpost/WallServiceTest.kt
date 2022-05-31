package vkpost

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
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
        val wall = WallService
        val result = wall.add(post)
        val postTest = result.copy(id=0)

        assertEquals(postTest,result)
    }


    @Test
    fun updateTrueId() {
        var post1: Post = Post(
            id = 2,
            ownerId = 2,
            fromId = 2,
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

        var post2: Post = Post(
            id = 3,
            ownerId = 3,
            fromId = 3,
            createBy = 20,
            date = 23052022,
            text = "",
            replyPostId = 4,
            friendsOnly = false,
            comments = Comments(1, true, true, true, true),
            copyright = "",
            likes = Likes(1, true, true, 1),
            reports = Reports(1, true)
        )


        var wall = WallService
        wall.add(post1)
        wall.add(post2)
        val resultBoolean = wall.update(post2)
        assertEquals(true,resultBoolean)
    }

    @Test
    fun updateFalseId() {
        var post1: Post = Post(
            id = 2,
            ownerId = 2,
            fromId = 2,
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

        var post3: Post = Post(
            id = 4,
            ownerId = 4,
            fromId = 4,
            createBy = 20,
            date = 23052022,
            text = "",
            replyPostId = 4,
            friendsOnly = false,
            comments = Comments(1, true, true, true, true),
            copyright = "",
            likes = Likes(1, true, true, 1),
            reports = Reports(1, true)
        )
        var wall = WallService
        wall.add(post1)
        val resultBooleanFalse = wall.update(post3)
        assertEquals(false,resultBooleanFalse)
    }
}