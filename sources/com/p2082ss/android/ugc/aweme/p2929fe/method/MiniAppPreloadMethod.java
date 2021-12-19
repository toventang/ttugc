package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.MiniAppPreloadMethod */
public final class MiniAppPreloadMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47852a f110852a = new C47852a((byte) 0);

    static {
        Covode.recordClassIndex(56510);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.MiniAppPreloadMethod$a */
    public static final class C47852a {
        static {
            Covode.recordClassIndex(56511);
        }

        private C47852a() {
        }

        public /* synthetic */ C47852a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject != null && jSONObject.has("mini_app_url")) {
            C59320c cVar = C59320c.C59324a.f135560a;
            C89219l.m154716b(cVar, "");
            cVar.mo96989a().preloadMiniApp(jSONObject.optString("mini_app_url"));
        }
    }
}
