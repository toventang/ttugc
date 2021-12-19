package com.p2082ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.c */
public final class C77876c {

    /* renamed from: a */
    public final ComposerBeauty f174728a;

    /* renamed from: b */
    public final String f174729b;

    static {
        Covode.recordClassIndex(90963);
    }

    public final String toString() {
        return "ComposerBeautyDownload(beauty=" + this.f174728a + ", unzipPath=" + this.f174729b + ")";
    }

    public final int hashCode() {
        return this.f174729b.hashCode();
    }

    public /* synthetic */ C77876c(ComposerBeauty composerBeauty) {
        this(composerBeauty, composerBeauty.getEffect().getUnzipPath());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C77876c) {
            return C89219l.m154714a((Object) ((C77876c) obj).f174729b, (Object) this.f174729b);
        }
        return false;
    }

    private C77876c(ComposerBeauty composerBeauty, String str) {
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(str, "");
        this.f174728a = composerBeauty;
        this.f174729b = str;
    }
}
