#SpaceRider

import math

class ball():
    lifespan = 200
    def __init__(self, R, G, B, x, y):
        fill(R, G, B, self.lifespan)
        circle(x, y, 20)
        noStroke()
    def update(self):
        self.lifespan -= 10
        


#PRINCIAL CLASS
class Player():
    #Set PRINCIPAL values ----> Position, Activation keys and color
    derweg = []
    x = ""
    y = ""
    tasten = ""
    farbe = ""
    def __init__(self, tastenstr, farbliste):
        self.tasten = tastenstr.split(" ")
        self.farbe = farbliste
    
    #For rendering onto the world
    def present(self, x, y):
        copie = ball(self.farbe[0], self.farbe[1], self.farbe[2], x, y)
        self.x = x
        self.y = y
    
    def getpos(self):
        return self.x, self.y
    
    def keyboardbewegung(self, key):
        if key == self.tasten[0]:
            self.x = self.x - 3
        if key == self.tasten[1]:           
            self.y = self.y - 3
        if key == self.tasten[2]:
            self.x = self.x + 3
        if key == self.tasten[3]:
            self.y = self.y + 3
        
        self.present(self.x, self.y)
        self.derweg.append([self.x, self.y])
    
    def mousebewegung(self, v):
        #KATETEN
        varx = mouseX - self.x 
        vary = mouseY - self.y
        distance = math.sqrt(varx**2 + vary**2)
        
        schrittn = distance / v
        xschritt = varx/v
        yschritt = vary/v
        
        self.x = self.x + xschritt
        self.y = self.y + yschritt
        self.present(self.x, self.y)
        self.derweg.append([self.x, self.y])
                
Yassin = Player("a w d s", (255, 0, 0))
Esteban = Player("", (0, 0, 255))

def setup():
    size(500, 500)
    background(255)
    
    Yassin.present(height,0 )
    Esteban.present(height, -width)
    
    
def draw():
    Esteban.mousebewegung(50)
    if keyPressed == True:
        print "--"
        Yassin.keyboardbewegung(key)
    
            
    xvar = abs(Yassin.getpos()[0] - Esteban.getpos()[0])
    yvar = abs(Yassin.getpos()[1] - Esteban.getpos()[1])

    if xvar < 10 or yvar < 10:
        print "VERLOREN"
    
    """    
    for yassinstelle in Yassin.derweg:
        xvar = abs(yassinstelle[0] - Esteban.getpos()[0])
        yvar = abs(yassinstelle[1] - Esteban.getpos()[1])
        print xvar, yvar
        if xvar < 10 or yvar < 10:
            print "VERLOREN"
    """
