package com.twitter.sdk.android.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.C87684d;
import com.twitter.sdk.android.core.C87814u;
import com.twitter.sdk.android.core.internal.C87734m;
import com.twitter.sdk.android.core.internal.C87750q;
import com.twitter.sdk.android.core.internal.C87751r;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.p4499b.C87721c;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.twitter.sdk.android.core.q */
public class C87808q {

    /* renamed from: a */
    static volatile C87808q f199460a;

    /* renamed from: b */
    public AbstractC87793j<C87814u> f199461b;

    /* renamed from: c */
    AbstractC87793j<C87684d> f199462c;

    /* renamed from: d */
    C87734m<C87814u> f199463d;

    /* renamed from: e */
    public final TwitterAuthConfig f199464e;

    /* renamed from: f */
    final Context f199465f;

    /* renamed from: g */
    private final ConcurrentHashMap<C87691i, C87795l> f199466g;

    /* renamed from: h */
    private volatile C87795l f199467h;

    /* renamed from: i */
    private volatile C87686e f199468i;

    static {
        Covode.recordClassIndex(103809);
    }

    /* renamed from: b */
    public final C87686e mo142272b() {
        if (this.f199468i == null) {
            m152817c();
        }
        return this.f199468i;
    }

    /* renamed from: a */
    public static C87808q m152816a() {
        MethodCollector.m26663i(6227);
        if (f199460a == null) {
            synchronized (C87808q.class) {
                try {
                    if (f199460a == null) {
                        f199460a = new C87808q(C87794k.m152808a().f199423f);
                        C87794k.m152808a().f199422e.execute(RunnableC87809r.f199469a);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6227);
                    throw th;
                }
            }
        }
        C87808q qVar = f199460a;
        MethodCollector.m26664o(6227);
        return qVar;
    }

    /* renamed from: c */
    private synchronized void m152817c() {
        MethodCollector.m26663i(6390);
        if (this.f199468i == null) {
            this.f199468i = new C87686e(new OAuth2Service(this, new C87750q()), this.f199462c);
        }
        MethodCollector.m26664o(6390);
    }

    private C87808q(TwitterAuthConfig twitterAuthConfig) {
        this(twitterAuthConfig, new ConcurrentHashMap());
    }

    private C87808q(TwitterAuthConfig twitterAuthConfig, ConcurrentHashMap<C87691i, C87795l> concurrentHashMap) {
        this.f199464e = twitterAuthConfig;
        this.f199466g = concurrentHashMap;
        this.f199467h = null;
        C87807p pVar = new C87807p(C87794k.m152808a().f199420c, "com.twitter.sdk.android:twitter-core", ".TwitterKit" + File.separator + "com.twitter.sdk.android:twitter-core");
        this.f199465f = pVar;
        this.f199461b = new C87689g(new C87721c(pVar, "session_store"), new C87814u.C87815a(), "active_twittersession", "twittersession");
        this.f199462c = new C87689g(new C87721c(pVar, "session_store"), new C87684d.C87685a(), "active_guestsession", "guestsession");
        this.f199463d = new C87734m<>(this.f199461b, C87794k.m152808a().f199422e, new C87751r());
    }
}
