package com.p2082ss.android.ugc.aweme.effect;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.effect.j */
public final /* synthetic */ class CallableC46361j implements Callable {

    /* renamed from: a */
    static final Callable f108058a = new CallableC46361j();

    static {
        Covode.recordClassIndex(54938);
    }

    private CallableC46361j() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Application application = C63247i.f143610a;
        C84915u.m145941a(application, (int) R.raw.fake3d, C70637di.f158113p);
        C84915u.m145941a(application, (int) R.raw.soul_scale, C70637di.f158113p);
        return null;
    }
}
