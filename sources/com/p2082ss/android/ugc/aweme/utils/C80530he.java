package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.he */
public final class C80530he {

    /* renamed from: a */
    List<String> f180144a = new ArrayList();

    /* renamed from: b */
    String f180145b;

    /* renamed from: c */
    boolean f180146c = true;

    /* renamed from: d */
    private C27910f f180147d = new C27910f();

    static {
        Covode.recordClassIndex(93803);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo123777b() {
        this.f180146c = false;
        m139599c();
    }

    /* renamed from: c */
    private void m139599c() {
        this.f180145b = null;
        this.f180144a.clear();
    }

    /* renamed from: a */
    public final void mo123776a() {
        if (!this.f180144a.isEmpty() && this.f180146c) {
            mo123777b();
        }
    }
}
