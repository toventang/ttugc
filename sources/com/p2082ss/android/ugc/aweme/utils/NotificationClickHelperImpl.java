package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.NotificationClickHelperImpl */
public final class NotificationClickHelperImpl implements NotificationClickHelper {
    static {
        Covode.recordClassIndex(93432);
    }

    /* renamed from: a */
    public static NotificationClickHelper m138961a() {
        MethodCollector.m26663i(7652);
        Object a = C81908b.m141854a(NotificationClickHelper.class, false);
        if (a != null) {
            NotificationClickHelper notificationClickHelper = (NotificationClickHelper) a;
            MethodCollector.m26664o(7652);
            return notificationClickHelper;
        }
        if (C81908b.f183395ey == null) {
            synchronized (NotificationClickHelper.class) {
                try {
                    if (C81908b.f183395ey == null) {
                        C81908b.f183395ey = new NotificationClickHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7652);
                    throw th;
                }
            }
        }
        NotificationClickHelperImpl notificationClickHelperImpl = (NotificationClickHelperImpl) C81908b.f183395ey;
        MethodCollector.m26664o(7652);
        return notificationClickHelperImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper
    /* renamed from: a */
    public final boolean mo99359a(Activity activity, boolean z, boolean z2, boolean z3, String str) {
        if (activity == null) {
            return false;
        }
        if (!z) {
            return C80424ff.m139429a(activity, z2, z3, str);
        }
        new C17197a.C17200a(activity).mo27189a(R.string.dl0).mo27194b(R.string.dky).mo27195b(R.string.c50, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80424ff.DialogInterface$OnClickListenerC804262 */

            static {
                Covode.recordClassIndex(93694);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, false).mo27190a(R.string.si, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(activity, z2, z3, str) {
            /* class com.p2082ss.android.ugc.aweme.utils.C80424ff.DialogInterface$OnClickListenerC804251 */

            /* renamed from: a */
            final /* synthetic */ Activity f179985a;

            /* renamed from: b */
            final /* synthetic */ boolean f179986b;

            /* renamed from: c */
            final /* synthetic */ boolean f179987c;

            /* renamed from: d */
            final /* synthetic */ String f179988d;

            static {
                Covode.recordClassIndex(93693);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C80424ff.m139429a(this.f179985a, this.f179986b, this.f179987c, this.f179988d);
                dialogInterface.dismiss();
            }

            {
                this.f179985a = r1;
                this.f179986b = r2;
                this.f179987c = r3;
                this.f179988d = r4;
            }
        }, false).mo27193a().mo27184b();
        return true;
    }
}
