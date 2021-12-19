package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1835g.EnumC24105b;

/* renamed from: com.facebook.imagepipeline.memory.p */
public final class C24500p implements AbstractC24485d {

    /* renamed from: a */
    protected final AbstractC24476aa<Bitmap> f58205a = new C24486e();

    /* renamed from: b */
    private final int f58206b;

    /* renamed from: c */
    private int f58207c;

    /* renamed from: d */
    private final AbstractC24481ae f58208d;

    /* renamed from: e */
    private int f58209e;

    static {
        Covode.recordClassIndex(28644);
    }

    @Override // com.facebook.common.p1835g.AbstractC24106c
    /* renamed from: a */
    public final void mo39663a(EnumC24105b bVar) {
        double d = (double) this.f58206b;
        Double.isNaN(d);
        m46805b((int) (d * (1.0d - bVar.getSuggestedTrimRatio())));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void mo39665a(Bitmap bitmap) {
        MethodCollector.m26663i(5202);
        int b = this.f58205a.mo40351b(bitmap);
        if (b <= this.f58207c) {
            this.f58205a.mo40350a(bitmap);
            this.f58209e += b;
        }
        MethodCollector.m26664o(5202);
    }

    /* renamed from: b */
    private synchronized void m46805b(int i) {
        Bitmap a;
        MethodCollector.m26663i(5191);
        while (this.f58209e > i && (a = this.f58205a.mo40348a()) != null) {
            this.f58209e -= this.f58205a.mo40351b(a);
        }
        MethodCollector.m26664o(5191);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized Bitmap mo39664a(int i) {
        MethodCollector.m26663i(5196);
        int i2 = this.f58209e;
        int i3 = this.f58206b;
        if (i2 > i3) {
            m46805b(i3);
        }
        Bitmap a = this.f58205a.mo40349a(i);
        if (a != null) {
            this.f58209e -= this.f58205a.mo40351b(a);
            MethodCollector.m26664o(5196);
            return a;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
        MethodCollector.m26664o(5196);
        return createBitmap;
    }

    public C24500p(int i, int i2, AbstractC24481ae aeVar) {
        this.f58206b = i;
        this.f58207c = i2;
        this.f58208d = aeVar;
    }
}
