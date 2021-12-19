package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.InteractionTagInfo */
public final class InteractionTagInfo implements Serializable {
    @AbstractC27891c(mo46611a = "interest_level")
    public int interestLevel;
    @AbstractC27891c(mo46611a = "tagged_users")
    public List<InteractionTagUserInfo> taggedUsers;
    @AbstractC27891c(mo46611a = "video_label_text")
    public String videoLabelText;

    static {
        Covode.recordClassIndex(58711);
    }

    public InteractionTagInfo() {
        this(0, null, null, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_InteractionTagInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93180x24c02eee(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.InteractionTagInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InteractionTagInfo copy$default(InteractionTagInfo interactionTagInfo, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = interactionTagInfo.interestLevel;
        }
        if ((i2 & 2) != 0) {
            str = interactionTagInfo.videoLabelText;
        }
        if ((i2 & 4) != 0) {
            list = interactionTagInfo.taggedUsers;
        }
        return interactionTagInfo.copy(i, str, list);
    }

    public final int component1() {
        return this.interestLevel;
    }

    public final String component2() {
        return this.videoLabelText;
    }

    public final List<InteractionTagUserInfo> component3() {
        return this.taggedUsers;
    }

    public final InteractionTagInfo copy(int i, String str, List<InteractionTagUserInfo> list) {
        C89219l.m154721d(str, "");
        return new InteractionTagInfo(i, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionTagInfo)) {
            return false;
        }
        InteractionTagInfo interactionTagInfo = (InteractionTagInfo) obj;
        return this.interestLevel == interactionTagInfo.interestLevel && C89219l.m154714a(this.videoLabelText, interactionTagInfo.videoLabelText) && C89219l.m154714a(this.taggedUsers, interactionTagInfo.taggedUsers);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_InteractionTagInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m93180x24c02eee(this.interestLevel) * 31;
        String str = this.videoLabelText;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_InteractionTagInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<InteractionTagUserInfo> list = this.taggedUsers;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InteractionTagInfo(interestLevel=" + this.interestLevel + ", videoLabelText=" + this.videoLabelText + ", taggedUsers=" + this.taggedUsers + ")";
    }

    public final int getInterestLevel() {
        return this.interestLevel;
    }

    public final List<InteractionTagUserInfo> getTaggedUsers() {
        return this.taggedUsers;
    }

    public final String getVideoLabelText() {
        return this.videoLabelText;
    }

    public final void setInterestLevel(int i) {
        this.interestLevel = i;
    }

    public final void setTaggedUsers(List<InteractionTagUserInfo> list) {
        this.taggedUsers = list;
    }

    public final void setVideoLabelText(String str) {
        C89219l.m154721d(str, "");
        this.videoLabelText = str;
    }

    public InteractionTagInfo(int i, String str, List<InteractionTagUserInfo> list) {
        C89219l.m154721d(str, "");
        this.interestLevel = i;
        this.videoLabelText = str;
        this.taggedUsers = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InteractionTagInfo(int i, String str, List list, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : list);
    }
}
