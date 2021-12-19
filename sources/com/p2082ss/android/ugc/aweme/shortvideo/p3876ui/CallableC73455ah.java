package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ah */
final /* synthetic */ class CallableC73455ah implements Callable {

    /* renamed from: a */
    private final C73454ag f165005a;

    /* renamed from: b */
    private final Bundle f165006b;

    static {
        Covode.recordClassIndex(86192);
    }

    CallableC73455ah(C73454ag agVar, Bundle bundle) {
        this.f165005a = agVar;
        this.f165006b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C73454ag agVar = this.f165005a;
        Bundle bundle = this.f165006b;
        if (bundle != null) {
            agVar.f165003g = (Bitmap) bundle.getParcelable("cover_data");
        }
        if (agVar.f165003g == null && agVar.f156473c != null) {
            agVar.f165003g = agVar.f156473c.mo101827d();
        }
        return agVar.f165003g;
    }
}
