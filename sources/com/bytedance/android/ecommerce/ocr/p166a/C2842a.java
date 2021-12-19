package com.bytedance.android.ecommerce.ocr.p166a;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.bytedance.android.ecommerce.ocr.a.a */
public final class C2842a {

    /* renamed from: h */
    private static final Collection<String> f8449h;

    /* renamed from: a */
    public volatile boolean f8450a;

    /* renamed from: b */
    public final Camera f8451b;

    /* renamed from: c */
    public Handler f8452c;

    /* renamed from: d */
    public ArrayList<Camera.Area> f8453d;

    /* renamed from: e */
    private final long f8454e = 5000;

    /* renamed from: f */
    private boolean f8455f;

    /* renamed from: g */
    private final boolean f8456g;

    /* renamed from: i */
    private final Handler.Callback f8457i;

    /* renamed from: j */
    private final Camera.AutoFocusCallback f8458j;

    /* renamed from: b */
    public final void mo7425b() {
        this.f8455f = false;
        mo7426c();
    }

    static {
        Covode.recordClassIndex(3268);
        ArrayList arrayList = new ArrayList(2);
        f8449h = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    /* renamed from: c */
    public final void mo7426c() {
        if (this.f8456g && !this.f8455f && !this.f8450a) {
            try {
                this.f8451b.autoFocus(this.f8458j);
                this.f8450a = true;
            } catch (RuntimeException unused) {
                mo7424a();
            }
        }
    }

    /* renamed from: d */
    public final void mo7427d() {
        this.f8455f = true;
        this.f8450a = false;
        this.f8452c.removeMessages(1);
        if (this.f8456g) {
            try {
                this.f8451b.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo7424a() {
        MethodCollector.m26663i(3595);
        if (!this.f8455f && !this.f8452c.hasMessages(1)) {
            Handler handler = this.f8452c;
            handler.sendMessageDelayed(handler.obtainMessage(1), 5000);
        }
        MethodCollector.m26664o(3595);
    }

    public C2842a(Camera camera, C2860d dVar) {
        boolean z = true;
        this.f8453d = new ArrayList<>(1);
        C28431 r1 = new Handler.Callback() {
            /* class com.bytedance.android.ecommerce.ocr.p166a.C2842a.C28431 */

            static {
                Covode.recordClassIndex(3269);
            }

            public final boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                C2842a.this.mo7426c();
                return true;
            }
        };
        this.f8457i = r1;
        this.f8458j = new Camera.AutoFocusCallback() {
            /* class com.bytedance.android.ecommerce.ocr.p166a.C2842a.C28442 */

            static {
                Covode.recordClassIndex(3270);
            }

            public final void onAutoFocus(boolean z, Camera camera) {
                C2842a.this.f8452c.post(new Runnable() {
                    /* class com.bytedance.android.ecommerce.ocr.p166a.C2842a.C28442.RunnableC28451 */

                    static {
                        Covode.recordClassIndex(3271);
                    }

                    public final void run() {
                        C2842a.this.f8450a = false;
                        C2842a.this.mo7424a();
                    }
                });
            }
        };
        this.f8452c = new Handler(r1);
        this.f8451b = camera;
        this.f8456g = (!dVar.f8514e || !f8449h.contains(camera.getParameters().getFocusMode())) ? false : z;
        mo7425b();
    }
}
