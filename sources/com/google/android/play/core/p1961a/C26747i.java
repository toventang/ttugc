package com.google.android.play.core.p1961a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;

/* renamed from: com.google.android.play.core.a.i */
public final class C26747i implements AbstractC26920bk<C26746h> {

    /* renamed from: a */
    private final AbstractC26920bk<C26757s> f63365a;

    /* renamed from: b */
    private final AbstractC26920bk<C26743e> f63366b;

    /* renamed from: c */
    private final AbstractC26920bk<Context> f63367c;

    static {
        Covode.recordClassIndex(32219);
    }

    public C26747i(AbstractC26920bk<C26757s> bkVar, AbstractC26920bk<C26743e> bkVar2, AbstractC26920bk<Context> bkVar3) {
        this.f63365a = bkVar;
        this.f63366b = bkVar2;
        this.f63367c = bkVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26746h mo44411a() {
        return new C26746h(this.f63365a.mo44411a(), this.f63366b.mo44411a(), ((C26750l) this.f63367c).mo44411a());
    }
}
