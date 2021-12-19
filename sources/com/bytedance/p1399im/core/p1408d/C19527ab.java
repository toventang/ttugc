package com.bytedance.p1399im.core.p1408d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19791aa;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19805ae;
import com.bytedance.p1399im.core.internal.utils.C19995d;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1415g.C19696b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.im.core.d.ab */
public final class C19527ab {

    /* renamed from: a */
    public String f46349a;

    /* renamed from: b */
    public C19678z f46350b = new C19678z();

    /* renamed from: c */
    Handler f46351c = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.p1399im.core.p1408d.C19527ab.HandlerC195281 */

        static {
            Covode.recordClassIndex(22372);
        }

        public final void handleMessage(Message message) {
            removeMessages(1);
            C19696b.m36819a(C19527ab.this.f46349a, C19527ab.this.f46350b, true);
        }
    };

    static {
        Covode.recordClassIndex(22371);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31191a(C19591aq aqVar) {
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairRange start, cid:" + this.f46349a + ", repairedRangeList:" + aqVar, (Throwable) null);
        List<C19590ap> list = aqVar.ranges;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < list.size() - 1) {
            C19590ap apVar = list.get(i);
            i++;
            C19590ap apVar2 = list.get(i);
            List<Long> a = C19777i.m37179a(this.f46349a, new C19590ap(apVar.end, apVar2.start));
            if (C19995d.m37744a(a)) {
                C19512f.m36457b("imsdk", "LeakMsgRepairModel repairRange indexList error, range:" + apVar + "nextRange:" + apVar2, (Throwable) null);
                arrayList.add(new C19590ap(apVar.end, apVar2.start));
            } else {
                if (!a.contains(Long.valueOf(apVar.end))) {
                    a.add(Long.valueOf(apVar.end));
                }
                if (!a.contains(Long.valueOf(apVar2.start))) {
                    a.add(Long.valueOf(apVar2.start));
                }
                C19590ap apVar3 = new C19590ap(apVar.end + 1, apVar2.start - 1);
                List<Long> b = m36485b(a);
                if (C19995d.m37744a(b)) {
                    m36483a(this.f46349a, apVar3);
                } else {
                    List<C19590ap> c = m36487c(b);
                    if (C19995d.m37744a(c)) {
                        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairRange leakRangeList error, leakIndexList:".concat(String.valueOf(b)), (Throwable) null);
                        m36483a(this.f46349a, apVar3);
                    } else {
                        arrayList.addAll(c);
                        m36484a(this.f46349a, apVar3, c);
                    }
                }
            }
        }
        this.f46350b.f46771g = new C19591aq(arrayList);
        if (arrayList.isEmpty()) {
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairRange end, empty leakRanges, cid:" + this.f46349a + ", repairedRangeList:" + aqVar, (Throwable) null);
            this.f46350b.f46770f = 1;
            mo31190a(new C19590ap(list.get(0).start, list.get(list.size() - 1).end));
            return;
        }
        List<C19590ap> d = m36489d(arrayList);
        this.f46350b.f46772h = new C19591aq(d);
        if (d.isEmpty()) {
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairRange, empty mergedLeakRanges, cid:" + this.f46349a + ", leakRanges:" + arrayList, (Throwable) null);
            d.addAll(arrayList);
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairRange start real, cid:" + this.f46349a + ", leakRanges:" + arrayList + ", mergedLeakRanges:" + d, (Throwable) null);
        long uptimeMillis = SystemClock.uptimeMillis();
        Pair<Boolean, List<String>> a2 = m36480a(d);
        this.f46350b.f46777m = ((Boolean) a2.first).booleanValue();
        this.f46350b.f46776l = a2.second.toString();
        C19591aq copy = C19532ad.m36496a(this.f46349a).copy();
        List<C19590ap> list2 = copy.ranges;
        this.f46350b.f46775k = SystemClock.uptimeMillis() - uptimeMillis;
        this.f46350b.f46773i = aqVar;
        this.f46350b.f46774j = copy;
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairRange end, cid:" + this.f46349a + ", before:" + aqVar + ", after:" + copy + ", mergedLeakRanges:" + d, (Throwable) null);
        if (list2 == null) {
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairRange definitely error, cid:" + this.f46349a, (Throwable) null);
            this.f46350b.f46770f = 4;
            mo31190a((C19590ap) null);
        } else if (list2.size() > 1) {
            this.f46350b.f46770f = 2;
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairRange part error, cid:" + this.f46349a, (Throwable) null);
            m36488c(list2.get(list2.size() - 1).end);
        } else {
            this.f46350b.f46770f = 3;
            mo31190a(list2.get(list2.size() - 1));
        }
    }

    /* renamed from: a */
    private static void m36484a(String str, C19590ap apVar, List<C19590ap> list) {
        if (C19995d.m37744a(list)) {
            C19512f.m36457b("imsdk", "LeakMsgRepairModel storeRangeByLeak leakRanges empty, cid:" + str + ", sourceRange:" + apVar + ", leakRanges:" + list, (Throwable) null);
            m36483a(str, apVar);
            return;
        }
        ArrayList<C19590ap> arrayList = new ArrayList();
        int i = 0;
        C19590ap apVar2 = new C19590ap(apVar.start, list.get(0).start - 1);
        C19590ap apVar3 = new C19590ap(list.get(list.size() - 1).end + 1, apVar.end);
        if (apVar2.isValid()) {
            arrayList.add(apVar2);
        }
        while (i < list.size() - 1) {
            i++;
            C19590ap apVar4 = new C19590ap(list.get(i).end + 1, list.get(i).start - 1);
            if (apVar4.isValid()) {
                arrayList.add(apVar4);
            }
        }
        if (apVar3.isValid()) {
            arrayList.add(apVar3);
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairModel storeRangeByLeak, cid:" + str + ", sourceRange:" + apVar + ", leakRanges:" + list + ", continueRange:" + arrayList, (Throwable) null);
        for (C19590ap apVar5 : arrayList) {
            m36483a(str, apVar5);
        }
    }

    /* renamed from: a */
    private void m36481a() {
        long f = C19777i.m37201f(this.f46349a);
        C20041s.m37876a();
        long d = C20041s.m37890d();
        this.f46350b.f46781q = true;
        this.f46350b.f46779o = f;
        this.f46350b.f46780p = d;
        C19512f.m36457b("imsdk", "LeakMsgRepairModel fullRepairDB start, cid:" + this.f46349a + ", maxIndex:" + f + ", baseIndex:" + d, (Throwable) null);
        C19532ad.m36497a(this.f46349a, new C19591aq(new ArrayList()));
        if (f <= d) {
            this.f46350b.f46778n = 1;
            C19512f.m36457b("imsdk", "LeakMsgRepairModel fullRepairDB end, no bigger index, cid:" + this.f46349a, (Throwable) null);
            if (f == d) {
                m36483a(this.f46349a, new C19590ap(f, f));
                return;
            }
            return;
        }
        this.f46350b.f46778n = 2;
        m36482a(f);
    }

    C19527ab(String str) {
        this.f46349a = str;
    }

    /* renamed from: b */
    private static List<Long> m36485b(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        for (long longValue = list.get(0).longValue(); longValue <= list.get(list.size() - 1).longValue(); longValue++) {
            if (!list.contains(Long.valueOf(longValue)) && !arrayList.contains(Long.valueOf(longValue))) {
                arrayList.add(Long.valueOf(longValue));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31190a(C19590ap apVar) {
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDB start, cid:" + this.f46349a + ", repairedRange:" + apVar, (Throwable) null);
        this.f46350b.f46783s = apVar;
        if (apVar == null) {
            m36481a();
        } else if (!apVar.isValid()) {
            this.f46350b.f46782r = true;
            m36481a();
        } else {
            this.f46350b.f46778n = 3;
            m36488c(apVar.end);
            m36482a(apVar.start);
        }
    }

    /* renamed from: a */
    private Pair<Boolean, List<String>> m36480a(List<C19590ap> list) {
        final ArrayList arrayList = new ArrayList();
        if (C19995d.m37744a(list)) {
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairByRange, cid:" + this.f46349a + ", invalid ranges:" + list, (Throwable) null);
            arrayList.add("repairByRange invalid ranges");
            return new Pair<>(false, arrayList);
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairByRange start, cid:" + this.f46349a + ", ranges:" + list, (Throwable) null);
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        final boolean[] zArr = new boolean[1];
        for (final C19590ap apVar : list) {
            new C19805ae(new AbstractC19479b<C19535af>() {
                /* class com.bytedance.p1399im.core.p1408d.C19527ab.C195303 */

                static {
                    Covode.recordClassIndex(22374);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                    zArr[0] = false;
                    String str = apVar.toString() + ":" + uVar;
                    C19512f.m36457b("imsdk", "LeakMsgRepairModel repairByRange onFailure, cid:" + C19527ab.this.f46349a + ", info:" + str, (Throwable) null);
                    arrayList.add(str);
                    countDownLatch.countDown();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final /* synthetic */ void mo27861a(C19535af afVar) {
                    C19535af afVar2 = afVar;
                    zArr[0] = afVar2.f46376b;
                    String str = apVar + ":" + afVar2;
                    C19512f.m36457b("imsdk", "LeakMsgRepairModel repairByRange onSuccess, cid:" + C19527ab.this.f46349a + ", info:" + str, (Throwable) null);
                    arrayList.add(str);
                    if (afVar2.f46376b) {
                        C19527ab.m36483a(C19527ab.this.f46349a, apVar);
                    } else if (afVar2.f46379e.isValid()) {
                        C19527ab.m36483a(C19527ab.this.f46349a, afVar2.f46379e);
                    }
                    countDownLatch.countDown();
                }
            }).mo31745a(this.f46349a, apVar.start, apVar.end, 1);
        }
        try {
            countDownLatch.await(120000, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            C20002j.m37781b("LeakMsgRepairModel repairByRange await interrupt, cid:" + this.f46349a, e);
        }
        if (!zArr[0]) {
            this.f46350b.f46769e = false;
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairByRange end, cid:" + this.f46349a + ", infoList:" + arrayList, (Throwable) null);
        return new Pair<>(Boolean.valueOf(zArr[0]), arrayList);
    }

    /* renamed from: c */
    private static List<C19590ap> m36487c(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            C19512f.m36457b("imsdk", "LeakMsgRepairModel findLeakRange, leakIndexList:" + list + ", leakRanges:" + arrayList, (Throwable) null);
            return arrayList;
        } else if (list.size() == 1) {
            long longValue = list.get(0).longValue();
            arrayList.add(new C19590ap(longValue, longValue));
            C19512f.m36457b("imsdk", "LeakMsgRepairModel findLeakRange, leakIndexList:" + list + ", leakRanges:" + arrayList, (Throwable) null);
            return arrayList;
        } else {
            long longValue2 = list.get(0).longValue();
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                long longValue3 = list.get(i - 1).longValue();
                long longValue4 = list.get(i).longValue();
                if (longValue4 - longValue3 >= 8) {
                    arrayList.add(new C19590ap(longValue2, longValue3));
                    if (i == list.size() - 1) {
                        arrayList.add(new C19590ap(longValue4, longValue4));
                        break;
                    }
                    longValue2 = longValue4;
                } else if (longValue4 - longValue2 >= 40) {
                    arrayList.add(new C19590ap(longValue2, longValue4));
                    if (i == list.size() - 1) {
                        break;
                    }
                    longValue2 = list.get(i + 1).longValue();
                } else if (i == list.size() - 1) {
                    arrayList.add(new C19590ap(longValue2, longValue4));
                    break;
                }
                i++;
            }
            C19512f.m36457b("imsdk", "LeakMsgRepairModel findLeakRange, leakIndexList:" + list + ", leakRanges:" + arrayList, (Throwable) null);
            return arrayList;
        }
    }

    /* renamed from: d */
    private static List<C19590ap> m36489d(List<C19590ap> list) {
        if (list.size() <= 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        C19590ap apVar = list.get(0);
        int i = 1;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            C19590ap apVar2 = list.get(i);
            if (apVar2.start - apVar.end >= 8) {
                arrayList.add(apVar);
                if (i == list.size() - 1) {
                    arrayList.add(apVar2);
                    break;
                }
                apVar = apVar2;
            } else if (apVar2.end - apVar.start >= 40) {
                arrayList.add(new C19590ap(apVar.start, apVar2.end));
                if (i == list.size() - 1) {
                    break;
                }
                apVar = list.get(i + 1);
            } else if (i == list.size() - 1) {
                arrayList.add(new C19590ap(apVar.start, apVar2.end));
                break;
            }
            i++;
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairModel mergeLeakRange, leakRanges:" + list + ", merged:" + arrayList, (Throwable) null);
        return arrayList;
    }

    /* renamed from: b */
    private void m36486b(long j) {
        int i;
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlderToBase start, cid:" + this.f46349a + ", startIndex:" + j, (Throwable) null);
        C20041s.m37876a();
        long d = C20041s.m37890d();
        this.f46350b.f46751C = j;
        if (j <= d) {
            this.f46350b.f46750B = 1;
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlderToBase end, reach base, cid:" + this.f46349a + ", startIndex:" + j + ", baseIndex:" + d, (Throwable) null);
            return;
        }
        long b = C19777i.m37188b(this.f46349a, j);
        if (b <= 0) {
            this.f46350b.f46750B = 3;
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlderToBase end, no indexV1, cid:" + this.f46349a + ", startIndex:" + j, (Throwable) null);
            return;
        }
        this.f46350b.f46750B = 4;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        new C19791aa(new AbstractC19479b<C19531ac>() {
            /* class com.bytedance.p1399im.core.p1408d.C19527ab.C195292 */

            static {
                Covode.recordClassIndex(22373);
            }

            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final void mo27860a(C19672u uVar) {
                C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlderToBase onFailure, cid:" + C19527ab.this.f46349a + ", error:" + uVar, (Throwable) null);
                zArr[0] = false;
                countDownLatch.countDown();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final /* synthetic */ void mo27861a(C19531ac acVar) {
                boolean z;
                C19531ac acVar2 = acVar;
                C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlderToBase onSuccess, cid:" + C19527ab.this.f46349a + ", result:" + acVar2, (Throwable) null);
                C19527ab.this.f46350b.f46754F = acVar2;
                boolean[] zArr = zArr;
                if (acVar2 == null || !acVar2.f46361a) {
                    z = false;
                } else {
                    z = true;
                }
                zArr[0] = z;
                countDownLatch.countDown();
            }
        }).mo31742a(this.f46349a, b);
        this.f46350b.f46755G = C19532ad.m36496a(this.f46349a);
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            countDownLatch.await(120000, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            C20002j.m37781b("LeakMsgRepairModel repairDBOlderToBase interrupt, cid:" + this.f46349a, e);
        }
        if (!zArr[0]) {
            this.f46350b.f46769e = false;
        }
        C19678z zVar = this.f46350b;
        if (zArr[0]) {
            i = 5;
        } else {
            i = 6;
        }
        zVar.f46750B = i;
        this.f46350b.f46756H = C19532ad.m36496a(this.f46349a);
        this.f46350b.f46753E = SystemClock.uptimeMillis() - uptimeMillis;
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlderToBase end, cid:" + this.f46349a + ", before:" + this.f46350b.f46755G + ", after:" + this.f46350b.f46756H, (Throwable) null);
    }

    /* renamed from: c */
    private void m36488c(long j) {
        int i;
        long f = C19777i.m37201f(this.f46349a);
        C20041s.m37876a();
        long d = C20041s.m37890d();
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBNewer start, cid:" + this.f46349a + ", maxIndex:" + f + ", baseIndex:" + d + ", startIndex:" + j, (Throwable) null);
        this.f46350b.f46758J = j;
        if (f <= d) {
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBNewer end, no bigger index, cid:" + this.f46349a, (Throwable) null);
            this.f46350b.f46757I = 1;
            if (f == d) {
                m36483a(this.f46349a, new C19590ap(f, f));
            }
        } else if (j >= f) {
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBNewer end, reach max, cid:" + this.f46349a, (Throwable) null);
            this.f46350b.f46757I = 2;
        } else {
            List<Long> a = C19777i.m37179a(this.f46349a, new C19590ap(j, f));
            if (C19995d.m37744a(a)) {
                this.f46350b.f46757I = 3;
                C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBNewer error indexList empty, cid:" + this.f46349a, (Throwable) null);
                return;
            }
            this.f46350b.f46761M = C19532ad.m36496a(this.f46349a).copy();
            List<Long> b = m36485b(a);
            if (b.isEmpty()) {
                this.f46350b.f46757I = 7;
                C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBNewer leakIndexList empty, cid:" + this.f46349a, (Throwable) null);
                m36483a(this.f46349a, new C19590ap(j, f));
                return;
            }
            List<C19590ap> c = m36487c(b);
            m36484a(this.f46349a, new C19590ap(j + 1, f - 1), c);
            this.f46350b.f46759K = b;
            this.f46350b.f46760L = new C19591aq(c);
            if (c.isEmpty()) {
                C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBNewer error leakRange empty, cid:" + this.f46349a + ", leakIndexList:" + b, (Throwable) null);
                this.f46350b.f46757I = 4;
                return;
            }
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBNewer start real, cid:" + this.f46349a, (Throwable) null);
            long uptimeMillis = SystemClock.uptimeMillis();
            Pair<Boolean, List<String>> a2 = m36480a(c);
            C19678z zVar = this.f46350b;
            if (((Boolean) a2.first).booleanValue()) {
                i = 5;
            } else {
                i = 6;
            }
            zVar.f46757I = i;
            this.f46350b.f46764P = a2.second.toString();
            this.f46350b.f46763O = SystemClock.uptimeMillis() - uptimeMillis;
            this.f46350b.f46762N = C19532ad.m36496a(this.f46349a).copy();
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBNewer end, cid:" + this.f46349a + ", before:" + this.f46350b.f46761M + ", after:" + this.f46350b.f46762N, (Throwable) null);
        }
    }

    /* renamed from: a */
    private void m36482a(long j) {
        int i;
        C20041s.m37876a();
        long d = C20041s.m37890d();
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlder start, cid:" + this.f46349a + ", startIndex:" + j, (Throwable) null);
        this.f46350b.f46785u = j;
        if (j <= d) {
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlder end, reach base, cid:" + this.f46349a + ", baseIndex:" + d + ", startIndex:" + j, (Throwable) null);
            this.f46350b.f46784t = 1;
            if (j == d) {
                m36483a(this.f46349a, new C19590ap(j, j));
                return;
            }
            return;
        }
        List<Long> a = C19777i.m37179a(this.f46349a, new C19590ap(d, j));
        if (C19995d.m37744a(a)) {
            this.f46350b.f46784t = 2;
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlder error indexList empty, cid:" + this.f46349a, (Throwable) null);
            return;
        }
        this.f46350b.f46788x = C19532ad.m36496a(this.f46349a).copy();
        long longValue = a.get(0).longValue();
        List<Long> b = m36485b(a);
        if (b.isEmpty()) {
            this.f46350b.f46784t = 6;
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlder leakIndexList empty, cid:" + this.f46349a, (Throwable) null);
            m36483a(this.f46349a, new C19590ap(longValue, j));
            m36486b(longValue);
            return;
        }
        List<C19590ap> c = m36487c(b);
        m36484a(this.f46349a, new C19590ap(longValue + 1, j - 1), c);
        this.f46350b.f46786v = b;
        this.f46350b.f46787w = new C19591aq(c);
        if (c.isEmpty()) {
            C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlder error leakRange empty, cid:" + this.f46349a + ", leakIndexList:" + b, (Throwable) null);
            this.f46350b.f46784t = 3;
            m36486b(longValue);
            return;
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlder start real, cid:" + this.f46349a + ", leakRanges:" + c, (Throwable) null);
        long uptimeMillis = SystemClock.uptimeMillis();
        Pair<Boolean, List<String>> a2 = m36480a(c);
        this.f46350b.f46749A = a2.second.toString();
        C19678z zVar = this.f46350b;
        if (((Boolean) a2.first).booleanValue()) {
            i = 4;
        } else {
            i = 5;
        }
        zVar.f46784t = i;
        this.f46350b.f46790z = SystemClock.uptimeMillis() - uptimeMillis;
        m36486b(longValue);
        this.f46350b.f46789y = C19532ad.m36496a(this.f46349a).copy();
        C19512f.m36457b("imsdk", "LeakMsgRepairModel repairDBOlder end, cid:" + this.f46349a + ", before:" + this.f46350b.f46788x + ", after:" + this.f46350b.f46789y, (Throwable) null);
    }

    /* renamed from: a */
    public static synchronized void m36483a(String str, C19590ap apVar) {
        synchronized (C19527ab.class) {
            MethodCollector.m26663i(8276);
            if (TextUtils.isEmpty(str) || apVar == null || !apVar.isValid()) {
                C19512f.m36457b("LeakMsgRepairModel ", "storeContinueRange invalid, cid:" + str + ", range:" + apVar, (Throwable) null);
                MethodCollector.m26664o(8276);
                return;
            }
            C19591aq a = C19532ad.m36496a(str);
            C19591aq copy = a.copy();
            a.merge(apVar.copy());
            C19532ad.m36497a(str, a);
            C19512f.m36457b("imsdk", "LeakMsgRepairModel storeContinueRange, cid:" + str + ", range:" + apVar + ", before:" + copy + ", after:" + a, (Throwable) null);
            MethodCollector.m26664o(8276);
        }
    }
}
