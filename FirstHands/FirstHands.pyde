def setup():							# runs only once
    size(400,400)						# the size of the canvas
    stroke(255)							# 

def draw():								# executes continuously
    line(150, 25, mouseX, mouseY)		# draw the line
    saveFrame("output.png")				# saves the lastest frame in the canvas
    # saveFrame("output-###.png")		# saves every frame in the canvas


def mousePressed():						# called when mouse is pressed
    background(192, 64, 0)				# reloads the drawing canvas with the color(rgb = 192,64,0)
