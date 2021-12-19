package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShowToastMethod */
public final class ShowToastMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47902a f110948a = new C47902a((byte) 0);

    static {
        Covode.recordClassIndex(56592);
    }

    private ShowToastMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShowToastMethod$a */
    public static final class C47902a {
        static {
            Covode.recordClassIndex(56593);
        }

        private C47902a() {
        }

        public /* synthetic */ C47902a(byte b) {
            this();
        }
    }

    private /* synthetic */ ShowToastMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShowToastMethod$b */
    static final class RunnableC47903b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f110949a;

        /* renamed from: b */
        final /* synthetic */ String f110950b;

        static {
            Covode.recordClassIndex(56594);
        }

        RunnableC47903b(Context context, String str) {
            this.f110949a = context;
            this.f110950b = str;
        }

        public final void run() {
            new C79459a(this.f110949a).mo123052a(this.f110950b).mo123053a();
        }
    }

    public ShowToastMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String optString;
        if (jSONObject != null && (optString = jSONObject.optString("message")) != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC47903b((Context) this.mContextRef.get(), optString));
        }
    }
}
