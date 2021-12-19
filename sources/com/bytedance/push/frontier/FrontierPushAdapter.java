package com.bytedance.push.frontier;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.frontier.p1594a.AbstractC21807b;
import com.bytedance.push.frontier.p1595b.C21811a;
import com.bytedance.push.settings.C21895h;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.third.AbstractC21918b;
import com.bytedance.push.third.C21922f;
import com.p2082ss.android.message.C30061a;

public class FrontierPushAdapter implements AbstractC21918b {
    private static int FRONTIER_PUSH = -1;

    @Override // com.bytedance.push.third.AbstractC21918b
    public boolean checkThirdPushConfig(String str, Context context) {
        return true;
    }

    public boolean requestNotificationPermission(int i) {
        return false;
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void setAlias(Context context, String str, int i) {
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void trackPush(Context context, int i, Object obj) {
    }

    static {
        Covode.recordClassIndex(25454);
    }

    public static int getFrontierPush() {
        if (FRONTIER_PUSH == -1) {
            FRONTIER_PUSH = C21922f.m41214a(C30061a.f71748a).mo35671a(FrontierPushAdapter.class.getName());
        }
        return FRONTIER_PUSH;
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void unregisterPush(Context context, int i) {
        C21810b a = C21810b.m40841a(context);
        a.f51687g = false;
        if (a.f51683c.get() != null) {
            a.f51683c.get().mo35489a();
        }
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public boolean isPushAvailable(Context context, int i) {
        if (i == getFrontierPush()) {
            C21810b a = C21810b.m40841a(context);
            PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) C21895h.m41120a(a.f51684d, PushOnlineSettings.class);
            if (pushOnlineSettings != null) {
                a.f51685e = pushOnlineSettings.mo35615m();
            }
            if (a.f51685e == 0 || ((a.f51685e != 1 || a.f51683c.get() == null) && a.f51685e != 2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void registerPush(Context context, int i) {
        C21810b a = C21810b.m40841a(context);
        if (a.f51685e == 2) {
            a.f51683c.set(C21811a.m40844a(a.f51684d, a.f51686f));
        }
        AbstractC21807b bVar = a.f51683c.get();
        if (bVar != null) {
            a.f51687g = true;
            bVar.mo35490a(a);
        }
    }
}
