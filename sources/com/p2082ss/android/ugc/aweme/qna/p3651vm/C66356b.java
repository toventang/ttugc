package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.b */
public final class C66356b {

    /* renamed from: a */
    public final String f149222a;

    /* renamed from: b */
    public final boolean f149223b;

    /* renamed from: c */
    public final String f149224c;

    /* renamed from: d */
    public final String f149225d;

    /* renamed from: e */
    public final boolean f149226e;

    static {
        Covode.recordClassIndex(77874);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66356b)) {
            return false;
        }
        C66356b bVar = (C66356b) obj;
        return C89219l.m154714a(this.f149222a, bVar.f149222a) && this.f149223b == bVar.f149223b && C89219l.m154714a(this.f149224c, bVar.f149224c) && C89219l.m154714a(this.f149225d, bVar.f149225d) && this.f149226e == bVar.f149226e;
    }

    public final int hashCode() {
        String str = this.f149222a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f149223b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str2 = this.f149224c;
        int hashCode2 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f149225d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i7 = (hashCode2 + i) * 31;
        if (!this.f149226e) {
            i2 = 0;
        }
        return i7 + i2;
    }

    public final String toString() {
        return "NavigateDialogUiModel(questionId=" + this.f149222a + ", isTranslated=" + this.f149223b + ", questionLanguage=" + this.f149224c + ", questionType=" + this.f149225d + ", showTranslationButton=" + this.f149226e + ")";
    }

    public /* synthetic */ C66356b(String str, boolean z, String str2, boolean z2) {
        this(str, z, str2, null, z2);
    }

    public C66356b(String str, boolean z, String str2, String str3, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f149222a = str;
        this.f149223b = z;
        this.f149224c = str2;
        this.f149225d = str3;
        this.f149226e = z2;
    }
}
