package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NewUserProgressModel */
public final class NewUserProgressModel implements Serializable {
    @AbstractC27891c(mo46611a = "progress_bar_info")
    private ProgressBarInfo progressBarInfo;
    @AbstractC27891c(mo46611a = "swipe_up_text")
    private SwipeUpText swipeUpText;

    static {
        Covode.recordClassIndex(58739);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.NewUserProgressModel$ProgressBarInfo */
    public static final class ProgressBarInfo implements Serializable {
        @AbstractC27891c(mo46611a = "is_default_color")
        private Boolean isDefaultColor = false;
        @AbstractC27891c(mo46611a = "is_dismissible")
        private Boolean isProgressBarDismissable = false;
        @AbstractC27891c(mo46611a = "should_show_progress_bar")
        private Boolean shouldShowProgressBar = false;
        @AbstractC27891c(mo46611a = "text_progress_before_complete")
        private String textProgressBeforeComplete = "";
        @AbstractC27891c(mo46611a = "text_progress_complete")
        private String textProgressComplete = "";
        @AbstractC27891c(mo46611a = "text_progress_half_equal")
        private String textProgressHalfEqual = "";
        @AbstractC27891c(mo46611a = "text_progress_half_less")
        private String textProgressHalfLess = "";
        @AbstractC27891c(mo46611a = "text_progress_half_more")
        private String textProgressHalfMore = "";
        @AbstractC27891c(mo46611a = "text_remove_body")
        private String textRemoveBody = "";
        @AbstractC27891c(mo46611a = "text_remove_title")
        private String textRemoveTitle = "";
        @AbstractC27891c(mo46611a = "text_tap_body")
        private String textTapBody = "";
        @AbstractC27891c(mo46611a = "text_tap_title")
        private String textTapTitle = "";

        static {
            Covode.recordClassIndex(58740);
        }

        public final Boolean getShouldShowProgressBar() {
            return this.shouldShowProgressBar;
        }

        public final String getTextProgressBeforeComplete() {
            return this.textProgressBeforeComplete;
        }

        public final String getTextProgressComplete() {
            return this.textProgressComplete;
        }

        public final String getTextProgressHalfEqual() {
            return this.textProgressHalfEqual;
        }

        public final String getTextProgressHalfLess() {
            return this.textProgressHalfLess;
        }

        public final String getTextProgressHalfMore() {
            return this.textProgressHalfMore;
        }

        public final String getTextRemoveBody() {
            return this.textRemoveBody;
        }

        public final String getTextRemoveTitle() {
            return this.textRemoveTitle;
        }

        public final String getTextTapBody() {
            return this.textTapBody;
        }

        public final String getTextTapTitle() {
            return this.textTapTitle;
        }

        public final Boolean isDefaultColor() {
            return this.isDefaultColor;
        }

        public final Boolean isProgressBarDismissable() {
            return this.isProgressBarDismissable;
        }

        public final String toString() {
            return "ProgressBarInfo {shouldShowProgressBar='" + this.shouldShowProgressBar + "'isProgressBarDismissable='" + this.isProgressBarDismissable + "'isDefaultColor='" + this.isDefaultColor + "', textProgressHalfLess=" + this.textProgressHalfLess + ", textProgressHalfEqual=" + this.textProgressHalfEqual + ", textProgressHalfMore=" + this.textProgressHalfMore + ", textProgressBeforeComplete=" + this.textProgressBeforeComplete + ", textProgressComplete=" + this.textProgressComplete + ", textTapTitle=" + this.textTapTitle + ", textTapBody=" + this.textTapBody + ", textRemoveTitle=" + this.textRemoveTitle + ", textRemoveBody=" + this.textRemoveBody + "}";
        }

        public final void setDefaultColor(Boolean bool) {
            this.isDefaultColor = bool;
        }

        public final void setProgressBarDismissable(Boolean bool) {
            this.isProgressBarDismissable = bool;
        }

        public final void setShouldShowProgressBar(Boolean bool) {
            this.shouldShowProgressBar = bool;
        }

        public final void setTextProgressBeforeComplete(String str) {
            this.textProgressBeforeComplete = str;
        }

        public final void setTextProgressComplete(String str) {
            this.textProgressComplete = str;
        }

        public final void setTextProgressHalfEqual(String str) {
            this.textProgressHalfEqual = str;
        }

        public final void setTextProgressHalfLess(String str) {
            this.textProgressHalfLess = str;
        }

        public final void setTextProgressHalfMore(String str) {
            this.textProgressHalfMore = str;
        }

        public final void setTextRemoveBody(String str) {
            this.textRemoveBody = str;
        }

        public final void setTextRemoveTitle(String str) {
            this.textRemoveTitle = str;
        }

        public final void setTextTapBody(String str) {
            this.textTapBody = str;
        }

        public final void setTextTapTitle(String str) {
            this.textTapTitle = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.NewUserProgressModel$SwipeUpText */
    public static final class SwipeUpText implements Serializable {
        @AbstractC27891c(mo46611a = "subtitle")
        private String subTitle = "";
        @AbstractC27891c(mo46611a = "title")
        private String title = "";

        static {
            Covode.recordClassIndex(58741);
        }

        public final String getSubTitle() {
            return this.subTitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String toString() {
            return "{subTitle=" + this.subTitle + "title=" + this.title + "}";
        }

        public final void setSubTitle(String str) {
            this.subTitle = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    public final ProgressBarInfo getProgressBarInfo() {
        return this.progressBarInfo;
    }

    public final SwipeUpText getSwipeUpText() {
        return this.swipeUpText;
    }

    public final String toString() {
        return String.valueOf(this.swipeUpText) + ", " + String.valueOf(this.progressBarInfo);
    }

    public final void setProgressBarInfo(ProgressBarInfo progressBarInfo2) {
        this.progressBarInfo = progressBarInfo2;
    }

    public final void setSwipeUpText(SwipeUpText swipeUpText2) {
        this.swipeUpText = swipeUpText2;
    }
}
