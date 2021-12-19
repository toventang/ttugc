package com.bytedance.android.live.wallet.p418e;

import android.content.Context;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.wallet.C6336e;
import com.bytedance.android.live.wallet.p419f.p420a.C6351d;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.e.c */
public final class C6345c extends C6341a {

    /* renamed from: e */
    private C6351d f15861e;

    /* renamed from: f */
    private final C6346d f15862f;

    static {
        Covode.recordClassIndex(7067);
    }

    /* renamed from: d */
    private void m13701d() {
        C6351d dVar = this.f15861e;
        if (dVar != null) {
            dVar.mo12412f();
        }
        this.f15861e = null;
    }

    @Override // com.bytedance.android.live.wallet.p418e.C6341a, com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b
    /* renamed from: a */
    public final void mo12281a(DiamondPackageExtra diamondPackageExtra, List<C11314c> list) {
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            mo12282a(new Exception("chargeDeals is empty"), 0);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            JSONObject a = C11314c.m20058a(list.get(i));
            C89219l.m154716b(a, "");
            arrayList.add(a);
        }
        try {
            mo12394b().put("code", 0);
            mo12394b().put("args", arrayList);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f15854d.mo29249a(mo12391a().f43669b, mo12394b());
        m13701d();
    }

    @Override // com.bytedance.android.live.wallet.p418e.C6341a, com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(jSONObject, "");
        super.call(hVar, jSONObject);
        if (this.f15861e == null) {
            this.f15861e = this.f15862f.mo12403a(this.f15853c);
        }
        C6351d dVar = this.f15861e;
        if (dVar != null) {
            dVar.mo10297a((AbstractC16042a) this);
            dVar.mo12411e();
        }
        mo12392a(hVar);
        mo12393a(jSONObject);
        hVar.f43676i = false;
        HashMap hashMap = new HashMap();
        hashMap.put("methodName", "GetPurchaseItemListMethod");
        C3868c.m9491a("ttlive_wallet_H5_query", 0, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("request_page", "my_profile");
        hashMap2.put("pay_method", C6336e.C6337a.m13683b());
        C6501b.C6502a.m13948a("livesdk_recharge_show").mo12652a((Map<String, String>) hashMap2).mo12655b();
        List<C11314c> a = C6336e.f15839g.mo12388a();
        if (!C13603b.m24435a((Collection) a)) {
            C6351d dVar2 = this.f15861e;
            if (dVar2 != null) {
                dVar2.f15870c = a;
            }
            mo12281a((DiamondPackageExtra) null, a);
            return;
        }
        C6351d dVar3 = this.f15861e;
        if (dVar3 != null) {
            dVar3.mo12409c();
        }
    }

    @Override // com.bytedance.android.live.wallet.p418e.C6341a, com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b
    /* renamed from: a */
    public final void mo12282a(Exception exc, int i) {
        int i2;
        String message;
        try {
            JSONObject b = mo12394b();
            if (LiveWebRechargeAuditing.INSTANCE.getValue()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            b.put("is_outside_channel", i2);
            mo12394b().put("charge_error_code", i);
            mo12394b().put("source", 1);
            mo12394b().put("code", -1);
            JSONObject b2 = mo12394b();
            if (exc == null) {
                message = "";
            } else {
                message = exc.getMessage();
            }
            b2.put("msg", message);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f15854d.mo29249a(mo12391a().f43669b, mo12394b());
        m13701d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6345c(Context context, C18288a aVar, C6346d dVar) {
        super(context, aVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar, "");
        this.f15862f = dVar;
    }
}
