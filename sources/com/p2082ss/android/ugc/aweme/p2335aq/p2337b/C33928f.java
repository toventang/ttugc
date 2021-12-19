package com.p2082ss.android.ugc.aweme.p2335aq.p2337b;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.aq.b.f */
public final class C33928f extends AnimationDrawable {

    /* renamed from: a */
    public AbstractC33929a f80240a;

    /* renamed from: b */
    private Handler f80241b = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.aq.b.f$a */
    public interface AbstractC33929a {
        static {
            Covode.recordClassIndex(40848);
        }
    }

    static {
        Covode.recordClassIndex(40847);
    }

    public C33928f() {
        setOneShot(false);
    }

    public final void stop() {
        super.stop();
        Handler handler = this.f80241b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.f80240a != null) {
            this.f80240a = null;
        }
    }

    public final void start() {
        Handler handler;
        super.start();
        if (getNumberOfFrames() > 0 && getDuration(0) > 0 && (handler = this.f80241b) != null) {
            handler.postDelayed(new RunnableC33930g(this), (long) (getNumberOfFrames() * getDuration(0) * 4));
        }
    }
}
