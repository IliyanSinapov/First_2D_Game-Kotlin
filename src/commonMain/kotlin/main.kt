import com.soywiz.klock.*
import com.soywiz.klogger.*
import com.soywiz.korev.*
import com.soywiz.korge.*
import com.soywiz.korge.component.*
import com.soywiz.korge.tween.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*
import com.soywiz.korma.geom.*
import com.soywiz.korma.interpolation.*
import kotlin.random.*


suspend fun main() =
    Korge(width = 1280, height = 720, bgcolor = Colors["#2b2b2b"], virtualHeight = 1080, virtualWidth = 1920) {
        var player = Player((width / 2 - 50).toFloat(), (height / 2 - 50).toFloat(), 15, 5, this, 1);
        var playerRect = solidRect(50, 50, Colors["#030033"]).xy(player.getPosX(), player.getPosY());

        val ground_bitmap = resourcesVfs["assets/images/tiles/ground/ground_tile.png"].readBitmap();

        val world = Array(20) { Array(11) { "" } };

        var i = 0;

        while (i < world.size) {
            var j = 0;
            while (j < world[i].size) {
                world[i][j] = (j + 1).toString();

                val builder = StringBuilder()
                builder.append(world[i][j])
                    .append(" ");

                println(builder.toString());
                j += 1;
            }
            i += 1;
        }

        generateWorld(world);

        this.addUpdater {
            if (input.keys[Key.D]) {
                player.setPosX(player.getPosX() + 5);
                playerRect.xy(player.getPosX(), player.getPosY());
            }
            if (input.keys[Key.W]) {
                player.setPosY(player.getPosY() - 5);
                playerRect.xy(player.getPosX(), player.getPosY());
            }
            if (input.keys[Key.S]) {
                player.setPosY(player.getPosY() + 5);
                playerRect.xy(player.getPosX(), player.getPosY());
            }
            if (input.keys[Key.A]) {
                player.setPosX(player.getPosX() - 5);
                playerRect.xy(player.getPosX(), player.getPosY());
            }
        }
    }

fun generateWorld(arr: Array<Array<String>>) {
    var row = Random.nextInt(0, 20);
    var col = Random.nextInt(0, 11);
    var type = Random.nextInt(1, 5);

    if (!arr[row][col].contains(type.toString())) {
        generateWorld(arr);
    } else {

    }
}

fun outOfBounds(rox: Int, col: Int){

}
