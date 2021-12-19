package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.x */
final class C11178x {

    /* renamed from: a */
    static final Throwable f26808a = new C11179a();

    /* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.x$a */
    static final class C11179a extends Throwable {
        static {
            Covode.recordClassIndex(12806);
        }

        C11179a() {
            super("No further exceptions");
        }

        public final synchronized Throwable fillInStackTrace() {
            MethodCollector.m26663i(9079);
            MethodCollector.m26664o(9079);
            return this;
        }
    }

    static {
        Covode.recordClassIndex(12805);
    }
}
