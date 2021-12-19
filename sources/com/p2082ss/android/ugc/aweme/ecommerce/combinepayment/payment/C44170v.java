package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.content.Context;
import com.bytedance.android.ecommerce.p153a.C2751k;
import com.bytedance.android.ecommerce.p153a.p154a.C2736c;
import com.bytedance.android.ecommerce.p153a.p154a.C2737d;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44077f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44087p;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a.C44627b;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a.C44629d;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45554b;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.v */
public final class C44170v {

    /* renamed from: a */
    public final Context f102982a;

    /* renamed from: b */
    public final List<String> f102983b;

    /* renamed from: c */
    public final String f102984c;

    /* renamed from: d */
    public C44077f f102985d;

    /* renamed from: e */
    public final C44627b f102986e;

    /* renamed from: f */
    public final C44085n f102987f;

    /* renamed from: g */
    public final Map<String, Object> f102988g;

    /* renamed from: h */
    public final String f102989h;

    /* renamed from: i */
    public final String f102990i;

    /* renamed from: j */
    public final AbstractC44169u f102991j;

    /* renamed from: k */
    public final C2737d f102992k = new C2737d();

    /* renamed from: l */
    public final C2736c f102993l = new C2736c();

    /* renamed from: m */
    public Boolean f102994m;

    static {
        Covode.recordClassIndex(52481);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.v$a */
    public static final class C44171a {

        /* renamed from: a */
        public Context f102995a;

        /* renamed from: b */
        public List<String> f102996b;

        /* renamed from: c */
        public String f102997c;

        /* renamed from: d */
        public Boolean f102998d;

        /* renamed from: e */
        public C44077f f102999e;

        /* renamed from: f */
        public AbstractC44169u f103000f;

        /* renamed from: g */
        public C28022o f103001g;

        /* renamed from: h */
        public C44085n f103002h;

        /* renamed from: i */
        public HashMap<String, Object> f103003i;

        /* renamed from: j */
        public String f103004j;

        /* renamed from: k */
        public String f103005k;

        static {
            Covode.recordClassIndex(52482);
        }

        /* renamed from: a */
        public final C44170v mo75014a() {
            return new C44170v(this);
        }

        public C44171a(Context context) {
            C89219l.m154721d(context, "");
            this.f102995a = context;
        }

        /* renamed from: a */
        public final C44171a mo75013a(HashMap<String, Object> hashMap) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            if (hashMap != null) {
                hashMap2.putAll(hashMap);
            }
            this.f103003i = hashMap2;
            return this;
        }
    }

    /* renamed from: a */
    private static C89378p<String, String> m86958a() {
        return new C89378p<>("Referer", C45554b.m88105a());
    }

    public C44170v(C44171a aVar) {
        C44627b bVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z;
        C44087p pVar;
        Boolean isChooseSave;
        C44629d dVar;
        C44629d dVar2;
        C44629d dVar3;
        C44629d dVar4;
        C44629d dVar5;
        C44629d dVar6;
        C44629d dVar7;
        Object obj;
        C89219l.m154721d(aVar, "");
        this.f102982a = aVar.f102995a;
        this.f102983b = aVar.f102996b;
        this.f102984c = aVar.f102997c;
        this.f102985d = aVar.f102999e;
        this.f102991j = aVar.f103000f;
        C28022o oVar = aVar.f103001g;
        String str17 = null;
        if (oVar != null) {
            try {
                obj = C80342dg.m139301a(C80342dg.m139300a().mo46674b(oVar), C44627b.class);
            } catch (Exception unused) {
                obj = null;
            }
            bVar = (C44627b) obj;
        } else {
            bVar = null;
        }
        this.f102986e = bVar;
        this.f102987f = aVar.f103002h;
        HashMap<String, Object> hashMap = aVar.f103003i;
        this.f102988g = hashMap == null ? new HashMap<>() : hashMap;
        this.f102989h = aVar.f103004j;
        this.f102990i = aVar.f103005k;
        C2751k kVar = new C2751k();
        if (bVar != null) {
            str = bVar.f104109d;
        } else {
            str = null;
        }
        kVar.f8275a = str;
        kVar.f8278d = "android";
        if (bVar != null) {
            str2 = bVar.f104111f;
        } else {
            str2 = null;
        }
        kVar.f8277c = str2;
        if (bVar != null) {
            str3 = bVar.f104112g;
        } else {
            str3 = null;
        }
        kVar.f8276b = str3;
        C2737d dVar8 = this.f102992k;
        if (bVar == null || (dVar7 = bVar.f104115j) == null) {
            str4 = null;
        } else {
            str4 = dVar7.f104122b;
        }
        dVar8.f8177i = str4;
        C2737d dVar9 = this.f102992k;
        if (bVar != null) {
            str5 = bVar.f104110e;
        } else {
            str5 = null;
        }
        dVar9.f8173e = str5;
        C2737d dVar10 = this.f102992k;
        if (bVar != null) {
            str6 = bVar.f104108c;
        } else {
            str6 = null;
        }
        dVar10.f8174f = str6;
        C2737d dVar11 = this.f102992k;
        if (bVar != null) {
            str7 = bVar.f104107b;
        } else {
            str7 = null;
        }
        dVar11.f8153a = str7;
        C2737d dVar12 = this.f102992k;
        if (bVar == null || (dVar6 = bVar.f104115j) == null) {
            str8 = null;
        } else {
            str8 = dVar6.f104124d;
        }
        dVar12.f8176h = str8;
        this.f102992k.f8175g = kVar;
        this.f102992k.f8154b = String.valueOf(System.currentTimeMillis());
        this.f102992k.f8156d = C89041ag.m154428c(m86958a());
        C2736c cVar = this.f102993l;
        if (bVar != null) {
            str9 = bVar.f104108c;
        } else {
            str9 = null;
        }
        cVar.f8171p = str9;
        C2736c cVar2 = this.f102993l;
        if (bVar != null) {
            str10 = bVar.f104107b;
        } else {
            str10 = null;
        }
        cVar2.f8153a = str10;
        this.f102993l.f8154b = String.valueOf(System.currentTimeMillis());
        C2736c cVar3 = this.f102993l;
        if (bVar == null || (dVar5 = bVar.f104115j) == null) {
            str11 = null;
        } else {
            str11 = dVar5.f104122b;
        }
        cVar3.f8161f = str11;
        C2736c cVar4 = this.f102993l;
        if (bVar == null || (dVar4 = bVar.f104115j) == null) {
            str12 = null;
        } else {
            str12 = dVar4.f104121a;
        }
        cVar4.f8160e = str12;
        C2736c cVar5 = this.f102993l;
        if (bVar == null || (dVar3 = bVar.f104115j) == null) {
            str13 = null;
        } else {
            str13 = dVar3.f104123c;
        }
        cVar5.f8163h = str13;
        C2736c cVar6 = this.f102993l;
        if (bVar != null) {
            str14 = bVar.f104110e;
        } else {
            str14 = null;
        }
        cVar6.f8170o = str14;
        C2736c cVar7 = this.f102993l;
        if (bVar == null || (dVar2 = bVar.f104115j) == null) {
            str15 = null;
        } else {
            str15 = dVar2.f104124d;
        }
        cVar7.f8165j = str15;
        C2736c cVar8 = this.f102993l;
        if (bVar != null) {
            str16 = bVar.f104116k;
        } else {
            str16 = null;
        }
        cVar8.f8167l = str16;
        C2736c cVar9 = this.f102993l;
        if (!(bVar == null || (dVar = bVar.f104115j) == null)) {
            str17 = dVar.f104125e;
        }
        cVar9.f8169n = str17;
        this.f102993l.f8164i = C44070d.m86904a(C44070d.m86906a(aVar.f103002h, true));
        C2736c cVar10 = this.f102993l;
        C44085n nVar = aVar.f103002h;
        if (nVar == null || (pVar = nVar.f102788a) == null || (isChooseSave = pVar.isChooseSave()) == null) {
            z = false;
        } else {
            z = isChooseSave.booleanValue();
        }
        cVar10.f8168m = z;
        this.f102993l.f8162g = kVar;
        this.f102993l.f8156d = C89041ag.m154428c(m86958a());
    }
}
