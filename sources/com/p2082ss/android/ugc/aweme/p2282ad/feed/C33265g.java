package com.p2082ss.android.ugc.aweme.p2282ad.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedAdUIService;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.g */
public final class C33265g {

    /* renamed from: a */
    public static final C33265g f79011a = new C33265g();

    private C33265g() {
    }

    static {
        Covode.recordClassIndex(40091);
    }

    /* renamed from: a */
    public static String m68195a() {
        String predictLabelResult = SmartFeedAdUIService.C60003b.f136659a.getPredictLabelResult();
        if (predictLabelResult != null) {
            return predictLabelResult;
        }
        return null;
    }

    /* renamed from: c */
    public static int m68197c() {
        CommerceSmartUITasks b = m68196b();
        if (b != null) {
            return b.getAdCardDelay();
        }
        return -100;
    }

    /* renamed from: b */
    public static CommerceSmartUITasks m68196b() {
        CommerceSmartUITasks predictTaskIndex;
        if (SmartFeedAdUIService.C60003b.f136659a.getSmartAdUIExperimentValue() == null || m68195a() == null || (predictTaskIndex = SmartFeedAdUIService.C60003b.f136659a.getPredictTaskIndex()) == null) {
            return null;
        }
        return predictTaskIndex;
    }
}
