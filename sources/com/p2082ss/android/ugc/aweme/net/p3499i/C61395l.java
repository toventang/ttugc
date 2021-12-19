package com.p2082ss.android.ugc.aweme.net.p3499i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.C18182a;
import com.bytedance.ies.ugc.network.partner.p1276b.C18198e;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.net.p3493f.C61352h;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.i.l */
public final class C61395l implements AbstractC18185b.AbstractC18190e {

    /* renamed from: a */
    public static final C61396a f139389a = new C61396a((byte) 0);

    static {
        Covode.recordClassIndex(72028);
    }

    /* renamed from: com.ss.android.ugc.aweme.net.i.l$a */
    public static final class C61396a {
        static {
            Covode.recordClassIndex(72029);
        }

        private C61396a() {
        }

        public /* synthetic */ C61396a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b
    /* renamed from: a */
    public final String mo29034a() {
        return AbstractC18185b.C18188c.m33836a(this);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18190e
    /* renamed from: a */
    public final void mo29043a(C18199f fVar, C18182a aVar) {
        String str;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        if (SettingsManager.m29616a().mo25400a("debug_replace_http_to_https", true)) {
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<Boolean> useHttps = inst.getUseHttps();
            C89219l.m154716b(useHttps, "");
            Boolean c = useHttps.mo59941c();
            C89219l.m154716b(c, "");
            if (c.booleanValue() && !C89219l.m154714a((Object) "vas_ad_track", (Object) fVar.f43350j)) {
                fVar.f43342b.f43366a = "https";
            }
            String a = fVar.f43342b.f43370e.mo29049a();
            C18198e eVar = fVar.f43342b.f43371f;
            if (C89361p.m154908a((CharSequence) a, (CharSequence) "/passport/auth/login/", false) || C89361p.m154908a((CharSequence) a, (CharSequence) "/passport/auth/login_only/", false)) {
                String a2 = eVar.mo29052a("access_token");
                if (a2 != null && !C89361p.m154870a((CharSequence) a2)) {
                    String replaceAll = Pattern.compile(" ").matcher(a2).replaceAll("+");
                    C89219l.m154716b(replaceAll, "");
                    eVar.mo29053a("access_token", replaceAll);
                }
            } else if (C89361p.m154908a((CharSequence) a, (CharSequence) "/service/settings/v2/", false) || C89361p.m154908a((CharSequence) a, (CharSequence) "/service/settings/v3/", false)) {
                fVar.f43342b.mo29062b(C17867d.f42587k.f42569a);
            } else {
                if (C89361p.m154908a((CharSequence) a, (CharSequence) "push/get_service_addrs", false)) {
                    fVar.f43342b.mo29062b(C17867d.f42587k.f42569a);
                }
                if (C89361p.m154908a((CharSequence) a, (CharSequence) "/service/settings/v2", false)) {
                    if (C61352h.m111093a()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    eVar.mo29056b("googleServiceEnable", str);
                }
            }
        }
    }
}
