# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0) # Dummy head to simplify list construction
        current = dummy
        carry = 0
        
        # Continue if there are still digits to process or a carry left over
        while l1 or l2 or carry:
            # Extract values, defaulting to 0 if the list is exhausted
            v1 = l1.val if l1 else 0
            v2 = l2.val if l2 else 0
            
            # Calculate sum and the new carry
            total = v1 + v2 + carry
            carry = total // 10
            
            # Create the next node with the single digit
            current.next = ListNode(total % 10)
            
            # Advance all pointers
            current = current.next
            if l1: l1 = l1.next
            if l2: l2 = l2.next
            
        return dummy.next



















