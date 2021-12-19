package com.google.android.play.core.p1965d;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.google.android.play.core.d.e */
final class C26979e implements AbstractC26984j {

    /* renamed from: a */
    final /* synthetic */ C26980f f63868a;

    static {
        Covode.recordClassIndex(32455);
    }

    C26979e(C26980f fVar) {
        this.f63868a = fVar;
    }

    @Override // com.google.android.play.core.p1965d.AbstractC26984j
    /* renamed from: a */
    public final void mo44689a(C26985k kVar, File file, boolean z) {
        this.f63868a.f63870b.add(file);
        if (!z) {
            this.f63868a.f63871c.set(false);
        }
    }
}
