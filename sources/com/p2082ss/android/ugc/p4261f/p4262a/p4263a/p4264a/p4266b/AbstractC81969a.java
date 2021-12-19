package com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.C81968b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81962a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81963b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81966e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.f.a.a.a.b.a */
public abstract class AbstractC81969a implements AbstractC81981g {

    /* renamed from: a */
    protected final AbstractC81965d f183440a;

    /* renamed from: b */
    protected List<? extends AbstractC81966e> f183441b;

    /* renamed from: c */
    protected List<? extends AbstractC81963b> f183442c;

    /* renamed from: d */
    protected AbstractC81962a f183443d;

    static {
        Covode.recordClassIndex(95784);
    }

    /* renamed from: com.ss.android.ugc.f.a.a.a.b.a$a */
    public static abstract class AbstractC81970a {

        /* renamed from: a */
        protected AbstractC81965d f183444a;

        /* renamed from: b */
        protected List<? extends AbstractC81966e> f183445b;

        /* renamed from: c */
        protected List<? extends AbstractC81963b> f183446c;

        /* renamed from: d */
        protected AbstractC81962a f183447d;

        static {
            Covode.recordClassIndex(95785);
        }

        /* renamed from: a */
        public abstract AbstractC81981g mo61745a();

        /* renamed from: a */
        public final AbstractC81970a mo127142a(AbstractC81962a aVar) {
            this.f183447d = aVar;
            return this;
        }

        /* renamed from: b */
        public final AbstractC81970a mo127144b(List<? extends AbstractC81963b> list) {
            this.f183446c = list;
            return this;
        }

        public AbstractC81970a(AbstractC81965d dVar) {
            this.f183444a = dVar;
        }

        /* renamed from: a */
        public final AbstractC81970a mo127143a(List<? extends AbstractC81966e> list) {
            this.f183445b = list;
            return this;
        }
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final void mo117464a(AbstractC81962a aVar) {
        this.f183443d = aVar;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: b */
    public final void mo117466b(List<? extends AbstractC81963b> list) {
        this.f183442c = list;
    }

    protected AbstractC81969a(AbstractC81965d dVar) {
        this.f183440a = dVar;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final void mo117465a(List<? extends AbstractC81966e> list) {
        this.f183441b = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final <T extends AbstractC81964c> T mo127141d(List<T> list) {
        String a = this.f183440a.mo61737a();
        double c = this.f183440a.mo61739c();
        if (c <= 0.0d) {
            for (T t : list) {
                if (TextUtils.equals(t.getGearName(), a)) {
                    return t;
                }
            }
            throw new C81968b(4, "defaultGearName = " + a + " bitrates = " + list.toString());
        }
        double d = Double.MAX_VALUE;
        T t2 = null;
        for (T t3 : list) {
            double bitRate = (double) t3.getBitRate();
            Double.isNaN(bitRate);
            double abs = Math.abs(bitRate - c);
            if (d > abs) {
                t2 = t3;
                d = abs;
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final <T extends AbstractC81964c> List<T> mo127140c(List<T> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.f183440a != null && !list.isEmpty()) {
            Pair<Double, Double> d = this.f183440a.mo61740d();
            Set<String> b = this.f183440a.mo61738b();
            if (d == null || this.f183440a.mo61739c() <= 0.0d) {
                z = false;
            } else {
                z = true;
            }
            for (T t : list) {
                if (z) {
                    double bitRate = (double) t.getBitRate();
                    if (bitRate >= ((Double) d.first).doubleValue() && bitRate <= ((Double) d.second).doubleValue()) {
                        arrayList.add(t);
                    }
                } else if (b != null && b.contains(t.getGearName())) {
                    arrayList.add(t);
                }
            }
            if (arrayList.isEmpty()) {
                if (z) {
                    T t2 = null;
                    for (T t3 : list) {
                        if (t2 != null) {
                            double bitRate2 = (double) t3.getBitRate();
                            double c = this.f183440a.mo61739c();
                            Double.isNaN(bitRate2);
                            double abs = Math.abs(bitRate2 - c);
                            double bitRate3 = (double) t2.getBitRate();
                            double c2 = this.f183440a.mo61739c();
                            Double.isNaN(bitRate3);
                            if (abs >= Math.abs(bitRate3 - c2)) {
                            }
                        }
                        t2 = t3;
                    }
                    arrayList.add(t2);
                } else {
                    arrayList.add(list.get(0));
                }
            }
        }
        return arrayList;
    }
}
