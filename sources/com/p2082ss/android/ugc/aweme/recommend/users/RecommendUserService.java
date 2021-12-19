package com.p2082ss.android.ugc.aweme.recommend.users;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66620d;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.RecommendUserService */
public interface RecommendUserService {
    static {
        Covode.recordClassIndex(78213);
    }

    /* renamed from: a */
    View mo105664a(Context context, HashMap<String, Boolean> hashMap);

    /* renamed from: a */
    Fragment mo105665a();

    /* renamed from: a */
    InboxAdapterWidget mo105666a(Fragment fragment, LiveData<InboxAdapterWidget.EnumC56518b> liveData);

    /* renamed from: a */
    AbstractC66614a mo105667a(Context context, int i);

    /* renamed from: a */
    AbstractC66617b mo105668a(Context context);

    /* renamed from: b */
    AbstractC66620d mo105669b(Context context);
}
