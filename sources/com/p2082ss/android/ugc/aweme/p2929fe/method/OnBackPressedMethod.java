package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod */
public final class OnBackPressedMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47853a f110853a = new C47853a((byte) 0);

    static {
        Covode.recordClassIndex(56513);
    }

    private OnBackPressedMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod$a */
    public static final class C47853a {
        static {
            Covode.recordClassIndex(56514);
        }

        private C47853a() {
        }

        public /* synthetic */ C47853a(byte b) {
            this();
        }
    }

    private /* synthetic */ OnBackPressedMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod$b */
    static final class C47854b implements CrossPlatformActivity.AbstractC40526a {

        /* renamed from: a */
        final /* synthetic */ OnBackPressedMethod f110854a;

        /* renamed from: b */
        final /* synthetic */ int f110855b;

        static {
            Covode.recordClassIndex(56515);
        }

        C47854b(OnBackPressedMethod onBackPressedMethod, int i) {
            this.f110854a = onBackPressedMethod;
            this.f110855b = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.AbstractC40526a
        /* renamed from: a */
        public final boolean mo69627a() {
            this.f110854a.sendEvent("onBackPressed_event", new JSONObject(), 3);
            if (this.f110855b == 1) {
                return true;
            }
            return false;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        Context actContext = getActContext();
        if (!(actContext instanceof CrossPlatformActivity)) {
            actContext = null;
        }
        CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) actContext;
        if (crossPlatformActivity != null) {
            crossPlatformActivity.f94803d = null;
        }
    }

    public OnBackPressedMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        C89219l.m154721d(weakReference, "");
        Context context = weakReference.get();
        if (context instanceof AbstractC1204m) {
            ((AbstractC1204m) context).getLifecycle().mo4012a(this);
        }
        BaseCommonJavaMethod attach = super.attach(weakReference);
        C89219l.m154716b(attach, "");
        return attach;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject != null && aVar != null) {
            Context actContext = getActContext();
            if (!(actContext instanceof CrossPlatformActivity)) {
                actContext = null;
            }
            CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) actContext;
            if (crossPlatformActivity != null) {
                int optInt = jSONObject.optInt("actionType", 0);
                if (optInt == 0) {
                    crossPlatformActivity.f94803d = null;
                } else {
                    crossPlatformActivity.f94803d = new C47854b(this, optInt);
                }
            }
        }
    }
}
