package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.MovieSource */
public final class MovieSource implements Serializable {
    @AbstractC27891c(mo46611a = "album_group_id")
    private String agid;
    @AbstractC27891c(mo46611a = "album_id")
    private String albumId;
    @AbstractC27891c(mo46611a = "cid")
    private String cid;
    @AbstractC27891c(mo46611a = "cover")
    private UrlModel cover;
    @AbstractC27891c(mo46611a = "desc")
    private String desc;
    @AbstractC27891c(mo46611a = "duration")
    private double duration;
    @AbstractC27891c(mo46611a = "episode_list")
    private List<EpisodeData> episodesList;
    @AbstractC27891c(mo46611a = "has_more")
    private boolean hasMore;
    @AbstractC27891c(mo46611a = "latest_seqs_count")
    private int latestSeqsCount;
    @AbstractC27891c(mo46611a = "movie_module")
    private MovieModule movieModule;
    @AbstractC27891c(mo46611a = "mp_icon")
    private String mpIcon;
    @AbstractC27891c(mo46611a = "mp_id")
    private int mpId;
    @AbstractC27891c(mo46611a = "mp_name")
    private String mpName;
    @AbstractC27891c(mo46611a = "payment_status")
    private int paymentStatus;
    @AbstractC27891c(mo46611a = "play_word")
    private String playWord;
    @AbstractC27891c(mo46611a = "lvideo_tag")
    private LongVideoTag posterTag;
    @AbstractC27891c(mo46611a = "lvideo_tag_light")
    private LongVideoTag posterTagLight;
    @AbstractC27891c(mo46611a = "poster_tag_type")
    private int posterTagType;
    @AbstractC27891c(mo46611a = "release_date")
    private long releaseDate = -1;
    @AbstractC27891c(mo46611a = "schema")
    private String schema;
    @AbstractC27891c(mo46611a = "schema_type")
    private int schemaType;
    @AbstractC27891c(mo46611a = "current_count")
    private int seqsCount;
    @AbstractC27891c(mo46611a = "status")
    private int status = -1;
    @AbstractC27891c(mo46611a = "tags")
    private List<String> tags;
    @AbstractC27891c(mo46611a = "title")
    private String title;
    @AbstractC27891c(mo46611a = "seqs_count")
    private int totalSeqsCount;

    static {
        Covode.recordClassIndex(50470);
    }

    public final String getAgid() {
        return this.agid;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final List<EpisodeData> getEpisodesList() {
        return this.episodesList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getLatestSeqsCount() {
        return this.latestSeqsCount;
    }

    public final MovieModule getMovieModule() {
        return this.movieModule;
    }

    public final String getMpIcon() {
        return this.mpIcon;
    }

    public final int getMpId() {
        return this.mpId;
    }

    public final String getMpName() {
        return this.mpName;
    }

    public final int getPaymentStatus() {
        return this.paymentStatus;
    }

    public final String getPlayWord() {
        return this.playWord;
    }

    public final LongVideoTag getPosterTag() {
        return this.posterTag;
    }

    public final LongVideoTag getPosterTagLight() {
        return this.posterTagLight;
    }

    public final int getPosterTagType() {
        return this.posterTagType;
    }

    public final long getReleaseDate() {
        return this.releaseDate;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getSchemaType() {
        return this.schemaType;
    }

    public final int getSeqsCount() {
        return this.seqsCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotalSeqsCount() {
        return this.totalSeqsCount;
    }

    public final EpisodeData getFirstEpisodeData() {
        List<EpisodeData> list = this.episodesList;
        if (list == null || list.size() <= 0) {
            return null;
        }
        List<EpisodeData> list2 = this.episodesList;
        if (list2 == null) {
            C89219l.m154715b();
        }
        return list2.get(0);
    }

    public final String toString() {
        return "MovieSource(albumId=" + this.albumId + ", latestSeqsCount=" + this.latestSeqsCount + ", seqsCount=" + this.seqsCount + ", totalSeqsCount=" + this.totalSeqsCount + ", title=" + this.title + ", desc=" + this.desc + ", cover=" + this.cover + ", duration=" + this.duration + ", mpId=" + this.mpId + ", mpIcon=" + this.mpIcon + ", paymentStatus=" + this.paymentStatus + ", releaseDate=" + this.releaseDate + ", tags=" + this.tags + ", episodesList=" + this.episodesList + ", playWord=" + this.playWord + ", status=" + this.status + ", hasMore=" + this.hasMore + ", mpName=" + this.mpName + ", schema=" + this.schema + ", cid=" + this.cid + ", agid=" + this.agid + ", movieModule=" + this.movieModule + ", schemaType=" + this.schemaType + ", posterTag=$, posterTagType=" + this.posterTagType + ')';
    }

    public final void setAgid(String str) {
        this.agid = str;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDuration(double d) {
        this.duration = d;
    }

    public final void setEpisodesList(List<EpisodeData> list) {
        this.episodesList = list;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLatestSeqsCount(int i) {
        this.latestSeqsCount = i;
    }

    public final void setMovieModule(MovieModule movieModule2) {
        this.movieModule = movieModule2;
    }

    public final void setMpIcon(String str) {
        this.mpIcon = str;
    }

    public final void setMpId(int i) {
        this.mpId = i;
    }

    public final void setMpName(String str) {
        this.mpName = str;
    }

    public final void setPaymentStatus(int i) {
        this.paymentStatus = i;
    }

    public final void setPlayWord(String str) {
        this.playWord = str;
    }

    public final void setPosterTag(LongVideoTag longVideoTag) {
        this.posterTag = longVideoTag;
    }

    public final void setPosterTagLight(LongVideoTag longVideoTag) {
        this.posterTagLight = longVideoTag;
    }

    public final void setPosterTagType(int i) {
        this.posterTagType = i;
    }

    public final void setReleaseDate(long j) {
        this.releaseDate = j;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setSchemaType(int i) {
        this.schemaType = i;
    }

    public final void setSeqsCount(int i) {
        this.seqsCount = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTotalSeqsCount(int i) {
        this.totalSeqsCount = i;
    }
}
