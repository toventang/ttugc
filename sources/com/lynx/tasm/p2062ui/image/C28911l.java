package com.lynx.tasm.p2062ui.image;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1854e.C24217g;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.view.C24261b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.lynx.tasm.LynxEnv;

/* renamed from: com.lynx.tasm.ui.image.l */
public class C28911l extends C24261b<C24246a> {

    /* renamed from: h */
    private static Drawable f68329h = new ColorDrawable();

    /* renamed from: d */
    public C24117a<AbstractC24454c> f68330d;

    /* renamed from: e */
    private Drawable f68331e;

    /* renamed from: f */
    private Handler f68332f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private C24217g f68333g;

    @Override // com.facebook.drawee.view.C24261b
    /* renamed from: b */
    public final void mo40003b() {
    }

    @Override // com.facebook.drawee.view.C24261b
    /* renamed from: f */
    public final Drawable mo40008f() {
        return this.f68333g;
    }

    static {
        Covode.recordClassIndex(35034);
    }

    @Override // com.facebook.drawee.view.C24261b
    /* renamed from: c */
    public final void mo40005c() {
        this.f68333g.setDrawable(f68329h);
        this.f68332f.post(new Runnable() {
            /* class com.lynx.tasm.p2062ui.image.C28911l.RunnableC289121 */

            static {
                Covode.recordClassIndex(35035);
            }

            public final void run() {
                C24117a.m45712c(C28911l.this.f68330d);
            }
        });
    }

    public C28911l(C24117a<AbstractC24454c> aVar) {
        super(null);
        this.f68330d = aVar;
        this.f68331e = new BitmapDrawable(LynxEnv.m56706b().f66634a.getResources(), ((C24455d) aVar.mo39695a()).f58089a);
        this.f68333g = new C24217g(this.f68331e);
    }
}
