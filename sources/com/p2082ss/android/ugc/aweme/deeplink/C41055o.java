package com.p2082ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.o */
public final class C41055o {

    /* renamed from: a */
    public static final C41057b f95972a = new C41057b((byte) 0);

    static {
        Covode.recordClassIndex(48925);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.o$b */
    public static final class C41057b {
        static {
            Covode.recordClassIndex(48927);
        }

        private C41057b() {
        }

        public /* synthetic */ C41057b(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m82702a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C17879g.m33104a().registerActivityLifecycleCallbacks(new C41056a(str, str2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.o$a */
    public static final class C41056a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private int f95973a;

        /* renamed from: b */
        private final String f95974b;

        /* renamed from: c */
        private final String f95975c;

        static {
            Covode.recordClassIndex(48926);
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
        }

        public final void onActivityStopped(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public C41056a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f95974b = str;
            this.f95975c = str2;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
            if (TextUtils.equals(activity.getClass().getName(), this.f95974b)) {
                new C79459a(C17867d.m33078a()).mo123052a(this.f95975c).mo123053a();
                C17879g.m33104a().unregisterActivityLifecycleCallbacks(this);
                return;
            }
            int i = this.f95973a + 1;
            this.f95973a = i;
            if (i > 5) {
                C17879g.m33104a().unregisterActivityLifecycleCallbacks(this);
            }
        }
    }
}
