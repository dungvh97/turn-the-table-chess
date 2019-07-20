package vn.dn.freelancer.chess_turn_the_table

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import kotlinx.android.synthetic.main.activity_main.*
import vn.dn.freelancer.chess_turn_the_table.playChess.PositionAdapter
import vn.dn.freelancer.chess_turn_the_table.playChess.model.ChessBoard

class MainActivity : AppCompatActivity() {

    private var boardView: GridView? = null

    private var adapter: PositionAdapter? = null

    private fun initBoard() {
        val chessboard: ChessBoard = ChessBoard()
        adapter = PositionAdapter(this, chessboard)
        boardView = findViewById<GridView>(R.id.chessboard)
        boardView!!.stretchMode = GridView.STRETCH_COLUMN_WIDTH
        boardView!!.adapter = adapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initBoard()
    }

    fun initChessman() {

    }
}
