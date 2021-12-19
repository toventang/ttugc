package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.twitter.sdk.android.core.e */
public final class C87686e {

    /* renamed from: a */
    public final AbstractC87793j<C87684d> f199178a;

    /* renamed from: b */
    private final OAuth2Service f199179b;

    static {
        Covode.recordClassIndex(103673);
    }

    /* renamed from: b */
    private void m152595b() {
        C87794k.m152811c().mo142113b();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f199179b.mo142192a(new AbstractC87682b<GuestAuthToken>() {
            /* class com.twitter.sdk.android.core.C87686e.C876871 */

            static {
                Covode.recordClassIndex(103674);
            }

            @Override // com.twitter.sdk.android.core.AbstractC87682b
            /* renamed from: a */
            public final void mo34387a(C87810s sVar) {
                C87686e.this.f199178a.mo142125c();
                countDownLatch.countDown();
            }

            @Override // com.twitter.sdk.android.core.AbstractC87682b
            /* renamed from: a */
            public final void mo34386a(C87690h<GuestAuthToken> hVar) {
                C87686e.this.f199178a.mo142123a(new C87684d(hVar.f199190a));
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            this.f199178a.mo142125c();
        }
    }

    /* renamed from: a */
    public final synchronized C87684d mo142119a() {
        MethodCollector.m26663i(4956);
        C87684d a = this.f199178a.mo142121a();
        if (a == null || a.f199192a == null || ((GuestAuthToken) a.f199192a).mo142186a()) {
            m152595b();
            C87684d a2 = this.f199178a.mo142121a();
            MethodCollector.m26664o(4956);
            return a2;
        }
        MethodCollector.m26664o(4956);
        return a;
    }

    /* renamed from: a */
    public final synchronized C87684d mo142120a(C87684d dVar) {
        C87684d a;
        MethodCollector.m26663i(4960);
        C87684d a2 = this.f199178a.mo142121a();
        if (dVar != null && dVar.equals(a2)) {
            m152595b();
        }
        a = this.f199178a.mo142121a();
        MethodCollector.m26664o(4960);
        return a;
    }

    public C87686e(OAuth2Service oAuth2Service, AbstractC87793j<C87684d> jVar) {
        this.f199179b = oAuth2Service;
        this.f199178a = jVar;
    }
}
