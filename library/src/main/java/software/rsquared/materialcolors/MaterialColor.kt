package software.rsquared.materialcolors

import android.graphics.Color
import android.support.annotation.FloatRange
import kotlin.math.roundToInt

class MaterialColor {
    companion object {
        @JvmField
        val red: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#FFEBEE"),
            100 to Color.parseColor("#FFCDD2"),
            200 to Color.parseColor("#EF9A9A"),
            300 to Color.parseColor("#E57373"),
            400 to Color.parseColor("#EF5350"),
            500 to Color.parseColor("#F44336"),
            600 to Color.parseColor("#E53935"),
            700 to Color.parseColor("#D32F2F"),
            800 to Color.parseColor("#C62828"),
            900 to Color.parseColor("#B71C1C")
        )

        @JvmField
        val redAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#FF8A80"),
            200 to Color.parseColor("#FF5252"),
            400 to Color.parseColor("#FF1744"),
            700 to Color.parseColor("#D50000")
        )

        @JvmField
        val pink: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#FCE4EC"),
            100 to Color.parseColor("#F8BBD0"),
            200 to Color.parseColor("#F48FB1"),
            300 to Color.parseColor("#F06292"),
            400 to Color.parseColor("#EC407A"),
            500 to Color.parseColor("#E91E63"),
            600 to Color.parseColor("#D81B60"),
            700 to Color.parseColor("#C2185B"),
            800 to Color.parseColor("#AD1457"),
            900 to Color.parseColor("#880E4F")
        )

        @JvmField
        val pinkAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#FF80AB"),
            200 to Color.parseColor("#FF4081"),
            400 to Color.parseColor("#F50057"),
            700 to Color.parseColor("#C51162")
        )

        @JvmField
        val purple: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#F3E5F5"),
            100 to Color.parseColor("#E1BEE7"),
            200 to Color.parseColor("#CE93D8"),
            300 to Color.parseColor("#BA68C8"),
            400 to Color.parseColor("#AB47BC"),
            500 to Color.parseColor("#9C27B0"),
            600 to Color.parseColor("#8E24AA"),
            700 to Color.parseColor("#7B1FA2"),
            800 to Color.parseColor("#6A1B9A"),
            900 to Color.parseColor("#4A148C")
        )

        @JvmField
        val purpleAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#EA80FC"),
            200 to Color.parseColor("#E040FB"),
            400 to Color.parseColor("#D500F9"),
            700 to Color.parseColor("#AA00FF")
        )

        @JvmField
        val deepPurple: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#EDE7F6"),
            100 to Color.parseColor("#D1C4E9"),
            200 to Color.parseColor("#B39DDB"),
            300 to Color.parseColor("#9575CD"),
            400 to Color.parseColor("#7E57C2"),
            500 to Color.parseColor("#673AB7"),
            600 to Color.parseColor("#5E35B1"),
            700 to Color.parseColor("#512DA8"),
            800 to Color.parseColor("#4527A0"),
            900 to Color.parseColor("#311B92")
        )

        @JvmField
        val deepPurpleAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#B388FF"),
            200 to Color.parseColor("#7C4DFF"),
            400 to Color.parseColor("#651FFF"),
            700 to Color.parseColor("#6200EA")
        )

        @JvmField
        val indigo: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#E8EAF6"),
            100 to Color.parseColor("#C5CAE9"),
            200 to Color.parseColor("#9FA8DA"),
            300 to Color.parseColor("#7986CB"),
            400 to Color.parseColor("#5C6BC0"),
            500 to Color.parseColor("#3F51B5"),
            600 to Color.parseColor("#3949AB"),
            700 to Color.parseColor("#303F9F"),
            800 to Color.parseColor("#283593"),
            900 to Color.parseColor("#1A237E")
        )

        @JvmField
        val indigoAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#8C9EFF"),
            200 to Color.parseColor("#536DFE"),
            400 to Color.parseColor("#3D5AFE"),
            700 to Color.parseColor("#304FFE")
        )

        @JvmField
        val blue: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#E3F2FD"),
            100 to Color.parseColor("#BBDEFB"),
            200 to Color.parseColor("#90CAF9"),
            300 to Color.parseColor("#64B5F6"),
            400 to Color.parseColor("#42A5F5"),
            500 to Color.parseColor("#2196F3"),
            600 to Color.parseColor("#1E88E5"),
            700 to Color.parseColor("#1976D2"),
            800 to Color.parseColor("#1565C0"),
            900 to Color.parseColor("#0D47A1")
        )

        @JvmField
        val blueAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#82B1FF"),
            200 to Color.parseColor("#448AFF"),
            400 to Color.parseColor("#2979FF"),
            700 to Color.parseColor("#2962FF")
        )

        @JvmField
        val lightBlue: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#E1F5FE"),
            100 to Color.parseColor("#B3E5FC"),
            200 to Color.parseColor("#81D4FA"),
            300 to Color.parseColor("#4FC3F7"),
            400 to Color.parseColor("#29B6F6"),
            500 to Color.parseColor("#03A9F4"),
            600 to Color.parseColor("#039BE5"),
            700 to Color.parseColor("#0288D1"),
            800 to Color.parseColor("#0277BD"),
            900 to Color.parseColor("#01579B")
        )

        @JvmField
        val lightBlueAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#80D8FF"),
            200 to Color.parseColor("#40C4FF"),
            400 to Color.parseColor("#00B0FF"),
            700 to Color.parseColor("#0091EA")
        )

        @JvmField
        val cyan: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#E0F7FA"),
            100 to Color.parseColor("#B2EBF2"),
            200 to Color.parseColor("#80DEEA"),
            300 to Color.parseColor("#4DD0E1"),
            400 to Color.parseColor("#26C6DA"),
            500 to Color.parseColor("#00BCD4"),
            600 to Color.parseColor("#00ACC1"),
            700 to Color.parseColor("#0097A7"),
            800 to Color.parseColor("#00838F"),
            900 to Color.parseColor("#006064")
        )

        @JvmField
        val cyanAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#84FFFF"),
            200 to Color.parseColor("#18FFFF"),
            400 to Color.parseColor("#00E5FF"),
            700 to Color.parseColor("#00B8D4")
        )

        @JvmField
        val teal: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#E0F2F1"),
            100 to Color.parseColor("#B2DFDB"),
            200 to Color.parseColor("#80CBC4"),
            300 to Color.parseColor("#4DB6AC"),
            400 to Color.parseColor("#26A69A"),
            500 to Color.parseColor("#009688"),
            600 to Color.parseColor("#00897B"),
            700 to Color.parseColor("#00796B"),
            800 to Color.parseColor("#00695C"),
            900 to Color.parseColor("#004D40")
        )

        @JvmField
        val tealAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#A7FFEB"),
            200 to Color.parseColor("#64FFDA"),
            400 to Color.parseColor("#1DE9B6"),
            700 to Color.parseColor("#00BFA5")
        )

        @JvmField
        val green: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#E8F5E9"),
            100 to Color.parseColor("#C8E6C9"),
            200 to Color.parseColor("#A5D6A7"),
            300 to Color.parseColor("#81C784"),
            400 to Color.parseColor("#66BB6A"),
            500 to Color.parseColor("#4CAF50"),
            600 to Color.parseColor("#43A047"),
            700 to Color.parseColor("#388E3C"),
            800 to Color.parseColor("#2E7D32"),
            900 to Color.parseColor("#1B5E20")
        )

        @JvmField
        val greenAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#B9F6CA"),
            200 to Color.parseColor("#69F0AE"),
            400 to Color.parseColor("#00E676"),
            700 to Color.parseColor("#00C853")
        )

        @JvmField
        val lightGreen: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#F1F8E9"),
            100 to Color.parseColor("#DCEDC8"),
            200 to Color.parseColor("#C5E1A5"),
            300 to Color.parseColor("#AED581"),
            400 to Color.parseColor("#9CCC65"),
            500 to Color.parseColor("#8BC34A"),
            600 to Color.parseColor("#7CB342"),
            700 to Color.parseColor("#689F38"),
            800 to Color.parseColor("#558B2F"),
            900 to Color.parseColor("#33691E")
        )

        @JvmField
        val lightGreenAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#CCFF90"),
            200 to Color.parseColor("#B2FF59"),
            400 to Color.parseColor("#76FF03"),
            700 to Color.parseColor("#64DD17")
        )

        @JvmField
        val lime: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#F9FBE7"),
            100 to Color.parseColor("#F0F4C3"),
            200 to Color.parseColor("#E6EE9C"),
            300 to Color.parseColor("#DCE775"),
            400 to Color.parseColor("#D4E157"),
            500 to Color.parseColor("#CDDC39"),
            600 to Color.parseColor("#C0CA33"),
            700 to Color.parseColor("#AFB42B"),
            800 to Color.parseColor("#9E9D24"),
            900 to Color.parseColor("#827717")
        )

        @JvmField
        val limeAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#F4FF81"),
            200 to Color.parseColor("#EEFF41"),
            400 to Color.parseColor("#C6FF00"),
            700 to Color.parseColor("#AEEA00")
        )

        @JvmField
        val yellow: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#FFFDE7"),
            100 to Color.parseColor("#FFF9C4"),
            200 to Color.parseColor("#FFF59D"),
            300 to Color.parseColor("#FFF176"),
            400 to Color.parseColor("#FFEE58"),
            500 to Color.parseColor("#FFEB3B"),
            600 to Color.parseColor("#FDD835"),
            700 to Color.parseColor("#FBC02D"),
            800 to Color.parseColor("#F9A825"),
            900 to Color.parseColor("#F57F17")
        )

        @JvmField
        val yellowAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#FFFF8D"),
            200 to Color.parseColor("#FFFF00"),
            400 to Color.parseColor("#FFEA00"),
            700 to Color.parseColor("#FFD600")
        )

        @JvmField
        val amber: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#FFF8E1"),
            100 to Color.parseColor("#FFECB3"),
            200 to Color.parseColor("#FFE082"),
            300 to Color.parseColor("#FFD54F"),
            400 to Color.parseColor("#FFCA28"),
            500 to Color.parseColor("#FFC107"),
            600 to Color.parseColor("#FFB300"),
            700 to Color.parseColor("#FFA000"),
            800 to Color.parseColor("#FF8F00"),
            900 to Color.parseColor("#FF6F00")
        )

        @JvmField
        val amberAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#FFE57F"),
            200 to Color.parseColor("#FFD740"),
            400 to Color.parseColor("#FFC400"),
            700 to Color.parseColor("#FFAB00")
        )

        @JvmField
        val orange: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#FFF3E0"),
            100 to Color.parseColor("#FFE0B2"),
            200 to Color.parseColor("#FFCC80"),
            300 to Color.parseColor("#FFB74D"),
            400 to Color.parseColor("#FFA726"),
            500 to Color.parseColor("#FF9800"),
            600 to Color.parseColor("#FB8C00"),
            700 to Color.parseColor("#F57C00"),
            800 to Color.parseColor("#EF6C00"),
            900 to Color.parseColor("#E65100")
        )

        @JvmField
        val orangeAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#FFD180"),
            200 to Color.parseColor("#FFAB40"),
            400 to Color.parseColor("#FF9100"),
            700 to Color.parseColor("#FF6D00")
        )

        @JvmField
        val deepOrange: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#FBE9E7"),
            100 to Color.parseColor("#FFCCBC"),
            200 to Color.parseColor("#FFAB91"),
            300 to Color.parseColor("#FF8A65"),
            400 to Color.parseColor("#FF7043"),
            500 to Color.parseColor("#FF5722"),
            600 to Color.parseColor("#F4511E"),
            700 to Color.parseColor("#E64A19"),
            800 to Color.parseColor("#D84315"),
            900 to Color.parseColor("#BF360C")
        )

        @JvmField
        val deepOrangeAccent: Map<Int, Int> = mapOf(
            100 to Color.parseColor("#FF9E80"),
            200 to Color.parseColor("#FF6E40"),
            400 to Color.parseColor("#FF3D00"),
            700 to Color.parseColor("#DD2C00")
        )

        @JvmField
        val brown: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#EFEBE9"),
            100 to Color.parseColor("#D7CCC8"),
            200 to Color.parseColor("#BCAAA4"),
            300 to Color.parseColor("#A1887F"),
            400 to Color.parseColor("#8D6E63"),
            500 to Color.parseColor("#795548"),
            600 to Color.parseColor("#6D4C41"),
            700 to Color.parseColor("#5D4037"),
            800 to Color.parseColor("#4E342E"),
            900 to Color.parseColor("#3E2723")
        )

        @JvmField
        val grey: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#FAFAFA"),
            100 to Color.parseColor("#F5F5F5"),
            200 to Color.parseColor("#EEEEEE"),
            300 to Color.parseColor("#E0E0E0"),
            400 to Color.parseColor("#BDBDBD"),
            500 to Color.parseColor("#9E9E9E"),
            600 to Color.parseColor("#757575"),
            700 to Color.parseColor("#616161"),
            800 to Color.parseColor("#424242"),
            900 to Color.parseColor("#212121")
        )

        @JvmField
        val blueGrey: Map<Int, Int> = mapOf(
            50 to Color.parseColor("#ECEFF1"),
            100 to Color.parseColor("#CFD8DC"),
            200 to Color.parseColor("#B0BEC5"),
            300 to Color.parseColor("#90A4AE"),
            400 to Color.parseColor("#78909C"),
            500 to Color.parseColor("#607D8B"),
            600 to Color.parseColor("#546E7A"),
            700 to Color.parseColor("#455A64"),
            800 to Color.parseColor("#37474F"),
            900 to Color.parseColor("#263238"),
            1000 to Color.parseColor("#101518")
        )

        @JvmField
        val black = Color.parseColor("#000000")

        @JvmField
        val white = Color.parseColor("#FFFFFF")

        @JvmField
        val transparent = Color.parseColor("#00000000")


        @JvmField
        val textDark = Color.parseColor("#FFFFFFFF")

        @JvmField
        val secondaryTextDark = Color.parseColor("#B3FFFFFF")

        @JvmField
        val iconDark = Color.parseColor("#B3FFFFFF")

        @JvmField
        val disabledTextDark = Color.parseColor("#4DFFFFFF")

        @JvmField
        val hintTextDark = Color.parseColor("#4DFFFFFF")

        @JvmField
        val dividerDark = Color.parseColor("#1FFFFFFF")

        @JvmField
        val textLight = Color.parseColor("#DE000000")


        @JvmField
        val secondaryTextLight = Color.parseColor("#8A000000")

        @JvmField
        val iconLight = Color.parseColor("#8A000000")

        @JvmField
        val disabledTextLight = Color.parseColor("#61000000")

        @JvmField
        val hintTextLight = Color.parseColor("#61000000")

        @JvmField
        val dividerLight = Color.parseColor("#1F000000")

        @JvmStatic
        fun withAlpha(color: Int, @FloatRange(from = 0.0, to = 1.0) alpha: Float) =
            Color.argb((alpha * 255f).roundToInt(), Color.red(color), Color.green(color), Color.blue(color))
    }
}
