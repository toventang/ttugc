package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.C42917a;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ComponentDidMountMethod */
public final class ComponentDidMountMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47823a f110777a = new C47823a((byte) 0);

    static {
        Covode.recordClassIndex(56460);
    }

    private ComponentDidMountMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ComponentDidMountMethod$a */
    public static final class C47823a {
        static {
            Covode.recordClassIndex(56461);
        }

        private C47823a() {
        }

        public /* synthetic */ C47823a(byte b) {
            this();
        }
    }

    private /* synthetic */ ComponentDidMountMethod() {
        this((C18288a) null);
    }

    public ComponentDidMountMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (this.mJsBridge != null) {
            AbstractC81915c.m141874a(new C42917a());
        }
    }
}
