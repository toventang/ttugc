package com.p2082ss.android.ugc.aweme.bullet.p2417e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.e.a */
public final class C35143a {

    /* renamed from: a */
    public final List<C35144a> f82931a = new ArrayList();

    static {
        Covode.recordClassIndex(42298);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.e.a$a */
    public static final class C35144a {

        /* renamed from: a */
        public final Uri f82932a;

        /* renamed from: b */
        public final C35146c f82933b;

        static {
            Covode.recordClassIndex(42299);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35144a)) {
                return false;
            }
            C35144a aVar = (C35144a) obj;
            return C89219l.m154714a(this.f82932a, aVar.f82932a) && C89219l.m154714a(this.f82933b, aVar.f82933b);
        }

        public final int hashCode() {
            Uri uri = this.f82932a;
            int i = 0;
            int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
            C35146c cVar = this.f82933b;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "ViewCacheItem(uri=" + this.f82932a + ", cache=" + this.f82933b + ")";
        }

        public C35144a(Uri uri, C35146c cVar) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(cVar, "");
            this.f82932a = uri;
            this.f82933b = cVar;
        }
    }
}
