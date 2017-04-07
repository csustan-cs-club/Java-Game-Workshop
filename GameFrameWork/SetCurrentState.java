public void setCurrentState(State newState){
	System.gc();
	newState.init();
	currentState = newState;
}