package com.google.android.play.core.p1963b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.play.core.b.cf */
public final class C26942cf extends C26927br implements AbstractC26943cg {
    static {
        Covode.recordClassIndex(32417);
    }

    C26942cf(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
        MethodCollector.m26663i(13665);
        MethodCollector.m26664o(13665);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26943cg
    /* renamed from: a */
    public final void mo44645a(Bundle bundle) {
        MethodCollector.m26663i(13667);
        Parcel a = mo44630a();
        C26929bt.m53498a(a, bundle);
        mo44631a(3, a);
        MethodCollector.m26664o(13667);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26943cg
    /* renamed from: a */
    public final void mo44646a(Bundle bundle, Bundle bundle2) {
        MethodCollector.m26663i(13666);
        Parcel a = mo44630a();
        C26929bt.m53498a(a, bundle);
        C26929bt.m53498a(a, bundle2);
        mo44631a(2, a);
        MethodCollector.m26664o(13666);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26943cg
    /* renamed from: b */
    public final void mo44647b(Bundle bundle) {
        MethodCollector.m26663i(13669);
        Parcel a = mo44630a();
        C26929bt.m53498a(a, bundle);
        mo44631a(4, a);
        MethodCollector.m26664o(13669);
    }
}
