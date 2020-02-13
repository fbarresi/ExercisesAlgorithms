\* Problem: Orangenhandling *\
Maximize
	win: 0.2 x1 + 0.25 x2
Subject To
	KgOfOranges: 2 x1 + x2 <= 200
	KgOfSugar: 0.2 x1 + x2 <= 110
Bounds
	0 <= x1
	0 <= x2
End