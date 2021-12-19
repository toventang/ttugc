package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35186c;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdInfoMethod */
public final class AdInfoMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C34969a f82481b = new C34969a((byte) 0);

    static {
        Covode.recordClassIndex(42001);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return "adInfo";
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdInfoMethod$a */
    public static final class C34969a {
        static {
            Covode.recordClassIndex(42002);
        }

        private C34969a() {
        }

        public /* synthetic */ C34969a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdInfoMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        AbstractC16741q qVar;
        C35186c cVar;
        int i;
        int i2;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        AbstractC16208i h = mo61867h();
        if (h != null) {
            qVar = h.mo25778o_();
        } else {
            qVar = null;
        }
        if (!(qVar instanceof C35196j)) {
            qVar = null;
        }
        C35196j jVar = (C35196j) qVar;
        AbstractC16208i h2 = mo61867h();
        if (h2 != null) {
            cVar = (C35186c) h2.mo25763a(C35186c.class);
        } else {
            cVar = null;
        }
        if (jVar != null) {
            jSONObject2.put("cid", jVar.f83076Y.mo26550b());
            jSONObject2.put("group_id", jVar.mo62117h());
            jSONObject2.put("ad_type", jVar.f83077Z.mo26550b());
            jSONObject2.put("log_extra", jVar.mo62045c());
            jSONObject2.put("download_url", jVar.f83093ah.mo26550b());
            jSONObject2.put("package_name", jVar.f83095aj.mo26550b());
            jSONObject2.put("app_name", jVar.f83094ai.mo26550b());
            Long l = (Long) jVar.f83076Y.mo26550b();
            if (l != null && l.longValue() == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            jSONObject2.put("code", i2);
            jSONObject2.put("land_page_data", jVar.f83079aB);
            jSONObject2.put("extra_param", jVar.f83080aC);
            Long l2 = (Long) jVar.f83076Y.mo26550b();
            if (l2 != null) {
                l2.longValue();
            }
            jVar.mo62045c();
        } else if (cVar != null) {
            jSONObject2.put("cid", cVar.mo62015b());
            jSONObject2.put("group_id", cVar.mo62016c());
            jSONObject2.put("ad_type", cVar.f83017R.mo26550b());
            jSONObject2.put("log_extra", cVar.mo62017d());
            jSONObject2.put("download_url", cVar.mo62018e());
            jSONObject2.put("package_name", cVar.mo62019f());
            jSONObject2.put("app_name", cVar.mo62020g());
            if (cVar.mo62015b() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject2.put("code", i);
            jSONObject2.put("land_page_data", cVar.f83037ak);
            jSONObject2.put("extra_param", cVar.f83042ap);
            try {
                String b = cVar.f83031ae.mo26550b();
                if (b == null) {
                    b = "";
                }
                jSONObject2.put("track_url_list", new JSONArray(b));
            } catch (Exception unused) {
            }
            cVar.mo62015b();
            cVar.mo62017d();
        } else {
            C51423a.m95791b(3, null, "It is illegal to call adInfo in non-commercialized scenarios, please chat with zhangxiang.aaron privately");
        }
        aVar.mo61874a(jSONObject2);
    }
}
