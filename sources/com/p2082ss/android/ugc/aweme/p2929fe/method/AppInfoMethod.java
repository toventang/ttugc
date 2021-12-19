package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.ContentResolver;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58013a;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47808d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.AppInfoMethod */
public final class AppInfoMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47815a f110769a = new C47815a((byte) 0);

    static {
        Covode.recordClassIndex(56445);
    }

    private AppInfoMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.AppInfoMethod$a */
    public static final class C47815a {
        static {
            Covode.recordClassIndex(56446);
        }

        private C47815a() {
        }

        public /* synthetic */ C47815a(byte b) {
            this();
        }
    }

    private /* synthetic */ AppInfoMethod() {
        this((C18288a) null);
    }

    public AppInfoMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            str = jSONObject.optString("permissionGroup");
        } else {
            str = null;
        }
        for (T t : C47808d.m90825a(str).entrySet()) {
            jSONObject2.put((String) t.getKey(), t.getValue());
        }
        ContentResolver contentResolver = C17867d.m33078a().getContentResolver();
        if (contentResolver != null) {
            if (TextUtils.equals("time_12_24", "android_id")) {
                if (TextUtils.isEmpty(C58013a.f132217a)) {
                    C58013a.f132217a = Settings.System.getString(contentResolver, "time_12_24");
                }
                str2 = C58013a.f132217a;
            } else {
                str2 = Settings.System.getString(contentResolver, "time_12_24");
            }
        } else if (DateFormat.is24HourFormat(C17867d.m33078a())) {
            str2 = "24";
        } else {
            str2 = "12";
        }
        jSONObject2.put("time_system", str2);
        jSONObject2.put("code", 1);
        if (aVar != null) {
            aVar.mo79888a(jSONObject2);
        }
    }
}
