package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ReportCustomEventMethod */
public final class ReportCustomEventMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47879a f110898a = new C47879a((byte) 0);

    static {
        Covode.recordClassIndex(56553);
    }

    private ReportCustomEventMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ReportCustomEventMethod$a */
    public static final class C47879a {
        static {
            Covode.recordClassIndex(56554);
        }

        private C47879a() {
        }

        public /* synthetic */ C47879a(byte b) {
            this();
        }
    }

    private /* synthetic */ ReportCustomEventMethod() {
        this((C18288a) null);
    }

    public ReportCustomEventMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        AbstractC34346s a;
        C34337k b = mo79881b();
        if (b == null || (a = b.mo60793a(AbstractC34346s.class)) == null) {
            str = "state invalid";
        } else if (jSONObject != null) {
            String optString = jSONObject.optString("service");
            if (optString == null || optString.length() == 0) {
                str = "service empty";
            } else {
                String optString2 = jSONObject.optString("trigger");
                if (optString2 == null || optString2.length() == 0) {
                    str = "trigger empty";
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("category");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("metrics");
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("extra");
                    if (optString == null) {
                        C89219l.m154715b();
                    }
                    if (optString2 == null) {
                        C89219l.m154715b();
                    }
                    a.mo60779a(optString, optString2, optJSONObject, optJSONObject2, optJSONObject3);
                    if (aVar != null) {
                        aVar.mo79887a(new JSONObject(), 1, "report success");
                        return;
                    }
                    return;
                }
            }
        } else {
            str = "params empty";
        }
        if (aVar != null) {
            aVar.mo79885a(0, "report error, reason: ".concat(str));
        }
    }
}
