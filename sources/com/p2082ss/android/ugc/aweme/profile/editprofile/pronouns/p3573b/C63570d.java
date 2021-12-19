package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.d */
public final class C63570d implements AbstractC12779c {

    /* renamed from: a */
    public final String f144253a;

    /* renamed from: b */
    public final String f144254b;

    static {
        Covode.recordClassIndex(74886);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63570d)) {
            return false;
        }
        C63570d dVar = (C63570d) obj;
        return C89219l.m154714a(this.f144253a, dVar.f144253a) && C89219l.m154714a(this.f144254b, dVar.f144254b);
    }

    public final int hashCode() {
        String str = this.f144253a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f144254b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProfileEditPronounsInitData(contentName=" + this.f144253a + ", contentValue=" + this.f144254b + ")";
    }

    private /* synthetic */ C63570d() {
        this("", "");
    }

    public C63570d(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f144253a = str;
        this.f144254b = str2;
    }
}
