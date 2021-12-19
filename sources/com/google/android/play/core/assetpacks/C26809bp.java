package com.google.android.play.core.assetpacks;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.C26909b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.bp */
public final class C26809bp {

    /* renamed from: a */
    private static final C26909b f63576a = new C26909b("ExtractorTaskFinder");

    /* renamed from: b */
    private final C26806bm f63577b;

    /* renamed from: c */
    private final C26769ac f63578c;

    /* renamed from: d */
    private final C26776aj f63579d;

    static {
        Covode.recordClassIndex(32284);
    }

    C26809bp(C26806bm bmVar, C26769ac acVar, C26776aj ajVar) {
        this.f63577b = bmVar;
        this.f63578c = acVar;
        this.f63579d = ajVar;
    }

    /* renamed from: a */
    private final boolean m53249a(C26803bj bjVar, C26804bk bkVar) {
        C26769ac acVar = this.f63578c;
        C26802bi biVar = bjVar.f63556c;
        return new C26833cm(acVar, biVar.f63549a, bjVar.f63555b, biVar.f63550b, bkVar.f63557a).mo44533d();
    }

    /* renamed from: a */
    private static boolean m53250a(C26804bk bkVar) {
        int i = bkVar.f63562f;
        return i == 1 || i == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26808bo mo44498a() {
        int i;
        try {
            this.f63577b.f63568f.lock();
            ArrayList<C26803bj> arrayList = new ArrayList();
            for (C26803bj bjVar : this.f63577b.f63567e.values()) {
                if (C26816bw.m53271c(bjVar.f63556c.f63551c)) {
                    arrayList.add(bjVar);
                }
            }
            if (!arrayList.isEmpty()) {
                for (C26803bj bjVar2 : arrayList) {
                    try {
                        C26769ac acVar = this.f63578c;
                        C26802bi biVar = bjVar2.f63556c;
                        if (acVar.mo44455e(biVar.f63549a, bjVar2.f63555b, biVar.f63550b) == bjVar2.f63556c.f63553e.size()) {
                            f63576a.mo44595a("Found final move task for session %s with pack %s.", Integer.valueOf(bjVar2.f63554a), bjVar2.f63556c.f63549a);
                            int i2 = bjVar2.f63554a;
                            C26802bi biVar2 = bjVar2.f63556c;
                            return new C26823cc(i2, biVar2.f63549a, bjVar2.f63555b, biVar2.f63550b);
                        }
                    } catch (IOException e) {
                        throw new C26787au(C1764a.m5928a("Failed to check number of completed merges for session %s, pack %s", new Object[]{Integer.valueOf(bjVar2.f63554a), bjVar2.f63556c.f63549a}), e, bjVar2.f63554a);
                    }
                }
                for (C26803bj bjVar3 : arrayList) {
                    if (C26816bw.m53271c(bjVar3.f63556c.f63551c)) {
                        for (C26804bk bkVar : bjVar3.f63556c.f63553e) {
                            C26769ac acVar2 = this.f63578c;
                            C26802bi biVar3 = bjVar3.f63556c;
                            if (acVar2.mo44447b(biVar3.f63549a, bjVar3.f63555b, biVar3.f63550b, bkVar.f63557a).exists()) {
                                f63576a.mo44595a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(bjVar3.f63554a), bjVar3.f63556c.f63549a, bkVar.f63557a);
                                int i3 = bjVar3.f63554a;
                                C26802bi biVar4 = bjVar3.f63556c;
                                C26819bz bzVar = new C26819bz(i3, biVar4.f63549a, bjVar3.f63555b, biVar4.f63550b, bkVar.f63557a);
                                this.f63577b.f63568f.unlock();
                                return bzVar;
                            }
                        }
                        continue;
                    }
                }
                for (C26803bj bjVar4 : arrayList) {
                    if (C26816bw.m53271c(bjVar4.f63556c.f63551c)) {
                        for (C26804bk bkVar2 : bjVar4.f63556c.f63553e) {
                            if (m53249a(bjVar4, bkVar2)) {
                                C26769ac acVar3 = this.f63578c;
                                C26802bi biVar5 = bjVar4.f63556c;
                                if (acVar3.mo44443a(biVar5.f63549a, bjVar4.f63555b, biVar5.f63550b, bkVar2.f63557a).exists()) {
                                    f63576a.mo44595a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(bjVar4.f63554a), bjVar4.f63556c.f63549a, bkVar2.f63557a);
                                    int i4 = bjVar4.f63554a;
                                    C26802bi biVar6 = bjVar4.f63556c;
                                    C26836cp cpVar = new C26836cp(i4, biVar6.f63549a, bjVar4.f63555b, biVar6.f63550b, bkVar2.f63557a, bkVar2.f63558b);
                                    this.f63577b.f63568f.unlock();
                                    return cpVar;
                                }
                            }
                        }
                        continue;
                    }
                }
                for (C26803bj bjVar5 : arrayList) {
                    if (C26816bw.m53271c(bjVar5.f63556c.f63551c)) {
                        for (C26804bk bkVar3 : bjVar5.f63556c.f63553e) {
                            if (!m53250a(bkVar3)) {
                                C26769ac acVar4 = this.f63578c;
                                C26802bi biVar7 = bjVar5.f63556c;
                                try {
                                    i = new C26833cm(acVar4, biVar7.f63549a, bjVar5.f63555b, biVar7.f63550b, bkVar3.f63557a).mo44532c();
                                    if (i == -1) {
                                        continue;
                                    } else if (bkVar3.f63560d.get(i).f63548a) {
                                        f63576a.mo44595a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(bkVar3.f63561e), Integer.valueOf(bjVar5.f63554a), bjVar5.f63556c.f63549a, bkVar3.f63557a, Integer.valueOf(i));
                                        InputStream a = this.f63579d.mo44479a(bjVar5.f63554a, bjVar5.f63556c.f63549a, bkVar3.f63557a, i);
                                        int i5 = bjVar5.f63554a;
                                        C26802bi biVar8 = bjVar5.f63556c;
                                        String str = biVar8.f63549a;
                                        int i6 = bjVar5.f63555b;
                                        long j = biVar8.f63550b;
                                        String str2 = bkVar3.f63557a;
                                        int i7 = bkVar3.f63561e;
                                        int size = bkVar3.f63560d.size();
                                        C26802bi biVar9 = bjVar5.f63556c;
                                        C26784ar arVar = new C26784ar(i5, str, i6, j, str2, i7, i, size, biVar9.f63552d, biVar9.f63551c, a);
                                        this.f63577b.f63568f.unlock();
                                        return arVar;
                                    }
                                } catch (IOException e2) {
                                    f63576a.mo44596b("Slice checkpoint corrupt, restarting extraction. %s", e2);
                                    i = 0;
                                }
                            }
                        }
                        continue;
                    }
                }
                for (C26803bj bjVar6 : arrayList) {
                    if (C26816bw.m53271c(bjVar6.f63556c.f63551c)) {
                        for (C26804bk bkVar4 : bjVar6.f63556c.f63553e) {
                            if (m53250a(bkVar4) && bkVar4.f63560d.get(0).f63548a && !m53249a(bjVar6, bkVar4)) {
                                f63576a.mo44595a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(bkVar4.f63562f), Integer.valueOf(bjVar6.f63554a), bjVar6.f63556c.f63549a, bkVar4.f63557a);
                                InputStream a2 = this.f63579d.mo44479a(bjVar6.f63554a, bjVar6.f63556c.f63549a, bkVar4.f63557a, 0);
                                int i8 = bjVar6.f63554a;
                                String str3 = bjVar6.f63556c.f63549a;
                                C26829ci ciVar = new C26829ci(i8, str3, this.f63578c.mo44445b(str3), this.f63578c.mo44449c(bjVar6.f63556c.f63549a), bjVar6.f63555b, bjVar6.f63556c.f63550b, bkVar4.f63562f, bkVar4.f63557a, bkVar4.f63559c, a2);
                                this.f63577b.f63568f.unlock();
                                return ciVar;
                            }
                        }
                        continue;
                    }
                }
                this.f63577b.f63568f.unlock();
                return null;
            }
            this.f63577b.f63568f.unlock();
            return null;
        } finally {
            this.f63577b.f63568f.unlock();
        }
    }
}
