package com.p2082ss.android.ugc.aweme.ecommerce;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.sdk.webview.C30248e;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethodBullet;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.OpenThirdPartyAppMethod;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.OpenThirdPartyAppMethodBullet;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.PhoneCountryCodeTranslateMethod;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.PhoneCountryCodeTranslateMethodBullet;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.PrefetchSchemaBulletMethod;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.PrefetchSchemaJavaMethod;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.UpdateNonceMethod;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.UpdateNonceMethodBullet;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.VerificationCheckMethod;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.VerificationCheckMethodBullet;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterEntry;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43322e;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43324g;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43326i;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43328k;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43330m;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43332o;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45235a;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45237b;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45241c;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45243d;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45245e;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45247f;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45257g;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.router.SchemaFallbackConfig;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.repository.C45362b;
import com.p2082ss.android.ugc.aweme.ecommerce.service.AbstractC45377b;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo.C45381a;
import com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo.ProductBaseEpt;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.C45418c;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ECommerceService */
public final class ECommerceService implements IECommerceService {
    private final C45257g fallbackInterceptor;
    private final List<IInterceptor> interceptors;
    private final List<IInterceptor> pipeInterceptors = C89070n.m154516a(new C45245e());

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ECommerceService$c */
    static final class C43307c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C43307c f101079a = new C43307c();

        static {
            Covode.recordClassIndex(51517);
        }

        C43307c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ECommerceService$d */
    static final class C43308d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C43308d f101080a = new C43308d();

        static {
            Covode.recordClassIndex(51518);
        }

        C43308d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ECommerceService$f */
    public static final class C43310f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C43310f f101082a = new C43310f();

        static {
            Covode.recordClassIndex(51520);
        }

        C43310f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(51513);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_ECommerceService_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m86438xfecde00(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final List<IInterceptor> getEComPipeRouterInterceptors() {
        return this.pipeInterceptors;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final List<IInterceptor> getECommerceRouterInterceptors() {
        return this.interceptors;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final AbstractC45377b getOrderCenterEntry() {
        return new OrderCenterEntry();
    }

    public final C45381a getCommonResource() {
        C43322e b = C43326i.m86445b();
        return new C45381a(b.f101104c, b.f101105d);
    }

    public ECommerceService() {
        C45257g gVar = new C45257g();
        this.fallbackInterceptor = gVar;
        this.interceptors = C89070n.m154522b(gVar, new C45241c(), new C45243d(), new C45235a(), new C45247f(), new C45237b());
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ECommerceService$g */
    static final class RunnableC43311g implements Runnable {

        /* renamed from: a */
        public static final RunnableC43311g f101083a = new RunnableC43311g();

        static {
            Covode.recordClassIndex(51521);
        }

        RunnableC43311g() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService.RunnableC43311g.run():void");
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ECommerceService$g$a */
        static final class C43312a extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

            /* renamed from: a */
            public static final C43312a f101084a = new C43312a();

            static {
                Covode.recordClassIndex(51522);
            }

            C43312a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
                C45544c.C45545a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                aVar2.mo76752b("EVENT_ORIGIN_FEATURE", "TEMAI");
                aVar2.mo76752b("page_name", "third_party_page");
                aVar2.mo76752b("tips_title", "third_party_disclaimer");
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ECommerceService$a */
    static final class C43304a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f101072a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f101073b;

        /* renamed from: c */
        final /* synthetic */ Context f101074c;

        static {
            Covode.recordClassIndex(51514);
        }

        C43304a(int i, AbstractC89172b bVar, Context context) {
            this.f101072a = i;
            this.f101073b = bVar;
            this.f101074c = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ProductBaseEpt productBaseEpt;
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            AbstractC89172b bVar = this.f101073b;
            if (bVar != null) {
                ProductBase productBase = productPackStruct.f104677e;
                if (productBase != null) {
                    productBaseEpt = productBase.mo76003a();
                } else {
                    productBaseEpt = null;
                }
                bVar.invoke(productBaseEpt);
            }
        }
    }

    public static IECommerceService createIECommerceServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(8257);
        Object a = C81908b.m141854a(IECommerceService.class, z);
        if (a != null) {
            IECommerceService iECommerceService = (IECommerceService) a;
            MethodCollector.m26664o(8257);
            return iECommerceService;
        }
        if (C81908b.f183228be == null) {
            synchronized (IECommerceService.class) {
                try {
                    if (C81908b.f183228be == null) {
                        C81908b.f183228be = new ECommerceService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8257);
                    throw th;
                }
            }
        }
        ECommerceService eCommerceService = (ECommerceService) C81908b.f183228be;
        MethodCollector.m26664o(8257);
        return eCommerceService;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final List<AbstractC16183k> getJSMethods(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PhoneCountryCodeTranslateMethodBullet(bVar));
        arrayList.add(new VerificationCheckMethodBullet(bVar));
        arrayList.add(new OpenThirdPartyAppMethodBullet(bVar));
        arrayList.add(new GetInfoByOCRMethodBullet(bVar));
        arrayList.add(new UpdateNonceMethodBullet(bVar));
        arrayList.add(new PrefetchSchemaBulletMethod(bVar));
        return arrayList;
    }

    public final boolean isFallbackContainsUri(Uri uri) {
        C89219l.m154721d(uri, "");
        C45257g gVar = this.fallbackInterceptor;
        C89219l.m154721d(uri, "");
        if (gVar.f105492a == null) {
            return false;
        }
        HashMap<String, SchemaFallbackConfig> hashMap = gVar.f105492a;
        if (hashMap == null) {
            C89219l.m154710a("configMap");
        }
        return hashMap.containsKey(C45257g.m87834a(uri));
    }

    public final void updateFallbackConfig(Map<String, String> map) {
        C89219l.m154721d(map, "");
        HashMap<String, SchemaFallbackConfig> hashMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new SchemaFallbackConfig(entry.getKey(), entry.getValue()));
        }
        C45257g gVar = this.fallbackInterceptor;
        C89219l.m154721d(hashMap, "");
        gVar.f105492a = hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ECommerceService$b */
    static final class C43305b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SemiPdpStarter.SemiPdpEnterParams f101075a;

        /* renamed from: b */
        final /* synthetic */ int f101076b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f101077c;

        static {
            Covode.recordClassIndex(51515);
        }

        C43305b(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, int i, AbstractC89172b bVar) {
            this.f101075a = semiPdpEnterParams;
            this.f101076b = i;
            this.f101077c = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<ProductPackStruct> list;
            AbstractC89172b bVar;
            C22099u uVar = (C22099u) obj;
            if (C43326i.m86444a() > 0) {
                ExecutorC34605m.f81660a.mo61064a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService.C43305b.RunnableC433061 */

                    /* renamed from: a */
                    final /* synthetic */ C43305b f101078a;

                    static {
                        Covode.recordClassIndex(51516);
                    }

                    {
                        this.f101078a = r1;
                    }

                    public final void run() {
                        C45362b.m87934a(this.f101078a.f101075a.getRequestParams());
                    }
                }, (long) C43326i.m86444a());
            }
            T t = uVar.f52262b;
            if (t.isCodeOK()) {
                T t2 = t.data;
                ProductBaseEpt productBaseEpt = null;
                if (t2 != null && (list = t2.f104725a) != null && C89070n.m154583g((List) list) != null && (bVar = this.f101077c) != null) {
                    ProductBase productBase = ((ProductPackStruct) C89070n.m154579f((List) t.data.f104725a)).f104677e;
                    if (productBase != null) {
                        productBaseEpt = productBase.mo76003a();
                    }
                    bVar.invoke(productBaseEpt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ECommerceService$e */
    public static final class C43309e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C43309e f101081a = new C43309e();

        static {
            Covode.recordClassIndex(51519);
        }

        C43309e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<ProductPackStruct> list;
            C89391z zVar;
            C43612a aVar = (C43612a) obj;
            C89219l.m154716b(aVar, "");
            C89219l.m154721d(aVar, "");
            T t = aVar.data;
            if (!(t == null || (list = t.f104725a) == null)) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                for (T t2 : list) {
                    String str = t2.f104674b;
                    if (str != null) {
                        C45418c.f105824b.mo33457a(str, t2);
                        zVar = C89391z.f203057a;
                    } else {
                        zVar = null;
                    }
                    arrayList.add(zVar);
                }
            }
        }
    }

    private final void prefetchSkuBatch(String str) {
        C43330m mVar;
        C43332o oVar;
        Boolean bool;
        IPdpStarter.PdpEnterParam schema2EnterParamForSku;
        if (str != null && str.length() != 0 && (mVar = C43324g.m86443b().f101097b) != null && (oVar = mVar.f101125a) != null && (bool = oVar.f101128a) != null && bool.booleanValue()) {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            if (C89219l.m154714a((Object) parse.getHost(), (Object) "ec") && C89219l.m154714a((Object) parse.getPath(), (Object) "/sku") && (schema2EnterParamForSku = schema2EnterParamForSku(str)) != null) {
                AbstractC44834a.C44835a.m87545a().mo75950a(schema2EnterParamForSku).mo143254a(C43309e.f101081a, C43310f.f101082a);
            }
        }
    }

    private final IPdpStarter.PdpEnterParam schema2EnterParam(String str) {
        Object obj;
        Object obj2;
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            if (!(!C89219l.m154714a((Object) parse.getHost(), (Object) "ec"))) {
                if (!(!C89219l.m154714a((Object) parse.getPath(), (Object) "/pdp"))) {
                    try {
                        obj = C45264j.m87844a().mo46670a(parse.getQueryParameter("requestParams"), HashMap.class);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    HashMap hashMap = (HashMap) obj;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    try {
                        obj2 = C45264j.m87844a().mo46670a(parse.getQueryParameter("trackParams"), HashMap.class);
                    } catch (Exception unused2) {
                        obj2 = null;
                    }
                    HashMap hashMap2 = (HashMap) obj2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (hashMap2 != null) {
                        linkedHashMap.putAll(hashMap2);
                    }
                    linkedHashMap.remove("product_id");
                    linkedHashMap.remove("author_id");
                    if (hashMap2 != null) {
                        hashMap2.put("entrance_info", C80342dg.m139300a().mo46674b(linkedHashMap));
                    }
                    return new IPdpStarter.PdpEnterParam(hashMap, null, hashMap2, null, false, 0.0f, null, false, false, false, null, 2032, null);
                }
            }
            return null;
        } catch (Exception unused3) {
            m86438xfecde00("PdpStarterOptimized", "ParseUrl Failed");
            return null;
        }
    }

    private final IPdpStarter.PdpEnterParam schema2EnterParamForSku(String str) {
        Object obj;
        Object obj2;
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            if (!(!C89219l.m154714a((Object) parse.getHost(), (Object) "ec"))) {
                if (!(!C89219l.m154714a((Object) parse.getPath(), (Object) "/sku"))) {
                    try {
                        obj = C45264j.m87844a().mo46670a(parse.getQueryParameter("requestParams"), HashMap.class);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    HashMap hashMap = (HashMap) obj;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    try {
                        obj2 = C45264j.m87844a().mo46670a(parse.getQueryParameter("trackParams"), HashMap.class);
                    } catch (Exception unused2) {
                        obj2 = null;
                    }
                    HashMap hashMap2 = (HashMap) obj2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (hashMap2 != null) {
                        linkedHashMap.putAll(hashMap2);
                    }
                    linkedHashMap.remove("product_id");
                    linkedHashMap.remove("author_id");
                    if (hashMap2 != null) {
                        hashMap2.put("entrance_info", C80342dg.m139300a().mo46674b(linkedHashMap));
                    }
                    return new IPdpStarter.PdpEnterParam(hashMap, null, null, null, false, 0.0f, null, false, false, false, null, 2032, null);
                }
            }
            return null;
        } catch (Exception unused3) {
            m86438xfecde00("PdpStarterOptimized", "ParseUrl Failed");
            return null;
        }
    }

    private final SemiPdpStarter.SemiPdpEnterParams schema2SemiEnterParam(String str) {
        Object obj;
        Object obj2;
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            if (!(!C89219l.m154714a((Object) parse.getHost(), (Object) "ec"))) {
                if (!(!C89219l.m154714a((Object) parse.getPath(), (Object) "/semi_pdp"))) {
                    try {
                        obj = C45264j.m87844a().mo46670a(parse.getQueryParameter("requestParams"), HashMap.class);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    HashMap hashMap = (HashMap) obj;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    try {
                        obj2 = C45264j.m87844a().mo46670a(parse.getQueryParameter("trackParams"), HashMap.class);
                    } catch (Exception unused2) {
                        obj2 = null;
                    }
                    HashMap hashMap2 = (HashMap) obj2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (hashMap2 != null) {
                        linkedHashMap.putAll(hashMap2);
                    }
                    linkedHashMap.remove("product_id");
                    linkedHashMap.remove("author_id");
                    if (hashMap2 != null) {
                        hashMap2.put("entrance_info", C80342dg.m139300a().mo46674b(linkedHashMap));
                    }
                    return new SemiPdpStarter.SemiPdpEnterParams(hashMap, false, hashMap2);
                }
            }
            return null;
        } catch (Exception unused3) {
            m86438xfecde00("PdpStarterOptimized", "ParseUrl Failed");
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void postEvent(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        C39162r.m79461a(str, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void prefetchPdp(String str, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        prefetchPdp(str, context, 1, null);
    }

    public final void preLinkPdp(String str, Context context) {
        IPdpStarter.PdpEnterParam schema2EnterParam;
        C89219l.m154721d(str, "");
        if (C43328k.m86447a() && (schema2EnterParam = schema2EnterParam(str)) != null) {
            AbstractC44834a.C44835a.m87545a().mo75952b(schema2EnterParam);
            if ((context instanceof Activity) && !schema2EnterParam.isPromotionPage() && !schema2EnterParam.getFullScreen()) {
                C44766a.m87493a((Activity) context).mo75886b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void showThirdpartyDisclaimerTips(Context context, String str) {
        if (context != null && str != null && !(!C89219l.m154714a((Object) "1", (Object) Uri.parse(str).getQueryParameter("outer_ecom_product")))) {
            new Handler(Looper.getMainLooper()).postDelayed(RunnableC43311g.f101083a, 1000);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void addJSMethods(C30248e eVar, WeakReference<Context> weakReference) {
        if (eVar != null) {
            eVar.mo53711a("phoneCountryCodeTranslate", new PhoneCountryCodeTranslateMethod(eVar.f72166b));
            eVar.mo53711a("verificationCheck", new VerificationCheckMethod(eVar.f72166b));
            eVar.mo53711a("openThirdPartyApp", new OpenThirdPartyAppMethod(eVar.f72166b));
            eVar.mo53711a("pipo.getInfoByOcr", new GetInfoByOCRMethod(eVar.f72166b));
            eVar.mo53711a("pipo.updateNonce", new UpdateNonceMethod(eVar.f72166b));
            eVar.mo53711a("prefetchSchema", new PrefetchSchemaJavaMethod(eVar.f72166b));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void prefetchSchema(String str, Context context) {
        String path;
        if (str != null && str.length() != 0) {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            if (C89219l.m154714a((Object) parse.getHost(), (Object) "ec") && (path = parse.getPath()) != null) {
                int hashCode = path.hashCode();
                if (hashCode != -2122208806) {
                    if (hashCode != 1511021) {
                        if (hashCode == 1514126 && path.equals("/sku")) {
                            prefetchSkuBatch(str);
                            return;
                        }
                        return;
                    } else if (!path.equals("/pdp")) {
                        return;
                    }
                } else if (!path.equals("/semi_pdp")) {
                    return;
                }
                prefetchPdp(str, context, 3, null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void prefetchPdp(String str, Context context, int i, AbstractC89172b<? super ProductBaseEpt, C89391z> bVar) {
        SemiPdpStarter.SemiPdpEnterParams schema2SemiEnterParam;
        IPdpStarter.PdpEnterParam schema2EnterParam;
        C89219l.m154721d(str, "");
        if (C43328k.m86447a()) {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            if (!C89219l.m154714a((Object) parse.getHost(), (Object) "ec")) {
                return;
            }
            if (C89219l.m154714a((Object) parse.getPath(), (Object) "/pdp") || C89219l.m154714a((Object) parse.getPath(), (Object) "/semi_pdp")) {
                if (C89219l.m154714a((Object) parse.getPath(), (Object) "/pdp") && (schema2EnterParam = schema2EnterParam(str)) != null) {
                    AbstractC44834a.C44836b.m87546a(AbstractC44834a.C44835a.m87545a(), schema2EnterParam, i, false).f104626c.mo143254a(new C43304a(i, bVar, context), C43307c.f101079a);
                    if ((context instanceof Activity) && !schema2EnterParam.isPromotionPage() && !schema2EnterParam.getFullScreen()) {
                        C44766a.m87493a((Activity) context).mo75886b();
                    }
                }
                if (C89219l.m154714a((Object) parse.getPath(), (Object) "/semi_pdp") && (schema2SemiEnterParam = schema2SemiEnterParam(str)) != null) {
                    C45362b.m87933a(schema2SemiEnterParam, i).f105697a.mo143254a(new C43305b(schema2SemiEnterParam, i, bVar), C43308d.f101080a);
                }
            }
        }
    }
}
