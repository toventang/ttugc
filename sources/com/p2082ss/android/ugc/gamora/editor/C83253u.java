package com.p2082ss.android.ugc.gamora.editor;

import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.u */
public final class C83253u {
    static {
        Covode.recordClassIndex(97137);
    }

    /* renamed from: a */
    public static final void m143652a(View view, float f, long j) {
        C89219l.m154721d(view, "");
        view.animate().translationY(f).setDuration(j).start();
    }

    /* renamed from: a */
    public static final void m143651a(View view, float f, float f2, float f3) {
        C89219l.m154721d(view, "");
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}
