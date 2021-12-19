package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.AbstractC16249c;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchCardClickMethod */
public final class SearchCardClickMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C42942a f100132b = new C42942a((byte) 0);

    /* renamed from: c */
    private final String f100133c = "click_search_card";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f100134d = AbstractC16183k.EnumC16184a.PRIVATE;

    /* renamed from: e */
    private String f100135e = "";

    static {
        Covode.recordClassIndex(51064);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchCardClickMethod$a */
    public static final class C42942a {
        static {
            Covode.recordClassIndex(51065);
        }

        private C42942a() {
        }

        public /* synthetic */ C42942a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f100134d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100133c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f100134d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchCardClickMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        BulletContainerView bulletContainerView;
        Iterator<String> keys;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (jSONObject.has("card_params")) {
            this.f100135e = jSONObject.optString("react_id");
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("card_params");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C89219l.m154716b(next, "");
                        String string = optJSONObject.getString(next);
                        if (string == null) {
                            string = "";
                        }
                        linkedHashMap.put(next, string);
                    }
                }
                AbstractC16249c b = this.f38923a.mo25830b(BulletContainerView.class);
                if (!(b == null || (bulletContainerView = (BulletContainerView) b.mo25823b()) == null)) {
                    C42452d.m84859a(bulletContainerView, (String) linkedHashMap.get("search_result_id"), C42460j.C42461a.m84864a(bulletContainerView).f151318m, linkedHashMap);
                }
            } catch (Exception e) {
                aVar.mo61871a(0, e.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo61874a(jSONObject2);
    }
}
