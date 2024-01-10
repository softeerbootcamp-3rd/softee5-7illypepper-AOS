package com.example.warmingup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.example.warmingup.databinding.ActivityMapBinding
import com.skt.tmap.TMapPoint
import com.skt.tmap.TMapView

class MapActivity : AppCompatActivity() {
    lateinit var binding: ActivityMapBinding
    lateinit var tMapView: TMapView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createCard()

        tMapView = TMapView(this)
        tMapView.setSKTMapApiKey("5WFqAMNHiH855TbYUoFeoJFCNf6K9xZ2TeYmo69c")
        binding.tmapViewContainer.addView(tMapView)
    }

    fun createCard() {
        val cardView = LayoutInflater.from(this).inflate(R.layout.path_card, null) // 카드 뷰 생성
        binding.tmapViewContainer.addView(cardView) // 지도가 포함된 레이아웃에 카드 뷰 추가
    }

}