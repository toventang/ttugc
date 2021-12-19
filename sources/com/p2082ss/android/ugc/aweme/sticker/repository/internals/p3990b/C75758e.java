package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3990b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73754h;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75370g;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75379f;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75462e;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75690ab;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75691ac;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.b.e */
public final class C75758e implements AbstractC75379f, IEffectDownloadProgressListener {

    /* renamed from: a */
    private volatile boolean f170181a;

    /* renamed from: b */
    private volatile boolean f170182b;

    /* renamed from: c */
    private volatile int f170183c;

    /* renamed from: d */
    private volatile int f170184d;

    /* renamed from: e */
    private long f170185e = System.currentTimeMillis();

    /* renamed from: f */
    private long f170186f;

    /* renamed from: g */
    private final C75691ac f170187g;

    /* renamed from: h */
    private final AbstractC84447f<C75691ac, Effect, C75690ab> f170188h;

    static {
        Covode.recordClassIndex(88692);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75379f
    /* renamed from: a */
    public final void mo118939a() {
        this.f170182b = true;
        C73754h.m129791a(this.f170187g.f170122a.getEffectId());
        m132916b();
    }

    /* renamed from: b */
    private final void m132916b() {
        if (this.f170181a && this.f170182b) {
            long currentTimeMillis = System.currentTimeMillis() - this.f170185e;
            AbstractC84447f<C75691ac, Effect, C75690ab> fVar = this.f170188h;
            C75691ac acVar = this.f170187g;
            fVar.mo119505a(acVar, acVar.f170122a, new C75690ab(this.f170186f, 3), currentTimeMillis);
        }
    }

    /* renamed from: c */
    private final void m132917c() {
        int i = 100;
        if (!this.f170181a && !this.f170182b) {
            i = (this.f170184d + this.f170183c) / 2;
        } else if (!this.f170182b) {
            i = (this.f170184d + 100) / 2;
        } else if (!this.f170181a) {
            i = (this.f170183c + 100) / 2;
        }
        this.f170188h.mo119502a(this.f170187g, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75379f
    /* renamed from: a */
    public final void mo118940a(int i) {
        this.f170184d = i;
        m132917c();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.f170185e = System.currentTimeMillis();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        this.f170181a = true;
        m132916b();
    }

    public C75758e(C75691ac acVar, AbstractC84447f<C75691ac, Effect, C75690ab> fVar) {
        C89219l.m154721d(acVar, "");
        C89219l.m154721d(fVar, "");
        this.f170187g = acVar;
        this.f170188h = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75379f
    /* renamed from: a */
    public final void mo118941a(AbstractC75370g gVar, String str) {
        C89219l.m154721d(gVar, "");
        this.f170182b = true;
        C73754h.m129792a(this.f170187g.f170122a.getEffectId(), gVar, str);
        if (str != null) {
            C75462e.m132332a(gVar.getMusicId(), str);
        }
        m132916b();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        C89219l.m154721d(exceptionResult, "");
        this.f170188h.mo119503a(this.f170187g, exceptionResult.getException(), new C75690ab(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg(), this.f170186f), System.currentTimeMillis() - this.f170185e);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.f170186f = j;
        this.f170183c = i;
        m132917c();
    }
}
