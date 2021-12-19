package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.C87728g;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.ac */
public final class RunnableC87759ac implements Runnable {

    /* renamed from: a */
    private final Context f199333a;

    /* renamed from: b */
    private final AbstractC87777p f199334b;

    static {
        Covode.recordClassIndex(103757);
    }

    public final void run() {
        try {
            C87728g.m152671a(this.f199333a, "Performing time based file roll over.");
            if (!this.f199334b.mo142213c()) {
                this.f199334b.mo142212b();
            }
        } catch (Exception unused) {
            C87728g.m152677b(this.f199333a, "Failed to roll over file");
        }
    }

    public RunnableC87759ac(Context context, AbstractC87777p pVar) {
        this.f199333a = context;
        this.f199334b = pVar;
    }
}
