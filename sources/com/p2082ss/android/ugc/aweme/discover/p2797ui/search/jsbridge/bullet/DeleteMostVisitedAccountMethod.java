package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.DeleteMostVisitedAccountMethod */
public final class DeleteMostVisitedAccountMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C42919a f100070b = new C42919a((byte) 0);

    /* renamed from: c */
    private final String f100071c = "deleteMostVisitedAccount";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f100072d = AbstractC16183k.EnumC16184a.PRIVATE;

    static {
        Covode.recordClassIndex(51027);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.DeleteMostVisitedAccountMethod$a */
    public static final class C42919a {
        static {
            Covode.recordClassIndex(51028);
        }

        private C42919a() {
        }

        public /* synthetic */ C42919a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f100072d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100071c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f100072d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteMostVisitedAccountMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("uid", "");
        if (!TextUtils.isEmpty(optString)) {
            SuggestWordsApi.C41852a aVar2 = new SuggestWordsApi.C41852a();
            aVar2.f97645h = optString;
            SuggestWordsApi.m83834b(aVar2);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo61874a(jSONObject2);
    }
}
