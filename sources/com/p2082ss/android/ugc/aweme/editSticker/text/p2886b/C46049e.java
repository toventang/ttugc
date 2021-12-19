package com.p2082ss.android.ugc.aweme.editSticker.text.p2886b;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46115a;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46116b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.b.e */
public final class C46049e {

    /* renamed from: a */
    public AbstractC46118d f107281a;

    /* renamed from: b */
    public float f107282b;

    /* renamed from: c */
    public float f107283c;

    /* renamed from: d */
    public float f107284d;

    /* renamed from: e */
    public float f107285e;

    /* renamed from: f */
    public long f107286f;

    /* renamed from: g */
    public float f107287g;

    /* renamed from: h */
    public float f107288h;

    /* renamed from: i */
    public boolean f107289i;

    /* renamed from: j */
    public int f107290j = 2;

    /* renamed from: k */
    public final int f107291k = 200;

    /* renamed from: l */
    public int f107292l = 3000;

    /* renamed from: m */
    public int f107293m;

    /* renamed from: n */
    public int f107294n;

    /* renamed from: o */
    public boolean f107295o;

    /* renamed from: p */
    public SafeHandler f107296p;

    /* renamed from: q */
    public C46239q f107297q;

    /* renamed from: r */
    public boolean f107298r;

    /* renamed from: s */
    public boolean f107299s;

    /* renamed from: t */
    public AbstractC46115a f107300t;

    /* renamed from: u */
    public AbstractC46116b f107301u;

    /* renamed from: v */
    public AbstractC45857b f107302v = C45856a.f106824a;

    /* renamed from: w */
    private Runnable f107303w = new RunnableC46050a(this, (byte) 0);

    /* renamed from: x */
    private AbstractC46045a f107304x;

    /* renamed from: y */
    private EditTextStickerViewModel f107305y;

    static {
        Covode.recordClassIndex(54584);
    }

    /* renamed from: a */
    public final boolean mo77730a() {
        if (this.f107290j == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo77732b() {
        if (this.f107290j != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private EditTextStickerViewModel m88899e() {
        if (this.f107305y == null) {
            this.f107305y = (EditTextStickerViewModel) C20531t.m38716a((ActivityC0945e) this.f107297q.getContext()).mo33800a(EditTextStickerViewModel.class);
        }
        return this.f107305y;
    }

    /* renamed from: c */
    public final boolean mo77733c() {
        if (this.f107297q.getData() != null) {
            return this.f107297q.getData().getHasReadTextAudio();
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo77734d() {
        AbstractC46045a aVar = this.f107304x;
        if (aVar != null) {
            return aVar.mo77579a();
        }
        return m88899e().mo77634i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.b.e$a */
    public class RunnableC46050a implements Runnable {
        static {
            Covode.recordClassIndex(54585);
        }

        public final void run() {
            C46049e.this.f107289i = false;
            if (C46049e.this.f107297q != null) {
                C46049e.this.f107297q.invalidate();
            }
            boolean c = C46049e.this.mo77733c();
            if (C46049e.this.f107300t != null) {
                C46049e.this.f107300t.mo78302a(false, true, c);
            }
        }

        private RunnableC46050a() {
        }

        /* synthetic */ RunnableC46050a(C46049e eVar, byte b) {
            this();
        }
    }

    public C46049e(AbstractC46045a aVar) {
        this.f107304x = aVar;
    }

    /* renamed from: a */
    public final void mo77729a(boolean z) {
        this.f107289i = z;
        Runnable runnable = this.f107303w;
        if (runnable != null) {
            this.f107297q.removeCallbacks(runnable);
            this.f107303w = null;
        }
        if (z && this.f107296p != null && this.f107303w == null) {
            RunnableC46050a aVar = new RunnableC46050a(this, (byte) 0);
            this.f107303w = aVar;
            this.f107297q.postDelayed(aVar, (long) this.f107292l);
        }
        this.f107297q.invalidate();
        boolean c = mo77733c();
        AbstractC46115a aVar2 = this.f107300t;
        if (aVar2 != null) {
            aVar2.mo78302a(z, false, c);
        }
    }

    /* renamed from: a */
    public final boolean mo77731a(float f, float f2) {
        this.f107286f = System.currentTimeMillis();
        float f3 = f - ((float) this.f107293m);
        float f4 = f2 - ((float) this.f107294n);
        this.f107284d = f3;
        this.f107285e = f4;
        boolean z = false;
        if (this.f107299s) {
            this.f107290j = 2;
            this.f107299s = false;
        }
        if (this.f107290j == 2 || mo77734d()) {
            boolean b = this.f107297q.mo78412b(f3, f4);
            this.f107295o = b;
            if (b) {
                this.f107290j = 3;
                this.f107287g = f3;
                this.f107288h = f4;
                z = true;
                AbstractC46118d dVar = this.f107281a;
                if (dVar != null) {
                    dVar.mo77572e(this.f107297q);
                }
            }
        }
        return z;
    }
}
