package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.GetMicroAppInfoMethod */
public final class GetMicroAppInfoMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(56476);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetMicroAppInfoMethod(C18288a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        try {
            C59320c cVar = C59320c.C59324a.f135560a;
            C89219l.m154716b(cVar, "");
            IMiniAppService a = cVar.mo96989a();
            JSONObject jSONObject2 = new JSONObject();
            if (a != null) {
                Context a2 = C17867d.m33078a();
                if (a2 != null) {
                    str = a.getJsSdkVersion((Application) a2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
                }
            } else {
                str = null;
            }
            jSONObject2.put("js_sdk_version", str);
            if (aVar != null) {
                aVar.mo79888a(jSONObject2);
            }
        } catch (Exception unused) {
            if (aVar != null) {
                aVar.mo79885a(-1, "");
            }
        }
    }
}
