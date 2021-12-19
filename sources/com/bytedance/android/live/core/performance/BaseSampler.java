package com.bytedance.android.live.core.performance;

import android.os.Handler;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;

public abstract class BaseSampler<T> implements Runnable, Runnable {

    /* renamed from: c */
    private static final String f10990c = BaseSampler.class.getClass().getSimpleName();

    /* renamed from: a */
    protected Handler f10991a;

    /* renamed from: b */
    protected AbstractC4012a f10992b;

    /* renamed from: com.bytedance.android.live.core.performance.BaseSampler$a */
    public interface AbstractC4012a {
        static {
            Covode.recordClassIndex(4546);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onStart() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
    }

    static {
        Covode.recordClassIndex(4545);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        C3854a.m9453a(3, f10990c, "onDestroy");
        Handler handler = this.f10991a;
        if (handler != null) {
            handler.removeCallbacks(this);
            this.f10991a = null;
        }
        if (this.f10992b != null) {
            this.f10992b = null;
        }
    }
}
