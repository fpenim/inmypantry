package com.swarmbit.inmypantry.model

import javax.measure.Quantity

data class Recipe(
        val name: String,
        val steps: List<String> = emptyList(),
        val portions: Int = 1,
        val ingredients: MutableMap<Ingredient, Quantity<*>> = mutableMapOf(),
        val tags: MutableSet<String> = mutableSetOf(name),
        val favourite: Boolean = false
)