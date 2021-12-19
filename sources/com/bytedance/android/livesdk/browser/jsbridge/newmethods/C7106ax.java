package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.gift.model.C8847k;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.bytedance.ies.web.jsbridge2.EnumC18323ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ax */
public final class C7106ax extends AbstractC18334e<JSONObject, C8847k> {
    static {
        Covode.recordClassIndex(7852);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18332c
    public final EnumC18323ah getPermissionGroup() {
        return EnumC18323ah.PRIVATE;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        int i;
        T t;
        List<C9904t> list;
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154721d(jSONObject2, "");
        C89219l.m154721d(gVar, "");
        Object obj = jSONObject2.get("pageType");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        AbstractC2953a a = C6193a.m13435a(IGiftService.class);
        C89219l.m154716b(a, "");
        List<GiftPage> giftPages = ((IGiftService) a).getGiftPages();
        C89219l.m154716b(giftPages, "");
        Iterator<T> it = giftPages.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.pageType == i) {
                break;
            }
        }
        T t2 = t;
        C8847k kVar = new C8847k();
        if (!(t2 == null || t2.gifts == null)) {
            i2 = 1;
        }
        kVar.f21732b = i2;
        if (t2 == null || t2.gifts == null) {
            list = new ArrayList<>();
        } else {
            list = t2.gifts;
        }
        kVar.f21731a = list;
        finishWithResult(kVar);
    }
}
