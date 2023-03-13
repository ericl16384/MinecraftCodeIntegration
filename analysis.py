import time

import pygame

# Initialize Pygame
pygame.init()

# Set up the window display
window_size = (700, 700)
screen = pygame.display.set_mode(window_size)
pygame.display.set_caption("My Pygame Window")





fileLength = 0
def getNewData():
    global fileLength

    # Open the file for reading
    with open('run/logs/debug.log', 'r') as file:
        # Read the contents of the file into a variable
        contents = file.read()

    lines = contents.split("\n")

    if len(lines) > fileLength:
        lines = lines[fileLength:]
        fileLength = len(lines)
    elif len(lines) > fileLength:
        screen.fill(BLACK)

    data = []
    for l in lines:
        sections = l.split(" ")
        if len(sections) > 4 and sections[4] == "[com.example.examplemod.ExampleMod/]:":
            if sections[5:7] == ["Current", "position:"]:
                data.append(sections[7:])
    
    return data










# Set up colors
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
GREEN = (0, 255, 0)
BLUE = (0, 0, 255)

# Set up the circle and line
circle_position = (200, 200)
circle_radius = 1
line_start = (100, 100)
line_end = (300, 300)

screen.fill(BLACK)


# Main loop
running = True
while running:
    # Handle events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Draw the circle
    for d in getNewData():
        point = tuple([float(i.split("=")[1])*10+350 for i in [d[0], d[2]]])
        pygame.draw.circle(screen, BLUE, point, circle_radius)

    # # Draw the line
    # pygame.draw.line(screen, GREEN, line_start, line_end, 5)

    # Update the display
    pygame.display.update()

    time.sleep(0.05)

# Quit Pygame
pygame.quit()
