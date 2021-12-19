package com.bytedance.android.livesdkapi.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.model.e */
public final class C11839e {

    /* renamed from: a */
    public final Long f28221a;

    /* renamed from: b */
    public final String f28222b;

    /* renamed from: c */
    public final String f28223c;

    /* renamed from: d */
    public final String f28224d;

    /* renamed from: e */
    public final ImageModel f28225e;

    static {
        Covode.recordClassIndex(13541);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11839e)) {
            return false;
        }
        C11839e eVar = (C11839e) obj;
        return C89219l.m154714a(this.f28221a, eVar.f28221a) && C89219l.m154714a(this.f28222b, eVar.f28222b) && C89219l.m154714a(this.f28223c, eVar.f28223c) && C89219l.m154714a(this.f28224d, eVar.f28224d) && C89219l.m154714a(this.f28225e, eVar.f28225e);
    }

    public final int hashCode() {
        Long l = this.f28221a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.f28222b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28223c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f28224d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ImageModel imageModel = this.f28225e;
        if (imageModel != null) {
            i = imageModel.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "LiveIMUser(uid=" + this.f28221a + ", secUid=" + this.f28222b + ", nickName=" + this.f28223c + ", displayId=" + this.f28224d + ", avatar=" + this.f28225e + ")";
    }

    private /* synthetic */ C11839e() {
        this(null, null, null, null, null);
    }

    public C11839e(Long l, String str, String str2, String str3, ImageModel imageModel) {
        this.f28221a = l;
        this.f28222b = str;
        this.f28223c = str2;
        this.f28224d = str3;
        this.f28225e = imageModel;
    }
}
