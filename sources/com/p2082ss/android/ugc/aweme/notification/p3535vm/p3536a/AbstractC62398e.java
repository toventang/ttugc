package com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.a.e */
public interface AbstractC62398e<REQUEST_PARAM, DATA> {
    static {
        Covode.recordClassIndex(73188);
    }

    /* renamed from: a */
    C62400b<DATA> mo100365a(DATA data, Throwable th);

    /* renamed from: a */
    DATA mo100366a();

    /* renamed from: b */
    AbstractC88979t<C62400b<DATA>> mo100367b();

    /* renamed from: c */
    AbstractC88979t<C62400b<DATA>> mo100368c();

    /* renamed from: d */
    boolean mo100369d();

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.e$a */
    public static final class C62399a {
        static {
            Covode.recordClassIndex(73189);
        }

        /* renamed from: a */
        public static <REQUEST_PARAM, DATA> AbstractC88979t<C62400b<DATA>> m112856a() {
            throw new IllegalAccessError("cannot call loadMore");
        }

        /* renamed from: a */
        public static <REQUEST_PARAM, DATA> C62400b<DATA> m112854a(AbstractC62398e<REQUEST_PARAM, DATA> eVar, DATA data) {
            return eVar.mo100365a(data, null);
        }

        /* renamed from: a */
        public static <REQUEST_PARAM, DATA> C62400b<DATA> m112855a(AbstractC62398e<REQUEST_PARAM, DATA> eVar, DATA data, Throwable th) {
            return new C62400b<>(eVar, data, th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.e$b */
    public static final class C62400b<DATA> {

        /* renamed from: a */
        public final AbstractC62398e<? extends Object, DATA> f141595a;

        /* renamed from: b */
        public final DATA f141596b;

        /* renamed from: c */
        public final Throwable f141597c;

        static {
            Covode.recordClassIndex(73190);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C62400b)) {
                return false;
            }
            C62400b bVar = (C62400b) obj;
            return C89219l.m154714a(this.f141595a, bVar.f141595a) && C89219l.m154714a(this.f141596b, bVar.f141596b) && C89219l.m154714a(this.f141597c, bVar.f141597c);
        }

        public final int hashCode() {
            AbstractC62398e<? extends Object, DATA> eVar = this.f141595a;
            int i = 0;
            int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
            DATA data = this.f141596b;
            int hashCode2 = (hashCode + (data != null ? data.hashCode() : 0)) * 31;
            Throwable th = this.f141597c;
            if (th != null) {
                i = th.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "Stream(source=" + this.f141595a + ", data=" + ((Object) this.f141596b) + ", error=" + this.f141597c + ")";
        }

        public /* synthetic */ C62400b(AbstractC62398e eVar, Object obj) {
            this(eVar, obj, null);
        }

        public C62400b(AbstractC62398e<? extends Object, DATA> eVar, DATA data, Throwable th) {
            C89219l.m154721d(eVar, "");
            this.f141595a = eVar;
            this.f141596b = data;
            this.f141597c = th;
        }
    }
}
