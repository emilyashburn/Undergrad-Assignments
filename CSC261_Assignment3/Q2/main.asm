; CSC261-01
; Emily Ashburn
; Professor Chandana Ariyawansa
; 10/17/2018
; This program is designed to compute (in EAX) the perimeter 
(2*length + 2*width) of a rectangle where the length and width
; are in memory doublewords.


.586
.model flat
.stack 4096

.data
length dword 13
width dword 9

.code
		mov eax, length		; result = length
		add eax, eax		; result = 2*length
		mov ebx, width		; ebx = width
		add ebx, ebx		; ebx = 2*width
		add eax, ebx		; result = (2*length) + (2*width)

main proc
main endp
end main