package com.p2082ss.android.medialib.p2154a;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.C85315al;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.medialib.a.b */
public class C29980b {

    /* renamed from: b */
    private static final String f71529b = C29980b.class.getSimpleName();

    /* renamed from: a */
    public AudioRecorderInterface f71530a;

    /* renamed from: c */
    private HandlerThread f71531c;

    /* renamed from: d */
    private Handler f71532d;

    /* renamed from: e */
    private boolean f71533e;

    static {
        Covode.recordClassIndex(36432);
    }

    /* renamed from: b */
    public final synchronized boolean mo52795b() {
        boolean z;
        MethodCollector.m26663i(1782);
        z = this.f71533e;
        MethodCollector.m26664o(1782);
        return z;
    }

    /* renamed from: a */
    public final int mo52792a() {
        MethodCollector.m26663i(1771);
        synchronized (this) {
            try {
                this.f71533e = false;
                HandlerThread handlerThread = this.f71531c;
                if (handlerThread != null) {
                    try {
                        handlerThread.join(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.f71531c = null;
                    this.f71532d = null;
                }
            } finally {
                MethodCollector.m26664o(1771);
            }
        }
        AudioRecorderInterface audioRecorderInterface = this.f71530a;
        if (audioRecorderInterface != null) {
            int closeWavFile = audioRecorderInterface.closeWavFile(false);
            if (closeWavFile != 0) {
                C85315al.m146642d(f71529b, "close wav file failed");
            }
            return closeWavFile;
        }
        MethodCollector.m26664o(1771);
        return 0;
    }

    public C29980b(AudioRecorderInterface audioRecorderInterface) {
        this.f71530a = audioRecorderInterface;
    }

    /* renamed from: a */
    public final int mo52793a(int i, int i2, double d) {
        MethodCollector.m26663i(1704);
        synchronized (this) {
            try {
                HandlerThread handlerThread = new HandlerThread(f71529b);
                this.f71531c = handlerThread;
                handlerThread.start();
                this.f71532d = new Handler(this.f71531c.getLooper());
            } catch (Exception unused) {
                this.f71532d = null;
                this.f71531c = null;
            } catch (Throwable th) {
                MethodCollector.m26664o(1704);
                throw th;
            }
            this.f71533e = true;
        }
        AudioRecorderInterface audioRecorderInterface = this.f71530a;
        if (audioRecorderInterface != null) {
            int initWavFile = audioRecorderInterface.initWavFile(i, i2, d);
            if (initWavFile != 0) {
                C85315al.m146642d(f71529b, "init wav file failed");
            }
            MethodCollector.m26664o(1704);
            return initWavFile;
        }
        MethodCollector.m26664o(1704);
        return 0;
    }

    /* renamed from: a */
    public final int mo52794a(final byte[] bArr, final int i, final long j) {
        MethodCollector.m26663i(1778);
        synchronized (this) {
            try {
                if (!this.f71533e) {
                    return -108;
                }
                Handler handler = this.f71532d;
                if (handler != null) {
                    handler.post(new Runnable() {
                        /* class com.p2082ss.android.medialib.p2154a.C29980b.RunnableC299811 */

                        static {
                            Covode.recordClassIndex(36433);
                        }

                        public final void run() {
                            if (C29980b.this.f71530a != null) {
                                C29980b.this.f71530a.addPCMData(bArr, i, j);
                            }
                        }
                    });
                } else {
                    AudioRecorderInterface audioRecorderInterface = this.f71530a;
                    if (audioRecorderInterface != null) {
                        audioRecorderInterface.addPCMData(bArr, i, j);
                    }
                }
                MethodCollector.m26664o(1778);
                return 0;
            } finally {
                MethodCollector.m26664o(1778);
            }
        }
    }
}
