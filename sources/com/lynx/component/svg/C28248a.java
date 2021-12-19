package com.lynx.component.svg;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.PictureDrawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.lynx.component.svg.p2042a.C28256e;
import com.lynx.component.svg.p2042a.C28257f;
import com.lynx.component.svg.p2042a.C28305g;

/* renamed from: com.lynx.component.svg.a */
public final class C28248a extends PictureDrawable {

    /* renamed from: a */
    private C28257f f66218a;

    /* renamed from: b */
    private C28256e f66219b;

    /* renamed from: c */
    private C28321d f66220c;

    static {
        Covode.recordClassIndex(34206);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        C28257f fVar = this.f66218a;
        if (fVar != null) {
            C28256e eVar = this.f66219b;
            C28321d dVar = this.f66220c;
            if (eVar == null) {
                eVar = new C28256e(14.0f);
            }
            fVar.f66245d = eVar;
            if (!eVar.mo48328a()) {
                eVar.mo48327a((float) canvas.getWidth(), (float) canvas.getHeight());
            }
            new C28305g(canvas, fVar.f66244c, eVar.f66241c, dVar).mo48362a(fVar, eVar);
        } else if (getPicture() != null) {
            canvas.translate((float) bounds.left, (float) bounds.top);
            canvas.drawPicture(getPicture());
        }
        canvas.restore();
    }

    public C28248a(C28257f fVar, C28256e eVar, C28321d dVar) {
        super(null);
        Picture a;
        int i = Build.VERSION.SDK_INT;
        fVar.f66245d = eVar;
        C28257f.C28259a aVar = fVar.f66242a.f66309r;
        if (eVar != null && eVar.mo48328a()) {
            a = fVar.mo48329a((int) Math.ceil((double) eVar.f66240b.mo48331a()), (int) Math.ceil((double) eVar.f66240b.mo48333b()), eVar, dVar);
        } else if (fVar.f66242a.f66288c != null && fVar.f66242a.f66288c.f66361b != C28257f.EnumC28278an.percent && fVar.f66242a.f66289d != null && fVar.f66242a.f66289d.f66361b != C28257f.EnumC28278an.percent) {
            a = fVar.mo48329a((int) Math.ceil((double) fVar.f66242a.f66288c.mo48343a(fVar.f66244c, eVar.f66241c)), (int) Math.ceil((double) fVar.f66242a.f66289d.mo48343a(fVar.f66244c, eVar.f66241c)), eVar, dVar);
        } else if (fVar.f66242a.f66288c != null && aVar != null) {
            float a2 = fVar.f66242a.f66288c.mo48343a(fVar.f66244c, eVar.f66241c);
            a = fVar.mo48329a((int) Math.ceil((double) a2), (int) Math.ceil((double) ((aVar.f66251d * a2) / aVar.f66250c)), eVar, dVar);
        } else if (fVar.f66242a.f66289d == null || aVar == null) {
            a = fVar.mo48329a(512, 512, eVar, dVar);
        } else {
            float a3 = fVar.f66242a.f66289d.mo48343a(fVar.f66244c, eVar.f66241c);
            a = fVar.mo48329a((int) Math.ceil((double) ((aVar.f66250c * a3) / aVar.f66251d)), (int) Math.ceil((double) a3), eVar, dVar);
        }
        setPicture(a);
    }
}
