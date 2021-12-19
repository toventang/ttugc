package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75638o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler */
public final class StickerVideoStatusHandler extends AbstractC75614b implements AbstractC33974au, AbstractC75591e {

    /* renamed from: f */
    public static final C75602a f169972f = new C75602a((byte) 0);

    /* renamed from: a */
    public Effect f169973a;

    /* renamed from: b */
    public int f169974b = 2;

    /* renamed from: c */
    public boolean f169975c;

    /* renamed from: d */
    public final AbstractC75638o f169976d;

    /* renamed from: e */
    public final AbstractC75593g f169977e;

    /* renamed from: g */
    private volatile boolean f169978g;

    static {
        Covode.recordClassIndex(88531);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroyed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler$a */
    public static final class C75602a {
        static {
            Covode.recordClassIndex(88532);
        }

        private C75602a() {
        }

        public /* synthetic */ C75602a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f169973a = null;
        m132631c();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroyed() {
        if (C75466g.m132356h(this.f169973a)) {
            m132631c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler$b */
    public static final class C75603b implements AbstractC75638o.AbstractC75639a {

        /* renamed from: a */
        final /* synthetic */ StickerVideoStatusHandler f169979a;

        static {
            Covode.recordClassIndex(88533);
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler$b$a */
        static final class RunnableC75604a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C75603b f169980a;

            static {
                Covode.recordClassIndex(88534);
            }

            RunnableC75604a(C75603b bVar) {
                this.f169980a = bVar;
            }

            public final void run() {
                AbstractC75593g gVar = this.f169980a.f169979a.f169977e;
                if (gVar != null && !gVar.mo87553a()) {
                    this.f169980a.f169979a.f169977e.mo87554b();
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75638o.AbstractC75639a
        /* renamed from: a */
        public final void mo119340a() {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC75604a(this), 100);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75603b(StickerVideoStatusHandler stickerVideoStatusHandler) {
            this.f169979a = stickerVideoStatusHandler;
        }
    }

    /* renamed from: c */
    private final void m132631c() {
        if (this.f169978g) {
            this.f169976d.mo119367a(false);
            this.f169976d.mo119366a((AbstractC75638o.AbstractC75639a) null);
            this.f169978g = false;
        }
    }

    /* renamed from: b */
    public final void mo119338b() {
        if (C75466g.m132356h(this.f169973a)) {
            this.f169975c = false;
            if (this.f169974b == 1) {
                this.f169976d.mo119365a();
            } else {
                this.f169976d.mo119368b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C75466g.m132356h(this.f169973a);
    }

    /* renamed from: a */
    public final void mo119337a(boolean z) {
        if (!z) {
            this.f169976d.mo119368b();
        } else if (this.f169974b == 1) {
            this.f169976d.mo119365a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f169973a = aVar.f170022a;
        this.f169978g = true;
        this.f169975c = false;
        this.f169974b = 2;
        this.f169976d.mo119367a(true);
        this.f169976d.mo119366a(new C75603b(this));
    }

    public StickerVideoStatusHandler(AbstractC1204m mVar, AbstractC75638o oVar, AbstractC75593g gVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        this.f169976d = oVar;
        this.f169977e = gVar;
        mVar.getLifecycle().mo4012a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e
    /* renamed from: a */
    public final void mo23211a(int i, int i2, int i3, String str) {
        if (C75466g.m132356h(this.f169973a) && i == 52) {
            this.f169974b = i2;
            if (i2 != 1) {
                if (i2 == 2) {
                    this.f169976d.mo119368b();
                } else if (i2 == 3) {
                    this.f169976d.mo119365a();
                }
            } else if (!this.f169975c) {
                AbstractC75593g gVar = this.f169977e;
                if (gVar == null || !gVar.mo87553a() || !this.f169977e.mo87555c()) {
                    this.f169976d.mo119365a();
                }
            }
        }
    }
}
