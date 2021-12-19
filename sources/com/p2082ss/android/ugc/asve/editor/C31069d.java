package com.p2082ss.android.ugc.asve.editor;

import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31074g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.d */
public final class C31069d implements AbstractC31074g {
    static {
        Covode.recordClassIndex(37699);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31074g
    /* renamed from: a */
    public final AbstractC31071f mo56402a(SurfaceView surfaceView, AbstractC31074g.C31076b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar.f74434a != EnumC31070e.VEEditorTYPE) {
            throw new IllegalArgumentException(("Unknown editor type " + bVar.f74434a).toString());
        } else if (surfaceView == null) {
            return new C31060a(bVar.f74435b);
        } else {
            if (bVar.f74436c > 0) {
                return new C31060a(bVar.f74435b, surfaceView, bVar.f74436c);
            }
            return new C31060a(bVar.f74435b, surfaceView);
        }
    }
}
