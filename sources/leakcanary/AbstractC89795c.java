package leakcanary;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: leakcanary.c */
public interface AbstractC89795c {
    static {
        Covode.recordClassIndex(105890);
    }

    /* renamed from: a */
    void mo144359a();

    /* renamed from: leakcanary.c$a */
    public static final class C89796a implements AbstractC89795c {

        /* renamed from: a */
        public static final C89796a f203631a = new C89796a();

        private C89796a() {
        }

        static {
            Covode.recordClassIndex(105891);
        }

        @Override // leakcanary.AbstractC89795c
        /* renamed from: a */
        public final void mo144359a() {
            MethodCollector.m26663i(9295);
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100);
                System.runFinalization();
                MethodCollector.m26664o(9295);
            } catch (InterruptedException unused) {
                AssertionError assertionError = new AssertionError();
                MethodCollector.m26664o(9295);
                throw assertionError;
            }
        }
    }
}
