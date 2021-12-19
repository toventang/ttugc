package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.ExternalMusicInfo */
public final class ExternalMusicInfo implements Serializable {
    @AbstractC27891c(mo46611a = "external_app_link")
    public String externalAppLink;
    @AbstractC27891c(mo46611a = "external_deep_link")
    public String externalDeepLink;
    @AbstractC27891c(mo46611a = "external_label")
    public String externalLabel;
    @AbstractC27891c(mo46611a = "external_schema")
    public String externalSchema;
    @AbstractC27891c(mo46611a = "external_song_key")
    public String externalSongKey;
    @AbstractC27891c(mo46611a = "h5_url")
    public String jumpUrl;
    @AbstractC27891c(mo46611a = "partner_name")
    public String partnerName;
    @AbstractC27891c(mo46611a = "partner_song_id")
    public String partnerSongId;

    static {
        Covode.recordClassIndex(71395);
    }

    public final String getExternalAppLink() {
        return this.externalAppLink;
    }

    public final String getExternalDeepLink() {
        return this.externalDeepLink;
    }

    public final String getExternalLabel() {
        return this.externalLabel;
    }

    public final String getExternalSchema() {
        return this.externalSchema;
    }

    public final String getExternalSongKey() {
        return this.externalSongKey;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerSongId() {
        return this.partnerSongId;
    }

    public final void setExternalAppLink(String str) {
        this.externalAppLink = str;
    }

    public final void setExternalDeepLink(String str) {
        this.externalDeepLink = str;
    }

    public final void setExternalLabel(String str) {
        this.externalLabel = str;
    }

    public final void setExternalSchema(String str) {
        this.externalSchema = str;
    }

    public final void setExternalSongKey(String str) {
        this.externalSongKey = str;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public final void setPartnerName(String str) {
        this.partnerName = str;
    }

    public final void setPartnerSongId(String str) {
        this.partnerSongId = str;
    }
}
