package com.p2082ss.android.ugc.aweme.p4171u;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16073e;
import com.bytedance.ies.abmock.C16075f;
import com.bytedance.ies.abmock.ConfigItem;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.u.a */
public final class C79488a {

    /* renamed from: a */
    public static final C79488a f178427a = new C79488a();

    private C79488a() {
    }

    static {
        Covode.recordClassIndex(92691);
    }

    /* renamed from: a */
    public static String m138200a() {
        Map<String, ConfigItem> map = C16075f.f38715a;
        C89219l.m154716b(map, "");
        C28022o oVar = new C28022o();
        if (map != null) {
            for (Map.Entry<String, ConfigItem> entry : map.entrySet()) {
                String key = entry.getKey();
                C16073e.m29864a();
                Object b = C16073e.m29869b(entry.getKey(), false);
                if (b instanceof Number) {
                    oVar.mo46800a(key, (Number) b);
                } else if (b instanceof Boolean) {
                    oVar.mo46798a(key, (Boolean) b);
                } else if (b instanceof String) {
                    oVar.mo46801a(key, (String) b);
                } else if (b instanceof Character) {
                    oVar.mo46799a(key, (Character) b);
                } else if (b instanceof AbstractC28019l) {
                    oVar.mo46797a(key, (AbstractC28019l) b);
                } else if (b == null) {
                    oVar.mo46797a(key, (AbstractC28019l) null);
                }
            }
        }
        String oVar2 = oVar.toString();
        C89219l.m154716b(oVar2, "");
        return oVar2;
    }
}
