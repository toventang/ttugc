package com.p2082ss.android.ugc.aweme.internal;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.internal.IAVCommentService */
public interface IAVCommentService {
    static {
        Covode.recordClassIndex(66676);
    }

    /* renamed from: a */
    void mo93956a(Context context, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback);

    /* renamed from: a */
    void mo93957a(ActivityC0945e eVar, boolean z, AbstractC89171a<C89391z> aVar);

    /* renamed from: a */
    boolean mo93958a(boolean z);
}
