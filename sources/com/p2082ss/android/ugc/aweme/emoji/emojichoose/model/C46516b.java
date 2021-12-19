package com.p2082ss.android.ugc.aweme.emoji.emojichoose.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.model.b */
public class C46516b implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private long f108442a;
    @AbstractC27891c(mo46611a = "display_name")

    /* renamed from: b */
    private String f108443b;
    @AbstractC27891c(mo46611a = "icon_url")

    /* renamed from: c */
    private String f108444c;
    @AbstractC27891c(mo46611a = "version")

    /* renamed from: d */
    private String f108445d;
    @AbstractC27891c(mo46611a = "resource_url")

    /* renamed from: e */
    private String f108446e;

    /* renamed from: f */
    private int f108447f;

    /* renamed from: g */
    private String f108448g;

    static {
        Covode.recordClassIndex(55103);
    }

    public String getDisplayName() {
        return this.f108443b;
    }

    public String getIconUrl() {
        return this.f108444c;
    }

    public long getId() {
        return this.f108442a;
    }

    public int getOptional() {
        return this.f108447f;
    }

    public String getResourceUrl() {
        return this.f108446e;
    }

    public String getType() {
        return this.f108448g;
    }

    public String getVersion() {
        return this.f108445d;
    }

    public int hashCode() {
        return String.valueOf(this.f108442a).hashCode();
    }

    public void setDisplayName(String str) {
        this.f108443b = str;
    }

    public void setIconUrl(String str) {
        this.f108444c = str;
    }

    public void setId(long j) {
        this.f108442a = j;
    }

    public void setOptional(int i) {
        this.f108447f = i;
    }

    public void setResourceUrl(String str) {
        this.f108446e = str;
    }

    public void setType(String str) {
        this.f108448g = str;
    }

    public void setVersion(String str) {
        this.f108445d = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C46516b) && this.f108442a == ((C46516b) obj).getId()) {
            return true;
        }
        return false;
    }
}
