package com.bytedance.android.livesdk.newvideogift.p595a;

import android.content.Context;
import android.os.Handler;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.livesdk.livesetting.gift.GiftPlayerAutoReleaseSwitchSetting;
import com.bytedance.android.livesdk.newvideogift.p595a.C9970j;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11631c;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11632d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.newvideogift.a.b */
public final class C9950b {

    /* renamed from: a */
    public Context f24103a;

    /* renamed from: b */
    public FrameLayout f24104b;

    /* renamed from: c */
    public AbstractC11631c f24105c;

    /* renamed from: d */
    public AbstractC11632d f24106d;

    /* renamed from: e */
    public AbstractC11629a f24107e;

    /* renamed from: f */
    AbstractC9952a f24108f;

    /* renamed from: g */
    public Runnable f24109g = new RunnableC9953c(this);

    /* renamed from: h */
    public boolean f24110h = true;

    /* renamed from: i */
    public long f24111i;

    /* renamed from: j */
    public long f24112j;

    /* renamed from: k */
    public long f24113k;

    /* renamed from: l */
    private long f24114l = 15000;

    /* renamed from: com.bytedance.android.livesdk.newvideogift.a.b$a */
    public interface AbstractC9952a {
        static {
            Covode.recordClassIndex(11504);
        }
    }

    static {
        Covode.recordClassIndex(11502);
    }

    /* renamed from: b */
    public final void mo16661b() {
        if (GiftPlayerAutoReleaseSwitchSetting.INSTANCE.getValue().f24036a) {
            C3940j.m9594a().removeCallbacks(this.f24109g);
            long j = GiftPlayerAutoReleaseSwitchSetting.INSTANCE.getValue().f24037b;
            Handler a = C3940j.m9594a();
            Runnable runnable = this.f24109g;
            if (j <= 0) {
                j = this.f24114l;
            }
            a.postDelayed(runnable, j);
        }
    }

    /* renamed from: a */
    public final void mo16660a() {
        if (Thread.currentThread() != null) {
            C3854a.m9455a(3, "GiftCtlManager", Thread.currentThread().getStackTrace());
        }
        C3854a.m9453a(3, "GiftCtlManager", "controller release() called with [" + this.f24107e + "]");
        C3940j.m9594a().removeCallbacks(this.f24109g);
        AbstractC11629a aVar = this.f24107e;
        if (aVar != null) {
            aVar.mo16669b();
            this.f24107e.mo16672d();
            this.f24107e.mo16673e();
            this.f24107e.mo16670b(this.f24104b);
        }
        this.f24107e = null;
        C9958e.m18293a().mo16682b(this.f24103a.hashCode());
    }

    public C9950b(Context context, FrameLayout frameLayout, final AbstractC11631c cVar, AbstractC9952a aVar, AbstractC11632d dVar) {
        this.f24103a = context;
        this.f24104b = frameLayout;
        this.f24106d = dVar;
        this.f24108f = aVar;
        this.f24105c = new AbstractC11631c() {
            /* class com.bytedance.android.livesdk.newvideogift.p595a.C9950b.C99511 */

            static {
                Covode.recordClassIndex(11503);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11631c
            /* renamed from: a */
            public final void mo16650a() {
                C9950b.this.f24110h = false;
                AbstractC11631c cVar = cVar;
                if (cVar != null) {
                    cVar.mo16650a();
                }
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11631c
            /* renamed from: b */
            public final void mo16652b() {
                C9950b.this.f24110h = true;
                AbstractC11631c cVar = cVar;
                if (cVar != null) {
                    cVar.mo16652b();
                }
                C9950b.this.mo16661b();
                C9970j.m18395a(C9970j.EnumC9971a.playcontroller_end, C9950b.this.f24111i, C9950b.this.f24112j, C9950b.this.f24113k);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11631c
            /* renamed from: a */
            public final void mo16651a(float f, float f2, float f3, float f4) {
                AbstractC11631c cVar = cVar;
                if (cVar != null) {
                    cVar.mo16651a(f, f2, f3, f4);
                }
            }
        };
    }
}
