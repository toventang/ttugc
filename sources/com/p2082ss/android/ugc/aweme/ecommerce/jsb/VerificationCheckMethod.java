package com.p2082ss.android.ugc.aweme.ecommerce.jsb;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.VerificationCheckMethod */
public final class VerificationCheckMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C44552a f103965b = new C44552a((byte) 0);

    /* renamed from: a */
    public final C18288a f103966a;

    static {
        Covode.recordClassIndex(52913);
    }

    private VerificationCheckMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.VerificationCheckMethod$a */
    public static final class C44552a {
        static {
            Covode.recordClassIndex(52914);
        }

        private C44552a() {
        }

        public /* synthetic */ C44552a(byte b) {
            this();
        }
    }

    private /* synthetic */ VerificationCheckMethod() {
        this((C18288a) null);
    }

    public VerificationCheckMethod(C18288a aVar) {
        super(aVar);
        this.f103966a = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.VerificationCheckMethod$b */
    public static final class C44553b extends C67837a {

        /* renamed from: a */
        final /* synthetic */ int f103967a;

        /* renamed from: b */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f103968b;

        static {
            Covode.recordClassIndex(52915);
        }

        C44553b(int i, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f103967a = i;
            this.f103968b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
        /* renamed from: a */
        public final void mo61882a(boolean z, int i) {
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f103968b;
            if (aVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z);
                aVar.mo79886a((Object) jSONObject);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        int i;
        Context context;
        WebView webView;
        if (jSONObject != null) {
            i = jSONObject.optInt("verifyCode");
        } else {
            i = -1;
        }
        C18288a aVar2 = this.f103966a;
        Activity activity = null;
        if (aVar2 == null || (webView = aVar2.f43654d) == null) {
            context = null;
        } else {
            context = webView.getContext();
        }
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            SecApiImpl.m119993a().popCaptcha(activity2, i, new C44553b(i, aVar));
        }
    }
}
