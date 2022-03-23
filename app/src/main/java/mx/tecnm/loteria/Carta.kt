package mx.tecnm.loteria

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.media.MediaPlayer


class Carta(lienzo: Lienzo,imagen : Int,sonido : MediaPlayer) {
    var imagen = BitmapFactory.decodeResource(lienzo.resources,imagen)
    var sonido = sonido
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
    fun tirar(){
        if(!sonido.isPlaying){
            sonido.start()
        }
    }
    fun detener(){
        sonido.start()
    }

}