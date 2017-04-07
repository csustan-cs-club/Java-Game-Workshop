@Override
public void addNotify()
{
	super.addNotify();
	setCurrentState(new LoadState());
}