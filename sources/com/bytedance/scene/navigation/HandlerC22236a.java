package com.bytedance.scene.navigation;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.scene.navigation.a */
public final class HandlerC22236a extends Handler {

    /* renamed from: a */
    private boolean f52594a = true;

    static {
        Covode.recordClassIndex(26048);
    }

    /* renamed from: a */
    public final void mo36520a(Runnable runnable) {
        Message obtain = Message.obtain(this, runnable);
        if (this.f52594a) {
            obtain.setAsynchronous(true);
        }
        sendMessage(obtain);
    }

    HandlerC22236a(Looper looper) {
        super(looper);
        int i = Build.VERSION.SDK_INT;
        if (this.f52594a && Build.VERSION.SDK_INT < 22) {
            Message obtain = Message.obtain();
            try {
                obtain.setAsynchronous(true);
            } catch (NoSuchMethodError unused) {
                this.f52594a = false;
            }
            obtain.recycle();
        }
    }
}
