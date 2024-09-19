package Pojo;

import java.util.List;

public class BreadCrumb {

    private List<Item> items;

    public List<Item> getItems() { return items; }
    public void setItems(List<Item> items) { this.items = items; }

    public static class Item {
        private String text;

        private String url;

        public String getText() { return text; }
        public void setText(String text) { this.text = text; }
        public String getUrl() { return url; }
        public void setUrl(String url) { this.url = url; }
    }
}
