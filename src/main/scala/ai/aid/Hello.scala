package ai.aid 

import ai.aid.models.BangunRuang
import ai.aid.models.Mahasiswa
import ai.aid.service.MahasiswaService
import ai.aid.service.BangunRuangService
import ai.aid.service.KotakService
import ai.aid.service.SegitigaService
import ai.aid.service.LingkaranService
import ai.aid.service.Computer



object Hello {

  def main(args: Array[String]) = {
    
    // create data yang mau dihitung
    val data = BangunRuang(5, 10)

    val kotak = new KotakService()

    println(Computer.run(kotak, data))


    val lingkaran = new LingkaranService()
    println(Computer.run(lingkaran, data))

    val segitiga = new SegitigaService()
    println(Computer.run(segitiga, data))

  }
}
