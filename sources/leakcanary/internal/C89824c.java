package leakcanary.internal;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4645m.C89863a;

/* renamed from: leakcanary.internal.c */
public final class C89824c implements C89863a.AbstractC89864a {

    /* renamed from: a */
    public static final C89350l f203683a = new C89350l("\n");

    /* renamed from: b */
    public static final C89825a f203684b = new C89825a((byte) 0);

    /* renamed from: leakcanary.internal.c$a */
    public static final class C89825a {
        static {
            Covode.recordClassIndex(105922);
        }

        private C89825a() {
        }

        public /* synthetic */ C89825a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(105921);
    }

    @Override // p4645m.C89863a.AbstractC89864a
    /* renamed from: a */
    public final void mo144406a(String str) {
        C89219l.m154719c(str, "");
        if (str.length() >= 4000) {
            Iterator<T> it = f203683a.split(str, 0).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // p4645m.C89863a.AbstractC89864a
    /* renamed from: a */
    public final void mo144407a(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        mo144406a(str + '\n' + Log.getStackTraceString(th));
    }
}
