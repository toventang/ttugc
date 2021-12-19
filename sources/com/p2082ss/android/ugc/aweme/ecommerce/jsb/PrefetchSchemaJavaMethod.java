package com.p2082ss.android.ugc.aweme.ecommerce.jsb;

import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.C44557b;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.PrefetchSchemaJavaMethod */
public final class PrefetchSchemaJavaMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public final C18288a f103956a;

    static {
        Covode.recordClassIndex(52907);
    }

    private PrefetchSchemaJavaMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ PrefetchSchemaJavaMethod() {
        this((C18288a) null);
    }

    public PrefetchSchemaJavaMethod(C18288a aVar) {
        super(aVar);
        this.f103956a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        Context context;
        WebView webView;
        if (aVar != null) {
            C18288a aVar2 = this.f103956a;
            if (aVar2 == null || (webView = aVar2.f43654d) == null) {
                context = null;
            } else {
                context = webView.getContext();
            }
            aVar.mo79886a((Object) C44557b.C44558a.m87306a(jSONObject, context));
        }
    }
}
