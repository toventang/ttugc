package com.bytedance.p1399im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.p1555c.HandlerC21534a;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.Request;
import com.bytedance.p1399im.core.proto.Response;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import java.util.Iterator;

/* renamed from: com.bytedance.im.core.internal.utils.r */
public final class C20040r {
    static {
        Covode.recordClassIndex(22885);
    }

    /* renamed from: a */
    private static String m37870a(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("\t");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m37872a(C28022o oVar) {
        C28022o f;
        try {
            if (oVar.mo46802b("reference_info") && (f = oVar.mo46807f("reference_info")) != null) {
                f.mo46801a("hint", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private static String m37874b(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i > 0 && '\n' == sb.charAt(sb.length() - 1)) {
                sb.append(m37870a(i));
            }
            if (charAt != ',') {
                if (charAt != '[') {
                    if (charAt != ']') {
                        if (charAt != '{') {
                            if (charAt != '}') {
                                sb.append(charAt);
                            }
                        }
                    }
                    sb.append("\n");
                    i--;
                    sb.append(m37870a(i));
                    sb.append(charAt);
                }
                sb.append(charAt).append("\n");
                i++;
            } else {
                sb.append(charAt).append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m37871a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                i = i2 + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'u') {
                    int i3 = 0;
                    int i4 = 0;
                    do {
                        int i5 = i + 1;
                        char charAt3 = str.charAt(i);
                        switch (charAt3) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                i4 = ((i4 << 4) + charAt3) - 48;
                                break;
                            default:
                                switch (charAt3) {
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                        i4 = (((i4 << 4) + 10) + charAt3) - 65;
                                        break;
                                    default:
                                        switch (charAt3) {
                                            default:
                                                throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
                                            case 'a':
                                            case 'b':
                                            case 'c':
                                            case HandlerC21534a.f51116a:
                                            case 'e':
                                            case 'f':
                                                i4 = (((i4 << 4) + 10) + charAt3) - 97;
                                                break;
                                        }
                                }
                        }
                        i3++;
                        i = i5;
                    } while (i3 < 4);
                    sb.append((char) i4);
                } else {
                    if (charAt2 == 't') {
                        charAt2 = '\t';
                    } else if (charAt2 == 'r') {
                        charAt2 = '\r';
                    } else if (charAt2 == 'n') {
                        charAt2 = '\n';
                    } else if (charAt2 == 'f') {
                        charAt2 = '\f';
                    }
                    sb.append(charAt2);
                }
            } else {
                sb.append(charAt);
                i = i2;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m37873a(Integer num, String str, Object obj) {
        C28022o oVar;
        C27919i e;
        C28022o f;
        try {
            if (!C19996e.m37753a(num)) {
                String str2 = "";
                String str3 = str2;
                if (obj != null) {
                    String b = C19999h.f47538a.mo46674b(obj);
                    C28022o oVar2 = b;
                    if (C19483d.m36365a().mo31141b().f46264d) {
                        if (obj instanceof Request) {
                            Request request = (Request) obj;
                            C28022o oVar3 = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                            oVar3.mo46795a("channel");
                            oVar3.mo46795a("device_id");
                            oVar3.mo46795a("device_platform");
                            oVar3.mo46795a("device_type");
                            oVar3.mo46795a("os_version");
                            oVar3.mo46795a("token");
                            C28022o f2 = oVar3.mo46807f("token_info");
                            if (f2 != null) {
                                f2.mo46795a("app_id");
                            }
                            oVar2 = oVar3;
                            if (request.body != null) {
                                if (request.body.send_message_body == null || TextUtils.isEmpty(request.body.send_message_body.content)) {
                                    if (request.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()) != null) {
                                        C28022o f3 = oVar3.mo46807f("body").mo46807f("extensionMsgs");
                                        if (f3.mo46802b("BroadcastSendMessageRequestBody")) {
                                            C28022o f4 = f3.mo46807f("BroadcastSendMessageRequestBody");
                                            if (f4.mo46802b("content")) {
                                                f4.mo46801a("content", str2);
                                                oVar2 = oVar3;
                                            }
                                        }
                                    }
                                    oVar2 = oVar3;
                                    if (request.body.send_message_p2p_body != null) {
                                        oVar2 = oVar3;
                                        if (!TextUtils.isEmpty(request.body.send_message_p2p_body.content)) {
                                            oVar3.mo46807f("body").mo46807f("send_message_p2p_body").mo46801a("content", str2);
                                            oVar2 = oVar3;
                                        }
                                    }
                                } else {
                                    C28022o f5 = oVar3.mo46807f("body").mo46807f("send_message_body");
                                    f5.mo46801a("content", str2);
                                    if (!(request.body.send_message_body.ref_msg_info == null || TextUtils.isEmpty(request.body.send_message_body.ref_msg_info.hint) || (f = f5.mo46807f("ref_msg_info")) == null)) {
                                        f.mo46801a("hint", str2);
                                    }
                                    f5.mo46801a("content", str2);
                                    oVar2 = oVar3;
                                }
                            }
                        } else {
                            if (obj instanceof Response) {
                                Response response = (Response) obj;
                                if (response.body != null) {
                                    if (response.body.has_new_message_notify != null && response.body.has_new_message_notify.message != null && !TextUtils.isEmpty(response.body.has_new_message_notify.message.content)) {
                                        oVar = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                                        C28022o f6 = oVar.mo46807f("body").mo46807f("has_new_message_notify").mo46807f("message");
                                        f6.mo46801a("content", str2);
                                        m37872a(f6);
                                    } else if (response.body.messages_per_user_body != null && response.body.messages_per_user_body.messages != null && !response.body.messages_per_user_body.messages.isEmpty()) {
                                        oVar = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                                        Iterator<AbstractC28019l> it = oVar.mo46807f("body").mo46807f("messages_per_user_body").mo46805e("messages").iterator();
                                        while (it.hasNext()) {
                                            C28022o oVar4 = (C28022o) it.next();
                                            oVar4.mo46801a("content", str2);
                                            m37872a(oVar4);
                                        }
                                    } else if (response.body.messages_per_user_init_v2_body != null && response.body.messages_per_user_init_v2_body.messages != null && !response.body.messages_per_user_init_v2_body.messages.isEmpty()) {
                                        oVar = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                                        Iterator<AbstractC28019l> it2 = oVar.mo46807f("body").mo46807f("messages_per_user_init_v2_body").mo46805e("messages").iterator();
                                        while (it2.hasNext()) {
                                            C28022o oVar5 = (C28022o) it2.next();
                                            oVar5.mo46801a("content", str2);
                                            m37872a(oVar5);
                                        }
                                    } else if (response.body.messages_in_conversation_body == null || response.body.messages_in_conversation_body.messages == null || response.body.messages_in_conversation_body.messages.isEmpty()) {
                                        if (response.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()) != null) {
                                            C28022o oVar6 = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                                            C28022o f7 = oVar6.mo46807f("body").mo46807f("extensionMsgs");
                                            if (f7.mo46802b("BroadcastSendMessageResponseBody")) {
                                                C28022o f8 = f7.mo46807f("BroadcastSendMessageResponseBody");
                                                if (f8.mo46802b("messages") && (e = f8.mo46805e("messages")) != null) {
                                                    Iterator<AbstractC28019l> it3 = e.iterator();
                                                    while (it3.hasNext()) {
                                                        C28022o oVar7 = (C28022o) it3.next();
                                                        if (oVar7.mo46802b("content")) {
                                                            oVar7.mo46801a("content", str2);
                                                        }
                                                        m37872a(oVar7);
                                                    }
                                                    str3 = oVar6;
                                                }
                                            }
                                        }
                                        if (response.body.get_stranger_messages_body != null && response.body.get_stranger_messages_body.messages != null && !response.body.get_stranger_messages_body.messages.isEmpty()) {
                                            oVar = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                                            Iterator<AbstractC28019l> it4 = oVar.mo46807f("body").mo46807f("get_stranger_messages_body").mo46805e("messages").iterator();
                                            while (it4.hasNext()) {
                                                C28022o oVar8 = (C28022o) it4.next();
                                                oVar8.mo46801a("content", str2);
                                                m37872a(oVar8);
                                            }
                                        } else if (response.body.get_stranger_conversation_body != null && response.body.get_stranger_conversation_body.conversation_list != null && !response.body.get_stranger_conversation_body.conversation_list.isEmpty()) {
                                            oVar = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                                            Iterator<AbstractC28019l> it5 = oVar.mo46807f("body").mo46807f("get_stranger_conversation_body").mo46805e("conversation_list").iterator();
                                            while (it5.hasNext()) {
                                                C28022o f9 = ((C28022o) it5.next()).mo46807f("last_message");
                                                f9.mo46801a("content", str2);
                                                m37872a(f9);
                                            }
                                        } else if (response.body.get_recent_message_body != null && response.body.get_recent_message_body.messages != null && !response.body.get_recent_message_body.messages.isEmpty()) {
                                            oVar = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                                            Iterator<AbstractC28019l> it6 = oVar.mo46807f("body").mo46807f("get_recent_message_body").mo46805e("messages").iterator();
                                            while (it6.hasNext()) {
                                                C27919i e2 = ((C28022o) it6.next()).mo46805e("messages");
                                                if (e2 != null) {
                                                    Iterator<AbstractC28019l> it7 = e2.iterator();
                                                    while (it7.hasNext()) {
                                                        C28022o oVar9 = (C28022o) it7.next();
                                                        if (oVar9 != null) {
                                                            oVar9.mo46801a("content", str2);
                                                            m37872a(oVar9);
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (response.body.get_message_info_by_index_v2_range_body != null && response.body.get_message_info_by_index_v2_range_body.infos != null && !response.body.get_message_info_by_index_v2_range_body.infos.isEmpty()) {
                                            oVar = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                                            Iterator<AbstractC28019l> it8 = oVar.mo46807f("body").mo46807f("get_message_info_by_index_v2_range_body").mo46805e("infos").iterator();
                                            while (it8.hasNext()) {
                                                C28022o f10 = ((C28022o) it8.next()).mo46807f("body");
                                                if (f10 != null) {
                                                    f10.mo46801a("content", str2);
                                                    m37872a(f10);
                                                }
                                            }
                                        } else if (!(response.body.get_message_by_id_body == null || response.body.get_message_by_id_body.msg_info == null || response.body.get_message_by_id_body.msg_info.body == null)) {
                                            oVar = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                                            C28022o f11 = oVar.mo46807f("body").mo46807f("get_message_by_id_body").mo46807f("msg_info").mo46807f("body");
                                            f11.mo46801a("content", str2);
                                            m37872a(f11);
                                        }
                                    } else {
                                        oVar = (C28022o) C19999h.f47538a.mo46670a(b, C28022o.class);
                                        Iterator<AbstractC28019l> it9 = oVar.mo46807f("body").mo46807f("messages_in_conversation_body").mo46805e("messages").iterator();
                                        while (it9.hasNext()) {
                                            C28022o oVar10 = (C28022o) it9.next();
                                            oVar10.mo46801a("content", str2);
                                            m37872a(oVar10);
                                        }
                                    }
                                    str3 = oVar;
                                }
                            }
                            str3 = obj;
                        }
                    }
                    str3 = oVar2;
                }
                if (C19510e.f46308a != null) {
                    C19510e.f46308a.mo27979a(str3);
                }
                if (!TextUtils.isEmpty(str)) {
                    C19512f.m36457b("imsdk", "PBLogUtils ".concat(String.valueOf(str)), (Throwable) null);
                }
                if (C19483d.m36365a().mo31141b().f46262b == 0) {
                    C19512f.m36457b("imsdk", "PBLogUtils " + obj.getClass().getSimpleName() + " : " + str3.toString(), (Throwable) null);
                    return;
                }
                String b2 = C19999h.f47538a.mo46674b(str3);
                if (C19483d.m36365a().mo31141b().f46262b == 2) {
                    b2 = m37874b(m37871a(b2));
                }
                if (b2.length() < 1996) {
                    C19512f.m36457b("imsdk", "PBLogUtils " + obj.getClass().getSimpleName() + " : " + b2, (Throwable) null);
                    return;
                }
                C19512f.m36457b("imsdk", "PBLogUtils " + obj.getClass().getSimpleName() + " : ", (Throwable) null);
                while (b2.length() > 1996) {
                    C19512f.m36457b("imsdk", "PBLogUtils " + b2.substring(0, 1996), (Throwable) null);
                    b2 = b2.substring(1996);
                }
                C19512f.m36457b("imsdk", "PBLogUtils ".concat(String.valueOf(b2)), (Throwable) null);
            }
        } catch (Throwable th) {
            C20002j.m37781b("PBLogUtils", th);
        }
    }
}
