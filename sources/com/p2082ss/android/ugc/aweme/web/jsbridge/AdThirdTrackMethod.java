package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod */
public final class AdThirdTrackMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C81555a f182366a = new C81555a((byte) 0);

    static {
        Covode.recordClassIndex(94934);
    }

    private AdThirdTrackMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod$a */
    public static final class C81555a {
        static {
            Covode.recordClassIndex(94935);
        }

        private C81555a() {
        }

        public /* synthetic */ C81555a(byte b) {
            this();
        }
    }

    private /* synthetic */ AdThirdTrackMethod() {
        this((C18288a) null);
    }

    public AdThirdTrackMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod$b */
    static final class C81556b extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ String f182367a;

        /* renamed from: b */
        final /* synthetic */ String f182368b;

        static {
            Covode.recordClassIndex(94936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81556b(String str, String str2) {
            super(2);
            this.f182367a = str;
            this.f182368b = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                bVar2.f90214d = this.f182367a;
                return bVar2;
            }
            String str = this.f182368b;
            C89219l.m154716b(str, "");
            return bVar2.mo66503c(C89361p.m154865g(str));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
            String optString = jSONObject.optString("track_label");
            String optString2 = jSONObject.optString("creative_id");
            String optString3 = jSONObject.optString("log_extra");
            String optString4 = jSONObject.optString("ad_id");
            String optString5 = jSONObject.optString("group_id");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                if (aVar != null) {
                    aVar.mo79885a(-1, "empty track_url_list");
                }
            } else if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString6 = optJSONArray.optString(i);
                    C89219l.m154716b(optString6, "");
                    arrayList.add(optString6);
                }
                C89219l.m154716b(optString, "");
                C89219l.m154716b(optString2, "");
                C38164aj.m77370a(optString, arrayList, C89361p.m154865g(optString2), optString3, new C81556b(optString5, optString4));
                if (aVar != null) {
                    aVar.mo79886a((Object) null);
                }
            } else if (aVar != null) {
                aVar.mo79885a(-1, "empty trackLabel or creativeId");
            }
        }
    }
}
