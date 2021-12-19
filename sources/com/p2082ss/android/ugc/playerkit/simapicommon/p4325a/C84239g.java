package com.p2082ss.android.ugc.playerkit.simapicommon.p4325a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.a.g */
public class C84239g implements Serializable {
    @AbstractC27891c(mo46611a = "url_list")

    /* renamed from: a */
    protected List<String> f188355a;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: b */
    int f188356b;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: c */
    int f188357c;
    @AbstractC27891c(mo46611a = "url_key")

    /* renamed from: d */
    public String f188358d;
    @AbstractC27891c(mo46611a = "data_size")

    /* renamed from: e */
    long f188359e;
    @AbstractC27891c(mo46611a = "file_hash")

    /* renamed from: f */
    String f188360f;
    @AbstractC27891c(mo46611a = "player_access_key")

    /* renamed from: g */
    protected String f188361g;
    @AbstractC27891c(mo46611a = "file_cs")

    /* renamed from: h */
    protected String f188362h;
    public Object origin;
    @AbstractC27891c(mo46611a = "uri")
    public String uri;

    static {
        Covode.recordClassIndex(98148);
    }

    public String getFileCheckSum() {
        return this.f188362h;
    }

    public String getFileHash() {
        return this.f188360f;
    }

    public int getHeight() {
        return this.f188357c;
    }

    public long getSize() {
        return this.f188359e;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUrlKey() {
        return this.f188358d;
    }

    public List<String> getUrlList() {
        return this.f188355a;
    }

    public int getWidth() {
        return this.f188356b;
    }

    public String getaK() {
        return this.f188361g;
    }

    public int hashCode() {
        String str;
        int i;
        if (TextUtils.isEmpty(this.f188358d)) {
            str = this.uri;
        } else {
            str = this.f188358d;
        }
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        List<String> list = this.f188355a;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }

    public void setFileCheckSum(String str) {
        this.f188362h = str;
    }

    public void setFileHash(String str) {
        this.f188360f = str;
    }

    public void setHeight(int i) {
        this.f188357c = i;
    }

    public void setSize(long j) {
        this.f188359e = j;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlKey(String str) {
        this.f188358d = str;
    }

    public void setUrlList(List<String> list) {
        this.f188355a = list;
    }

    public void setWidth(int i) {
        this.f188356b = i;
    }

    public void setaK(String str) {
        this.f188361g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84239g)) {
            return false;
        }
        C84239g gVar = (C84239g) obj;
        String str = this.uri;
        if (str == null ? gVar.uri != null : !str.equals(gVar.uri)) {
            return false;
        }
        String str2 = this.f188358d;
        if (str2 == null ? gVar.f188358d != null : !str2.equals(gVar.f188358d)) {
            return false;
        }
        List<String> list = this.f188355a;
        List<String> list2 = gVar.f188355a;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }
}
