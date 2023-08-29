package ai.aid.service

import ai.aid.models.BangunRuang

class LingkaranService extends BangunRuangService{

  override def hitungLuas(data: BangunRuang): Double = data.x * data.y * 22/7

}
