package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.b.t */
public final class C26960t implements AbstractC26961u {
    static {
        Covode.recordClassIndex(32435);
    }

    C26960t() {
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26961u
    /* renamed from: a */
    public final boolean mo44568a(Object obj, File file, File file2) {
        return new File((String) C26896an.m53410a(obj.getClass(), String.class, File.class, file, File.class, file2)).exists();
    }
}
