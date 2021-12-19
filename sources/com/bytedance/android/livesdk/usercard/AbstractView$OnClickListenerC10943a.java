package com.bytedance.android.livesdk.usercard;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.usercard.a */
public abstract class AbstractView$OnClickListenerC10943a implements View.OnClickListener {

    /* renamed from: a */
    static boolean f26304a = true;

    /* renamed from: c */
    private static final Runnable f26305c = RunnableC10958b.f26344a;

    /* renamed from: b */
    public long f26306b;

    /* renamed from: a */
    public abstract void mo17808a();

    public AbstractView$OnClickListenerC10943a() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(12558);
    }

    private AbstractView$OnClickListenerC10943a(byte b) {
        this.f26306b = 500;
    }

    public final void onClick(View view) {
        if (f26304a) {
            f26304a = false;
            view.postDelayed(f26305c, this.f26306b);
            mo17808a();
        }
    }
}
