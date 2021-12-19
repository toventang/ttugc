package com.p2082ss.android.ugc.aweme.utils;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.C21680a;
import com.bytedance.platform.godzilla.p1575b.C21705b;
import com.bytedance.platform.godzilla.p1575b.p1584c.C21715a;
import com.bytedance.platform.godzilla.p1575b.p1584c.C21716b;
import com.bytedance.platform.godzilla.p1585c.EnumC21720d;
import com.bytedance.platform.godzilla.sysopt.C21729a;
import com.bytedance.platform.godzilla.sysopt.C21730b;
import com.p2082ss.android.ugc.aweme.lego.C58152b;

/* renamed from: com.ss.android.ugc.aweme.utils.df */
public final class C80341df {

    /* renamed from: a */
    public static boolean f179871a;

    static {
        Covode.recordClassIndex(93609);
    }

    /* renamed from: a */
    public static void m139299a(Application application) {
        boolean b = C58152b.m105084b();
        C21680a.C21681a aVar = new C21680a.C21681a(application);
        aVar.mo35337a(new C21715a());
        if (!b) {
            aVar.mo35337a(new C21705b());
        }
        aVar.mo35337a(new C21716b());
        aVar.mo35337a(new C80207ab());
        aVar.mo35337a(new C21730b());
        aVar.mo35337a(new C80469g());
        aVar.mo35337a(new C80438fm());
        aVar.mo35337a(new C80518gx());
        aVar.mo35337a(new C80521h());
        aVar.mo35337a(new C80402er());
        if (Keva.getRepo("ab_repo_cold_boot").getBoolean("thread_stack_opt", true) && (Build.VERSION.SDK_INT < 23 || !Process.is64Bit())) {
            aVar.mo35337a(new C21729a());
        }
        C21680a.m40621a(aVar.mo35338a()).mo35336a(EnumC21720d.IMMEDIATE);
        f179871a = true;
    }
}
