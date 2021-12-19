package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34292ax;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenPhoneAreaMethod */
public final class OpenPhoneAreaMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(94956);
    }

    private OpenPhoneAreaMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ OpenPhoneAreaMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenPhoneAreaMethod$a */
    public static final class C81564a implements AbstractC34292ax {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f182385a;

        static {
            Covode.recordClassIndex(94957);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34292ax
        public final void onExit() {
        }

        C81564a(BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f182385a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34292ax
        public final void onChanged(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phoneCode", str);
            jSONObject.put("shortCountryName", str2);
            jSONObject.put("code", 1);
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f182385a;
            if (aVar != null) {
                aVar.mo79888a(jSONObject);
            }
        }
    }

    public OpenPhoneAreaMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C81564a aVar2 = new C81564a(aVar);
        if (this.mContextRef.get() != null) {
            C31575b.m65860b().openCountryListActivity((Activity) this.mContextRef.get(), aVar2);
        }
    }
}
