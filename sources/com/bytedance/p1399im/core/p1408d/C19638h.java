package com.bytedance.p1399im.core.p1408d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.internal.utils.C20012o;
import com.bytedance.p1399im.core.p1404a.C19489e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.d.h */
public class C19638h implements Serializable, Cloneable, Comparable<C19638h> {
    private int badgeCount;
    private String conversationId;
    private long conversationShortId;
    private int conversationType;
    private C19639i coreInfo;
    private String draftContent;
    private long draftTime;
    private boolean hasMore = true;
    private int inboxType;
    private boolean isInBox;
    private boolean isMember;
    private boolean isPreview;
    private boolean isStranger;
    private C19538ai lastMessage;
    private long lastMessageIndex;
    private long lastMessageOrderIndex;
    private Map<String, String> localExt;
    private long maxIndexV2;
    private C19537ah member;
    private int memberCount;
    private List<Long> memberIds;
    private List<C19537ah> members;
    private long minIndex;
    private long minIndexV2;
    private int readBadgeCount;
    private long readIndex;
    private long readIndexV2;
    private C19663l settingInfo;
    private List<C19537ah> singleChatMembers;
    private long sortOrder;
    private int status;
    private String ticket;
    private long unreadCount;
    private List<C19538ai> unreadSelfMentionedMessages;
    private long updatedTime;

    static {
        Covode.recordClassIndex(22482);
    }

    public int getBadgeCount() {
        return this.badgeCount;
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

    public C19639i getCoreInfo() {
        return this.coreInfo;
    }

    public String getDraftContent() {
        return this.draftContent;
    }

    public long getDraftTime() {
        return this.draftTime;
    }

    public int getInboxType() {
        return this.inboxType;
    }

    public C19538ai getLastMessage() {
        return this.lastMessage;
    }

    public long getLastMessageIndex() {
        return this.lastMessageIndex;
    }

    public long getLastMessageOrderIndex() {
        return this.lastMessageOrderIndex;
    }

    public long getMaxIndexV2() {
        return this.maxIndexV2;
    }

    public C19537ah getMember() {
        return this.member;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public List<C19537ah> getMembers() {
        return this.members;
    }

    public long getMinIndex() {
        return this.minIndex;
    }

    public long getMinIndexV2() {
        return this.minIndexV2;
    }

    public int getReadBadgeCount() {
        return this.readBadgeCount;
    }

    public long getReadIndex() {
        return this.readIndex;
    }

    public long getReadIndexV2() {
        return this.readIndexV2;
    }

    public C19663l getSettingInfo() {
        return this.settingInfo;
    }

    public List<C19537ah> getSingleChatMembers() {
        return this.singleChatMembers;
    }

    public long getSortOrder() {
        return this.sortOrder;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTicket() {
        return this.ticket;
    }

    public long getUnreadCount() {
        return this.unreadCount;
    }

    public List<C19538ai> getUnreadSelfMentionedMessages() {
        return this.unreadSelfMentionedMessages;
    }

    public long getUpdatedTime() {
        return this.updatedTime;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public boolean isInBox() {
        return this.isInBox;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isStranger() {
        return this.isStranger;
    }

    public String getLocalExtStr() {
        return C19999h.m37773a(this.localExt);
    }

    public String getMemberStr() {
        return C20012o.m37813a(this.member);
    }

    public boolean isDissolved() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public C19638h clone() {
        try {
            return (C19638h) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public List<Long> getMemberIds() {
        List<Long> list = this.memberIds;
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    public int getMuted() {
        C19663l lVar = this.settingInfo;
        if (lVar != null) {
            return lVar.getMute();
        }
        return 0;
    }

    public int getStickTop() {
        C19663l lVar = this.settingInfo;
        if (lVar != null) {
            return lVar.getStickTop();
        }
        return 0;
    }

    public int hashCode() {
        String str = this.conversationId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isFavorite() {
        C19663l lVar = this.settingInfo;
        if (lVar == null || !lVar.isFavor()) {
            return false;
        }
        return true;
    }

    public boolean isGroupChat() {
        if (this.conversationType == C19489e.AbstractC19490a.f46181b) {
            return true;
        }
        return false;
    }

    public boolean isLiveChat() {
        if (this.conversationType == C19489e.AbstractC19490a.f46182c) {
            return true;
        }
        return false;
    }

    public boolean isLocal() {
        if (this.conversationShortId <= 0) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        C19663l lVar = this.settingInfo;
        if (lVar == null || !lVar.isMute()) {
            return false;
        }
        return true;
    }

    public boolean isSingleChat() {
        if (this.conversationType == C19489e.AbstractC19490a.f46180a) {
            return true;
        }
        return false;
    }

    public boolean isStickTop() {
        C19663l lVar = this.settingInfo;
        if (lVar == null || !lVar.isStickTop()) {
            return false;
        }
        return true;
    }

    public boolean isTemp() {
        if (this.conversationShortId <= 0) {
            return true;
        }
        return false;
    }

    public boolean isWaitingInfo() {
        Map<String, String> map = this.localExt;
        if (map == null || !map.containsKey("s:conv_wait_info")) {
            return false;
        }
        return true;
    }

    public synchronized Map<String, String> getExt() {
        MethodCollector.m26663i(7044);
        C19663l lVar = this.settingInfo;
        if (lVar != null) {
            Map<String, String> ext = lVar.getExt();
            MethodCollector.m26664o(7044);
            return ext;
        }
        MethodCollector.m26664o(7044);
        return null;
    }

    public synchronized Map<String, String> getLocalExt() {
        Map<String, String> map;
        MethodCollector.m26663i(7194);
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        map = this.localExt;
        MethodCollector.m26664o(7194);
        return map;
    }

    public boolean isReadBadgeCountUpdated() {
        if (this.readBadgeCount > 0 || TextUtils.equals(getLocalExt().get("s:read_badge_count_update"), "1")) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Conversation{conversationId='" + this.conversationId + '\'' + ", conversationShortId=" + this.conversationShortId + ", conversationType=" + this.conversationType + ", isMember=" + this.isMember + ", memberCount=" + this.memberCount + ", unreadCount=" + this.unreadCount + ", updatedTime=" + this.updatedTime + ", readIndex=" + this.readIndex + ", lastMessageIndex=" + this.lastMessageIndex + ", ticket='" + this.ticket + '\'' + ", inboxType=" + this.inboxType + ", hasMore=" + this.hasMore + ", draftTime=" + this.draftTime + ", draftContent='" + this.draftContent + '\'' + ", sortOrder=" + this.sortOrder + ", localExt=" + this.localExt + ", memberIds=" + this.memberIds + ", lastMessage=" + this.lastMessage + ", member=" + this.member + ", isStranger=" + this.isStranger + ", isInBox=" + this.isInBox + ", members=" + this.members + ", isPreview=" + this.isPreview + '}';
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

    public void setCoreInfo(C19639i iVar) {
        this.coreInfo = iVar;
    }

    public void setDraftContent(String str) {
        this.draftContent = str;
    }

    public void setDraftTime(long j) {
        this.draftTime = j;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setInBox(boolean z) {
        this.isInBox = z;
    }

    public void setInboxType(int i) {
        this.inboxType = i;
    }

    public void setIsMember(boolean z) {
        this.isMember = z;
    }

    public void setLastMessageIndex(long j) {
        this.lastMessageIndex = j;
    }

    public void setLocalExt(Map<String, String> map) {
        this.localExt = map;
    }

    public void setMember(C19537ah ahVar) {
        this.member = ahVar;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setMemberIds(List<Long> list) {
        this.memberIds = list;
    }

    public void setMembers(List<C19537ah> list) {
        this.members = list;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setReadIndex(long j) {
        this.readIndex = j;
    }

    public void setSettingInfo(C19663l lVar) {
        this.settingInfo = lVar;
    }

    public void setSingleChatMembers(List<C19537ah> list) {
        this.singleChatMembers = list;
    }

    public void setSortOrder(long j) {
        this.sortOrder = j;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStranger(boolean z) {
        this.isStranger = z;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public void setUnreadCount(long j) {
        this.unreadCount = j;
    }

    public void setUnreadSelfMentionedMessages(List<C19538ai> list) {
        this.unreadSelfMentionedMessages = list;
    }

    public void setUpdatedTime(long j) {
        this.updatedTime = j;
    }

    public void setBadgeCount(int i) {
        if (i > this.badgeCount) {
            this.badgeCount = i;
        }
    }

    public void setLocalExtStr(String str) {
        this.localExt = C19999h.m37774a(str);
    }

    public void setMemberStr(String str) {
        this.member = C20012o.m37812a(str);
    }

    public void setReadBadgeCount(int i) {
        if (i > this.readBadgeCount) {
            this.readBadgeCount = i;
        }
    }

    public void setLastMessage(C19538ai aiVar) {
        this.lastMessage = aiVar;
        if (aiVar != null) {
            setLastMessageOrderIndex(aiVar.getOrderIndex());
        }
    }

    public void setLastMessageOrderIndex(long j) {
        if (this.lastMessageOrderIndex < j) {
            this.lastMessageOrderIndex = j;
        }
    }

    public void setMaxIndexV2(long j) {
        if (j > this.maxIndexV2) {
            this.maxIndexV2 = j;
        }
    }

    public void setMinIndex(long j) {
        if (j > this.minIndex) {
            this.minIndex = j;
        }
    }

    public void setMinIndexV2(long j) {
        if (j > this.minIndexV2) {
            this.minIndexV2 = j;
        }
    }

    public void setReadIndexV2(long j) {
        if (j > this.readIndexV2) {
            this.readIndexV2 = j;
        }
    }

    public int compareTo(C19638h hVar) {
        if (hVar.getStickTop() != getStickTop()) {
            return hVar.getStickTop() - getStickTop();
        }
        long max = Math.max(hVar.getUpdatedTime(), hVar.getDraftTime()) - Math.max(getUpdatedTime(), getDraftTime());
        if (max > 0) {
            return 1;
        }
        if (max < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.conversationId;
            String str2 = ((C19638h) obj).conversationId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean removeMentionMessage(String str) {
        List<C19538ai> list = this.unreadSelfMentionedMessages;
        if (list != null && !list.isEmpty()) {
            for (C19538ai aiVar : this.unreadSelfMentionedMessages) {
                if (TextUtils.equals(str, aiVar.getUuid())) {
                    this.unreadSelfMentionedMessages.remove(aiVar);
                    return true;
                }
            }
        }
        return false;
    }
}
