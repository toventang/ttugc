package com.p2082ss.android.ugc.aweme.ecommerce.jsb;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.UpdateNonceMethod */
public final class UpdateNonceMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C44549a f103957a = new C44549a((byte) 0);

    static {
        Covode.recordClassIndex(52908);
    }

    private UpdateNonceMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.UpdateNonceMethod$a */
    public static final class C44549a {
        static {
            Covode.recordClassIndex(52909);
        }

        private C44549a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.UpdateNonceMethod$a$a */
        public static final class RunnableC44550a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ JSONObject f103958a;

            /* renamed from: b */
            final /* synthetic */ JSONObject f103959b;

            /* renamed from: c */
            final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f103960c;

            /* renamed from: d */
            final /* synthetic */ BaseBridgeMethod.AbstractC34965a f103961d;

            static {
                Covode.recordClassIndex(52910);
            }

            RunnableC44550a(JSONObject jSONObject, JSONObject jSONObject2, BaseCommonJavaMethod.AbstractC47813a aVar, BaseBridgeMethod.AbstractC34965a aVar2) {
                this.f103958a = jSONObject;
                this.f103959b = jSONObject2;
                this.f103960c = aVar;
                this.f103961d = aVar2;
            }

            public final void run() {
                BaseCommonJavaMethod.AbstractC47813a aVar = this.f103960c;
                if (aVar != null) {
                    aVar.mo79888a(this.f103958a);
                }
                BaseBridgeMethod.AbstractC34965a aVar2 = this.f103961d;
                if (aVar2 != null) {
                    aVar2.mo61874a(this.f103958a);
                }
            }
        }

        public /* synthetic */ C44549a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m87294a(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar, BaseBridgeMethod.AbstractC34965a aVar2) {
            if (jSONObject != null) {
                C2732a.f8145a.mo7365c(jSONObject.getString("nonce"));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "success");
                new Handler(Looper.getMainLooper()).post(new RunnableC44550a(jSONObject2, jSONObject, aVar, aVar2));
            }
        }
    }

    private /* synthetic */ UpdateNonceMethod() {
        this((C18288a) null);
    }

    public UpdateNonceMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C44549a.m87294a(jSONObject, aVar, null);
    }
}
