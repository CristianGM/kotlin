// "Create member function 'A.foo'" "true"
// COMPILER_ARGUMENTS: -XXLanguage:-NewInference

class A<T>(val n: T)

fun test() {
    val a: A<Int> = A(1).<caret>foo(abc = 1, ghi = A(2), def = "s")
}