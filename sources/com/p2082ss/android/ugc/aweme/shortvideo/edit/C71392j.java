package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.j */
public final class C71392j {

    /* renamed from: a */
    public static final C71392j f159979a = new C71392j();

    private C71392j() {
    }

    static {
        Covode.recordClassIndex(83920);
    }

    /* renamed from: b */
    private static SparseArray<Integer> m126091b() {
        SparseArray<Integer> sparseArray = new SparseArray<>(6);
        int i = 0;
        for (Object obj : C89361p.m154921c("30,40,50,60,69,100", new String[]{","})) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            sparseArray.put(i, Integer.valueOf(Integer.parseInt((String) obj)));
            i = i2;
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static SparseArray<Integer> m126090a() {
        SparseArray<Integer> sparseArray = new SparseArray<>(6);
        try {
            String a = SettingsManager.m29616a().mo25398a("edit_page_process_bar_velocity_factor", "30,40,50,60,69,100");
            C89219l.m154716b(a, "");
            int i = 0;
            for (Object obj : C89361p.m154921c(a, new String[]{","})) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                sparseArray.put(i, Integer.valueOf(Integer.parseInt((String) obj)));
                i = i2;
            }
        } catch (Exception unused) {
            sparseArray = m126091b();
        }
        if (sparseArray.size() != 6) {
            return m126091b();
        }
        return sparseArray;
    }
}
