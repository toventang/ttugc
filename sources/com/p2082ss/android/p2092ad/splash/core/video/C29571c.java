package com.p2082ss.android.p2092ad.splash.core.video;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b;
import com.p2082ss.android.p2092ad.splash.core.video.p2106a.C29568d;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ad.splash.core.video.c */
public final class C29571c implements AbstractC29559b.AbstractC29560a, AbstractC29559b.AbstractC29561b, AbstractC29559b.AbstractC29562c, AbstractC29559b.AbstractC29563d, AbstractC29559b.AbstractC29564e, AbstractC29559b.AbstractC29565f, HandlerC29663q.AbstractC29664a {

    /* renamed from: m */
    private static boolean f70453m;

    /* renamed from: n */
    private static Map<Integer, Integer> f70454n = new HashMap();

    /* renamed from: a */
    public AbstractC29559b f70455a;

    /* renamed from: b */
    public int f70456b;

    /* renamed from: c */
    long f70457c;

    /* renamed from: d */
    public Handler f70458d;

    /* renamed from: e */
    public boolean f70459e;

    /* renamed from: f */
    private boolean f70460f;

    /* renamed from: g */
    private boolean f70461g;

    /* renamed from: h */
    private boolean f70462h;

    /* renamed from: i */
    private Handler f70463i;

    /* renamed from: j */
    private ArrayList<Runnable> f70464j;

    /* renamed from: k */
    private int f70465k;

    /* renamed from: l */
    private int f70466l;

    /* renamed from: o */
    private final Set<SurfaceTexture> f70467o;

    /* renamed from: p */
    private final Object f70468p;

    /* renamed from: q */
    private StringBuilder f70469q;

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b.AbstractC29563d
    /* renamed from: a */
    public final boolean mo51801a(int i, int i2) {
        this.f70456b = 200;
        Integer num = f70454n.get(Integer.valueOf(this.f70465k));
        if (num == null) {
            f70454n.put(Integer.valueOf(this.f70465k), 1);
        } else {
            f70454n.put(Integer.valueOf(this.f70465k), Integer.valueOf(num.intValue() + 1));
        }
        Handler handler = this.f70463i;
        if (handler == null) {
            return false;
        }
        handler.obtainMessage(303, i, i2).sendToTarget();
        return false;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b.AbstractC29564e
    /* renamed from: a */
    public final boolean mo51802a(AbstractC29559b bVar, int i, int i2) {
        Handler handler;
        if (this.f70455a == bVar && (handler = this.f70463i) != null) {
            handler.obtainMessage(304, i, i2).sendToTarget();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51812a(Runnable runnable) {
        if (!this.f70462h) {
            runnable.run();
            return;
        }
        if (this.f70464j == null) {
            this.f70464j = new ArrayList<>();
        }
        this.f70464j.add(runnable);
    }

    static {
        Covode.recordClassIndex(35966);
    }

    /* renamed from: g */
    private void m59474g() {
        if (f70453m) {
            m59471a(this.f70466l);
            f70453m = false;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b.AbstractC29560a
    /* renamed from: f */
    public final void mo51798f() {
        Handler handler = this.f70463i;
        if (handler != null) {
            handler.sendEmptyMessage(306);
        }
    }

    /* renamed from: b */
    public final void mo51813b() {
        this.f70458d.removeMessages(100);
        this.f70459e = true;
        this.f70458d.sendEmptyMessage(101);
    }

    /* renamed from: h */
    private void m59475h() {
        MethodCollector.m26663i(10717);
        Handler handler = this.f70458d;
        if (handler != null) {
            handler.removeMessages(201);
        }
        synchronized (this.f70468p) {
            try {
                if (this.f70469q != null) {
                    this.f70469q = null;
                }
            } finally {
                MethodCollector.m26664o(10717);
            }
        }
    }

    /* renamed from: c */
    public final void mo51814c() {
        this.f70456b = 203;
        if (this.f70455a != null) {
            ArrayList<Runnable> arrayList = this.f70464j;
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f70464j.clear();
            }
            if (this.f70458d != null) {
                try {
                    m59475h();
                    this.f70458d.removeCallbacksAndMessages(null);
                    this.f70462h = true;
                    this.f70458d.sendEmptyMessage(103);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b.AbstractC29562c
    /* renamed from: d */
    public final void mo51800d() {
        int i;
        if (!this.f70460f) {
            i = 209;
        } else {
            i = 206;
        }
        this.f70456b = i;
        f70454n.remove(Integer.valueOf(this.f70465k));
        Handler handler = this.f70463i;
        if (handler != null) {
            handler.obtainMessage(302).sendToTarget();
        }
        m59475h();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b.AbstractC29565f
    /* renamed from: e */
    public final void mo51803e() {
        this.f70456b = 205;
        if (this.f70459e) {
            this.f70458d.post(new Runnable() {
                /* class com.p2082ss.android.p2092ad.splash.core.video.C29571c.RunnableC295754 */

                static {
                    Covode.recordClassIndex(35970);
                }

                public final void run() {
                    try {
                        C29571c.this.f70455a.mo51789b();
                        C29571c.this.f70456b = 207;
                        C29571c.this.f70459e = false;
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            Handler handler = this.f70458d;
            handler.sendMessage(handler.obtainMessage(100, -1, -1));
        }
        f70454n.remove(Integer.valueOf(this.f70465k));
        Handler handler2 = this.f70463i;
        if (handler2 != null) {
            handler2.sendEmptyMessage(305);
        }
    }

    /* renamed from: a */
    public final void mo51811a() {
        if (this.f70455a == null) {
            C29644g.m59688b("SSMediaPlayerWrapper use System Mediaplayer");
            C29568d dVar = new C29568d();
            this.f70455a = dVar;
            dVar.mo51782a((AbstractC29559b.AbstractC29565f) this);
            this.f70455a.mo51779a((AbstractC29559b.AbstractC29562c) this);
            this.f70455a.mo51780a((AbstractC29559b.AbstractC29563d) this);
            this.f70455a.mo51778a((AbstractC29559b.AbstractC29561b) this);
            this.f70455a.mo51777a((AbstractC29559b.AbstractC29560a) this);
            this.f70455a.mo51781a((AbstractC29559b.AbstractC29564e) this);
            this.f70455a.mo51788a(this.f70460f);
            this.f70461g = false;
        }
    }

    public C29571c(Handler handler) {
        this(handler, (byte) 0);
    }

    /* renamed from: a */
    private static void m59471a(int i) {
        AudioManager audioManager = (AudioManager) m59470a(C29495h.f70242r, DataType.AUDIO);
        if (audioManager != null) {
            audioManager.setStreamVolume(3, i, 0);
        }
    }

    /* renamed from: a */
    private boolean m59473a(SurfaceTexture surfaceTexture) {
        boolean contains;
        MethodCollector.m26663i(9640);
        synchronized (this.f70467o) {
            try {
                contains = this.f70467o.contains(surfaceTexture);
            } finally {
                MethodCollector.m26664o(9640);
            }
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0233, code lost:
        if (0 == 0) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x023d  */
    @Override // com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q.AbstractC29664a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28809a(android.os.Message r17) {
        /*
        // Method dump skipped, instructions count: 616
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.video.C29571c.mo28809a(android.os.Message):void");
    }

    private C29571c(Handler handler, byte b) {
        this.f70456b = 201;
        this.f70457c = -1;
        this.f70467o = new HashSet();
        this.f70468p = new Object();
        this.f70469q = null;
        this.f70465k = 0;
        this.f70463i = handler;
        HandlerThread handlerThread = new HandlerThread("VideoManager");
        handlerThread.start();
        this.f70458d = new HandlerC29663q(handlerThread.getLooper(), this);
        mo51811a();
    }

    /* renamed from: a */
    private void m59472a(int i, Object obj) {
        if (i == 309) {
            m59474g();
        }
        Handler handler = this.f70463i;
        if (handler != null) {
            handler.obtainMessage(i, obj).sendToTarget();
        }
    }

    /* renamed from: a */
    private static Object m59470a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10577);
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
                    MethodCollector.m26664o(10577);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b.AbstractC29561b
    /* renamed from: a */
    public final void mo51799a(AbstractC29559b bVar, int i) {
        Handler handler;
        if (this.f70455a == bVar && (handler = this.f70463i) != null) {
            handler.obtainMessage(301, Integer.valueOf(i)).sendToTarget();
        }
    }
}
