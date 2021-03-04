fun main() {
    val result = agoToText(79204)
    println(result)
}

fun agoToText(
    time: Int,
    fixMin: Int = 60,
    fixHour: Int = 3600,
    fixDay: Int = 86400,
    fixTwoDay: Int = fixDay * 2,
    fixThreeDay: Int = fixDay * 3
): String {
    if (time >= 0 && time <= fixMin) {
        return "был(а) только что"
    } else if (time > fixMin && time <= fixHour) {
        val min = time / fixMin
        return "был(а) в сети ${minutes(min)} назад"
    } else if (time > fixHour && time <= fixDay) {
        val hour = time / fixHour
        return "был(а) в сети ${hours(hour)} назад"
    } else if (time > fixDay && time <= fixTwoDay) {
        return "был(а) в сети сегодня"
    } else if (time > fixTwoDay && time <= fixThreeDay) {
        return "был(а) в сети вчера"
    } else {
        return "был(а) в сети давно"
    }
}

fun minutes(min: Int): String {
    if (min % 10 == 1 && min != 11) {
        return "$min минуту"
    } else if (min % 10 == 2 || min % 10 == 3 || min % 10 == 4
        && min != 12 && min != 13 && min != 14
    ) {
        return "$min минуты"
    } else {
        return "$min минут"
    }
}

fun hours(hour: Int): String {
    if (hour % 10 == 1 && hour != 11) {
        return "$hour час"
    } else if (hour % 10 == 2 || hour % 10 == 3 || hour % 10 == 4
        && hour != 12 && hour != 13 && hour != 14
    ) {
        return "$hour часа"
    } else {
        return "$hour часов"
    }
}