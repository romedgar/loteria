package mx.tecnm.loteria

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint


class Carta(lienzo: Lienzo,imagen : Int) {
    var imagen = BitmapFactory.decodeResource(lienzo.resources,imagen)
    var posX = 0f
    var posY = 0f

    init {
        posX = 175f
        posY = 100f
    }

    fun pintar(c : Canvas){
        var p = Paint()
        c.drawBitmap(imagen,posX,posY,p)
    }

}