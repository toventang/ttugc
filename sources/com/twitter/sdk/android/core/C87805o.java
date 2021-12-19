package com.twitter.sdk.android.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.concurrent.ExecutorService;

/* renamed from: com.twitter.sdk.android.core.o */
public final class C87805o {

    /* renamed from: a */
    final Context f199448a;

    /* renamed from: b */
    final AbstractC87688f f199449b;

    /* renamed from: c */
    final TwitterAuthConfig f199450c;

    /* renamed from: d */
    final ExecutorService f199451d;

    /* renamed from: e */
    final Boolean f199452e;

    static {
        Covode.recordClassIndex(103806);
    }

    /* renamed from: com.twitter.sdk.android.core.o$a */
    public static class C87806a {

        /* renamed from: a */
        public TwitterAuthConfig f199453a;

        /* renamed from: b */
        public Boolean f199454b;

        /* renamed from: c */
        private final Context f199455c;

        /* renamed from: d */
        private AbstractC87688f f199456d;

        /* renamed from: e */
        private ExecutorService f199457e;

        static {
            Covode.recordClassIndex(103807);
        }

        /* renamed from: a */
        public final C87805o mo142263a() {
            return new C87805o(this.f199455c, this.f199456d, this.f199453a, this.f199457e, this.f199454b, (byte) 0);
        }

        public C87806a(Context context) {
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                this.f199455c = applicationContext;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    private C87805o(Context context, AbstractC87688f fVar, TwitterAuthConfig twitterAuthConfig, ExecutorService executorService, Boolean bool) {
        this.f199448a = context;
        this.f199449b = fVar;
        this.f199450c = twitterAuthConfig;
        this.f199451d = executorService;
        this.f199452e = bool;
    }

    /* synthetic */ C87805o(Context context, AbstractC87688f fVar, TwitterAuthConfig twitterAuthConfig, ExecutorService executorService, Boolean bool, byte b) {
        this(context, fVar, twitterAuthConfig, executorService, bool);
    }
}
