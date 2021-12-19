package com.p2082ss.texturerender;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.texturerender.r */
public final class Choreographer$FrameCallbackC86214r implements Handler.Callback, Choreographer.FrameCallback {

    /* renamed from: a */
    public Handler f192420a;

    /* renamed from: b */
    public Choreographer f192421b;

    /* renamed from: c */
    public volatile long f192422c;

    /* renamed from: d */
    private ArrayList<C86216a> f192423d = new ArrayList<>();

    /* renamed from: e */
    private final WindowManager f192424e;

    static {
        Covode.recordClassIndex(101357);
    }

    /* renamed from: com.ss.texturerender.r$a */
    public static class C86216a {

        /* renamed from: a */
        public Handler f192426a;

        static {
            Covode.recordClassIndex(101359);
        }

        public C86216a(Handler handler) {
            this.f192426a = handler;
        }
    }

    /* renamed from: a */
    public final void mo136607a(C86216a aVar) {
        C86203l.m148116a("VsyncHelper", "addObserver");
        if (aVar != null) {
            Message obtainMessage = this.f192420a.obtainMessage(29);
            obtainMessage.obj = aVar;
            obtainMessage.sendToTarget();
        }
    }

    public final void doFrame(long j) {
        Iterator<C86216a> it = this.f192423d.iterator();
        while (it.hasNext()) {
            it.next().f192426a.sendEmptyMessage(28);
        }
        this.f192421b.postFrameCallback(this);
    }

    public Choreographer$FrameCallbackC86214r(Context context) {
        Handler handler = new Handler(Looper.getMainLooper(), this);
        this.f192420a = handler;
        handler.post(new Runnable() {
            /* class com.p2082ss.texturerender.Choreographer$FrameCallbackC86214r.RunnableC862151 */

            static {
                Covode.recordClassIndex(101358);
            }

            public final void run() {
                Choreographer$FrameCallbackC86214r.this.f192421b = Choreographer.getInstance();
            }
        });
        Display display = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f192424e = (WindowManager) m148174a(applicationContext, "window");
        } else {
            this.f192424e = null;
        }
        WindowManager windowManager = this.f192424e;
        if (windowManager == null || (display = windowManager.getDefaultDisplay()) == null) {
            this.f192422c = 16666666;
        } else {
            double refreshRate = (double) display.getRefreshRate();
            Double.isNaN(refreshRate);
            this.f192422c = (long) (1.0E9d / refreshRate);
        }
        C86203l.m148116a("VsyncHelper", "vsyncDurationNs:" + this.f192422c + "defaultDisplay:" + display);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.ArrayList<com.ss.texturerender.r$a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean handleMessage(Message message) {
        Choreographer choreographer;
        Choreographer choreographer2;
        switch (message.what) {
            case 28:
                break;
            case 29:
                if (!this.f192423d.contains(message.obj)) {
                    this.f192423d.add(message.obj);
                }
                if (this.f192423d.size() == 1 && (choreographer = this.f192421b) != null) {
                    choreographer.postFrameCallback(this);
                    break;
                }
            case 30:
                this.f192423d.remove(message.obj);
                if (this.f192423d.size() == 0 && (choreographer2 = this.f192421b) != null) {
                    choreographer2.removeFrameCallback(this);
                }
                return true;
            default:
                return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Object m148174a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3740);
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
                    MethodCollector.m26664o(3740);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
