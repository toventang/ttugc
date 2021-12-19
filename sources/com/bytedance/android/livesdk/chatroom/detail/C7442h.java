package com.bytedance.android.livesdk.chatroom.detail;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.h */
public final class C7442h {

    /* renamed from: a */
    public int f18461a;

    /* renamed from: b */
    public boolean f18462b;

    /* renamed from: c */
    public int f18463c = 1;

    /* renamed from: d */
    private WeakReference<View> f18464d = new WeakReference<>(null);

    static {
        Covode.recordClassIndex(8212);
    }

    /* renamed from: b */
    private View m15334b() {
        return this.f18464d.get();
    }

    /* renamed from: a */
    public final void mo13660a() {
        int i;
        View b = m15334b();
        if (b != null) {
            if (!this.f18462b || this.f18463c != 1) {
                i = 8;
            } else {
                i = 0;
            }
            b.setVisibility(i);
            ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f18461a;
            }
        }
    }

    /* renamed from: a */
    public final void mo13661a(boolean z) {
        this.f18462b = z;
        mo13660a();
    }
}
