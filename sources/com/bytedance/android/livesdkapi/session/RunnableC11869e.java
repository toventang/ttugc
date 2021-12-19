package com.bytedance.android.livesdkapi.session;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdkapi.session.e */
public final /* synthetic */ class RunnableC11869e implements Runnable {

    /* renamed from: a */
    private final ILinkSession f28400a;

    /* renamed from: b */
    private final int f28401b;

    static {
        Covode.recordClassIndex(13587);
    }

    RunnableC11869e(ILinkSession iLinkSession, int i) {
        this.f28400a = iLinkSession;
        this.f28401b = i;
    }

    public final void run() {
        String c;
        ILinkSession iLinkSession = this.f28400a;
        int i = this.f28401b;
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            JSONObject b = iLinkSession.mo18996b();
            if (b == null) {
                b = new JSONObject();
            }
            JSONObject jSONObject = new JSONObject();
            C11868d.m20960a(jSONObject, "status", String.valueOf(i));
            if (C11868d.f28398a == null || !C11868d.f28398a.contains(Integer.valueOf(i))) {
                c = iLinkSession.mo18997c();
            } else {
                c = "ttlive_room_enter_link_monitor_error";
            }
            if (((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline()) {
                C3854a.m9453a(3, "ttlive_room_enter_link_monitor", b.toString());
            }
            C11868d.m20958a(c, jSONObject, null, b);
        }
    }
}
