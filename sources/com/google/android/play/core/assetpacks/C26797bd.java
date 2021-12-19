package com.google.android.play.core.assetpacks;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.bd */
final /* synthetic */ class C26797bd implements AbstractC26805bl {

    /* renamed from: a */
    private final C26806bm f63538a;

    /* renamed from: b */
    private final String f63539b;

    /* renamed from: c */
    private final int f63540c;

    /* renamed from: d */
    private final long f63541d;

    static {
        Covode.recordClassIndex(32272);
    }

    C26797bd(C26806bm bmVar, String str, int i, long j) {
        this.f63538a = bmVar;
        this.f63539b = str;
        this.f63540c = i;
        this.f63541d = j;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26805bl
    /* renamed from: a */
    public final Object mo44493a() {
        C26806bm bmVar = this.f63538a;
        String str = this.f63539b;
        int i = this.f63540c;
        long j = this.f63541d;
        C26803bj bjVar = (C26803bj) ((Map) bmVar.mo44494a(new C26798be(bmVar, Arrays.asList(str)))).get(str);
        if (bjVar == null || C26816bw.m53270b(bjVar.f63556c.f63551c)) {
            C26806bm.f63563a.mo44596b(C1764a.m5928a("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        bmVar.f63564b.mo44458g(str, i, j);
        bjVar.f63556c.f63551c = 4;
        return null;
    }
}
