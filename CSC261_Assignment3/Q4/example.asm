; CSC261-01
; Emily Ashburn
; Professor Chandana Ariyawansa
; 10/17/2018
; This program prompts for and inputs four grades with separate dialog
; boxes, calculates sum and avg (sum/4) of the grades. Displays sum and
; avg on two lines of a message box, each line with approriate label.


.586
.model flat

include io.h           
.stack 4096

.data
num1 byte 11 dup (?), 0
num2 byte 11 dup (?), 0
num3 byte 11 dup (?), 0
num4 byte 11 dup (?), 0
string byte 11 dup (?), 0
numsLbl byte "Enter grade:", 0
testLbl byte "testing", 0

sum     byte    11 dup (?), 0
avg		byte	11 dup (?), 0

lbl_msg byte "Sum and Average", 0
displayLbl byte "Sum:", 11 dup(?), 0dh, 0ah, "Average:", 11 dup(?), 0


.code
_MainProc proc
		input numsLbl, string, 11		; get grade1
		atod string						; ASCII to int
		mov num1, al					; move to memory
		 
		input numsLbl, string, 11		; repeat for grade2
		atod string
		mov num2, al

		input numsLbl, string, 11		; repeat for grade3
		atod string
		mov num2, al

		input numsLbl, string, 11		; repeat for grade4
		atod string
		mov num2, al

		mov al, num1					; calculate sum
		add al, num2
		add al, num3
		add al, num4
		mov sum, al						; move sum to memory
		cbw								; prepare for division (avg) by extending al
		mov bl, 4						; move immediate to register to divide
		div bl							; divide to get average
		mov avg, al						; store avg in memory

        mov     al, sum					; move sum to al
        mov		bl, avg					; move sum to bl

	    dtoa    sum, eax				; int to ASCII
        dtoa	avg, ebx				; int to ASCII

		lea ebx, displayLbl
		add ebx, 4
		
		lea esi, sum
		mov ecx, 11
loop1:									; print sum in correct spot of "array"
		mov dl, byte ptr[esi]
		mov byte ptr[ebx], dl
		inc esi
		inc ebx
		loop loop1

		lea ebx, displayLbl
		add ebx, 25

		lea esi, avg
		mov ecx, 11
loop2:									; print avg in correct spot of "array"
		mov dl, byte ptr[esi]
		mov byte ptr[ebx], dl
		inc esi
		inc ebx
		loop loop2

		output  lbl_msg, displayLbl		; print result

		xor eax, eax
		ret

_MainProc endp

end                             ; end of source code