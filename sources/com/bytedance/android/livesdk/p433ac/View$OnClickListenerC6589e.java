package com.bytedance.android.livesdk.p433ac;

import android.view.View;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.ac.e */
final /* synthetic */ class View$OnClickListenerC6589e implements View.OnClickListener {

    /* renamed from: a */
    private final C6586c f16486a;

    static {
        Covode.recordClassIndex(7325);
    }

    View$OnClickListenerC6589e(C6586c cVar) {
        this.f16486a = cVar;
    }

    public final void onClick(View view) {
        C6586c cVar = this.f16486a;
        if (C11279p.m20022c()) {
            HashMap hashMap = new HashMap();
            hashMap.put("sec_user_id", cVar.f16475f.f15232b);
            ((IHostAction) C6193a.m13435a(IHostAction.class)).openUserProfilePage(cVar.f16475f.f15231a, hashMap);
            return;
        }
        C6779a.m14563a().mo13053a(new UserProfileEvent(cVar.f16475f.f15231a));
    }
}
