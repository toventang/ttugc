package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3176g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.g.a */
public final class C55126a {
    static {
        Covode.recordClassIndex(64854);
    }

    /* renamed from: a */
    private static Map<String, String> m100846a(String str) {
        C19638h a;
        if (!TextUtils.isEmpty(str) && (a = AbstractC17420a.C17421a.m32276a().mo27720a(str)) != null) {
            return a.getLocalExt();
        }
        return null;
    }

    /* renamed from: a */
    private static Integer m100845a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = map.get("commercialize.personal_info_count");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m100849a(List<C19538ai> list) {
        BaseContent content;
        if (!(list == null || list.isEmpty())) {
            for (C19538ai aiVar : list) {
                if (aiVar != null && !aiVar.isSelf() && (content = EnumC53772b.content(aiVar)) != null && content.getType() == 770) {
                    Map a = m100846a(aiVar.getConversationId());
                    if (a == null) {
                        a = new HashMap();
                    }
                    a.put("commercialize.personal_info_count", "3");
                    m100848a(aiVar.getConversationId(), a);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m100848a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC17427b.C17428a.m32308a(str).mo27747b(map, (AbstractC19479b<C19638h>) null);
        }
    }

    /* renamed from: a */
    public static void m100847a(String str, BaseContent baseContent) {
        Map<String, String> a;
        Integer a2;
        if (baseContent != null && (a2 = m100845a((a = m100846a(str)))) != null) {
            if (a2.intValue() > 0) {
                baseContent.setType(771);
            }
            int intValue = a2.intValue() - 1;
            if (intValue > 0) {
                a.put("commercialize.personal_info_count", Integer.toString(intValue));
            } else {
                a.remove("commercialize.personal_info_count");
            }
            m100848a(str, a);
        }
    }
}
