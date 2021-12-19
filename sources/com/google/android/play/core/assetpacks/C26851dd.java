package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26896an;

/* renamed from: com.google.android.play.core.assetpacks.dd */
public final class C26851dd implements AbstractC26920bk<Object> {

    /* renamed from: a */
    private final AbstractC26920bk<C26843cw> f63705a;

    /* renamed from: b */
    private final AbstractC26920bk<Context> f63706b;

    static {
        Covode.recordClassIndex(32326);
    }

    public C26851dd(AbstractC26920bk<C26843cw> bkVar, AbstractC26920bk<Context> bkVar2) {
        this.f63705a = bkVar;
        this.f63706b = bkVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ Object mo44411a() {
        C26843cw a = this.f63705a.mo44411a();
        Context a2 = C26853df.m53319a(((C26853df) this.f63706b).f63710a);
        C26896an.m53417a(a2.getPackageManager(), new ComponentName(a2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        C26896an.m53417a(a2.getPackageManager(), new ComponentName(a2.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
        C26896an.m53419a(a);
        return a;
    }
}
