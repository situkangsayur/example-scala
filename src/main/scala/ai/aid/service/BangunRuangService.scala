package ai.aid.service

import ai.aid.models.BangunRuang


trait BangunRuangService {
  def hitungLuas(data: BangunRuang): Double
}


class KotakService extends BangunRuangService  {

  override def hitungLuas(data: BangunRuang): Double = data.x * data.y
}

class SegitigaService extends BangunRuangService {
  override def hitungLuas(data: BangunRuang): Double = data.x * data.y * 0.5
}

