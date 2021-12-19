package com.p2082ss.ttm.player;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.ttm.player.DummySurface */
public final class DummySurface extends Surface {

    /* renamed from: a */
    public final boolean f192524a;

    /* renamed from: b */
    private final HandlerThreadC86230a f192525b;

    /* renamed from: c */
    private boolean f192526c;

    static {
        Covode.recordClassIndex(101386);
    }

    /* renamed from: com.ss.ttm.player.DummySurface$a */
    static class HandlerThreadC86230a extends HandlerThread implements Handler.Callback {

        /* renamed from: a */
        Handler f192527a;

        /* renamed from: b */
        private RunnableC86244e f192528b;

        /* renamed from: c */
        private Error f192529c;

        /* renamed from: d */
        private RuntimeException f192530d;

        /* renamed from: e */
        private DummySurface f192531e;

        static {
            Covode.recordClassIndex(101387);
        }

        public HandlerThreadC86230a() {
            super("dummySurface");
        }

        /* renamed from: a */
        public final DummySurface mo136687a() {
            boolean z;
            MethodCollector.m26663i(9988);
            start();
            this.f192527a = new Handler(getLooper(), this);
            this.f192528b = new RunnableC86244e(this.f192527a);
            synchronized (this) {
                try {
                    z = false;
                    this.f192527a.obtainMessage(1, 0, 0).sendToTarget();
                    while (this.f192531e == null && this.f192530d == null && this.f192529c == null) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9988);
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f192530d;
            if (runtimeException == null) {
                Error error = this.f192529c;
                if (error == null) {
                    DummySurface dummySurface = this.f192531e;
                    if (dummySurface != null) {
                        MethodCollector.m26664o(9988);
                        return dummySurface;
                    }
                    NullPointerException nullPointerException = new NullPointerException();
                    MethodCollector.m26664o(9988);
                    throw nullPointerException;
                }
                MethodCollector.m26664o(9988);
                throw error;
            }
            MethodCollector.m26664o(9988);
            throw runtimeException;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0245, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
            r19.f192529c = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0248, code lost:
            monitor-enter(r19);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
            notify();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x024e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0250, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9994);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0255, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0256, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x0257, code lost:
            r19.f192530d = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0259, code lost:
            monitor-enter(r19);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
            notify();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x0264, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0268, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9994);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x026b, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x026c, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x026d, code lost:
            r18 = 9994;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
            notify();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0277, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0278, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x027a, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x027d, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0245 A[ExcHandler: Error (r0v6 'e' java.lang.Error A[CUSTOM_DECLARE]), Splitter:B:48:0x00ce] */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x0256 A[ExcHandler: RuntimeException (r0v4 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:48:0x00ce] */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x0270 A[SYNTHETIC, Splitter:B:145:0x0270] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r20) {
            /*
            // Method dump skipped, instructions count: 638
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.DummySurface.HandlerThreadC86230a.handleMessage(android.os.Message):boolean");
        }
    }

    public final void release() {
        MethodCollector.m26663i(3771);
        super.release();
        synchronized (this.f192525b) {
            try {
                if (!this.f192526c) {
                    HandlerThreadC86230a aVar = this.f192525b;
                    if (aVar.f192527a != null) {
                        aVar.f192527a.sendEmptyMessage(2);
                        this.f192526c = true;
                    } else {
                        NullPointerException nullPointerException = new NullPointerException();
                        MethodCollector.m26664o(3771);
                        throw nullPointerException;
                    }
                }
            } finally {
                MethodCollector.m26664o(3771);
            }
        }
    }

    private DummySurface(HandlerThreadC86230a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f192525b = aVar;
        this.f192524a = z;
    }

    /* synthetic */ DummySurface(HandlerThreadC86230a aVar, SurfaceTexture surfaceTexture, boolean z, byte b) {
        this(aVar, surfaceTexture, z);
    }
}
