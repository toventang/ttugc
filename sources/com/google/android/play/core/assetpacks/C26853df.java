package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26896an;

/* renamed from: com.google.android.play.core.assetpacks.df */
public final class C26853df implements AbstractC26920bk<Context> {

    /* renamed from: a */
    final C26848da f63710a;

    static {
        Covode.recordClassIndex(32328);
    }

    public C26853df(C26848da daVar) {
        this.f63710a = daVar;
    }

    /* renamed from: a */
    public static Context m53319a(C26848da daVar) {
        Context context = daVar.f63703a;
        C26896an.m53419a(context);
        return context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Context mo44411a() {
        return m53319a(this.f63710a);
    }
}
