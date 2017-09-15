@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("SequencesKt")

package kotlin.sequences

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.comparisons.*

/**
 * Returns `true` if [element] is found in the sequence.
 *
 * The operation is _terminal_.
 */
public expect operator fun <@kotlin.internal.OnlyInputTypes T> Sequence<T>.contains(element: T): Boolean

/**
 * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this sequence.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.elementAt(index: Int): T

/**
 * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this sequence.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.elementAtOrElse(index: Int, defaultValue: (Int) -> T): T

/**
 * Returns an element at the given [index] or `null` if the [index] is out of bounds of this sequence.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.elementAtOrNull(index: Int): T?

/**
 * Returns the first element matching the given [predicate], or `null` if no such element was found.
 *
 * The operation is _terminal_.
 */
@kotlin.internal.InlineOnly
public expect inline fun <T> Sequence<T>.find(predicate: (T) -> Boolean): T?

/**
 * Returns the last element matching the given [predicate], or `null` if no such element was found.
 *
 * The operation is _terminal_.
 */
@kotlin.internal.InlineOnly
public expect inline fun <T> Sequence<T>.findLast(predicate: (T) -> Boolean): T?

/**
 * Returns first element.
 * @throws [NoSuchElementException] if the sequence is empty.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.first(): T

/**
 * Returns the first element matching the given [predicate].
 * @throws [NoSuchElementException] if no such element is found.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.first(predicate: (T) -> Boolean): T

/**
 * Returns the first element, or `null` if the sequence is empty.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.firstOrNull(): T?

/**
 * Returns the first element matching the given [predicate], or `null` if element was not found.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.firstOrNull(predicate: (T) -> Boolean): T?

/**
 * Returns first index of [element], or -1 if the sequence does not contain element.
 *
 * The operation is _terminal_.
 */
public expect fun <@kotlin.internal.OnlyInputTypes T> Sequence<T>.indexOf(element: T): Int

/**
 * Returns index of the first element matching the given [predicate], or -1 if the sequence does not contain such element.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.indexOfFirst(predicate: (T) -> Boolean): Int

/**
 * Returns index of the last element matching the given [predicate], or -1 if the sequence does not contain such element.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.indexOfLast(predicate: (T) -> Boolean): Int

/**
 * Returns the last element.
 * @throws [NoSuchElementException] if the sequence is empty.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.last(): T

/**
 * Returns the last element matching the given [predicate].
 * @throws [NoSuchElementException] if no such element is found.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.last(predicate: (T) -> Boolean): T

/**
 * Returns last index of [element], or -1 if the sequence does not contain element.
 *
 * The operation is _terminal_.
 */
public expect fun <@kotlin.internal.OnlyInputTypes T> Sequence<T>.lastIndexOf(element: T): Int

/**
 * Returns the last element, or `null` if the sequence is empty.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.lastOrNull(): T?

/**
 * Returns the last element matching the given [predicate], or `null` if no such element was found.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.lastOrNull(predicate: (T) -> Boolean): T?

/**
 * Returns the single element, or throws an exception if the sequence is empty or has more than one element.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.single(): T

/**
 * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.single(predicate: (T) -> Boolean): T

/**
 * Returns single element, or `null` if the sequence is empty or has more than one element.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.singleOrNull(): T?

/**
 * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.singleOrNull(predicate: (T) -> Boolean): T?

/**
 * Returns a sequence containing all elements except first [n] elements.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T> Sequence<T>.drop(n: Int): Sequence<T>

/**
 * Returns a sequence containing all elements except first elements that satisfy the given [predicate].
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T> Sequence<T>.dropWhile(predicate: (T) -> Boolean): Sequence<T>

/**
 * Returns a sequence containing only elements matching the given [predicate].
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T> Sequence<T>.filter(predicate: (T) -> Boolean): Sequence<T>

/**
 * Returns a sequence containing only elements matching the given [predicate].
 * @param [predicate] function that takes the index of an element and the element itself
 * and returns the result of predicate evaluation on the element.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T> Sequence<T>.filterIndexed(predicate: (index: Int, T) -> Boolean): Sequence<T>

/**
 * Appends all elements matching the given [predicate] to the given [destination].
 * @param [predicate] function that takes the index of an element and the element itself
 * and returns the result of predicate evaluation on the element.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, C : MutableCollection<in T>> Sequence<T>.filterIndexedTo(destination: C, predicate: (index: Int, T) -> Boolean): C

/**
 * Returns a sequence containing all elements that are instances of specified type parameter R.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<@kotlin.internal.NoInfer R>

/**
 * Appends all elements that are instances of specified type parameter R to the given [destination].
 *
 * The operation is _terminal_.
 */
public expect inline fun <reified R, C : MutableCollection<in R>> Sequence<*>.filterIsInstanceTo(destination: C): C

/**
 * Returns a sequence containing all elements not matching the given [predicate].
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T> Sequence<T>.filterNot(predicate: (T) -> Boolean): Sequence<T>

/**
 * Returns a sequence containing all elements that are not `null`.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T : Any> Sequence<T?>.filterNotNull(): Sequence<T>

/**
 * Appends all elements that are not `null` to the given [destination].
 *
 * The operation is _terminal_.
 */
public expect fun <C : MutableCollection<in T>, T : Any> Sequence<T?>.filterNotNullTo(destination: C): C

/**
 * Appends all elements not matching the given [predicate] to the given [destination].
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, C : MutableCollection<in T>> Sequence<T>.filterNotTo(destination: C, predicate: (T) -> Boolean): C

/**
 * Appends all elements matching the given [predicate] to the given [destination].
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, C : MutableCollection<in T>> Sequence<T>.filterTo(destination: C, predicate: (T) -> Boolean): C

/**
 * Returns a sequence containing first [n] elements.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T> Sequence<T>.take(n: Int): Sequence<T>

/**
 * Returns a sequence containing first elements satisfying the given [predicate].
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T> Sequence<T>.takeWhile(predicate: (T) -> Boolean): Sequence<T>

/**
 * Returns a sequence that yields elements of this sequence sorted according to their natural sort order.
 *
 * The operation is _intermediate_ and _stateful_.
 */
public expect fun <T : Comparable<T>> Sequence<T>.sorted(): Sequence<T>

/**
 * Returns a sequence that yields elements of this sequence sorted according to natural sort order of the value returned by specified [selector] function.
 *
 * The operation is _intermediate_ and _stateful_.
 */
public expect inline fun <T, R : Comparable<R>> Sequence<T>.sortedBy(crossinline selector: (T) -> R?): Sequence<T>

/**
 * Returns a sequence that yields elements of this sequence sorted descending according to natural sort order of the value returned by specified [selector] function.
 *
 * The operation is _intermediate_ and _stateful_.
 */
public expect inline fun <T, R : Comparable<R>> Sequence<T>.sortedByDescending(crossinline selector: (T) -> R?): Sequence<T>

/**
 * Returns a sequence that yields elements of this sequence sorted descending according to their natural sort order.
 *
 * The operation is _intermediate_ and _stateful_.
 */
public expect fun <T : Comparable<T>> Sequence<T>.sortedDescending(): Sequence<T>

/**
 * Returns a sequence that yields elements of this sequence sorted according to the specified [comparator].
 *
 * The operation is _intermediate_ and _stateful_.
 */
public expect fun <T> Sequence<T>.sortedWith(comparator: Comparator<in T>): Sequence<T>

/**
 * Returns a [Map] containing key-value pairs provided by [transform] function
 * applied to elements of the given sequence.
 * 
 * If any of two pairs would have the same key the last one gets added to the map.
 * 
 * The returned map preserves the entry iteration order of the original sequence.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, K, V> Sequence<T>.associate(transform: (T) -> Pair<K, V>): Map<K, V>

/**
 * Returns a [Map] containing the elements from the given sequence indexed by the key
 * returned from [keySelector] function applied to each element.
 * 
 * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
 * 
 * The returned map preserves the entry iteration order of the original sequence.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, K> Sequence<T>.associateBy(keySelector: (T) -> K): Map<K, T>

/**
 * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given sequence.
 * 
 * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
 * 
 * The returned map preserves the entry iteration order of the original sequence.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, K, V> Sequence<T>.associateBy(keySelector: (T) -> K, valueTransform: (T) -> V): Map<K, V>

/**
 * Populates and returns the [destination] mutable map with key-value pairs,
 * where key is provided by the [keySelector] function applied to each element of the given sequence
 * and value is the element itself.
 * 
 * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, K, M : MutableMap<in K, in T>> Sequence<T>.associateByTo(destination: M, keySelector: (T) -> K): M

/**
 * Populates and returns the [destination] mutable map with key-value pairs,
 * where key is provided by the [keySelector] function and
 * and value is provided by the [valueTransform] function applied to elements of the given sequence.
 * 
 * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, K, V, M : MutableMap<in K, in V>> Sequence<T>.associateByTo(destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M

/**
 * Populates and returns the [destination] mutable map with key-value pairs
 * provided by [transform] function applied to each element of the given sequence.
 * 
 * If any of two pairs would have the same key the last one gets added to the map.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, K, V, M : MutableMap<in K, in V>> Sequence<T>.associateTo(destination: M, transform: (T) -> Pair<K, V>): M

/**
 * Appends all elements to the given [destination] collection.
 *
 * The operation is _terminal_.
 */
public expect fun <T, C : MutableCollection<in T>> Sequence<T>.toCollection(destination: C): C

/**
 * Returns a [HashSet] of all elements.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.toHashSet(): HashSet<T>

/**
 * Returns a [List] containing all elements.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.toList(): List<T>

/**
 * Returns a [MutableList] filled with all elements of this sequence.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.toMutableList(): MutableList<T>

/**
 * Returns a [Set] of all elements.
 * 
 * The returned set preserves the element iteration order of the original sequence.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.toSet(): Set<T>

/**
 * Returns a single sequence of all elements from results of [transform] function being invoked on each element of original sequence.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T, R> Sequence<T>.flatMap(transform: (T) -> Sequence<R>): Sequence<R>

/**
 * Appends all elements yielded from results of [transform] function being invoked on each element of original sequence, to the given [destination].
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, R, C : MutableCollection<in R>> Sequence<T>.flatMapTo(destination: C, transform: (T) -> Sequence<R>): C

/**
 * Groups elements of the original sequence by the key returned by the given [keySelector] function
 * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
 * 
 * The returned map preserves the entry iteration order of the keys produced from the original sequence.
 * 
 * @sample samples.collections.Collections.Transformations.groupBy
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, K> Sequence<T>.groupBy(keySelector: (T) -> K): Map<K, List<T>>

/**
 * Groups values returned by the [valueTransform] function applied to each element of the original sequence
 * by the key returned by the given [keySelector] function applied to the element
 * and returns a map where each group key is associated with a list of corresponding values.
 * 
 * The returned map preserves the entry iteration order of the keys produced from the original sequence.
 * 
 * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, K, V> Sequence<T>.groupBy(keySelector: (T) -> K, valueTransform: (T) -> V): Map<K, List<V>>

/**
 * Groups elements of the original sequence by the key returned by the given [keySelector] function
 * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
 * 
 * @return The [destination] map.
 * 
 * @sample samples.collections.Collections.Transformations.groupBy
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, K, M : MutableMap<in K, MutableList<T>>> Sequence<T>.groupByTo(destination: M, keySelector: (T) -> K): M

/**
 * Groups values returned by the [valueTransform] function applied to each element of the original sequence
 * by the key returned by the given [keySelector] function applied to the element
 * and puts to the [destination] map each group key associated with a list of corresponding values.
 * 
 * @return The [destination] map.
 * 
 * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, K, V, M : MutableMap<in K, MutableList<V>>> Sequence<T>.groupByTo(destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M

/**
 * Creates a [Grouping] source from a sequence to be used later with one of group-and-fold operations
 * using the specified [keySelector] function to extract a key from each element.
 * 
 * @sample samples.collections.Collections.Transformations.groupingByEachCount
 *
 * The operation is _intermediate_ and _stateless_.
 */
@SinceKotlin("1.1")
public expect inline fun <T, K> Sequence<T>.groupingBy(crossinline keySelector: (T) -> K): Grouping<T, K>

/**
 * Returns a sequence containing the results of applying the given [transform] function
 * to each element in the original sequence.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T, R> Sequence<T>.map(transform: (T) -> R): Sequence<R>

/**
 * Returns a sequence containing the results of applying the given [transform] function
 * to each element and its index in the original sequence.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T, R> Sequence<T>.mapIndexed(transform: (index: Int, T) -> R): Sequence<R>

/**
 * Returns a sequence containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original sequence.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T, R : Any> Sequence<T>.mapIndexedNotNull(transform: (index: Int, T) -> R?): Sequence<R>

/**
 * Applies the given [transform] function to each element and its index in the original sequence
 * and appends only the non-null results to the given [destination].
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, R : Any, C : MutableCollection<in R>> Sequence<T>.mapIndexedNotNullTo(destination: C, transform: (index: Int, T) -> R?): C

/**
 * Applies the given [transform] function to each element and its index in the original sequence
 * and appends the results to the given [destination].
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, R, C : MutableCollection<in R>> Sequence<T>.mapIndexedTo(destination: C, transform: (index: Int, T) -> R): C

/**
 * Returns a sequence containing only the non-null results of applying the given [transform] function
 * to each element in the original sequence.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T, R : Any> Sequence<T>.mapNotNull(transform: (T) -> R?): Sequence<R>

/**
 * Applies the given [transform] function to each element in the original sequence
 * and appends only the non-null results to the given [destination].
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, R : Any, C : MutableCollection<in R>> Sequence<T>.mapNotNullTo(destination: C, transform: (T) -> R?): C

/**
 * Applies the given [transform] function to each element of the original sequence
 * and appends the results to the given [destination].
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, R, C : MutableCollection<in R>> Sequence<T>.mapTo(destination: C, transform: (T) -> R): C

/**
 * Returns a sequence of [IndexedValue] for each element of the original sequence.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T> Sequence<T>.withIndex(): Sequence<IndexedValue<T>>

/**
 * Returns a sequence containing only distinct elements from the given sequence.
 * 
 * The elements in the resulting sequence are in the same order as they were in the source sequence.
 *
 * The operation is _intermediate_ and _stateful_.
 */
public expect fun <T> Sequence<T>.distinct(): Sequence<T>

/**
 * Returns a sequence containing only elements from the given sequence
 * having distinct keys returned by the given [selector] function.
 * 
 * The elements in the resulting sequence are in the same order as they were in the source sequence.
 *
 * The operation is _intermediate_ and _stateful_.
 */
public expect fun <T, K> Sequence<T>.distinctBy(selector: (T) -> K): Sequence<T>

/**
 * Returns a mutable set containing all distinct elements from the given sequence.
 * 
 * The returned set preserves the element iteration order of the original sequence.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.toMutableSet(): MutableSet<T>

/**
 * Returns `true` if all elements match the given [predicate].
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.all(predicate: (T) -> Boolean): Boolean

/**
 * Returns `true` if sequence has at least one element.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.any(): Boolean

/**
 * Returns `true` if at least one element matches the given [predicate].
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.any(predicate: (T) -> Boolean): Boolean

/**
 * Returns the number of elements in this sequence.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.count(): Int

/**
 * Returns the number of elements matching the given [predicate].
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.count(predicate: (T) -> Boolean): Int

/**
 * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, R> Sequence<T>.fold(initial: R, operation: (acc: R, T) -> R): R

/**
 * Accumulates value starting with [initial] value and applying [operation] from left to right
 * to current accumulator value and each element with its index in the original sequence.
 * @param [operation] function that takes the index of an element, current accumulator value
 * and the element itself, and calculates the next accumulator value.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, R> Sequence<T>.foldIndexed(initial: R, operation: (index: Int, acc: R, T) -> R): R

/**
 * Performs the given [action] on each element.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.forEach(action: (T) -> Unit): Unit

/**
 * Performs the given [action] on each element, providing sequential index with the element.
 * @param [action] function that takes the index of an element and the element itself
 * and performs the desired action on the element.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.forEachIndexed(action: (index: Int, T) -> Unit): Unit

/**
 * Returns the largest element or `null` if there are no elements.
 * 
 * If any of elements is `NaN` returns `NaN`.
 *
 * The operation is _terminal_.
 */
@SinceKotlin("1.1")
public expect fun Sequence<Double>.max(): Double?

/**
 * Returns the largest element or `null` if there are no elements.
 * 
 * If any of elements is `NaN` returns `NaN`.
 *
 * The operation is _terminal_.
 */
@SinceKotlin("1.1")
public expect fun Sequence<Float>.max(): Float?

/**
 * Returns the largest element or `null` if there are no elements.
 *
 * The operation is _terminal_.
 */
public expect fun <T : Comparable<T>> Sequence<T>.max(): T?

/**
 * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, R : Comparable<R>> Sequence<T>.maxBy(selector: (T) -> R): T?

/**
 * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.maxWith(comparator: Comparator<in T>): T?

/**
 * Returns the smallest element or `null` if there are no elements.
 * 
 * If any of elements is `NaN` returns `NaN`.
 *
 * The operation is _terminal_.
 */
@SinceKotlin("1.1")
public expect fun Sequence<Double>.min(): Double?

/**
 * Returns the smallest element or `null` if there are no elements.
 * 
 * If any of elements is `NaN` returns `NaN`.
 *
 * The operation is _terminal_.
 */
@SinceKotlin("1.1")
public expect fun Sequence<Float>.min(): Float?

/**
 * Returns the smallest element or `null` if there are no elements.
 *
 * The operation is _terminal_.
 */
public expect fun <T : Comparable<T>> Sequence<T>.min(): T?

/**
 * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T, R : Comparable<R>> Sequence<T>.minBy(selector: (T) -> R): T?

/**
 * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.minWith(comparator: Comparator<in T>): T?

/**
 * Returns `true` if the sequence has no elements.
 *
 * The operation is _terminal_.
 */
public expect fun <T> Sequence<T>.none(): Boolean

/**
 * Returns `true` if no elements match the given [predicate].
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.none(predicate: (T) -> Boolean): Boolean

/**
 * Returns a sequence which performs the given [action] on each element of the original sequence as they pass though it.
 *
 * The operation is _intermediate_ and _stateless_.
 */
@SinceKotlin("1.1")
public expect fun <T> Sequence<T>.onEach(action: (T) -> Unit): Sequence<T>

/**
 * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
 *
 * The operation is _terminal_.
 */
public expect inline fun <S, T: S> Sequence<T>.reduce(operation: (acc: S, T) -> S): S

/**
 * Accumulates value starting with the first element and applying [operation] from left to right
 * to current accumulator value and each element with its index in the original sequence.
 * @param [operation] function that takes the index of an element, current accumulator value
 * and the element itself and calculates the next accumulator value.
 *
 * The operation is _terminal_.
 */
public expect inline fun <S, T: S> Sequence<T>.reduceIndexed(operation: (index: Int, acc: S, T) -> S): S

/**
 * Returns the sum of all values produced by [selector] function applied to each element in the sequence.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.sumBy(selector: (T) -> Int): Int

/**
 * Returns the sum of all values produced by [selector] function applied to each element in the sequence.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.sumByDouble(selector: (T) -> Double): Double

/**
 * Returns an original collection containing all the non-`null` elements, throwing an [IllegalArgumentException] if there are any `null` elements.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T : Any> Sequence<T?>.requireNoNulls(): Sequence<T>

/**
 * Returns a sequence containing all elements of the original sequence without the first occurrence of the given [element].
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect operator fun <T> Sequence<T>.minus(element: T): Sequence<T>

/**
 * Returns a sequence containing all elements of original sequence except the elements contained in the given [elements] array.
 * 
 * Note that the source sequence and the array being subtracted are iterated only when an `iterator` is requested from
 * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
 *
 * The operation is _intermediate_ and _stateful_.
 */
public expect operator fun <T> Sequence<T>.minus(elements: Array<out T>): Sequence<T>

/**
 * Returns a sequence containing all elements of original sequence except the elements contained in the given [elements] collection.
 * 
 * Note that the source sequence and the collection being subtracted are iterated only when an `iterator` is requested from
 * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
 *
 * The operation is _intermediate_ and _stateful_.
 */
public expect operator fun <T> Sequence<T>.minus(elements: Iterable<T>): Sequence<T>

/**
 * Returns a sequence containing all elements of original sequence except the elements contained in the given [elements] sequence.
 * 
 * Note that the source sequence and the sequence being subtracted are iterated only when an `iterator` is requested from
 * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
 * 
 * The operation is _intermediate_ for this sequence and _terminal_ and _stateful_ for the [elements] sequence.
 */
public expect operator fun <T> Sequence<T>.minus(elements: Sequence<T>): Sequence<T>

/**
 * Returns a sequence containing all elements of the original sequence without the first occurrence of the given [element].
 *
 * The operation is _intermediate_ and _stateless_.
 */
@kotlin.internal.InlineOnly
public expect inline fun <T> Sequence<T>.minusElement(element: T): Sequence<T>

/**
 * Splits the original sequence into pair of lists,
 * where *first* list contains elements for which [predicate] yielded `true`,
 * while *second* list contains elements for which [predicate] yielded `false`.
 *
 * The operation is _terminal_.
 */
public expect inline fun <T> Sequence<T>.partition(predicate: (T) -> Boolean): Pair<List<T>, List<T>>

/**
 * Returns a sequence containing all elements of the original sequence and then the given [element].
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect operator fun <T> Sequence<T>.plus(element: T): Sequence<T>

/**
 * Returns a sequence containing all elements of original sequence and then all elements of the given [elements] array.
 * 
 * Note that the source sequence and the array being added are iterated only when an `iterator` is requested from
 * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect operator fun <T> Sequence<T>.plus(elements: Array<out T>): Sequence<T>

/**
 * Returns a sequence containing all elements of original sequence and then all elements of the given [elements] collection.
 * 
 * Note that the source sequence and the collection being added are iterated only when an `iterator` is requested from
 * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect operator fun <T> Sequence<T>.plus(elements: Iterable<T>): Sequence<T>

/**
 * Returns a sequence containing all elements of original sequence and then all elements of the given [elements] sequence.
 * 
 * Note that the source sequence and the sequence being added are iterated only when an `iterator` is requested from
 * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect operator fun <T> Sequence<T>.plus(elements: Sequence<T>): Sequence<T>

/**
 * Returns a sequence containing all elements of the original sequence and then the given [element].
 *
 * The operation is _intermediate_ and _stateless_.
 */
@kotlin.internal.InlineOnly
public expect inline fun <T> Sequence<T>.plusElement(element: T): Sequence<T>

/**
 * Returns a sequence of pairs built from elements of both sequences with same indexes.
 * Resulting sequence has length of shortest input sequence.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect infix fun <T, R> Sequence<T>.zip(other: Sequence<R>): Sequence<Pair<T, R>>

/**
 * Returns a sequence of values built from elements of both collections with same indexes using provided [transform]. Resulting sequence has length of shortest input sequences.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public expect fun <T, R, V> Sequence<T>.zip(other: Sequence<R>, transform: (a: T, b: R) -> V): Sequence<V>

/**
 * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
 * 
 * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
 * elements will be appended, followed by the [truncated] string (which defaults to "...").
 *
 * The operation is _terminal_.
 */
public fun <T, A : Appendable> Sequence<T>.joinTo(buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((T) -> CharSequence)? = null): A {
    buffer.append(prefix)
    var count = 0
    for (element in this) {
        if (++count > 1) buffer.append(separator)
        if (limit < 0 || count <= limit) {
            buffer.appendElement(element, transform)
        } else break
    }
    if (limit >= 0 && count > limit) buffer.append(truncated)
    buffer.append(postfix)
    return buffer
}

/**
 * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
 * 
 * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
 * elements will be appended, followed by the [truncated] string (which defaults to "...").
 *
 * The operation is _terminal_.
 */
public fun <T> Sequence<T>.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((T) -> CharSequence)? = null): String {
    return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
}

/**
 * Creates an [Iterable] instance that wraps the original sequence returning its elements when being iterated.
 */
public expect fun <T> Sequence<T>.asIterable(): Iterable<T>

/**
 * Returns this sequence as a [Sequence].
 */
@kotlin.internal.InlineOnly
public expect inline fun <T> Sequence<T>.asSequence(): Sequence<T>

/**
 * Returns an average value of elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("averageOfByte")
public expect fun Sequence<Byte>.average(): Double

/**
 * Returns an average value of elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("averageOfShort")
public expect fun Sequence<Short>.average(): Double

/**
 * Returns an average value of elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("averageOfInt")
public expect fun Sequence<Int>.average(): Double

/**
 * Returns an average value of elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("averageOfLong")
public expect fun Sequence<Long>.average(): Double

/**
 * Returns an average value of elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("averageOfFloat")
public expect fun Sequence<Float>.average(): Double

/**
 * Returns an average value of elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("averageOfDouble")
public expect fun Sequence<Double>.average(): Double

/**
 * Returns the sum of all elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("sumOfByte")
public expect fun Sequence<Byte>.sum(): Int

/**
 * Returns the sum of all elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("sumOfShort")
public expect fun Sequence<Short>.sum(): Int

/**
 * Returns the sum of all elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("sumOfInt")
public expect fun Sequence<Int>.sum(): Int

/**
 * Returns the sum of all elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("sumOfLong")
public expect fun Sequence<Long>.sum(): Long

/**
 * Returns the sum of all elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("sumOfFloat")
public expect fun Sequence<Float>.sum(): Float

/**
 * Returns the sum of all elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("sumOfDouble")
public expect fun Sequence<Double>.sum(): Double

