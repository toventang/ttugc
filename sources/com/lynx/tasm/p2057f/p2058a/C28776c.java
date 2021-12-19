package com.lynx.tasm.p2057f.p2058a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.DisplayList;
import android.view.HardwareCanvas;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.f.a.c */
public class C28776c extends C28775b {
    static {
        Covode.recordClassIndex(34875);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.C28775b, com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public final boolean mo49896b() {
        return this.f67863h.isValid();
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p2057f.p2058a.C28775b, com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49891a() {
        try {
            if (this.f67864i == null) {
                this.f67864i = Class.forName("android.view.GLES20DisplayList").getDeclaredConstructor(String.class);
                this.f67864i.setAccessible(true);
            }
            this.f67863h = (DisplayList) this.f67864i.newInstance("");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.p2057f.p2058a.C28775b, com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49893a(Canvas canvas) {
        mo49897a(canvas, this.f67863h);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.C28775b, com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public void mo49895b(Canvas canvas) {
        ((HardwareCanvas) canvas).onPostDraw();
        this.f67863h.end();
        this.f67863h.setCaching(true);
        this.f67863h.setLeftTopRightBottom(this.f67857b, this.f67858c, this.f67859d, this.f67860e);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.C28775b
    /* renamed from: a */
    public final void mo49897a(Canvas canvas, Object obj) {
        ((HardwareCanvas) canvas).drawDisplayList((DisplayList) obj, (Rect) null, 1);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.C28775b, com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public Canvas mo49894b(int i, int i2) {
        HardwareCanvas start = this.f67863h.start();
        m57594a(i, i2, start);
        start.onPreDraw((Rect) null);
        return start;
    }
}
