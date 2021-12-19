package com.bytedance.awemelobby;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.AbstractC20889b;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.p1493b.C20890a;
import com.p2082ss.android.ugc.aweme.buildconfigdiff.C34949b;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.awemelobby.a */
public final class C12907a {

    /* renamed from: a */
    public static final boolean f31426a = false;

    /* renamed from: b */
    public static final C12907a f31427b = new C12907a();

    private C12907a() {
    }

    /* renamed from: com.bytedance.awemelobby.a$a */
    public static final class C12908a implements AbstractC20889b {
        static {
            Covode.recordClassIndex(14744);
        }

        @Override // com.bytedance.lobby.AbstractC20889b
        /* renamed from: a */
        public final boolean mo20734a() {
            if (!C58195d.m105111d()) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.lobby.AbstractC20889b
        /* renamed from: b */
        public final List<C20892d> mo20735b() {
            C20892d b = new C20892d.C20895c(C34949b.m71337b()).mo34340a().mo34342b();
            C89219l.m154709a((Object) b, "");
            C20892d b2 = new C20892d.C20897e(C34949b.m71345j()).mo34340a().mo34341a(new C20890a().mo34330a("google_auth_redirect_uri", C34949b.m71347l()).mo34331b()).mo34342b();
            C89219l.m154709a((Object) b2, "");
            C20892d b3 = new C20892d.C20896d(C34949b.m71346k()).mo34340a().mo34342b();
            C89219l.m154709a((Object) b3, "");
            C20892d b4 = new C20892d.C20894b(C34949b.m71338c()).mo34340a().mo34342b();
            C89219l.m154709a((Object) b4, "");
            C20892d b5 = new C20892d.C20900h(C34949b.m71336a()).mo34340a().mo34342b();
            C89219l.m154709a((Object) b5, "");
            C20892d.C20893a a = new C20892d.C20898f(C34949b.m71339d()).mo34340a();
            Bundle bundle = new Bundle();
            bundle.putString("ig_scope", "user_profile");
            bundle.putString("ig_redirect_url", C34949b.m71340e());
            bundle.putString("ig_login_auth_url", "https://api.instagram.com/oauth/authorize/");
            C20892d b6 = a.mo34341a(bundle).mo34342b();
            C89219l.m154709a((Object) b6, "");
            C20892d.C20893a a2 = new C20892d.C20901i(C34949b.m71341f()).mo34340a();
            Bundle bundle2 = new Bundle();
            bundle2.putString("twitter_consumer_secret", C34949b.m71342g());
            C20892d b7 = a2.mo34341a(bundle2).mo34342b();
            C89219l.m154709a((Object) b7, "");
            C20892d b8 = new C20892d.C20899g(C34949b.m71343h()).mo34340a().mo34342b();
            C89219l.m154709a((Object) b8, "");
            C20892d b9 = new C20892d.C20902j(C34949b.m71344i()).mo34340a().mo34342b();
            C89219l.m154709a((Object) b9, "");
            return C89070n.m154524c(b, b2, b3, b4, b5, b6, b7, b8, b9);
        }
    }

    static {
        Covode.recordClassIndex(14743);
    }
}
