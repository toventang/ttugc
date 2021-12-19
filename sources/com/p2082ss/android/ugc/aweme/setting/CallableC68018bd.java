package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.setting.bd */
final /* synthetic */ class CallableC68018bd implements Callable {

    /* renamed from: a */
    private final C68017bc f152367a;

    static {
        Covode.recordClassIndex(80214);
    }

    CallableC68018bd(C68017bc bcVar) {
        this.f152367a = bcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C68017bc bcVar = this.f152367a;
        SettingsManagerProxy.inst().notifySettingsChange();
        C1731i.m5640b(new CallableC68019be(bcVar), C40780g.m82241a());
        return null;
    }
}
