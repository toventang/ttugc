package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.C26926bq;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.bc */
final /* synthetic */ class C26796bc implements AbstractC26805bl {

    /* renamed from: a */
    private final C26806bm f63536a;

    /* renamed from: b */
    private final Bundle f63537b;

    static {
        Covode.recordClassIndex(32271);
    }

    C26796bc(C26806bm bmVar, Bundle bundle) {
        this.f63536a = bmVar;
        this.f63537b = bundle;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26805bl
    /* renamed from: a */
    public final Object mo44493a() {
        boolean z;
        C26806bm bmVar = this.f63536a;
        Bundle bundle = this.f63537b;
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return true;
        }
        Map<Integer, C26803bj> map = bmVar.f63567e;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return true;
        }
        C26803bj bjVar = bmVar.f63567e.get(valueOf);
        if (bjVar.f63556c.f63551c == 6) {
            z = false;
        } else {
            z = !C26816bw.m53268a(bjVar.f63556c.f63551c, bundle.getInt(C26926bq.m53480a("status", C26806bm.m53242a(bundle))));
        }
        return Boolean.valueOf(z);
    }
}
