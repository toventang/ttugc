package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.C47951b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api.AbstractC47950a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.p2933b.C47953a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod */
public final class LoadFeedsFlowMethod extends BaseCommonJavaMethod implements AbstractC33974au, AbstractC47950a {

    /* renamed from: b */
    public static final C47843a f110835b = new C47843a((byte) 0);

    /* renamed from: a */
    public String f110836a;

    /* renamed from: d */
    private final AbstractC89244h f110837d;

    /* renamed from: e */
    private final AbstractC89244h f110838e;

    static {
        Covode.recordClassIndex(56496);
    }

    private LoadFeedsFlowMethod(byte b) {
        this();
    }

    /* renamed from: c */
    private final C47951b m90857c() {
        return (C47951b) this.f110837d.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod$a */
    public static final class C47843a {
        static {
            Covode.recordClassIndex(56497);
        }

        private C47843a() {
        }

        public /* synthetic */ C47843a(byte b) {
            this();
        }
    }

    private /* synthetic */ LoadFeedsFlowMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod$b */
    static final class C47844b extends AbstractC89220m implements AbstractC89171a<C47951b> {

        /* renamed from: a */
        final /* synthetic */ LoadFeedsFlowMethod f110839a;

        static {
            Covode.recordClassIndex(56498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47844b(LoadFeedsFlowMethod loadFeedsFlowMethod) {
            super(0);
            this.f110839a = loadFeedsFlowMethod;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47951b invoke() {
            return C47951b.C47952a.m90944a(new C47953a(), this.f110839a.f110836a, this.f110839a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod$c */
    static final class C47845c extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C47845c f110840a = new C47845c();

        static {
            Covode.recordClassIndex(56499);
        }

        C47845c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27917g().mo46681a((Type) Boolean.TYPE, (Object) new LoadFeedsFlowMethod$parser$2$1()).mo46682b();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.w0, null);
        }
    }

    public LoadFeedsFlowMethod(C18288a aVar) {
        super(aVar);
        this.f110837d = C89250i.m154773a((AbstractC89171a) new C47844b(this));
        this.f110838e = C89250i.m154773a((AbstractC89171a) C47845c.f110840a);
        this.f110836a = "";
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
        List<? extends Aweme> list;
        int i = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("react_id") && jSONObject.has("has_more") && jSONObject.has("aweme_list") && jSONObject.has("page") && 1 != 0) {
            if (!TextUtils.isEmpty(this.f110836a) && !TextUtils.equals(this.f110836a, jSONObject.optString("react_id"))) {
                m90857c().mo79957a();
            }
            String optString = jSONObject.optString("react_id");
            C89219l.m154716b(optString, "");
            this.f110836a = optString;
            if (jSONObject.has("clear_data") && jSONObject.optInt("clear_data") == 1) {
                m90857c().mo79957a();
            }
            Object[] objArr = (Object[]) ((C27910f) this.f110838e.getValue()).mo46670a(jSONObject.optString("aweme_list"), Aweme[].class);
            if (objArr == null || (list = C89064i.m154508i(objArr)) == null) {
                list = C89086z.INSTANCE;
            }
            if (list.isEmpty()) {
                list = C89086z.INSTANCE;
            } else if (C37699a.m76213P((Aweme) list.get(0))) {
                C37437a commerceVideoAuthInfo = ((Aweme) list.get(0)).getCommerceVideoAuthInfo();
                C89219l.m154716b(commerceVideoAuthInfo, "");
                if (!TextUtils.isEmpty(commerceVideoAuthInfo.getItemId())) {
                    ArrayList arrayList = new ArrayList();
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Aweme a = AwemeService.m70060b().mo60677a((Aweme) list.get(i2));
                        C89219l.m154716b(a, "");
                        arrayList.add(a);
                    }
                    list = arrayList;
                }
            }
            m90857c().mo79958a(list, jSONObject.optInt("page", 0), jSONObject.optBoolean("has_more", false), jSONObject.optBoolean("insert_before", false));
            z = true;
        }
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.w0, m90857c());
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
