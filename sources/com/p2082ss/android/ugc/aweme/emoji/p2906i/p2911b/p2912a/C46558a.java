package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.b.a.a */
public final class C46558a implements Serializable {
    @AbstractC27891c(mo46611a = "uri")

    /* renamed from: a */
    private String f108545a = "";
    @AbstractC27891c(mo46611a = "display_name")

    /* renamed from: b */
    private String f108546b = "";
    @AbstractC27891c(mo46611a = "display_name_lang")

    /* renamed from: c */
    private HashMap<String, String> f108547c;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: d */
    private int f108548d;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: e */
    private int f108549e;
    @AbstractC27891c(mo46611a = "hide")

    /* renamed from: f */
    private int f108550f;

    static {
        Covode.recordClassIndex(55145);
    }

    public final String getDisplayName() {
        return this.f108546b;
    }

    public final HashMap<String, String> getDisplayNameLang() {
        return this.f108547c;
    }

    public final int getHeight() {
        return this.f108549e;
    }

    public final int getHide() {
        return this.f108550f;
    }

    public final String getUri() {
        return this.f108545a;
    }

    public final int getWidth() {
        return this.f108548d;
    }

    public final boolean showInPanel() {
        if (this.f108550f != 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "OnlineSmallEmoji={uri=" + this.f108545a + ", displayName=" + this.f108546b + ", displayNameLang=" + this.f108546b + ", hide=" + this.f108550f + '}';
    }

    public final void setDisplayNameLang(HashMap<String, String> hashMap) {
        this.f108547c = hashMap;
    }

    public final void setHeight(int i) {
        this.f108549e = i;
    }

    public final void setHide(int i) {
        this.f108550f = i;
    }

    public final void setWidth(int i) {
        this.f108548d = i;
    }

    public final void setDisplayName(String str) {
        C89219l.m154721d(str, "");
        this.f108546b = str;
    }

    public final void setUri(String str) {
        C89219l.m154721d(str, "");
        this.f108545a = str;
    }
}
