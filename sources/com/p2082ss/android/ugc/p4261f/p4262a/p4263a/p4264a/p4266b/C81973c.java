package com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.C81961a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.C81968b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81962a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81963b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81966e;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.C81967f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.f.a.a.a.b.c */
public final class C81973c implements AbstractC81981g {

    /* renamed from: a */
    protected AbstractC81962a f183450a;

    /* renamed from: b */
    protected AbstractC81965d f183451b;

    static {
        Covode.recordClassIndex(95788);
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final void mo117465a(List<? extends AbstractC81966e> list) {
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: b */
    public final void mo117466b(List<? extends AbstractC81963b> list) {
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final void mo117464a(AbstractC81962a aVar) {
        this.f183450a = aVar;
    }

    public C81973c(AbstractC81962a aVar, AbstractC81965d dVar) {
        this.f183450a = aVar;
        this.f183451b = dVar;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final C81967f mo61744a(List<? extends AbstractC81964c> list, Map<String, Object> map) {
        int i;
        C81961a aVar;
        AbstractC81962a aVar2;
        C81967f fVar = new C81967f();
        Object obj = map.get("internet_speed");
        if (obj != null) {
            i = ((Integer) obj).intValue();
        } else {
            i = -1;
        }
        double d = (double) i;
        boolean z = true;
        AbstractC81964c cVar = null;
        if (d <= 0.0d || (aVar2 = this.f183450a) == null) {
            aVar = null;
        } else {
            double a = aVar2.mo61720a();
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            double b = this.f183450a.mo61721b();
            Double.isNaN(d);
            Double.isNaN(d);
            double d2 = (a * d * d * d) + (b * d * d);
            double c = this.f183450a.mo61722c();
            Double.isNaN(d);
            aVar = new C81961a(Math.max(d2 + (c * d) + this.f183450a.mo61723d(), this.f183450a.mo61724e()), true);
        }
        if (aVar != null) {
            fVar.f183437d = aVar.f183432a;
            try {
                double d3 = aVar.f183432a;
                ArrayList<AbstractC81964c> arrayList = new ArrayList();
                if (this.f183451b != null && !list.isEmpty()) {
                    Pair<Double, Double> d4 = this.f183451b.mo61740d();
                    Set<String> b2 = this.f183451b.mo61738b();
                    if (d4 == null || this.f183451b.mo61739c() <= 0.0d) {
                        z = false;
                    }
                    for (AbstractC81964c cVar2 : list) {
                        if (z) {
                            double bitRate = (double) cVar2.getBitRate();
                            if (bitRate >= ((Double) d4.first).doubleValue() && bitRate <= ((Double) d4.second).doubleValue()) {
                                arrayList.add(cVar2);
                            }
                        } else if (b2 != null && b2.contains(cVar2.getGearName())) {
                            arrayList.add(cVar2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        if (z) {
                            AbstractC81964c cVar3 = null;
                            for (AbstractC81964c cVar4 : list) {
                                if (cVar3 != null) {
                                    double bitRate2 = (double) cVar4.getBitRate();
                                    double c2 = this.f183451b.mo61739c();
                                    Double.isNaN(bitRate2);
                                    double abs = Math.abs(bitRate2 - c2);
                                    double bitRate3 = (double) cVar3.getBitRate();
                                    double c3 = this.f183451b.mo61739c();
                                    Double.isNaN(bitRate3);
                                    if (abs >= Math.abs(bitRate3 - c3)) {
                                    }
                                }
                                cVar3 = cVar4;
                            }
                            arrayList.add(cVar3);
                        } else {
                            arrayList.add(list.get(0));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (AbstractC81964c cVar5 : arrayList) {
                        if (cVar != null) {
                            if (((double) cVar.getBitRate()) > d3) {
                                if (cVar5.getBitRate() < cVar.getBitRate()) {
                                }
                            } else if (d3 >= ((double) cVar5.getBitRate())) {
                                if (cVar5.getBitRate() < cVar.getBitRate()) {
                                }
                            }
                        }
                        cVar = cVar5;
                    }
                    fVar.f183434a = cVar;
                } else {
                    throw new C81968b(5, "Intersection bitrate list is empty.");
                }
            } catch (C81968b e) {
                fVar.f183435b = e;
            }
        }
        if (fVar.f183434a == null) {
            if (list == null || list.size() == 0) {
                fVar.f183435b = new C81968b(0, "bitrate list is empty");
                return fVar;
            }
            ArrayList arrayList2 = new ArrayList(list);
            Collections.sort(arrayList2, new Comparator<AbstractC81964c>() {
                /* class com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81973c.C819741 */

                static {
                    Covode.recordClassIndex(95789);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(AbstractC81964c cVar, AbstractC81964c cVar2) {
                    AbstractC81964c cVar3 = cVar;
                    AbstractC81964c cVar4 = cVar2;
                    if (cVar3 == null || cVar4 == null) {
                        return 0;
                    }
                    return cVar3.getSize() - cVar4.getSize();
                }
            });
            fVar.f183434a = (AbstractC81964c) arrayList2.get(0);
        }
        return fVar;
    }
}
