//package com.example.warmingup
//
//import android.app.*
//import android.graphics.BitmapFactory
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import com.example.warmingup.databinding.ActivityTmapWalkBinding
//import com.skt.tmap.*
//import com.skt.tmap.overlay.TMapMarkerItem
//import com.skt.tmap.overlay.TMapPolyLine
//import kotlin.concurrent.thread
//
//class TMapWalkActivity : AppCompatActivity() {
//    lateinit var tMapView: TMapView
//    lateinit var binding: ActivityTmapWalkBinding
//    lateinit var line: TMapPolyLine
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityTmapWalkBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        println("check")
//
//        tMapView = TMapView(this)
//        tMapView.setSKTMapApiKey("5WFqAMNHiH855TbYUoFeoJFCNf6K9xZ2TeYmo69c")
//        binding.PedestrianContainer.addView(tMapView)
//
//        // 출발지와 도착지 좌표 설정
//        val startPoint = TMapPoint(37.5665, 126.9780) // 서울 시청
//        val endPoint = TMapPoint(37.5512, 126.9882) // 남산타워
//
//        // TMapData 객체 생성
//        val tMapData = TMapData()
//
//        // 도보 경로 검색
//        runOnUiThread{
////            drawPathOnMap(
//                line = tMapData.findPathDataWithType(
//                    TMapData.TMapPathType.PEDESTRIAN_PATH,
//                    startPoint,
//                    endPoint,
//                    null,
//                    10
//                )
//////            object : TMapData.OnFindPathDataWithTypeListener {
//////                override fun onFindPathData(tMapPolyLine: TMapPolyLine?) {
//////                    if (tMapPolyLine != null) {
//////                        // 도보 경로를 받아와서 처리
//////                        drawPathOnMap(tMapPolyLine)
//////                    }
//////                }
//////            }
////            )
//        }
//        tMapView.addTMapPolyLine(line)
//        addContentView(tMapView, ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT))
//
//        // 지도를 화면에 표시
//        //setContentView(tMapView)
//    }
//
////    private fun drawPathOnMap(tMapPolyLine: TMapPolyLine) {
////        //println(tMapPolyLine)
////        // 도보 경로를 지도에 그리기
////        tMapView.addTMapPolyLine(tMapPolyLine)
////
////        // 출발지와 도착지에 마커 추가
////        val startMarker = TMapMarkerItem()
////        startMarker.icon = BitmapFactory.decodeResource(resources, R.drawable.pin)
////        startMarker.tMapPoint = tMapPolyLine.linePointList.get(0)
////        tMapView.addTMapMarkerItem(startMarker)
////
////        val endMarker = TMapMarkerItem()
////        endMarker.icon = BitmapFactory.decodeResource(resources, R.drawable.pin)
////        endMarker.tMapPoint = tMapPolyLine.linePointList.get(tMapPolyLine.linePointList.size - 1)
////        tMapView.addTMapMarkerItem(endMarker)
////
////        // 출발지와 도착지가 모두 표시되도록 지도 확대 및 중심 조정
////        //val bound = tMapPolyLine.boundingRect
//////        tMapView.zoomToTMapPoint(bound.topLeft, bound.bottomRight)
////
////        // 지도를 화면에 표시
////        binding.PedestrianContainer.addView(tMapView, ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT))
////    }
//}

package com.example.warmingup

import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.warmingup.databinding.ActivityTmapWalkBinding
import com.skt.tmap.TMapData
import com.skt.tmap.TMapPoint
import com.skt.tmap.TMapView
import com.skt.tmap.overlay.TMapMarkerItem
import com.skt.tmap.overlay.TMapPolyLine
import org.w3c.dom.Document
import kotlin.concurrent.thread

class TMapWalkActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTmapWalkBinding
    private lateinit var tMapData: TMapData
    private lateinit var tMapView: TMapView
    private lateinit var tMapPolyLine: TMapPolyLine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTmapWalkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tMapData = TMapData()
        tMapView = TMapView(this)
        tMapView.setSKTMapApiKey("5WFqAMNHiH855TbYUoFeoJFCNf6K9xZ2TeYmo69c")
        binding.PedestrianContainer.addView(tMapView)

        // 출발지와 도착지 좌표 설정
        val startPoint = TMapPoint(37.5665, 126.9780) // 서울 시청
        val endPoint = TMapPoint(37.5512, 126.9882) // 남산타워

        // 출발 도착 마커 생성
//        val startMarker = TMapMarkerItem()
//        startMarker.icon = BitmapFactory.decodeResource(resources, R.drawable.pin)
//        startMarker.tMapPoint = tMapPolyLine.linePointList.get(0)
//        tMapView.addTMapMarkerItem(startMarker)
//
//        val endMarker = TMapMarkerItem()
//        endMarker.icon = BitmapFactory.decodeResource(resources, R.drawable.pin)
//        endMarker.tMapPoint = tMapPolyLine.linePointList.get(tMapPolyLine.linePointList.size - 1)
//        tMapView.addTMapMarkerItem(endMarker)

        // 도보 경로 검색 1
        // ApiKey 인증 성공 시 호출되는 SKTMapApikeySucceed()를 사용하면 되지 않을까..?
//        thread {
//            tMapPolyLine = tMapData.findPathDataWithType(
//                TMapData.TMapPathType.PEDESTRIAN_PATH,
//                startPoint,
//                endPoint,
//                null,  // 여기에 listener를 설정할 수 있습니다.
//                0
//            )
//
//            runOnUiThread {
//                if(tMapPolyLine != null){
//                    drawPathOnMap(tMapPolyLine)
//                }
//
//            }
//        }
        // 2
//        tMapData.findPathDataAllType(TMapData.TMapPathType.PEDESTRIAN_PATH,
//            startPoint,
//            endPoint,
//            object : TMapData.OnFindPathDataAllTypeListener {
//                override fun onFindPathDataAll(p0: Document) {
//                    val polyLine = TMapPolyLine()
//                    val nodeList = p0.getElementsByTagName("LineString")
//
//                    for (i in 0 until nodeList.length) {
//                        val node = nodeList.item(i)
//                        val locationList = node.firstChild.nodeValue.split(" ")
//
//                        for (j in locationList.indices step 2) {
//                            val lon = locationList[j].toDouble()
//                            val lat = locationList[j + 1].toDouble()
//                            polyLine.addLinePoint(TMapPoint(lat, lon))
//                        }
//                    }
//
//                    runOnUiThread {
//                        drawPathOnMap(polyLine)
//                    }
//                }
//            })
    }

    private fun drawPathOnMap(tMapPolyLine: TMapPolyLine) {
        // 도보 경로를 지도에 그리기

       tMapView.addTMapPolyLine(tMapPolyLine)

        // 출발지와 도착지에 마커 추가
//        val startMarker = binding.tMapView.addMarkerItem("startPoint", startPoint.latitude, startPoint.longitude)
//        val endMarker = binding.tMapView.addMarkerItem("endPoint", endPoint.latitude, endPoint.longitude)
    }
}
