package com.p2082ss.android.ugc.aweme.services.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p2082ss.android.ugc.aweme.utils.C80583iq;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.config.ShortVideoConfigBaseImpl */
public abstract class ShortVideoConfigBaseImpl implements IShortVideoConfig {
    static {
        Covode.recordClassIndex(79750);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IShortVideoConfig
    public long maxDuetVideoTime() {
        return 60500;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IShortVideoConfig
    public long maxRecordingTime() {
        return 15000;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IShortVideoConfig
    public long maxStitchVideoTime() {
        return 60000;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean isHookLibrary() {
        return C80583iq.m139714a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean isRecording() {
        return C63238c.m114591a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean getUsingOnline() {
        return C89219l.m154714a((Object) C16048b.m29633a().mo25417a(true, "localtest_effect_inhouse_property", "1,2,3,4,5"), (Object) "");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IShortVideoConfig
    public void enableHookLibrary(boolean z) {
        C80583iq.m139713a(z);
    }
}
