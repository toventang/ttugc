package com.p2082ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.d */
public final class C70089d {

    /* renamed from: a */
    public long f156747a;

    /* renamed from: b */
    public long f156748b;

    /* renamed from: c */
    public int f156749c;

    /* renamed from: d */
    public float f156750d = 1.0f;

    static {
        Covode.recordClassIndex(82512);
    }

    /* renamed from: a */
    public final void mo110593a() {
        this.f156747a = 0;
        this.f156748b = 0;
        this.f156749c = 0;
        this.f156750d = 1.0f;
    }

    public C70089d(VideoSegment videoSegment) {
        this.f156747a = videoSegment.mo110578d();
        this.f156748b = videoSegment.mo110580e();
        this.f156749c = videoSegment.f156718j;
        this.f156750d = videoSegment.mo110582f();
        if (videoSegment.mo110583g()) {
            this.f156747a = videoSegment.f156722n.getVideoStart();
            this.f156748b = videoSegment.f156722n.getVideoEnd();
        }
    }

    /* renamed from: a */
    public final void mo110594a(VideoSegment videoSegment) {
        this.f156747a = videoSegment.mo110578d();
        this.f156748b = videoSegment.mo110580e();
        this.f156749c = videoSegment.f156718j;
        this.f156750d = videoSegment.mo110582f();
        if (videoSegment.mo110583g()) {
            this.f156747a = videoSegment.f156722n.getVideoStart();
            this.f156748b = videoSegment.f156722n.getVideoEnd();
        }
    }
}
