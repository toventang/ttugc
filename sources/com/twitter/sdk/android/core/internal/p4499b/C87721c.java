package com.twitter.sdk.android.core.internal.p4499b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.twitter.sdk.android.core.internal.b.c */
public final class C87721c implements AbstractC87720b {

    /* renamed from: a */
    private final SharedPreferences f199237a;

    static {
        Covode.recordClassIndex(103710);
    }

    @Override // com.twitter.sdk.android.core.internal.p4499b.AbstractC87720b
    /* renamed from: a */
    public final SharedPreferences mo142166a() {
        return this.f199237a;
    }

    @Override // com.twitter.sdk.android.core.internal.p4499b.AbstractC87720b
    /* renamed from: b */
    public final SharedPreferences.Editor mo142168b() {
        return this.f199237a.edit();
    }

    @Override // com.twitter.sdk.android.core.internal.p4499b.AbstractC87720b
    /* renamed from: a */
    public final boolean mo142167a(SharedPreferences.Editor editor) {
        editor.apply();
        return true;
    }

    public C87721c(Context context, String str) {
        if (context != null) {
            this.f199237a = C34822d.m71158a(context, str, 0);
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
