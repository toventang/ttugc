package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.OpenHybridMethod */
public final class OpenHybridMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C37760a f89166b = new C37760a((byte) 0);

    /* renamed from: c */
    private final String f89167c = "openHybrid";

    static {
        Covode.recordClassIndex(45204);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.OpenHybridMethod$a */
    public static final class C37760a {
        static {
            Covode.recordClassIndex(45205);
        }

        private C37760a() {
        }

        public /* synthetic */ C37760a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f89167c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenHybridMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        boolean z;
        String str;
        String queryParameter;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("schema");
        if (jSONObject.optInt("is_ad") == 1) {
            z = true;
        } else {
            z = false;
        }
        String optString2 = jSONObject.optString("param");
        int i = C37762a.f89170a[mo61868i().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            C89219l.m154716b(optString2, "");
            if (optString != null) {
                Context e = mo26893e();
                if (e instanceof Activity) {
                    Bundle bundle = new Bundle();
                    Uri parse = Uri.parse(optString);
                    if (!(parse == null || (queryParameter = parse.getQueryParameter("access_key")) == null)) {
                        C89219l.m154716b(queryParameter, "");
                        if (queryParameter.length() > 0) {
                            bundle.putString("access_key", queryParameter);
                        }
                    }
                    if (z) {
                        str = AdLandPagePreloadServiceImpl.m68380f().mo59388e();
                        bundle.putString("bundle_extra_param", optString2);
                    } else {
                        str = null;
                    }
                    C34963b.m71413a(e, optString, str, bundle);
                }
            }
            aVar.mo61873a(null, 1, null);
            return;
        }
        aVar.mo61871a(-1, "The container is not any of these three - Web/RN/Lynx");
    }
}
