package com.p2082ss.android.ugc.aweme.shortvideo.p3892x;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74305a;
import com.p2082ss.android.ugc.tools.C84401c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.x.b */
public final /* synthetic */ class C74309b implements AbstractC89172b {

    /* renamed from: a */
    private final C74305a.C74306a f167104a;

    /* renamed from: b */
    private final AbstractC74318j f167105b;

    static {
        Covode.recordClassIndex(87081);
    }

    C74309b(C74305a.C74306a aVar, AbstractC74318j jVar) {
        this.f167104a = aVar;
        this.f167105b = jVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C74305a.C74306a aVar = this.f167104a;
        AbstractC74318j jVar = this.f167105b;
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        C84401c.f188722f.mo123662d("CameraVideoRecorder executeAsync concatasync result " + recorderConcatResult.f74533a);
        new Handler(Looper.getMainLooper()).post(new RunnableC74313f(aVar, jVar, recorderConcatResult));
        return C89391z.f203057a;
    }
}
