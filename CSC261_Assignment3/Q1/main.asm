; CSC261-01
; Emily Ashburn
; Professor Chandana Ariyawansa
; 10/17/2018
; This program is a revision to the program in Figure 4.12 in the book. This program now uses the input macro to
; prompt for input values for x, y, and z, and the output macro to display an appropriate label and the 
; value of the expression.


; Program to evaluate the expression -(x + y - 2z + 1) doubleword values stored in memory, leaving the result in EAX
; Author : R. Detmer
; Date: revised 6/2013


.586
.model flat

include io.h    

.stack 4096

.data
x dword ?
y dword ?
z dword ?
prompt1 byte "Enter an X value:", 0
prompt2 byte "Enter a Y value:", 0
prompt3 byte "Enter a Z value:", 0
string byte 40 DUP (?)
resultLbl byte "-(X + Y - 2z + 1) =", 0
result dword 11 DUP (?)

.code
_MainProc proc
		input	prompt1, string, 40		; get x value
		atod	string		; convert to integer
		mov		x, eax		; store in memory

		input	prompt2, string, 40		; repeat for y
		atod	string
		mov		y, eax

		input	prompt3, string, 20		; repeat for z
		atod	string
		mov		z, eax

		mov		eax, x		; result = x
		add		eax, y		; result = x + y
		mov		ebx, z		; move z to ebx
		add		ebx, ebx	; 2z
		sub		eax, ebx	; result = (x + y - 2z)
		inc		eax			; result = (x + y - 2z + 1)
		neg		eax			; result = -(x + y - 2z + 1)

		dtoa	result, eax		; convert result to integers
		output	resultLbl, result	; print resultLbl and result

		mov eax, 0		; exit with return code 0
		ret

_MainProc endp

end                             ; end of source code
