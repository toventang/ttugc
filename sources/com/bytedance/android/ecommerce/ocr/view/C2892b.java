package com.bytedance.android.ecommerce.ocr.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.ecommerce.p165k.C2832g;
import com.bytedance.android.ecommerce.p165k.C2835h;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.ocr.view.b */
public final class C2892b implements C2832g.AbstractC2834a {

    /* renamed from: a */
    public OcrActivity f8615a;

    /* renamed from: b */
    C2899e f8616b;

    static {
        Covode.recordClassIndex(3321);
    }

    /* renamed from: a */
    public final boolean mo7525a() {
        if (this.f8615a != null) {
            return true;
        }
        return false;
    }

    public C2892b(OcrActivity ocrActivity) {
        this.f8615a = ocrActivity;
    }

    /* renamed from: com.bytedance.android.ecommerce.ocr.view.b$a */
    public class View$OnTouchListenerC2894a implements View.OnTouchListener {

        /* renamed from: b */
        private Handler f8619b = new Handler(Looper.getMainLooper()) {
            /* class com.bytedance.android.ecommerce.ocr.view.C2892b.View$OnTouchListenerC2894a.HandlerC28951 */

            static {
                Covode.recordClassIndex(3324);
            }

            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (C2892b.this.mo7525a()) {
                    C2892b.this.f8615a.f8559a.mo7495g();
                }
            }
        };

        /* renamed from: c */
        private int f8620c = 300;

        /* renamed from: d */
        private int f8621d = 5;

        /* renamed from: e */
        private long f8622e;

        /* renamed from: f */
        private float f8623f;

        static {
            Covode.recordClassIndex(3323);
        }

        public View$OnTouchListenerC2894a() {
        }

        /* renamed from: a */
        private static float m8205a(MotionEvent motionEvent) {
            if (motionEvent.getPointerCount() >= 2) {
                return m8204a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            }
            return -1.0f;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C2892b.this.mo7525a();
            int pointerCount = motionEvent.getPointerCount();
            if (pointerCount == 1) {
                if (motionEvent.getAction() == 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i = this.f8620c;
                    if (elapsedRealtime - this.f8622e < ((long) i)) {
                        this.f8619b.removeMessages(1);
                        C2892b.this.f8615a.mo7475a(3);
                    } else {
                        this.f8619b.sendEmptyMessageDelayed(1, (long) i);
                    }
                    this.f8622e = elapsedRealtime;
                }
            } else if (pointerCount >= 2) {
                int action = motionEvent.getAction() & 255;
                if (action == 2) {
                    float a = m8205a(motionEvent);
                    if (a == -1.0f) {
                        return false;
                    }
                    float f = this.f8623f;
                    int i2 = this.f8621d;
                    if (a > ((float) i2) + f) {
                        C2892b.this.f8615a.mo7475a(1);
                    } else if (a >= f - ((float) i2)) {
                        return false;
                    } else {
                        C2892b.this.f8615a.mo7475a(2);
                    }
                    this.f8623f = a;
                } else if (action == 5) {
                    this.f8623f = m8205a(motionEvent);
                }
            }
            return true;
        }

        /* renamed from: a */
        private static float m8204a(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            float f6 = f2 - f4;
            return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        }
    }

    @Override // com.bytedance.android.ecommerce.p165k.C2832g.AbstractC2834a
    /* renamed from: a */
    public final void mo7416a(C2835h.EnumC2836a aVar) {
        if (mo7525a()) {
            OcrActivity ocrActivity = this.f8615a;
            if (!aVar.isAvailable()) {
                ocrActivity.mo7348a(0, 106, "network un available!", null);
            }
        }
    }
}
