package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupGreetingContent */
public final class GroupGreetingContent extends BaseContent {
    @AbstractC27891c(mo46611a = "members")
    private List<? extends IMUser> userList;

    static {
        Covode.recordClassIndex(63434);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        return "";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    public final List<IMUser> getUserList() {
        return this.userList;
    }

    public final void setUserList(List<? extends IMUser> list) {
        List list2;
        C55357e.C55358a.m101168a();
        if (list != null) {
            list2 = C89070n.m154590j(list);
        } else {
            list2 = null;
        }
        this.userList = C55357e.m101164a(list2);
    }
}
