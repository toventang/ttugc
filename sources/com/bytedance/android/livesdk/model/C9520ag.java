package com.bytedance.android.livesdk.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.bytedance.android.livesdk.model.ag */
public final class C9520ag implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private long f23085a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    private String f23086b;
    @AbstractC27891c(mo46611a = "default")

    /* renamed from: c */
    private int f23087c;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: d */
    private String f23088d;
    @AbstractC27891c(mo46611a = "inter_url")

    /* renamed from: e */
    private String f23089e;
    @AbstractC27891c(mo46611a = "style")

    /* renamed from: f */
    private int f23090f;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: g */
    private int f23091g;
    @AbstractC27891c(mo46611a = "event")

    /* renamed from: h */
    private String f23092h;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: i */
    private int f23093i;
    @AbstractC27891c(mo46611a = "req_from")

    /* renamed from: j */
    private String f23094j;
    @AbstractC27891c(mo46611a = "feed_style")

    /* renamed from: k */
    private int f23095k;
    @AbstractC27891c(mo46611a = "enable_dislike")

    /* renamed from: l */
    private int f23096l;
    @AbstractC27891c(mo46611a = "enable_draw_stream")

    /* renamed from: m */
    private int f23097m;

    /* renamed from: n */
    private boolean f23098n;

    static {
        Covode.recordClassIndex(11059);
    }

    public final int getDislike() {
        return this.f23096l;
    }

    public final String getEvent() {
        return this.f23092h;
    }

    public final int getFeedStyle() {
        return this.f23095k;
    }

    public final long getId() {
        return this.f23085a;
    }

    public final String getInnerStreamUrl() {
        return this.f23089e;
    }

    public final String getName() {
        return this.f23086b;
    }

    public final String getReqFrom() {
        return this.f23094j;
    }

    public final int getSource() {
        return this.f23093i;
    }

    public final String getUrl() {
        return this.f23088d;
    }

    public final boolean isChecked() {
        return this.f23098n;
    }

    public final boolean enableDraw() {
        if (this.f23097m == 1) {
            return true;
        }
        return false;
    }

    public final boolean isDefaultItem() {
        if (this.f23087c == 1) {
            return true;
        }
        return false;
    }

    public final boolean isSinleLine() {
        if (this.f23090f == 1) {
            return true;
        }
        return false;
    }

    public final int getShowdefault() {
        int i = this.f23087c;
        if (!(i == 1 || i == 0)) {
            this.f23087c = 0;
        }
        return this.f23087c;
    }

    public final int getStyle() {
        int i = this.f23090f;
        if (i <= 0 || i > 4) {
            this.f23090f = 2;
        }
        return this.f23090f;
    }

    public final int getType() {
        int i = this.f23091g;
        if (!(i == 1 || i == 2)) {
            this.f23091g = 1;
        }
        return this.f23091g;
    }

    public final boolean isFollowItem() {
        if (this.f23091g == 2) {
            return true;
        }
        return false;
    }

    public final String getTypeString() {
        String str = this.f23088d;
        if (str == null) {
            return null;
        }
        return Uri.parse(str).getQueryParameter(StringSet.type);
    }

    public final boolean isItemValid() {
        if (TextUtils.isEmpty(this.f23086b) || TextUtils.isEmpty(this.f23088d)) {
            return false;
        }
        return true;
    }

    public final void setChecked(boolean z) {
        this.f23098n = z;
    }

    public final void setDislike(int i) {
        this.f23096l = i;
    }

    public final void setEvent(String str) {
        this.f23092h = str;
    }

    public final void setFeedStyle(int i) {
        this.f23095k = i;
    }

    public final void setId(long j) {
        this.f23085a = j;
    }

    public final void setName(String str) {
        this.f23086b = str;
    }

    public final void setReqFrom(String str) {
        this.f23094j = str;
    }

    public final void setShowdefault(int i) {
        this.f23087c = i;
    }

    public final void setSource(int i) {
        this.f23093i = i;
    }

    public final void setStyle(int i) {
        this.f23090f = i;
    }

    public final void setType(int i) {
        this.f23091g = i;
    }

    public final void setUrl(String str) {
        this.f23088d = str;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
