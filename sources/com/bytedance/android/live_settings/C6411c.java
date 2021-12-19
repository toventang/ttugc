package com.bytedance.android.live_settings;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live_settings.c */
public final class C6411c {
    @AbstractC27891c(mo46611a = "className")

    /* renamed from: a */
    public final String f15981a;
    @AbstractC27891c(mo46611a = "businessScope")

    /* renamed from: b */
    public final ScopeValue f15982b;
    @AbstractC27891c(mo46611a = "fieldTypeName")

    /* renamed from: c */
    public final String f15983c;
    @AbstractC27891c(mo46611a = "settingsKey")

    /* renamed from: d */
    public final String f15984d;
    @AbstractC27891c(mo46611a = "defaultValue")

    /* renamed from: e */
    public final AbstractC28019l f15985e;
    @AbstractC27891c(mo46611a = "introduction")

    /* renamed from: f */
    public final String f15986f;
    @AbstractC27891c(mo46611a = "owner")

    /* renamed from: g */
    public final String f15987g;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: h */
    public final String f15988h;
    @AbstractC27891c(mo46611a = "groups")

    /* renamed from: i */
    public final List<C6410b> f15989i;

    static {
        Covode.recordClassIndex(7143);
    }

    public final String toString() {
        return "LiveSettingModel(className=" + this.f15981a + ", businessScope=" + this.f15982b + ", fieldTypeName=" + this.f15983c + ", settingsKey=" + this.f15984d + ", defaultValue=" + this.f15985e + ", introduction=" + this.f15986f + ", owner=" + this.f15987g + ", title=" + this.f15988h + ", groups=" + this.f15989i + ")";
    }

    public final int hashCode() {
        return this.f15984d.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C89219l.m154714a(getClass(), obj.getClass()))) {
            return false;
        }
        return C89219l.m154714a((Object) this.f15984d, (Object) ((C6411c) obj).f15984d);
    }

    public C6411c(String str, ScopeValue scopeValue, String str2, String str3, AbstractC28019l lVar, String str4, String str5, String str6, List<C6410b> list) {
        C89219l.m154719c(scopeValue, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(str5, "");
        C89219l.m154719c(list, "");
        this.f15981a = str;
        this.f15982b = scopeValue;
        this.f15983c = str2;
        this.f15984d = str3;
        this.f15985e = lVar;
        this.f15986f = str4;
        this.f15987g = str5;
        this.f15988h = str6;
        this.f15989i = list;
    }
}
