package androidx.work;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.work.d */
public final class C1595d {

    /* renamed from: a */
    public final Set<C1596a> f5220a = new HashSet();

    static {
        Covode.recordClassIndex(1748);
    }

    /* renamed from: a */
    public final int mo5353a() {
        return this.f5220a.size();
    }

    public final int hashCode() {
        return this.f5220a.hashCode();
    }

    /* renamed from: androidx.work.d$a */
    public static final class C1596a {

        /* renamed from: a */
        public final Uri f5221a;

        /* renamed from: b */
        public final boolean f5222b;

        static {
            Covode.recordClassIndex(1749);
        }

        public final int hashCode() {
            return (this.f5221a.hashCode() * 31) + (this.f5222b ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C1596a aVar = (C1596a) obj;
                if (this.f5222b != aVar.f5222b || !this.f5221a.equals(aVar.f5221a)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public C1596a(Uri uri, boolean z) {
            this.f5221a = uri;
            this.f5222b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5220a.equals(((C1595d) obj).f5220a);
    }
}
