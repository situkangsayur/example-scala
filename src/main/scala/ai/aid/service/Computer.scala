package ai.aid.service

import ai.aid.models.BangunRuang

object Computer {

  def run(kalkulator: BangunRuangService, data : BangunRuang): Double = kalkulator.hitungLuas(data)
  
}
