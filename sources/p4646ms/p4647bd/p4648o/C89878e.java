package p4646ms.p4647bd.p4648o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.e */
public final class C89878e extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(105975);
    }

    C89878e() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        MethodCollector.m26663i(3363);
        Context context = C89865a.f203764a.f203765b;
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = context.getFilesDir();
        }
        File file = new File(C58016d.f132222c, (String) C89889h.m155966a(16777217, 0, 0, "87c2b3", new byte[]{103, 56, 3, 66, 92, 48, 58}));
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        MethodCollector.m26664o(3363);
        return absolutePath;
    }
}
