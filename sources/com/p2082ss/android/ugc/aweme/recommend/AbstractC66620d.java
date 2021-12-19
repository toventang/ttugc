package com.p2082ss.android.ugc.aweme.recommend;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.recommend.d */
public interface AbstractC66620d {
    static {
        Covode.recordClassIndex(78177);
    }

    /* renamed from: a */
    void mo61469a(C56520b bVar);

    /* renamed from: a */
    void mo61470a(List<? extends User> list, int i);

    void setEnterFrom(String str);

    void setOutClickListener(View.OnClickListener onClickListener);
}
