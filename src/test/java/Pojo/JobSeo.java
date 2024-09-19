package Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)  // Tanınmayan alanları yoksay
public class JobSeo {
    public String searchResultTitle;
    public String metaTitle;
    public String metaDescription;
    public String canonicalUrl;
    public Object positionTitle;
    public Object positionDescription;
    public Object nextPageLink;
    public Object previousPageLink;
    public Object content;
    public Object contentTitle;
    public Object faqHtmlContent;
//    public NoScriptUrlResponse noScriptUrlResponse;

    public String getSearchResultTitle() {
        return searchResultTitle;
    }

    public void setSearchResultTitle(String searchResultTitle) {
        this.searchResultTitle = searchResultTitle;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    public Object getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(Object positionTitle) {
        this.positionTitle = positionTitle;
    }

    public Object getPositionDescription() {
        return positionDescription;
    }

    public void setPositionDescription(Object positionDescription) {
        this.positionDescription = positionDescription;
    }

    public Object getNextPageLink() {
        return nextPageLink;
    }

    public void setNextPageLink(Object nextPageLink) {
        this.nextPageLink = nextPageLink;
    }

    public Object getPreviousPageLink() {
        return previousPageLink;
    }

    public void setPreviousPageLink(Object previousPageLink) {
        this.previousPageLink = previousPageLink;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Object getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(Object contentTitle) {
        this.contentTitle = contentTitle;
    }

    public Object getFaqHtmlContent() {
        return faqHtmlContent;
    }

    public void setFaqHtmlContent(Object faqHtmlContent) {
        this.faqHtmlContent = faqHtmlContent;
    }

}
