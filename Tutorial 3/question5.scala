object question5 extends App {
  def timeAtPace(pace: String, distance: Int): Int = {
    pace match {
      case "easy"  => distance * 8;
      case "tempo" => distance * 7;
      case _       => 0;
    }
  }

  def totalRunningTime(paceAndDistances: Array[Tuple2[String, Int]]): Int = {
    var runningTime: Int = 0;
    for ((pace, distance) <- paceAndDistances) {
      runningTime += timeAtPace(pace, distance);
    }
    runningTime
  }

  var paceAndDistances: Array[Tuple2[String, Int]] = Array(
    ("easy", 2),
    ("tempo", 3),
    ("easy", 2)
  );

  printf(
    "total running time : %d minutes\n",
    totalRunningTime(paceAndDistances)
  );
}
