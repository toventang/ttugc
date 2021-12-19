package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.log;

import android.net.Uri;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.log.PdpLogHelper */
public final class PdpLogHelper implements AbstractC33974au {

    /* renamed from: c */
    public static final C37704a f89069c = new C37704a((byte) 0);

    /* renamed from: a */
    public final C88958b<Integer> f89070a;

    /* renamed from: b */
    public final C88411a f89071b = new C88411a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.log.PdpLogHelper$b */
    public static final class C37705b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ PdpLogHelper f89072a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16208i f89073b;

        static {
            Covode.recordClassIndex(45144);
        }

        public C37705b(PdpLogHelper pdpLogHelper, AbstractC16208i iVar) {
            this.f89072a = pdpLogHelper;
            this.f89073b = iVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.log.PdpLogHelper$b$a */
        public static final class C37706a implements AbstractC16191p {

            /* renamed from: a */
            public final JSONObject f89074a;

            /* renamed from: b */
            final /* synthetic */ C37705b f89075b;

            /* renamed from: c */
            final /* synthetic */ Integer f89076c;

            /* renamed from: d */
            private final String f89077d = "onPageGlide";

            static {
                Covode.recordClassIndex(45145);
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: a */
            public final String mo25699a() {
                return this.f89077d;
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ Object mo25700b() {
                return this.f89074a;
            }

            C37706a(C37705b bVar, Integer num) {
                this.f89075b = bVar;
                this.f89076c = num;
                JSONObject jSONObject = new JSONObject();
                C89219l.m154716b(num, "");
                this.f89074a = jSONObject.put("state", PdpLogHelper.m76323a(num.intValue()).getValue());
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            this.f89073b.onEvent(new C37706a(this, num));
            C89219l.m154716b(num, "");
            PdpLogHelper.m76323a(num.intValue()).getValue();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.log.PdpLogHelper$c */
    public static final class C37707c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C37707c f89078a = new C37707c();

        static {
            Covode.recordClassIndex(45146);
        }

        C37707c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(45142);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            dispose();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.log.PdpLogHelper$a */
    public static final class C37704a {
        static {
            Covode.recordClassIndex(45143);
        }

        private C37704a() {
        }

        public /* synthetic */ C37704a(byte b) {
            this();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void dispose() {
        this.f89071b.dispose();
    }

    public PdpLogHelper() {
        C88958b<Integer> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f89070a = bVar;
    }

    /* renamed from: a */
    public static EnumC37708a m76323a(int i) {
        if (i == 3) {
            return EnumC37708a.EXPANDED;
        }
        if (i == 4) {
            return EnumC37708a.COLLAPSED;
        }
        if (i != 5) {
            return EnumC37708a.COLLAPSED;
        }
        return EnumC37708a.HIDDEN;
    }

    /* renamed from: a */
    public static void m76324a(int i, long j, String str) {
        String str2;
        String queryParameter;
        C33744d a = new C33744d().mo59980a("success", i).mo59983a("load_time", String.valueOf(((float) (System.currentTimeMillis() - j)) / 1000.0f));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        C33744d a2 = a.mo59983a("schema_url", str2);
        Uri parse = Uri.parse(str);
        String str3 = null;
        if (parse != null) {
            str3 = parse.getQueryParameter("channel");
        }
        if (!(str3 == null || str3.length() == 0 || str3 == null)) {
            a2.mo59983a("channel", str3);
        }
        Uri parse2 = Uri.parse(str);
        if (!(parse2 == null || (queryParameter = parse2.getQueryParameter("bundle")) == null || queryParameter.length() == 0 || queryParameter == null)) {
            a2.mo59983a("bundle", queryParameter);
        }
        C39162r.m79460a("ttmp_oc_anchor_pdp_load", a2.f79943a);
    }
}
