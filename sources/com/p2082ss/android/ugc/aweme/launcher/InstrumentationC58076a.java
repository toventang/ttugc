package com.p2082ss.android.ugc.aweme.launcher;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.launcher.a */
public final class InstrumentationC58076a extends Instrumentation {

    /* renamed from: a */
    private final Instrumentation f132316a;

    /* renamed from: b */
    private final AbstractC58077a f132317b;

    /* renamed from: com.ss.android.ugc.aweme.launcher.a$a */
    public interface AbstractC58077a {
        static {
            Covode.recordClassIndex(68122);
        }

        /* renamed from: a */
        String mo60121a(String str, Intent intent);
    }

    static {
        Covode.recordClassIndex(68121);
    }

    /* renamed from: a */
    public static void m104926a(AbstractC58077a aVar) {
        Field declaredField;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (declaredField = invoke.getClass().getDeclaredField("mInstrumentation")) != null) {
                    declaredField.setAccessible(true);
                    Instrumentation instrumentation = (Instrumentation) declaredField.get(invoke);
                    if (instrumentation != null) {
                        declaredField.set(invoke, new InstrumentationC58076a(instrumentation, aVar));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private InstrumentationC58076a(Instrumentation instrumentation, AbstractC58077a aVar) {
        this.f132316a = instrumentation;
        this.f132317b = aVar;
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        AbstractC58077a aVar;
        if (!(TextUtils.isEmpty(str) || intent == null || (aVar = this.f132317b) == null)) {
            str = aVar.mo60121a(str, intent);
        }
        return this.f132316a.newActivity(classLoader, str, intent);
    }
}
