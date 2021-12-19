package com.p2082ss.android.ugc.aweme.feed.assem.review;

import android.view.View;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.review.a */
public final class C48988a implements AbstractC12853j {

    /* renamed from: h */
    public static final C48989a f112892h = new C48989a((byte) 0);

    /* renamed from: a */
    public final int f112893a;

    /* renamed from: b */
    public final int f112894b;

    /* renamed from: c */
    public final int f112895c;

    /* renamed from: d */
    public final String f112896d;

    /* renamed from: e */
    public final String f112897e;

    /* renamed from: f */
    public final AbstractC89172b<String, C89391z> f112898f;

    /* renamed from: g */
    public final AbstractC89183m<View, String, C89391z> f112899g;

    static {
        Covode.recordClassIndex(57778);
    }

    /* renamed from: a */
    public static C48988a m92155a(int i, int i2, int i3, String str, String str2, AbstractC89172b<? super String, C89391z> bVar, AbstractC89183m<? super View, ? super String, C89391z> mVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new C48988a(i, i2, i3, str, str2, bVar, mVar);
    }

    /* renamed from: a */
    public static /* synthetic */ C48988a m92156a(C48988a aVar, int i, int i2, int i3, String str, String str2, AbstractC89172b bVar, AbstractC89183m mVar, int i4) {
        AbstractC89183m mVar2 = mVar;
        AbstractC89172b bVar2 = bVar;
        String str3 = str2;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        String str4 = str;
        if ((i4 & 1) != 0) {
            i5 = aVar.f112893a;
        }
        if ((i4 & 2) != 0) {
            i6 = aVar.f112894b;
        }
        if ((i4 & 4) != 0) {
            i7 = aVar.f112895c;
        }
        if ((i4 & 8) != 0) {
            str4 = aVar.f112896d;
        }
        if ((i4 & 16) != 0) {
            str3 = aVar.f112897e;
        }
        if ((i4 & 32) != 0) {
            bVar2 = aVar.f112898f;
        }
        if ((i4 & 64) != 0) {
            mVar2 = aVar.f112899g;
        }
        return m92155a(i5, i6, i7, str4, str3, bVar2, mVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48988a)) {
            return false;
        }
        C48988a aVar = (C48988a) obj;
        return this.f112893a == aVar.f112893a && this.f112894b == aVar.f112894b && this.f112895c == aVar.f112895c && C89219l.m154714a(this.f112896d, aVar.f112896d) && C89219l.m154714a(this.f112897e, aVar.f112897e) && C89219l.m154714a(this.f112898f, aVar.f112898f) && C89219l.m154714a(this.f112899g, aVar.f112899g);
    }

    public final int hashCode() {
        int i = ((((this.f112893a * 31) + this.f112894b) * 31) + this.f112895c) * 31;
        String str = this.f112896d;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f112897e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AbstractC89172b<String, C89391z> bVar = this.f112898f;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        AbstractC89183m<View, String, C89391z> mVar = this.f112899g;
        if (mVar != null) {
            i2 = mVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "VideoReviewState(type=" + this.f112893a + ", bgColorRes=" + this.f112894b + ", iconRes=" + this.f112895c + ", title=" + this.f112896d + ", url=" + this.f112897e + ", showAction=" + this.f112898f + ", clickAction=" + this.f112899g + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.a$a */
    public static final class C48989a {
        static {
            Covode.recordClassIndex(57779);
        }

        private C48989a() {
        }

        public /* synthetic */ C48989a(byte b) {
            this();
        }
    }

    public /* synthetic */ C48988a() {
        this(0, -1, -1, "", "", null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.m<? super android.view.View, ? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private C48988a(int i, int i2, int i3, String str, String str2, AbstractC89172b<? super String, C89391z> bVar, AbstractC89183m<? super View, ? super String, C89391z> mVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f112893a = i;
        this.f112894b = i2;
        this.f112895c = i3;
        this.f112896d = str;
        this.f112897e = str2;
        this.f112898f = bVar;
        this.f112899g = mVar;
    }
}
