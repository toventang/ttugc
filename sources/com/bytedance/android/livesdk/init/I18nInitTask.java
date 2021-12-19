package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.annotation.AbstractC2916a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.i18n.C8983b;
import com.bytedance.android.livesdk.p667x.AbstractC11587a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

@AbstractC2916a(mo7569a = 1)
public class I18nInitTask extends AbstractC11587a {
    static {
        Covode.recordClassIndex(9899);
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public String getTaskName() {
        return "i18n_init_task";
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public List<Integer> preTasks() {
        return Arrays.asList(4);
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public void run() {
        C8983b.m17319a().mo15220a(((IHostContext) C6193a.m13435a(IHostContext.class)).currentLocale());
    }
}
