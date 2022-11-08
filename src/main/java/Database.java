public class Database {

    boolean connected;
    int uniqueId;

    public void connectDataBase(){
        setConnected(true);
    }

    public boolean isAvailable() {
        return isConnected();
    }
    public int getUniqueId() {
        return uniqueId;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }
}
