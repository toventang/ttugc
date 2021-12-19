package com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.C81961a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.C81968b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.C81982c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81966e;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.C81967f;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81969a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.f.a.a.a.b.f */
public class C81978f extends AbstractC81969a {

    /* renamed from: e */
    C81982c[] f183454e;

    static {
        Covode.recordClassIndex(95793);
    }

    /* renamed from: com.ss.android.ugc.f.a.a.a.b.f$a */
    public static class C81979a extends AbstractC81969a.AbstractC81970a {
        static {
            Covode.recordClassIndex(95794);
        }

        @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81969a.AbstractC81970a
        /* renamed from: a */
        public AbstractC81981g mo61745a() {
            C81978f fVar = new C81978f(this.f183444a);
            fVar.mo117465a(this.f183445b);
            fVar.mo117466b(this.f183446c);
            fVar.mo117464a(this.f183447d);
            List list = this.f183445b;
            if (list != null && !list.isEmpty()) {
                fVar.f183454e = new C81982c[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    AbstractC81966e eVar = (AbstractC81966e) list.get(i);
                    double bitRate = (double) eVar.getBitRate();
                    double networkLower = (double) eVar.getNetworkLower();
                    Double.isNaN(networkLower);
                    double networkUpper = (double) eVar.getNetworkUpper();
                    Double.isNaN(networkUpper);
                    fVar.f183454e[i] = new C81982c(bitRate, networkLower * 8000.0d, 8000.0d * networkUpper);
                }
            }
            return fVar;
        }

        public C81979a(AbstractC81965d dVar) {
            super(dVar);
        }
    }

    public C81978f(AbstractC81965d dVar) {
        super(dVar);
    }

    /* renamed from: com.ss.android.ugc.f.a.a.a.b.f$b */
    public static class C81980b {

        /* renamed from: a */
        public Map<String, Object> f183455a = new HashMap();

        static {
            Covode.recordClassIndex(95795);
        }

        /* renamed from: a */
        public final C81980b mo127146a(int i) {
            this.f183455a.put("internet_speed", Integer.valueOf(i));
            return this;
        }
    }

    /* renamed from: a */
    private static int m141943a(Map<String, Object> map) {
        Object obj = map.get("internet_speed");
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fc, code lost:
        if (r2 == null) goto L_0x0027;
     */
    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.C81967f mo61744a(java.util.List<? extends com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c> r18, java.util.Map<java.lang.String, java.lang.Object> r19) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81978f.mo61744a(java.util.List, java.util.Map):com.ss.android.ugc.f.a.a.a.a.f");
    }

    /* renamed from: a */
    private C81967f m141944a(C81967f fVar, C81961a aVar, List<? extends AbstractC81964c> list) {
        AbstractC81964c cVar;
        if (aVar != null) {
            try {
                List<AbstractC81964c> c = mo127140c(list);
                if (!c.isEmpty()) {
                    cVar = null;
                    if (aVar.f183433b) {
                        double d = aVar.f183432a;
                        for (AbstractC81964c cVar2 : c) {
                            if (cVar != null) {
                                if (((double) cVar.getBitRate()) > d) {
                                    if (cVar2.getBitRate() < cVar.getBitRate()) {
                                    }
                                } else if (d >= ((double) cVar2.getBitRate())) {
                                    if (cVar2.getBitRate() < cVar.getBitRate()) {
                                    }
                                }
                            }
                            cVar = cVar2;
                        }
                    } else {
                        double d2 = aVar.f183432a;
                        for (AbstractC81964c cVar3 : c) {
                            if (cVar != null) {
                                double bitRate = (double) cVar3.getBitRate();
                                Double.isNaN(bitRate);
                                double abs = Math.abs(bitRate - d2);
                                double bitRate2 = (double) cVar.getBitRate();
                                Double.isNaN(bitRate2);
                                if (abs >= Math.abs(bitRate2 - d2)) {
                                }
                            }
                            cVar = cVar3;
                        }
                    }
                } else {
                    throw new C81968b(5, "Intersection bitrate list is empty.");
                }
            } catch (C81968b e) {
                fVar.f183435b = e;
            }
        } else if (this.f183440a != null) {
            cVar = mo127141d(list);
        } else {
            throw new C81968b(6, "gear config is null");
        }
        fVar.f183434a = cVar;
        if (fVar.f183434a == null) {
            fVar.f183434a = (AbstractC81964c) list.get(0);
        }
        return fVar;
    }
}
