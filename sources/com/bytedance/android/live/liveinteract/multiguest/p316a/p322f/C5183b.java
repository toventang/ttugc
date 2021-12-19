package com.bytedance.android.live.liveinteract.multiguest.p316a.p322f;

import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.C7651a;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.f.b */
final /* synthetic */ class C5183b implements AbstractC88433f {

    /* renamed from: a */
    private final C5182a f13415a;

    static {
        Covode.recordClassIndex(5775);
    }

    C5183b(C5182a aVar) {
        this.f13415a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C5182a aVar = this.f13415a;
        C7651a aVar2 = (C7651a) ((C5832d) obj).data;
        aVar.f13404c = false;
        if (aVar.f14407f != null) {
            C6894d.m14753a().f17260e = aVar2.f18957b;
            C6898g.C6899a.f17285a.mo13199a(C11115u.m19743a().mo17915b().mo13161c(), aVar2.f18957b);
            C6894d.m14753a().f17261f = aVar2.f18958c;
            C4386c.m10499a().mo10159a((Integer) 1);
            C4386c.m10499a().f11990k = aVar.f13403b;
            C4386c.m10499a().f11991l = aVar2.f18959d;
            String b = C4139e.C4140a.f11575b.mo46674b(aVar2);
            C5702a.m12449a("LinkIn_Guest_Apply_Success", b);
            String str = "";
            C89219l.m154721d(b, str);
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "response", b);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14493i);
            C5714i iVar = C5714i.f14494j;
            C5714i.m12550a((C5714i) false, (boolean) "apply_succeed", (String) jSONObject, (JSONObject) 0);
            Object a = C4431e.f12034a.mo10199a("MULTI_GUEST_DATA_HOLDER");
            if (a instanceof C5271a) {
                C5271a aVar3 = (C5271a) a;
                aVar3.mo11112c().clear();
                aVar3.mo11112c().putAll(aVar2.f18961f);
                C5713h.m12503a(aVar.f13403b, aVar2.f18959d, aVar.f13402a.getOwner().getFollowInfo().getFollowStatus(), aVar.f13406e, aVar3.f13646q);
            } else {
                C5713h.m12503a(aVar.f13403b, aVar2.f18959d, aVar.f13402a.getOwner().getFollowInfo().getFollowStatus(), aVar.f13406e, (EnumC4422k) null);
            }
            C6894d.m14753a().f17277x = false;
            C5134a.AbstractC5136b bVar = (C5134a.AbstractC5136b) aVar.f14407f;
            if (!TextUtils.isEmpty(aVar2.f18960e)) {
                str = aVar2.f18960e;
            }
            bVar.mo10878a(str);
        }
    }
}
