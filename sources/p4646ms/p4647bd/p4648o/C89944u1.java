package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: ms.bd.o.u1 */
public class C89944u1 {

    /* renamed from: a */
    private static final String f203831a = ((String) C89889h.m155966a(16777217, 0, 0, "19802c", new byte[]{46, 58, 5, 71, 23, 120}));

    static {
        MethodCollector.m26663i(859);
        Covode.recordClassIndex(106041);
        MethodCollector.m26664o(859);
    }

    /* renamed from: a */
    private static boolean m156058a(File file) {
        MethodCollector.m26663i(857);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(857);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(857);
        return delete;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00d8 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd A[SYNTHETIC, Splitter:B:41:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m156057a(android.content.Context r19) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: p4646ms.p4647bd.p4648o.C89944u1.m156057a(android.content.Context):int");
    }
}
