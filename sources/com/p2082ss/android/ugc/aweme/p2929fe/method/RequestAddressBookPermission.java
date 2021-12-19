package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.utils.C80241be;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RequestAddressBookPermission */
public final class RequestAddressBookPermission extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47880a f110899a = new C47880a((byte) 0);

    static {
        Covode.recordClassIndex(56555);
    }

    private RequestAddressBookPermission(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RequestAddressBookPermission$a */
    public static final class C47880a {
        static {
            Covode.recordClassIndex(56556);
        }

        private C47880a() {
        }

        public /* synthetic */ C47880a(byte b) {
            this();
        }
    }

    private /* synthetic */ RequestAddressBookPermission() {
        this((C18288a) null);
    }

    public RequestAddressBookPermission(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (C80241be.m139079a(C17867d.m33078a())) {
            if (aVar != null) {
                aVar.mo79887a("", 1, "");
            }
        } else if (aVar != null) {
            aVar.mo79885a(0, "");
        }
    }
}
