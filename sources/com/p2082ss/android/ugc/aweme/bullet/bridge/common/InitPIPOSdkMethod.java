package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.android.ecommerce.p159e.C2773a;
import com.bytedance.android.ecommerce.p163i.AbstractC2801b;
import com.bytedance.android.ecommerce.p164j.AbstractC2813k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.InitPIPOSdkMethod */
public final class InitPIPOSdkMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82616b = "initPipo";

    static {
        Covode.recordClassIndex(42113);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82616b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InitPIPOSdkMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.InitPIPOSdkMethod$b */
    static final class C35023b implements AbstractC2813k {

        /* renamed from: a */
        public static final C35023b f82618a = new C35023b();

        static {
            Covode.recordClassIndex(42115);
        }

        C35023b() {
        }

        @Override // com.bytedance.android.ecommerce.p164j.AbstractC2813k
        /* renamed from: a */
        public final void mo7407a(String str) {
            C89219l.m154716b(str, "");
            if (!C89361p.m154874b(str, "aweme://webview/", false)) {
                SmartRouter.buildRoute(C17879g.m33105b(), "aweme://webview/").withParam("url", str).open();
            } else {
                SmartRouter.buildRoute(C17879g.m33105b(), str).open();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.InitPIPOSdkMethod$a */
    static final class C35022a implements AbstractC2801b {

        /* renamed from: a */
        public static final C35022a f82617a = new C35022a();

        static {
            Covode.recordClassIndex(42114);
        }

        C35022a() {
        }

        @Override // com.bytedance.android.ecommerce.p163i.AbstractC2801b
        /* renamed from: a */
        public final void mo7380a(String str, JSONObject jSONObject) {
            C39162r.m79461a(str, jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        C2773a.C2774a aVar2 = new C2773a.C2774a(C17879g.m33104a());
        aVar2.f8345l = C35022a.f82617a;
        aVar2.f8350q = C35023b.f82618a;
        aVar2.f8335b = "https://fp22-normal-useast1a.tiktokv.com";
        C2773a a = aVar2.mo7355a();
        C89219l.m154716b(a, "");
        C2732a.f8145a.mo7360a(a);
        aVar.mo61872a((Object) 1);
    }
}
