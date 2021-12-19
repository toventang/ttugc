package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.utils.C80533hg;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.DarkModeMethod */
public final class DarkModeMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47824a f110778a = new C47824a((byte) 0);

    static {
        Covode.recordClassIndex(56462);
    }

    private DarkModeMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DarkModeMethod$a */
    public static final class C47824a {
        static {
            Covode.recordClassIndex(56463);
        }

        private C47824a() {
        }

        public /* synthetic */ C47824a(byte b) {
            this();
        }
    }

    private /* synthetic */ DarkModeMethod() {
        this((C18288a) null);
    }

    public DarkModeMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("enable");
        } else {
            str = null;
        }
        try {
            Object obj = this.mContextRef.get();
            if (obj != null) {
                CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) obj;
                C80533hg.m139603a(crossPlatformActivity, crossPlatformActivity.getWindow(), TextUtils.equals(str, "true"));
                if (aVar != null) {
                    aVar.mo79886a(new C28022o());
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
        } catch (Exception unused) {
            if (aVar != null) {
                aVar.mo79885a(0, "");
            }
        }
    }
}
