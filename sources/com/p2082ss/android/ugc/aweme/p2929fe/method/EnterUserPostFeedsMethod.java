package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.EnterUserPostFeedsMethod */
public class EnterUserPostFeedsMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(56472);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public EnterUserPostFeedsMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        Activity activity;
        String str;
        Context context = null;
        if (this.mContextRef != null) {
            context = (Context) this.mContextRef.get();
        }
        if ((context instanceof Activity) && (activity = (Activity) context) != null && C33067a.m67726a(activity, true)) {
            String optString = jSONObject.optString("user_id");
            int optInt = jSONObject.optInt("task");
            C36125t a = C36125t.m73591a();
            C36131u a2 = C36131u.m73602a("aweme://aweme/detail/0");
            if (TextUtils.equals(C31575b.m65865g().getCurUserId(), optString)) {
                str = "from_profile_self";
            } else {
                str = "from_profile_other";
            }
            C36125t.m73596a(a, activity, a2.mo63248a("video_from", str).mo63247a("video_type", 0).mo63248a("userid", optString).mo63247a("task_type", optInt).f85356a.mo52126a());
        }
    }
}
