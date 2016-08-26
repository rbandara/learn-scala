// script to do word count
sc.textFile("song.txt").flatmap(l=>l.split(" ")).map(_ -> 1).reduceByKey(_ + _).sortBy(_._2,false).take(5)
