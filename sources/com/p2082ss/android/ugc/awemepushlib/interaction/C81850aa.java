package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.aa */
public final class C81850aa {

    /* renamed from: a */
    public static volatile int f183008a;

    static {
        Covode.recordClassIndex(95264);
    }

    /* renamed from: a */
    public static void m141750a(Context context, boolean z) {
        AwemeRedBadgerManager.f183060b.mo125541a();
        C17873f.m33095c().mo143289d(C81852ab.f183010a);
        C17873f.m33096d().mo143289d(C81853ac.f183011a);
        m141751b(context, z);
    }

    /* renamed from: b */
    private static void m141751b(final Context context, boolean z) {
        if (z) {
            C81890x.f183054a.execute(new Runnable() {
                /* class com.p2082ss.android.ugc.awemepushlib.interaction.C81850aa.RunnableC818511 */

                static {
                    Covode.recordClassIndex(95265);
                }

                public final void run() {
                    AccountService.m65215a().mo57064a(new C81857ag(context));
                }
            });
        } else {
            AccountService.m65215a().mo57064a(new C81854ad(context));
        }
    }
}
