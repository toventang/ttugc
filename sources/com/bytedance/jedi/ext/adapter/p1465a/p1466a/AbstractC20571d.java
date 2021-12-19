package com.bytedance.jedi.ext.adapter.p1465a.p1466a;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.d */
public abstract class AbstractC20571d {

    /* renamed from: a */
    private final SparseArray<View> f48704a = new SparseArray<>();

    static {
        Covode.recordClassIndex(24103);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33851b() {
        int size = this.f48704a.size();
        for (int i = 0; i < size; i++) {
            View valueAt = this.f48704a.valueAt(i);
            C89219l.m154709a((Object) valueAt, "");
            valueAt.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33852b(int i) {
        int i2;
        int size = this.f48704a.size();
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = this.f48704a.keyAt(i3);
            View valueAt = this.f48704a.valueAt(i3);
            C89219l.m154709a((Object) valueAt, "");
            if (keyAt == i) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            valueAt.setVisibility(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33850a(View view, int... iArr) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(iArr, "");
        for (int i : iArr) {
            mo33849a(i, view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends View> T mo33849a(int i, View view) {
        C89219l.m154719c(view, "");
        View view2 = this.f48704a.get(i);
        if (!(view2 instanceof View)) {
            view2 = null;
        }
        T t = (T) view2;
        if (t != null) {
            return t;
        }
        T t2 = (T) view.findViewById(i);
        this.f48704a.put(i, t2);
        C89219l.m154709a((Object) t2, "");
        return t2;
    }
}
