package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.eu */
public final class C80409eu {
    static {
        Covode.recordClassIndex(93677);
    }

    /* renamed from: a */
    public static final C33744d m139390a(C33744d dVar, User user) {
        String socialInfo;
        Set<Map.Entry<String, AbstractC28019l>> entrySet;
        C89219l.m154721d(dVar, "");
        if (!(user == null || (socialInfo = user.getSocialInfo()) == null)) {
            try {
                C28022o oVar = (C28022o) C80342dg.m139301a(socialInfo, C28022o.class);
                if (!(oVar == null || (entrySet = oVar.f65804a.entrySet()) == null)) {
                    for (T t : entrySet) {
                        Object value = t.getValue();
                        C89219l.m154716b(value, "");
                        dVar.mo59983a("social_info_" + ((String) t.getKey()), ((AbstractC28019l) value).mo46689c());
                    }
                }
            } catch (C28027t unused) {
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public static final <T extends AbstractC59233c<?>> T m139391a(T t, User user) {
        String socialInfo;
        Set<Map.Entry<String, AbstractC28019l>> entrySet;
        C89219l.m154721d(t, "");
        if (!(user == null || (socialInfo = user.getSocialInfo()) == null)) {
            try {
                C28022o oVar = (C28022o) C80342dg.m139301a(socialInfo, C28022o.class);
                if (!(oVar == null || (entrySet = oVar.f65804a.entrySet()) == null)) {
                    for (T t2 : entrySet) {
                        Object value = t2.getValue();
                        C89219l.m154716b(value, "");
                        t.mo96786a("social_info_" + ((String) t2.getKey()), ((AbstractC28019l) value).mo46689c());
                    }
                }
            } catch (C28027t unused) {
            }
        }
        return t;
    }

    /* renamed from: a */
    public static final JSONObject m139392a(JSONObject jSONObject, String str) {
        Set<Map.Entry<String, AbstractC28019l>> entrySet;
        C89219l.m154721d(jSONObject, "");
        if (str != null) {
            try {
                C28022o oVar = (C28022o) C80342dg.m139301a(str, C28022o.class);
                if (!(oVar == null || (entrySet = oVar.f65804a.entrySet()) == null)) {
                    for (T t : entrySet) {
                        Object value = t.getValue();
                        C89219l.m154716b(value, "");
                        jSONObject.put("social_info_" + ((String) t.getKey()), ((AbstractC28019l) value).mo46689c());
                    }
                }
            } catch (C28027t unused) {
            }
        }
        return jSONObject;
    }
}
