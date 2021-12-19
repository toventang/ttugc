package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.C26926bq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.bb */
final /* synthetic */ class C26795bb implements AbstractC26805bl {

    /* renamed from: a */
    private final C26806bm f63534a;

    /* renamed from: b */
    private final Bundle f63535b;

    static {
        Covode.recordClassIndex(32270);
    }

    C26795bb(C26806bm bmVar, Bundle bundle) {
        this.f63534a = bmVar;
        this.f63535b = bundle;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26805bl
    /* renamed from: a */
    public final Object mo44493a() {
        C26804bk bkVar;
        C26806bm bmVar = this.f63534a;
        Bundle bundle = this.f63535b;
        int i = bundle.getInt("session_id");
        boolean z = false;
        if (i == 0) {
            return false;
        }
        Map<Integer, C26803bj> map = bmVar.f63567e;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C26803bj b = bmVar.mo44496b(i);
            int i2 = bundle.getInt(C26926bq.m53480a("status", b.f63556c.f63549a));
            if (C26816bw.m53268a(b.f63556c.f63551c, i2)) {
                C26806bm.f63563a.mo44595a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(b.f63556c.f63551c));
                C26802bi biVar = b.f63556c;
                String str = biVar.f63549a;
                int i3 = biVar.f63551c;
                if (i3 == 4) {
                    bmVar.f63565c.mo44603a().mo44505a(i, str);
                } else if (i3 == 5) {
                    bmVar.f63565c.mo44603a().mo44504a(i);
                } else if (i3 == 6) {
                    bmVar.f63565c.mo44603a().mo44507a(Arrays.asList(str));
                }
            } else {
                b.f63556c.f63551c = i2;
                if (C26816bw.m53270b(i2)) {
                    bmVar.mo44495a(i);
                    bmVar.f63566d.mo44491a(b.f63556c.f63549a);
                } else {
                    for (C26804bk bkVar2 : b.f63556c.f63553e) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C26926bq.m53481a("chunk_intents", b.f63556c.f63549a, bkVar2.f63557a));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (!(parcelableArrayList.get(i4) == null || ((Intent) parcelableArrayList.get(i4)).getData() == null)) {
                                    bkVar2.f63560d.get(i4).f63548a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String a = C26806bm.m53242a(bundle);
            long j = bundle.getLong(C26926bq.m53480a("pack_version", a));
            int i5 = bundle.getInt(C26926bq.m53480a("status", a));
            long j2 = bundle.getLong(C26926bq.m53480a("total_bytes_to_download", a));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(C26926bq.m53480a("slice_ids", a));
            ArrayList arrayList = new ArrayList();
            for (String str2 : C26806bm.m53243a(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C26926bq.m53481a("chunk_intents", a, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : C26806bm.m53243a(parcelableArrayList2)) {
                    if (obj != null) {
                        z = true;
                    }
                    arrayList2.add(new C26801bh(z));
                    z = false;
                }
                String string = bundle.getString(C26926bq.m53481a("uncompressed_hash_sha256", a, str2));
                long j3 = bundle.getLong(C26926bq.m53481a("uncompressed_size", a, str2));
                int i6 = bundle.getInt(C26926bq.m53481a("patch_format", a, str2), 0);
                if (i6 != 0) {
                    bkVar = new C26804bk(str2, string, j3, arrayList2, 0, i6);
                    z = false;
                } else {
                    z = false;
                    bkVar = new C26804bk(str2, string, j3, arrayList2, bundle.getInt(C26926bq.m53481a("compression_format", a, str2), 0), 0);
                }
                arrayList.add(bkVar);
            }
            bmVar.f63567e.put(Integer.valueOf(i), new C26803bj(i, bundle.getInt("app_version_code"), new C26802bi(a, j, i5, j2, arrayList)));
        }
        return true;
    }
}
