package com.lynx.tasm.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.image.d */
public abstract class AbstractC28814d {

    /* renamed from: a */
    public int f68005a;

    /* renamed from: b */
    private final AbstractC28814d f68006b;

    /* renamed from: c */
    private boolean f68007c;

    static {
        Covode.recordClassIndex(34921);
    }

    /* renamed from: c */
    public void mo49913c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49926a() {
        AbstractC28814d dVar = this;
        while (!dVar.f68007c) {
            dVar.f68005a = 0;
            dVar = dVar.f68006b;
            if (dVar == null) {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo49928b() {
        if (!this.f68007c) {
            AbstractC28814d dVar = this.f68006b;
            if (dVar != null) {
                dVar.mo49928b();
            }
            mo49913c();
            this.f68007c = true;
        }
    }

    public AbstractC28814d(AbstractC28814d dVar) {
        this.f68006b = dVar;
    }

    /* renamed from: b */
    public void mo49912b(Canvas canvas, Bitmap bitmap, C28794b bVar) {
        AbstractC28814d dVar = this.f68006b;
        if (dVar != null) {
            dVar.mo49927a(canvas, bitmap, bVar);
        }
    }

    /* renamed from: a */
    public final void mo49927a(Canvas canvas, Bitmap bitmap, C28794b bVar) {
        if (!this.f68007c) {
            this.f68005a++;
            mo49912b(canvas, bitmap, bVar);
        }
    }
}
