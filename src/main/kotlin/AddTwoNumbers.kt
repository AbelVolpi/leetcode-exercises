class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val initialHead = ListNode(0)
    var current = initialHead
    var carry = 0
    var currentL1Node = l1
    var currentL2Node = l2
    while (currentL1Node != null || currentL2Node != null || carry != 0) {
        val l1Value = currentL1Node?.`val` ?: 0
        val l2Value = currentL2Node?.`val` ?: 0

        var sum = l1Value + l2Value + carry
        carry = sum / 10
        val newNodeValue = sum % 10

        current.next = ListNode(newNodeValue)
        current = current.next!!

        currentL1Node = currentL1Node?.next
        currentL2Node = currentL2Node?.next
    }
    return initialHead.next
}

fun main() {
    val l1Sixth = ListNode(9)
    val l1Fifth = ListNode(9)
    val l1Fourth = ListNode(9)
    val l1Third = ListNode(9)
    val l1Second = ListNode(9)
    val l1First = ListNode(9)
    l1First.next = l1Second
    l1Second.next = l1Third
    l1Third.next = l1Fourth
    l1Fourth.next = l1Fifth
    l1Fifth.next = l1Sixth

    val l2Third = ListNode(9)
    val l2Second = ListNode(9)
    val l2First = ListNode(9)
    l2First.next = l2Second
    l2Second.next = l2Third

    val list = addTwoNumbers(l1First, l2First)
    printList(list)
}

fun printList(node: ListNode?) {
    println()
    print(node?.`val`)
    if (node?.next != null) {
        printList(node.next!!)
    }
}