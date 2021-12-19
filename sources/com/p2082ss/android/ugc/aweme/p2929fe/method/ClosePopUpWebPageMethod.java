package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.sdk.webview.C30245c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38682bi;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ClosePopUpWebPageMethod */
public final class ClosePopUpWebPageMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47822a f110776a = new C47822a((byte) 0);

    static {
        Covode.recordClassIndex(56458);
    }

    private ClosePopUpWebPageMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ClosePopUpWebPageMethod$a */
    public static final class C47822a {
        static {
            Covode.recordClassIndex(56459);
        }

        private C47822a() {
        }

        public /* synthetic */ C47822a(byte b) {
            this();
        }
    }

    private /* synthetic */ ClosePopUpWebPageMethod() {
        this((C18288a) null);
    }

    public ClosePopUpWebPageMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C38682bi biVar;
        Context context;
        Context context2;
        C30245c cVar = (C30245c) this.f110764c.get();
        if (cVar != null) {
            biVar = (C38682bi) cVar.mo53698a(C38682bi.class);
            if (biVar != null) {
                context = biVar.getContext();
            }
            context = null;
        } else {
            biVar = null;
            context = null;
        }
        if (!(context instanceof ActivityC0945e) && aVar != null) {
            aVar.mo79885a(-1, "not fragmentActivity");
        }
        if (biVar != null) {
            context2 = biVar.getContext();
        } else {
            context2 = null;
        }
        if (!(context2 instanceof ActivityC0945e)) {
            context2 = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context2;
        if (eVar != null) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                a.mo58938b(eVar);
            }
            if (aVar != null) {
                aVar.mo79886a((Object) null);
            }
        }
    }
}
