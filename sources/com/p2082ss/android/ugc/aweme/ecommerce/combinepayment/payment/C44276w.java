package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.ecommerce.p153a.C2750j;
import com.bytedance.android.ecommerce.p153a.p154a.C2736c;
import com.bytedance.android.ecommerce.p153a.p154a.C2737d;
import com.bytedance.android.ecommerce.p153a.p155b.C2741c;
import com.bytedance.android.ecommerce.p153a.p155b.C2742d;
import com.bytedance.android.ecommerce.p157c.AbstractC2770e;
import com.bytedance.android.ecommerce.p157c.AbstractC2771f;
import com.bytedance.android.ecommerce.p161g.EnumC2798a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44161t;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44077f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44079h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44087p;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.EnumC44082k;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a.C44627b;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a.C44629d;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45554b;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45572m;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w */
public final class C44276w {

    /* renamed from: a */
    static ActivityStack.AbstractC80170b f103251a;

    /* renamed from: b */
    public static final C44276w f103252b = new C44276w();

    private C44276w() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w$c */
    public static final class C44280c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f103264a;

        /* renamed from: b */
        final /* synthetic */ Context f103265b;

        static {
            Covode.recordClassIndex(52592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44280c(String str, Context context) {
            super(0);
            this.f103264a = str;
            this.f103265b = context;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo75199a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo75199a() {
            String str = this.f103264a;
            HashMap hashMap = new HashMap();
            hashMap.put("payment_status", "success");
            hashMap.put("pay_route", "h5");
            String builder = C45264j.m87845b(str, hashMap).toString();
            IBulletService f = BulletService.m71938f();
            Context context = this.f103265b;
            C89219l.m154716b(builder, "");
            f.mo61852a(context, builder);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w$a */
    public static final class C44277a implements ActivityStack.AbstractC80170b {

        /* renamed from: a */
        final /* synthetic */ long f103253a;

        /* renamed from: b */
        final /* synthetic */ C44170v f103254b;

        /* renamed from: c */
        final /* synthetic */ Context f103255c;

        /* renamed from: d */
        final /* synthetic */ AbstractC44169u f103256d;

        /* renamed from: e */
        final /* synthetic */ C44283f f103257e;

        /* renamed from: f */
        final /* synthetic */ String f103258f;

        /* renamed from: g */
        final /* synthetic */ String f103259g;

        /* renamed from: h */
        final /* synthetic */ List f103260h;

        /* renamed from: i */
        final /* synthetic */ C44282e f103261i;

        static {
            Covode.recordClassIndex(52589);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.ActivityStack.AbstractC80170b
        /* renamed from: a */
        public final void mo69456a() {
            C45544c.m88081a("rd_tiktokec_ecommerce_envoke_app", new AbstractC89172b<C45544c.C45545a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44276w.C44277a.C442781 */

                /* renamed from: a */
                final /* synthetic */ C44277a f103262a;

                static {
                    Covode.recordClassIndex(52590);
                }

                {
                    this.f103262a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
                    C45544c.C45545a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    C45544c.C45545a.m88084a(aVar2, this.f103262a.f103254b.f102988g);
                    aVar2.mo76752b("page_name", C44276w.m86999a(this.f103262a.f103258f));
                    aVar2.mo76752b("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.f103262a.f103253a));
                    return C89391z.f203057a;
                }
            });
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.ActivityStack.AbstractC80170b
        /* renamed from: b */
        public final void mo69457b() {
            String str;
            if (C89219l.m154714a((Object) this.f103258f, (Object) "ordersubmit")) {
                IBulletService f = BulletService.m71938f();
                Application a = C17879g.m33104a();
                C89219l.m154716b(a, "");
                String str2 = this.f103259g;
                List list = this.f103260h;
                if (list != null) {
                    str = (String) C89070n.m154579f(list);
                } else {
                    str = null;
                }
                f.mo61852a(a, C44276w.m87002a(str2, str, this.f103258f, this.f103254b.f102987f, this.f103254b.f102988g, null));
            }
            ActivityStack.removeAppBackGroundListener(this);
            C44276w.f103251a = null;
        }

        C44277a(long j, C44170v vVar, Context context, AbstractC44169u uVar, C44283f fVar, String str, String str2, List list, C44282e eVar) {
            this.f103253a = j;
            this.f103254b = vVar;
            this.f103255c = context;
            this.f103256d = uVar;
            this.f103257e = fVar;
            this.f103258f = str;
            this.f103259g = str2;
            this.f103260h = list;
            this.f103261i = eVar;
        }
    }

    static {
        Covode.recordClassIndex(52588);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w$e */
    public static final class C44282e extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f103269a;

        /* renamed from: b */
        final /* synthetic */ String f103270b;

        /* renamed from: c */
        final /* synthetic */ Context f103271c;

        static {
            Covode.recordClassIndex(52594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44282e(String str, String str2, Context context) {
            super(1);
            this.f103269a = str;
            this.f103270b = str2;
            this.f103271c = context;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            mo75201a(str);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo75201a(String str) {
            C89219l.m154721d(str, "");
            if (C89219l.m154714a((Object) this.f103269a, (Object) "ordersubmit")) {
                SmartRouter.buildRoute(this.f103271c, C45264j.m87845b("aweme://echybrid/intercept_back", C89041ag.m154428c(C89387v.m154943a("url", str), C89387v.m154943a("back_open_url", C45264j.m87841a("aweme://echybrid", C89041ag.m154428c(C89387v.m154943a("url", this.f103270b))).toString()))).toString()).open();
                return;
            }
            SmartRouter.buildRoute(this.f103271c, C45264j.m87845b("aweme://echybrid", C89041ag.m154428c(C89387v.m154943a("url", str))).toString()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w$g */
    public static final class C44285g implements AbstractC2771f {

        /* renamed from: a */
        final /* synthetic */ C44280c f103276a;

        /* renamed from: b */
        final /* synthetic */ C44281d f103277b;

        /* renamed from: c */
        final /* synthetic */ AbstractC44169u f103278c;

        static {
            Covode.recordClassIndex(52597);
        }

        C44285g(C44280c cVar, C44281d dVar, AbstractC44169u uVar) {
            this.f103276a = cVar;
            this.f103277b = dVar;
            this.f103278c = uVar;
        }

        @Override // com.bytedance.android.ecommerce.p157c.AbstractC2771f
        /* renamed from: a */
        public final void mo7353a(C2742d dVar) {
            C89219l.m154716b(dVar, "");
            if (dVar.f8212h == EnumC2798a.SUCCESS) {
                this.f103276a.mo75199a();
            } else {
                this.f103277b.mo75200a(dVar.f8210f, null);
            }
            AbstractC44169u uVar = this.f103278c;
            if (uVar != null) {
                uVar.mo74428a();
            }
        }
    }

    /* renamed from: a */
    public static String m86999a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1747807002) {
            if (hashCode != -390864660) {
                if (hashCode == 2103471391 && str.equals("orderdetail")) {
                    return "order_detail";
                }
                return "";
            } else if (str.equals("orderlist")) {
                return "ecommerce_centre_page";
            } else {
                return "";
            }
        } else if (str.equals("ordersubmit")) {
            return "order_submit";
        } else {
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w$b */
    public static final class C44279b implements AbstractC2770e {

        /* renamed from: a */
        final /* synthetic */ C44170v f103263a;

        static {
            Covode.recordClassIndex(52591);
        }

        C44279b(C44170v vVar) {
            this.f103263a = vVar;
        }

        @Override // com.bytedance.android.ecommerce.p157c.AbstractC2770e
        /* renamed from: a */
        public final void mo7352a(C2741c cVar) {
            String str;
            EnumC44082k kVar;
            C89219l.m154716b(cVar, "");
            C2750j jVar = cVar.f8205f;
            if (jVar != null) {
                str = jVar.f8274d;
            } else {
                str = null;
            }
            String str2 = cVar.f8193c;
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != -1867169789) {
                    if (hashCode == -776144932 && str2.equals("redirect")) {
                        kVar = EnumC44082k.REDIRECT;
                        C44077f fVar = new C44077f(str, kVar, new C44079h(cVar.f8194d, ""));
                        C44170v vVar = this.f103263a;
                        vVar.f102985d = fVar;
                        C44276w.m87003a(vVar);
                    }
                } else if (str2.equals("success")) {
                    kVar = EnumC44082k.DONE;
                    C44077f fVar2 = new C44077f(str, kVar, new C44079h(cVar.f8194d, ""));
                    C44170v vVar2 = this.f103263a;
                    vVar2.f102985d = fVar2;
                    C44276w.m87003a(vVar2);
                }
            }
            kVar = EnumC44082k.ERROR;
            C44077f fVar22 = new C44077f(str, kVar, new C44079h(cVar.f8194d, ""));
            C44170v vVar22 = this.f103263a;
            vVar22.f102985d = fVar22;
            C44276w.m87003a(vVar22);
        }
    }

    /* renamed from: a */
    public static void m87003a(C44170v vVar) {
        String str;
        boolean z;
        String str2;
        Object obj;
        char c;
        char c2;
        int i;
        String str3;
        C44086o oVar;
        String str4;
        String str5;
        String str6;
        C44086o oVar2;
        C44086o oVar3;
        C44086o oVar4;
        String str7;
        String str8;
        String str9;
        String str10;
        C44629d dVar;
        C44086o oVar5;
        String str11 = "";
        C89219l.m154721d(vVar, str11);
        Context context = vVar.f102982a;
        C44077f fVar = vVar.f102985d;
        List<String> list = vVar.f102983b;
        String str12 = vVar.f102984c;
        AbstractC44169u uVar = vVar.f102991j;
        C2737d dVar2 = vVar.f102992k;
        C2736c cVar = vVar.f102993l;
        String str13 = vVar.f102989h;
        if (str13 == null) {
            str13 = str11;
        }
        if (list != null) {
            str = (String) C89070n.m154579f((List) list);
        } else {
            str = null;
        }
        C44085n nVar = vVar.f102987f;
        Map<String, Object> map = vVar.f102988g;
        Boolean bool = vVar.f102994m;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        String a = m87002a(str12, str, str13, nVar, map, Integer.valueOf(i2));
        cVar.f8166k = a;
        Map<String, Object> map2 = vVar.f102988g;
        C44085n nVar2 = vVar.f102987f;
        if (nVar2 == null || (oVar5 = nVar2.f102789b) == null || (str2 = oVar5.mo74952c()) == null) {
            str2 = str11;
        }
        map2.put("pay_type", str2);
        Map<String, Object> map3 = vVar.f102988g;
        if (str12 != null) {
            obj = str12;
        } else if (list == null || (obj = C89070n.m154579f((List) list)) == null) {
            obj = str11;
        }
        map3.put("order_id", obj);
        C44280c cVar2 = new C44280c(a, context);
        C44281d dVar3 = new C44281d(str13, a, context);
        C44282e eVar = new C44282e(str13, a, context);
        C44283f fVar2 = new C44283f(vVar, str13);
        if (fVar == null) {
            String str14 = vVar.f102990i;
            if (str14 != null) {
                SmartRouter.buildRoute(context, str14).open();
            }
            if (uVar != null) {
                uVar.mo74428a();
                return;
            }
            return;
        }
        EnumC44082k kVar = fVar.f102757b;
        if (kVar != null) {
            int i5 = C44286x.f103279a[kVar.ordinal()];
            if (i5 == 1) {
                C44287y.m87012a().mo7359a(dVar2, new C44285g(cVar2, dVar3, uVar));
            } else if (i5 == 2) {
                String str15 = fVar.f102756a;
                if (str15 != null) {
                    Uri parse = Uri.parse(str15);
                    C89219l.m154716b(parse, str11);
                    if (C89219l.m154714a((Object) parse.getScheme(), (Object) "aweme") && C89219l.m154714a((Object) parse.getHost(), (Object) "ec")) {
                        String queryParameter = parse.getQueryParameter("url");
                        if (queryParameter != null) {
                            String path = parse.getPath();
                            if (path != null) {
                                int hashCode = path.hashCode();
                                if (hashCode != -1169490130) {
                                    if (hashCode != -478974217) {
                                        if (hashCode == 1720098852 && path.equals("/payment_redirect")) {
                                            C45264j.m87841a(queryParameter, C89041ag.m154428c(C89387v.m154943a("trackParams", vVar.f102988g)));
                                            eVar.mo75201a(queryParameter);
                                        }
                                    } else if (path.equals("/payment")) {
                                        SmartRouter.buildRoute(context, C45264j.m87845b(str15, C89041ag.m154428c(C89387v.m154943a("trackParams", vVar.f102988g), C89387v.m154943a("cashier", vVar.f102986e), C89387v.m154943a("source", str13))).toString()).open();
                                    }
                                } else if (path.equals("/payment_deeplink")) {
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    C44085n nVar3 = vVar.f102987f;
                                    if (nVar3 == null || (oVar4 = nVar3.f102789b) == null || (str3 = oVar4.f102803j) == null) {
                                        str3 = str11;
                                    }
                                    if (C45572m.m88115a(context, str3, queryParameter)) {
                                        if (uVar != null) {
                                            uVar.mo74429b();
                                        }
                                        C44085n nVar4 = vVar.f102987f;
                                        if (nVar4 == null || (oVar3 = nVar4.f102789b) == null || (str5 = oVar3.f102797d) == null) {
                                            str5 = str11;
                                        }
                                        fVar2.mo75202a(true, str5);
                                        C44277a aVar = new C44277a(elapsedRealtime, vVar, context, uVar, fVar2, str13, str12, list, eVar);
                                        f103251a = aVar;
                                        ActivityStack.addAppBackGroundListener(aVar);
                                        if (!C89219l.m154714a((Object) str13, (Object) "ordersubmit")) {
                                            IEventCenter a2 = EventCenter.m87158a();
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("payment_status", "paying");
                                            C44085n nVar5 = vVar.f102987f;
                                            if (nVar5 == null || (oVar2 = nVar5.f102789b) == null || (str6 = oVar2.f102797d) == null) {
                                                str6 = str11;
                                            }
                                            jSONObject.put("payment_method", str6);
                                            String jSONObject2 = jSONObject.toString();
                                            C89219l.m154716b(jSONObject2, str11);
                                            a2.mo75479a("ec_order_payment_status", jSONObject2);
                                        }
                                    } else {
                                        C44085n nVar6 = vVar.f102987f;
                                        if (!(nVar6 == null || (oVar = nVar6.f102789b) == null || (str4 = oVar.f102797d) == null)) {
                                            str11 = str4;
                                        }
                                        fVar2.mo75202a(false, str11);
                                        eVar.mo75201a(queryParameter);
                                    }
                                } else {
                                    c = 0;
                                    c2 = 1;
                                    i = 2;
                                    C89378p[] pVarArr = new C89378p[i];
                                    pVarArr[c] = C89387v.m154943a("source", str13);
                                    pVarArr[c2] = C89387v.m154943a("trackParams", vVar.f102988g);
                                    SmartRouter.buildRoute(context, C45264j.m87845b(queryParameter, C89041ag.m154428c(pVarArr)).toString()).open();
                                }
                            }
                            c = 0;
                            i = 2;
                            c2 = 1;
                            C89378p[] pVarArr2 = new C89378p[i];
                            pVarArr2[c] = C89387v.m154943a("source", str13);
                            pVarArr2[c2] = C89387v.m154943a("trackParams", vVar.f102988g);
                            SmartRouter.buildRoute(context, C45264j.m87845b(queryParameter, C89041ag.m154428c(pVarArr2)).toString()).open();
                        }
                    } else if (C89219l.m154714a((Object) parse.getScheme(), (Object) "http") || C89219l.m154714a((Object) parse.getScheme(), (Object) "https")) {
                        eVar.mo75201a(str15);
                    } else {
                        SmartRouter.buildRoute(context, C45264j.m87845b(str15, C89041ag.m154428c(C89387v.m154943a("source", str13), C89387v.m154943a("trackParams", vVar.f102988g))).toString()).open();
                    }
                }
                if (uVar != null) {
                    uVar.mo74428a();
                }
            } else if (i5 == 3) {
                C44287y.m87012a().mo7358a(cVar, new C44279b(vVar));
            } else if (i5 == 4) {
                C44079h hVar = fVar.f102758c;
                if (hVar != null) {
                    str7 = hVar.f102765a;
                } else {
                    str7 = null;
                }
                C44079h hVar2 = fVar.f102758c;
                if (hVar2 != null) {
                    str8 = hVar2.f102766b;
                } else {
                    str8 = null;
                }
                dVar3.mo75200a(str7, str8);
                if (uVar != null) {
                    uVar.mo74428a();
                }
                C44627b bVar = vVar.f102986e;
                if (bVar == null || (dVar = bVar.f104115j) == null) {
                    str9 = null;
                } else {
                    str9 = dVar.f104124d;
                }
                Object obj2 = vVar.f102988g.get("previous_page");
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str16 = (String) obj2;
                C44079h hVar3 = fVar.f102758c;
                if (hVar3 != null) {
                    str10 = hVar3.f102765a;
                } else {
                    str10 = null;
                }
                C44161t.C44162a.m86955a(str9, str16, str10);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w$d */
    public static final class C44281d extends AbstractC89220m implements AbstractC89183m<String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f103266a;

        /* renamed from: b */
        final /* synthetic */ String f103267b;

        /* renamed from: c */
        final /* synthetic */ Context f103268c;

        static {
            Covode.recordClassIndex(52593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44281d(String str, String str2, Context context) {
            super(2);
            this.f103266a = str;
            this.f103267b = str2;
            this.f103268c = context;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, String str2) {
            mo75200a(str, str2);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo75200a(String str, String str2) {
            if (str2 == null || !(!C89361p.m154870a((CharSequence) str2))) {
                C44290z.m87016a(str);
            } else {
                new C79459a(C17867d.m33078a()).mo123052a(str2).mo123053a();
            }
            if (C89219l.m154714a((Object) this.f103266a, (Object) "ordersubmit")) {
                String str3 = this.f103267b;
                HashMap hashMap = new HashMap();
                hashMap.put("pay_route", "h5");
                String builder = C45264j.m87845b(str3, hashMap).toString();
                IBulletService f = BulletService.m71938f();
                Context context = this.f103268c;
                C89219l.m154716b(builder, "");
                f.mo61852a(context, builder);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w$f */
    public static final class C44283f extends AbstractC89220m implements AbstractC89183m<Boolean, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44170v f103272a;

        /* renamed from: b */
        final /* synthetic */ String f103273b;

        static {
            Covode.recordClassIndex(52595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44283f(C44170v vVar, String str) {
            super(2);
            this.f103272a = vVar;
            this.f103273b = str;
        }

        /* renamed from: a */
        public final void mo75202a(final boolean z, String str) {
            C89219l.m154721d(str, "");
            C45544c.m88081a("tiktokec_payroute_result", new AbstractC89172b<C45544c.C45545a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44276w.C44283f.C442841 */

                /* renamed from: a */
                final /* synthetic */ C44283f f103274a;

                static {
                    Covode.recordClassIndex(52596);
                }

                {
                    this.f103274a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
                    String str;
                    C45544c.C45545a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    C45544c.C45545a.m88084a(aVar2, this.f103274a.f103272a.f102988g);
                    aVar2.mo76752b("page_name", C44276w.m86999a(this.f103274a.f103273b));
                    aVar2.mo76752b("EVENT_ORIGIN_FEATURE", "TEMAI");
                    if (z) {
                        str = "app";
                    } else {
                        str = "h5";
                    }
                    aVar2.mo76752b("pay_route", str);
                    return C89391z.f203057a;
                }
            });
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, String str) {
            mo75202a(bool.booleanValue(), str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static String m87000a(String str, C44085n nVar, Map<String, ? extends Object> map) {
        Object obj;
        C89378p[] pVarArr = new C89378p[1];
        if (map == null || (obj = map.get("previous_page")) == null) {
            obj = "";
        }
        pVarArr[0] = C89387v.m154943a("previous_page", obj);
        String builder = C45264j.m87845b("snssdk1180://ec/order/middle_page", C89041ag.m154428c(C89387v.m154943a("url", m87002a(null, null, str, nVar, C89041ag.m154428c(pVarArr), null)))).toString();
        C89219l.m154716b(builder, "");
        return builder;
    }

    /* renamed from: a */
    public static String m87002a(String str, String str2, String str3, C44085n nVar, Map<String, ? extends Object> map, Integer num) {
        Boolean bool;
        String str4;
        C44086o oVar;
        C44087p pVar;
        String str5 = C45554b.m88105a() + "view/fe_tiktok_ecommerce_pay_middle/index.html/";
        C89378p[] pVarArr = new C89378p[7];
        C89378p a = C89387v.m154943a("main_order_id", str2);
        int i = 0;
        pVarArr[0] = a;
        pVarArr[1] = C89387v.m154943a("combo_id", str);
        String str6 = null;
        if (nVar == null || (pVar = nVar.f102788a) == null) {
            bool = null;
        } else {
            bool = pVar.isChooseSave();
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            str4 = "pay_and_bindcard";
        } else {
            str4 = "pay";
        }
        pVarArr[2] = C89387v.m154943a("channel_type", str4);
        pVarArr[3] = C89387v.m154943a("pay_source", str3);
        if (map == null) {
            map = new HashMap<>();
        }
        pVarArr[4] = C89387v.m154943a("trackParams", map);
        if (!(nVar == null || (oVar = nVar.f102789b) == null)) {
            str6 = oVar.mo74952c();
        }
        pVarArr[5] = C89387v.m154943a("pay_type", str6);
        if (num != null) {
            i = num.intValue();
        }
        pVarArr[6] = C89387v.m154943a("miss_cashback", Integer.valueOf(i));
        String builder = C45264j.m87845b(str5, C89041ag.m154428c(pVarArr)).toString();
        C89219l.m154716b(builder, "");
        return builder;
    }
}
