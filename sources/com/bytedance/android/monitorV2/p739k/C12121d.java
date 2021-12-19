package com.bytedance.android.monitorV2.p739k;

import com.bytedance.android.monitorV2.C12074b;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p728a.AbstractC12071f;
import com.bytedance.android.monitorV2.p728a.AbstractC12072g;
import com.bytedance.android.monitorV2.p731d.C12081a;
import com.bytedance.android.monitorV2.p731d.C12083c;
import com.bytedance.android.monitorV2.p731d.C12090i;
import com.bytedance.android.monitorV2.p735h.AbstractC12113f;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p740l.C12125b;
import com.bytedance.android.monitorV2.p740l.C12131g;
import com.bytedance.android.monitorV2.webview.C12188a;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.k.d */
public final class C12121d {

    /* renamed from: a */
    public static final C12121d f29148a = new C12121d();

    /* renamed from: b */
    private static final C12118a f29149b = C12118a.f29143d;

    /* renamed from: c */
    private static Map<String, AbstractC12120c> f29150c = new LinkedHashMap();

    /* renamed from: com.bytedance.android.monitorV2.k.d$a */
    public static final class C12122a implements AbstractC12072g {

        /* renamed from: a */
        final /* synthetic */ C12119b f29151a;

        /* renamed from: b */
        final /* synthetic */ C12081a f29152b;

        static {
            Covode.recordClassIndex(13851);
        }

        @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
        /* renamed from: c */
        public final JSONObject mo19422c() {
            return null;
        }

        @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
        /* renamed from: d */
        public final JSONObject mo19423d() {
            return null;
        }

        @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
        /* renamed from: h */
        public final String mo19427h() {
            return "containerError";
        }

        @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
        /* renamed from: i */
        public final String mo19428i() {
            return "";
        }

        @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
        /* renamed from: g */
        public final AbstractC12071f mo19426g() {
            return this.f29152b;
        }

        @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
        /* renamed from: e */
        public final AbstractC12067b mo19424e() {
            return new C12083c();
        }

        @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
        /* renamed from: f */
        public final AbstractC12071f mo19425f() {
            return this.f29151a.mo19490a();
        }

        @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
        /* renamed from: b */
        public final AbstractC12071f mo19420b() {
            C12090i iVar = new C12090i();
            iVar.f29013e = this.f29151a.f29146c;
            iVar.f29011c = null;
            return iVar;
        }

        C12122a(C12119b bVar, C12081a aVar) {
            this.f29151a = bVar;
            this.f29152b = aVar;
        }
    }

    private C12121d() {
    }

    static {
        Covode.recordClassIndex(13850);
    }

    /* renamed from: a */
    public static String m21607a() {
        String a = C12131g.m21660a();
        C12115b.m21583b("ContainerStandardApi", "generateIDForContainer [monitorId:" + a + ']');
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* renamed from: a */
    private static boolean m21614a(String str) {
        C89219l.m154719c(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -907987551) {
            if (hashCode != -245775970) {
                if (hashCode == 855478153 && str.equals("container_name")) {
                    return true;
                }
                return false;
            } else if (str.equals("template_res_type")) {
                return true;
            } else {
                return false;
            }
        } else if (str.equals("schema")) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static void m21609a(String str, AbstractC12120c cVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cVar, "");
        f29150c.put(str, cVar);
    }

    /* renamed from: a */
    public static void m21610a(String str, C12123e eVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(eVar, "");
        C12115b.m21583b("ContainerStandardApi", "attach [monitorId:" + str + "][containerType:" + eVar.f29153a + ']');
        C89219l.m154719c(str, "");
        C89219l.m154719c(eVar, "");
        C12118a.f29142c.put(str, eVar);
    }

    /* renamed from: a */
    public static void m21608a(String str, C12119b bVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(bVar, "");
        C12115b.m21583b("ContainerStandardApi", "reportContainerError [monitorId:" + str + "][errorCode:" + bVar.f29144a + "][errorMsg:" + bVar.f29145b + ']');
        C12123e b = C12118a.m21598b(str);
        C12081a aVar = new C12081a(C12118a.m21595a(str));
        if (b == null || f29150c.get(b.f29153a) == null) {
            HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
            C89219l.m154709a((Object) instance, "");
            AbstractC12113f hybridSettingManager = instance.getHybridSettingManager();
            C89219l.m154709a((Object) hybridSettingManager, "");
            if (C12125b.m21635c("containerError", hybridSettingManager.mo19479b().mo19449a(""))) {
                C12074b.m21492a(new C12122a(bVar, aVar), new C12188a());
                return;
            }
            return;
        }
        AbstractC12120c cVar = f29150c.get(b.f29153a);
        if (cVar == null) {
            C89219l.m154707a();
        }
        cVar.mo19494a(null, aVar, bVar);
    }

    /* renamed from: a */
    public static void m21611a(String str, String str2, long j) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C12115b.m21583b("ContainerStandardApi", "collectLong [monitorId:" + str + "][field:" + str2 + "][value:" + j + ']');
        m21612a(str, str2, Long.valueOf(j));
    }

    /* renamed from: a */
    private static void m21612a(String str, String str2, Object obj) {
        AbstractC12120c cVar;
        if (m21614a(str2)) {
            C12118a.m21596a(str, str2, obj);
        } else {
            C12118a.m21599b(str, str2, obj);
        }
        C12123e b = C12118a.m21598b(str);
        if (b != null && (cVar = f29150c.get(b.f29153a)) != null) {
            b.mo19496a();
            cVar.mo19495a(str2, obj);
        }
    }

    /* renamed from: a */
    public static void m21613a(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        C12115b.m21583b("ContainerStandardApi", "collectString [monitorId:" + str + "][field:" + str2 + "][value:" + str3 + ']');
        m21612a(str, str2, (Object) str3);
    }
}
