
class SpaceAge {
  static double SECONDS_PER_EARTH_YEAR = 31557600
  static Map<String, Double> EARTH_YEARS_PER_PLANET_YEAR = [
          'Mercury': 0.2408467,
          'Venus': 0.61519726,
          'Earth': 1.0,
          'Mars': 1.8808158,
          'Jupiter': 11.862615,
          'Saturn': 29.447498,
          'Uranus': 84.016846,
          'Neptune': 164.79132
  ]
  static double age(String planet, int seconds) {
    Math.round(((seconds / SECONDS_PER_EARTH_YEAR) / EARTH_YEARS_PER_PLANET_YEAR[planet]) * 100) / 100
  }


  static void main(String[] args) {
    String x = 'Neptune'
    int y = 1821023456
    print age(x,y)

}


}