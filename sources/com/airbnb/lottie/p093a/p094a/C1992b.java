package com.airbnb.lottie.p093a.p094a;

import android.graphics.Path;
import com.airbnb.lottie.p106i.C2194g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.b */
public final class C1992b {

    /* renamed from: a */
    private List<C2011s> f5953a = new ArrayList();

    static {
        Covode.recordClassIndex(2187);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5902a(C2011s sVar) {
        this.f5953a.add(sVar);
    }

    /* renamed from: a */
    public final void mo5901a(Path path) {
        for (int size = this.f5953a.size() - 1; size >= 0; size--) {
            C2194g.m6797a(path, this.f5953a.get(size));
        }
    }
}
