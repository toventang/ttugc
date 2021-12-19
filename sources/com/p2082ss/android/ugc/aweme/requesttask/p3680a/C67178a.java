package com.p2082ss.android.ugc.aweme.requesttask.p3680a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.C55836b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.p3228a.EnumC55835a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3222a.C55729a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.requesttask.a.a */
public final class C67178a implements AbstractC58259r {
    static {
        Covode.recordClassIndex(78786);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        C55219n a = C55219n.m100965a();
        C89219l.m154716b(a, "");
        if (a.mo92207d() > 0) {
            return EnumC58147aa.IDLE;
        }
        return EnumC58147aa.NORMAL;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        T t;
        boolean z2;
        long j;
        long j2;
        long j3;
        long j4;
        Long l;
        C89219l.m154721d(context, "");
        if (!C55197c.m100917a()) {
            return;
        }
        if (C55836b.m101607a(EnumC55835a.COLDUP_FULL)) {
            C55836b.m101604a(EnumC55835a.COLDUP_FULL, false);
            return;
        }
        C55836b.m101604a(EnumC55835a.COLDUP_DIFF, false);
        if (SettingsManager.m29616a().mo25400a("social_should_mention_check_when_warm_start", true) && (System.currentTimeMillis() - C55729a.f127100a.getLong("key_warm_start_time", 0)) / 1000 >= SettingsManager.m29616a().mo25395a("im_mention_check_valid_duration_for_warm_start", 14400L)) {
            C55273c.m101041a();
            List<IMUser> a = C55273c.m101044a(SettingsManager.m29616a().mo25394a("social_page_count_of_mention_check", 100));
            C89219l.m154716b(a, "");
            if (!a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : a) {
                    String uid = t2.getUid();
                    C89219l.m154716b(uid, "");
                    Long g = C89361p.m154865g(uid);
                    if (g == null || g.longValue() <= 0) {
                        String uid2 = t2.getUid();
                        C89219l.m154716b(uid2, "");
                        arrayList2.add(uid2);
                    } else {
                        arrayList.add(g);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C39162r.m79460a("mention_check_params_illegal", new C33744d().mo59983a("illegal_uids", C55214j.m100958a(arrayList2)).f79943a);
                }
                try {
                    t = SummonFriendApi.f118656a.batchCheckMentionPrivacy(arrayList.toString(), C89070n.m154522b(3L, 5L, 6L, 4L).toString(), false, 0).execute().f52262b;
                } catch (Exception e) {
                    C56244a.m102190b("MentionPrivacyUpdate", "Fetch mention privacy batch update info failed, previous success update time is " + C55729a.f127100a.getLong("key_warm_start_time", 0));
                    e.printStackTrace();
                    t = null;
                }
                HashMap hashMap = new HashMap();
                if (t != null) {
                    for (T t3 : t.f82365a) {
                        String str = t3.f82361a;
                        HashMap hashMap2 = new HashMap();
                        for (T t4 : t3.f82362b) {
                            hashMap2.put(Long.valueOf(t4.f82363a), Long.valueOf(t4.f82364b));
                        }
                        hashMap.put(str, hashMap2);
                    }
                }
                for (T t5 : a) {
                    HashMap hashMap3 = (HashMap) hashMap.get(t5.getUid());
                    if (hashMap3 != null) {
                        Long l2 = (Long) hashMap3.get(3L);
                        if ((l2 != null && l2.longValue() == 0) || ((l = (Long) hashMap3.get(6L)) != null && l.longValue() == 0)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        t5.setMentionEnabled(z2);
                        Long l3 = (Long) hashMap3.get(3L);
                        if (l3 != null) {
                            j = l3.longValue();
                        } else {
                            j = 0;
                        }
                        t5.setCommentMentionBlockStatus(j);
                        Long l4 = (Long) hashMap3.get(4L);
                        if (l4 != null) {
                            j2 = l4.longValue();
                        } else {
                            j2 = 0;
                        }
                        t5.setVideoTagBlockStatus(j2);
                        Long l5 = (Long) hashMap3.get(5L);
                        if (l5 != null) {
                            j3 = l5.longValue();
                        } else {
                            j3 = 0;
                        }
                        t5.setQaInviteBlockStatus(j3);
                        Long l6 = (Long) hashMap3.get(6L);
                        if (l6 != null) {
                            j4 = l6.longValue();
                        } else {
                            j4 = 0;
                        }
                        t5.setVideoMentionBlockStatus(j4);
                    }
                }
                int i = 0;
                do {
                    try {
                        C55273c.m101041a();
                        C55273c.m101052b(a);
                        try {
                            C55729a.m101482a(1);
                            return;
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        i++;
                        if (i >= 2) {
                        }
                    }
                } while (i >= 2);
            }
        }
    }
}
