package com.p2082ss.android.ugc.aweme.feed.assem.corss.language;

import com.bytedance.assem.arch.extensions.C12784g;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.l */
public final class C48583l implements AbstractC12853j {

    /* renamed from: a */
    public final boolean f112358a;

    /* renamed from: b */
    public final C12784g f112359b;

    static {
        Covode.recordClassIndex(57360);
    }

    /* renamed from: a */
    public static /* synthetic */ C48583l m91942a(C48583l lVar, boolean z, C12784g gVar, int i) {
        if ((i & 1) != 0) {
            z = lVar.f112358a;
        }
        if ((i & 2) != 0) {
            gVar = lVar.f112359b;
        }
        return m91943a(z, gVar);
    }

    /* renamed from: a */
    private static C48583l m91943a(boolean z, C12784g gVar) {
        C89219l.m154721d(gVar, "");
        return new C48583l(z, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48583l)) {
            return false;
        }
        C48583l lVar = (C48583l) obj;
        return this.f112358a == lVar.f112358a && C89219l.m154714a(this.f112359b, lVar.f112359b);
    }

    public final int hashCode() {
        boolean z = this.f112358a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        C12784g gVar = this.f112359b;
        return i4 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoCrossLanguageState(showCaptions=" + this.f112358a + ", updateCaptionUI=" + this.f112359b + ")";
    }

    public /* synthetic */ C48583l() {
        this(false, new C12784g(false));
    }

    private C48583l(boolean z, C12784g gVar) {
        C89219l.m154721d(gVar, "");
        this.f112358a = z;
        this.f112359b = gVar;
    }
}
