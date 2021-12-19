package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.api.a */
public final class C56713a extends Exception {

    /* renamed from: a */
    private final String f129260a;

    static {
        Covode.recordClassIndex(66569);
    }

    public C56713a() {
        this(null, 1, null);
    }

    public final String getMessage() {
        return this.f129260a;
    }

    public C56713a(String str) {
        this.f129260a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C56713a(String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str);
    }
}
