package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Intent;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34322e;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePopMethod */
public final class RoutePopMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C47883a f110905b = new C47883a((byte) 0);

    /* renamed from: a */
    public final C18288a f110906a;

    static {
        Covode.recordClassIndex(56562);
    }

    private RoutePopMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePopMethod$a */
    public static final class C47883a {
        static {
            Covode.recordClassIndex(56563);
        }

        private C47883a() {
        }

        public /* synthetic */ C47883a(byte b) {
            this();
        }
    }

    private /* synthetic */ RoutePopMethod() {
        this((C18288a) null);
    }

    public RoutePopMethod(C18288a aVar) {
        super(aVar);
        this.f110906a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        AbsActivityContainer a = mo79878a();
        if (a != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                C34322e.m70198a(jSONObject2, jSONObject);
            }
            Intent intent = new Intent();
            intent.putExtra("serialized_data", jSONObject2.toString());
            a.mo69612a(intent);
            a.mo69624l();
            if (aVar != null) {
                aVar.mo79887a(new JSONObject(), 1, "pop succeed");
            }
        } else if (aVar != null) {
            aVar.mo79885a(-1, "params not valid");
        }
    }
}
