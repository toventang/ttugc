package com.bytedance.p1399im.core.p1408d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.proto.ModifyMessagePropertyStatus;
import com.bytedance.p1399im.core.proto.ModifyPropertyContent;
import com.bytedance.p1399im.core.proto.OPERATION_TYPE;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.im.core.d.an */
public class C19587an implements Serializable, Cloneable {
    public String clientMessageId;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public int inboxType;
    private ModifyMessagePropertyStatus modifyMsgPropertyStatus;
    private int msgType;
    boolean mute;
    private List<ModifyPropertyContent> propertyContentList;
    public long serverMessageId;
    public String ticket;

    static {
        Covode.recordClassIndex(22431);
    }

    public String getClientMessageId() {
        return this.clientMessageId;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public long getConversationShortId() {
        return this.conversationShortId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public int getInboxType() {
        return this.inboxType;
    }

    public ModifyMessagePropertyStatus getModifyMsgPropertyStatus() {
        return this.modifyMsgPropertyStatus;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public boolean getMute() {
        return this.mute;
    }

    public List<ModifyPropertyContent> getPropertyContentList() {
        return this.propertyContentList;
    }

    public long getServerMessageId() {
        return this.serverMessageId;
    }

    public String getTicket() {
        return this.ticket;
    }

    public String toString() {
        return C19999h.f47538a.mo46674b(this);
    }

    public boolean invalid() {
        if (TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.ticket)) {
            return true;
        }
        return false;
    }

    public C19587an copy() {
        C19587an anVar = new C19587an();
        anVar.conversationId = getConversationId();
        anVar.conversationShortId = getConversationShortId();
        anVar.conversationType = getConversationType();
        anVar.ticket = getTicket();
        anVar.inboxType = getInboxType();
        anVar.serverMessageId = getServerMessageId();
        anVar.clientMessageId = getClientMessageId();
        anVar.msgType = getMsgType();
        anVar.propertyContentList = getPropertyContentList();
        anVar.modifyMsgPropertyStatus = getModifyMsgPropertyStatus();
        return anVar;
    }

    public void setClientMessageId(String str) {
        this.clientMessageId = str;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setInboxType(int i) {
        this.inboxType = i;
    }

    public void setModifyMsgPropertyStatus(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
        this.modifyMsgPropertyStatus = modifyMessagePropertyStatus;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setMute(boolean z) {
        this.mute = z;
    }

    public void setPropertyContentList(List<ModifyPropertyContent> list) {
        this.propertyContentList = list;
    }

    public void setServerMessageId(long j) {
        this.serverMessageId = j;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    /* renamed from: com.bytedance.im.core.d.an$a */
    public static final class C19588a {

        /* renamed from: a */
        public final C19587an f46504a = new C19587an();

        static {
            Covode.recordClassIndex(22432);
        }

        /* renamed from: a */
        public final C19588a mo31355a(C19538ai aiVar) {
            if (aiVar != null) {
                this.f46504a.serverMessageId = aiVar.getMsgId();
                this.f46504a.clientMessageId = aiVar.getUuid();
            }
            return this;
        }

        /* renamed from: a */
        public final C19588a mo31356a(C19638h hVar) {
            if (hVar != null) {
                this.f46504a.conversationId = hVar.getConversationId();
                this.f46504a.conversationType = hVar.getConversationType();
                this.f46504a.conversationShortId = hVar.getConversationShortId();
                this.f46504a.ticket = hVar.getTicket();
                this.f46504a.inboxType = hVar.getInboxType();
            }
            return this;
        }

        /* renamed from: a */
        public final C19588a mo31357a(OPERATION_TYPE operation_type, String str, String str2, String str3) {
            this.f46504a.addPropertyContent(new ModifyPropertyContent(operation_type, str, str2, str3));
            return this;
        }
    }

    public void addPropertyContent(C19536ag agVar) {
        OPERATION_TYPE operation_type;
        if (agVar != null) {
            if (agVar.deleted == 1) {
                operation_type = OPERATION_TYPE.REMOVE_PROPERTY_ITEM;
            } else {
                operation_type = OPERATION_TYPE.ADD_PROPERTY_ITEM;
            }
            addPropertyContent(new ModifyPropertyContent(operation_type, agVar.key, agVar.value, agVar.idempotent_id));
        }
    }

    public void addPropertyContent(ModifyPropertyContent modifyPropertyContent) {
        if (this.propertyContentList == null) {
            this.propertyContentList = new CopyOnWriteArrayList();
        }
        this.propertyContentList.add(modifyPropertyContent);
    }

    public void removePropertyContent(C19536ag agVar) {
        List<ModifyPropertyContent> list;
        if (!(agVar == null || (list = this.propertyContentList) == null || list.isEmpty())) {
            int size = this.propertyContentList.size();
            for (int i = 0; i < size; i++) {
                ModifyPropertyContent modifyPropertyContent = this.propertyContentList.get(i);
                if (modifyPropertyContent != null && TextUtils.equals(agVar.key, modifyPropertyContent.key) && TextUtils.equals(agVar.idempotent_id, modifyPropertyContent.idempotent_id)) {
                    this.propertyContentList.remove(i);
                    return;
                }
            }
        }
    }
}
