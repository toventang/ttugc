package com.bytedance.android.livesdk.callback;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.callback.b */
public abstract class AbstractC7258b {

    /* renamed from: a */
    public long f18059a;

    static {
        Covode.recordClassIndex(8007);
    }

    /* renamed from: a */
    public abstract void mo13461a(Map<String, Object> map);

    public AbstractC7258b() {
    }

    /* renamed from: com.bytedance.android.livesdk.callback.b$a */
    public enum EnumC7259a {
        AUDIENCE_LIVE_PLAY_DURATION;

        static {
            Covode.recordClassIndex(8008);
        }
    }

    public AbstractC7258b(long j) {
        this.f18059a = j;
    }
}
