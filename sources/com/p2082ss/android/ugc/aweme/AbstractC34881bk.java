package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bk */
public interface AbstractC34881bk {
    static {
        Covode.recordClassIndex(41890);
    }

    void clearSharedAccount(AbstractC89172b<? super Boolean, C89391z> bVar);

    void onDeviceRegistrationInfoChanged();

    void saveSharedAccount(C34882a aVar);

    /* renamed from: com.ss.android.ugc.aweme.bk$a */
    public static final class C34882a {

        /* renamed from: a */
        public final String f82326a;

        /* renamed from: b */
        public final C47173f f82327b;

        /* renamed from: c */
        public final AbstractC89172b<Boolean, C89391z> f82328c;

        static {
            Covode.recordClassIndex(41891);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C34882a)) {
                return false;
            }
            C34882a aVar = (C34882a) obj;
            return C89219l.m154714a(this.f82326a, aVar.f82326a) && C89219l.m154714a(this.f82327b, aVar.f82327b) && C89219l.m154714a(this.f82328c, aVar.f82328c);
        }

        public final int hashCode() {
            String str = this.f82326a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C47173f fVar = this.f82327b;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
            AbstractC89172b<Boolean, C89391z> bVar = this.f82328c;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "AccountShareConfig(uri=" + this.f82326a + ", dataModel=" + this.f82327b + ", listener=" + this.f82328c + ")";
        }

        private /* synthetic */ C34882a() {
            this(null);
        }

        public C34882a(C47173f fVar) {
            this.f82326a = null;
            this.f82327b = fVar;
            this.f82328c = null;
        }
    }
}
