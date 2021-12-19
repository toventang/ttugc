package com.bytedance.android.livesdk.p433ac;

import android.view.View;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p405s.p406a.C6096a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.ac.d */
final /* synthetic */ class View$OnClickListenerC6588d implements View.OnClickListener {

    /* renamed from: a */
    private final C6586c f16485a;

    static {
        Covode.recordClassIndex(7324);
    }

    View$OnClickListenerC6588d(C6586c cVar) {
        this.f16485a = cVar;
    }

    public final void onClick(View view) {
        C6586c cVar = this.f16485a;
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = C6586c.m14082a();
        }
        if (!C58029j.f132253e) {
            C11226ao.m19882a(cVar.f16474e, (int) R.string.edd);
        } else {
            C6096a aVar = cVar.f16475f;
            C6558k.m14024a(cVar.f16474e);
            cVar.f16472c.setVisibility(0);
            cVar.f16471b.setVisibility(8);
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).updateAdmin(cVar, !aVar.f15237g, aVar, cVar.f16476g, cVar.f16477h, cVar.f16478i);
            C6501b.C6502a.m13948a("livesdk_anchor_admin_cancel_toast_click").mo12639a().mo12646a("user_id", cVar.f16475f.f15231a).mo12651a("action_type", "yes").mo12655b();
            C6501b.C6502a.m13948a("livesdk_anchor_admin_cancel_toast_show").mo12639a().mo12646a("user_id", cVar.f16475f.f15231a).mo12655b();
            C6558k.m14024a(cVar.f16474e);
        }
        C6501b.C6502a.m13948a("livesdk_anchor_admin_cancel_click").mo12639a().mo12646a("user_id", cVar.f16475f.f15231a).mo12655b();
    }
}
