package com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.commercialize.C37638d;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38554a;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2618a.C38550a;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2618a.C38552b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a.e */
public class C38560e extends AbstractC38555a {

    /* renamed from: d */
    public static final C38561a f91087d = new C38561a((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f91088a = C89250i.m154773a((AbstractC89171a) new C38564d(this));

    static {
        Covode.recordClassIndex(46092);
    }

    /* renamed from: e */
    private final Intent m78201e() {
        return (Intent) this.f91088a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a.e$a */
    public static final class C38561a {
        static {
            Covode.recordClassIndex(46093);
        }

        private C38561a() {
        }

        public /* synthetic */ C38561a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a.e$c */
    static final class CallableC38563c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C38560e f91091a;

        static {
            Covode.recordClassIndex(46095);
        }

        CallableC38563c(C38560e eVar) {
            this.f91091a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                C37638d dVar = C37638d.f88998a;
                C89219l.m154716b(dVar, "");
                dVar.f88999b = this.f91091a.mo67076d().f91093a.f91100a;
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a.e$d */
    static final class C38564d extends AbstractC89220m implements AbstractC89171a<Intent> {

        /* renamed from: a */
        final /* synthetic */ C38560e f91092a;

        static {
            Covode.recordClassIndex(46096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38564d(C38560e eVar) {
            super(0);
            this.f91092a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Intent invoke() {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.f91092a.mo67076d().f91095c.f91126a));
            intent.putExtra("open_url", this.f91092a.mo67076d().f91095c.f91126a);
            return intent;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: a */
    public boolean mo65690a() {
        if (!mo67076d().f91095c.f91127b && !TextUtils.isEmpty(mo67076d().f91095c.f91126a)) {
            return C29843f.m60130a(mo67075c(), m78201e());
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: b */
    public final boolean mo65691b() {
        String str;
        C38554a.f91082a.mo65603a("ad_lynx_download_ThirdAppOpenUrlHandler_doHandle", (JSONObject) null, "begin", String.valueOf(mo67076d().f91093a.f91102c));
        Intent e = m78201e();
        String str2 = mo67076d().f91095c.f91126a;
        if (TextUtils.isEmpty(mo67076d().f91095c.f91128c)) {
            str = mo67076d().f91097e.f91121a;
        } else {
            str = mo67076d().f91095c.f91128c;
        }
        if (mo67076d().f91095c.f91129d) {
            String a = C38550a.m78167a(str2, str);
            if (a != null) {
                str2 = a;
            }
            C38550a.f91074a = new C38552b.C38553a().mo67169a(new C38562b(this, str)).f91182a;
        } else if (C89361p.m154908a((CharSequence) str2, (CharSequence) "__back_url__", false)) {
            String builder = Uri.parse(AbstractC37639a.AbstractC37640a.f89002a).buildUpon().appendQueryParameter("tag", str).toString();
            C89219l.m154716b(builder, "");
            String encode = Uri.encode(builder);
            C89219l.m154716b(encode, "");
            str2 = C89361p.m154869a(str2, "__back_url__", encode, false);
            C1731i.m5640b(new CallableC38563c(this), C1731i.f5562a);
        }
        Uri parse = Uri.parse(str2);
        if (!TextUtils.isEmpty(mo67076d().f91093a.f91107h)) {
            parse = parse.buildUpon().appendQueryParameter("source_aid", mo67076d().f91093a.f91107h).build();
        }
        e.setData(parse);
        C38554a.f91082a.mo65603a("ad_lynx_download_ThirdAppOpenUrlHandler_doHandle", (JSONObject) null, "startActivitySafely", String.valueOf(mo67076d().f91093a.f91102c));
        return m78188a(mo67075c(), e);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a.e$b */
    static final class C38562b extends AbstractC89220m implements AbstractC89172b<C38552b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C38560e f91089a;

        /* renamed from: b */
        final /* synthetic */ String f91090b;

        static {
            Covode.recordClassIndex(46094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38562b(C38560e eVar, String str) {
            super(1);
            this.f91089a = eVar;
            this.f91090b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C38552b bVar) {
            C38552b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.f91079b = this.f91089a.mo67076d().f91093a.f91102c;
            bVar2.f91080c = this.f91089a.mo67076d().f91093a.f91103d;
            bVar2.f91081d = this.f91089a.mo67076d().f91093a.f91104e;
            bVar2.f91078a = this.f91090b;
            return C89391z.f203057a;
        }
    }
}
