package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46423n;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.m */
public final class C78970m {

    /* renamed from: a */
    public AbstractC46415f f177483a;

    static {
        Covode.recordClassIndex(92119);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.m$a */
    public static final class C78971a implements IEffectDownloadProgressListener {

        /* renamed from: a */
        final /* synthetic */ C78970m f177484a;

        /* renamed from: b */
        final /* synthetic */ IEffectDownloadProgressListener f177485b;

        static {
            Covode.recordClassIndex(92120);
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.m$a$a */
        static final class CallableC78972a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ Effect f177486a;

            static {
                Covode.recordClassIndex(92121);
            }

            CallableC78972a(Effect effect) {
                this.f177486a = effect;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    C80720e.m139925b(new File(this.f177486a.getUnzipPath()));
                    return null;
                } catch (Exception unused) {
                    C73991bj.m130128a("MVRes: Invalid Res Delete Failed :" + this.f177486a.getUnzipPath());
                    return null;
                }
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            C89219l.m154721d(effect, "");
            IEffectDownloadProgressListener iEffectDownloadProgressListener = this.f177485b;
            if (iEffectDownloadProgressListener != null) {
                iEffectDownloadProgressListener.onStart(effect);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            C89219l.m154721d(effect2, "");
            if (!C78970m.m137795b(effect2)) {
                C1731i.m5640b(new CallableC78972a(effect2), C1731i.f5562a);
                IEffectDownloadProgressListener iEffectDownloadProgressListener = this.f177485b;
                if (iEffectDownloadProgressListener != null) {
                    iEffectDownloadProgressListener.onFail(effect2, new ExceptionResult(-10002));
                    return;
                }
                return;
            }
            IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.f177485b;
            if (iEffectDownloadProgressListener2 != null) {
                iEffectDownloadProgressListener2.onSuccess(effect2);
            }
        }

        C78971a(C78970m mVar, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
            this.f177484a = mVar;
            this.f177485b = iEffectDownloadProgressListener;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            IEffectDownloadProgressListener iEffectDownloadProgressListener = this.f177485b;
            if (iEffectDownloadProgressListener != null) {
                iEffectDownloadProgressListener.onFail(effect, exceptionResult);
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i, long j) {
            C89219l.m154721d(effect, "");
            IEffectDownloadProgressListener iEffectDownloadProgressListener = this.f177485b;
            if (iEffectDownloadProgressListener != null) {
                iEffectDownloadProgressListener.onProgress(effect, i, j);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo122766a(Effect effect) {
        AbstractC46415f fVar = this.f177483a;
        boolean z = false;
        if (fVar == null || effect == null) {
            return false;
        }
        try {
            z = fVar.mo78916b(effect);
            return z;
        } catch (Exception unused) {
            return z;
        }
    }

    /* renamed from: b */
    public static boolean m137795b(Effect effect) {
        if (!(effect == null || effect.getUnzipPath() == null)) {
            String unzipPath = effect.getUnzipPath();
            if (C80720e.m139927b(unzipPath) && VEUtils.checkMVResourceIntegrity(unzipPath) == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo122765a(Effect effect, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
        if (this.f177483a == null || effect == null) {
            iEffectDownloadProgressListener.onFail(effect, new ExceptionResult(-10001));
        } else if (m137795b(effect)) {
            iEffectDownloadProgressListener.onSuccess(effect);
        } else {
            AbstractC46415f fVar = this.f177483a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            fVar.mo78887a(effect, C46423n.C46424a.m89590a("mv", new C78971a(this, iEffectDownloadProgressListener)));
        }
    }
}
