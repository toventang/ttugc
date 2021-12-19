package com.bytedance.p1399im.core.p1408d;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.utils.AbstractC19998g;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.p1412e.C19679a;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.MessageStatus;
import com.bytedance.p1399im.core.proto.PropertyItem;
import com.bytedance.p1399im.core.proto.PropertyItemList;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.d.ai */
public final class C19538ai implements Serializable, Cloneable, Comparable<C19538ai> {
    public List<C19625c> attachments;
    @AbstractC19998g
    public String content;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public long createdAt;
    private int deleted;
    private Map<String, String> ext;
    public long index;
    public long indexInConversationV2;
    private transient SparseArray<Object> localCache;
    public Map<String, String> localExt;
    private transient SparseArray<WeakReference<Object>> mKeyedTags;
    private MessageStatus messageStatus;
    private long msgId;
    public int msgStatus;
    public int msgType;
    public long orderIndex;
    private Map<String, List<C19536ag>> propertyItemListMap;
    private int readStatus;
    private ReferenceInfo referenceInfo;
    private long rowid;
    public String secSender;
    public long sender;
    private C19601az senderInfo;
    private int svrStatus;
    private long tableFlag;
    public String uuid;
    private long version;

    /* renamed from: com.bytedance.im.core.d.ai$a */
    public static final class C19540a {

        /* renamed from: a */
        public final C19538ai f46383a = new C19538ai();

        static {
            Covode.recordClassIndex(22384);
        }
    }

    static {
        Covode.recordClassIndex(22382);
    }

    public final List<C19625c> getAttachments() {
        return this.attachments;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final long getConversationShortId() {
        return this.conversationShortId;
    }

    public final int getConversationType() {
        return this.conversationType;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    public final long getIndex() {
        return this.index;
    }

    public final long getIndexInConversationV2() {
        return this.indexInConversationV2;
    }

    public final long getMsgId() {
        return this.msgId;
    }

    public final int getMsgStatus() {
        return this.msgStatus;
    }

    public final int getMsgType() {
        return this.msgType;
    }

    public final long getOrderIndex() {
        return this.orderIndex;
    }

    public final Map<String, List<C19536ag>> getPropertyItemListMap() {
        return this.propertyItemListMap;
    }

    public final int getReadStatus() {
        return this.readStatus;
    }

    public final ReferenceInfo getReferenceInfo() {
        return this.referenceInfo;
    }

    public final long getRowId() {
        return this.rowid;
    }

    public final long getSender() {
        return this.sender;
    }

    public final C19601az getSenderInfo() {
        return this.senderInfo;
    }

    public final int getSvrStatus() {
        return this.svrStatus;
    }

    public final long getTableFlag() {
        return this.tableFlag;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final long getVersion() {
        return this.version;
    }

    public final String getExtStr() {
        return C19999h.m37773a(this.ext);
    }

    public final String getLocalExtStr() {
        return C19999h.m37773a(this.localExt);
    }

    public final boolean isDeleted() {
        if (this.deleted == 1) {
            return true;
        }
        return false;
    }

    private static C27910f getToStringGsonByLogPrivacy() {
        if (C19679a.m36773a().mo31634d()) {
            return C19999h.f47539b;
        }
        return C19999h.f47538a;
    }

    @Override // java.lang.Object
    public final C19538ai clone() {
        try {
            return (C19538ai) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final String getLogContent() {
        if (C19679a.m36773a().mo31634d()) {
            return "";
        }
        return this.content;
    }

    public final String getSecSender() {
        if (TextUtils.isEmpty(this.secSender)) {
            this.secSender = "";
        }
        return this.secSender;
    }

    public final int hashCode() {
        String str = this.uuid;
        if (str != null) {
            return str.hashCode();
        }
        return super.hashCode();
    }

    public final boolean isSuccessOrNormal() {
        int i = this.msgStatus;
        if (i == 2 || i == 5) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return getToStringGsonByLogPrivacy().mo46674b(this);
    }

    public final synchronized Map<String, String> getExt() {
        Map<String, String> map;
        MethodCollector.m26663i(8002);
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        map = this.ext;
        MethodCollector.m26664o(8002);
        return map;
    }

    public final synchronized Map<String, String> getLocalExt() {
        Map<String, String> map;
        MethodCollector.m26663i(8451);
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        map = this.localExt;
        MethodCollector.m26664o(8451);
        return map;
    }

    public final MessageStatus getMessageStatus() {
        MessageStatus messageStatus2 = this.messageStatus;
        if (messageStatus2 != null) {
            return messageStatus2;
        }
        if (isDeleted()) {
            return MessageStatus.DELETED;
        }
        if (isRecalled()) {
            return MessageStatus.RECALLED;
        }
        return MessageStatus.INVISIBLE;
    }

    public final String getPropertyItemListMapString() {
        try {
            Map<String, List<C19536ag>> map = this.propertyItemListMap;
            if (map == null || map.size() <= 0) {
                return "";
            }
            return C19999h.f47538a.mo46674b(this.propertyItemListMap);
        } catch (Throwable unused) {
            return "";
        }
    }

    public final long getRefMsgId() {
        String str = getLocalExt().get("s:sdk_ref_msg_id");
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public final boolean invalid() {
        if (this.sender <= 0 || TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.uuid)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean isIndexLocal() {
        return "1".equals(getLocalExt().get("s:message_index_is_local"));
    }

    public final boolean isMention() {
        List<Long> mentionIds = getMentionIds();
        if (mentionIds == null || !mentionIds.contains(Long.valueOf(C19679a.m36773a().mo31632b()))) {
            return false;
        }
        return true;
    }

    public final boolean isSelf() {
        if (C19679a.m36773a().mo31632b() == this.sender) {
            return true;
        }
        return false;
    }

    public final List<Long> getMentionIds() {
        Map<String, String> map = this.ext;
        ArrayList arrayList = null;
        if (map != null && map.containsKey("s:mentioned_users")) {
            String str = this.ext.get("s:mentioned_users");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] split = str.split(",");
            arrayList = new ArrayList();
            for (String str2 : split) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public final boolean isRecalled() {
        if ("true".equals(getExt().get("s:is_recalled")) || "true".equals(getExt().get("s:recalled"))) {
            return true;
        }
        return false;
    }

    public final void setAttachments(List<C19625c> list) {
        this.attachments = list;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public final void setConversationType(int i) {
        this.conversationType = i;
    }

    public final void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public final void setLocalExt(Map<String, String> map) {
        this.localExt = map;
    }

    public final void setMessageStatus(MessageStatus messageStatus2) {
        this.messageStatus = messageStatus2;
    }

    public final void setMsgId(long j) {
        this.msgId = j;
    }

    public final void setMsgStatus(int i) {
        this.msgStatus = i;
    }

    public final void setMsgType(int i) {
        this.msgType = i;
    }

    public final void setPropertyItemListMap(Map<String, List<C19536ag>> map) {
        this.propertyItemListMap = map;
    }

    public final void setReadStatus(int i) {
        this.readStatus = i;
    }

    public final void setRowId(long j) {
        this.rowid = j;
    }

    public final void setSender(long j) {
        this.sender = j;
    }

    public final void setSenderInfo(C19601az azVar) {
        this.senderInfo = azVar;
    }

    public final void setSvrStatus(int i) {
        this.svrStatus = i;
    }

    public final void setTableFlag(long j) {
        this.tableFlag = j;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public final void setVersion(long j) {
        this.version = j;
    }

    public final String getExtValue(String str) {
        return getMapValue(this.ext, str);
    }

    public final String getLocalExtValue(String str) {
        return getMapValue(this.localExt, str);
    }

    public final void setExtStr(String str) {
        this.ext = C19999h.m37774a(str);
    }

    public final void setLocalExtStr(String str) {
        this.localExt = C19999h.m37774a(str);
    }

    private void setRefMsgId(String str) {
        getLocalExt().put("s:sdk_ref_msg_id", str);
    }

    public final void setIndex(long j) {
        if (this.index < j) {
            this.index = j;
        }
    }

    public final void setIndexInConversationV2(long j) {
        if (this.indexInConversationV2 < j) {
            this.indexInConversationV2 = j;
        }
    }

    public final void setOrderIndex(long j) {
        if (this.orderIndex < j) {
            this.orderIndex = j;
        }
    }

    public final void setSecSender(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.secSender = str;
    }

    public final synchronized void clearLocalExt(String str) {
        MethodCollector.m26663i(8755);
        Map<String, String> map = this.localExt;
        if (map != null) {
            map.remove(str);
        }
        MethodCollector.m26664o(8755);
    }

    public final synchronized Object getLocalCache(int i) {
        MethodCollector.m26663i(8449);
        SparseArray<Object> sparseArray = this.localCache;
        if (sparseArray == null) {
            MethodCollector.m26664o(8449);
            return null;
        }
        Object obj = sparseArray.get(i);
        MethodCollector.m26664o(8449);
        return obj;
    }

    public final Object getTag(int i) {
        SparseArray<WeakReference<Object>> sparseArray = this.mKeyedTags;
        if (sparseArray == null || sparseArray.get(i) == null) {
            return null;
        }
        return this.mKeyedTags.get(i).get();
    }

    public final synchronized void putExt(Map<String, String> map) {
        MethodCollector.m26663i(8291);
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.putAll(map);
        MethodCollector.m26664o(8291);
    }

    public final synchronized void putLocalExt(Map<String, String> map) {
        MethodCollector.m26663i(8892);
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        this.localExt.putAll(map);
        MethodCollector.m26664o(8892);
    }

    public final void setPropertyItemListMapByString(String str) {
        try {
            this.propertyItemListMap = (Map) C19999h.f47538a.mo46671a(str, new C27895a<Map<String, PropertyItemList>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19538ai.C195391 */

                static {
                    Covode.recordClassIndex(22383);
                }
            }.type);
        } catch (Throwable unused) {
            this.propertyItemListMap = null;
        }
    }

    public final int compareTo(C19538ai aiVar) {
        if (equals(aiVar)) {
            return 0;
        }
        long orderIndex2 = aiVar.getOrderIndex() - getOrderIndex();
        if (orderIndex2 > 0) {
            return 1;
        }
        if (orderIndex2 < 0) {
            return -1;
        }
        long createdAt2 = aiVar.getCreatedAt() - getCreatedAt();
        if (createdAt2 > 0) {
            return 1;
        }
        if (createdAt2 < 0) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.uuid;
            String str2 = ((C19538ai) obj).uuid;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final void setRefMsg(ReferenceInfo referenceInfo2) {
        if (referenceInfo2 == null || referenceInfo2.referenced_message_id.longValue() <= 0) {
            this.referenceInfo = null;
            setRefMsgId("");
            return;
        }
        this.referenceInfo = referenceInfo2.newBuilder().build();
        setRefMsgId(new StringBuilder().append(referenceInfo2.referenced_message_id).toString());
    }

    public final void updatePropertyFromServer(MessageBody messageBody) {
        C19536ag agVar;
        if (!(messageBody == null || messageBody.version == null || messageBody.version.longValue() < this.version)) {
            String str = this.uuid;
            String str2 = this.conversationId;
            HashMap hashMap = null;
            if (messageBody.property_list != null) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<String, PropertyItemList> entry : messageBody.property_list.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        ArrayList arrayList = new ArrayList();
                        hashMap2.put(key, arrayList);
                        PropertyItemList value = entry.getValue();
                        if (value.Items != null && !value.Items.isEmpty()) {
                            for (PropertyItem propertyItem : value.Items) {
                                if (propertyItem == null) {
                                    agVar = null;
                                } else {
                                    agVar = new C19536ag();
                                    agVar.msgUuid = str;
                                    agVar.conversationId = str2;
                                    agVar.uid = propertyItem.uid;
                                    agVar.sec_uid = propertyItem.sec_uid;
                                    agVar.create_time = propertyItem.create_time;
                                    agVar.idempotent_id = propertyItem.idempotent_id;
                                    agVar.value = propertyItem.value;
                                    agVar.key = key;
                                }
                                arrayList.add(agVar);
                            }
                        }
                    }
                }
                hashMap = hashMap2;
            }
            this.propertyItemListMap = hashMap;
        }
    }

    private String getMapValue(Map<String, String> map, String str) {
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return map.get(str);
    }

    public final synchronized void addExt(String str, String str2) {
        MethodCollector.m26663i(8151);
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(str, str2);
        MethodCollector.m26664o(8151);
    }

    public final synchronized void addLocalExt(String str, String str2) {
        MethodCollector.m26663i(8603);
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        this.localExt.put(str, str2);
        MethodCollector.m26664o(8603);
    }

    public final synchronized void putLocalCache(int i, Object obj) {
        MethodCollector.m26663i(8448);
        if (this.localCache == null) {
            this.localCache = new SparseArray<>(1);
        }
        this.localCache.put(i, obj);
        MethodCollector.m26664o(8448);
    }

    public final void setTag(int i, Object obj) {
        if (this.mKeyedTags == null) {
            this.mKeyedTags = new SparseArray<>(2);
        }
        this.mKeyedTags.put(i, new WeakReference<>(obj));
    }
}
