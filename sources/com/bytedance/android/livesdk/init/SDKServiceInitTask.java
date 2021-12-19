package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.core.AbstractC3826a;
import com.bytedance.android.live.core.C3852b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.other.LiveFakeRegionChannelSettings;
import com.bytedance.android.livesdk.p425aa.p429d.C6541c;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.android.livesdk.p667x.AbstractC11587a;
import com.bytedance.android.livesdk.utils.C11267i;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p700m.C11828a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4560f.p4561a.p4587h.C88925a;

public class SDKServiceInitTask extends AbstractC11587a {
    static {
        Covode.recordClassIndex(9903);
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public int getTaskId() {
        return 0;
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public String getTaskName() {
        return "sdk_service_init_task";
    }

    private static boolean isDebug() {
        if (C6193a.m13435a(IHostContext.class) == null || !((IHostContext) C6193a.m13435a(IHostContext.class)).isLocalTest()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public void run() {
        C6541c.f16337a = System.currentTimeMillis();
        if (C88925a.f201933a == null && !isDebug()) {
            C88925a.m154177a(C9004b.f22138a);
        }
        if (Arrays.asList(LiveFakeRegionChannelSettings.INSTANCE.getValue()).contains(((IHostContext) C6193a.m13435a(IHostContext.class)).getChannel())) {
            C6802e.f16867b = true;
        } else {
            C6802e.f16867b = false;
        }
        C3852b.f10640a = new AbstractC3826a() {
            /* class com.bytedance.android.livesdk.init.SDKServiceInitTask.C90021 */

            static {
                Covode.recordClassIndex(9904);
            }
        };
        C11828a.f28188a = new C11267i();
    }

    static final /* synthetic */ void lambda$run$0$SDKServiceInitTask(Throwable th) {
        if (th == null) {
            th = new UnknownError("unknown error");
        }
        C3854a.m9453a(6, "RxJava", "message = " + th.getMessage());
        if (th.getStackTrace() != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                C3854a.m9453a(6, "RxJava", "\t\t" + stackTrace[i].toString());
            }
        }
    }
}
