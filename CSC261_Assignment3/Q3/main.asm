; CSC261-01
; Emily Ashburn
; Professor Chandana Ariyawansa
; 10/17/2018

; This program prompts for and inputs the length, width, and
; height of a box and computes and displays its volume
; (length * width * height). 


.586
.model flat

include io.h           
.stack 4096

.data
long dword ?
wide dword ?
height dword ?
volume dword ?

longLbl byte "Length of box?", 0
wideLbl byte "Width of box?", 0
heightLbl byte "Height of box?", 0
volumeLbl byte "Volume of box:", 0

string byte 30 DUP (?)

.code
_MainProc proc
		input longLbl, string, 30		; get length of rectangle
		atod string						; ASCII to decimal
		mov long, eax					; move value of length to memory

		input wideLbl, string, 30			; repeat for width
		atod string
		mov wide, eax

		input heightLbl, string, 30		; repeat for height
		atod string
		mov height, eax

		mov eax, long					; move length to eax
		mul wide						; eax * width (Length * width)
		mul height						; eax * height (Length * width * height)
		dtoa volume, eax				; move result to memory
		output volumeLbl, volume		; output label and volume
		
		mov eax, 0
		ret

_MainProc endp

end                             ; end of source code