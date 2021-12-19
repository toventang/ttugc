package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3992d;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73754h;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75370g;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75379f;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75462e;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.b */
public final class C75778b implements AbstractC75379f, IEffectDownloadProgressListener {

    /* renamed from: a */
    public long f170220a;

    /* renamed from: b */
    public final Effect f170221b;

    /* renamed from: c */
    public final IEffectDownloadProgressListener f170222c;

    /* renamed from: d */
    private volatile boolean f170223d;

    /* renamed from: e */
    private volatile boolean f170224e;

    /* renamed from: f */
    private volatile int f170225f;

    /* renamed from: g */
    private volatile int f170226g;

    static {
        Covode.recordClassIndex(88712);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.b$a */
    public static final class CallableC75779a<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f170227a;

        static {
            Covode.recordClassIndex(88713);
        }

        CallableC75779a(AbstractC89171a aVar) {
            this.f170227a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            this.f170227a.invoke();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.b$b */
    public static final class C75780b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75778b f170228a;

        static {
            Covode.recordClassIndex(88714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75780b(C75778b bVar) {
            super(0);
            this.f170228a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f170228a.f170222c.onSuccess(this.f170228a.f170221b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.b$c */
    static final class C75781c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75778b f170229a;

        /* renamed from: b */
        final /* synthetic */ Effect f170230b;

        /* renamed from: c */
        final /* synthetic */ ExceptionResult f170231c;

        static {
            Covode.recordClassIndex(88715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75781c(C75778b bVar, Effect effect, ExceptionResult exceptionResult) {
            super(0);
            this.f170229a = bVar;
            this.f170230b = effect;
            this.f170231c = exceptionResult;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f170229a.f170222c.onFail(this.f170230b, this.f170231c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.b$d */
    static final class C75782d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75778b f170232a;

        /* renamed from: b */
        final /* synthetic */ Effect f170233b;

        static {
            Covode.recordClassIndex(88716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75782d(C75778b bVar, Effect effect) {
            super(0);
            this.f170232a = bVar;
            this.f170233b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f170232a.f170222c.onStart(this.f170233b);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75379f
    /* renamed from: a */
    public final void mo118939a() {
        this.f170224e = true;
        C73754h.m129791a(this.f170221b.getEffectId());
        m132941b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.b$e */
    public static final class C75783e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75778b f170234a;

        /* renamed from: b */
        final /* synthetic */ int f170235b;

        static {
            Covode.recordClassIndex(88717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75783e(C75778b bVar, int i) {
            super(0);
            this.f170234a = bVar;
            this.f170235b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f170234a.f170222c.onProgress(this.f170234a.f170221b, this.f170235b, this.f170234a.f170220a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m132941b() {
        if (this.f170223d && this.f170224e) {
            m132940a(new C75780b(this));
        }
    }

    /* renamed from: c */
    private final void m132942c() {
        int i = 100;
        if (!this.f170223d && !this.f170224e) {
            i = (this.f170226g + this.f170225f) / 2;
        } else if (!this.f170224e) {
            i = (this.f170226g + 100) / 2;
        } else if (!this.f170223d) {
            i = (this.f170225f + 100) / 2;
        }
        m132940a(new C75783e(this, i));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75379f
    /* renamed from: a */
    public final void mo118940a(int i) {
        this.f170226g = i;
        m132942c();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        this.f170223d = true;
        m132941b();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        m132940a(new C75782d(this, effect));
    }

    /* renamed from: a */
    private static void m132940a(AbstractC89171a<C89391z> aVar) {
        if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            C1731i.m5636a(new CallableC75779a(aVar), C1731i.f5564c);
        }
    }

    public C75778b(Effect effect, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(iEffectDownloadProgressListener, "");
        this.f170221b = effect;
        this.f170222c = iEffectDownloadProgressListener;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        C89219l.m154721d(exceptionResult, "");
        m132940a(new C75781c(this, effect, exceptionResult));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75379f
    /* renamed from: a */
    public final void mo118941a(AbstractC75370g gVar, String str) {
        C89219l.m154721d(gVar, "");
        this.f170224e = true;
        C73754h.m129792a(this.f170221b.getEffectId(), gVar, str);
        if (str != null) {
            C75462e.m132332a(gVar.getMusicId(), str);
        }
        m132941b();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.f170220a = j;
        this.f170225f = i;
        m132942c();
    }
}
