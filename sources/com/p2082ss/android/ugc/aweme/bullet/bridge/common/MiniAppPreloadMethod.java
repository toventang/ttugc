package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.MiniAppPreloadMethod */
public final class MiniAppPreloadMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35031a f82637b = new C35031a((byte) 0);

    /* renamed from: c */
    private final String f82638c = "preloadMiniApp";

    static {
        Covode.recordClassIndex(42128);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.MiniAppPreloadMethod$a */
    public static final class C35031a {
        static {
            Covode.recordClassIndex(42129);
        }

        private C35031a() {
        }

        public /* synthetic */ C35031a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82638c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniAppPreloadMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (jSONObject.has("mini_app_url")) {
            C59320c cVar = C59320c.C59324a.f135560a;
            C89219l.m154716b(cVar, "");
            cVar.mo96989a().preloadMiniApp(jSONObject.optString("mini_app_url"));
        }
    }
}
