package com.p2082ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.EpisodeData */
public final class EpisodeData implements Serializable {
    @AbstractC27891c(mo46611a = "album_id")
    private String albumId;
    @AbstractC27891c(mo46611a = "definition")
    private String definition;
    @AbstractC27891c(mo46611a = "duration")
    private double duration;
    @AbstractC27891c(mo46611a = "episode_id")
    private String episodeId;
    @AbstractC27891c(mo46611a = StringSet.name)
    private String name;
    @AbstractC27891c(mo46611a = "online_time")
    private long onlineTime;
    @AbstractC27891c(mo46611a = "opening")
    private double opening;
    @AbstractC27891c(mo46611a = "payment_status")
    private int paymentStatus;
    @AbstractC27891c(mo46611a = "lvideo_tag")
    private LongVideoTag paymentTag;
    @AbstractC27891c(mo46611a = "lvideo_tag_light")
    private LongVideoTag paymentTagLight;
    @AbstractC27891c(mo46611a = "schema_type")
    private int schemaType;
    @AbstractC27891c(mo46611a = "schema")
    private String scheme;
    @AbstractC27891c(mo46611a = "seq")
    private int seq;
    private String seqStr;
    @AbstractC27891c(mo46611a = "sub_title")
    private String subTitle;
    @AbstractC27891c(mo46611a = "title")
    private String title;
    @AbstractC27891c(mo46611a = "url")
    private String url;
    @AbstractC27891c(mo46611a = "vid")
    private String vid;

    static {
        Covode.recordClassIndex(50452);
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getDefinition() {
        return this.definition;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final String getEpisodeId() {
        return this.episodeId;
    }

    public final String getName() {
        return this.name;
    }

    public final long getOnlineTime() {
        return this.onlineTime;
    }

    public final double getOpening() {
        return this.opening;
    }

    public final int getPaymentStatus() {
        return this.paymentStatus;
    }

    public final LongVideoTag getPaymentTag() {
        return this.paymentTag;
    }

    public final LongVideoTag getPaymentTagLight() {
        return this.paymentTagLight;
    }

    public final int getSchemaType() {
        return this.schemaType;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVid() {
        return this.vid;
    }

    public final String getSeqStr() {
        if (TextUtils.isEmpty(this.seqStr)) {
            return String.valueOf(this.seq);
        }
        return this.seqStr;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setDefinition(String str) {
        this.definition = str;
    }

    public final void setDuration(double d) {
        this.duration = d;
    }

    public final void setEpisodeId(String str) {
        this.episodeId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOnlineTime(long j) {
        this.onlineTime = j;
    }

    public final void setOpening(double d) {
        this.opening = d;
    }

    public final void setPaymentStatus(int i) {
        this.paymentStatus = i;
    }

    public final void setPaymentTag(LongVideoTag longVideoTag) {
        this.paymentTag = longVideoTag;
    }

    public final void setPaymentTagLight(LongVideoTag longVideoTag) {
        this.paymentTagLight = longVideoTag;
    }

    public final void setSchemaType(int i) {
        this.schemaType = i;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setSeq(int i) {
        this.seq = i;
    }

    public final void setSeqStr(String str) {
        this.seqStr = str;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setVid(String str) {
        this.vid = str;
    }
}
