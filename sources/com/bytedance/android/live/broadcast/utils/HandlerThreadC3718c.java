package com.bytedance.android.live.broadcast.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.utils.c */
public class HandlerThreadC3718c extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    private Surface f10311a;

    /* renamed from: b */
    private Rect f10312b;

    /* renamed from: c */
    private Handler f10313c;

    static {
        Covode.recordClassIndex(4233);
    }

    public boolean quitSafely() {
        boolean quitSafely = super.quitSafely();
        this.f10313c.sendEmptyMessage(235);
        return quitSafely;
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        Handler handler = new Handler(getLooper(), this);
        this.f10313c = handler;
        handler.sendEmptyMessage(233);
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 233) {
            Canvas lockCanvas = this.f10311a.lockCanvas(this.f10312b);
            lockCanvas.drawColor(-7829368);
            this.f10311a.unlockCanvasAndPost(lockCanvas);
            this.f10313c.sendEmptyMessageDelayed(233, 66);
            return true;
        } else if (i != 235) {
            return true;
        } else {
            this.f10311a = null;
            return true;
        }
    }

    public HandlerThreadC3718c(Surface surface, int i, int i2) {
        super(HandlerThreadC3718c.class.getSimpleName());
        this.f10311a = surface;
        this.f10312b = new Rect(0, 0, i, i2);
    }
}
