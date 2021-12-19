package com.p2082ss.android.ugc.aweme.shortvideo.p3892x;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74305a;
import com.p2082ss.android.ugc.tools.C84401c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.x.c */
public final /* synthetic */ class C74310c implements AbstractC89172b {

    /* renamed from: a */
    private final C74305a.C74306a f167106a;

    /* renamed from: b */
    private final AbstractC74318j f167107b;

    static {
        Covode.recordClassIndex(87082);
    }

    C74310c(C74305a.C74306a aVar, AbstractC74318j jVar) {
        this.f167106a = aVar;
        this.f167107b = jVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C74305a.C74306a aVar = this.f167106a;
        AbstractC74318j jVar = this.f167107b;
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        C84401c.f188722f.mo123662d("CameraVideoRecorder concatWithReleaseGPUResource concatAsync result " + recorderConcatResult.f74533a);
        aVar.mo116917a(jVar, recorderConcatResult.f74534b, recorderConcatResult.f74535c, recorderConcatResult.f74533a);
        return C89391z.f203057a;
    }
}
