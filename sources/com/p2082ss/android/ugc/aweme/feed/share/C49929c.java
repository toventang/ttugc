package com.p2082ss.android.ugc.aweme.feed.share;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68982af;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68999am;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69046f;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69053h;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69067i;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69070j;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.share.c */
public final class C49929c {

    /* renamed from: a */
    private final Aweme f115081a;

    /* renamed from: b */
    private final boolean f115082b;

    /* renamed from: c */
    private final Activity f115083c;

    /* renamed from: d */
    private final C69684e.C69686b f115084d;

    /* renamed from: e */
    private final AbstractC49691s<C49672ag> f115085e;

    /* renamed from: f */
    private final String f115086f;

    /* renamed from: g */
    private final int f115087g;

    /* renamed from: h */
    private final String f115088h;

    /* renamed from: i */
    private final String f115089i;

    /* renamed from: j */
    private final String f115090j;

    /* renamed from: k */
    private final String f115091k;

    static {
        Covode.recordClassIndex(59040);
    }

    /* renamed from: b */
    private final void m93743b() {
        if (!C50545m.m94762a(this.f115081a) && !this.f115082b) {
            this.f115084d.mo109827a(new C68999am(this.f115081a, this.f115085e, this.f115086f));
        }
    }

    /* renamed from: c */
    private final void m93745c() {
        this.f115084d.mo109827a(new C69046f(this.f115083c, this.f115081a, this.f115086f, this.f115089i, this.f115090j, this.f115091k));
    }

    /* renamed from: d */
    private final void m93746d() {
        if (C50545m.m94762a(this.f115081a)) {
            this.f115084d.mo109827a(new C69053h(this.f115086f, this.f115085e));
        }
    }

    /* renamed from: f */
    private final boolean m93748f() {
        boolean z = false;
        try {
            z = new JSONObject(this.f115081a.getUploadMiscInfoStruct().mvInfo.getExtra()).optBoolean("is_commerce_music", false);
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    /* renamed from: e */
    private final void m93747e() {
        ACLCommonShare downloadGeneral;
        if (!C80580in.m139687c()) {
            AwemeACLShare awemeACLShareInfo = this.f115081a.getAwemeACLShareInfo();
            if (awemeACLShareInfo == null || (downloadGeneral = awemeACLShareInfo.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 0) {
                this.f115084d.mo109827a(new C69070j(this.f115083c, this.f115081a, this.f115086f, "click_download_icon", this.f115088h));
            }
        }
    }

    /* renamed from: g */
    private final void m93749g() {
        if (this.f115082b || C37699a.m76218U(this.f115081a)) {
            return;
        }
        if ((C89219l.m154714a((Object) this.f115086f, (Object) "homepage_hot") || m93744b(this.f115081a)) && !C50545m.m94762a(this.f115081a)) {
            this.f115084d.mo109827a(new C69067i(this.f115081a, this.f115086f));
        }
    }

    /* renamed from: h */
    private final void m93750h() {
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<Boolean> isPrivateAvailable = inst.getIsPrivateAvailable();
        C89219l.m154716b(isPrivateAvailable, "");
        Boolean c = isPrivateAvailable.mo59941c();
        C89219l.m154716b(c, "");
        if (c.booleanValue() && C50545m.m94762a(this.f115081a)) {
            this.f115084d.mo109827a(new C68982af(this.f115081a, this.f115086f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c0, code lost:
        if (com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m.m94762a(r13.f115081a) == false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02cf, code lost:
        if (r1 != 4) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0196, code lost:
        if (r0.getHasAnalyticsMetrics() != false) goto L_0x0198;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84978a() {
        /*
        // Method dump skipped, instructions count: 1371
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.share.C49929c.mo84978a():void");
    }

    /* renamed from: a */
    private static String m93742a(Aweme aweme) {
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (interactionTagInfo != null) {
            int interestLevel = interactionTagInfo.getInterestLevel();
            if (interestLevel == InteractionTagInterestLevel.LOW.getLevel()) {
                return "low_interest";
            }
            if (interestLevel == InteractionTagInterestLevel.HIGH.getLevel()) {
                return "high_interest";
            }
        }
        return "";
    }

    /* renamed from: b */
    private static boolean m93744b(Aweme aweme) {
        if (aweme.getAwemeRawAd() == null || !TalentAdRevenueShareServiceImpl.m77931e().mo67033c()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C49929c(Aweme aweme, boolean z, Activity activity, C69684e.C69686b bVar, AbstractC49691s sVar, String str, int i, String str2) {
        this(aweme, z, activity, bVar, sVar, str, i, str2, "", "", "");
    }

    public C49929c(Aweme aweme, boolean z, Activity activity, C69684e.C69686b bVar, AbstractC49691s<C49672ag> sVar, String str, int i, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f115081a = aweme;
        this.f115082b = z;
        this.f115083c = activity;
        this.f115084d = bVar;
        this.f115085e = sVar;
        this.f115086f = str;
        this.f115087g = i;
        this.f115088h = str2;
        this.f115089i = str3;
        this.f115090j = str4;
        this.f115091k = str5;
    }
}
