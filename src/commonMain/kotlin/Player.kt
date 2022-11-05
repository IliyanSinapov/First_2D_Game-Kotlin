import com.soywiz.korge.view.*

class Player {

    var posX: Float;
    var posY: Float;
    var hp: Int;
    var atk: Int;
    var view: View;
    var xpLevel: Int;


    constructor(posX: Float, posY: Float, hp: Int, atk: Int, view: View, xpLevel: Int) {
        this.posX = posX;
        this.posY = posY;
        this.hp = hp;
        this.atk = atk;
        this.view = view;
        this.xpLevel = xpLevel;
    }


    @JvmName("posX_getter")
    fun getPosX(): Float {
        return this.posX;
    }

    @JvmName("posX_setter")
    fun setPosX(posX: Float) {
        this.posX = posX;
    }

    @JvmName("posY_getter")
    fun getPosY(): Float {
        return this.posY;
    }

    @JvmName("posY_setter")
    fun setPosY(posY: Float) {
        this.posY = posY;
    }

    @JvmName("view_getter")
    fun getView(): View {
        return this.view;
    }

    @JvmName("view_setter")
    fun setView(view: View) {
        this.view = view;
    }

    @JvmName("atk_getter")
    fun getAtk(): Int {
        return this.atk;
    }

    @JvmName("atk_setter")
    fun setAtk(atk: Int) {
        this.atk = atk;
    }

    @JvmName("hp_getter")
    fun getHp(): Int {
        return this.hp;
    }

    @JvmName("hp_setter")
    fun setHp(hp: Int) {
        this.hp = hp;
    }

    @JvmName("xpLevel_getter")
    fun getXpLevel(): Int {
        return this.xpLevel;
    }

    @JvmName("xpLevel_setter")
    fun setXpLevel(xpLevel: Int) {
        this.xpLevel = xpLevel;
    }
}
