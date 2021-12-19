package com.p2082ss.android.ugc.aweme.base;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager */
public final class AnchorListManager {

    /* renamed from: a */
    public static final Keva f81420a;

    /* renamed from: b */
    static boolean f81421b;

    /* renamed from: c */
    static String f81422c;

    /* renamed from: d */
    public static int f81423d;

    /* renamed from: e */
    static Map<String, AnchorPublishStruct> f81424e;

    /* renamed from: f */
    public static final AnchorListManager f81425f = new AnchorListManager();

    /* renamed from: g */
    private static final String f81426g;

    /* renamed from: h */
    private static final AnchorListApi f81427h;

    /* renamed from: i */
    private static final AbstractC18099f f81428i;

    /* renamed from: j */
    private static final Keva f81429j;

    /* renamed from: k */
    private static final C27910f f81430k = new C27910f();

    /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$AnchorImpressionApi */
    public interface AnchorImpressionApi {
        static {
            Covode.recordClassIndex(41401);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/anchor/addlink/impression/report/")
        @AbstractC89721e
        C1731i<Object> postAnchorImpressionReport(@AbstractC89719c(mo144273a = "impression_list_json") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$AnchorListApi */
    public interface AnchorListApi {
        static {
            Covode.recordClassIndex(41402);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/anchor/list/")
        C1731i<C34465a> getAnchorList();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$c */
    public interface AbstractC34457c {
        static {
            Covode.recordClassIndex(41408);
        }

        /* renamed from: a */
        int mo60895a();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$f */
    public static final class C34461f extends C27895a<Map<String, AnchorPublishStruct>> {
        static {
            Covode.recordClassIndex(41412);
        }

        C34461f() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$h */
    public static final class C34463h extends C27895a<Map<String, AnchorPublishStruct>> {
        static {
            Covode.recordClassIndex(41414);
        }

        C34463h() {
        }
    }

    private AnchorListManager() {
    }

    /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$d */
    public static final class C34458d {
        @AbstractC27891c(mo46611a = "anchor_type")

        /* renamed from: a */
        public final String f81435a;

        static {
            Covode.recordClassIndex(41409);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C34458d) && C89219l.m154714a(this.f81435a, ((C34458d) obj).f81435a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f81435a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "AnchorLogExtra(impressionType=" + this.f81435a + ")";
        }

        private /* synthetic */ C34458d() {
            this("");
        }

        private C34458d(String str) {
            this.f81435a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$g */
    static final class CallableC34462g<V> implements Callable {

        /* renamed from: a */
        public static final CallableC34462g f81438a = new CallableC34462g();

        static {
            Covode.recordClassIndex(41413);
        }

        CallableC34462g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AnchorListManager.m70440g();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static boolean m70436b() {
        if (f81423d > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static Map<String, AnchorPublishStruct> m70438d() {
        return m70437c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$e */
    public static final class C34459e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C34459e f81436a = new C34459e();

        static {
            Covode.recordClassIndex(41410);
        }

        C34459e() {
        }

        /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$e$a */
        static final class CallableC34460a<V> implements Callable {

            /* renamed from: a */
            public static final CallableC34460a f81437a = new CallableC34460a();

            static {
                Covode.recordClassIndex(41411);
            }

            CallableC34460a() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                if (AnchorListManager.m70439e()) {
                    AnchorListManager.m70440g();
                }
                return C89391z.f203057a;
            }
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            Map map;
            C89219l.m154716b(iVar, "");
            C34465a aVar = (C34465a) iVar.mo5545d();
            if (aVar == null) {
                C39162r.m79460a("rd_tiktokec_shop_fetch_anchor_list", new C33744d().mo59983a("where", "AnchorListManager").mo59983a("error_code", "-1").mo59983a("error_msg", "anchorList result is null").f79943a);
            } else if (aVar.f81441a == 0) {
                AnchorListManager.f81421b = true;
                List<AnchorPublishStruct> list = aVar.f81443c;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        arrayList.add(C89387v.m154943a(AnchorListManager.m70434b((AnchorPublishStruct) t), t));
                    }
                    map = C89041ag.m154417a(arrayList);
                } else {
                    map = null;
                }
                Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct>");
                AnchorListManager.f81424e = C89206ad.m154686h(map);
                C1731i.m5640b(CallableC34462g.f81438a, C1731i.f5562a);
                AnchorListManager.f81422c = aVar.f81444d;
                AnchorListManager.m70435b(AnchorListManager.m70437c());
                AnchorListManager.m70433a(AnchorListManager.m70437c());
                ArrayList arrayList2 = new ArrayList();
                Map<String, AnchorPublishStruct> c = AnchorListManager.m70437c();
                if (c != null) {
                    for (Map.Entry<String, AnchorPublishStruct> entry : c.entrySet()) {
                        arrayList2.add(Integer.valueOf(entry.getValue().type));
                    }
                }
                C39162r.m79460a("rd_tiktokec_shop_fetch_anchor_list", new C33744d().mo59983a("where", "AnchorListManager").mo59983a("error_code", String.valueOf(aVar.f81441a)).mo59983a("error_msg", "anchorList fetch success").mo59983a("anchor_type", arrayList2.toString()).f79943a);
                C1731i.m5640b(CallableC34460a.f81437a, C1731i.f5562a);
            } else {
                C39162r.m79460a("rd_tiktokec_shop_fetch_anchor_list", new C33744d().mo59983a("where", "AnchorListManager").mo59983a("error_code", String.valueOf(aVar.f81441a)).mo59983a("error_msg", "anchorList statusCode is error").f79943a);
            }
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m70439e() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean enableAnchorCache = iESSettingsProxy.getEnableAnchorCache();
            C89219l.m154716b(enableAnchorCache, "");
            return enableAnchorCache.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static Map<String, AnchorPublishStruct> m70437c() {
        Map<String, AnchorPublishStruct> map;
        if (m70439e() && (((map = f81424e) == null || map.isEmpty()) && !f81421b)) {
            Map<String, AnchorPublishStruct> h = m70441h();
            m70435b(h);
            m70433a(h);
            f81424e = h;
        }
        return f81424e;
    }

    /* renamed from: h */
    private static Map<String, AnchorPublishStruct> m70441h() {
        try {
            Keva keva = f81420a;
            f81422c = keva.getString("anchor_region_keva", null);
            String string = keva.getString("anchor_map_key", null);
            if (!TextUtils.isEmpty(string)) {
                return (Map) f81430k.mo46671a(string, new C34461f().type);
            }
        } catch (Exception e) {
            C51423a.m95784a(3, null, "AnchorListManager getLocalData Exception: ".concat(String.valueOf(e)));
            C51423a.m95790a((Throwable) e);
            e.printStackTrace();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(41400);
        String str = "https://" + C17867d.f42587k.f42569a;
        f81426g = str;
        f81427h = (AnchorListApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(AnchorListApi.class);
        f81428i = RetrofitFactory.m33635a().mo28817b(str).mo28832d();
        Keva repo = Keva.getRepo("anchor_data_keva");
        C89219l.m154716b(repo, "");
        f81420a = repo;
        Keva repo2 = Keva.getRepo("fe-storage");
        C89219l.m154716b(repo2, "");
        f81429j = repo2;
    }

    /* renamed from: g */
    public static void m70440g() {
        Collection<AnchorPublishStruct> values;
        List j;
        AnchorPublishStruct anchorPublishStruct;
        try {
            Keva keva = f81420a;
            keva.storeString("anchor_map_key", f81430k.mo46675b(m70437c(), new C34463h().type));
            Map<String, AnchorPublishStruct> c = m70437c();
            if (!(c == null || (values = c.values()) == null || (j = C89070n.m154590j(values)) == null || (anchorPublishStruct = (AnchorPublishStruct) j.get(0)) == null)) {
                f81429j.storeString("ECOMMERCE_i18N_STORAGE_PROMPT_STRING", anchorPublishStruct.anchorTips);
            }
            keva.storeBoolean("anchor_local_map_success", true);
            String str = f81422c;
            if (str != null && str.length() > 0) {
                keva.storeString("anchor_region_keva", f81422c);
            }
        } catch (Exception e) {
            C51423a.m95784a(3, null, "AnchorListManager saveData Exception: ".concat(String.valueOf(e)));
            C51423a.m95790a((Throwable) e);
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public final List<AnchorPublishStruct> mo60889f() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Collection<AnchorPublishStruct> values;
        Collection<AnchorPublishStruct> values2;
        Map<String, AnchorPublishStruct> c = m70437c();
        if (c == null || (values2 = c.values()) == null) {
            arrayList = C89086z.INSTANCE;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (T t : values2) {
                if (t.isNew) {
                    arrayList3.add(t);
                }
            }
            arrayList = arrayList3;
        }
        Map<String, AnchorPublishStruct> d = m70438d();
        if (d == null || (values = d.values()) == null) {
            arrayList2 = C89086z.INSTANCE;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (T t2 : values) {
                if (!t2.isNew) {
                    arrayList4.add(t2);
                }
            }
            arrayList2 = arrayList4;
        }
        return C89070n.m154572d(arrayList, arrayList2);
    }

    /* renamed from: a */
    public static void m70432a() {
        f81427h.getAnchorList().mo5534a(C34459e.f81436a, C1731i.f5564c, null);
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$b */
    public static final class EnumC34453b extends Enum<EnumC34453b> implements AbstractC34457c {
        public static final EnumC34453b CreationPageEntered;
        public static final EnumC34453b TitleSeen;
        public static final EnumC34453b Unknown;

        /* renamed from: a */
        private static final /* synthetic */ EnumC34453b[] f81434a;

        static {
            Covode.recordClassIndex(41404);
            C34456c cVar = new C34456c("Unknown");
            Unknown = cVar;
            C34455b bVar = new C34455b("TitleSeen");
            TitleSeen = bVar;
            C34454a aVar = new C34454a("CreationPageEntered");
            CreationPageEntered = aVar;
            f81434a = new EnumC34453b[]{cVar, bVar, aVar};
        }

        public static EnumC34453b valueOf(String str) {
            return (EnumC34453b) Enum.valueOf(EnumC34453b.class, str);
        }

        public static EnumC34453b[] values() {
            return (EnumC34453b[]) f81434a.clone();
        }

        /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$b$a */
        static final class C34454a extends EnumC34453b {
            static {
                Covode.recordClassIndex(41405);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.AnchorListManager.AbstractC34457c
            /* renamed from: a */
            public final int mo60895a() {
                return 2;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C34454a(String str) {
                super(str, 2, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$b$b */
        static final class C34455b extends EnumC34453b {
            static {
                Covode.recordClassIndex(41406);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.AnchorListManager.AbstractC34457c
            /* renamed from: a */
            public final int mo60895a() {
                return 1;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C34455b(String str) {
                super(str, 1, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$b$c */
        static final class C34456c extends EnumC34453b {
            static {
                Covode.recordClassIndex(41407);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.AnchorListManager.AbstractC34457c
            /* renamed from: a */
            public final int mo60895a() {
                return 0;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C34456c(String str) {
                super(str, 0, null);
            }
        }

        private EnumC34453b(String str, int i) {
        }

        public /* synthetic */ EnumC34453b(String str, int i, C89214g gVar) {
            this(str, i);
        }
    }

    /* renamed from: a */
    private static C1731i<Object> m70428a(String str) {
        return ((AnchorImpressionApi) f81428i.mo28858a(AnchorImpressionApi.class)).postAnchorImpressionReport(str);
    }

    /* renamed from: a */
    public static String m70431a(AnchorPublishStruct anchorPublishStruct) {
        C89219l.m154721d(anchorPublishStruct, "");
        String str = anchorPublishStruct.logExtra;
        if (str == null) {
            return null;
        }
        Object a = f81430k.mo46670a(str, C34458d.class);
        C89219l.m154716b(a, "");
        C34458d dVar = (C34458d) a;
        if (dVar != null) {
            return dVar.f81435a;
        }
        return null;
    }

    /* renamed from: b */
    public static String m70434b(AnchorPublishStruct anchorPublishStruct) {
        C89219l.m154721d(anchorPublishStruct, "");
        return anchorPublishStruct.type + '(' + anchorPublishStruct.subtype + ')';
    }

    /* renamed from: a */
    public static C1731i<Object> m70429a(List<AnchorPublishStruct> list) {
        C89219l.m154721d(list, "");
        EnumC34453b bVar = EnumC34453b.TitleSeen;
        ArrayList arrayList = new ArrayList();
        for (AnchorPublishStruct anchorPublishStruct : list) {
            if (anchorPublishStruct.isNew) {
                arrayList.add(new C34452a(bVar.mo60895a(), anchorPublishStruct.type, anchorPublishStruct.subtype));
            }
        }
        String b = new C27910f().mo46674b(arrayList);
        C89219l.m154716b(b, "");
        return m70428a(b);
    }

    /* renamed from: b */
    public static void m70435b(Map<String, AnchorPublishStruct> map) {
        if (map != null) {
            for (Map.Entry<String, AnchorPublishStruct> entry : map.entrySet()) {
                AnchorPublishStruct value = entry.getValue();
                if (value.isNew) {
                    value.hadNew = true;
                }
            }
        }
    }

    /* renamed from: c */
    public final C1731i<Object> mo60888c(AnchorPublishStruct anchorPublishStruct) {
        AnchorPublishStruct anchorPublishStruct2;
        C89219l.m154721d(anchorPublishStruct, "");
        String b = m70434b(anchorPublishStruct);
        Map<String, AnchorPublishStruct> c = m70437c();
        if (!(c == null || (anchorPublishStruct2 = c.get(b)) == null)) {
            anchorPublishStruct2.isNew = false;
        }
        m70440g();
        String b2 = new C27910f().mo46674b(C89070n.m154524c(new C34452a(EnumC34453b.CreationPageEntered.mo60895a(), anchorPublishStruct.type, anchorPublishStruct.subtype)));
        C89219l.m154716b(b2, "");
        return m70428a(b2);
    }

    /* renamed from: a */
    public static void m70433a(Map<String, AnchorPublishStruct> map) {
        f81423d = 0;
        if (map != null) {
            for (Map.Entry<String, AnchorPublishStruct> entry : map.entrySet()) {
                if (entry.getValue().isNew) {
                    f81423d++;
                }
            }
        }
    }

    /* renamed from: a */
    public static AnchorPublishStruct m70430a(int i, String str) {
        C89219l.m154721d(str, "");
        Map<String, AnchorPublishStruct> c = m70437c();
        if (c != null) {
            return c.get(i + '(' + str + ')');
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$a */
    public static final class C34452a {
        @AbstractC27891c(mo46611a = "impression_type")

        /* renamed from: a */
        public final int f81431a;
        @AbstractC27891c(mo46611a = "anchor_type")

        /* renamed from: b */
        public final int f81432b;
        @AbstractC27891c(mo46611a = "anchor_subtype")

        /* renamed from: c */
        public final String f81433c;

        static {
            Covode.recordClassIndex(41403);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C34452a)) {
                return false;
            }
            C34452a aVar = (C34452a) obj;
            return this.f81431a == aVar.f81431a && this.f81432b == aVar.f81432b && C89219l.m154714a(this.f81433c, aVar.f81433c);
        }

        public final int hashCode() {
            int i = ((this.f81431a * 31) + this.f81432b) * 31;
            String str = this.f81433c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "AnchorAddLinkImpression(impressionType=" + this.f81431a + ", anchorType=" + this.f81432b + ", anchorSubtype=" + this.f81433c + ")";
        }

        public C34452a(int i, int i2, String str) {
            this.f81431a = i;
            this.f81432b = i2;
            this.f81433c = str;
        }
    }
}
