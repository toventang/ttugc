package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SuperAccountList */
public class SuperAccountList extends BaseResponse {
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "user_list")
    public List<UserWithAweme> userList;

    static {
        Covode.recordClassIndex(60927);
    }

    public List<UserWithAweme> getUserList() {
        if (this.userList == null) {
            this.userList = new ArrayList(0);
        }
        return this.userList;
    }

    public SuperAccountList clone() {
        SuperAccountList superAccountList = new SuperAccountList();
        ArrayList arrayList = new ArrayList();
        if (!C13603b.m24435a((Collection) this.userList)) {
            for (UserWithAweme userWithAweme : this.userList) {
                if (userWithAweme != null) {
                    arrayList.add(userWithAweme.clone());
                }
            }
        }
        superAccountList.userList = arrayList;
        superAccountList.extra = this.extra;
        superAccountList.status_code = this.status_code;
        superAccountList.status_msg = this.status_msg;
        superAccountList.error_code = this.error_code;
        superAccountList.logPb = this.logPb;
        return superAccountList;
    }
}
