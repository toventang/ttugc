package com.p2082ss.android.ugc.aweme.request_combine.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;

/* renamed from: com.ss.android.ugc.aweme.request_combine.task.FetchCombineSettingsTask */
public final class FetchCombineSettingsTask extends BaseFetchCombineSettingsTask implements AbstractC58084a {
    static {
        Covode.recordClassIndex(78780);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n, com.p2082ss.android.ugc.aweme.request_combine.task.BaseFetchCombineSettingsTask
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: c */
    public final String[] mo28603c() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: d */
    public final int mo28604d() {
        return 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n, com.p2082ss.android.ugc.aweme.request_combine.task.BaseFetchCombineSettingsTask
    /* renamed from: h */
    public final String mo28608h() {
        return "FetchCombineSettingsTask";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: e */
    public final EnumC58149ac mo28605e() {
        return EnumC58149ac.CPU;
    }
}
