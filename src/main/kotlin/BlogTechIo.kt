import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux


/**
 * https://tech.io/playgrounds/929/reactive-programming-with-reactor-3/Intro
 */
class BlogTechIo{
    @Test
    @DisplayName("결과 값은 무엇일까??")
    fun chapter1() {
        val flux = Flux.just("A")
        flux.map { s: String -> "foo$s" }
        flux.subscribe { x: String? -> println(x) }

        Flux.just("A")
            .map { s: String -> "foo$s" }
            .subscribe { x: String? -> println(x) }
    }
}


