package com.bytedance.p1399im.core.p1417i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.proto.StrangerConversation;
import java.util.Map;

/* renamed from: com.bytedance.im.core.i.g */
public final class C19737g {
    static {
        Covode.recordClassIndex(22581);
    }

    /* renamed from: a */
    public static void m36927a(C19638h hVar) {
        int mode;
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId()) && hVar.getConversationType() == C19489e.AbstractC19490a.f46180a && hVar.getCoreInfo() != null && (mode = hVar.getCoreInfo().getMode()) >= 0) {
            hVar.setStranger(m36930a(hVar.getConversationId(), mode));
        }
    }

    /* renamed from: a */
    public static void m36928a(C19638h hVar, C19538ai aiVar) {
        if (hVar != null && aiVar != null) {
            hVar.setLastMessage(aiVar);
            hVar.setLastMessageIndex(aiVar.getIndex());
            hVar.setUpdatedTime(aiVar.getCreatedAt());
        }
    }

    /* renamed from: a */
    public static void m36929a(C19638h hVar, StrangerConversation strangerConversation) {
        Map<String, String> localExt = hVar.getLocalExt();
        for (Map.Entry<String, String> entry : strangerConversation.ext.entrySet()) {
            localExt.put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    private static boolean m36930a(String str, int i) {
        String[] split = str.split(":");
        if (split.length != 4) {
            return false;
        }
        long a = C19996e.m37748a(split[2], 0L);
        long a2 = C19996e.m37748a(split[3], 0L);
        long c = C19996e.m37759c();
        if (i == 1) {
            if (c == a2) {
                return true;
            }
            return false;
        } else if (i == 2) {
            if (c == a) {
                return true;
            }
            return false;
        } else if (i != 3) {
            return false;
        } else {
            if (c == a2 || c == a) {
                return true;
            }
            return false;
        }
    }
}
