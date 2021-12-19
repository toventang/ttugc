package com.p2082ss.android.ugc.aweme.friends.invite;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.a */
public interface AbstractC51538a {
    static {
        Covode.recordClassIndex(60804);
    }

    /* renamed from: a */
    void mo87037a();

    /* renamed from: a */
    void mo87038a(Fragment fragment);

    /* renamed from: a */
    void mo87039a(Friend friend);

    /* renamed from: a */
    void mo87040a(C56520b bVar);

    /* renamed from: b */
    void mo87041b();

    LiveData<Boolean> getOnLoading();

    void setOutClickListener(AbstractC89172b<? super String, C89391z> bVar);
}
