package com.p2082ss.android.ugc.aweme.emoji.p2904g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.emoji.g.a */
public class C46534a implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private long f108492a;
    @AbstractC27891c(mo46611a = "animate_url")

    /* renamed from: b */
    private UrlModel f108493b;
    @AbstractC27891c(mo46611a = "static_url")

    /* renamed from: c */
    private UrlModel f108494c;
    @AbstractC27891c(mo46611a = "animate_type")

    /* renamed from: d */
    private String f108495d;
    @AbstractC27891c(mo46611a = "static_type")

    /* renamed from: e */
    private String f108496e;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: f */
    private int f108497f;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: g */
    private int f108498g;
    @AbstractC27891c(mo46611a = "display_name")

    /* renamed from: h */
    private String f108499h;
    @AbstractC27891c(mo46611a = "origin_package_id")

    /* renamed from: i */
    private long f108500i;
    @AbstractC27891c(mo46611a = "joker_sticker_id")

    /* renamed from: j */
    private String f108501j;
    @AbstractC27891c(mo46611a = "sticker_type")

    /* renamed from: k */
    private int f108502k;
    @AbstractC27891c(mo46611a = "version")

    /* renamed from: l */
    private String f108503l;
    @AbstractC27891c(mo46611a = "display_name_lang")

    /* renamed from: m */
    private HashMap<String, String> f108504m;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: n */
    private LogPbBean f108505n;
    @AbstractC27891c(mo46611a = "sticker_id")

    /* renamed from: o */
    private String f108506o;

    static {
        Covode.recordClassIndex(55121);
    }

    public String getAnimateType() {
        return this.f108495d;
    }

    public UrlModel getAnimateUrl() {
        return this.f108493b;
    }

    public String getDisplayName() {
        return this.f108499h;
    }

    public HashMap<String, String> getDisplayNameLangs() {
        return this.f108504m;
    }

    public int getHeight() {
        return this.f108498g;
    }

    public long getId() {
        return this.f108492a;
    }

    public String getJokerId() {
        return this.f108501j;
    }

    public LogPbBean getLogPb() {
        return this.f108505n;
    }

    public long getResourcesId() {
        return this.f108500i;
    }

    public String getStaticType() {
        return this.f108496e;
    }

    public UrlModel getStaticUrl() {
        return this.f108494c;
    }

    public String getStickerId() {
        return this.f108506o;
    }

    public int getStickerType() {
        return this.f108502k;
    }

    public String getVersion() {
        return this.f108503l;
    }

    public int getWidth() {
        return this.f108497f;
    }

    public int hashCode() {
        return String.valueOf(this.f108492a).hashCode();
    }

    public void setAnimateType(String str) {
        this.f108495d = str;
    }

    public void setAnimateUrl(UrlModel urlModel) {
        this.f108493b = urlModel;
    }

    public void setDisplayName(String str) {
        this.f108499h = str;
    }

    public void setDisplayNameLangs(HashMap<String, String> hashMap) {
        this.f108504m = hashMap;
    }

    public void setHeight(int i) {
        this.f108498g = i;
    }

    public void setId(long j) {
        this.f108492a = j;
    }

    public void setJokerId(String str) {
        this.f108501j = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.f108505n = logPbBean;
    }

    public void setResourcesId(long j) {
        this.f108500i = j;
    }

    public void setStaticType(String str) {
        this.f108496e = str;
    }

    public void setStaticUrl(UrlModel urlModel) {
        this.f108494c = urlModel;
    }

    public void setStickerId(String str) {
        this.f108506o = str;
    }

    public void setStickerType(int i) {
        this.f108502k = i;
    }

    public void setVersion(String str) {
        this.f108503l = str;
    }

    public void setWidth(int i) {
        this.f108497f = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C46534a)) {
            return false;
        }
        C46534a aVar = (C46534a) obj;
        long j = aVar.f108492a;
        if (j > 0 && j == this.f108492a) {
            return true;
        }
        if (aVar.getAnimateUrl() == null || getAnimateUrl() == null || !TextUtils.equals(aVar.getAnimateUrl().getUri(), this.f108493b.getUri())) {
            return false;
        }
        return true;
    }
}
