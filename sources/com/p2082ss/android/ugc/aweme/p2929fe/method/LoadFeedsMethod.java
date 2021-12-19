package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.C47940a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api.AbstractC47950a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.p2933b.C47953a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod */
public final class LoadFeedsMethod extends BaseCommonJavaMethod implements AbstractC33974au, AbstractC47950a {

    /* renamed from: b */
    public static final C47846a f110841b = new C47846a((byte) 0);

    /* renamed from: a */
    public String f110842a;

    /* renamed from: d */
    private final AbstractC89244h f110843d;

    static {
        Covode.recordClassIndex(56501);
    }

    private LoadFeedsMethod(byte b) {
        this();
    }

    /* renamed from: c */
    private final C47940a m90861c() {
        return (C47940a) this.f110843d.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod$a */
    public static final class C47846a {
        static {
            Covode.recordClassIndex(56502);
        }

        private C47846a() {
        }

        public /* synthetic */ C47846a(byte b) {
            this();
        }
    }

    private /* synthetic */ LoadFeedsMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod$b */
    static final class C47847b extends AbstractC89220m implements AbstractC89171a<C47940a> {

        /* renamed from: a */
        final /* synthetic */ LoadFeedsMethod f110844a;

        static {
            Covode.recordClassIndex(56503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47847b(LoadFeedsMethod loadFeedsMethod) {
            super(0);
            this.f110844a = loadFeedsMethod;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47940a invoke() {
            return C47940a.C47941a.m90937a(new C47953a(), this.f110844a.f110842a, this.f110844a);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        m90861c().f111047a.dispose();
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.w0, null);
        }
    }

    public LoadFeedsMethod(C18288a aVar) {
        super(aVar);
        this.f110843d = C89250i.m154773a((AbstractC89171a) new C47847b(this));
        this.f110842a = "";
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

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api.AbstractC47950a
    /* renamed from: b */
    public final void mo61900b(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        sendEvent(str, jSONObject, 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        int i = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("base_url") && jSONObject.has("react_id") && jSONObject.has("page") && jSONObject.has("size") && !jSONObject.optBoolean("clear", false)) {
            String optString = jSONObject.optString("react_id");
            C89219l.m154716b(optString, "");
            this.f110842a = optString;
            String optString2 = jSONObject.optString("base_url");
            int optInt = jSONObject.optInt("page");
            int optInt2 = jSONObject.optInt("size");
            m90861c().mData.f111066a.clear();
            C47940a c = m90861c();
            C89219l.m154716b(optString2, "");
            Context actContext = getActContext();
            Objects.requireNonNull(actContext, "null cannot be cast to non-null type android.app.Activity");
            c.mo79955a(optString2, optInt, optInt2, (Activity) actContext);
            z = true;
        }
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!z) {
                i = -1;
            }
            jSONObject2.put("code", i);
            aVar.mo79888a(jSONObject2);
        }
    }
}
