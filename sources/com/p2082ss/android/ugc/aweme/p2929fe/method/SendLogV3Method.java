package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogV3Method */
public final class SendLogV3Method extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47890a f110922a = new C47890a((byte) 0);

    static {
        Covode.recordClassIndex(56574);
    }

    private SendLogV3Method(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogV3Method$a */
    public static final class C47890a {
        static {
            Covode.recordClassIndex(56575);
        }

        private C47890a() {
        }

        public /* synthetic */ C47890a(byte b) {
            this();
        }
    }

    private /* synthetic */ SendLogV3Method() {
        this((C18288a) null);
    }

    public SendLogV3Method(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                HashMap hashMap = new HashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString2 = optJSONObject.optString(next);
                    keys.remove();
                    C89219l.m154716b(next, "");
                    C89219l.m154716b(optString2, "");
                    hashMap.put(next, optString2);
                }
                C39161q.m79451a(optString, hashMap);
                if (aVar != null) {
                    aVar.mo79886a(new C28022o());
                }
            } else if (aVar != null) {
                aVar.mo79885a(0, "");
            }
        } else if (aVar != null) {
            aVar.mo79885a(0, "");
        }
    }
}
