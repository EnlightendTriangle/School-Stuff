var canvas = document.getElementById('game');
var context = canvas.getContext('2d');

var grid = 8;
var count = 0;

var left = 37;
var right = 39;
var up = 38;
var down = 40; 



var snake = {
	
  x: 0,
  y: 70,
  
  // snake velocity. moves one grid length every frame in either the x or y direction
  dx: grid,
  dy: 0,
  
  // keep track of all grids the snake body occupies
  cells: [],
};

// game loop
function loop() {
  requestAnimationFrame(loop);

  // slow game loop to 15 fps instead of 60 (60/15 = 4)
  if (++count < 4) {
    return;
  }

  count = 0;
  context.clearRect(0,0,canvas.width,canvas.height);

  // move snake by it's velocity
  snake.x += snake.dx;
  snake.y += snake.dy;

  

  // keep track of where snake has been. front of the array is always the head
  snake.cells.unshift({x: snake.x, y: snake.y});

  // draw snake one cell at a time
  context.fillStyle = 'red';
  
  snake.cells.forEach(function(cell, index) {
    
    // drawing 1 px smaller than the grid creates a grid effect in the snake body so you can see how long it is
    context.fillRect(cell.x, cell.y, grid-1, grid-1);  

    // check collision with all cells after this one (modified bubble sort)
    for (var i = index + 1; i < snake.cells.length; i++) {
      
      // snake occupies same space as a body part. reset game
      if (cell.x === snake.cells[i].x && cell.y === snake.cells[i].y) {
        snake.x = 0;
        snake.y = 70;
        snake.cells = [];
        snake.maxCells = 4;
        snake.dx = grid;
        snake.dy = 0;

      }
    }
  });
}


// listen to keyboard events to move the snake
document.addEventListener('keydown', function(e) {
  // prevent snake from backtracking on itself by checking that it's 
  // not already moving on the same axis (pressing left while moving
  // left won't do anything, and pressing right while moving left
  // shouldn't let you collide with your own body)
  
  // left arrow key
  if (e.which === left && snake.dx === 0) {
    snake.dx = -grid;
    snake.dy = 0;
  }
  // up arrow key
  else if (e.which === up && snake.dy === 0) {
    snake.dy = -grid;
    snake.dx = 0;
  }
  // right arrow key
  else if (e.which === right && snake.dx === 0) {
    snake.dx = grid;
    snake.dy = 0;
  }
  // down arrow key
  else if (e.which === down && snake.dy === 0) {
    snake.dy = grid;
    snake.dx = 0;
  }
});

// start the game
requestAnimationFrame(loop);