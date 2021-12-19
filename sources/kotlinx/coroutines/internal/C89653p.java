package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import kotlinx.coroutines.AbstractC89587ci;

/* renamed from: kotlinx.coroutines.internal.p */
public final class C89653p {

    /* renamed from: a */
    private static final boolean f203402a = true;

    /* renamed from: a */
    public static final Void m155616a() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    static {
        Covode.recordClassIndex(105746);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.coroutines.internal.MainDispatcherFactory] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.MainDispatcherFactory] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.coroutines.ci] */
    /* renamed from: a */
    public static final AbstractC89587ci m155617a(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            mainDispatcherFactory = mainDispatcherFactory.createDispatcher(list);
            return mainDispatcherFactory;
        } catch (Throwable th) {
            return m155619a(th, mainDispatcherFactory.hintOnError());
        }
    }

    /* renamed from: a */
    static /* synthetic */ C89654q m155618a(Throwable th, int i) {
        if ((i & 1) != 0) {
            th = null;
        }
        return m155619a(th, (String) null);
    }

    /* renamed from: a */
    private static final C89654q m155619a(Throwable th, String str) {
        if (f203402a) {
            return new C89654q(th, str);
        }
        if (th != null) {
            throw th;
        }
        m155616a();
        throw null;
    }
}
