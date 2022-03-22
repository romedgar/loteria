package mx.tecnm.loteria

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class Lienzo (este: MainActivity) : View(este){
    var fondo = BitmapFactory.decodeResource(este.resources,R.drawable.loteria)
    var carta_arriba = 0
    var pantalla = 0
    var activo = true
    var game =0
    val mazo = ArrayList<Carta>(24)
    val este = este

    //Declaramos todas las cartas
    var carta1 = Carta(this,R.drawable.carta1)
    var carta2 = Carta(this,R.drawable.carta2)
    var carta3 = Carta(this,R.drawable.carta3)
    var carta4 = Carta(this,R.drawable.carta4)
    var carta5 = Carta(this,R.drawable.carta5)
    var carta6 = Carta(this,R.drawable.carta6)
    var carta7 = Carta(this,R.drawable.carta7)
    var carta8 = Carta(this,R.drawable.carta8)
    var carta9 = Carta(this,R.drawable.carta9)
    var carta10 = Carta(this,R.drawable.carta10)
    var carta11 = Carta(this,R.drawable.carta11)
    var carta12 = Carta(this,R.drawable.carta12)
    var carta13 = Carta(this,R.drawable.carta13)
    var carta14 = Carta(this,R.drawable.carta14)
    var carta15 = Carta(this,R.drawable.carta15)
    var carta16 = Carta(this,R.drawable.carta16)
    var carta17 = Carta(this,R.drawable.carta17)
    var carta18 = Carta(this,R.drawable.carta18)
    var carta19 = Carta(this,R.drawable.carta19)
    var carta20 = Carta(this,R.drawable.carta20)
    var carta21 = Carta(this,R.drawable.carta21)
    var carta22 = Carta(this,R.drawable.carta22)
    var carta23 = Carta(this,R.drawable.carta23)
    var carta24 = Carta(this,R.drawable.carta24)
    var carta25 = Carta(this,R.drawable.carta25)
    var carta26 = Carta(this,R.drawable.carta26)
    var carta27 = Carta(this,R.drawable.carta27)
    var carta28 = Carta(this,R.drawable.carta28)
    var carta29 = Carta(this,R.drawable.carta29)
    var carta30 = Carta(this,R.drawable.carta30)
    var carta31 = Carta(this,R.drawable.carta31)
    var carta32 = Carta(this,R.drawable.carta32)
    var carta33 = Carta(this,R.drawable.carta33)
    var carta34 = Carta(this,R.drawable.carta34)
    var carta35 = Carta(this,R.drawable.carta35)
    var carta36 = Carta(this,R.drawable.carta36)
    var carta37 = Carta(this,R.drawable.carta37)
    var carta38 = Carta(this,R.drawable.carta38)
    var carta39 = Carta(this,R.drawable.carta39)
    var carta40 = Carta(this,R.drawable.carta40)
    var carta41 = Carta(this,R.drawable.carta41)
    var carta42 = Carta(this,R.drawable.carta42)
    var carta43 = Carta(this,R.drawable.carta43)
    var carta44 = Carta(this,R.drawable.carta44)
    var carta45 = Carta(this,R.drawable.carta45)
    var carta46 = Carta(this,R.drawable.carta46)
    var carta47 = Carta(this,R.drawable.carta47)
    var carta48 = Carta(this,R.drawable.carta48)
    var carta49 = Carta(this,R.drawable.carta49)
    var carta50 = Carta(this,R.drawable.carta50)
    var carta51 = Carta(this,R.drawable.carta51)
    var carta52 = Carta(this,R.drawable.carta52)
    var carta53 = Carta(this,R.drawable.carta53)
    var carta54 = Carta(this,R.drawable.carta54)


    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        var p = Paint()
        invalidate()

        //Añadimos cartas al mazo
        mazo.add(carta1)
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
        mazo.add(carta54)



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
                    mazo.shuffle()
                    juego.start()
                }
                mazo[carta_arriba].pintar(c)
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
            }
        }

        //carta1.pintar(c)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when(event.action){
            MotionEvent.ACTION_DOWN ->{
                if (event.y>1350f && event.y<1500 && event.x>100f && event.x<1000 && game ==2){
                    game = 3
                    pantalla = 3

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
}

class Hilo(l: Lienzo) : Thread() {
    var lienzo = l

    override fun run() {
        super.run()
        lienzo.activo = false
        while (lienzo.carta_arriba<=54 && lienzo.game == 1){
                sleep(5000L)
                lienzo.carta_arriba +=1
        }
    }
}