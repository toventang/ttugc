package com.p2082ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.effect.i */
public final class C46360i {
    static {
        Covode.recordClassIndex(54937);
    }

    /* renamed from: b */
    public static ArrayList<EffectModel> m89450b() {
        ArrayList<EffectModel> arrayList = new ArrayList<>();
        arrayList.add(m89447a(C63247i.f143610a.getString(R.string.gd8), "0", 2131232504));
        arrayList.add(m89447a(C63247i.f143610a.getString(R.string.gd2), "1", 2131232616));
        arrayList.add(m89447a(C63247i.f143610a.getString(R.string.gd3), "2", 2131232614));
        arrayList.add(m89447a(C63247i.f143610a.getString(R.string.gd4), "3", 2131232615));
        return arrayList;
    }

    /* renamed from: a */
    public static void m89448a() {
        IEditEffectPreferences iEditEffectPreferences = (IEditEffectPreferences) new C14401a((byte) 0).mo23215a(C63247i.f143610a, IEditEffectPreferences.class);
        int h = C63244g.m114602a().mo73295w().mo93779h();
        if (h != iEditEffectPreferences.getResourceVersion(-1)) {
            iEditEffectPreferences.setResourceVersion(h);
            C63244g.m114602a().mo73290r().mo86003a();
            C1731i.m5640b(CallableC46361j.f108058a, C1731i.f5562a);
        }
    }

    /* renamed from: a */
    private static int m89444a(int i) {
        int[] a = C46351d.m89411a();
        return a[i % a.length];
    }

    /* renamed from: a */
    private static int m89445a(List<String> list) {
        if (list == null) {
            return 0;
        }
        for (String str : list) {
            if (str.contains("duration:")) {
                return Integer.parseInt(str.substring(9));
            }
        }
        return 0;
    }

    /* renamed from: a */
    static boolean m89449a(EffectModel effectModel) {
        try {
            if (Integer.parseInt(effectModel.key) < 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static EffectModel m89447a(String str, String str2, int i) {
        EffectModel effectModel = new EffectModel();
        effectModel.name = str;
        effectModel.type = 2;
        effectModel.key = str2;
        effectModel.imagePath = i;
        return effectModel;
    }

    /* renamed from: a */
    public static EffectModel m89446a(int i, Effect effect, String str) {
        EffectModel effectModel = new EffectModel();
        effectModel.name = effect.getName();
        effectModel.hint = effect.getHint();
        effectModel.key = effect.getEffectId();
        effectModel.type = 1;
        effectModel.iconUrl = effect.getIconUrl().getUrlList().get(0);
        effectModel.color = m89444a(i);
        effectModel.resDir = effect.getUnzipPath();
        effectModel.duration = m89445a(effect.getTags());
        effectModel.category = str;
        effectModel.extra = effect.getExtra();
        return effectModel;
    }
}
