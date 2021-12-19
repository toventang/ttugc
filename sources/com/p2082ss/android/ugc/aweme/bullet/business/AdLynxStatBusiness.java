package com.p2082ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35186c;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35193h;
import com.p2082ss.android.ugc.aweme.commercialize.log.p2599a.C38151a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness */
public final class AdLynxStatBusiness extends BulletBusinessService.Business {

    /* renamed from: a */
    public boolean f82854a;

    /* renamed from: b */
    public boolean f82855b;

    /* renamed from: c */
    public long f82856c = -1;

    /* renamed from: d */
    public final List<String> f82857d = new ArrayList();

    /* renamed from: e */
    private boolean f82858e;

    /* renamed from: f */
    private long f82859f;

    static {
        Covode.recordClassIndex(42253);
    }

    /* renamed from: c */
    private final C35193h m71784c() {
        C16721b bVar = this.f82870k.f82900a;
        if (!(bVar instanceof C35193h)) {
            bVar = null;
        }
        return (C35193h) bVar;
    }

    /* renamed from: b */
    public final void mo61934b() {
        this.f82858e = false;
        this.f82859f = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo61931a() {
        Object obj;
        C16722a aVar;
        C35193h c = m71784c();
        if (c == null || (aVar = c.f83064at) == null) {
            obj = null;
        } else {
            obj = aVar.mo26550b();
        }
        if (!(!C89219l.m154714a(obj, (Object) true))) {
            this.f82854a = true;
            m71785c("load_finish");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLynxStatBusiness(C35123a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: b */
    public final void mo61935b(String str) {
        Object obj;
        C16722a aVar;
        C35193h c = m71784c();
        if (c == null || (aVar = c.f83064at) == null) {
            obj = null;
        } else {
            obj = aVar.mo26550b();
        }
        if (!(!C89219l.m154714a(obj, (Object) true))) {
            m71783a("init_fail", str);
        }
    }

    /* renamed from: a */
    public final void mo61932a(String str) {
        Object obj;
        C16722a aVar;
        C35193h c = m71784c();
        if (c == null || (aVar = c.f83064at) == null) {
            obj = null;
        } else {
            obj = aVar.mo26550b();
        }
        if (!(!C89219l.m154714a(obj, (Object) true))) {
            this.f82854a = true;
            this.f82855b = true;
            if (str != null) {
                this.f82857d.add(str);
            }
        }
    }

    /* renamed from: c */
    private final void m71785c(String str) {
        String str2;
        C35186c cVar = this.f82870k.f82901b;
        if (cVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("render_type", "lynx");
            if (C89219l.m154714a((Object) "load_finish", (Object) str)) {
                linkedHashMap.put("duration", Long.valueOf(this.f82856c));
            } else if (C89219l.m154714a((Object) "stay_page", (Object) str)) {
                long currentTimeMillis = System.currentTimeMillis() - this.f82859f;
                this.f82859f = 0;
                if (currentTimeMillis > 0) {
                    linkedHashMap.put("stay_time", Long.valueOf(currentTimeMillis));
                    this.f82858e = true;
                } else {
                    return;
                }
            }
            C35193h c = m71784c();
            if (c != null) {
                str2 = c.mo62035b();
            } else {
                str2 = null;
            }
            linkedHashMap.put("channel_name", str2);
            C38151a.C38153b a = C38151a.m77332a();
            a.f90122a = "ad_wap_stat";
            a.f90123b = str;
            C38151a.C38153b c2 = a.mo66446a(Long.valueOf(cVar.mo62015b())).mo66454c(cVar.mo62017d());
            c2.f90125d = cVar.mo62016c();
            c2.mo66447a(linkedHashMap).mo66455c();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    hashMap.put(entry.getKey(), value);
                }
            }
            C18129a.m33747a("ad_wap_stat", str, String.valueOf(cVar.mo62015b()), cVar.mo62017d(), cVar.mo62016c()).mo28898a(hashMap).mo28902c();
        }
    }

    /* renamed from: a */
    public final void mo61933a(boolean z) {
        Object obj;
        Activity a;
        C16722a aVar;
        C35193h c = m71784c();
        if (c == null || (aVar = c.f83064at) == null) {
            obj = null;
        } else {
            obj = aVar.mo26550b();
        }
        if (!(!C89219l.m154714a(obj, (Object) true)) && (a = this.f82870k.mo61971a()) != null) {
            if (!this.f82858e) {
                m71785c("stay_page");
            }
            if (!z && !a.isFinishing()) {
                return;
            }
            if (!this.f82854a) {
                m71785c("load");
            } else if (this.f82855b) {
                m71783a("load_fail", this.f82857d.toString());
            }
        }
    }

    /* renamed from: a */
    private final void m71783a(String str, String str2) {
        String str3;
        C35186c cVar = this.f82870k.f82901b;
        if (cVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C35193h c = m71784c();
            if (c != null) {
                str3 = c.mo62035b();
            } else {
                str3 = null;
            }
            linkedHashMap.put("channel_name", str3);
            linkedHashMap.put("status", str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("message", str2);
            C38151a.C38153b a = C38151a.m77332a();
            a.f90122a = "lynx_landing_page";
            a.f90123b = "fallback";
            C38151a.C38153b c2 = a.mo66446a(Long.valueOf(cVar.mo62015b())).mo66454c(cVar.mo62017d());
            c2.f90125d = cVar.mo62016c();
            c2.mo66447a(linkedHashMap).mo66455c();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    hashMap.put(entry.getKey(), value);
                }
            }
            C18129a.m33747a("lynx_landing_page", "fallback", String.valueOf(cVar.mo62015b()), cVar.mo62017d(), cVar.mo62016c()).mo28898a(hashMap).mo28902c();
        }
    }
}
