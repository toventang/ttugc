package com.bytedance.creativex.recorder.p940b.p941a;

import androidx.core.p036g.C0693f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import java.util.List;

/* renamed from: com.bytedance.creativex.recorder.b.a.t */
public final class C14201t extends AbstractC14175b {

    /* renamed from: e */
    private static final C0693f.C0695b<C14201t> f34475e = new C0693f.C0695b<>(1);

    /* renamed from: a */
    public List<TimeSpeedModelExtension> f34476a;

    /* renamed from: b */
    public long f34477b;

    /* renamed from: c */
    public TimeSpeedModelExtension f34478c;

    /* renamed from: d */
    public boolean f34479d;

    private C14201t() {
    }

    static {
        Covode.recordClassIndex(16270);
    }

    /* renamed from: a */
    public final void mo22926a() {
        f34475e.release(this);
    }

    public final String toString() {
        return "RecordingProgressUpdateEvent{timeSpeedModels=" + this.f34476a + ", elapsedTimeInMicros=" + this.f34477b + '}';
    }

    /* renamed from: a */
    public static C14201t m25946a(List<TimeSpeedModelExtension> list, long j) {
        return m25948a(list, j, false);
    }

    /* renamed from: a */
    public static C14201t m25947a(List<TimeSpeedModelExtension> list, long j, TimeSpeedModelExtension timeSpeedModelExtension) {
        C14201t a = m25948a(list, j, false);
        a.f34478c = timeSpeedModelExtension;
        return a;
    }

    /* renamed from: a */
    public static C14201t m25948a(List<TimeSpeedModelExtension> list, long j, boolean z) {
        C14201t acquire = f34475e.acquire();
        if (acquire == null) {
            acquire = new C14201t();
        }
        acquire.f34478c = null;
        acquire.f34476a = list;
        acquire.f34477b = j;
        acquire.f34479d = z;
        return acquire;
    }
}
