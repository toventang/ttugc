package dmt.p4542av.video.p4546c;

import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.ugc.aweme.application.C33914o;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.c.a */
public final class C88242a implements C30731d.AbstractC30735d {

    /* renamed from: a */
    private final boolean f200280a;

    static {
        Covode.recordClassIndex(104277);
    }

    public C88242a(boolean z) {
        this.f200280a = z;
    }

    @Override // com.p2082ss.android.ttve.nativePort.C30731d.AbstractC30735d
    /* renamed from: a */
    public final boolean mo55458a(List<String> list) {
        C89219l.m154721d(list, "");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            for (T t : list) {
                System.currentTimeMillis();
                if (C33914o.f80220b.get(t) == null) {
                    Librarian.m38962a(t);
                }
                System.currentTimeMillis();
            }
        } catch (Throwable th) {
            C40971f.m82490a(th, "VESDK load so");
            if (this.f200280a) {
                throw th;
            }
        }
        C73991bj.m130128a("av-performance, SafeLibraryLoader: load all so cost time:  " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return true;
    }
}
