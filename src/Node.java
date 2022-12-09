public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem next) {
        this.rightLink = next;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem previous) {
        this.leftLink = previous;
        return this.leftLink;
    }

    @Override
    int comareTo(ListItem item) {
        if(item != null){
            return (((String) this.getValue()).compareTo((String) item.getValue()));
        }else
            return -1;
    }
}
