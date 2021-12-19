package com.p2082ss.android.ugc.aweme.tools.p4098c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.c.a */
public final class C78100a {
    static {
        Covode.recordClassIndex(91198);
    }

    /* renamed from: a */
    public static final JSONObject m136518a(Map<String, String> map) {
        C89219l.m154721d(map, "");
        C69840ar arVar = new C69840ar();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arVar.mo110189a(entry.getKey(), entry.getValue());
        }
        JSONObject a = arVar.mo110191a();
        C89219l.m154716b(a, "");
        return a;
    }
}
