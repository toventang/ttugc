package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.HashtagStruct */
public class HashtagStruct implements Serializable {
    @AbstractC27891c(mo46611a = "hashtag_id")
    public String hashtagId = "";
    @AbstractC27891c(mo46611a = "hashtag_name")
    public String hashtagName = "";
    @AbstractC27891c(mo46611a = "status")
    public int status;
    @AbstractC27891c(mo46611a = "sticker_id")
    public String stickerId = "";

    static {
        Covode.recordClassIndex(88213);
    }

    public String getHashtagId() {
        return this.hashtagId;
    }

    public String getHashtagName() {
        return this.hashtagName;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public HashtagStruct() {
    }

    public void setHashtagId(String str) {
        this.hashtagId = str;
    }

    public void setHashtagName(String str) {
        this.hashtagName = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public HashtagStruct(String str, String str2) {
        this.hashtagId = str;
        this.hashtagName = str2;
    }
}
