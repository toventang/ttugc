package com.p2082ss.android.ugc.aweme.shortvideo.p3889w;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a.C72744a;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a.C72747c;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a.C72748d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.d */
public final class C74167d {
    static {
        Covode.recordClassIndex(86926);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.d$b */
    public static final class C74169b implements AbstractC74226l {
        static {
            Covode.recordClassIndex(86928);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74226l
        /* renamed from: a */
        public final boolean mo116639a(ASCameraView aSCameraView) {
            C89219l.m154721d(aSCameraView, "");
            return false;
        }

        C74169b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.d$a */
    public static final class C74168a implements AbstractC74170e {

        /* renamed from: a */
        final /* synthetic */ AbstractC14209z f166568a;

        static {
            Covode.recordClassIndex(86927);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74170e
        /* renamed from: a */
        public final void mo116637a() {
            C72744a am = this.f166568a.mo22940am();
            if (am != null) {
                if (am.f163108e != null) {
                    am.f163108e.cancel();
                }
                am.f163108e = ValueAnimator.ofFloat(0.66f, 1.0f).setDuration(150L);
                am.f163108e.addUpdateListener(new C72748d(am));
                am.f163108e.start();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74170e
        /* renamed from: b */
        public final void mo116638b() {
            C72744a am = this.f166568a.mo22940am();
            if (am != null) {
                if (am.f163108e != null) {
                    am.f163108e.cancel();
                }
                am.f163108e = ValueAnimator.ofFloat(1.0f, 0.66f).setDuration(150L);
                am.f163108e.addUpdateListener(new C72747c(am));
                am.f163108e.start();
            }
        }

        C74168a(AbstractC14209z zVar) {
            this.f166568a = zVar;
        }
    }
}
