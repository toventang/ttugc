package com.bytedance.android.livesdk.util.rxutils.autodispose.p647a;

import android.view.View;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11136ab;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4560f.p4561a.AbstractC88917f;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.a.c */
public final class C11134c implements AbstractC11136ab {

    /* renamed from: a */
    private final View f26756a;

    static {
        Covode.recordClassIndex(12761);
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11136ab
    /* renamed from: c */
    public final AbstractC88917f mo17928c() {
        return new C11132b(this.f26756a);
    }

    private C11134c(View view) {
        this.f26756a = view;
    }

    /* renamed from: a */
    public static AbstractC11136ab m19772a(View view) {
        Objects.requireNonNull(view, "view == null");
        return new C11134c(view);
    }
}
