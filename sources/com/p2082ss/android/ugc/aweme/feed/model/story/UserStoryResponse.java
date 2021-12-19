package com.p2082ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse */
public final class UserStoryResponse extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "user_story")
    private final UserStory userStory;

    static {
        Covode.recordClassIndex(58844);
    }

    public static /* synthetic */ UserStoryResponse copy$default(UserStoryResponse userStoryResponse, UserStory userStory2, int i, Object obj) {
        if ((i & 1) != 0) {
            userStory2 = userStoryResponse.userStory;
        }
        return userStoryResponse.copy(userStory2);
    }

    public final UserStory component1() {
        return this.userStory;
    }

    public final UserStoryResponse copy(UserStory userStory2) {
        C89219l.m154721d(userStory2, "");
        return new UserStoryResponse(userStory2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UserStoryResponse) && C89219l.m154714a(this.userStory, ((UserStoryResponse) obj).userStory);
        }
        return true;
    }

    public final int hashCode() {
        UserStory userStory2 = this.userStory;
        if (userStory2 != null) {
            return userStory2.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserStoryResponse(userStory=" + this.userStory + ")";
    }

    public final UserStory getUserStory() {
        return this.userStory;
    }

    public UserStoryResponse(UserStory userStory2) {
        C89219l.m154721d(userStory2, "");
        this.userStory = userStory2;
    }
}
