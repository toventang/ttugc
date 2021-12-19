package com.p2082ss.android.ugc.aweme.p2929fe.method.commerce;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commerce.service.C37533a;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.FetchFeedsAwemeDataMethod */
public final class FetchFeedsAwemeDataMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47927a f111005a = new C47927a((byte) 0);

    static {
        Covode.recordClassIndex(56627);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.FetchFeedsAwemeDataMethod$a */
    public static final class C47927a {
        static {
            Covode.recordClassIndex(56628);
        }

        private C47927a() {
        }

        public /* synthetic */ C47927a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        if (jSONObject != null) {
            try {
                str = jSONObject.optString("item_id");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) && aVar != null) {
            aVar.mo79886a((Object) new JSONObject().put("aweme", C80342dg.m139300a().mo46674b(C37533a.m75656a().getAwemeById(str))));
        }
    }
}
