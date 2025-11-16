package com.uparu.uparumaking.etc

import com.uparu.uparumaking.adapter.UparuGridItem
import com.uparu.uparumaking.adapter.SummonTimeItem
import com.uparu.uparumaking.adapter.TypeTimeItem

fun UparuInfo.toUparuGridItem(): UparuGridItem =
    UparuGridItem(
        profile = this.profile,
        name = this.name,
        gold = this.gold,
        type = this.typeDrawable,
        time = this.timeForSort
    )

fun UparuInfo.toSummonTimeItem(): SummonTimeItem =
    SummonTimeItem(
        profile = this.profile,
        name = this.name,
        egg = this.egg,
        st = "소환시간 :",
        time = this.timeDisplay
    )

fun UparuInfo.toTypeTimeItem(): TypeTimeItem =
    TypeTimeItem(
        profile = this.profile,
        name = this.name,
        egg = this.egg,
        type = this.typeText,
        time = this.timeDisplay
    )
