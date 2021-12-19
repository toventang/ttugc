package com.lynx.tasm.utils;

import android.os.Build;
import android.view.Choreographer;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.tasm.utils.h */
public class C28921h {

    /* renamed from: a */
    public WeakReference<AbstractC28923a> f68347a;

    /* renamed from: b */
    public Choreographer f68348b;

    /* renamed from: c */
    public final Choreographer.FrameCallback f68349c;

    /* renamed from: d */
    public boolean f68350d;

    /* renamed from: e */
    public boolean f68351e;

    /* renamed from: com.lynx.tasm.utils.h$a */
    public interface AbstractC28923a {
        static {
            Covode.recordClassIndex(35051);
        }

        void OnVSync(long j);
    }

    static {
        Covode.recordClassIndex(35049);
    }

    /* renamed from: b */
    public final void mo50118b() {
        Choreographer choreographer = this.f68348b;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this.f68349c);
        }
        this.f68350d = false;
    }

    /* renamed from: a */
    public final void mo50117a() {
        if (!this.f68350d) {
            Choreographer choreographer = this.f68348b;
            if (choreographer != null) {
                choreographer.postFrameCallback(this.f68349c);
            }
            this.f68350d = true;
        }
    }

    public C28921h(AbstractC28923a aVar) {
        this.f68347a = new WeakReference<>(aVar);
        int i = Build.VERSION.SDK_INT;
        try {
            this.f68348b = Choreographer.getInstance();
        } catch (Throwable unused) {
        }
        this.f68349c = new Choreographer.FrameCallback() {
            /* class com.lynx.tasm.utils.C28921h.Choreographer$FrameCallbackC289221 */

            static {
                Covode.recordClassIndex(35050);
            }

            public final void doFrame(long j) {
                AbstractC28923a aVar;
                if (C28921h.this.f68347a != null && (aVar = C28921h.this.f68347a.get()) != null) {
                    try {
                        aVar.OnVSync(j);
                        C28921h.this.f68348b.postFrameCallback(C28921h.this.f68349c);
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
            }
        };
    }
}
