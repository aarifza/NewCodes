import java.util.HashMap;
import java.util.Map;

class ListNode {
    String song;
    String user;
    ListNode next;
    ListNode prev;

    public ListNode(String song, String user) {
        this.song = song;
        this.user = user;
    }
}

class RecentlyPlayedStore {
    private int capacity;
    private int size;
    private Map<String, ListNode> songUserMap;
    private ListNode head;
    private ListNode tail;

    public RecentlyPlayedStore(int initialCapacity) {
        this.capacity = initialCapacity;
        this.size = 0;
        this.songUserMap = new HashMap<>();
        this.head = null;
        this.tail = null;
    }

    public void addSong(String song, String user) {
        if (songUserMap.containsKey(user)) {
            ListNode node = songUserMap.get(user);
            node.song = song;
            moveToHead(node);
        } else {
            if (size == capacity) {
                removeLeastRecentlyPlayedSong();
            }
            ListNode node = new ListNode(song, user);
            songUserMap.put(user, node);
            addToFront(node);
            size++;
        }
    }

    public List<String> getRecentlyPlayedSongs(String user, int numSongs) {
        List<String> recentlyPlayedSongs = new ArrayList<>();
        if (songUserMap.containsKey(user)) {
            ListNode node = songUserMap.get(user);
            while (node != null && numSongs > 0) {
                recentlyPlayedSongs.add(node.song);
                node = node.next;
                numSongs--;
            }
        }
        return recentlyPlayedSongs;
    }

    private void moveToHead(ListNode node) {
        if (node == head) {
            return;
        }
        removeNode(node);
        addToFront(node);
    }

    private void addToFront(ListNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    private void removeLeastRecentlyPlayedSong() {
        if (tail == null) {
            return;
        }
        songUserMap.remove(tail.user);
        removeNode(tail);
        size--;
    }

    private void removeNode(ListNode node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }
}