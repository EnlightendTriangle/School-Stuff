var timer; 
var timeLeft = 10; 


function gameOver() {
 confirm("Time's up! Your score is  .");
}

function updateTimer() {
  timeLeft = timeLeft - 1;
  if(timeLeft >= 0)
    $('#timer').html(timeLeft);
  if(timeLeft == -1) {
	gameOver();
  }
}

function start() {
  timer = setInterval(updateTimer, 1000);
  updateTimer();
  $('#playAgainButton').hide();
}

