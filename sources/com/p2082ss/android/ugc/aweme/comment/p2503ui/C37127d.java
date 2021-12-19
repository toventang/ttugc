package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.d */
final /* synthetic */ class C37127d implements AbstractC1214u {

    /* renamed from: a */
    private final C37035b f87487a;

    static {
        Covode.recordClassIndex(44481);
    }

    C37127d(C37035b bVar) {
        this.f87487a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        float floatValue;
        C37035b bVar = this.f87487a;
        Float f = (Float) obj;
        if (bVar.f87240o != null) {
            if (f == null) {
                floatValue = 0.0f;
            } else {
                floatValue = f.floatValue();
            }
            bVar.f87240o.setTranslationX(((float) C34723i.m70928b(bVar.getContext())) * floatValue);
            bVar.f87240o.setAlpha(1.0f - floatValue);
        }
    }
}
