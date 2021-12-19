package com.p2082ss.android.ugc.aweme.activity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.p2082ss.android.ugc.aweme.activity.processor.C33070a;
import com.p2082ss.android.ugc.aweme.activity.processor.C33073c;
import com.p2082ss.android.ugc.aweme.activity.processor.C33076e;
import com.p2082ss.android.ugc.aweme.activity.processor.C33080g;
import com.p2082ss.android.ugc.aweme.activity.processor.C33081h;
import com.p2082ss.android.ugc.aweme.activity.processor.C33084i;
import com.p2082ss.android.ugc.aweme.activity.processor.C33086k;
import com.p2082ss.android.ugc.aweme.activity.processor.C33087l;
import com.p2082ss.android.ugc.aweme.activity.processor.C33088m;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.activity.TikTokActivityViewModel */
public final class TikTokActivityViewModel extends BaseActivityViewModel {
    static {
        Covode.recordClassIndex(39877);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivityViewModel, com.bytedance.ies.foundation.base.BaseViewModel
    public final List<AbstractC17350d> initProcessors() {
        ArrayList arrayList = new ArrayList(super.initProcessors());
        arrayList.addAll(C89070n.m154522b(new C33070a(), new C33081h(), new C33073c(), new C33088m(), new C33080g(), new C33087l(), new C33086k(), new C33084i(), new C33076e()));
        return arrayList;
    }
}
