package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.vesdk.VESize;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.y */
public final class C71532y {

    /* renamed from: a */
    public static final C71532y f160317a = new C71532y();

    private C71532y() {
    }

    static {
        Covode.recordClassIndex(84075);
    }

    /* renamed from: a */
    public static final boolean m126437a(AbstractC31071f fVar, AbstractC70977bq bqVar, AbstractC45898d... dVarArr) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bqVar, "");
        C89219l.m154721d(dVarArr, "");
        if (bqVar.mo112106a() == bqVar.mo112107a(true) && bqVar.mo112109b() == bqVar.mo112110b(true)) {
            return false;
        }
        VESize b = fVar.mo56330b();
        int a = bqVar.mo112107a(true);
        int b2 = bqVar.mo112110b(true);
        bqVar.mo112106a();
        bqVar.mo112109b();
        float f = (((float) b.height) - (((float) b2) * ((((float) b.width) * 1.0f) / ((float) a)))) / 2.0f;
        RectF rectF = new RectF();
        rectF.set(0.0f, f, (float) b.width, ((float) b.height) - f);
        boolean z = false;
        for (AbstractC45898d dVar : dVarArr) {
            if (dVar != null) {
                z |= dVar.mo77274a(rectF);
            }
        }
        return z;
    }
}
