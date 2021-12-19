package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.p931i.AbstractC13883a;
import com.bytedance.ies.powerpage.ActivityC17733a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.v */
final /* synthetic */ class C58449v implements AbstractC13883a {

    /* renamed from: a */
    static final AbstractC13883a f133069a = new C58449v();

    static {
        Covode.recordClassIndex(68713);
    }

    private C58449v() {
    }

    @Override // com.bytedance.crash.p931i.AbstractC13883a
    /* renamed from: a */
    public final String mo22365a(Activity activity) {
        if (activity instanceof ActivityC17733a) {
            String rootFragmentClsName = ((ActivityC17733a) activity).getRootFragmentClsName();
            if (!TextUtils.isEmpty(rootFragmentClsName)) {
                return rootFragmentClsName;
            }
        }
        return activity.getClass().getName();
    }
}
