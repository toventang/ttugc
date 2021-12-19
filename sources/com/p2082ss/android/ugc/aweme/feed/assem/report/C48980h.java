package com.p2082ss.android.ugc.aweme.feed.assem.report;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.report.h */
public final class C48980h implements AbstractC12853j {

    /* renamed from: a */
    public final boolean f112881a;

    /* renamed from: b */
    public final VideoMaskInfo f112882b;

    static {
        Covode.recordClassIndex(57769);
    }

    /* renamed from: a */
    public static C48980h m92147a(boolean z, VideoMaskInfo videoMaskInfo) {
        return new C48980h(z, videoMaskInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48980h)) {
            return false;
        }
        C48980h hVar = (C48980h) obj;
        return this.f112881a == hVar.f112881a && C89219l.m154714a(this.f112882b, hVar.f112882b);
    }

    public final int hashCode() {
        boolean z = this.f112881a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        VideoMaskInfo videoMaskInfo = this.f112882b;
        return i4 + (videoMaskInfo != null ? videoMaskInfo.hashCode() : 0);
    }

    public final String toString() {
        return "ReportVideoState(showReport=" + this.f112881a + ", maskInfo=" + this.f112882b + ")";
    }

    public /* synthetic */ C48980h() {
        this(false, null);
    }

    private C48980h(boolean z, VideoMaskInfo videoMaskInfo) {
        this.f112881a = z;
        this.f112882b = videoMaskInfo;
    }
}
