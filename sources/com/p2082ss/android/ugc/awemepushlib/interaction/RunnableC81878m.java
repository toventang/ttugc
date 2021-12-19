package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.push.window.oppo.C30198c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.awemepushlib.manager.C81900a;
import com.p2082ss.android.ugc.awemepushlib.p4245a.C81806a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.awemepushlib.interaction.m */
public final /* synthetic */ class RunnableC81878m implements Runnable {

    /* renamed from: a */
    private final Context f183043a;

    static {
        Covode.recordClassIndex(95292);
    }

    RunnableC81878m(Context context) {
        this.f183043a = context;
    }

    public final void run() {
        Context context = this.f183043a;
        C81859c.m141752a("method_push_start_load_config");
        C81900a a = C81900a.m141823a();
        SharedPreferences a2 = C34822d.m71158a(context, "push_setting", 0);
        a.mo125555b(context);
        if (!C81806a.m141693c()) {
            a.mo125554b();
        }
        if (!C81806a.m141692b()) {
            C30198c a3 = C30198c.m61083a(context);
            a3.f72023f = a2.getString("tt_push_pop_window_rule", "");
            a3.mo53626a();
        }
        C81859c.m141753b("method_push_start_load_config");
    }
}
