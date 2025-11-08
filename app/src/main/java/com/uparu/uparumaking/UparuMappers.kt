package com.uparu.uparumaking

fun UparuInfo.toData2(): Data2 =
    Data2(
        profile = this.profile,
        name = this.name,
        gold = this.gold,
        type = this.typeDrawable,
        time = this.timeForSort
    )

fun UparuInfo.toTimeData(): TimeData =
    TimeData(
        profile = this.profile,
        name = this.name,
        egg = this.egg,
        st = "소환시간 :",
        time = this.timeDisplay
    )

fun UparuInfo.toTimeData2(): TimeData2 =
    TimeData2(
        profile = this.profile,
        name = this.name,
        egg = this.egg,
        type = this.typeText,
        time = this.timeDisplay
    )
