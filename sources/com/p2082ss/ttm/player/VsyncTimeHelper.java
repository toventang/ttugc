package com.p2082ss.ttm.player;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.ttm.p4406a.C86222e;
import java.lang.reflect.Field;

/* renamed from: com.ss.ttm.player.VsyncTimeHelper */
public final class VsyncTimeHelper {

    /* renamed from: a */
    private final WindowManager f192618a;

    /* renamed from: b */
    private final Choreographer$FrameCallbackC86236b f192619b;

    /* renamed from: c */
    private final C86235a f192620c;

    /* renamed from: d */
    private long f192621d;

    static {
        Covode.recordClassIndex(101411);
    }

    public final long getVsyncDurationNs() {
        return this.f192621d;
    }

    public final int getLowestUIFps() {
        return this.f192619b.f192630f;
    }

    public final int getUIFps() {
        return this.f192619b.f192629e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttm.player.VsyncTimeHelper$b */
    public static final class Choreographer$FrameCallbackC86236b implements Handler.Callback, Choreographer.FrameCallback {

        /* renamed from: g */
        public static final Choreographer$FrameCallbackC86236b f192624g = new Choreographer$FrameCallbackC86236b();

        /* renamed from: a */
        public volatile long f192625a = -9223372036854775807L;

        /* renamed from: b */
        public volatile long f192626b = -9223372036854775807L;

        /* renamed from: c */
        public volatile int f192627c;

        /* renamed from: d */
        public long f192628d;

        /* renamed from: e */
        public int f192629e;

        /* renamed from: f */
        public int f192630f;

        /* renamed from: h */
        final Handler f192631h;

        /* renamed from: i */
        public Choreographer f192632i;

        /* renamed from: j */
        public int f192633j;

        /* renamed from: k */
        private long f192634k;

        /* renamed from: l */
        private final Handler f192635l;

        /* renamed from: m */
        private final HandlerThread f192636m;

        /* renamed from: n */
        private Bundle f192637n;

        static {
            Covode.recordClassIndex(101413);
        }

        private Choreographer$FrameCallbackC86236b() {
            HandlerThread handlerThread = new HandlerThread("Vsync:Handler");
            this.f192636m = handlerThread;
            handlerThread.start();
            this.f192631h = new Handler(handlerThread.getLooper(), this);
            this.f192637n = new Bundle();
            Handler handler = new Handler(Looper.getMainLooper());
            this.f192635l = handler;
            handler.post(new Runnable() {
                /* class com.p2082ss.ttm.player.VsyncTimeHelper.Choreographer$FrameCallbackC86236b.RunnableC862371 */

                static {
                    Covode.recordClassIndex(101414);
                }

                public final void run() {
                    Choreographer$FrameCallbackC86236b.this.f192632i = Choreographer.getInstance();
                    if (Choreographer$FrameCallbackC86236b.this.f192633j > 0) {
                        Choreographer$FrameCallbackC86236b.this.f192632i.postFrameCallback(Choreographer$FrameCallbackC86236b.f192624g);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo136787a(long j) {
            this.f192637n.putLong("vsync", j);
            Message obtainMessage = this.f192631h.obtainMessage(4);
            obtainMessage.setData(this.f192637n);
            obtainMessage.sendToTarget();
        }

        public final void doFrame(long j) {
            Message obtainMessage = this.f192631h.obtainMessage(2);
            this.f192637n.putLong("time", j);
            obtainMessage.setData(this.f192637n);
            obtainMessage.sendToTarget();
            this.f192632i.postFrameCallback(this);
        }

        public final boolean handleMessage(Message message) {
            Choreographer choreographer;
            Choreographer choreographer2;
            int i = message.what;
            if (i != 0) {
                int i2 = 0;
                if (i == 1) {
                    int i3 = this.f192633j - 1;
                    this.f192633j = i3;
                    if (i3 == 0 && (choreographer2 = this.f192632i) != null) {
                        choreographer2.removeFrameCallback(this);
                        this.f192625a = -9223372036854775807L;
                        this.f192626b = -9223372036854775807L;
                        this.f192627c = 0;
                        this.f192629e = 0;
                        this.f192630f = 0;
                        this.f192634k = 0;
                    }
                    return true;
                } else if (i == 2) {
                    long j = message.getData().getLong("time");
                    if (this.f192628d != 0) {
                        this.f192634k++;
                        this.f192625a = j;
                        if (this.f192626b == -9223372036854775807L) {
                            this.f192626b = this.f192625a;
                        } else {
                            long j2 = this.f192625a - this.f192626b;
                            if (j2 <= 0) {
                                this.f192626b = -9223372036854775807L;
                            } else {
                                long j3 = this.f192628d;
                                if (j2 - j3 > 0) {
                                    i2 = Math.round(((float) (j2 - j3)) / ((float) j3));
                                }
                                this.f192627c += i2;
                                int i4 = (int) (1000000000 / j2);
                                this.f192629e = i4;
                                int i5 = this.f192630f;
                                if (i5 != 0) {
                                    i4 = Math.min(i5, i4);
                                }
                                this.f192630f = i4;
                                this.f192626b = this.f192625a;
                            }
                        }
                    }
                    return true;
                } else if (i != 4) {
                    return false;
                } else {
                    this.f192628d = message.getData().getLong("vsync");
                    return true;
                }
            } else {
                int i6 = this.f192633j + 1;
                this.f192633j = i6;
                if (i6 == 1 && (choreographer = this.f192632i) != null) {
                    choreographer.postFrameCallback(this);
                }
                return true;
            }
        }
    }

    public final void disable() {
        if (this.f192618a != null) {
            C86235a aVar = this.f192620c;
            if (aVar != null) {
                aVar.f192622a.unregisterDisplayListener(aVar);
            }
            this.f192619b.f192631h.sendEmptyMessage(1);
        }
    }

    public final void enable() {
        if (this.f192618a != null) {
            this.f192619b.f192631h.sendEmptyMessage(0);
            C86235a aVar = this.f192620c;
            if (aVar != null) {
                aVar.f192622a.registerDisplayListener(aVar, null);
            }
            mo136778a();
        }
    }

    /* renamed from: a */
    public final void mo136778a() {
        Display defaultDisplay = this.f192618a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            this.f192621d = (long) (1.0E9d / refreshRate);
        } else {
            this.f192621d = 62500000;
        }
        this.f192619b.mo136787a(this.f192621d);
    }

    /* renamed from: com.ss.ttm.player.VsyncTimeHelper$a */
    final class C86235a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        final DisplayManager f192622a;

        static {
            Covode.recordClassIndex(101412);
        }

        public final void onDisplayAdded(int i) {
        }

        public final void onDisplayRemoved(int i) {
        }

        public final void onDisplayChanged(int i) {
            if (i == 0) {
                VsyncTimeHelper.this.mo136778a();
            }
        }

        public C86235a(DisplayManager displayManager) {
            this.f192622a = displayManager;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VsyncTimeHelper(com.p2082ss.ttm.player.TTPlayer r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0008
            android.content.Context r0 = r2.f192570g
        L_0x0004:
            r1.<init>(r0)
            return
        L_0x0008:
            r0 = 0
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.VsyncTimeHelper.<init>(com.ss.ttm.player.TTPlayer):void");
    }

    private VsyncTimeHelper(Context context) {
        DisplayManager displayManager;
        C86235a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            if (C58003a.f132201c && context == null) {
                context = C58003a.f132199a;
            }
            this.f192618a = (WindowManager) m148291a(context, "window");
        } else {
            this.f192618a = null;
        }
        if (this.f192618a != null) {
            if (C86222e.f192440a >= 17 && (displayManager = (DisplayManager) m148291a(context, "display")) != null) {
                aVar = new C86235a(displayManager);
            }
            this.f192620c = aVar;
            this.f192619b = Choreographer$FrameCallbackC86236b.f192624g;
        } else {
            this.f192620c = null;
            this.f192619b = null;
        }
        this.f192621d = -9223372036854775807L;
    }

    /* renamed from: a */
    private static Object m148291a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3390);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3390);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
