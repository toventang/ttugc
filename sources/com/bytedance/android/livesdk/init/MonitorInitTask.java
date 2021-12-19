package com.bytedance.android.livesdk.init;

import android.app.Application;
import android.content.Context;
import com.bytedance.android.live.annotation.AbstractC2916a;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.other.LiveChainMonitorExcludeErrorCodesSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableTimeCostSetting;
import com.bytedance.android.livesdk.p667x.AbstractC11587a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.C11868d;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.List;

@AbstractC2916a(mo7569a = 3)
public class MonitorInitTask extends AbstractC11587a {
    static {
        Covode.recordClassIndex(9901);
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public String getTaskName() {
        return "monitor_init_task";
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public void run() {
        try {
            C4017b.f11013a = LiveEnableTimeCostSetting.INSTANCE.enable();
            List<Integer> value = LiveChainMonitorExcludeErrorCodesSetting.INSTANCE.getValue();
            if (value != null && value.size() > 0) {
                C11868d.f28398a = value;
            }
            initHybridMonitor();
        } catch (Throwable unused) {
        }
    }

    private void initHybridMonitor() {
        IHostContext iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class);
        if (iHostContext != null && iHostContext.context() != null && m17353xccfc447f(iHostContext.context()) != null && (m17353xccfc447f(iHostContext.context()) instanceof Application)) {
            HybridMonitor.getInstance().init((Application) m17353xccfc447f(iHostContext.context()));
        }
    }

    /* renamed from: com_bytedance_android_livesdk_init_MonitorInitTask_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m17353xccfc447f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }
}
