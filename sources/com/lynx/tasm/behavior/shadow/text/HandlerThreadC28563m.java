package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Picture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.tasm.behavior.shadow.text.m */
public class HandlerThreadC28563m extends HandlerThread {

    /* renamed from: a */
    volatile Handler f67210a;

    static {
        Covode.recordClassIndex(34579);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.shadow.text.m$a */
    public static class C28564a {

        /* renamed from: a */
        public static HandlerThreadC28563m f67211a = new HandlerThreadC28563m((byte) 0);

        static {
            Covode.recordClassIndex(34580);
        }
    }

    private HandlerThreadC28563m() {
        super("TextLayoutWarmer", 10);
        start();
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.f67210a = new HandlerC28565b(Looper.myLooper(), (byte) 0);
    }

    /* synthetic */ HandlerThreadC28563m(byte b) {
        this();
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.m$b */
    static final class HandlerC28565b extends Handler {

        /* renamed from: a */
        private final Picture f67212a;

        static {
            Covode.recordClassIndex(34581);
        }

        private HandlerC28565b(Looper looper) {
            super(looper);
            Picture picture;
            try {
                picture = new Picture();
            } catch (RuntimeException unused) {
                picture = null;
            }
            this.f67212a = picture;
        }

        public final void handleMessage(Message message) {
            Layout layout;
            if (this.f67212a != null) {
                try {
                    if (message.what == 0 && (layout = (Layout) ((WeakReference) message.obj).get()) != null) {
                        layout.draw(this.f67212a.beginRecording(layout.getWidth(), layout.getHeight()));
                        this.f67212a.endRecording();
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* synthetic */ HandlerC28565b(Looper looper, byte b) {
            this(looper);
        }
    }
}
