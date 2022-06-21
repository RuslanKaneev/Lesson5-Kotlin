import org.junit.jupiter.api.Test
import vkpost.Post
import vkpost.WallService

class WallServiceTest {

    @Test
    fun add(){
        WallService.add(post = Post())
    }

    @Test
    fun update(){
        WallService.update(post = Post())
    }
}