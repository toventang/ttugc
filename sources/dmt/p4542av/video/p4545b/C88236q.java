package dmt.p4542av.video.p4545b;

import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.VEPreviewMusicParams;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.q */
public final class C88236q extends C88227l {

    /* renamed from: I */
    private boolean f200260I = true;

    static {
        Covode.recordClassIndex(104271);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88236q(dmt.p4542av.video.p4545b.C88238s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.p2082ss.android.ugc.aweme.p2719cv.C40780g.m82247d()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r2.<init>(r3, r0)
            r0 = 1
            r2.f200260I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4545b.C88236q.<init>(dmt.av.video.b.s):void");
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final boolean mo142733a(VEPreviewMusicParams vEPreviewMusicParams) {
        C89219l.m154721d(vEPreviewMusicParams, "");
        if (!vEPreviewMusicParams.f200089i || !this.f200260I) {
            return false;
        }
        this.f200260I = false;
        return super.mo142733a(vEPreviewMusicParams);
    }
}
