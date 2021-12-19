package com.bytedance.helios.sdk.p1097d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.p1095c.C15391f;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.d.s */
public final class C15420s extends AbstractC15395b {

    /* renamed from: b */
    public static final C15421a f37644b = new C15421a((byte) 0);

    /* renamed from: c */
    private int[] f37645c;

    static {
        Covode.recordClassIndex(17672);
    }

    /* renamed from: com.bytedance.helios.sdk.d.s$a */
    public static final class C15421a {
        static {
            Covode.recordClassIndex(17673);
        }

        private C15421a() {
        }

        public /* synthetic */ C15421a(byte b) {
            this();
        }
    }

    public C15420s() {
        m28355a(C15410l.f37626c);
        m28355a(C15423u.f37653c);
        m28355a(C15418q.f37641c);
        m28355a(C15422t.f37646a);
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final int[] mo25138a() {
        if (this.f37645c == null) {
            int size = this.f37577a.size();
            this.f37645c = new int[size];
            for (int i = 0; i < size; i++) {
                int[] iArr = this.f37645c;
                if (iArr == null) {
                    C89219l.m154707a();
                }
                iArr[i] = this.f37577a.keyAt(i);
            }
        }
        int[] iArr2 = this.f37645c;
        if (iArr2 == null) {
            C89219l.m154707a();
        }
        return iArr2;
    }

    /* renamed from: a */
    private final void m28355a(AbstractC15394a aVar) {
        String a = aVar.mo25129a();
        String b = aVar.mo25130b();
        int[] c = aVar.mo25131c();
        String[] d = aVar.mo25132d();
        int length = c.length;
        for (int i = 0; i < length; i++) {
            mo25134a(c[i], new C15400e(a, b, c[i], d[i]));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final void mo25135a(C15397d dVar, Throwable th) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(th, "");
        C15318n a = dVar.mo25140a(th);
        long reportDelayedMills = HeliosEnvImpl.INSTANCE.getCrpConfig().getReportDelayedMills();
        C89219l.m154719c(a, "");
        HandlerThreadC15486g.m28499b().postDelayed(new C15391f.RunnableC15392a(a), reportDelayedMills);
    }
}
