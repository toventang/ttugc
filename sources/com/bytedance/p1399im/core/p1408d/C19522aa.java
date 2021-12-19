package com.bytedance.p1399im.core.p1408d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19805ae;
import com.bytedance.p1399im.core.internal.utils.C19995d;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.internal.utils.C20046v;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1415g.C19696b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.bytedance.im.core.d.aa */
public class C19522aa {

    /* renamed from: a */
    public static C19522aa f46335a;

    /* renamed from: b */
    public Set<AbstractC19671t> f46336b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public Set<String> f46337c = new CopyOnWriteArraySet();

    static {
        Covode.recordClassIndex(22366);
    }

    private C19522aa() {
    }

    /* renamed from: a */
    public static C19522aa m36471a() {
        MethodCollector.m26663i(10483);
        if (f46335a == null) {
            synchronized (C19522aa.class) {
                try {
                    if (f46335a == null) {
                        f46335a = new C19522aa();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10483);
                    throw th;
                }
            }
        }
        C19522aa aaVar = f46335a;
        MethodCollector.m26664o(10483);
        return aaVar;
    }

    /* renamed from: a */
    public final boolean mo31186a(String str) {
        if (TextUtils.isEmpty(str) || !this.f46337c.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static long m36470a(String str, long j) {
        C19590ap apVar;
        long j2;
        C20041s.m37876a();
        if (!C20041s.m37889c()) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager getLoadOlderMinIndex no recent mode, cid:".concat(String.valueOf(str)), (Throwable) null);
            return Long.MIN_VALUE;
        }
        C20041s.m37876a();
        long d = C20041s.m37890d();
        if (j <= d) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager getLoadOlderMinIndex reach baseIndexV2, cid:" + str + ", localMinIndex:" + j, (Throwable) null);
            return Long.MIN_VALUE;
        }
        List<C19590ap> list = C19532ad.m36496a(str).copy().ranges;
        if (C19995d.m37744a(list)) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager getLoadOlderMinIndex repairedRanges empty", (Throwable) null);
            return Long.MIN_VALUE;
        }
        Iterator<C19590ap> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                apVar = list.get(list.size() - 1);
                break;
            }
            apVar = it.next();
            if (apVar.start <= j && j <= apVar.end) {
                break;
            }
        }
        long j3 = apVar.start;
        if (j3 > d) {
            j2 = C19777i.m37188b(str, j3);
        } else {
            j2 = Long.MIN_VALUE;
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairManager getLoadOlderMinIndex, cid:" + str + ", localMinIndex:" + j + ", minIndexV2:" + j3 + ", minIndex:" + j2 + ", repairedRanges:" + list, (Throwable) null);
        if (j2 > 0) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: b */
    public static long m36473b(String str, long j) {
        C19590ap apVar;
        long j2;
        C20041s.m37876a();
        if (!C20041s.m37889c()) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager getLoadNewerMaxIndex no recent mode, cid:".concat(String.valueOf(str)), (Throwable) null);
            return Long.MAX_VALUE;
        }
        C20041s.m37876a();
        long d = C20041s.m37890d();
        if (j < d) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager getLoadNewerMaxIndex less than baseIndexV2, cid:" + str + ", localMaxIndex:" + j, (Throwable) null);
            return Long.MAX_VALUE;
        }
        long f = C19777i.m37201f(str);
        if (j >= f) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager getLoadNewerMaxIndex reach maxIndexV2, cid:" + str + ", localMaxIndex:" + j, (Throwable) null);
            return Long.MAX_VALUE;
        }
        List<C19590ap> list = C19532ad.m36496a(str).copy().ranges;
        if (C19995d.m37744a(list)) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager getLoadNewerMaxIndex repairedRanges empty", (Throwable) null);
            return Long.MAX_VALUE;
        }
        Iterator<C19590ap> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                apVar = list.get(0);
                break;
            }
            apVar = it.next();
            if (apVar.start <= j && j <= apVar.end) {
                break;
            }
        }
        long j3 = apVar.end;
        if (j3 < d || j3 >= f) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = C19777i.m37188b(str, j3);
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairManager getLoadNewerMaxIndex, cid:" + str + ", localMaxIndex:" + j + ", maxIndexV2:" + j3 + ", maxIndex:" + j2 + ", repairedRanges:" + list, (Throwable) null);
        if (j2 > 0) {
            return j2;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: a */
    static List<C19538ai> m36472a(String str, List<C19538ai> list, C19677y yVar) {
        if (TextUtils.isEmpty(str) || C19995d.m37744a(list)) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager findPreContinue, cid:" + str + ", list:" + C19996e.m37747a((List) list) + ", invalid", (Throwable) null);
            yVar.f46738b = 0;
            return list;
        }
        yVar.f46739c = C19996e.m37747a((List) list);
        C20041s.m37876a();
        if (!C20041s.m37889c()) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager findPreContinue, cid:" + str + ", no recent mode", (Throwable) null);
            yVar.f46738b = 1;
            return list;
        }
        C20046v.m37931a();
        long f = C19777i.m37201f(str);
        C20041s.m37876a();
        long d = C20041s.m37890d();
        yVar.f46741e = f;
        yVar.f46742f = d;
        if (f <= d) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager findPreContinue, cid:" + str + ", maxIndex:" + f + " smaller than baseIndex:" + d, (Throwable) null);
            yVar.f46738b = 2;
            return list;
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairManager findPreContinue start, cid:" + str + ", list:" + list.size() + ", maxIndex:" + f + ", baseIndex:" + d, (Throwable) null);
        C19590ap apVar = new C19590ap(Long.MAX_VALUE, Long.MIN_VALUE);
        HashSet hashSet = new HashSet();
        boolean z = false;
        for (C19538ai aiVar : list) {
            long indexInConversationV2 = aiVar.getIndexInConversationV2();
            hashSet.add(Long.valueOf(indexInConversationV2));
            if (indexInConversationV2 >= d) {
                apVar.start = Math.min(indexInConversationV2, apVar.start);
                apVar.end = Math.max(indexInConversationV2, apVar.end);
            } else if (!aiVar.isSelf()) {
                z = true;
            }
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairManager findPreContinue step1, cid:" + str + ", indexRange:" + apVar + ", hasOldIndexV2:" + z, (Throwable) null);
        yVar.f46743g = apVar.copy();
        if (!apVar.isValid()) {
            C19512f.m36457b("imsdk", "LeakMsgRepairManager findPreContinue end by range, cid:" + str + ", indexRange:" + apVar, (Throwable) null);
            yVar.f46738b = 3;
            return list;
        }
        C19591aq copy = C19532ad.m36496a(str).copy();
        ArrayList<Long> arrayList = new ArrayList();
        for (long j = apVar.start; j <= apVar.end; j++) {
            if (!hashSet.contains(Long.valueOf(j)) && !arrayList.contains(Long.valueOf(j)) && !copy.check(j)) {
                arrayList.add(Long.valueOf(j));
            }
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairManager findPreContinue step2, cid:" + str + ", leakIndexList:" + arrayList + ", repairedRangeList:" + copy, (Throwable) null);
        if (!arrayList.isEmpty()) {
            C19777i.m37183a(str, arrayList);
        }
        C19590ap apVar2 = !C19995d.m37744a(copy.ranges) ? copy.ranges.get(0) : null;
        if (!arrayList.isEmpty() || (z && (apVar2 == null || apVar2.start > d))) {
            C19590ap apVar3 = new C19590ap(Long.MAX_VALUE, Long.MIN_VALUE);
            for (Long l : arrayList) {
                long longValue = l.longValue();
                apVar3.start = Math.min(longValue, apVar3.start);
                apVar3.end = Math.max(longValue, apVar3.end);
            }
            C19512f.m36457b("imsdk", "LeakMsgRepairManager findPreContinue step3, cid:" + str + ", leakIndexList:" + arrayList + ", leakRange:" + apVar3, (Throwable) null);
            yVar.f46744h = apVar3.copy();
            yVar.f46746j = copy;
            ArrayList arrayList2 = new ArrayList();
            C19590ap apVar4 = new C19590ap(Long.MAX_VALUE, Long.MIN_VALUE);
            boolean z2 = false;
            for (C19538ai aiVar2 : list) {
                long indexInConversationV22 = aiVar2.getIndexInConversationV2();
                if (indexInConversationV22 >= d) {
                    z2 = true;
                }
                if ((indexInConversationV22 < d && z2) || (indexInConversationV22 <= apVar3.end && (!aiVar2.isSelf() || indexInConversationV22 >= d))) {
                    break;
                }
                arrayList2.add(aiVar2);
                if (indexInConversationV22 >= d) {
                    apVar4.start = Math.min(apVar4.start, indexInConversationV22);
                    apVar4.end = Math.max(apVar4.end, indexInConversationV22);
                }
            }
            C19527ab.m36483a(str, apVar4);
            yVar.f46738b = 5;
            yVar.f46737a = false;
            yVar.f46747k = C19532ad.m36496a(str).copy();
            C19512f.m36457b("imsdk", "LeakMsgRepairManager findPreContinue end, cid:" + str + ", indexRange:" + apVar + ", leakRange:" + apVar3 + ", continueRange:" + apVar4 + ", beforeRepaired:" + copy + ", afterRepaired:" + yVar.f46747k + ", list:" + list.size() + ", result:" + arrayList2.size(), (Throwable) null);
            return arrayList2;
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairManager findPreContinue end by leakIndexList empty, cid:".concat(String.valueOf(str)), (Throwable) null);
        C19527ab.m36483a(str, apVar);
        yVar.f46738b = 4;
        return list;
    }

    /* renamed from: a */
    public final synchronized List<C19538ai> mo31185a(String str, long j, C19538ai aiVar, List<C19538ai> list) {
        Long l;
        C19590ap apVar;
        MethodCollector.m26663i(10648);
        if (!TextUtils.isEmpty(str) && !C19995d.m37744a(list)) {
            if (aiVar != null) {
                C20046v.m37931a();
                C20041s.m37876a();
                if (!C20041s.m37889c()) {
                    C19512f.m36457b("imsdk", "LeakMsgRepairManager onModelGetMsg no recent mode, cid:".concat(String.valueOf(str)), (Throwable) null);
                    MethodCollector.m26664o(10648);
                    return list;
                }
                C19512f.m36457b("imsdk", "LeakMsgRepairManager onModelGetMsg start, cid:" + str + ", list:" + list.size() + ", localMaxIndex:" + j + ", lastMessage:" + aiVar.getIndexInConversationV2(), (Throwable) null);
                C20041s.m37876a();
                long d = C20041s.m37890d();
                C19590ap apVar2 = new C19590ap(Long.MAX_VALUE, Long.MIN_VALUE);
                for (C19538ai aiVar2 : list) {
                    long indexInConversationV2 = aiVar2.getIndexInConversationV2();
                    if (indexInConversationV2 >= d) {
                        apVar2.start = Math.min(indexInConversationV2, apVar2.start);
                        apVar2.end = Math.max(indexInConversationV2, apVar2.end);
                    }
                }
                C19527ab.m36483a(str, apVar2);
                if (apVar2.isValid()) {
                    long j2 = j + 1;
                    if (apVar2.start > j2) {
                        C19590ap apVar3 = new C19590ap(j2, apVar2.start - 1);
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        final boolean[] zArr = new boolean[1];
                        final C19535af[] afVarArr = new C19535af[1];
                        new C19805ae(new AbstractC19479b<C19535af>() {
                            /* class com.bytedance.p1399im.core.p1408d.C19522aa.C195253 */

                            static {
                                Covode.recordClassIndex(22369);
                            }

                            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                            /* renamed from: a */
                            public final void mo27860a(C19672u uVar) {
                                C19512f.m36457b("imsdk", "LeakMsgRepairManager onModelGetMsg onFailure, error:".concat(String.valueOf(uVar)), (Throwable) null);
                                zArr[0] = false;
                                C19535af afVar = new C19535af();
                                afVar.f46381g = uVar;
                                afVarArr[0] = afVar;
                                countDownLatch.countDown();
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                            /* renamed from: a */
                            public final /* synthetic */ void mo27861a(C19535af afVar) {
                                boolean z;
                                C19535af afVar2 = afVar;
                                C19512f.m36457b("imsdk", "LeakMsgRepairManager onModelGetMsg onSuccess, result:".concat(String.valueOf(afVar2)), (Throwable) null);
                                boolean[] zArr = zArr;
                                if (afVar2 == null || !afVar2.f46376b) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                zArr[0] = z;
                                afVarArr[0] = afVar2;
                                countDownLatch.countDown();
                            }
                        }).mo31745a(str, apVar3.start, apVar3.end, 2);
                        try {
                            countDownLatch.await();
                        } catch (Exception e) {
                            C20002j.m37781b("LeakMsgRepairManager onModelGetMsg interrupt", e);
                        }
                        if (!(afVarArr[0] == null || (apVar = afVarArr[0].f46379e) == null || !apVar.isValid())) {
                            C19527ab.m36483a(str, apVar);
                        }
                        if (!zArr[0]) {
                            C19512f.m36457b("imsdk", "LeakMsgRepairManager onModelGetMsg end error, cid:".concat(String.valueOf(str)), (Throwable) null);
                            C19696b.m36822a(str, false, list.size(), 0);
                            List<C19538ai> emptyList = Collections.emptyList();
                            MethodCollector.m26664o(10648);
                            return emptyList;
                        }
                        List<C19538ai> a = C19777i.m37176a(str, aiVar.getIndex(), Long.MAX_VALUE, 50);
                        Collections.reverse(a);
                        C19696b.m36822a(str, true, list.size(), C19996e.m37747a((List) a));
                        C19512f.m36457b("imsdk", "LeakMsgRepairManager onModelGetMsg end, cid:" + str + ", list:" + list.size() + ", localIndex:" + j + ", indexRange:" + apVar2 + ", result:" + C19996e.m37747a((List) a), (Throwable) null);
                        MethodCollector.m26664o(10648);
                        return a;
                    }
                }
                C19512f.m36457b("imsdk", "LeakMsgRepairManager onModelGetMsg end continue, cid:" + str + ", list:" + list.size() + ", localIndex:" + j + ", indexRange:" + apVar2, (Throwable) null);
                MethodCollector.m26664o(10648);
                return list;
            }
        }
        StringBuilder append = new StringBuilder("LeakMsgRepairManager onModelGetMsg invalid, cid:").append(str).append(", list:").append(C19996e.m37747a((List) list)).append(", lastMessage:");
        if (aiVar != null) {
            l = Long.valueOf(aiVar.getIndexInConversationV2());
        } else {
            l = null;
        }
        C19512f.m36457b("imsdk", append.append(l).toString(), (Throwable) null);
        MethodCollector.m26664o(10648);
        return list;
    }
}
