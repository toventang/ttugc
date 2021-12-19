package com.p2082ss.android.ugc.aweme.common.p2636h;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.h.c */
public final class C39127c {

    /* renamed from: a */
    public static final C39127c f92329a = new C39127c();

    /* renamed from: com.ss.android.ugc.aweme.common.h.c$b */
    public interface AbstractC39129b {
        static {
            Covode.recordClassIndex(46747);
        }

        /* renamed from: a */
        Object mo67885a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.h.c$d */
    public interface AbstractC39131d {
        static {
            Covode.recordClassIndex(46749);
        }

        /* renamed from: a */
        void mo67889a(int i, int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.h.c$e */
    static final class C39132e extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        public static final C39132e f92336a = new C39132e();

        private C39132e() {
        }

        static {
            Covode.recordClassIndex(46750);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            C39127c.m79420a(recyclerView);
        }
    }

    private C39127c() {
    }

    static {
        Covode.recordClassIndex(46745);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.common.h.c$a */
    public static final class C39128a {

        /* renamed from: a */
        public final AbstractC39129b f92330a;

        /* renamed from: b */
        public final LinkedList<C39130c> f92331b;

        static {
            Covode.recordClassIndex(46746);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39128a)) {
                return false;
            }
            C39128a aVar = (C39128a) obj;
            return C89219l.m154714a(this.f92330a, aVar.f92330a) && C89219l.m154714a(this.f92331b, aVar.f92331b);
        }

        public final int hashCode() {
            AbstractC39129b bVar = this.f92330a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            LinkedList<C39130c> linkedList = this.f92331b;
            if (linkedList != null) {
                i = linkedList.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "Data(identifier=" + this.f92330a + ", history=" + this.f92331b + ")";
        }

        public /* synthetic */ C39128a(AbstractC39129b bVar) {
            this(bVar, new LinkedList());
        }

        private C39128a(AbstractC39129b bVar, LinkedList<C39130c> linkedList) {
            C89219l.m154721d(linkedList, "");
            this.f92330a = bVar;
            this.f92331b = linkedList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00c8 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m79420a(androidx.recyclerview.widget.RecyclerView r13) {
        /*
        // Method dump skipped, instructions count: 296
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.common.p2636h.C39127c.m79420a(androidx.recyclerview.widget.RecyclerView):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.common.h.c$c */
    public static final class C39130c {

        /* renamed from: a */
        public int f92332a;

        /* renamed from: b */
        public Object f92333b;

        /* renamed from: c */
        public int f92334c;

        /* renamed from: d */
        public int f92335d;

        static {
            Covode.recordClassIndex(46748);
        }

        public C39130c() {
            this(0, null, 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39130c)) {
                return false;
            }
            C39130c cVar = (C39130c) obj;
            return this.f92332a == cVar.f92332a && C89219l.m154714a(this.f92333b, cVar.f92333b) && this.f92334c == cVar.f92334c && this.f92335d == cVar.f92335d;
        }

        public final int hashCode() {
            int i = this.f92332a * 31;
            Object obj = this.f92333b;
            return ((((i + (obj != null ? obj.hashCode() : 0)) * 31) + this.f92334c) * 31) + this.f92335d;
        }

        public final String toString() {
            return "Item(pos=" + this.f92332a + ", id=" + this.f92333b + ", status=" + this.f92334c + ", newStatus=" + this.f92335d + ")";
        }

        private C39130c(int i, Object obj) {
            this.f92332a = i;
            this.f92333b = obj;
            this.f92334c = 0;
            this.f92335d = 0;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C39130c(int i, Object obj, int i2) {
            this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : obj);
        }
    }

    /* renamed from: a */
    public static final void m79421a(RecyclerView recyclerView, AbstractC39129b bVar) {
        if (recyclerView != null && !(recyclerView.getTag(R.id.dgx) instanceof C39128a)) {
            recyclerView.mo4405a(C39132e.f92336a);
            recyclerView.setTag(R.id.dgx, new C39128a(bVar));
        }
    }
}
