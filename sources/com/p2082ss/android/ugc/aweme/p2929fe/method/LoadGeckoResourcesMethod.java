package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LoadGeckoResourcesMethod */
public final class LoadGeckoResourcesMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47848a f110845a = new C47848a((byte) 0);

    static {
        Covode.recordClassIndex(56504);
    }

    private LoadGeckoResourcesMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadGeckoResourcesMethod$a */
    public static final class C47848a {
        static {
            Covode.recordClassIndex(56505);
        }

        private C47848a() {
        }

        public /* synthetic */ C47848a(byte b) {
            this();
        }
    }

    private /* synthetic */ LoadGeckoResourcesMethod() {
        this((C18288a) null);
    }

    public LoadGeckoResourcesMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        AbstractC33368e a;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (jSONObject.has("channels")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("channels");
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                C89219l.m154716b(optString, "");
                arrayList.add(optString);
            }
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (!(f == null || (a = f.mo59376a()) == null)) {
                a.mo59418c(arrayList);
            }
        }
    }
}
