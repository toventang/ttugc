package com.bytedance.android.livesdk.function;

import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.function.p */
final /* synthetic */ class C8773p implements AbstractC88433f {

    /* renamed from: a */
    private final UserPermissionCheckWidget f21632a;

    static {
        Covode.recordClassIndex(9650);
    }

    C8773p(UserPermissionCheckWidget userPermissionCheckWidget) {
        this.f21632a = userPermissionCheckWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C2912a) {
            C2912a aVar = (C2912a) th;
            int errorCode = aVar.getErrorCode();
            String prompt = aVar.getPrompt();
            if (errorCode >= 30001 && errorCode <= 30006) {
                if (!TextUtils.isEmpty(prompt)) {
                    C11226ao.m19883a(C3966y.m9669e(), prompt, 0);
                }
                C6779a.m14563a().mo13053a(new C7400q(35));
                return;
            }
        }
        C6555i.m14021b();
        C3854a.m9455a(6, "ttlive_exception", th.getStackTrace());
    }
}
