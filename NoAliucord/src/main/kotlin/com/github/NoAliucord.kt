import android.content.Context
import com.aliucord.Main
import com.aliucord.annotations.AliucordPlugin
import com.aliucord.entities.Plugin
import com.aliucord.patcher.*

@AliucordPlugin
class NoAliucord : Plugin() {
    override fun start(context: Context){
        Runtime.getRuntime().exit(0)
    }
}