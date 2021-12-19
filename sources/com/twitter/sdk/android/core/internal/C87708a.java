package com.twitter.sdk.android.core.internal;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.twitter.sdk.android.core.internal.a */
public final class C87708a {

    /* renamed from: a */
    public final C87709a f199225a;

    /* renamed from: com.twitter.sdk.android.core.internal.a$b */
    public static abstract class AbstractC87711b {
        static {
            Covode.recordClassIndex(103700);
        }

        /* renamed from: a */
        public void mo142164a() {
        }
    }

    static {
        Covode.recordClassIndex(103697);
    }

    /* renamed from: com.twitter.sdk.android.core.internal.a$a */
    public static class C87709a {

        /* renamed from: a */
        public final Set<Application.ActivityLifecycleCallbacks> f199226a = new HashSet();

        /* renamed from: b */
        public final Application f199227b;

        static {
            Covode.recordClassIndex(103698);
        }

        C87709a(Application application) {
            this.f199227b = application;
        }
    }

    public C87708a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f199225a = new C87709a((Application) applicationContext);
    }
}
