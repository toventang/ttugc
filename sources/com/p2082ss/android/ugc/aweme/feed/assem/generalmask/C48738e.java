package com.p2082ss.android.ugc.aweme.feed.assem.generalmask;

import com.bytedance.assem.arch.extensions.C12784g;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.e */
public final class C48738e implements AbstractC12853j {

    /* renamed from: a */
    public final C12784g f112602a;

    /* renamed from: b */
    public final VideoMaskInfo f112603b;

    static {
        Covode.recordClassIndex(57519);
    }

    /* renamed from: a */
    public static C48738e m92040a(C12784g gVar, VideoMaskInfo videoMaskInfo) {
        C89219l.m154721d(gVar, "");
        return new C48738e(gVar, videoMaskInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48738e)) {
            return false;
        }
        C48738e eVar = (C48738e) obj;
        return C89219l.m154714a(this.f112602a, eVar.f112602a) && C89219l.m154714a(this.f112603b, eVar.f112603b);
    }

    public final int hashCode() {
        C12784g gVar = this.f112602a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        VideoMaskInfo videoMaskInfo = this.f112603b;
        if (videoMaskInfo != null) {
            i = videoMaskInfo.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "GeneralVideoMaskState(showGeneralMask=" + this.f112602a + ", generalMaskInfo=" + this.f112603b + ")";
    }

    public /* synthetic */ C48738e() {
        this(new C12784g(false), null);
    }

    private C48738e(C12784g gVar, VideoMaskInfo videoMaskInfo) {
        C89219l.m154721d(gVar, "");
        this.f112602a = gVar;
        this.f112603b = videoMaskInfo;
    }
}
