package com.bytedance.disk.p966h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.disk.h.b */
public final class C14469b {

    /* renamed from: a */
    private HandlerThread f35001a;

    /* renamed from: b */
    private Handler f35002b;

    /* renamed from: com.bytedance.disk.h.b$a */
    public interface AbstractC14471a {
        static {
            Covode.recordClassIndex(16550);
        }
    }

    static {
        Covode.recordClassIndex(16548);
    }

    /* renamed from: com.bytedance.disk.h.b$b */
    public static class C14472b {

        /* renamed from: a */
        public static final C14469b f35004a = new C14469b((byte) 0);

        static {
            Covode.recordClassIndex(16551);
        }
    }

    private C14469b() {
        HandlerThread handlerThread = new HandlerThread("HandleUtil");
        this.f35001a = handlerThread;
        handlerThread.start();
        this.f35002b = new Handler(this.f35001a.getLooper(), new Handler.Callback() {
            /* class com.bytedance.disk.p966h.C14469b.C144701 */

            static {
                Covode.recordClassIndex(16549);
            }

            public final boolean handleMessage(Message message) {
                if (message.obj == null || !(message.obj instanceof AbstractC14471a)) {
                    return true;
                }
                Object obj = message.obj;
                return true;
            }
        });
    }

    /* synthetic */ C14469b(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo23300a(Runnable runnable) {
        this.f35002b.post(runnable);
    }
}
