import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


/**
 * https://tech.io/playgrounds/929/reactive-programming-with-reactor-3/Intro
 */
class BlogTechIo{
    @Test
    fun chapter1() {
        val flux = Flux.just("A")
        flux.map { s: String -> "foo$s" }
        flux.subscribe { x: String? -> println(x) }

        Flux.just("A")
            .map { s: String -> "foo$s" }
            .subscribe { x: String? -> println(x) }

        Mono.just("A")
            .map { s: String -> "foo$s" }
            .subscribe { x: String? -> println(x) }

        Flux.just("A","B", "C")
            .map { s: String -> "foo$s" }
            .subscribe { x: String? -> println(x) }

        /*
        error
        Mono.just("A", "B", "C")
            .map { s: String -> "foo$s" }
            .subscribe { x: String? -> println(x) }
         */
    }
}


