package com.bytedance.p1399im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.AbstractC19482c;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19601az;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.p1399im.core.p1408d.C19663l;
import com.bytedance.p1399im.core.proto.BlockStatus;
import com.bytedance.p1399im.core.proto.ConversationCoreInfo;
import com.bytedance.p1399im.core.proto.ConversationInfoV2;
import com.bytedance.p1399im.core.proto.ConversationSettingInfo;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.MessageType;
import com.bytedance.p1399im.core.proto.Participant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.utils.f */
public final class C19997f {
    static {
        Covode.recordClassIndex(22842);
    }

    /* renamed from: a */
    public static List<C19537ah> m37768a(String str, List<Participant> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Participant participant : list) {
            if (participant.user_id != null) {
                C19537ah ahVar = new C19537ah();
                ahVar.setConversationId(str);
                ahVar.setAlias(participant.alias);
                if (participant.role != null) {
                    ahVar.setRole(participant.role.intValue());
                }
                if (participant.sort_order != null) {
                    ahVar.setSortOrder(participant.sort_order.longValue());
                }
                if (participant.blocked != null) {
                    ahVar.setSilent(participant.blocked.getValue());
                }
                if (participant.left_block_time != null) {
                    ahVar.setSilentTime(participant.left_block_time.longValue());
                }
                ahVar.setUid(participant.user_id.longValue());
                ahVar.setSecUid(participant.sec_uid);
                arrayList.add(ahVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C19537ah> m37769a(String str, List<Long> list, Map<Long, String> map, long j) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l : list) {
            if (l != null) {
                j++;
                C19537ah ahVar = new C19537ah();
                ahVar.setConversationId(str);
                ahVar.setSortOrder(j);
                ahVar.setUid(l.longValue());
                ahVar.setSilent(BlockStatus.UNBLOCK.getValue());
                ahVar.setSilentTime(0);
                if (map != null) {
                    ahVar.setSecUid(map.get(l));
                }
                arrayList.add(ahVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, String> m37770a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, jSONObject.getString(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static String m37771b(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() > 0) {
                    return C19999h.f47538a.mo46674b(map);
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: a */
    public static C19601az m37763a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new C19601az(map.get("s:protrait"), map.get("s:nick_name"), map.get("s:basic_ext_info"));
    }

    /* renamed from: c */
    public static JSONObject m37772c(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                try {
                    jSONObject.put(str, map.get(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C19537ah m37760a(String str, Participant participant) {
        if (participant == null || participant.user_id == null) {
            return null;
        }
        C19537ah ahVar = new C19537ah();
        ahVar.setConversationId(str);
        ahVar.setUid(participant.user_id.longValue());
        ahVar.setSecUid(participant.sec_uid);
        if (participant.role != null) {
            ahVar.setRole(participant.role.intValue());
        }
        ahVar.setAlias(participant.alias);
        if (participant.sort_order != null) {
            ahVar.setSortOrder(participant.sort_order.longValue());
        }
        if (participant.blocked != null) {
            ahVar.setSilent(participant.blocked.getValue());
        }
        if (participant.left_block_time != null) {
            ahVar.setSilentTime(participant.left_block_time.longValue());
        }
        return ahVar;
    }

    /* renamed from: a */
    public static C19663l m37767a(C19663l lVar, ConversationSettingInfo conversationSettingInfo) {
        int i;
        int i2;
        if (lVar == null) {
            lVar = new C19663l();
            lVar.setConversationId(conversationSettingInfo.conversation_id);
        }
        if (conversationSettingInfo.setting_version != null && conversationSettingInfo.setting_version.longValue() >= lVar.getVersion()) {
            int i3 = 0;
            if (conversationSettingInfo.mute != null) {
                i = conversationSettingInfo.mute.intValue();
            } else {
                i = 0;
            }
            lVar.setMute(i);
            if (conversationSettingInfo.stick_on_top != null) {
                i2 = conversationSettingInfo.stick_on_top.intValue();
            } else {
                i2 = 0;
            }
            lVar.setStickTop(i2);
            lVar.setExt(conversationSettingInfo.ext);
            if (conversationSettingInfo.favorite != null) {
                i3 = conversationSettingInfo.favorite.intValue();
            }
            lVar.setFavor(i3);
            lVar.setVersion(conversationSettingInfo.setting_version.longValue());
        }
        return lVar;
    }

    /* renamed from: a */
    public static C19538ai m37761a(String str, C19538ai aiVar, MessageBody messageBody) {
        return m37762a(str, aiVar, messageBody, false, MessageType.MESSAGE_TYPE_NOT_USED.getValue());
    }

    /* renamed from: a */
    public static C19639i m37766a(String str, C19639i iVar, ConversationCoreInfo conversationCoreInfo) {
        long j;
        BlockStatus blockStatus;
        int i;
        int intValue;
        if (iVar == null) {
            iVar = new C19639i();
            if (conversationCoreInfo.conversation_id != null) {
                str = conversationCoreInfo.conversation_id;
            }
            iVar.setConversationId(str);
        }
        if (conversationCoreInfo.info_version != null && conversationCoreInfo.info_version.longValue() >= iVar.getVersion()) {
            iVar.setName(conversationCoreInfo.name);
            iVar.setIcon(conversationCoreInfo.icon);
            iVar.setDesc(conversationCoreInfo.desc);
            iVar.setNotice(conversationCoreInfo.notice);
            iVar.setExt(conversationCoreInfo.ext);
            iVar.setVersion(conversationCoreInfo.info_version.longValue());
            if (conversationCoreInfo.owner != null) {
                j = conversationCoreInfo.owner.longValue();
            } else {
                j = -1;
            }
            iVar.setOwner(j);
            iVar.setSecOwner(conversationCoreInfo.sec_owner);
            if (conversationCoreInfo.block_status == null) {
                blockStatus = BlockStatus.UNBLOCK;
            } else {
                blockStatus = conversationCoreInfo.block_status;
            }
            iVar.setSilent(blockStatus.getValue());
            if (conversationCoreInfo.block_normal_only == null || !conversationCoreInfo.block_normal_only.booleanValue()) {
                i = 0;
            } else {
                i = 1;
            }
            iVar.setSilentNormalOnly(i);
            if (conversationCoreInfo.mode == null) {
                intValue = -1;
            } else {
                intValue = conversationCoreInfo.mode.intValue();
            }
            iVar.setMode(intValue);
        }
        return iVar;
    }

    /* renamed from: a */
    public static C19638h m37764a(int i, C19638h hVar, ConversationInfoV2 conversationInfoV2, long j) {
        return m37765a(i, hVar, conversationInfoV2, j, null, null, true);
    }

    /* renamed from: a */
    public static C19538ai m37762a(String str, C19538ai aiVar, MessageBody messageBody, boolean z, int i) {
        int i2;
        HashMap hashMap;
        long j;
        if (aiVar == null) {
            aiVar = new C19538ai();
            if (messageBody.order_in_conversation != null) {
                j = messageBody.order_in_conversation.longValue();
            } else {
                j = 0;
            }
            aiVar.setOrderIndex(j);
            aiVar.setMsgId(messageBody.server_message_id.longValue());
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString();
            }
            aiVar.setUuid(str);
            if (messageBody.create_time != null) {
                aiVar.setCreatedAt(messageBody.create_time.longValue());
            }
            aiVar.setMsgType(messageBody.message_type.intValue());
            aiVar.setConversationId(messageBody.conversation_id);
            aiVar.setConversationType(messageBody.conversation_type.intValue());
            aiVar.setSender(messageBody.sender.longValue());
            aiVar.setSecSender(messageBody.sec_sender);
            aiVar.setContent(messageBody.content);
            aiVar.setDeleted(0);
            aiVar.setMsgStatus(5);
            if (C19483d.m36365a().mo31141b().f46192A) {
                aiVar = C19994c.m37743b(aiVar);
            }
        } else if (C19483d.m36365a().mo31141b().f46285y) {
            aiVar.setMsgStatus(5);
        }
        if (!z && C19483d.m36365a().mo31141b().f46194C && messageBody.create_time != null) {
            aiVar.setCreatedAt(messageBody.create_time.longValue());
        }
        aiVar.setConversationShortId(messageBody.conversation_short_id.longValue());
        if (!z && messageBody.index_in_conversation != null) {
            aiVar.setIndex(messageBody.index_in_conversation.longValue());
            aiVar.getLocalExt().remove("s:message_index_is_local");
        }
        if (!z && messageBody.order_in_conversation != null && (aiVar.getOrderIndex() < 10000 || C19483d.m36365a().mo31141b().f46283w == 1)) {
            aiVar.setOrderIndex(messageBody.order_in_conversation.longValue());
        }
        if (messageBody.index_in_conversation_v2 != null) {
            aiVar.setIndexInConversationV2(messageBody.index_in_conversation_v2.longValue());
        }
        if (messageBody.status != null) {
            i2 = messageBody.status.intValue();
        } else {
            i2 = 0;
        }
        aiVar.setSvrStatus(i2);
        if (messageBody.version != null && messageBody.version.longValue() >= aiVar.getVersion()) {
            if (i == MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_EXT.getValue() || i == MessageType.MESSAGE_TYPE_NOT_USED.getValue()) {
                if (messageBody.ext == null) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap(messageBody.ext);
                }
                aiVar.setExt(hashMap);
            }
            if (i == MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.getValue() || i == MessageType.MESSAGE_TYPE_NOT_USED.getValue()) {
                aiVar.updatePropertyFromServer(messageBody);
            }
            aiVar.setVersion(messageBody.version.longValue());
        }
        if (messageBody.message_type != null && messageBody.message_type.intValue() == aiVar.getMsgType() && messageBody.server_message_id != null && messageBody.server_message_id.longValue() >= aiVar.getMsgId()) {
            aiVar.setMsgId(messageBody.server_message_id.longValue());
        }
        aiVar.setSenderInfo(m37763a(messageBody.user_profile));
        aiVar.setReadStatus(1 ^ (C20010n.m37806a(aiVar) ? 1 : 0));
        AbstractC19482c j2 = C19483d.m36365a().f46157b.mo27969j();
        if (aiVar.getSvrStatus() == 0 && j2 != null) {
            aiVar.setSvrStatus(0);
        }
        if (messageBody.reference_info != null && aiVar.getReferenceInfo() == null) {
            aiVar.setRefMsg(messageBody.reference_info);
        }
        return aiVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f6, code lost:
        if (r2 != null) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.p1399im.core.p1408d.C19638h m37765a(int r8, com.bytedance.p1399im.core.p1408d.C19638h r9, com.bytedance.p1399im.core.proto.ConversationInfoV2 r10, long r11, com.bytedance.p1399im.core.p1408d.C19538ai r13, java.util.List<com.bytedance.p1399im.core.p1408d.C19537ah> r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.utils.C19997f.m37765a(int, com.bytedance.im.core.d.h, com.bytedance.im.core.proto.ConversationInfoV2, long, com.bytedance.im.core.d.ai, java.util.List, boolean):com.bytedance.im.core.d.h");
    }
}
