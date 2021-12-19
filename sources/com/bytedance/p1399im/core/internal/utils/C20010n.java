package com.bytedance.p1399im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.MessageDirection;
import com.bytedance.p1399im.core.proto.MessageType;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.utils.n */
public final class C20010n {
    static {
        Covode.recordClassIndex(22855);
    }

    /* renamed from: com.bytedance.im.core.internal.utils.n$1 */
    static /* synthetic */ class C200111 {

        /* renamed from: a */
        static final /* synthetic */ int[] f47552a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.utils.C20010n.C200111.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static MessageDirection m37804a(int i) {
        if (i == 1) {
            return MessageDirection.OLDER;
        }
        if (i != 2) {
            return null;
        }
        return MessageDirection.NEWER;
    }

    /* renamed from: d */
    public static long m37810d(C19538ai aiVar) {
        if (aiVar == null) {
            return 0;
        }
        return aiVar.getIndex();
    }

    /* renamed from: e */
    public static long m37811e(C19538ai aiVar) {
        if (aiVar == null) {
            return 0;
        }
        return aiVar.getIndexInConversationV2();
    }

    /* renamed from: b */
    public static long m37808b(C19538ai aiVar) {
        if (aiVar == null) {
            return -1;
        }
        Map<String, String> ext = aiVar.getExt();
        if (ext == null || !ext.containsKey("s:do_not_pop_conversation") || !"true".equals(ext.get("s:do_not_pop_conversation"))) {
            return aiVar.getCreatedAt();
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m37809c(C19538ai aiVar) {
        if (aiVar == null) {
            return false;
        }
        Map<String, String> localExt = aiVar.getLocalExt();
        if (localExt == null || !localExt.containsKey("s:send_response_check_code")) {
            return true;
        }
        return TextUtils.equals("0", localExt.get("s:send_response_check_code"));
    }

    /* renamed from: a */
    public static boolean m37806a(C19538ai aiVar) {
        boolean z;
        if (aiVar == null || aiVar.getSvrStatus() != 0) {
            C19512f.m36457b("imsdk", "MessageUtils isMsgUnread:false, svrStatus not enable", (Throwable) null);
            return false;
        } else if ("true".equals(aiVar.getExtValue("s:do_not_increase_unread"))) {
            C19512f.m36457b("imsdk", "MessageUtils isMsgUnread:false, has ext s:do_not_increase_unread", (Throwable) null);
            return false;
        } else {
            if (aiVar.getIndex() > C19749c.m37014b(aiVar.getConversationId())) {
                z = true;
            } else {
                z = false;
            }
            boolean c = C19640j.m36671a().mo31601c(aiVar.getConversationId());
            C19483d.m36365a();
            if (c || aiVar.isSelf() || !z) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m37807a(MessageBody messageBody) {
        if (!(messageBody == null || messageBody.message_type == null)) {
            MessageType fromValue = MessageType.fromValue(messageBody.message_type.intValue());
            if (fromValue != null) {
                switch (C200111.f47552a[fromValue.ordinal()]) {
                    case 1:
                        return false;
                    case 2:
                    case 3:
                    case 4:
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        return true;
                }
            }
            if (messageBody.message_type.intValue() < MessageType.MESSAGE_TYPE_COMMAND.getValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static List<C19538ai> m37805a(String str, List<C19538ai> list) {
        if (list == null || list.isEmpty() || C19640j.m36671a().mo31601c(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C19538ai aiVar : list) {
            if (!aiVar.isSelf()) {
                arrayList.add(aiVar);
            }
        }
        return arrayList;
    }
}
