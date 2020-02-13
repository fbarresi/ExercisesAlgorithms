\* Problem: Produktion *\

Maximize
  Erloes: 80 x1 + 100 x2

Subject To
  Maschine: 3 x1 + 2 x2 <= 1200
  Rohstoff: 3 x1 + 5 x2 <= 1500

Bounds
  0 <= x1
  0 <= x2 <= 200

End

\* Aufruf mit ./glpsol --lp test.lp --output ergebnis.txt *\
