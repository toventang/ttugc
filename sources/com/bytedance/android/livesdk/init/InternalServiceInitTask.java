package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.annotation.AbstractC2916a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p667x.AbstractC11587a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

@AbstractC2916a(mo7569a = 2)
public class InternalServiceInitTask extends AbstractC11587a {
    static {
        Covode.recordClassIndex(9900);
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public String getTaskName() {
        return "internal_service_init_task";
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public List<Integer> preTasks() {
        return Arrays.asList(1);
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public void run() {
        AbstractC4357d dVar = (AbstractC4357d) C6193a.m13435a(AbstractC4357d.class);
        if (dVar != null) {
            dVar.getDnsOptimizer().mo11510a();
            dVar.getLiveStreamStrategy().mo11556a();
        }
    }
}
