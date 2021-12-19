package com.p2082ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.p2082ss.android.ugc.aweme.discover.model.HTCMissionModule;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.c */
public class C75441c implements Serializable {
    @AbstractC27891c(mo46611a = "ad_owner_id")
    public String adOwnerId;
    @AbstractC27891c(mo46611a = "ad_owner_name")
    public String adOwnerName;
    @AbstractC27891c(mo46611a = "challenge_id")
    public String challengeId;
    @AbstractC27891c(mo46611a = "unlock_info")
    public C75442d commerceStickerUnlockInfo;
    @AbstractC27891c(mo46611a = "detail_desc")
    public String detailDesc;
    @AbstractC27891c(mo46611a = "detail_letters")
    public String detailLetters;
    @AbstractC27891c(mo46611a = "detail_open_url")
    public String detailOpenUrl;
    @AbstractC27891c(mo46611a = "detail_web_url")
    public String detailWebUrl;
    @AbstractC27891c(mo46611a = "detail_web_url_title")
    public String detailWebUrlTitle;
    @AbstractC27891c(mo46611a = "disclaimer")
    public ChallengeDisclaimer disclaimer;
    @AbstractC27891c(mo46611a = "expire_time")
    public long expireTime;
    @AbstractC27891c(mo46611a = "mission_module")
    public HTCMissionModule htcMissionModule;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public String f169533id;
    @AbstractC27891c(mo46611a = "music_id")
    public String musicId;
    @AbstractC27891c(mo46611a = "screen_desc")
    public String screenDesc;
    @AbstractC27891c(mo46611a = "screen_icon")
    public UrlModel screenIcon;
    @AbstractC27891c(mo46611a = "sec_ad_owner_id")
    public String secAdOwnerId;

    static {
        Covode.recordClassIndex(88362);
    }

    public String getAdOwnerId() {
        return this.adOwnerId;
    }

    public String getAdOwnerName() {
        return this.adOwnerName;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public C75442d getCommerceStickerUnlockInfo() {
        return this.commerceStickerUnlockInfo;
    }

    public String getDetailDesc() {
        return this.detailDesc;
    }

    public String getDetailLetters() {
        return this.detailLetters;
    }

    public String getDetailOpenUrl() {
        return this.detailOpenUrl;
    }

    public String getDetailWebUrl() {
        return this.detailWebUrl;
    }

    public String getDetailWebUrlTitle() {
        return this.detailWebUrlTitle;
    }

    public ChallengeDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public HTCMissionModule getHtcMissionModule() {
        return this.htcMissionModule;
    }

    public String getId() {
        return this.f169533id;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getScreenDesc() {
        return this.screenDesc;
    }

    public UrlModel getScreenIcon() {
        return this.screenIcon;
    }

    public String getSecAdOwnerId() {
        return this.secAdOwnerId;
    }

    public void setAdOwnerId(String str) {
        this.adOwnerId = str;
    }

    public void setAdOwnerName(String str) {
        this.adOwnerName = str;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCommerceStickerUnlockInfo(C75442d dVar) {
        this.commerceStickerUnlockInfo = dVar;
    }

    public void setDetailDesc(String str) {
        this.detailDesc = str;
    }

    public void setDetailLetters(String str) {
        this.detailLetters = str;
    }

    public void setDetailOpenUrl(String str) {
        this.detailOpenUrl = str;
    }

    public void setDetailWebUrl(String str) {
        this.detailWebUrl = str;
    }

    public void setDetailWebUrlTitle(String str) {
        this.detailWebUrlTitle = str;
    }

    public void setDisclaimer(ChallengeDisclaimer challengeDisclaimer) {
        this.disclaimer = challengeDisclaimer;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setId(String str) {
        this.f169533id = str;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setScreenDesc(String str) {
        this.screenDesc = str;
    }

    public void setScreenIcon(UrlModel urlModel) {
        this.screenIcon = urlModel;
    }

    public void setSecAdOwnerId(String str) {
        this.secAdOwnerId = str;
    }
}
