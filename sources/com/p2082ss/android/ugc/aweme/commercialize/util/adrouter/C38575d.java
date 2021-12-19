package com.p2082ss.android.ugc.aweme.commercialize.util.adrouter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.log.p2599a.C38151a;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38573c;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.C38556b;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.C38557c;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.C38560e;
import java.util.Locale;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.d */
public final class C38575d {

    /* renamed from: a */
    public static final C38575d f91163a = new C38575d();

    private C38575d() {
    }

    static {
        Covode.recordClassIndex(46107);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.d$a */
    public static final class C38576a extends C38560e {

        /* renamed from: a */
        final /* synthetic */ C38565b f91164a;

        static {
            Covode.recordClassIndex(46108);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.C38560e, com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
        /* renamed from: a */
        public final boolean mo65690a() {
            String str;
            String str2 = this.f91164a.f91095c.f91126a;
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            Uri parse = Uri.parse(str2);
            C89219l.m154716b(parse, "");
            String scheme = parse.getScheme();
            if (scheme != null) {
                Locale locale = Locale.getDefault();
                C89219l.m154716b(locale, "");
                Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
                str = scheme.toLowerCase(locale);
                C89219l.m154716b(str, "");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) || !C89219l.m154714a((Object) "market", (Object) str)) {
                return super.mo65690a();
            }
            return false;
        }

        C38576a(C38565b bVar) {
            this.f91164a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.d$a$a */
        static final class C38577a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C38565b f91165a;

            static {
                Covode.recordClassIndex(46109);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38577a(C38565b bVar) {
                super(1);
                this.f91165a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                String str;
                boolean booleanValue = bool.booleanValue();
                C38151a.C38153b a = C38151a.m77332a();
                a.f90122a = this.f91165a.f91097e.f91121a;
                String str2 = "landing_deeplink_success";
                if (booleanValue) {
                    str = str2;
                } else {
                    str = "landing_deeplink_failed";
                }
                a.f90123b = str;
                a.mo66446a(Long.valueOf(this.f91165a.f91093a.f91102c)).mo66454c(this.f91165a.f91093a.f91103d).mo66452b(Long.valueOf(this.f91165a.f91093a.f91104e)).mo66448a(this.f91165a.f91097e.f91122b).mo66455c();
                String str3 = this.f91165a.f91097e.f91121a;
                if (!booleanValue) {
                    str2 = "landing_deeplink_failed";
                }
                C18129a.m33747a(str3, str2, String.valueOf(this.f91165a.f91093a.f91102c), this.f91165a.f91093a.f91103d, String.valueOf(this.f91165a.f91093a.f91104e)).mo28900b("refer", this.f91165a.f91097e.f91122b).mo28902c();
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a
        /* renamed from: a */
        public final void mo65609a(boolean z, C38565b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo65609a(z, bVar);
            if (z) {
                C38151a.C38153b a = C38151a.m77332a();
                a.f90122a = bVar.f91097e.f91121a;
                a.f90123b = "landing_open_url_app";
                a.mo66446a(Long.valueOf(bVar.f91093a.f91102c)).mo66454c(bVar.f91093a.f91103d).mo66452b(Long.valueOf(bVar.f91093a.f91104e)).mo66448a(bVar.f91097e.f91122b).mo66455c();
                C18129a.m33747a(bVar.f91097e.f91121a, "landing_open_url_app", String.valueOf(bVar.f91093a.f91102c), bVar.f91093a.f91103d, String.valueOf(bVar.f91093a.f91104e)).mo28900b("refer", bVar.f91097e.f91122b).mo28902c();
                C38554a.f91082a.mo65601a(new C38577a(bVar));
            }
        }
    }

    /* renamed from: a */
    public static final AbstractC38579f m78276a(Context context, C38565b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        return new C38573c.C38574a().mo67167a(bVar).mo67165a(context).mo67166a(C38554a.f91082a.mo65608c(null)).mo67166a(C38554a.f91082a.mo65606b((AbstractC89172b<? super Boolean, C89391z>) null)).mo67166a(new C38556b()).mo67166a(new C38557c()).mo67166a(new C38576a(bVar)).f91162a;
    }
}
