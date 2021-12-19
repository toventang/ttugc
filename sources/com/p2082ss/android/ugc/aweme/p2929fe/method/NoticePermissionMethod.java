package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.NoticePermissionMethod */
public class NoticePermissionMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(56512);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public NoticePermissionMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        Activity activity;
        Context context = null;
        if (this.mContextRef != null) {
            context = (Context) this.mContextRef.get();
        }
        if ((context instanceof Activity) && (activity = (Activity) context) != null && C33067a.m67726a(activity, true)) {
            Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("toOpen"));
            boolean a = C80428fg.m139432a(context);
            if (!a && valueOf.booleanValue()) {
                try {
                    C80428fg.m139435c(context);
                } catch (Exception unused) {
                    Intent intent = new Intent("android.settings.SETTINGS");
                    C84349a.m145093a(intent, context);
                    context.startActivity(intent);
                }
            }
            if (a) {
                aVar.mo79886a("");
            } else {
                aVar.mo79885a(0, "");
            }
        }
    }
}
