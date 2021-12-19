package p4646ms.p4647bd.p4648o;

import android.util.SparseArray;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: ms.bd.o.b */
public final class C89868b {

    /* renamed from: a */
    private static SparseArray<AbstractC89869a> f203766a = new SparseArray<>();

    /* renamed from: ms.bd.o.b$a */
    public static abstract class AbstractC89869a {
        static {
            Covode.recordClassIndex(105966);
        }

        /* renamed from: a */
        public Object mo35023a(int i, int i2, long j, String str, Object obj) {
            return mo35029a(j, str, obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo35029a(long j, String str, Object obj) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(105965);
    }

    /* renamed from: a */
    public static Object m155937a(int i, int i2, long j, String str, Object obj) {
        MethodCollector.m26663i(2850);
        Object a = C89889h.m155966a(i, i2, j, str, obj);
        MethodCollector.m26664o(2850);
        return a;
    }

    /* renamed from: a */
    public static void m155939a(int i, AbstractC89869a aVar) {
        MethodCollector.m26663i(2745);
        AbstractC89869a aVar2 = f203766a.get(i);
        if (aVar2 == null) {
            f203766a.put(i, aVar);
            MethodCollector.m26664o(2745);
            return;
        }
        RuntimeException runtimeException = new RuntimeException(C1764a.m5928a((String) C89889h.m155966a(16777217, 0, 0, "97346e", new byte[]{109, 38, 0, 72, 8, 118, 122, 20, 103, 97, 38, 117, 82, 69, 14, 123, 41, 2, 103, 118, 102}), new Object[]{aVar2.toString()}));
        MethodCollector.m26664o(2745);
        throw runtimeException;
    }

    /* renamed from: b */
    public static Object m155940b(int i, int i2, long j, String str, Object obj) {
        MethodCollector.m26663i(2941);
        AbstractC89869a aVar = f203766a.get(i);
        if (aVar != null) {
            try {
                Object a = aVar.mo35023a(i, i2, j, str, obj);
                MethodCollector.m26664o(2941);
                return a;
            } catch (Throwable th) {
                RuntimeException runtimeException = new RuntimeException(th);
                MethodCollector.m26664o(2941);
                throw runtimeException;
            }
        } else {
            RuntimeException runtimeException2 = new RuntimeException(C1764a.m5928a((String) C89889h.m155966a(16777217, 0, 0, "df27b9", new byte[]{122, 116, 1, 64, 82, 42, 98, 7, 38, 99, 53, 109, 82, 3, 84, 32, 113, 70, 111, 110, 113}), new Object[]{Integer.valueOf(i)}));
            MethodCollector.m26664o(2941);
            throw runtimeException2;
        }
    }

    /* renamed from: a */
    public static Object m155938a(int i, String str) {
        MethodCollector.m26663i(2848);
        Object a = C89889h.m155966a(i, 0, 0, str, null);
        MethodCollector.m26664o(2848);
        return a;
    }
}
