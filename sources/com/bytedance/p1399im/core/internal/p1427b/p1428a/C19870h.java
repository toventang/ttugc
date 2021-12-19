package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19773g;
import com.bytedance.p1399im.core.internal.p1419a.C19775h;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1419a.C19782j;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19599ax;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19663l;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.MessageStatus;
import com.bytedance.p1399im.core.proto.MessageType;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.im.core.internal.b.a.h */
public final class C19870h {
    @AbstractC27891c(mo46611a = "conversation_id")

    /* renamed from: a */
    public String f47172a;
    @AbstractC27891c(mo46611a = "command_type")

    /* renamed from: b */
    private int f47173b;
    @AbstractC27891c(mo46611a = "inbox_type")

    /* renamed from: c */
    private int f47174c;
    @AbstractC27891c(mo46611a = "conversation_type")

    /* renamed from: d */
    private int f47175d;
    @AbstractC27891c(mo46611a = "message_id")

    /* renamed from: e */
    private long f47176e;
    @AbstractC27891c(mo46611a = "read_index")

    /* renamed from: f */
    private long f47177f;
    @AbstractC27891c(mo46611a = "read_index_v2")

    /* renamed from: g */
    private long f47178g;
    @AbstractC27891c(mo46611a = "read_badge_count")

    /* renamed from: h */
    private int f47179h;
    @AbstractC27891c(mo46611a = "unread_count")

    /* renamed from: i */
    private int f47180i;
    @AbstractC27891c(mo46611a = "last_message_index")

    /* renamed from: j */
    private long f47181j;
    @AbstractC27891c(mo46611a = "last_message_index_v2")

    /* renamed from: k */
    private long f47182k;
    @AbstractC27891c(mo46611a = "conversation_version")

    /* renamed from: l */
    private long f47183l;
    @AbstractC27891c(mo46611a = "group_version")

    /* renamed from: m */
    private long f47184m;
    @AbstractC27891c(mo46611a = "added_participant")

    /* renamed from: n */
    private List<Long> f47185n;
    @AbstractC27891c(mo46611a = "modified_participant")

    /* renamed from: o */
    private List<Long> f47186o;
    @AbstractC27891c(mo46611a = "removed_participant")

    /* renamed from: p */
    private List<Long> f47187p;

    static {
        Covode.recordClassIndex(22714);
    }

    C19870h() {
    }

    /* renamed from: a */
    public static boolean m37414a(MessageBody messageBody) {
        if (messageBody == null || messageBody.message_type.intValue() < MessageType.MESSAGE_TYPE_COMMAND.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static void m37417d(MessageBody messageBody) {
        Map<String, String> map;
        try {
            Map<String, String> map2 = messageBody.ext;
            final ArrayList arrayList = new ArrayList();
            final HashMap hashMap = new HashMap();
            if (map2 != null && map2.containsKey("s:mark_message_new_ext") && map2.get("s:mark_message_new_ext") != null) {
                JSONObject jSONObject = new JSONObject(map2.get("s:mark_message_new_ext"));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C19538ai a = C19777i.m37172a(Long.parseLong(next));
                    HashMap hashMap2 = null;
                    if (jSONObject.get(next) instanceof JSONObject) {
                        map = C19999h.m37774a(((JSONObject) jSONObject.get(next)).toString());
                    } else {
                        map = null;
                    }
                    if (a != null) {
                        if (a.getExt() != null) {
                            hashMap.put(String.valueOf(a.getMsgId()), a.getExt());
                        }
                        if (map != null) {
                            hashMap2 = new HashMap(map);
                        }
                        a.putExt(hashMap2);
                        arrayList.add(a);
                        C19777i.m37185a(a, true, true);
                    }
                }
                C19930x.m37536a().mo31808a(new Runnable() {
                    /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19870h.RunnableC198849 */

                    static {
                        Covode.recordClassIndex(22728);
                    }

                    public final void run() {
                        C20014q.m37816a().mo31902a(arrayList, hashMap);
                    }
                });
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "handle batch unmark", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d2, code lost:
        if (r4.removeMentionMessage(r3.getUuid()) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r3 = com.bytedance.p1399im.core.internal.p1419a.C19777i.m37172a(r12.f47176e);
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m37411a(com.bytedance.p1399im.core.internal.p1427b.p1428a.C19870h r12) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19870h.m37411a(com.bytedance.im.core.internal.b.a.h):void");
    }

    /* renamed from: c */
    private static void m37416c(MessageBody messageBody) {
        C19538ai aiVar;
        final boolean z;
        final boolean z2;
        List<Long> mentionIds;
        try {
            Map<String, String> map = messageBody.ext;
            String str = "";
            if (map != null && map.containsKey("s:client_message_id") && !TextUtils.isEmpty(map.get("s:client_message_id"))) {
                str = map.get("s:client_message_id");
            }
            if (map == null || !map.containsKey("s:server_message_id") || TextUtils.isEmpty(map.get("s:server_message_id")) || (aiVar = C19777i.m37172a(Long.parseLong(map.get("s:server_message_id")))) == null || messageBody.version.longValue() <= aiVar.getVersion()) {
                if (TextUtils.isEmpty(str)) {
                    aiVar = C19777i.m37172a(messageBody.server_message_id.longValue());
                } else {
                    aiVar = C19777i.m37195c(str);
                }
            }
            if (aiVar != null) {
                final Map<String, String> ext = aiVar.getExt();
                final C19538ai a = C19997f.m37762a(str, aiVar, messageBody, true, MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_EXT.getValue());
                if (C19777i.m37185a(a, true, true)) {
                    if (!a.isRecalled() || (mentionIds = a.getMentionIds()) == null || mentionIds.isEmpty()) {
                        z = false;
                    } else {
                        z = C19775h.m37168a(a.getUuid());
                    }
                    final C19638h a2 = C19749c.m36999a(a.getConversationId(), true);
                    if (!(a2 == null || a2.getLastMessage() == null)) {
                        long e = C19749c.m37025e(a2);
                        if (e != a2.getUnreadCount()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        a2.setUnreadCount(e);
                        if (a.getUuid().equals(a2.getLastMessage().getUuid())) {
                            a2.setLastMessage(a);
                            z2 = true;
                        }
                        C19749c.m37008a(a2, false);
                        C19930x.m37536a().mo31808a(new Runnable() {
                            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19870h.RunnableC198827 */

                            static {
                                Covode.recordClassIndex(22726);
                            }

                            public final void run() {
                                List<C19538ai> singletonList = Collections.singletonList(a);
                                HashMap hashMap = new HashMap();
                                if (ext != null) {
                                    hashMap.put(String.valueOf(a.getMsgId()), ext);
                                }
                                C20014q.m37816a().mo31902a(singletonList, hashMap);
                                if (z2 || z) {
                                    C19640j.m36671a().mo31590a(a2, 2);
                                }
                            }
                        });
                    }
                }
            }
            if ("true".equals(messageBody.ext.get("s:is_recalled")) || "true".equals(messageBody.ext.get("s:recalled"))) {
                String str2 = "ref_" + messageBody.ext.get("s:server_message_id");
                List<Pair<String, String>> a3 = C19782j.m37210a(str2);
                final ArrayList arrayList = new ArrayList();
                if (!(a3 == null || a3.isEmpty())) {
                    for (Pair<String, String> pair : a3) {
                        String str3 = (String) pair.first;
                        ReferenceInfo build = ((ReferenceInfo) C19999h.f47538a.mo46670a((String) pair.second, ReferenceInfo.class)).newBuilder().referenced_message_status(MessageStatus.RECALLED).build();
                        C19782j.m37211a(str3, str2, C19999h.f47538a.mo46674b(build));
                        C19538ai c = C19777i.m37195c(str3);
                        if (c != null) {
                            c.setRefMsg(build);
                        }
                        arrayList.add(c);
                    }
                    if (!arrayList.isEmpty()) {
                        C19930x.m37536a().mo31808a(new Runnable() {
                            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19870h.RunnableC198711 */

                            static {
                                Covode.recordClassIndex(22715);
                            }

                            public final void run() {
                                C20014q.m37816a().mo31900a(arrayList);
                            }
                        });
                    }
                }
            }
        } catch (Exception e2) {
            C19512f.m36457b("imsdk", "handle update", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:187:0x05d4 A[Catch:{ Exception -> 0x060c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m37415b(com.bytedance.p1399im.core.proto.MessageBody r14) {
        /*
        // Method dump skipped, instructions count: 1754
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19870h.m37415b(com.bytedance.im.core.proto.MessageBody):boolean");
    }

    /* renamed from: a */
    static boolean m37413a(C19538ai aiVar, String str) {
        boolean z = false;
        if (aiVar == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            C19599ax axVar = (C19599ax) C19999h.f47538a.mo46670a(str, C19599ax.class);
            if (axVar == null) {
                return false;
            }
            if (axVar.checkCode != 0 && !TextUtils.equals(aiVar.getLocalExtValue("s:send_response_check_code"), String.valueOf(axVar.checkCode))) {
                aiVar.addLocalExt("s:send_response_check_code", String.valueOf(axVar.checkCode));
                z = true;
            }
            if (!TextUtils.isEmpty(axVar.checkMsg) && !TextUtils.equals(aiVar.getLocalExtValue("s:send_response_check_msg"), axVar.checkMsg)) {
                aiVar.addLocalExt("s:send_response_check_msg", axVar.checkMsg);
                return true;
            }
            return z;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "CommandMessage updateCheck", e);
        }
    }

    /* renamed from: a */
    private static void m37412a(C19870h hVar, MessageBody messageBody, boolean z) {
        List<Long> list;
        C19663l a = C19773g.m37159a(hVar.f47172a);
        if (a != null) {
            if (a.getVersion() < hVar.f47183l || z) {
                C19786a.m37231a(hVar.f47174c, messageBody);
            }
        } else if (C19483d.m36365a().mo31141b().f46206O && (list = hVar.f47185n) != null && list.contains(Long.valueOf(C19483d.m36365a().f46157b.mo27953a()))) {
            C19786a.m37231a(hVar.f47174c, messageBody);
        }
    }
}
