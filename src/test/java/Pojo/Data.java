package Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    public BreadCrumb breadCrumb;
    public int totalJobCount;
    public int totalJobCountWithOutSponsored;
    public String title;
    public Jobs jobs;
//    public Filters filters;
    public String jobSortType;
    public JobSeo jobSeo;
    public String searchUrl;
    public String locationText;
//    public BlueCollarJobs blueCollarJobs;
    public boolean isSearched;

    public boolean isSearched() {
        return isSearched;
    }

    public void setSearched(boolean searched) {
        isSearched = searched;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int currentPage;
    public List<Object> suggestions;


    public int getTotalJobCount() {
        return totalJobCount;
    }

    public void setTotalJobCount(int totalJobCount) {
        this.totalJobCount = totalJobCount;
    }

    public int getTotalJobCountWithOutSponsored() {
        return totalJobCountWithOutSponsored;
    }

    public void setTotalJobCountWithOutSponsored(int totalJobCountWithOutSponsored) {
        this.totalJobCountWithOutSponsored = totalJobCountWithOutSponsored;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BreadCrumb getBreadCrumb() {
        return breadCrumb;
    }

    public void setBreadCrumb(BreadCrumb breadCrumb) {
        this.breadCrumb = breadCrumb;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }


    public JobSeo getJobSeo() {
        return jobSeo;
    }

    public void setJobSeo(JobSeo jobSeo) {
        this.jobSeo = jobSeo;
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl;
    }
}
