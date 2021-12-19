package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

public final class PoolReference implements AbstractC33974au {

    /* renamed from: a */
    public final RecyclerView.RecycledViewPool f5722a;

    /* renamed from: b */
    private final WeakReference<Context> f5723b;

    /* renamed from: c */
    private final C1892a f5724c;

    static {
        Covode.recordClassIndex(2073);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onContextDestroyed();
        }
    }

    /* renamed from: a */
    public final Context mo5618a() {
        return this.f5723b.get();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onContextDestroyed() {
        C1892a aVar = this.f5724c;
        C89219l.m154719c(this, "");
        if (C1924b.m6128a(mo5618a())) {
            this.f5722a.clear();
            aVar.f5725a.remove(this);
        }
    }

    public PoolReference(Context context, RecyclerView.RecycledViewPool recycledViewPool, C1892a aVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(recycledViewPool, "");
        C89219l.m154719c(aVar, "");
        this.f5722a = recycledViewPool;
        this.f5724c = aVar;
        this.f5723b = new WeakReference<>(context);
    }
}
