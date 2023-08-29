package ai.aid.service

import ai.aid.models.Mahasiswa

class MahasiswaService {

  def insertData(data: Mahasiswa) = {
    println("insert $nim , $nama, $addres ")
  }
 
  def updateData(data: Mahasiswa): Unit = {
    println("update $data")
  }
}
