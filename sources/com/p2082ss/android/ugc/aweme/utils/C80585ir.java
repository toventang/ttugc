package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.publish.p3625i.C65675d;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ir */
public final class C80585ir {
    static {
        Covode.recordClassIndex(93858);
    }

    /* renamed from: a */
    public static final C65616g m139719a(C65675d dVar) {
        int i;
        JSONException e;
        C89219l.m154721d(dVar, "");
        int i2 = 0;
        try {
            JSONObject jSONObject = new JSONObject(dVar.f148001h);
            i = jSONObject.getInt("width");
            try {
                i2 = jSONObject.getInt("height");
            } catch (JSONException e2) {
                e = e2;
            }
        } catch (JSONException e3) {
            e = e3;
            i = 0;
            e.printStackTrace();
            C65616g gVar = new C65616g();
            gVar.f147920i = dVar.f147994a;
            gVar.f147916e = dVar.f147995b;
            gVar.f147917f = i;
            gVar.f147918g = i2;
            C89219l.m154716b(gVar, "");
            return gVar;
        }
        C65616g gVar2 = new C65616g();
        gVar2.f147920i = dVar.f147994a;
        gVar2.f147916e = dVar.f147995b;
        gVar2.f147917f = i;
        gVar2.f147918g = i2;
        C89219l.m154716b(gVar2, "");
        return gVar2;
    }

    /* renamed from: a */
    public static final String m139720a(List<? extends User> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(((User) list.get(i)).getSecUid());
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: a */
    public static final void m139721a(C65616g gVar, LinkedHashMap<String, String> linkedHashMap) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(linkedHashMap, "");
        linkedHashMap.put("video_width", new StringBuilder().append(gVar.f147917f).toString());
        linkedHashMap.put("video_height", new StringBuilder().append(gVar.f147918g).toString());
        linkedHashMap.put("video_cover_uri", gVar.f147916e);
        String str = gVar.f147919h;
        if (str != null && str.length() != 0) {
            String str2 = gVar.f147919h;
            C89219l.m154716b(str2, "");
            linkedHashMap.put("cover_text_uri", str2);
        }
    }
}
