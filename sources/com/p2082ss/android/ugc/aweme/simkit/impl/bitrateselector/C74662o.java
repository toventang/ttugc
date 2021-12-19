package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74603b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.C81967f;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81978f;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.o */
public final class C74662o implements AbstractC74603b {

    /* renamed from: a */
    private static int f167821a = -1;

    /* renamed from: b */
    private static ConcurrentHashMap<String, Float> f167822b = new ConcurrentHashMap<>(50);

    /* renamed from: c */
    private static ConcurrentLinkedQueue<String> f167823c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    private BitrateFilter f167824d = new BitrateFilter();

    C74662o() {
    }

    static {
        Covode.recordClassIndex(87485);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74603b
    /* renamed from: a */
    public final EnumC63056b mo117325a(String str, AbstractC63057c cVar) {
        C81967f a;
        if (cVar == null) {
            return null;
        }
        int a2 = (int) AbstractC74616d.m131036a().mo117294f().mo118391a();
        if (AbstractC74616d.m131036a().mo117290b().getCommonConfig().isUseLastNetworkSpeed()) {
            if (((double) a2) <= 0.0d) {
                a2 = f167821a;
                if (a2 <= 0) {
                    a2 = AbstractC74616d.m131036a().mo117290b().getCommonConfig().getLastNetworkSpeed();
                }
                AbstractC74616d.m131036a().mo117294f().mo118392a((double) a2);
            } else {
                f167821a = a2;
            }
        }
        List<Pair<EnumC63056b, Integer>> a3 = cVar.mo101162a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<EnumC63056b, Integer> pair : a3) {
            C84237e eVar = new C84237e();
            eVar.setBitRate(((Integer) pair.second).intValue());
            arrayList.add(eVar);
            arrayList2.add(pair.first);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        if (arrayList.size() == 1) {
            a = new C81967f();
            a.f183434a = (AbstractC81964c) arrayList.get(0);
        } else {
            AbstractC81981g d = AbstractC74616d.m131036a().mo117292d();
            if (d == null || (a = d.mo61744a(arrayList, new C81978f.C81980b().mo127146a(a2).f183455a)) == null) {
                return null;
            }
        }
        int indexOf = arrayList.indexOf(a.f183434a);
        if (indexOf < 0 || indexOf >= arrayList2.size()) {
            return null;
        }
        EnumC63056b a4 = cVar.mo101161a((EnumC63056b) arrayList2.get(indexOf));
        new StringBuilder("getProperResolution result:").append(a4).append(", orig resolution:").append(arrayList2.get(indexOf)).append(", bitrate:").append(a.f183434a).append(", with speed:").append(a2).append(", sourceId:").append(str);
        return a4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.ss.android.ugc.playerkit.simapicommon.a.i, com.ss.android.ugc.playerkit.simapicommon.a.g] */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.ss.android.ugc.f.a.a.a.a.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03ce, code lost:
        if (r2 != null) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02d4, code lost:
        if (r0 == null) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02d6, code lost:
        r10 = r0.intValue();
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74603b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c mo117326a(com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i r28, boolean r29) {
        /*
        // Method dump skipped, instructions count: 1033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74662o.mo117326a(com.ss.android.ugc.playerkit.simapicommon.a.i, boolean):com.ss.android.ugc.f.a.a.a.a.c");
    }
}
