package com.bytedance.android.live.broadcast.p188b;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.b.b */
final /* synthetic */ class C3074b implements AbstractC88433f {

    /* renamed from: a */
    private final View$OnClickListenerC3073a f8933a;

    static {
        Covode.recordClassIndex(3554);
    }

    C3074b(View$OnClickListenerC3073a aVar) {
        this.f8933a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        View$OnClickListenerC3073a aVar = this.f8933a;
        C3272o oVar = (C3272o) ((C5832d) obj).data;
        if (oVar != null && !TextUtils.isEmpty(oVar.f9374i)) {
            aVar.f8913b = oVar.f9374i;
            C3051c.C3052a.m8359a("ttlive_fetch_room_info_all").mo12633b("pc_broadcast").mo12629a("addtional_prompt", aVar.f8913b).mo12632a();
            if (!aVar.isShowing()) {
                aVar.mo8349a();
            }
        }
    }
}
