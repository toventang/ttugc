package com.p2082ss.android.ugc.aweme.app;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46893en;
import com.p2082ss.android.ugc.aweme.experiment.C46899ep;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C57058z;
import com.p2082ss.android.ugc.aweme.launcher.InstrumentationC58076a;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58143e;
import com.p2082ss.android.ugc.aweme.main.MainActivity;

/* renamed from: com.ss.android.ugc.aweme.app.y */
final /* synthetic */ class C33890y implements InstrumentationC58076a.AbstractC58077a {

    /* renamed from: a */
    private final InitAllServiceImpl f80174a;

    static {
        Covode.recordClassIndex(40803);
    }

    C33890y(InitAllServiceImpl initAllServiceImpl) {
        this.f80174a = initAllServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.InstrumentationC58076a.AbstractC58077a
    /* renamed from: a */
    public final String mo60121a(String str, Intent intent) {
        InitAllServiceImpl initAllServiceImpl = this.f80174a;
        if (initAllServiceImpl.f79694a || intent == null || !TextUtils.equals(MainActivity.class.getName(), str) || !AbstractC56869p.C56870a.m103133a().mo94055h()) {
            return str;
        }
        initAllServiceImpl.f79694a = true;
        C46893en.f109284e = true;
        if (C46899ep.m90198b()) {
            HandlerC58143e eVar = HandlerC58143e.f132402b;
            if (eVar.hasMessages(1205)) {
                eVar.removeMessages(1205);
            }
        }
        return C57058z.f129923a.mo57262a(intent).getName();
    }
}
