package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenSchemaSingleTaskMethod */
public final class OpenSchemaSingleTaskMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C56605a f129038b = new C56605a((byte) 0);

    /* renamed from: c */
    private final String f129039c = "openSingletonSchema";

    static {
        Covode.recordClassIndex(66443);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenSchemaSingleTaskMethod$a */
    public static final class C56605a {
        static {
            Covode.recordClassIndex(66444);
        }

        private C56605a() {
        }

        public /* synthetic */ C56605a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f129039c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenSchemaSingleTaskMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("schema");
        String optString2 = jSONObject.optString("page");
        int optInt = jSONObject.optInt("is_back");
        boolean z = false;
        if (C89219l.m154714a((Object) optString2, (Object) "AWEVideoNewPublishViewController")) {
            Class<? extends Activity> videoPublishActivityClass = AVExternalServiceImpl.m113114a().classnameService().getVideoPublishActivityClass();
            Activity[] activityStack = ActivityStack.getActivityStack();
            C89219l.m154716b(activityStack, "");
            for (Activity activity : activityStack) {
                if (C89219l.m154714a((Object) activity.getClass().getName(), (Object) videoPublishActivityClass.getName())) {
                    Intent intent = new Intent(mo26893e(), videoPublishActivityClass);
                    intent.addFlags(67108864);
                    intent.addFlags(268435456);
                    Context e = mo26893e();
                    if (e != null) {
                        C84349a.m145093a(intent, e);
                        e.startActivity(intent);
                    }
                }
            }
            aVar.mo61871a(0, "No video publish activity in stack");
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(mo26893e(), "//bullet/single_task?intercept_page=show_window");
        Intent buildIntent = buildRoute.buildIntent();
        if (optInt == 1) {
            z = true;
        }
        buildIntent.putExtra("is_clear_top", z);
        SmartRoute withParam = buildRoute.withParam(buildIntent);
        C89219l.m154716b(optString, "");
        withParam.withParam(C35301c.m72246a(optString)).addFlags(67108864).addFlags(268435456).open();
        aVar.mo61872a((Object) null);
    }
}
