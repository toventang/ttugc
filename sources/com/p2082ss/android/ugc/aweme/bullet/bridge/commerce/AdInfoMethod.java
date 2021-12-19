package com.p2082ss.android.ugc.aweme.bullet.bridge.commerce;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.AdInfoMethod */
public final class AdInfoMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C34992a f82553b = new C34992a((byte) 0);

    /* renamed from: c */
    private final String f82554c = "adInfo";

    /* renamed from: d */
    private long f82555d;

    /* renamed from: e */
    private String f82556e;

    /* renamed from: f */
    private String f82557f;

    static {
        Covode.recordClassIndex(42062);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.AdInfoMethod$a */
    public static final class C34992a {
        static {
            Covode.recordClassIndex(42063);
        }

        private C34992a() {
        }

        public /* synthetic */ C34992a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82554c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdInfoMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Uri p_;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        AbstractC16208i h = mo61867h();
        int i = 1;
        if (!(h == null || h.mo25769b() != EnumC16723b.WEB || (p_ = h.mo25780p_()) == null)) {
            this.f82557f = p_.getQueryParameter("adinfojson");
            this.f82556e = p_.getQueryParameter("has_adinfojson");
        }
        C89219l.m154721d(aVar, "");
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.equals(this.f82556e, "1") || TextUtils.isEmpty(this.f82557f)) {
            if (this.f82555d == 0) {
                i = 0;
            }
            jSONObject2.put("code", i);
        } else {
            JSONObject jSONObject3 = new JSONObject(this.f82557f);
            Iterator<String> keys = jSONObject3.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject3.opt(next));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        aVar.mo61874a(jSONObject2);
    }
}
