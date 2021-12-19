package com.p2082ss.ugc.effectplatform.p4448e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4440a.C86693b;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4444b.C86751d;
import com.p2082ss.ugc.effectplatform.p4444b.C86752e;
import com.p2082ss.ugc.effectplatform.p4452i.AbstractC86801a;
import com.p2082ss.ugc.effectplatform.p4452i.C86802b;
import com.p2082ss.ugc.effectplatform.util.C86994k;
import java.util.HashMap;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.e.g */
public final class C86774g implements AbstractC86778i {

    /* renamed from: a */
    public C86693b f195687a;

    /* renamed from: b */
    public final C86687a f195688b;

    /* renamed from: c */
    private final Effect f195689c;

    static {
        Covode.recordClassIndex(102473);
    }

    @Override // com.p2082ss.ugc.effectplatform.p4448e.AbstractC86778i
    /* renamed from: a */
    public final boolean mo140030a(String str) {
        boolean z;
        V v;
        String str2 = "";
        C89219l.m154719c(str, str2);
        String b = C86994k.m150674b(str);
        if (b == null) {
            return false;
        }
        String str3 = this.f195687a.f195507c;
        if (!(str3 == null || !(!C89219l.m154714a((Object) str3, (Object) b)) || (v = this.f195688b.f195463s.f199870a) == null)) {
            HashMap hashMap = new HashMap();
            String str4 = this.f195688b.f195455k;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("app_id", str4);
            String str5 = this.f195688b.f195446b;
            if (str5 != null) {
                str2 = str5;
            }
            hashMap.put("access_key", str2);
            hashMap.put("effect_id", this.f195689c.getEffect_id());
            hashMap.put("EffectDir", str3);
            hashMap.put("zippath", b);
            v.monitorStatusRate("effect_download_error", 1, hashMap);
        }
        AbstractC86755f a = C86751d.m150298a(b);
        if (a instanceof C86752e) {
            C88060b.m153135a("EffectUnZipper", "fetchEffect " + this.f195689c.getEffect_id() + ", name: " + this.f195689c.getName() + " unzip in EffectDiskLruCache");
            return ((C86752e) a).mo140017a(str, this.f195689c);
        }
        C88060b.m153135a("EffectUnZipper", "fetchEffect " + this.f195689c.getEffect_id() + ", name: " + this.f195689c.getName() + " unzip in old cache");
        String unzipPath = this.f195689c.getUnzipPath();
        String a2 = C86994k.m150670a(this.f195689c.getUnzipPath(), "_tmp");
        if (a2 == null) {
            return false;
        }
        try {
            C88045d.m153119g(a2);
            V v2 = this.f195688b.f195464t.f199870a;
            if (v2 == null) {
                C88045d.m153112b(str, a2);
                z = C86994k.m150672a(a2, unzipPath, true);
            } else if (v2.mo139931a() != 0 || !C86994k.m150672a(a2, unzipPath, true)) {
                z = false;
            } else {
                z = true;
            }
            C88045d.m153119g(str);
            if (!z) {
                C88045d.m153119g(a2);
                C88045d.m153119g(unzipPath);
                V v3 = this.f195688b.f195463s.f199870a;
                if (v3 != null) {
                    C86802b.m150350a((AbstractC86801a) v3, false, this.f195688b, this.f195689c, "unzip failed!");
                }
            } else {
                V v4 = this.f195688b.f195463s.f199870a;
                if (v4 != null) {
                    C86802b.m150346a(v4, this.f195688b, this.f195689c);
                }
            }
            return z;
        } catch (Exception e) {
            C88060b.m153136a("EffectUnZipper", "fetch effect: " + this.f195689c.getEffect_id() + ", name: " + this.f195689c.getName() + " unzip failed!", e);
            C88045d.m153119g(a2);
            C88045d.m153119g(unzipPath);
            V v5 = this.f195688b.f195463s.f199870a;
            if (v5 != null) {
                C86802b.m150350a((AbstractC86801a) v5, false, this.f195688b, this.f195689c, e.getMessage());
            }
            throw e;
        }
    }

    public C86774g(C86693b bVar, C86687a aVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        this.f195687a = bVar;
        this.f195688b = aVar;
        this.f195689c = bVar.f195505a;
    }
}
