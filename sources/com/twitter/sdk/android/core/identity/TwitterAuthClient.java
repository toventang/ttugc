package com.twitter.sdk.android.core.identity;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.AbstractC87682b;
import com.twitter.sdk.android.core.AbstractC87793j;
import com.twitter.sdk.android.core.C87690h;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.C87808q;
import com.twitter.sdk.android.core.C87810s;
import com.twitter.sdk.android.core.C87814u;
import com.twitter.sdk.android.core.TwitterAuthConfig;

public class TwitterAuthClient {

    /* renamed from: a */
    final C87808q f199197a;

    /* renamed from: b */
    public final C87695b f199198b;

    /* renamed from: c */
    final AbstractC87793j<C87814u> f199199c;

    /* renamed from: d */
    final TwitterAuthConfig f199200d;

    static {
        Covode.recordClassIndex(103680);
    }

    /* renamed from: com.twitter.sdk.android.core.identity.TwitterAuthClient$a */
    static class C87692a {

        /* renamed from: a */
        public static final C87695b f199201a = new C87695b();

        static {
            Covode.recordClassIndex(103681);
        }
    }

    public TwitterAuthClient() {
        this(C87808q.m152816a(), C87808q.m152816a().f199464e, C87808q.m152816a().f199461b, C87692a.f199201a);
    }

    /* renamed from: com.twitter.sdk.android.core.identity.TwitterAuthClient$b */
    static class C87693b extends AbstractC87682b<C87814u> {

        /* renamed from: a */
        private final AbstractC87793j<C87814u> f199202a;

        /* renamed from: b */
        private final AbstractC87682b<C87814u> f199203b;

        static {
            Covode.recordClassIndex(103682);
        }

        @Override // com.twitter.sdk.android.core.AbstractC87682b
        /* renamed from: a */
        public final void mo34387a(C87810s sVar) {
            C87794k.m152811c().mo142112a();
            this.f199203b.mo34387a(sVar);
        }

        @Override // com.twitter.sdk.android.core.AbstractC87682b
        /* renamed from: a */
        public final void mo34386a(C87690h<C87814u> hVar) {
            C87794k.m152811c().mo142113b();
            this.f199202a.mo142123a(hVar.f199190a);
            this.f199203b.mo34386a(hVar);
        }

        C87693b(AbstractC87793j<C87814u> jVar, AbstractC87682b<C87814u> bVar) {
            this.f199202a = jVar;
            this.f199203b = bVar;
        }
    }

    private TwitterAuthClient(C87808q qVar, TwitterAuthConfig twitterAuthConfig, AbstractC87793j<C87814u> jVar, C87695b bVar) {
        this.f199197a = qVar;
        this.f199198b = bVar;
        this.f199200d = twitterAuthConfig;
        this.f199199c = jVar;
    }
}
