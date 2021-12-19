package com.p2082ss.android.ugc.aweme.journey.step;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.journey.step.interestselector.C56994e;
import com.p2082ss.android.ugc.aweme.journey.step.p3292a.C56882a;
import com.p2082ss.android.ugc.aweme.journey.step.p3293b.C56897c;
import com.p2082ss.android.ugc.aweme.journey.step.p3294c.C56912d;
import com.p2082ss.android.ugc.aweme.journey.step.p3295d.C56919d;
import com.p2082ss.android.ugc.aweme.journey.step.p3296e.C56937c;
import com.p2082ss.android.ugc.aweme.journey.step.p3297f.C56942b;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56956c;
import com.p2082ss.android.ugc.aweme.journey.step.p3299h.C56961a;
import com.p2082ss.android.ugc.aweme.journey.step.p3299h.C56965c;
import com.p2082ss.android.ugc.aweme.journey.step.swipeup.C57035c;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.journey.step.b */
public final class C56888b {

    /* renamed from: a */
    private final Map<Integer, AbstractC56900c<?, ? super ComponentDependencies>> f129582a;

    static {
        Covode.recordClassIndex(66775);
    }

    public C56888b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f129582a = linkedHashMap;
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_SLOGAN_ID.getId()), new C56956c());
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_INTERESTS_ID.getId()), new C56994e());
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_PRIVATE_ACCOUNT_TIPS_ID.getId()), new C56942b());
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_SWIPE_UP_ID.getId()), new C57035c());
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_APP_LANGUAGE_ID.getId()), new C56897c());
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_CONTENT_LANGUAGE_ID.getId()), new C56912d());
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_AD_EXPERIENCE_ID.getId()), new C56882a());
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_DEEPLINK_ID.getId()), new C56919d());
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID.getId()), new C56961a());
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_NEW_USER_ADD_FB_FRIENDS_ID.getId()), new C56965c());
        linkedHashMap.put(Integer.valueOf(EnumC29737c.JOURNEY_GENDER_SELECTION.getId()), new C56937c());
    }

    /* renamed from: a */
    public final AbstractC56900c<?, ? super ComponentDependencies> mo94111a(int i) {
        return this.f129582a.get(Integer.valueOf(i));
    }
}
