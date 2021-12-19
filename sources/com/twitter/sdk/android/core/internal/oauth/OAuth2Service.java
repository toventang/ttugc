package com.twitter.sdk.android.core.internal.oauth;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.AbstractC87682b;
import com.twitter.sdk.android.core.C87690h;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.C87808q;
import com.twitter.sdk.android.core.C87810s;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.internal.C87750q;
import com.twitter.sdk.android.core.internal.p4498a.C87717f;
import p4632k.C89427i;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89725i;
import p4640l.p4644b.AbstractC89727k;
import p4640l.p4644b.AbstractC89731o;

public final class OAuth2Service extends AbstractC87747d {

    /* renamed from: a */
    OAuth2Api f199279a = ((OAuth2Api) this.f199300e.mo144318a(OAuth2Api.class));

    /* access modifiers changed from: package-private */
    public interface OAuth2Api {
        static {
            Covode.recordClassIndex(103735);
        }

        @AbstractC89731o(mo144285a = "/oauth2/token")
        @AbstractC89721e
        @AbstractC89727k(mo144282a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        AbstractC89716b<OAuth2Token> getAppAuthToken(@AbstractC89725i(mo144281a = "Authorization") String str, @AbstractC89719c(mo144273a = "grant_type") String str2);

        @AbstractC89731o(mo144285a = "/1.1/guest/activate.json")
        AbstractC89716b<C87744a> getGuestToken(@AbstractC89725i(mo144281a = "Authorization") String str);
    }

    static {
        Covode.recordClassIndex(103732);
    }

    /* renamed from: a */
    private String m152699a() {
        TwitterAuthConfig twitterAuthConfig = this.f199297b.f199464e;
        return "Basic " + C89427i.encodeUtf8(C87717f.m152648b(twitterAuthConfig.f199171a) + ":" + C87717f.m152648b(twitterAuthConfig.f199172b)).base64();
    }

    /* renamed from: b */
    private void m152700b(AbstractC87682b<OAuth2Token> bVar) {
        this.f199279a.getAppAuthToken(m152699a(), "client_credentials").mo144268a(bVar);
    }

    /* renamed from: a */
    public final void mo142192a(final AbstractC87682b<GuestAuthToken> bVar) {
        m152700b(new AbstractC87682b<OAuth2Token>() {
            /* class com.twitter.sdk.android.core.internal.oauth.OAuth2Service.C877401 */

            static {
                Covode.recordClassIndex(103733);
            }

            @Override // com.twitter.sdk.android.core.AbstractC87682b
            /* renamed from: a */
            public final void mo34387a(C87810s sVar) {
                C87794k.m152811c().mo142112a();
                AbstractC87682b bVar = bVar;
                if (bVar != null) {
                    bVar.mo34387a(sVar);
                }
            }

            @Override // com.twitter.sdk.android.core.AbstractC87682b
            /* renamed from: a */
            public final void mo34386a(C87690h<OAuth2Token> hVar) {
                final T t = hVar.f199190a;
                OAuth2Service.this.f199279a.getGuestToken("Bearer " + t.f199285d).mo144268a(new AbstractC87682b<C87744a>() {
                    /* class com.twitter.sdk.android.core.internal.oauth.OAuth2Service.C877401.C877411 */

                    static {
                        Covode.recordClassIndex(103734);
                    }

                    @Override // com.twitter.sdk.android.core.AbstractC87682b
                    /* renamed from: a */
                    public final void mo34387a(C87810s sVar) {
                        C87794k.m152811c().mo142112a();
                        bVar.mo34387a(sVar);
                    }

                    @Override // com.twitter.sdk.android.core.AbstractC87682b
                    /* renamed from: a */
                    public final void mo34386a(C87690h<C87744a> hVar) {
                        bVar.mo34386a(new C87690h(new GuestAuthToken(t.f199284c, t.f199285d, hVar.f199190a.f199289a), null));
                    }
                });
            }
        });
    }

    public OAuth2Service(C87808q qVar, C87750q qVar2) {
        super(qVar, qVar2);
    }
}
