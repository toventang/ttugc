package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.f */
public abstract class AbstractC75850f {
    static {
        Covode.recordClassIndex(88784);
    }

    /* renamed from: a */
    public abstract void mo119522a(List<AbstractC75730a> list);

    private AbstractC75850f() {
    }

    public /* synthetic */ AbstractC75850f(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.f$a */
    public static final class C75851a extends AbstractC75850f {

        /* renamed from: a */
        public final AbstractC75730a f170385a;

        static {
            Covode.recordClassIndex(88785);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C75851a) && C89219l.m154714a(this.f170385a, ((C75851a) obj).f170385a);
            }
            return true;
        }

        public final int hashCode() {
            AbstractC75730a aVar = this.f170385a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Add(filter=" + this.f170385a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75851a(AbstractC75730a aVar) {
            super((byte) 0);
            C89219l.m154721d(aVar, "");
            this.f170385a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.AbstractC75850f
        /* renamed from: a */
        public final void mo119522a(List<AbstractC75730a> list) {
            C89219l.m154721d(list, "");
            if (!list.contains(this.f170385a)) {
                list.add(this.f170385a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.f$b */
    public static final class C75852b extends AbstractC75850f {

        /* renamed from: a */
        public final AbstractC75730a f170386a;

        static {
            Covode.recordClassIndex(88786);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C75852b) && C89219l.m154714a(this.f170386a, ((C75852b) obj).f170386a);
            }
            return true;
        }

        public final int hashCode() {
            AbstractC75730a aVar = this.f170386a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Remove(filter=" + this.f170386a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75852b(AbstractC75730a aVar) {
            super((byte) 0);
            C89219l.m154721d(aVar, "");
            this.f170386a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.AbstractC75850f
        /* renamed from: a */
        public final void mo119522a(List<AbstractC75730a> list) {
            C89219l.m154721d(list, "");
            list.remove(this.f170386a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.f$c */
    public static final class C75853c extends AbstractC75850f {

        /* renamed from: a */
        public final AbstractC89172b<AbstractC75730a, Boolean> f170387a;

        static {
            Covode.recordClassIndex(88787);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C75853c) && C89219l.m154714a(this.f170387a, ((C75853c) obj).f170387a);
            }
            return true;
        }

        public final int hashCode() {
            AbstractC89172b<AbstractC75730a, Boolean> bVar = this.f170387a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "RemoveWithPredicate(predicate=" + this.f170387a + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.sticker.repository.d.a.a, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75853c(AbstractC89172b<? super AbstractC75730a, Boolean> bVar) {
            super((byte) 0);
            C89219l.m154721d(bVar, "");
            this.f170387a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.AbstractC75850f
        /* renamed from: a */
        public final void mo119522a(List<AbstractC75730a> list) {
            C89219l.m154721d(list, "");
            Iterator<AbstractC75730a> it = list.iterator();
            while (it.hasNext()) {
                if (this.f170387a.invoke(it.next()).booleanValue()) {
                    it.remove();
                }
            }
        }
    }
}
