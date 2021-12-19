package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.BdturingMethod */
public final class BdturingMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47816a f110770a = new C47816a((byte) 0);

    static {
        Covode.recordClassIndex(56447);
    }

    private BdturingMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.BdturingMethod$a */
    public static final class C47816a {
        static {
            Covode.recordClassIndex(56448);
        }

        private C47816a() {
        }

        public /* synthetic */ C47816a(byte b) {
            this();
        }
    }

    private /* synthetic */ BdturingMethod() {
        this((C18288a) null);
    }

    public BdturingMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.BdturingMethod$b */
    public static final class C47817b extends C67837a {

        /* renamed from: a */
        final /* synthetic */ String f110771a;

        /* renamed from: b */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110772b;

        static {
            Covode.recordClassIndex(56449);
        }

        C47817b(String str, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110771a = str;
            this.f110772b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
        /* renamed from: a */
        public final void mo61882a(boolean z, int i) {
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110772b;
            if (aVar != null) {
                aVar.mo79886a(Integer.valueOf(i));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        Context context;
        if (jSONObject == null || (str = jSONObject.optString("decision")) == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            WeakReference weakReference = this.mContextRef;
            Activity activity = null;
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = context;
            }
            Activity activity2 = activity;
            if (activity2 != null) {
                SecApiImpl.m119993a().popCaptchaV2(activity2, str, new C47817b(str, aVar));
            }
        } else if (aVar != null) {
            aVar.mo79886a((Object) 1);
        }
    }
}
