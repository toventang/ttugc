package com.p2082ss.android.ugc.aweme.p2305ag;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.p932j.AbstractC13901d;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.ag.b */
public final class C33442b extends AbstractC13901d {

    /* renamed from: d */
    public static final C33443a f79489d = new C33443a((byte) 0);

    static {
        Covode.recordClassIndex(40299);
    }

    /* renamed from: com.ss.android.ugc.aweme.ag.b$a */
    public static final class C33443a {
        static {
            Covode.recordClassIndex(40300);
        }

        private C33443a() {
        }

        public /* synthetic */ C33443a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.crash.p932j.AbstractC13901d
    /* renamed from: a */
    public final void mo22384a() {
        Keva.getRepo("crash_marker_repo").storeLong("key_last_time", System.currentTimeMillis());
    }
}
