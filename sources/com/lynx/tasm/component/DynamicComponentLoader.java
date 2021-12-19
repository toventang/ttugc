package com.lynx.tasm.component;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.component.AbstractC28735a;
import java.lang.ref.WeakReference;

public final class DynamicComponentLoader {

    /* renamed from: a */
    public WeakReference<LynxTemplateRender> f67749a;

    /* renamed from: b */
    private AbstractC28735a f67750b;

    static {
        Covode.recordClassIndex(34827);
    }

    public final native void nativeLoadComponent(long j, String str, byte[] bArr, boolean z, int i);

    public DynamicComponentLoader(AbstractC28735a aVar, LynxTemplateRender lynxTemplateRender) {
        this.f67750b = aVar;
        this.f67749a = new WeakReference<>(lynxTemplateRender);
    }

    /* renamed from: a */
    public final void mo49846a(final int i, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.lynx.tasm.component.DynamicComponentLoader.RunnableC287342 */

            static {
                Covode.recordClassIndex(34829);
            }

            public final void run() {
                LynxTemplateRender lynxTemplateRender = DynamicComponentLoader.this.f67749a.get();
                if (lynxTemplateRender != null) {
                    lynxTemplateRender.onErrorOccurred(i, str);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void requireTemplate(final String str, final int i, final long j) {
        AbstractC28735a aVar = this.f67750b;
        if (aVar != null) {
            final boolean[] zArr = {true};
            aVar.mo33445a(str, new AbstractC28735a.AbstractC28736a() {
                /* class com.lynx.tasm.component.DynamicComponentLoader.C287331 */

                static {
                    Covode.recordClassIndex(34828);
                }

                @Override // com.lynx.tasm.component.AbstractC28735a.AbstractC28736a
                /* renamed from: a */
                public final void mo49849a(byte[] bArr, Throwable th) {
                    MethodCollector.m26663i(650);
                    if (th != null) {
                        DynamicComponentLoader.this.mo49846a(1601, "Load dynamic component failed, the url is " + str + ", and the error message is " + th.getMessage());
                        MethodCollector.m26664o(650);
                    } else if (bArr == null || bArr.length == 0) {
                        DynamicComponentLoader.this.mo49846a(1602, "The dynamic component's binary template is empty, the url is " + str);
                        MethodCollector.m26664o(650);
                    } else {
                        DynamicComponentLoader.this.nativeLoadComponent(j, str, bArr, zArr[0], i);
                        MethodCollector.m26664o(650);
                    }
                }
            });
            zArr[0] = false;
        }
    }
}
