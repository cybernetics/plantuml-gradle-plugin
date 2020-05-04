package com.github.roroche.plantuml.classes

import com.github.roroche.examples.Car
import com.github.roroche.examples.Driver
import com.github.roroche.examples.Vehicle
import com.github.roroche.plantuml.assertions.ClsContainsExactlyAssertion
import com.pragmaticobjects.oo.tests.TestCase
import com.pragmaticobjects.oo.tests.junit5.TestsSuite

/**
 * [TestsSuite] to perform checks about [ClsInPackage].
 */
class ClsInPackageTest : TestsSuite(
    TestCase(
        "classes in package contains concrete classes",
        ClsContainsExactlyAssertion(
            classes = ClsInPackage(
                packageName = "com.github.roroche.examples"
            ),
            expectedClasses = listOf(
                Car::class.java,
                Driver::class.java,
                Vehicle::class.java
            )
        )
    )
)