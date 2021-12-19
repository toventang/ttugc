package com.p2082ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.AbstractC58648k;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;

/* renamed from: com.ss.android.ugc.aweme.port.internal.a */
public final class C63273a {

    /* renamed from: a */
    final ActivityC0945e f143635a;

    /* renamed from: b */
    final boolean f143636b;

    /* renamed from: c */
    final boolean f143637c;

    /* renamed from: d */
    final boolean f143638d;

    static {
        Covode.recordClassIndex(74550);
    }

    /* renamed from: a */
    static boolean m114727a() {
        for (Activity activity : ActivityStack.getActivityStack()) {
            if (activity instanceof AbstractC58648k) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m114728a(C69831ai aiVar) {
        if (aiVar.shoutOutsType == 1 || aiVar.shoutOutsType == 2) {
            return true;
        }
        return false;
    }

    public C63273a(ActivityC0945e eVar) {
        this.f143635a = eVar;
        this.f143636b = !(eVar instanceof MainActivity);
        this.f143637c = eVar instanceof AbstractC58648k;
        this.f143638d = eVar.getClass().equals(AVExternalServiceImpl.m113114a().classnameService().getVideoPublishActivityClass());
    }
}
