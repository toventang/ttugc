package com.p2082ss.android.vesdk.audio;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttve.p2191b.AbstractC30639a;
import com.p2082ss.android.vesdk.C85310ah;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85521l;
import com.p2082ss.android.vesdk.C85568t;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vesdk.audio.e */
public final class C85335e implements AbstractC85331a {

    /* renamed from: a */
    public int f191028a;

    /* renamed from: b */
    public boolean f191029b;

    /* renamed from: c */
    boolean f191030c = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_background_strategy", (Object) false)).booleanValue();

    /* renamed from: d */
    AbstractC85332b f191031d;

    /* renamed from: e */
    public AbstractC85334d f191032e;

    /* renamed from: f */
    AtomicBoolean f191033f = new AtomicBoolean(false);

    /* renamed from: g */
    public int f191034g = 3;

    /* renamed from: h */
    public int f191035h = 3;

    /* renamed from: i */
    PrivacyCert f191036i = null;

    /* renamed from: j */
    ConcurrentHashMap f191037j = new ConcurrentHashMap();

    /* renamed from: k */
    public C85341i f191038k;

    /* renamed from: l */
    private Handler f191039l;

    /* renamed from: m */
    private HandlerThread f191040m;

    /* renamed from: n */
    private ConditionVariable f191041n = new ConditionVariable();

    /* renamed from: o */
    private AbstractC30639a f191042o;

    /* renamed from: p */
    private Object f191043p = new Object();

    static {
        Covode.recordClassIndex(99447);
    }

    /* renamed from: b */
    private synchronized void m146668b() {
        MethodCollector.m26663i(7458);
        if (this.f191040m != null) {
            int i = Build.VERSION.SDK_INT;
            this.f191040m.quitSafely();
            this.f191040m = null;
            this.f191039l = null;
        }
        MethodCollector.m26664o(7458);
    }

    public C85335e() {
        C85315al.m146639b("TEAudioCaptureProxy", "KEY_ENABLE_BACKGROUND_STRATEGY : " + this.f191030c);
    }

    /* renamed from: a */
    private synchronized Handler m146667a() {
        Looper mainLooper;
        Handler handler;
        MethodCollector.m26663i(7304);
        try {
            HandlerThread handlerThread = this.f191040m;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            HandlerThread handlerThread2 = new HandlerThread("TEAudioCaptureProxy");
            this.f191040m = handlerThread2;
            handlerThread2.start();
            handler = new Handler(this.f191040m.getLooper(), new C85337a(this));
            MethodCollector.m26664o(7304);
        } catch (Exception e) {
            C85315al.m146642d("TEAudioCaptureProxy", "CreateHandler failed!: " + e.toString());
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            Handler handler2 = new Handler(mainLooper, new C85337a(this));
            MethodCollector.m26664o(7304);
            return handler2;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.audio.e$a */
    public static class C85337a implements Handler.Callback {

        /* renamed from: a */
        private WeakReference<C85335e> f191045a;

        static {
            Covode.recordClassIndex(99449);
        }

        public C85337a(C85335e eVar) {
            this.f191045a = new WeakReference<>(eVar);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            C85335e eVar = this.f191045a.get();
            if (eVar == null) {
                C85315al.m146642d("TEAudioCaptureProxy", "audio capture is null");
                return false;
            }
            if (i == 0) {
                C85315al.m146637a("TEAudioCaptureProxy", "init mic:".concat(String.valueOf(eVar.mo130668a((C85521l) obj))));
            } else if (i == 1) {
                PrivacyCert privacyCert = (PrivacyCert) obj;
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = -105;
                if (eVar.f191028a != 1) {
                    C85315al.m146639b("TEAudioCaptureProxy", "start in a error state: " + eVar.f191028a);
                } else if (eVar.f191030c && eVar.f191029b) {
                    C85315al.m146642d("TEAudioCaptureProxy", "in background block start");
                    eVar.f191032e.mo130665a(C85310ah.f190926N, -1, 0.0d, null);
                    i2 = -1;
                } else if (eVar.f191031d == null) {
                    C85315al.m146642d("TEAudioCaptureProxy", "mic start error, audio record is null");
                } else {
                    i2 = eVar.f191031d.start(privacyCert);
                    eVar.f191028a = 2;
                    if (i2 == -2 || i2 == 0) {
                        eVar.f191032e.mo130665a(C85310ah.f190926N, i2, 0.0d, null);
                        C30695h.m63062a(0, "te_record_audio_mic_start_ret", 0L);
                    } else {
                        eVar.mo130671b(eVar.f191036i);
                        if (eVar.f191033f.get() || eVar.f191035h <= 0) {
                            eVar.f191032e.mo130666a(C85310ah.f190925M, C85310ah.f190933U, "use up retry start times");
                            C30695h.m63062a(0, "te_record_audio_mic_start_ret", (long) i2);
                        } else {
                            C85315al.m146642d("TEAudioCaptureProxy", "retry start mic times : " + eVar.f191035h + " ret: " + i2);
                            eVar.f191035h--;
                            eVar.mo130669a(1, eVar.f191036i, 30);
                        }
                    }
                    int i3 = eVar.f191035h;
                    eVar.f191037j.put("micStartRet".concat(String.valueOf(i3)), Integer.valueOf(i2));
                    eVar.f191037j.put("micStartCost".concat(String.valueOf(i3)), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
                C85315al.m146637a("TEAudioCaptureProxy", "start mic:".concat(String.valueOf(i2)));
            } else if (i == 2) {
                C85315al.m146637a("TEAudioCaptureProxy", "stop mic:".concat(String.valueOf(eVar.mo130671b((PrivacyCert) obj))));
            } else if (i != 3) {
                C85315al.m146642d("TEAudioCaptureProxy", "mic msg error");
            } else {
                eVar.f191034g = 0;
                eVar.f191035h = 0;
                eVar.mo130670a((PrivacyCert) obj);
                C85315al.m146637a("TEAudioCaptureProxy", "release mic");
            }
            return false;
        }
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public final int start(PrivacyCert privacyCert) {
        if (this.f191039l == null) {
            C85315al.m146642d("TEAudioCaptureProxy", "start, mHandler is null!");
            return -108;
        }
        this.f191036i = privacyCert;
        mo130669a(1, privacyCert, 0);
        return 0;
    }

    /* renamed from: a */
    public final void mo130670a(PrivacyCert privacyCert) {
        MethodCollector.m26663i(6997);
        synchronized (this.f191043p) {
            try {
                if (this.f191028a == 2) {
                    mo130671b(privacyCert);
                }
                if (this.f191042o != null) {
                    this.f191042o = null;
                }
                AbstractC85332b bVar = this.f191031d;
                if (bVar != null) {
                    bVar.release(privacyCert);
                    this.f191031d = null;
                }
                this.f191033f.set(false);
                this.f191041n.open();
                this.f191028a = 0;
            } finally {
                MethodCollector.m26664o(6997);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public final synchronized int init(C85521l lVar) {
        MethodCollector.m26663i(6858);
        if (this.f191039l != null) {
            MethodCollector.m26664o(6858);
            return 0;
        }
        this.f191039l = m146667a();
        this.f191034g = 3;
        this.f191035h = 3;
        mo130669a(0, lVar, 0);
        MethodCollector.m26664o(6858);
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public final int stop(PrivacyCert privacyCert) {
        if (this.f191039l == null) {
            C85315al.m146642d("TEAudioCaptureProxy", "stop, mHandler is null!");
            return -108;
        }
        C30695h.m63063a(0, "te_record_audio_mic_start_info", this.f191037j.toString());
        mo130669a(2, privacyCert, 0);
        return 0;
    }

    /* renamed from: b */
    public final int mo130671b(PrivacyCert privacyCert) {
        MethodCollector.m26663i(7156);
        synchronized (this.f191043p) {
            try {
                if (this.f191028a != 2) {
                    C85315al.m146642d("TEAudioCaptureProxy", "mic stop in error state: " + this.f191028a);
                    return 0;
                }
                AbstractC85332b bVar = this.f191031d;
                if (bVar == null) {
                    C85315al.m146642d("TEAudioCaptureProxy", "mic stop error, audio record is null");
                    MethodCollector.m26664o(7156);
                    return -105;
                }
                int stop = bVar.stop(privacyCert);
                this.f191032e.mo130665a(C85310ah.f190927O, stop, 0.0d, null);
                this.f191028a = 1;
                MethodCollector.m26664o(7156);
                return stop;
            } finally {
                MethodCollector.m26664o(7156);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public final synchronized void release(PrivacyCert privacyCert) {
        MethodCollector.m26663i(6996);
        if (this.f191039l == null) {
            C85315al.m146641c("TEAudioCaptureProxy", "release, mHandler is null!");
            MethodCollector.m26664o(6996);
            return;
        }
        this.f191033f.set(true);
        long currentTimeMillis = System.currentTimeMillis();
        this.f191041n.close();
        this.f191039l.removeCallbacksAndMessages(null);
        mo130669a(3, privacyCert, 0);
        this.f191041n.block(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C85315al.m146637a("TEAudioCaptureProxy", "mic release cost: " + currentTimeMillis2 + "ms");
        if (currentTimeMillis2 >= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            C85315al.m146642d("TEAudioCaptureProxy", "mic release timeout");
        }
        if (this.f191033f.get() && this.f191031d != null) {
            mo130670a(privacyCert);
        }
        m146668b();
        MethodCollector.m26664o(6996);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        if (r7.f191034g == 0) goto L_0x0091;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo130668a(com.p2082ss.android.vesdk.C85521l r8) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.audio.C85335e.mo130668a(com.ss.android.vesdk.l):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo130669a(int i, Object obj, long j) {
        MethodCollector.m26663i(6709);
        Handler handler = this.f191039l;
        if (handler == null) {
            C85315al.m146637a("TEAudioCaptureProxy", "send MSG error mHandler is null");
            MethodCollector.m26664o(6709);
            return;
        }
        if (handler.hasMessages(i)) {
            this.f191039l.removeMessages(i);
        }
        Message obtain = Message.obtain();
        obtain.obj = obj;
        obtain.what = i;
        if (j <= 0) {
            this.f191039l.sendMessage(obtain);
            MethodCollector.m26664o(6709);
            return;
        }
        this.f191039l.sendMessageDelayed(obtain, j);
        MethodCollector.m26664o(6709);
    }
}
