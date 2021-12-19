package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.C47951b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api.AbstractC47950a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.p2933b.C47953a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod */
public final class LoadFeedsFlowMethod extends BaseBridgeMethod implements AbstractC33974au, AbstractC47950a {

    /* renamed from: c */
    public static final C35063a f82731c = new C35063a((byte) 0);

    /* renamed from: b */
    public String f82732b = "";

    /* renamed from: d */
    private final String f82733d = "loadFeedsFlow";

    /* renamed from: e */
    private final AbstractC89244h f82734e = C89250i.m154773a((AbstractC89171a) new C35064b(this));

    /* renamed from: f */
    private final AbstractC89244h f82735f;

    static {
        Covode.recordClassIndex(42182);
    }

    /* renamed from: g */
    private final C47951b m71674g() {
        return (C47951b) this.f82734e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod$a */
    public static final class C35063a {
        static {
            Covode.recordClassIndex(42183);
        }

        private C35063a() {
        }

        public /* synthetic */ C35063a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82733d;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod$b */
    static final class C35064b extends AbstractC89220m implements AbstractC89171a<C47951b> {

        /* renamed from: a */
        final /* synthetic */ LoadFeedsFlowMethod f82736a;

        static {
            Covode.recordClassIndex(42184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35064b(LoadFeedsFlowMethod loadFeedsFlowMethod) {
            super(0);
            this.f82736a = loadFeedsFlowMethod;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47951b invoke() {
            return C47951b.C47952a.m90944a(new C47953a(), this.f82736a.f82732b, this.f82736a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod$c */
    static final class C35065c extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C35065c f82737a = new C35065c();

        static {
            Covode.recordClassIndex(42185);
        }

        C35065c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27917g().mo46681a((Type) Boolean.TYPE, (Object) new LoadFeedsFlowMethod$parser$2$1()).mo46682b();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e, com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        super.mo25721a();
        Context e = mo26893e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.w0, null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadFeedsFlowMethod(C16248b bVar) {
        super(bVar);
        AbstractC1196i lifecycle;
        C89219l.m154721d(bVar, "");
        Context e = mo26893e();
        AbstractC1204m mVar = (AbstractC1204m) (!(e instanceof AbstractC1204m) ? null : e);
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.mo4012a(this);
        }
        this.f82735f = C89250i.m154773a((AbstractC89171a) C35065c.f82737a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api.AbstractC47950a
    /* renamed from: b */
    public final void mo61900b(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        mo61865a(str, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        boolean z;
        List<? extends Aweme> list;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        int i = 1;
        boolean z2 = false;
        if (!jSONObject.has("react_id") || !jSONObject.has("has_more") || !jSONObject.has("aweme_list") || !jSONObject.has("page")) {
            z = false;
        } else {
            z = true;
        }
        Activity activity = null;
        if (z) {
            if (!TextUtils.isEmpty(this.f82732b) && !TextUtils.equals(this.f82732b, jSONObject.optString("react_id"))) {
                m71674g().mo79957a();
            }
            String optString = jSONObject.optString("react_id");
            C89219l.m154716b(optString, "");
            this.f82732b = optString;
            C47951b g = m71674g();
            Object[] objArr = (Object[]) ((C27910f) this.f82735f.getValue()).mo46670a(jSONObject.optString("aweme_list"), Aweme[].class);
            if (objArr == null || (list = C89064i.m154508i(objArr)) == null) {
                list = C89086z.INSTANCE;
            }
            g.mo79958a(list, jSONObject.optInt("page", 0), jSONObject.optBoolean("has_more", false), jSONObject.optBoolean("insert_before", false));
            z2 = true;
        }
        Context e = mo26893e();
        if (e instanceof Activity) {
            activity = e;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            activity2.findViewById(16908290).setTag(R.id.w0, m71674g());
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!z2) {
            i = -1;
        }
        jSONObject2.put("code", i);
        aVar.mo61874a(jSONObject2);
    }
}
