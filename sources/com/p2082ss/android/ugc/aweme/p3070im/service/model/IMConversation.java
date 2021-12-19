package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.IMConversation */
public class IMConversation extends IMContact {
    private String initialLetter;
    private UrlModel mConversationAvatar;
    private String mConversationId;
    private int mConversationMemberCount;
    private String mConversationName;
    private long mConversationShortId;
    private int mConversationType;

    static {
        Covode.recordClassIndex(66055);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public String getNickName() {
        return null;
    }

    public UrlModel getConversationAvatar() {
        return this.mConversationAvatar;
    }

    public String getConversationId() {
        return this.mConversationId;
    }

    public int getConversationMemberCount() {
        return this.mConversationMemberCount;
    }

    public String getConversationName() {
        return this.mConversationName;
    }

    public long getConversationShortId() {
        return this.mConversationShortId;
    }

    public int getConversationType() {
        return this.mConversationType;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public UrlModel getDisplayAvatar() {
        return this.mConversationAvatar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public String getDisplayName() {
        return this.mConversationName;
    }

    public String getInitialLetter() {
        return this.initialLetter;
    }

    public int hashCode() {
        if (getConversationId() != null) {
            return getConversationId().hashCode();
        }
        return 0;
    }

    public String toString() {
        return "IMConversation{mConversationType=" + this.mConversationType + ", mConversationId='" + this.mConversationId + '\'' + ", mConversationName='" + this.mConversationName + '\'' + ", mConversationMemberCount=" + this.mConversationMemberCount + ", mConversationAvatar=" + this.mConversationAvatar + ", relationListItemType=" + this.relationListItemType + '}';
    }

    public void setConversationAvatar(UrlModel urlModel) {
        this.mConversationAvatar = urlModel;
    }

    public void setConversationId(String str) {
        this.mConversationId = str;
    }

    public void setConversationMemberCount(int i) {
        this.mConversationMemberCount = i;
    }

    public void setConversationName(String str) {
        this.mConversationName = str;
    }

    public void setConversationShortId(long j) {
        this.mConversationShortId = j;
    }

    public void setConversationType(int i) {
        this.mConversationType = i;
    }

    public void setInitialLetter(String str) {
        this.initialLetter = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMConversation)) {
            return false;
        }
        IMConversation iMConversation = (IMConversation) obj;
        if (getConversationId() != null) {
            return getConversationId().equals(iMConversation.getConversationId());
        }
        if (iMConversation.getConversationId() == null) {
            return true;
        }
        return false;
    }
}
