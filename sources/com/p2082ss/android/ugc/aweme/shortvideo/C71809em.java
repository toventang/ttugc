package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.em */
public final /* synthetic */ class C71809em implements AbstractC89171a {

    /* renamed from: a */
    private final String f160939a;

    /* renamed from: b */
    private final Editable f160940b;

    static {
        Covode.recordClassIndex(84354);
    }

    public C71809em(String str, Editable editable) {
        this.f160939a = str;
        this.f160940b = editable;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        return Boolean.valueOf(this.f160939a.length() > this.f160940b.length());
    }
}
