package com.bytedance.p802b.p813c.p814a;

import com.C1764a;
import com.bytedance.apm.p789q.C12591l;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;
import com.bytedance.p802b.p813c.p814a.C12981a;
import com.bytedance.p802b.p813c.p814a.C12983b;
import com.bytedance.p802b.p813c.p815b.C12999a;
import com.bytedance.p802b.p813c.p816c.C13023i;
import com.bytedance.p802b.p813c.p818d.C13024a;
import com.bytedance.p802b.p830h.C13092a;
import com.bytedance.p802b.p831i.p832a.C13099c;
import com.bytedance.p802b.p834j.p838d.C13107b;
import com.bytedance.p802b.p834j.p839e.AbstractC13109a;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.b.c.a.d */
public final class C12989d extends C13107b {

    /* renamed from: a */
    C12987c f31634a;

    /* renamed from: b */
    public AtomicBoolean f31635b = new AtomicBoolean(false);

    /* renamed from: c */
    public AbstractRunnableC13123a f31636c;

    /* renamed from: d */
    public long f31637d;

    /* renamed from: e */
    public long f31638e;

    /* renamed from: f */
    public C12999a f31639f;

    /* renamed from: g */
    public AbstractC23724c f31640g;

    /* renamed from: h */
    public boolean f31641h = true;

    static {
        Covode.recordClassIndex(14825);
    }

    C12989d(C12987c cVar, AbstractC23724c cVar2) {
        this.f31634a = cVar;
        this.f31640g = cVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20843a(float f, Map<Integer, C13023i> map, Map<Integer, C13023i> map2, AbstractC23724c.C23725a aVar) {
        C12981a.EnumC12982a aVar2;
        C13023i iVar;
        if (!(map.isEmpty() || map2.isEmpty() || f <= 0.0f)) {
            LinkedList linkedList = new LinkedList();
            LinkedList<AbstractC13109a.C13110a> linkedList2 = new LinkedList<>();
            for (Map.Entry<Integer, C13023i> entry : map.entrySet()) {
                C13023i value = entry.getValue();
                if (!(value == null || (iVar = map2.get(entry.getKey())) == null || !iVar.f31731b.equals(value.f31731b))) {
                    double d = (double) iVar.f31732c;
                    double d2 = (double) value.f31732c;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    double d3 = d - d2;
                    double d4 = (double) f;
                    Double.isNaN(d4);
                    double d5 = d3 / d4;
                    linkedList.add(new C12591l(iVar.f31731b, Double.valueOf(C1764a.m5928a("%.2f", new Object[]{Double.valueOf(d5)}))));
                    linkedList2.add(new AbstractC13109a.C13110a(iVar.f31731b, Double.valueOf(C1764a.m5928a("%.2f", new Object[]{Double.valueOf(d5)})).doubleValue(), iVar.f31730a));
                }
            }
            if (!linkedList.isEmpty()) {
                Collections.sort(linkedList2, new Comparator<AbstractC13109a.C13110a>() {
                    /* class com.bytedance.p802b.p813c.p814a.C12989d.C129912 */

                    static {
                        Covode.recordClassIndex(14827);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* bridge */ /* synthetic */ int compare(AbstractC13109a.C13110a aVar, AbstractC13109a.C13110a aVar2) {
                        return (int) ((aVar2.f31951b * 100.0d) - (aVar.f31951b * 100.0d));
                    }
                });
                C13024a.C13025a.f31742a.mo20882a(linkedList2);
                if (this.f31639f.f31669d) {
                    if (C12983b.C12986a.f31626a.mo20835a()) {
                        aVar2 = C12981a.EnumC12982a.FRONT;
                    } else {
                        aVar2 = C12981a.EnumC12982a.BACK;
                    }
                    C12992e eVar = new C12992e(aVar2, C13099c.m23558a().mo20938b(), linkedList, aVar);
                    try {
                        eVar.f31645b = this.f31640g.mo39172i();
                    } catch (Throwable unused) {
                    }
                    C13092a.m23544a(eVar);
                }
            }
        }
    }
}
