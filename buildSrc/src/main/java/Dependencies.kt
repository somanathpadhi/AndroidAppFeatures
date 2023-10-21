object Version{
    const val core = "1.12.0"
    const val  retrofit = "2.9.0"
    const val gson = "2.9.0"
    const val hilt = "2.44"
    const val hiltCompiler = "2.44"
    const val roomRuntime = "2.6.0"
    const val roomCompiler = "2.6.0"
    const val roomKTX = "2.6.0"
    const val roomTesting = "2.6.0"
    const val roomPaging = "2.6.0"
}

object Dependencies{
    const val core = "androidx.core:core-ktx:${Version.core}"
}
object Room{
    const val roomRuntime = "androidx.room:room-runtime:${Version.roomRuntime}"
    const val roomCompiler = "androidx.room:room-compiler:${Version.roomCompiler}"
    const val roomKTX = "androidx.room:room-ktx:${Version.roomKTX}"
    const val roomTesting = "androidx.room:room-testing:${Version.roomTesting}"
    const val roomPaging = "androidx.room:room-paging:${Version.roomPaging}"
}
object Retrofit{
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Version.gson}"
}
object Hilt {
    const val hilt = "com.google.dagger:hilt-android:${Version.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Version.hiltCompiler}"
}