package com.p2082ss.android.ugc.aweme.search.theme.dark;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4616h.AbstractC89247c;
import p4600h.p4616h.AbstractC89249e;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.search.theme.dark.c */
public final class C67799c extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f151947a = {new C89225r(C67799c.class, "isVisible", "isVisible()Z", 0)};

    /* renamed from: g */
    private static final C67801b f151948g = new C67801b((byte) 0);

    /* renamed from: b */
    Integer f151949b;

    /* renamed from: c */
    final RecyclerView f151950c;

    /* renamed from: d */
    public final AbstractC67802c f151951d;

    /* renamed from: e */
    private final AbstractC89249e f151952e = new C67800a(true, true, this);

    /* renamed from: f */
    private final AbstractC51043a f151953f;

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.c$c */
    public interface AbstractC67802c {
        static {
            Covode.recordClassIndex(79455);
        }

        /* renamed from: e */
        void mo106881e();

        /* renamed from: f */
        void mo106882f();
    }

    static {
        Covode.recordClassIndex(79452);
    }

    /* renamed from: a */
    private final void m119980a(boolean z) {
        this.f151952e.mo143655a(f151947a[0], Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo106898a() {
        return ((Boolean) this.f151952e.mo23374a(this, f151947a[0])).booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.c$b */
    static final class C67801b {
        static {
            Covode.recordClassIndex(79454);
        }

        private C67801b() {
        }

        public /* synthetic */ C67801b(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo106899b() {
        m119980a(true);
        this.f151949b = null;
        this.f151950c.mo4418b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.c$a */
    public static final class C67800a extends AbstractC89247c<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f151954a;

        /* renamed from: b */
        final /* synthetic */ C67799c f151955b;

        static {
            Covode.recordClassIndex(79453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67800a(Object obj, Object obj2, C67799c cVar) {
            super(obj2);
            this.f151954a = obj;
            this.f151955b = cVar;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, Boolean bool, Boolean bool2) {
            C89219l.m154721d(iVar, "");
            boolean booleanValue = bool2.booleanValue();
            if (bool.booleanValue() == booleanValue) {
                return;
            }
            if (booleanValue) {
                this.f151955b.f151951d.mo106882f();
            } else {
                this.f151955b.f151951d.mo106881e();
            }
        }
    }

    public C67799c(RecyclerView recyclerView, AbstractC51043a aVar, AbstractC67802c cVar) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(cVar, "");
        this.f151950c = recyclerView;
        this.f151953f = aVar;
        this.f151951d = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r2 != null) goto L_0x0056;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4754a(androidx.recyclerview.widget.RecyclerView r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r0)
            java.lang.Integer r0 = r6.f151949b
            if (r0 == 0) goto L_0x0059
            int r5 = r0.intValue()
            com.ss.android.ugc.aweme.flowfeed.a.a r0 = r6.f151953f
            androidx.fragment.app.Fragment r0 = r0.mo60503g()
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r0 = r0.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x001e:
            java.util.concurrent.ConcurrentHashMap r0 = com.p2082ss.android.ugc.aweme.search.theme.dark.C67797b.m119978a()
            java.lang.Object r0 = r0.get(r1)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            if (r0 == 0) goto L_0x0030
            java.util.Collection r0 = r0.values()
            if (r0 != 0) goto L_0x0032
        L_0x0030:
            h.a.z r0 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0032:
            java.util.Iterator r4 = r0.iterator()
        L_0x0036:
            boolean r1 = r4.hasNext()
            r3 = 1
            r0 = 0
            if (r1 == 0) goto L_0x005a
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.ss.android.ugc.aweme.search.j.a r0 = (com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a) r0
            int r1 = r0.mo60387o()
            boolean r0 = r0.mo60381i()
            if (r0 == 0) goto L_0x0036
            if (r1 >= 0) goto L_0x0052
            goto L_0x0036
        L_0x0052:
            if (r5 < r1) goto L_0x0036
            if (r2 == 0) goto L_0x005a
        L_0x0056:
            r6.m119980a(r3)
        L_0x0059:
            return
        L_0x005a:
            r3 = 0
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.theme.dark.C67799c.mo4754a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
