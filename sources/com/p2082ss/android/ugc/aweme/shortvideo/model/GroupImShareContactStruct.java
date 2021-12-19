package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.GroupImShareContactStruct */
public final class GroupImShareContactStruct extends ImShareContactStruct {
    private String conversationName = "";
    private int groupMemberCount;
    private boolean newGroupAvatar;

    static {
        Covode.recordClassIndex(84590);
    }

    public final String getConversationName() {
        return this.conversationName;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.model.ImShareContactStruct
    public final String getDisplayName() {
        return this.conversationName;
    }

    public final int getGroupMemberCount() {
        return this.groupMemberCount;
    }

    public final boolean getNewGroupAvatar() {
        return this.newGroupAvatar;
    }

    public final void setGroupMemberCount(int i) {
        this.groupMemberCount = i;
    }

    public final void setNewGroupAvatar(boolean z) {
        this.newGroupAvatar = z;
    }

    public final void setConversationName(String str) {
        C89219l.m154721d(str, "");
        this.conversationName = str;
    }
}
