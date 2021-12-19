package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.android.ecommerce.p159e.AbstractC2780d;
import com.bytedance.android.ecommerce.p159e.C2773a;
import com.bytedance.android.ecommerce.p163i.AbstractC2801b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.C43645a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44072b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44089r;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.y */
public final class C44287y {

    /* renamed from: a */
    public static final C44287y f103280a = new C44287y();

    /* renamed from: b */
    private static boolean f103281b;

    private C44287y() {
    }

    static {
        Covode.recordClassIndex(52599);
    }

    /* renamed from: a */
    public static AbstractC2780d m87012a() {
        if (f103281b) {
            AbstractC2780d dVar = C2732a.f8145a;
            C89219l.m154716b(dVar, "");
            return dVar;
        }
        C22708a.m42800a("Do not init EcommerceService!");
        throw new RuntimeException("Do not init EcommerceService!");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.y$a */
    static final class C44288a extends AbstractC89220m implements AbstractC89172b<Integer, CharSequence> {

        /* renamed from: a */
        public static final C44288a f103282a = new C44288a();

        static {
            Covode.recordClassIndex(52600);
        }

        C44288a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(Integer num) {
            return String.valueOf(num.intValue());
        }
    }

    /* renamed from: a */
    public static void m87013a(C44089r rVar) {
        String str;
        C44072b bVar;
        int[] iArr;
        C89219l.m154721d(rVar, "");
        String str2 = rVar.f102828h;
        List<C44072b> list = rVar.f102824d;
        if (list == null || (bVar = (C44072b) C89070n.m154579f((List) list)) == null || (iArr = bVar.f102730c) == null) {
            str = null;
        } else {
            str = C89064i.m154479a(iArr, ",", C44288a.f103282a);
        }
        C22708a.m42804a((Object) str);
        if (str2 == null || str2.length() == 0) {
            C22708a.m42800a("pipo host is null");
        }
        C2773a.C2774a aVar = new C2773a.C2774a(C17879g.m33104a());
        aVar.f8335b = str2;
        aVar.f8336c = new JSONObject(C80342dg.m139300a().mo46674b(rVar));
        aVar.f8347n = new C43645a();
        Object obj = rVar.f102821a;
        if (obj == null) {
            obj = C89086z.INSTANCE;
        }
        aVar.f8338e = new JSONArray(C80342dg.m139300a().mo46674b(obj));
        aVar.f8345l = C44289b.f103283a;
        aVar.f8346m = SettingServiceImpl.m120782v().mo108872h();
        aVar.f8343j = C44092e.f102836h;
        aVar.f8344k = rVar.f102827g;
        C2732a.f8145a.mo7360a(aVar.mo7355a());
        C2732a.f8145a.mo7367e(C44092e.f102836h);
        f103281b = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.y$b */
    static final class C44289b implements AbstractC2801b {

        /* renamed from: a */
        public static final C44289b f103283a = new C44289b();

        static {
            Covode.recordClassIndex(52601);
        }

        C44289b() {
        }

        @Override // com.bytedance.android.ecommerce.p163i.AbstractC2801b
        /* renamed from: a */
        public final void mo7380a(String str, JSONObject jSONObject) {
            C39162r.m79461a(str, jSONObject);
        }
    }
}
