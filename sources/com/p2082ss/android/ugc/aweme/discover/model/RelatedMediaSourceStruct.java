package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.RelatedMediaSourceStruct */
public final class RelatedMediaSourceStruct implements Serializable {
    @AbstractC27891c(mo46611a = "button")
    private MediaSourceButtonStruct button;
    @AbstractC27891c(mo46611a = "classification")
    private List<String> classification;
    @AbstractC27891c(mo46611a = "compass_id")
    private String compassId;
    @AbstractC27891c(mo46611a = "cover")
    private UrlModel cover = new UrlModel();
    @AbstractC27891c(mo46611a = "duration")
    private Integer duration = 0;
    @AbstractC27891c(mo46611a = "seqs_count")
    private int epCount;
    @AbstractC27891c(mo46611a = "episode_info")
    private MovieSource episodeInfo;
    @AbstractC27891c(mo46611a = "media_name")
    private String mediaName = "";
    @AbstractC27891c(mo46611a = "media_tag")
    private String mediaTag = "";
    @AbstractC27891c(mo46611a = "media_type")
    private int mediaType = 1;
    @AbstractC27891c(mo46611a = "movie_info")
    private Movie movieInfo;
    @AbstractC27891c(mo46611a = "rating")
    private Float rating = Float.valueOf(0.0f);
    @AbstractC27891c(mo46611a = "rating_status")
    private Integer ratingStatus = 0;
    @AbstractC27891c(mo46611a = "read_more")
    private String readMore = "";
    @AbstractC27891c(mo46611a = "read_more_url")
    private String readMoreUrl = "";
    @AbstractC27891c(mo46611a = "release_date")
    private String releaseData = "";
    @AbstractC27891c(mo46611a = "title")
    private String title = "";

    static {
        Covode.recordClassIndex(50474);
    }

    public final MediaSourceButtonStruct getButton() {
        return this.button;
    }

    public final List<String> getClassification() {
        return this.classification;
    }

    public final String getCompassId() {
        return this.compassId;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final int getEpCount() {
        return this.epCount;
    }

    public final MovieSource getEpisodeInfo() {
        return this.episodeInfo;
    }

    public final String getMediaName() {
        return this.mediaName;
    }

    public final String getMediaTag() {
        return this.mediaTag;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final Movie getMovieInfo() {
        return this.movieInfo;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final Integer getRatingStatus() {
        return this.ratingStatus;
    }

    public final String getReadMore() {
        return this.readMore;
    }

    public final String getReadMoreUrl() {
        return this.readMoreUrl;
    }

    public final String getReleaseData() {
        return this.releaseData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isMovie() {
        if (this.mediaType == 3) {
            return true;
        }
        return false;
    }

    public final String getContentType() {
        String a;
        List<String> list = this.classification;
        if (list == null || (a = C89070n.m154551a(list, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)) == null) {
            return "";
        }
        return a;
    }

    public final void setButton(MediaSourceButtonStruct mediaSourceButtonStruct) {
        this.button = mediaSourceButtonStruct;
    }

    public final void setClassification(List<String> list) {
        this.classification = list;
    }

    public final void setCompassId(String str) {
        this.compassId = str;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEpCount(int i) {
        this.epCount = i;
    }

    public final void setEpisodeInfo(MovieSource movieSource) {
        this.episodeInfo = movieSource;
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setMovieInfo(Movie movie) {
        this.movieInfo = movie;
    }

    public final void setRating(Float f) {
        this.rating = f;
    }

    public final void setRatingStatus(Integer num) {
        this.ratingStatus = num;
    }

    public final void setReleaseData(String str) {
        this.releaseData = str;
    }

    public final void setCover(UrlModel urlModel) {
        C89219l.m154721d(urlModel, "");
        this.cover = urlModel;
    }

    public final void setMediaName(String str) {
        C89219l.m154721d(str, "");
        this.mediaName = str;
    }

    public final void setMediaTag(String str) {
        C89219l.m154721d(str, "");
        this.mediaTag = str;
    }

    public final void setReadMore(String str) {
        C89219l.m154721d(str, "");
        this.readMore = str;
    }

    public final void setReadMoreUrl(String str) {
        C89219l.m154721d(str, "");
        this.readMoreUrl = str;
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        this.title = str;
    }
}
