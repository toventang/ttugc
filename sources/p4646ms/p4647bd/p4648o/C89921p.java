package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.p */
public class C89921p implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ String f203811a;

    static {
        Covode.recordClassIndex(106018);
    }

    C89921p(String str) {
        this.f203811a = str;
    }

    public boolean accept(File file, String str) {
        return str.startsWith(this.f203811a);
    }
}
