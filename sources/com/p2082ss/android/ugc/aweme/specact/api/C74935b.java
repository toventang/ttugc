package com.p2082ss.android.ugc.aweme.specact.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.api.b */
public final class C74935b {
    @AbstractC27891c(mo46611a = "activity_id")

    /* renamed from: a */
    public final String f168461a;
    @AbstractC27891c(mo46611a = "background_image_url")

    /* renamed from: b */
    public final String f168462b;
    @AbstractC27891c(mo46611a = "title_image_url")

    /* renamed from: c */
    public final String f168463c;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: d */
    public final String f168464d;

    static {
        Covode.recordClassIndex(87803);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74935b)) {
            return false;
        }
        C74935b bVar = (C74935b) obj;
        return C89219l.m154714a(this.f168461a, bVar.f168461a) && C89219l.m154714a(this.f168462b, bVar.f168462b) && C89219l.m154714a(this.f168463c, bVar.f168463c) && C89219l.m154714a(this.f168464d, bVar.f168464d);
    }

    public final int hashCode() {
        String str = this.f168461a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f168462b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f168463c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f168464d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "MesEntraSetting(activityId=" + this.f168461a + ", bgImgUrl=" + this.f168462b + ", titleImgUrl=" + this.f168463c + ", schemaUrl=" + this.f168464d + ")";
    }
}
