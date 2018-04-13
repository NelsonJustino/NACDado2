package nelsonjustinodasilvasantos.com.br.nacdado

import android.media.AsyncPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class GameActivity : AppCompatActivity() {
    private var numeroAleatorio: Random? = null

    private val Dice1 = 1
    private val Dice2 = 2
    private val Dice3 = 3
    private val Dice4 = 4
    private val Dice5 = 5
    private val Dice6 = 6




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        numeroAleatorio = Random()

        private fun realizarJogada(jogadaPlayer: Int){
            val player= numeroAleatorio!!.nextInt(6)+1
            val jogadaPC= numeroAleatorio!!.nextInt(6)+1

        when(jogadaPC){
            Dice1 ->{
                ivPC!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.dice_1))
            when(jogadaPlayer){
                Dice1 -> empatou()
                Dice2 -> venceu()
                Dice3 -> venceu()
                Dice4 -> venceu()
                Dice5 -> venceu()
                Dice6 -> venceu()
            }
            }
            when(jogadaPC){
                Dice2 ->{
                    ivPC!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.dice_1))
                    when(jogadaPlayer){
                        Dice1 -> perdeu()
                        Dice2 -> empatou()
                        Dice3 -> venceu()
                        Dice4 -> venceu()
                        Dice5 -> venceu()
                        Dice6 -> venceu()
                    }
                }

                when(jogadaPC){
                    Dice3 ->{
                        ivPC!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.dice_1))
                        when(jogadaPlayer){
                            Dice1 -> perdeu()
                            Dice2 -> perdeu()
                            Dice3 -> empatou()
                            Dice4 -> venceu()
                            Dice5 -> venceu()
                            Dice6 -> venceu()
                        }
                    }
                    when(jogadaPC){
                        Dice4 ->{
                            ivPC!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.dice_1))
                            when(jogadaPlayer){
                                Dice1 -> perdeu()
                                Dice2 -> perdeu()
                                Dice3 -> perdeu()
                                Dice4 -> empatou()
                                Dice5 -> venceu()
                                Dice6 -> venceu()
                            }
                        }
                        when(jogadaPC){
                            Dice5 ->{
                                ivPC!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.dice_1))
                                when(jogadaPlayer){
                                    Dice1 -> perdeu()
                                    Dice2 -> perdeu()
                                    Dice3 -> perdeu()
                                    Dice4 -> perdeu()
                                    Dice5 -> empatou()
                                    Dice6 -> venceu()
                                }
                            }
                            when(jogadaPC){
                                Dice6 ->{
                                    ivPC!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.dice_1))
                                    when(jogadaPlayer){
                                        Dice1 -> perdeu()
                                        Dice2 -> perdeu()
                                        Dice3 -> perdeu()
                                        Dice4 -> perdeu()
                                        Dice5 -> perdeu()
                                        Dice6 -> empatou()
                                    }
                                }
        }

        }



    }
}
