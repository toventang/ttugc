package com.lynx.tasm.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.image.p2061b.C28799c;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.image.e */
public final class C28815e extends View {

    /* renamed from: a */
    AbstractC28814d f68008a;

    /* renamed from: b */
    AbstractC28814d f68009b;

    /* renamed from: c */
    public C28794b f68010c;

    /* renamed from: d */
    Bitmap f68011d;

    /* renamed from: e */
    Bitmap f68012e;

    static {
        Covode.recordClassIndex(34922);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f68012e = null;
        this.f68011d = null;
        AbstractC28814d dVar = this.f68008a;
        if (dVar != null) {
            dVar.mo49928b();
            this.f68008a = null;
        }
        AbstractC28814d dVar2 = this.f68009b;
        if (dVar2 != null) {
            dVar2.mo49928b();
            this.f68009b = null;
        }
        super.onDetachedFromWindow();
    }

    public C28815e(Context context) {
        super(context);
        MethodCollector.m26663i(1167);
        MethodCollector.m26664o(1167);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(1175);
        super.onDraw(canvas);
        if (this.f68011d != null) {
            if (this.f68008a == null) {
                this.f68008a = C28799c.m57647a();
            }
            this.f68008a.mo49927a(canvas, this.f68011d, this.f68010c);
            MethodCollector.m26664o(1175);
            return;
        }
        if (this.f68012e != null) {
            if (this.f68009b == null) {
                this.f68009b = C28799c.m57648b();
            }
            this.f68009b.mo49927a(canvas, this.f68012e, this.f68010c);
        }
        MethodCollector.m26664o(1175);
    }
}
