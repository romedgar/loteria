package mx.tecnm.loteria

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class Lienzo (este: MainActivity) : View(este){
    var fondo = BitmapFactory.decodeResource(este.resources,R.drawable.loteria)
    var carta_arriba = 0
    var pantalla = 0
    var activo = true
    var game =0
    val este = este
    var sonido = MediaPlayer.create(este,R.raw.carta)
    var rev = true

    //Declaramos todas las cartas
    var carta1 = Carta(this,R.drawable.carta1,MediaPlayer.create(este,R.raw.gallo))
    var carta2 = Carta(this,R.drawable.carta2,MediaPlayer.create(este,R.raw.diablito))
    var carta3 = Carta(this,R.drawable.carta3,MediaPlayer.create(este,R.raw.dama))
    var carta4 = Carta(this,R.drawable.carta4,MediaPlayer.create(este,R.raw.catrin))
    var carta5 = Carta(this,R.drawable.carta5,MediaPlayer.create(este,R.raw.paraguas))
    var carta6 = Carta(this,R.drawable.carta6,MediaPlayer.create(este,R.raw.sirena))
    var carta7 = Carta(this,R.drawable.carta7,MediaPlayer.create(este,R.raw.escalera))
    var carta8 = Carta(this,R.drawable.carta8,MediaPlayer.create(este,R.raw.botella))
    var carta9 = Carta(this,R.drawable.carta9,MediaPlayer.create(este,R.raw.barril))
    var carta10 = Carta(this,R.drawable.carta10,MediaPlayer.create(este,R.raw.arbol))
    var carta11 = Carta(this,R.drawable.carta11,MediaPlayer.create(este,R.raw.melon))
    var carta12 = Carta(this,R.drawable.carta12,MediaPlayer.create(este,R.raw.valiente))
    var carta13 = Carta(this,R.drawable.carta13,MediaPlayer.create(este,R.raw.gorrito))
    var carta14 = Carta(this,R.drawable.carta14,MediaPlayer.create(este,R.raw.muerte))
    var carta15 = Carta(this,R.drawable.carta15,MediaPlayer.create(este,R.raw.pera))
    var carta16 = Carta(this,R.drawable.carta16,MediaPlayer.create(este,R.raw.bandera))
    var carta17 = Carta(this,R.drawable.carta17,MediaPlayer.create(este,R.raw.bandolon))
    var carta18 = Carta(this,R.drawable.carta18,MediaPlayer.create(este,R.raw.violoncello))
    var carta19 = Carta(this,R.drawable.carta19,MediaPlayer.create(este,R.raw.garza))
    var carta20 = Carta(this,R.drawable.carta20,MediaPlayer.create(este,R.raw.pajaro))
    var carta21 = Carta(this,R.drawable.carta21,MediaPlayer.create(este,R.raw.mano))
    var carta22 = Carta(this,R.drawable.carta22,MediaPlayer.create(este,R.raw.bota))
    var carta23 = Carta(this,R.drawable.carta23,MediaPlayer.create(este,R.raw.luna))
    var carta24 = Carta(this,R.drawable.carta24,MediaPlayer.create(este,R.raw.cotorro))
    var carta25 = Carta(this,R.drawable.carta25,MediaPlayer.create(este,R.raw.borracho))
    var carta26 = Carta(this,R.drawable.carta26,MediaPlayer.create(este,R.raw.negrito))
    var carta27 = Carta(this,R.drawable.carta27,MediaPlayer.create(este,R.raw.corazon))
    var carta28 = Carta(this,R.drawable.carta28,MediaPlayer.create(este,R.raw.sandia))
    var carta29 = Carta(this,R.drawable.carta29,MediaPlayer.create(este,R.raw.tambor))
    var carta30 = Carta(this,R.drawable.carta30,MediaPlayer.create(este,R.raw.camaron))
    var carta31 = Carta(this,R.drawable.carta31,MediaPlayer.create(este,R.raw.jaras))
    var carta32 = Carta(this,R.drawable.carta32,MediaPlayer.create(este,R.raw.musico))
    var carta33 = Carta(this,R.drawable.carta33,MediaPlayer.create(este,R.raw.arana))
    var carta34 = Carta(this,R.drawable.carta34,MediaPlayer.create(este,R.raw.soldado))
    var carta35 = Carta(this,R.drawable.carta35,MediaPlayer.create(este,R.raw.estrella))
    var carta36 = Carta(this,R.drawable.carta36,MediaPlayer.create(este,R.raw.cazo))
    var carta37 = Carta(this,R.drawable.carta37,MediaPlayer.create(este,R.raw.mundo))
    var carta38 = Carta(this,R.drawable.carta38,MediaPlayer.create(este,R.raw.apache))
    var carta39 = Carta(this,R.drawable.carta39,MediaPlayer.create(este,R.raw.nopal))
    var carta40 = Carta(this,R.drawable.carta40,MediaPlayer.create(este,R.raw.alacran))
    var carta41 = Carta(this,R.drawable.carta41,MediaPlayer.create(este,R.raw.rosa))
    var carta42 = Carta(this,R.drawable.carta42,MediaPlayer.create(este,R.raw.calavera))
    var carta43 = Carta(this,R.drawable.carta43,MediaPlayer.create(este,R.raw.campana))
    var carta44 = Carta(this,R.drawable.carta44,MediaPlayer.create(este,R.raw.cantarito))
    var carta45 = Carta(this,R.drawable.carta45,MediaPlayer.create(este,R.raw.venado))
    var carta46 = Carta(this,R.drawable.carta46,MediaPlayer.create(este,R.raw.sol))
    var carta47 = Carta(this,R.drawable.carta47,MediaPlayer.create(este,R.raw.corona))
    var carta48 = Carta(this,R.drawable.carta48,MediaPlayer.create(este,R.raw.chalupa))
    var carta49 = Carta(this,R.drawable.carta49,MediaPlayer.create(este,R.raw.pino))
    var carta50 = Carta(this,R.drawable.carta50,MediaPlayer.create(este,R.raw.pescado))
    var carta51 = Carta(this,R.drawable.carta51,MediaPlayer.create(este,R.raw.palmera))
    var carta52 = Carta(this,R.drawable.carta52,MediaPlayer.create(este,R.raw.maceta))
    var carta53 = Carta(this,R.drawable.carta53,MediaPlayer.create(este,R.raw.arapa))
    var carta54 = Carta(this,R.drawable.carta54,MediaPlayer.create(este,R.raw.rana))

    val mazo = arrayOf(carta1,carta2,carta3,carta4,carta5,carta6,carta7,carta8,carta9,carta10,carta11,carta12,carta13,carta14,carta15,carta16,carta17,carta18,carta19,carta20,carta21,carta22,carta23,carta24,carta25,carta26,carta27,carta28,carta29,carta30,carta31,carta32,carta33,carta34,carta35,carta36,carta37,carta38,carta39,carta40,carta41,carta42,carta43,carta44,carta45,carta46,carta47,carta48,carta49,carta50,carta51,carta52,carta53,carta54)


    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        var p = Paint()
        invalidate()

        //Añadimos cartas al mazo
       /* mazo.add(carta1)
        mazo.add(carta2)
        mazo.add(carta3)
        mazo.add(carta4)
        mazo.add(carta5)
        mazo.add(carta6)
        mazo.add(carta7)
        mazo.add(carta8)
        mazo.add(carta9)
        mazo.add(carta10)
        mazo.add(carta11)
        mazo.add(carta12)
        mazo.add(carta13)
        mazo.add(carta14)
        mazo.add(carta15)
        mazo.add(carta16)
        mazo.add(carta17)
        mazo.add(carta18)
        mazo.add(carta19)
        mazo.add(carta20)
        mazo.add(carta21)
        mazo.add(carta22)
        mazo.add(carta23)
        mazo.add(carta24)
        mazo.add(carta25)
        mazo.add(carta26)
        mazo.add(carta27)
        mazo.add(carta28)
        mazo.add(carta29)
        mazo.add(carta30)
        mazo.add(carta31)
        mazo.add(carta32)
        mazo.add(carta33)
        mazo.add(carta34)
        mazo.add(carta35)
        mazo.add(carta36)
        mazo.add(carta37)
        mazo.add(carta38)
        mazo.add(carta39)
        mazo.add(carta40)
        mazo.add(carta41)
        mazo.add(carta42)
        mazo.add(carta43)
        mazo.add(carta44)
        mazo.add(carta45)
        mazo.add(carta46)
        mazo.add(carta47)
        mazo.add(carta48)
        mazo.add(carta49)
        mazo.add(carta50)
        mazo.add(carta51)
        mazo.add(carta52)
        mazo.add(carta53)
        mazo.add(carta54)*/




        sonido?.setOnPreparedListener {
            println("Ready to go!")
        }



        when (pantalla){
            0 -> { //Pantalla Inicial
                //Detalles de fondo
                c.drawBitmap(fondo,0f,0f,p)

                p.color = Color.rgb(250, 130, 234)
                c.drawRect(100f,1350f,1000f,1500f,p)
                p.color = Color.BLACK
                p.textSize = 100F
                c.drawText("JUGAR LOTERIA",200f,1450f,p)
                invalidate()
            }
            1 -> { //Pantalla de Juego
                //carta1.pintar(c)
                var juego = Hilo(this)
                if (activo){
                    activo = false
                    mazo.shuffle()
                    juego.start()

                }
                mazo[carta_arriba].pintar(c)
                //sonido = mazo[carta_arriba].sonido

                p.color = Color.rgb(250, 130, 234)
                c.drawRect(100f,1350f,1000f,1500f,p)
                p.color = Color.BLACK
                p.textSize = 100F
                c.drawText("BUENAS!!!!",300f,1450f,p)
                invalidate()


               // if(carta_arriba==54) carta_arriba = 0
            }
            2 -> { //Pantalla Ganador
                //Detalles de fondo
                c.drawBitmap(fondo,0f,0f,p)
                c.drawBitmap(BitmapFactory.decodeResource(este.resources,R.drawable.winner),150f,500f,p)
                p.color = Color.rgb(250, 130, 234)
                c.drawRect(100f,1350f,1000f,1500f,p)
                c.drawRect(100f,200f,1000f,350f,p)
                p.color = Color.BLACK
                p.textSize = 100F
                c.drawText("Verificar Carta",200f,1450f,p)
                c.drawText("Felicidades!!",300f,300f,p)
                invalidate()

                /*if(!mazo[carta_arriba].sonido.isPlaying && state == true){
                    mazo[carta_arriba].sonido.start()
                    state = false
                }*/
            }
            3 -> {//Pantalla Revisión Cartas

                mazo[carta_arriba].pintar(c)
                //sonido = mazo[carta_arriba].sonido

                p.color = Color.rgb(250, 130, 234)
                c.drawRect(100f,1350f,1000f,1500f,p)
                p.color = Color.BLACK
                p.textSize = 100F
                c.drawText("TERMINAR JUEGO",100f,1450f,p)
                invalidate()
            }

            4 -> {//Pantalla Gracias por Jugar
                c.drawBitmap(fondo,0f,0f,p)
                p.color = Color.rgb(250, 130, 234)
                c.drawRect(100f,1350f,1000f,1500f,p)
                p.color = Color.BLACK
                p.textSize = 100F
                c.drawText("GRACIAS!!",300f,1450f,p)
                invalidate()
                }
        }

        //carta1.pintar(c)
    }



    override fun onTouchEvent(event: MotionEvent): Boolean {
        when(event.action){
            MotionEvent.ACTION_DOWN ->{
                if (event.y>1350f && event.y<1500 && event.x>100f && event.x<1000 && game ==3){
                    game = 4
                    pantalla = 4

                }
                if (event.y>1350f && event.y<1500 && event.x>100f && event.x<1000 && game ==2){
                    game = 3
                    pantalla = 3
                    corrutina()

                }
                if (event.y>1350f && event.y<1500 && event.x>100f && event.x<1000 && game ==1){
                    game = 2
                    pantalla = 2

                }
                if (event.y>1350f && event.y<1500 && event.x>100f && event.x<1000 && game ==0){
                    game = 1
                    pantalla = 1
                }
            }

        }
        super.onTouchEvent(event)
        invalidate()
        return true
    }

    fun corrutina() = GlobalScope.launch {
        while(carta_arriba < 53 && game == 3){

             mazo[carta_arriba].sonido.start()
             delay(3000L)


             mazo[carta_arriba].sonido.release()
                 carta_arriba +=1
         }
        mazo[carta_arriba].sonido.start()
        delay(3000L)
        mazo[carta_arriba].sonido.release()
    }
}

class Hilo(l: Lienzo) : Thread() {
    var lienzo = l

    override fun run() {
        super.run()
        //lienzo.activo = false
        while (lienzo.carta_arriba<=53 && lienzo.game == 1){
            lienzo.mazo[lienzo.carta_arriba].sonido.start()
            /*if(lienzo.carta_arriba>3){
            lienzo.mazo[lienzo.carta_arriba-1].sonido.release()
            }*/
            //lienzo.sonido?.reset()
            //lienzo.sonido = lienzo.mazo[lienzo.carta_arriba].sonido
            //lienzo.sonido?.start()

            sleep(3000L)
            lienzo.mazo[lienzo.carta_arriba].sonido.release()
            //lienzo.mazo[lienzo.carta_arriba].sonido.release()
            if (lienzo.carta_arriba<53){
            lienzo.carta_arriba +=1
                }
        }

    }
}