package com.bytedance.android.livesdk.gifttray;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.gifttray.p555b.C8877a;
import com.bytedance.android.livesdk.gifttray.p557d.C8899b;
import com.bytedance.android.livesdk.gifttray.p557d.C8901d;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPerformanceSettings;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.service.p625c.p634i.C10755b;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveGiftTrayQueueView extends FrameLayout {

    /* renamed from: a */
    final LinkedList<C8871a> f21819a = new LinkedList<>();

    /* renamed from: b */
    final LinkedList<C8871a> f21820b = new LinkedList<>();

    /* renamed from: c */
    final ArrayList<C8873b> f21821c = new ArrayList<>(2);

    /* renamed from: d */
    DataChannel f21822d;

    /* renamed from: e */
    final HashSet<String> f21823e = new HashSet<>();

    /* renamed from: f */
    final HashSet<String> f21824f = new HashSet<>();

    /* renamed from: g */
    final C8867a f21825g = new C8867a(this);

    static {
        Covode.recordClassIndex(9749);
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.LiveGiftTrayQueueView$a */
    public static final class C8867a implements AbstractC8870a {

        /* renamed from: a */
        final /* synthetic */ LiveGiftTrayQueueView f21826a;

        static {
            Covode.recordClassIndex(9750);
        }

        @Override // com.bytedance.android.livesdk.gifttray.AbstractC8870a
        /* renamed from: a */
        public final void mo15114a() {
            this.f21826a.mo15106a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8867a(LiveGiftTrayQueueView liveGiftTrayQueueView) {
            this.f21826a = liveGiftTrayQueueView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ca, code lost:
            if (r6 == null) goto L_0x0057;
         */
        /* JADX WARNING: Removed duplicated region for block: B:135:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
        @Override // com.bytedance.android.livesdk.gifttray.AbstractC8870a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo15115a(int r10) {
            /*
            // Method dump skipped, instructions count: 518
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gifttray.LiveGiftTrayQueueView.C8867a.mo15115a(int):void");
        }
    }

    public final int getQueueSize() {
        return this.f21819a.size() + this.f21820b.size();
    }

    /* renamed from: d */
    private final boolean m17175d() {
        Iterator<C8873b> it = this.f21821c.iterator();
        while (it.hasNext()) {
            if (it.next().f21870h) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo15106a() {
        C8871a b;
        Iterator<C8873b> it = this.f21821c.iterator();
        while (it.hasNext()) {
            C8873b next = it.next();
            if (next.f21863a) {
                if (m17175d()) {
                    b = m17173c();
                } else {
                    b = m17172b();
                }
                if (b != null) {
                    b.f21850o = C11200a.m19851a();
                    mo15109b(b);
                    next.mo15129a(b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int getNotCommonShowAmount() {
        C9904t tVar;
        C9904t tVar2;
        Iterator<C8871a> it = this.f21819a.iterator();
        int i = 0;
        while (it.hasNext()) {
            C9895y yVar = it.next().f21835C;
            if (yVar == null || (tVar2 = yVar.f23945t) == null || tVar2.f24000e != 2) {
                i++;
            }
        }
        Iterator<C8871a> it2 = this.f21820b.iterator();
        while (it2.hasNext()) {
            C9895y yVar2 = it2.next().f21835C;
            if (yVar2 == null || (tVar = yVar2.f23945t) == null || tVar.f24000e != 2) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final int getNotEffectShowAmount() {
        C9904t tVar;
        C9904t tVar2;
        Iterator<C8871a> it = this.f21819a.iterator();
        int i = 0;
        while (it.hasNext()) {
            C9895y yVar = it.next().f21835C;
            if (!(yVar == null || (tVar2 = yVar.f23945t) == null || tVar2.f24000e != 2)) {
                i++;
            }
        }
        Iterator<C8871a> it2 = this.f21820b.iterator();
        while (it2.hasNext()) {
            C9895y yVar2 = it2.next().f21835C;
            if (!(yVar2 == null || (tVar = yVar2.f23945t) == null || tVar.f24000e != 2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    private final C8871a m17172b() {
        C8871a aVar;
        if (this.f21819a.size() != 0) {
            Iterator<C8871a> it = this.f21819a.iterator();
            C89219l.m154716b(it, "");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8871a next = it.next();
                C89219l.m154716b(next, "");
                aVar = next;
                if (!m17174c(aVar)) {
                    it.remove();
                    if (LiveGiftPerformanceSettings.INSTANCE.useNewSelfQueue()) {
                        if (!this.f21824f.contains(aVar.f21836a)) {
                            return aVar;
                        }
                        this.f21824f.remove(aVar.f21836a);
                        return aVar;
                    } else if (aVar != null) {
                        return aVar;
                    }
                }
            }
        }
        aVar = null;
        if (this.f21820b.size() == 0) {
            return aVar;
        }
        Iterator<C8871a> it2 = this.f21820b.iterator();
        C89219l.m154716b(it2, "");
        while (it2.hasNext()) {
            C8871a next2 = it2.next();
            C89219l.m154716b(next2, "");
            C8871a aVar2 = next2;
            if (!m17174c(aVar2)) {
                it2.remove();
                if (LiveGiftPerformanceSettings.INSTANCE.useNewQueue() && this.f21823e.contains(aVar2.f21836a)) {
                    this.f21823e.remove(aVar2.f21836a);
                }
                return aVar2;
            }
        }
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.android.livesdk.gifttray.p554a.C8871a m17173c() {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gifttray.LiveGiftTrayQueueView.m17173c():com.bytedance.android.livesdk.gifttray.a.a");
    }

    public final void setDataCenter(DataChannel dataChannel) {
        this.f21822d = dataChannel;
    }

    /* renamed from: c */
    private final boolean m17174c(C8871a aVar) {
        if (aVar == null) {
            return true;
        }
        Iterator<C8873b> it = this.f21821c.iterator();
        while (it.hasNext()) {
            if (C8899b.m17243a(aVar, it.next().f21867e)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15109b(C8871a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.f21820b.size() >= LiveGiftPerformanceSettings.INSTANCE.getHotQueueSize()) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.f21840e >= LiveGiftPerformanceSettings.INSTANCE.getSelfHotQueueSize()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || aVar.f21833A) {
            z3 = false;
        } else {
            z3 = true;
        }
        aVar.f21841f = z3;
        if (z2 && aVar.f21833A) {
            z4 = true;
        }
        aVar.f21842g = z4;
        aVar.f21844i = this.f21820b.size();
        aVar.f21845j = this.f21819a.size();
        if (C8901d.m17250a(aVar)) {
            aVar.f21846k = aVar.f21843h;
        } else {
            aVar.f21846k = 1;
        }
    }

    /* renamed from: a */
    public final void mo15107a(C8871a aVar) {
        C9904t tVar;
        C9904t tVar2;
        C89219l.m154721d(aVar, "");
        aVar.f21849n = C11200a.m19851a();
        if (aVar.f21833A) {
            if (LiveGiftPerformanceSettings.INSTANCE.useNewSelfQueue()) {
                LinkedList<C8871a> linkedList = this.f21819a;
                HashSet<String> hashSet = this.f21824f;
                C89219l.m154721d(aVar, "");
                C89219l.m154721d(linkedList, "");
                C89219l.m154721d(hashSet, "");
                aVar.f21854s = System.nanoTime();
                String str = aVar.f21836a;
                if (C8899b.m17242a(aVar) || !hashSet.contains(str)) {
                    aVar.f21855t = System.nanoTime();
                    C8877a.m17206a(aVar, linkedList);
                    hashSet.add(str);
                    aVar.f21856u = System.nanoTime();
                } else {
                    C8871a a = C8877a.m17205a(str, linkedList);
                    if (a != null) {
                        aVar.f21840e = a.f21840e;
                        aVar.f21843h = a.f21843h + 1;
                    }
                    aVar.f21855t = System.nanoTime();
                    C8877a.m17206a(aVar, linkedList);
                    C10755b.C10756a.C10757a.f25916a.mo17670c();
                    aVar.f21856u = System.nanoTime();
                }
            } else {
                this.f21819a.addLast(aVar);
            }
        } else if (LiveGiftPerformanceSettings.INSTANCE.useNewQueue()) {
            LinkedList<C8871a> linkedList2 = this.f21820b;
            HashSet<String> hashSet2 = this.f21823e;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(linkedList2, "");
            C89219l.m154721d(hashSet2, "");
            aVar.f21854s = System.nanoTime();
            String str2 = aVar.f21836a;
            if (C8899b.m17242a(aVar) || !hashSet2.contains(str2)) {
                aVar.f21855t = System.nanoTime();
                C8877a.m17206a(aVar, linkedList2);
                hashSet2.add(str2);
                aVar.f21856u = System.nanoTime();
            } else {
                C8871a a2 = C8877a.m17205a(str2, linkedList2);
                if (a2 != null) {
                    aVar.f21840e = a2.f21840e;
                    aVar.f21843h = a2.f21843h + 1;
                }
                aVar.f21855t = System.nanoTime();
                C8877a.m17206a(aVar, linkedList2);
                C9895y yVar = aVar.f21835C;
                if (yVar == null || (tVar2 = yVar.f23945t) == null || tVar2.f24000e != 2) {
                    C10755b.C10756a.C10757a.f25916a.mo17669b();
                } else {
                    C10755b.C10756a.C10757a.f25916a.mo17671d();
                }
                aVar.f21856u = System.nanoTime();
            }
        } else {
            LinkedList<C8871a> linkedList3 = this.f21820b;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(linkedList3, "");
            long nanoTime = System.nanoTime();
            C8871a aVar2 = null;
            Iterator<C8871a> it = linkedList3.iterator();
            C89219l.m154716b(it, "");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8871a next = it.next();
                C89219l.m154716b(next, "");
                C8871a aVar3 = next;
                if (C8899b.m17243a(aVar3, aVar)) {
                    it.remove();
                    aVar2 = aVar3;
                    if (aVar2 != null) {
                        aVar2.f21839d = aVar.f21839d;
                        linkedList3.add(aVar2);
                        C9895y yVar2 = aVar2.f21835C;
                        if (yVar2 == null || (tVar = yVar2.f23945t) == null || tVar.f24000e != 2) {
                            C10755b.C10756a.C10757a.f25916a.mo17669b();
                        } else {
                            C10755b.C10756a.C10757a.f25916a.mo17671d();
                        }
                        C9895y yVar3 = aVar2.f21835C;
                        if (yVar3 != null && yVar3.f23944s) {
                            C10755b.C10756a.C10757a.f25916a.mo17670c();
                        }
                        aVar2.f21843h++;
                        aVar2.f21851p = nanoTime;
                        aVar2.f21852q = System.nanoTime();
                    }
                }
            }
            linkedList3.add(aVar);
            aVar.f21851p = nanoTime;
            aVar.f21852q = System.nanoTime();
            C89070n.m154530a((List) linkedList3, (Comparator) C8877a.C8878a.f21880a);
            if (aVar2 == null) {
                aVar.f21853r = System.nanoTime();
            } else {
                aVar2.f21853r = System.nanoTime();
            }
        }
        mo15106a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveGiftTrayQueueView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(4718);
        MethodCollector.m26664o(4718);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo15108a(C8871a aVar, Integer num) {
        int i;
        if (aVar != null) {
            ArrayList<C8873b> arrayList = this.f21821c;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C8873b bVar = arrayList.get(i);
            C89219l.m154716b(bVar, "");
            if (C8899b.m17243a(aVar, bVar.f21867e)) {
                return true;
            }
        }
        return false;
    }
}
