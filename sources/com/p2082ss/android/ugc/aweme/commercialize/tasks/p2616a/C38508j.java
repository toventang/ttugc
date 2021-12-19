package com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1270b.C18141a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.commercialize.C37638d;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38518e;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38554a;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2618a.C38550a;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2618a.C38552b;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.j */
public final class C38508j extends AbstractC18142a {

    /* renamed from: d */
    public final long f91004d;

    /* renamed from: e */
    public final String f91005e;

    /* renamed from: f */
    public final long f91006f;

    /* renamed from: g */
    public final String f91007g;

    /* renamed from: h */
    public final String f91008h;

    /* renamed from: i */
    private final String f91009i;

    /* renamed from: j */
    private final boolean f91010j;

    /* renamed from: k */
    private final boolean f91011k;

    /* renamed from: l */
    private final String f91012l;

    /* renamed from: m */
    private final AbstractC89244h f91013m = C89250i.m154773a((AbstractC89171a) new C38512d(this));

    static {
        Covode.recordClassIndex(46034);
    }

    /* renamed from: c */
    private final Intent m78087c() {
        return (Intent) this.f91013m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.j$c */
    static final class CallableC38511c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C38508j f91018a;

        static {
            Covode.recordClassIndex(46037);
        }

        CallableC38511c(C38508j jVar) {
            this.f91018a = jVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                C18141a b = this.f91018a.f43207c.mo28929b();
                if (b instanceof AwemeRawAd) {
                    C37638d dVar = C37638d.f88998a;
                    C89219l.m154716b(dVar, "");
                    dVar.f88999b = (AwemeRawAd) b;
                }
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.j$d */
    static final class C38512d extends AbstractC89220m implements AbstractC89171a<Intent> {

        /* renamed from: a */
        final /* synthetic */ C38508j f91019a;

        static {
            Covode.recordClassIndex(46038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38512d(C38508j jVar) {
            super(0);
            this.f91019a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Intent invoke() {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.f91019a.f91007g));
            intent.putExtra("open_url", this.f91019a.f91007g);
            return intent;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: b */
    public final boolean mo28927b() {
        if (!this.f91010j && !TextUtils.isEmpty(this.f91007g)) {
            return C29843f.m60130a(this.f43206b, m78087c());
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a
    /* renamed from: a */
    public final C18148g mo28925a() {
        String str;
        Intent c = m78087c();
        String str2 = this.f91007g;
        if (TextUtils.isEmpty(this.f91009i)) {
            str = this.f91008h;
        } else {
            str = this.f91009i;
        }
        if (this.f91011k) {
            String a = C38550a.m78167a(str2, str);
            if (a != null) {
                str2 = a;
            }
            C38550a.f91074a = new C38552b.C38553a().mo67169a(new C38510b(this, str)).f91182a;
        } else if (C89361p.m154908a((CharSequence) str2, (CharSequence) "__back_url__", false)) {
            String builder = Uri.parse(AbstractC37639a.AbstractC37640a.f89002a).buildUpon().appendQueryParameter("tag", str).toString();
            C89219l.m154716b(builder, "");
            String encode = Uri.encode(builder);
            C89219l.m154716b(encode, "");
            str2 = C89361p.m154869a(str2, "__back_url__", encode, false);
            C1731i.m5640b(new CallableC38511c(this), C1731i.f5562a);
        }
        Uri parse = Uri.parse(str2);
        if (!TextUtils.isEmpty(this.f91012l)) {
            parse = parse.buildUpon().appendQueryParameter("source_aid", this.f91012l).build();
        }
        c.setData(parse);
        return C38518e.m78108a(this.f43206b, c);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.j$b */
    static final class C38510b extends AbstractC89220m implements AbstractC89172b<C38552b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C38508j f91016a;

        /* renamed from: b */
        final /* synthetic */ String f91017b;

        static {
            Covode.recordClassIndex(46036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38510b(C38508j jVar, String str) {
            super(1);
            this.f91016a = jVar;
            this.f91017b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C38552b bVar) {
            C38552b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.f91079b = this.f91016a.f91004d;
            bVar2.f91080c = this.f91016a.f91005e;
            bVar2.f91081d = this.f91016a.f91006f;
            bVar2.f91078a = this.f91017b;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.j$a */
    static final class C38509a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C38508j f91014a;

        /* renamed from: b */
        final /* synthetic */ C18141a f91015b;

        static {
            Covode.recordClassIndex(46035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38509a(C38508j jVar, C18141a aVar) {
            super(1);
            this.f91014a = jVar;
            this.f91015b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                C18129a.m33746a(this.f91014a.f91008h, "deeplink_success", (AwemeRawAd) this.f91015b).mo28901b();
            } else {
                C18129a.m33746a(this.f91014a.f91008h, "deeplink_failed", (AwemeRawAd) this.f91015b).mo28901b();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: a */
    public final void mo28926a(boolean z) {
        C18141a b = this.f43207c.mo28929b();
        if (z && (b instanceof AwemeRawAd)) {
            C18129a.m33746a(this.f91008h, "open_url_app", (AwemeRawAd) b).mo28901b();
            C38554a.f91082a.mo65601a(new C38509a(this, b));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38508j(AbstractC18144c cVar, Bundle bundle) {
        super(cVar, bundle);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        this.f91004d = bundle.getLong("creative_id", 0);
        String string = bundle.getString("log_extra", "");
        C89219l.m154716b(string, "");
        this.f91005e = string;
        this.f91006f = bundle.getLong("group_id", 0);
        String string2 = bundle.getString("open_url", "");
        C89219l.m154716b(string2, "");
        this.f91007g = string2;
        String string3 = bundle.getString("log_tag", "draw_ad");
        C89219l.m154716b(string3, "");
        this.f91008h = string3;
        this.f91009i = bundle.getString("back_url_tag");
        this.f91010j = bundle.getBoolean("forbidden_open_3rd_app", false);
        this.f91011k = bundle.getBoolean("use_adx_deeplink", false);
        this.f91012l = bundle.getString("aweme_id");
    }
}
