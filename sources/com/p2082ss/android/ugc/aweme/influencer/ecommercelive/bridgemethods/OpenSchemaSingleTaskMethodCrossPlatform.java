package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenSchemaSingleTaskMethodCrossPlatform */
public final class OpenSchemaSingleTaskMethodCrossPlatform extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C56606a f129040a = new C56606a((byte) 0);

    static {
        Covode.recordClassIndex(66445);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenSchemaSingleTaskMethodCrossPlatform$a */
    public static final class C56606a {
        static {
            Covode.recordClassIndex(66446);
        }

        private C56606a() {
        }

        public /* synthetic */ C56606a(byte b) {
            this();
        }
    }

    public OpenSchemaSingleTaskMethodCrossPlatform(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
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
                    Intent intent = new Intent(getActContext(), videoPublishActivityClass);
                    intent.addFlags(67108864);
                    intent.addFlags(268435456);
                    Context actContext = getActContext();
                    C84349a.m145093a(intent, actContext);
                    actContext.startActivity(intent);
                }
            }
            aVar.mo79885a(0, "No video publish activity in stack");
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(getActContext(), "//bullet/single_task?intercept_page=show_window");
        Intent buildIntent = buildRoute.buildIntent();
        if (optInt == 1) {
            z = true;
        }
        buildIntent.putExtra("is_clear_top", z);
        SmartRoute withParam = buildRoute.withParam(buildIntent);
        C89219l.m154716b(optString, "");
        withParam.withParam(C35301c.m72246a(optString)).addFlags(67108864).addFlags(268435456).open();
        aVar.mo79886a((Object) new JSONObject());
    }
}
