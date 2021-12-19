package com.p2082ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.ac */
public final class C33569ac {

    /* renamed from: a */
    public static final C33570a f79740a = new C33570a((byte) 0);

    static {
        Covode.recordClassIndex(40458);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ac$a */
    public static final class C33570a {
        static {
            Covode.recordClassIndex(40459);
        }

        private C33570a() {
        }

        public /* synthetic */ C33570a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m68783a(Activity activity, Intent intent) {
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }

        /* renamed from: a */
        public static Intent m68782a(Activity activity, Intent intent, String str) {
            C89219l.m154721d(activity, "");
            if (!C17873f.f42637m) {
                Intent intent2 = new Intent();
                C33829m.m69189a(intent2, activity, C17867d.f42588l);
                m68783a(activity, intent2);
            }
            Intent intent3 = new Intent(activity, PushLoginActivity.class);
            if (intent != null) {
                intent3.putExtra("next_step", intent);
            }
            intent3.putExtra("multi_account_push_uid", str);
            return intent3;
        }
    }
}
