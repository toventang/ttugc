package androidx.core.p037h.p038a;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.a.a */
public final class C0728a extends ClickableSpan {

    /* renamed from: a */
    private final int f2832a;

    /* renamed from: b */
    private final C0733d f2833b;

    /* renamed from: c */
    private final int f2834c;

    static {
        Covode.recordClassIndex(809);
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2832a);
        C0733d dVar = this.f2833b;
        int i = this.f2834c;
        int i2 = Build.VERSION.SDK_INT;
        dVar.f2837a.performAction(i, bundle);
    }

    public C0728a(int i, C0733d dVar, int i2) {
        this.f2832a = i;
        this.f2833b = dVar;
        this.f2834c = i2;
    }
}
