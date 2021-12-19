package com.p2082ss.android.medialib.p2154a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.C85315al;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.medialib.a.a */
public class RunnableC29977a implements Runnable {

    /* renamed from: a */
    public volatile HandlerC29979b f71516a;

    /* renamed from: b */
    public final Object f71517b = new Object();

    /* renamed from: c */
    public boolean f71518c;

    /* renamed from: d */
    public boolean f71519d;

    /* renamed from: e */
    public AbstractC29978a f71520e;

    /* renamed from: f */
    AudioRecorderInterface f71521f;

    /* renamed from: g */
    public AtomicInteger f71522g = new AtomicInteger(0);

    /* renamed from: h */
    public ConcurrentLinkedQueue<Long> f71523h = new ConcurrentLinkedQueue<>();

    /* renamed from: i */
    public boolean f71524i = false;

    /* renamed from: j */
    public boolean f71525j = true;

    /* renamed from: k */
    public boolean f71526k = false;

    /* renamed from: l */
    public final Object f71527l;

    /* renamed from: com.ss.android.medialib.a.a$a */
    public interface AbstractC29978a {
        static {
            Covode.recordClassIndex(36430);
        }

        int onProcessData(byte[] bArr, int i, long j);
    }

    static {
        Covode.recordClassIndex(36429);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r4.f71519d == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        if (r4.f71525j != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2553);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = r4.f71527l;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52785a() {
        /*
            r4 = this;
            r3 = 2553(0x9f9, float:3.578E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            java.lang.Object r1 = r4.f71517b
            monitor-enter(r1)
            boolean r0 = r4.f71518c     // Catch:{ all -> 0x002a }
            r2 = 0
            if (r0 != 0) goto L_0x0012
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        L_0x0012:
            monitor-exit(r1)
            java.lang.Object r1 = r4.f71527l
            monitor-enter(r1)
            boolean r0 = r4.f71519d     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001f
            boolean r0 = r4.f71525j     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001f
            r2 = 1
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        L_0x0024:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.medialib.p2154a.RunnableC29977a.mo52785a():boolean");
    }

    /* renamed from: b */
    public final boolean mo52786b() {
        boolean z;
        MethodCollector.m26663i(2554);
        synchronized (this.f71517b) {
            try {
                if (!this.f71518c) {
                    return false;
                }
                synchronized (this.f71527l) {
                    try {
                        z = this.f71526k;
                    } finally {
                        MethodCollector.m26664o(2554);
                    }
                }
                return z;
            } finally {
                MethodCollector.m26664o(2554);
            }
        }
    }

    /* renamed from: c */
    public final void mo52787c() {
        MethodCollector.m26663i(2574);
        synchronized (this.f71517b) {
            try {
                if (this.f71518c) {
                    this.f71516a.sendMessage(this.f71516a.obtainMessage(2));
                    C85315al.m146639b("AudioDataProcessThread", "stop()");
                    MethodCollector.m26664o(2574);
                }
            } finally {
                MethodCollector.m26664o(2574);
            }
        }
    }

    /* renamed from: d */
    public final void mo52788d() {
        MethodCollector.m26663i(2709);
        synchronized (this.f71527l) {
            try {
                C85315al.m146637a("AudioDataProcessThread", "handleStopFeeding() called");
                if (!this.f71525j) {
                    AudioRecorderInterface audioRecorderInterface = this.f71521f;
                    if (audioRecorderInterface != null) {
                        audioRecorderInterface.closeWavFile(this.f71524i);
                    } else {
                        C85315al.m146642d("AudioDataProcessThread", "handleStop: Discard wav file");
                    }
                    this.f71525j = true;
                    this.f71524i = false;
                    this.f71527l.notify();
                    MethodCollector.m26664o(2709);
                }
            } finally {
                MethodCollector.m26664o(2709);
            }
        }
    }

    public void run() {
        MethodCollector.m26663i(2588);
        Looper.prepare();
        synchronized (this.f71517b) {
            try {
                this.f71516a = new HandlerC29979b(this);
                this.f71518c = true;
                this.f71517b.notify();
            } finally {
                MethodCollector.m26664o(2588);
            }
        }
        Looper.loop();
        C85315al.m146639b("AudioDataProcessThread", "Encoder thread exiting");
        synchronized (this.f71517b) {
            try {
                this.f71519d = false;
                this.f71518c = false;
                this.f71516a = null;
            } finally {
                MethodCollector.m26664o(2588);
            }
        }
    }

    /* renamed from: com.ss.android.medialib.a.a$b */
    public static class HandlerC29979b extends Handler {

        /* renamed from: a */
        private WeakReference<RunnableC29977a> f71528a;

        static {
            Covode.recordClassIndex(36431);
        }

        public HandlerC29979b(RunnableC29977a aVar) {
            this.f71528a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            RunnableC29977a aVar = this.f71528a.get();
            if (aVar == null) {
                C85315al.m146642d("AudioDataProcessThread", "EncoderHandler.handleMessage: encoder is null");
            } else if (i == 0) {
                int i2 = message.arg1;
                int i3 = message.arg2;
                double doubleValue = ((Double) message.obj).doubleValue();
                if (aVar.f71521f != null) {
                    C85315al.m146637a("AudioDataProcessThread", "handleStartFeeding() called with: sampleRateInHz = [" + i2 + "], channels = [" + i3 + "], speed = [" + doubleValue + "]");
                    if (aVar.f71521f.initWavFile(i2, i3, doubleValue) != 0) {
                        C85315al.m146642d("AudioDataProcessThread", "init wav file failed");
                    } else {
                        aVar.f71525j = false;
                    }
                }
            } else if (i == 1) {
                aVar.f71523h.clear();
                aVar.mo52788d();
            } else if (i == 2) {
                C85315al.m146637a("AudioDataProcessThread", "Exit loop");
                aVar.mo52788d();
                removeMessages(3);
                Looper.myLooper().quit();
            } else if (i == 3) {
                if (aVar.f71525j) {
                    C85315al.m146641c("AudioDataProcessThread", "Cannot feed() after stopFeeding.");
                    return;
                }
                byte[] bArr = (byte[]) message.obj;
                int i4 = message.arg1;
                int decrementAndGet = aVar.f71522g.decrementAndGet();
                if (aVar.f71520e != null) {
                    aVar.f71520e.onProcessData(bArr, i4, aVar.f71523h.poll().longValue());
                    C85315al.m146639b("AudioDataProcessThread", "Buffer processed, size=" + i4 + ", " + decrementAndGet + " buffers remaining");
                }
            }
        }
    }

    public RunnableC29977a(AudioRecorderInterface audioRecorderInterface, AbstractC29978a aVar) {
        Object obj;
        if (audioRecorderInterface != null) {
            obj = audioRecorderInterface;
        } else {
            obj = new Object();
        }
        this.f71527l = obj;
        this.f71521f = audioRecorderInterface;
        this.f71520e = aVar;
    }

    /* renamed from: a */
    public final void mo52784a(byte[] bArr, int i) {
        MethodCollector.m26663i(2566);
        synchronized (this.f71517b) {
            try {
                if (this.f71518c) {
                    this.f71522g.incrementAndGet();
                    this.f71523h.offer(0L);
                    this.f71516a.sendMessage(this.f71516a.obtainMessage(3, i, 0, Arrays.copyOf(bArr, i)));
                    C85315al.m146639b("AudioDataProcessThread", "feed audioData");
                    MethodCollector.m26664o(2566);
                }
            } finally {
                MethodCollector.m26664o(2566);
            }
        }
    }

    /* renamed from: a */
    public final void mo52783a(int i, int i2, double d) {
        MethodCollector.m26663i(2549);
        C85315al.m146641c("AudioDataProcessThread", "startFeeding");
        synchronized (this.f71517b) {
            try {
                if (!this.f71518c) {
                    C85315al.m146641c("AudioDataProcessThread", "startFeeding not ready");
                    return;
                }
                this.f71522g.set(0);
                this.f71523h.clear();
                this.f71516a.sendMessage(this.f71516a.obtainMessage(0, i, i2, Double.valueOf(d)));
                this.f71526k = false;
                MethodCollector.m26664o(2549);
            } finally {
                MethodCollector.m26664o(2549);
            }
        }
    }
}
