package com.lynx.tasm.image;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.behavior.shadow.AbstractC28539d;
import com.lynx.tasm.behavior.shadow.ShadowNode;

public class AutoSizeImage extends ShadowNode implements AbstractC28539d {

    /* renamed from: a */
    private boolean f67897a;

    /* renamed from: b */
    private int f67898b;

    /* renamed from: c */
    private int f67899c;

    /* renamed from: o */
    private boolean f67900o = true;

    /* renamed from: p */
    private Handler f67901p;

    /* renamed from: q */
    private Runnable f67902q;

    /* renamed from: r */
    private final Object f67903r = new Object();

    static {
        Covode.recordClassIndex(34886);
    }

    public AutoSizeImage() {
        mo49090a(this);
    }

    /* renamed from: a */
    public final void mo49902a(final boolean z, final int i, final int i2, final int i3, final int i4) {
        MethodCollector.m26663i(1399);
        synchronized (this.f67903r) {
            try {
                Handler handler = this.f67901p;
                if (handler == null) {
                    this.f67902q = new Runnable() {
                        /* class com.lynx.tasm.image.AutoSizeImage.RunnableC287871 */

                        static {
                            Covode.recordClassIndex(34888);
                        }

                        public final void run() {
                            AutoSizeImage.this.mo49903b(z, i, i2, i3, i4);
                        }
                    };
                } else {
                    handler.post(new Runnable() {
                        /* class com.lynx.tasm.image.AutoSizeImage.RunnableC287882 */

                        static {
                            Covode.recordClassIndex(34889);
                        }

                        public final void run() {
                            AutoSizeImage.this.mo49903b(z, i, i2, i3, i4);
                        }
                    });
                }
            } finally {
                MethodCollector.m26664o(1399);
            }
        }
    }

    /* renamed from: b */
    public final void mo49903b(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.f67897a;
        this.f67897a = z;
        this.f67898b = i;
        this.f67899c = i2;
        if (z2 != z) {
            mo49092d();
        } else if (this.f67900o || !z || i <= 0 || i2 <= 0) {
        } else {
            if (i3 == 0 || i4 == 0 || ((double) Math.abs((((float) i3) / ((float) i4)) - (((float) i) / ((float) i2)))) > 0.05d) {
                mo49092d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0080, code lost:
        if (r10 > r1) goto L_0x0082;
     */
    @Override // com.lynx.tasm.behavior.shadow.AbstractC28539d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo30603a(com.lynx.tasm.behavior.shadow.LayoutNode r7, float r8, com.lynx.tasm.behavior.shadow.EnumC28540e r9, float r10, com.lynx.tasm.behavior.shadow.EnumC28540e r11) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.image.AutoSizeImage.mo30603a(com.lynx.tasm.behavior.shadow.LayoutNode, float, com.lynx.tasm.behavior.shadow.e, float, com.lynx.tasm.behavior.shadow.e):long");
    }
}
