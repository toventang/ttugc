package com.bytedance.bdlocation;

import android.content.Context;
import com.bytedance.bdlocation.p846a.C13156e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.bdlocation.b */
final /* synthetic */ class RunnableC13158b implements Runnable {

    /* renamed from: a */
    private final AbstractC13148a f32092a;

    /* renamed from: b */
    private final Context f32093b;

    /* renamed from: c */
    private final C13156e f32094c;

    /* renamed from: d */
    private final BDLocation f32095d;

    static {
        Covode.recordClassIndex(15105);
    }

    RunnableC13158b(AbstractC13148a aVar, Context context, C13156e eVar, BDLocation bDLocation) {
        this.f32092a = aVar;
        this.f32093b = context;
        this.f32094c = eVar;
        this.f32095d = bDLocation;
    }

    public final void run() {
        this.f32092a.lambda$startLocateUpload$0$BaseLocate(this.f32093b, this.f32094c, this.f32095d);
    }
}
