public class Test03 {

    public <T extends ViewGroup> T get(){//CAP#1
        return (T)new LinearLayout();
    }
}

class ViewGroup{}
class LinearLayout extends ViewGroup{}