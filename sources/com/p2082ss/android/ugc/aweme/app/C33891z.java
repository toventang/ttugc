package com.p2082ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.p2082ss.android.ugc.aweme.launcher.InstrumentationC58076a;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;

/* renamed from: com.ss.android.ugc.aweme.app.z */
final /* synthetic */ class C33891z implements InstrumentationC58076a.AbstractC58077a {

    /* renamed from: a */
    private final InitAllServiceImpl f80175a;

    /* renamed from: b */
    private final Context f80176b;

    static {
        Covode.recordClassIndex(40804);
    }

    C33891z(InitAllServiceImpl initAllServiceImpl, Context context) {
        this.f80175a = initAllServiceImpl;
        this.f80176b = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.InstrumentationC58076a.AbstractC58077a
    /* renamed from: a */
    public final String mo60121a(String str, Intent intent) {
        InitAllServiceImpl initAllServiceImpl = this.f80175a;
        Context context = this.f80176b;
        if (!initAllServiceImpl.f79694a && intent != null && TextUtils.equals(MainActivity.class.getName(), str)) {
            initAllServiceImpl.f79694a = true;
            C17975i.m33462a(intent);
            if (C17975i.f42803c && !C17975i.f42811k) {
                C17975i.f42811k = true;
                C40780g.m82246c().execute(new RunnableC33567aa(context));
            }
        }
        return str;
    }
}
