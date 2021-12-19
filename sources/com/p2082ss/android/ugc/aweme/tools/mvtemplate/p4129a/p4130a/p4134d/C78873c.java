package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4134d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46423n;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78899d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78851a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4135e.C78881a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.c */
public final class C78873c extends AbstractC78851a {
    static {
        Covode.recordClassIndex(92022);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.c$b */
    static final class CallableC78875b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Effect f177268a;

        static {
            Covode.recordClassIndex(92024);
        }

        CallableC78875b(Effect effect) {
            this.f177268a = effect;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                C80720e.m139925b(new File(this.f177268a.getUnzipPath()));
                return null;
            } catch (Exception unused) {
                C73991bj.m130128a("MVRes: Invalid Res Delete Failed :" + this.f177268a.getUnzipPath());
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78873c(C78859b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.c$a */
    public static final class C78874a implements IEffectDownloadProgressListener {

        /* renamed from: a */
        final /* synthetic */ C78873c f177266a;

        /* renamed from: b */
        final /* synthetic */ MvThemeData f177267b;

        static {
            Covode.recordClassIndex(92023);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i, long j) {
            C89219l.m154721d(effect, "");
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            C89219l.m154721d(effect, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            C89219l.m154721d(effect2, "");
            if (!C78881a.m137681a(effect2)) {
                C1731i.m5640b(new CallableC78875b(effect2), C1731i.f5562a);
                long a = this.f177266a.f177239b.mo122711a("download mv effect", "failed.");
                C78899d dVar = this.f177266a.f177240c.f177249f;
                if (dVar != null) {
                    dVar.f177320c = (int) a;
                }
                C78899d dVar2 = this.f177266a.f177240c.f177249f;
                if (dVar2 != null) {
                    dVar2.f177329l = "mv list is null";
                }
                C78899d dVar3 = this.f177266a.f177240c.f177249f;
                if (dVar3 != null) {
                    dVar3.f177328k = 3;
                }
                AbstractC78853c cVar = this.f177266a.f177240c.f177251h;
                if (cVar != null) {
                    cVar.mo122696a();
                    return;
                }
                return;
            }
            long a2 = this.f177266a.f177239b.mo122711a("download mv effect", "success");
            C78899d dVar4 = this.f177266a.f177240c.f177249f;
            if (dVar4 != null) {
                dVar4.f177320c = (int) a2;
            }
            AbstractC78853c cVar2 = this.f177266a.f177240c.f177251h;
            if (cVar2 != null) {
                cVar2.mo122697a(this.f177267b);
            }
        }

        C78874a(C78873c cVar, MvThemeData mvThemeData) {
            this.f177266a = cVar;
            this.f177267b = mvThemeData;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            long a = this.f177266a.f177239b.mo122711a("download mv effect", "failed.");
            C78899d dVar = this.f177266a.f177240c.f177249f;
            if (dVar != null) {
                dVar.f177320c = (int) a;
            }
            C78899d dVar2 = this.f177266a.f177240c.f177249f;
            if (dVar2 != null) {
                dVar2.f177329l = exceptionResult.getMsg();
            }
            C78899d dVar3 = this.f177266a.f177240c.f177249f;
            if (dVar3 != null) {
                dVar3.f177328k = 3;
            }
            AbstractC78853c cVar = this.f177266a.f177240c.f177251h;
            if (cVar != null) {
                cVar.mo122696a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e
    /* renamed from: a */
    public final void mo122701a(Object obj) {
        this.f177239b.f177276a = System.currentTimeMillis();
        C78899d dVar = this.f177240c.f177249f;
        if (dVar != null) {
            dVar.f177318a = 2;
        }
        if (obj instanceof MvThemeData) {
            MvThemeData mvThemeData = (MvThemeData) obj;
            Effect effect = mvThemeData.f177184a;
            C89219l.m154716b(effect, "");
            if (C78881a.m137681a(effect)) {
                long a = this.f177239b.mo122711a("download mv effect", "success by cache.");
                C78899d dVar2 = this.f177240c.f177249f;
                if (dVar2 != null) {
                    dVar2.f177320c = (int) a;
                }
                AbstractC78853c cVar = this.f177240c.f177251h;
                if (cVar != null) {
                    cVar.mo122697a(mvThemeData);
                    return;
                }
                return;
            }
            AbstractC46415f fVar = this.f177240c.f177255l;
            if (fVar != null) {
                fVar.mo78887a(mvThemeData.f177184a, C46423n.C46424a.m89590a("mv", new C78874a(this, mvThemeData)));
                return;
            }
            return;
        }
        long a2 = this.f177239b.mo122711a("download mv effect", "failed.");
        C78899d dVar3 = this.f177240c.f177249f;
        if (dVar3 != null) {
            dVar3.f177320c = (int) a2;
        }
        C78899d dVar4 = this.f177240c.f177249f;
        if (dVar4 != null) {
            dVar4.f177329l = "mv list pass error";
        }
        C78899d dVar5 = this.f177240c.f177249f;
        if (dVar5 != null) {
            dVar5.f177328k = 3;
        }
        AbstractC78853c cVar2 = this.f177240c.f177251h;
        if (cVar2 != null) {
            cVar2.mo122696a();
        }
    }
}
