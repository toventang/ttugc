package com.p2082ss.android.ugc.aweme.lego.p3390a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.component.AbstractC58194f;
import com.p2082ss.android.ugc.p4260e.AbstractC81916a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.e */
public final class HandlerC58143e extends HandlerC58141c {

    /* renamed from: a */
    static boolean f132401a;

    /* renamed from: b */
    public static final HandlerC58143e f132402b = new HandlerC58143e();

    private HandlerC58143e() {
    }

    static {
        Covode.recordClassIndex(68209);
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.e$a */
    public static final class C58144a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private int f132403a;

        static {
            Covode.recordClassIndex(68210);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityDestroyed(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityPaused(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityResumed(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bundle, "");
        }

        public final void onActivityStarted(Activity activity) {
            C89219l.m154721d(activity, "");
            int i = this.f132403a + 1;
            this.f132403a = i;
            if (i == 1) {
                HandlerC58143e.f132401a = false;
                EnumC58150ad adVar = EnumC58150ad.TASK_APP_BACKGROUND;
                C89219l.m154721d(adVar, "");
                AbstractC81916a aVar = C58221f.f132588l.get(adVar);
                if (aVar != null) {
                    aVar.mo95599b();
                }
            }
        }

        public final void onActivityStopped(Activity activity) {
            C89219l.m154721d(activity, "");
            int i = this.f132403a - 1;
            this.f132403a = i;
            if (i == 0) {
                HandlerC58143e.f132401a = true;
                EnumC58150ad adVar = EnumC58150ad.TASK_APP_BACKGROUND;
                C89219l.m154721d(adVar, "");
                AbstractC81916a aVar = C58221f.f132588l.get(adVar);
                if (aVar != null) {
                    aVar.mo95597a();
                }
            }
        }
    }

    public final void handleMessage(Message message) {
        AbstractC58194f fVar;
        C89219l.m154721d(message, "");
        int i = message.what;
        if (i == 1205) {
            C58221f.m105152d();
        } else if (i == 1207) {
            AbstractC58194f fVar2 = C58221f.f132587k;
            if (fVar2 != null) {
                fVar2.mo60052a(EnumC58145f.COLD_BOOT_END_SHORT);
            }
        } else if (i == 1208 && (fVar = C58221f.f132587k) != null) {
            fVar.mo60052a(EnumC58145f.COLD_BOOT_END_LONG);
        }
    }
}
