package Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)  // Tanınmayan alanları yoksay
public class Jobs {

        private List<Job> items;

        public List<Job> getItems() {
            return items;
        }

        public void setItems(List<Job> items) {
            this.items = items;
        }
        @JsonIgnoreProperties(ignoreUnknown = true)  // Tanınmayan alanları yoksay
        public static class Job {

            private int id;
            private String title;
            private String companyName;
            private String jobUrl;
            private String companyUrl;
            private String logoUrl;
            private String fullPathLogoUrl;
            private String locationText;
            private boolean isSponsored;
            private boolean humanReward;
            private String workType;
            private String workTypeText;
            private String jobDateText;
            private String memberJobStatus;
            private boolean isHandicapped;
            private boolean isFavorite;
            private boolean hasVideo;
            private boolean hasIso;
            private int companyId;
            private int profileId;
            private String jobDateStatus;
            private String postingDate;
            private boolean confidential;
            private boolean onlyPublishedOnKariyerNet;
            private int isLogoSelected;
            private String showTime;
            private int positionLevel;
            private String allLocations;
            private String squareLogoUrl;
            private boolean isDisaster;
            private String workModel;
            private boolean isEasyApply;
            private String jobCode;
            private String positionId;
            private String appliedDetail;


//            private List<Sector> sectors;
//           private List<Location> locations;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCompanyName() {
                return companyName;
            }

            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }

            public String getJobUrl() {
                return jobUrl;
            }

            public void setJobUrl(String jobUrl) {
                this.jobUrl = jobUrl;
            }

            public String getCompanyUrl() {
                return companyUrl;
            }

            public void setCompanyUrl(String companyUrl) {
                this.companyUrl = companyUrl;
            }

            public String getLogoUrl() {
                return logoUrl;
            }

            public void setLogoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
            }

            public String getFullPathLogoUrl() {
                return fullPathLogoUrl;
            }

            public void setFullPathLogoUrl(String fullPathLogoUrl) {
                this.fullPathLogoUrl = fullPathLogoUrl;
            }

            public String getLocationText() {
                return locationText;
            }

            public void setLocationText(String locationText) {
                this.locationText = locationText;
            }

            public boolean isSponsored() {
                return isSponsored;
            }

            public void setSponsored(boolean sponsored) {
                isSponsored = sponsored;
            }

            public boolean isHumanReward() {
                return humanReward;
            }

            public void setHumanReward(boolean humanReward) {
                this.humanReward = humanReward;
            }

            public String getWorkType() {
                return workType;
            }

            public void setWorkType(String workType) {
                this.workType = workType;
            }

            public String getWorkTypeText() {
                return workTypeText;
            }

            public void setWorkTypeText(String workTypeText) {
                this.workTypeText = workTypeText;
            }

            public String getJobDateText() {
                return jobDateText;
            }

            public void setJobDateText(String jobDateText) {
                this.jobDateText = jobDateText;
            }

            public String getMemberJobStatus() {
                return memberJobStatus;
            }

            public void setMemberJobStatus(String memberJobStatus) {
                this.memberJobStatus = memberJobStatus;
            }

            public boolean isHandicapped() {
                return isHandicapped;
            }

            public void setHandicapped(boolean handicapped) {
                isHandicapped = handicapped;
            }

            public boolean isFavorite() {
                return isFavorite;
            }

            public void setFavorite(boolean favorite) {
                isFavorite = favorite;
            }

            public boolean isHasVideo() {
                return hasVideo;
            }

            public void setHasVideo(boolean hasVideo) {
                this.hasVideo = hasVideo;
            }

            public boolean isHasIso() {
                return hasIso;
            }

            public void setHasIso(boolean hasIso) {
                this.hasIso = hasIso;
            }

            public int getCompanyId() {
                return companyId;
            }

            public void setCompanyId(int companyId) {
                this.companyId = companyId;
            }

            public int getProfileId() {
                return profileId;
            }

            public void setProfileId(int profileId) {
                this.profileId = profileId;
            }

            public String getJobDateStatus() {
                return jobDateStatus;
            }

            public void setJobDateStatus(String jobDateStatus) {
                this.jobDateStatus = jobDateStatus;
            }

            public String getPostingDate() {
                return postingDate;
            }

            public void setPostingDate(String postingDate) {
                this.postingDate = postingDate;
            }

            public boolean isConfidential() {
                return confidential;
            }

            public void setConfidential(boolean confidential) {
                this.confidential = confidential;
            }

            public boolean isOnlyPublishedOnKariyerNet() {
                return onlyPublishedOnKariyerNet;
            }

            public void setOnlyPublishedOnKariyerNet(boolean onlyPublishedOnKariyerNet) {
                this.onlyPublishedOnKariyerNet = onlyPublishedOnKariyerNet;
            }

            public int getIsLogoSelected() {
                return isLogoSelected;
            }

            public void setIsLogoSelected(int isLogoSelected) {
                this.isLogoSelected = isLogoSelected;
            }

            public String getShowTime() {
                return showTime;
            }

            public void setShowTime(String showTime) {
                this.showTime = showTime;
            }

            public int getPositionLevel() {
                return positionLevel;
            }

            public void setPositionLevel(int positionLevel) {
                this.positionLevel = positionLevel;
            }

            public String getAllLocations() {
                return allLocations;
            }

            public void setAllLocations(String allLocations) {
                this.allLocations = allLocations;
            }

            public String getSquareLogoUrl() {
                return squareLogoUrl;
            }

            public void setSquareLogoUrl(String squareLogoUrl) {
                this.squareLogoUrl = squareLogoUrl;
            }

            public boolean isDisaster() {
                return isDisaster;
            }

            public void setDisaster(boolean disaster) {
                isDisaster = disaster;
            }

            public String getWorkModel() {
                return workModel;
            }

            public void setWorkModel(String workModel) {
                this.workModel = workModel;
            }

            public boolean isEasyApply() {
                return isEasyApply;
            }

            public void setEasyApply(boolean easyApply) {
                isEasyApply = easyApply;
            }

            public String getJobCode() {
                return jobCode;
            }

            public void setJobCode(String jobCode) {
                this.jobCode = jobCode;
            }
            public String getAppliedDetail() {
                return appliedDetail;
            }

            public void setAppliedDetail(String appliedDetail) {
                this.appliedDetail = appliedDetail;
            }

            public String getPositionId() {
                return positionId;
            }

            public void setPositionId(String positionId) {
                this.positionId = positionId;
            }

        }

}