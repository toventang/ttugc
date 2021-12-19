package com.p2082ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b;
import com.p2082ss.android.ugc.aweme.awemeservice.p2353a.C34270a;
import com.p2082ss.android.ugc.aweme.awemeservice.p2353a.C34278c;
import com.p2082ss.android.ugc.aweme.awemeservice.p2353a.C34283g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.b */
public final class C34288b {

    /* renamed from: b */
    private static C34288b f81073b;

    /* renamed from: a */
    AbstractC34277b<String> f81074a;

    /* renamed from: c */
    private boolean f81075c = MainServiceImpl.createIMainServicebyMonsterPlugin(false).isUseJediAwemelistFragment();

    /* renamed from: d */
    private boolean f81076d;

    static {
        Covode.recordClassIndex(41231);
    }

    /* renamed from: a */
    public static C34288b m70151a() {
        if (f81073b == null) {
            f81073b = new C34288b();
        }
        return f81073b;
    }

    private C34288b() {
        AbstractC34277b<String> cVar;
        boolean isReplaceAwemeCache = MainServiceImpl.createIMainServicebyMonsterPlugin(false).isReplaceAwemeCache();
        this.f81076d = isReplaceAwemeCache;
        if (this.f81075c) {
            cVar = C34270a.f81046b;
        } else if (isReplaceAwemeCache) {
            cVar = new C34283g();
        } else {
            cVar = new C34278c();
        }
        this.f81074a = cVar;
    }

    /* renamed from: b */
    static boolean m70154b(Aweme aweme) {
        if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    static boolean m70155c(Aweme aweme) {
        if (aweme == null || aweme.getLiveAwesomeSplashInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m70153a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    /* renamed from: d */
    static AwemeStatistics m70156d(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            return statistics;
        }
        AwemeStatistics awemeStatistics = new AwemeStatistics();
        aweme.setStatistics(awemeStatistics);
        return awemeStatistics;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Aweme mo60714b(String str) {
        if (this.f81074a.mo60703b(str)) {
            return this.f81074a.mo60699a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final Aweme mo60711a(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return null;
        }
        if (this.f81074a.mo60703b(str)) {
            return this.f81074a.mo60699a(str);
        }
        return C34269a.m70081a().mo60697a(str);
    }

    /* renamed from: a */
    public static Aweme m70152a(Aweme aweme, AbstractC34277b<String> bVar) {
        Aweme a;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid()) && bVar != null && !aweme.isProhibited() && !aweme.isSelfSee()) {
            if (bVar.mo60703b(aweme.getAid()) && (a = bVar.mo60699a(aweme.getAid())) != null) {
                a.update(aweme);
                aweme.getDesc();
                aweme.getDistance();
                aweme = a;
            }
            bVar.mo60701a(aweme.getAid(), aweme);
        }
        return aweme;
    }

    /* renamed from: a */
    public final Aweme mo60712a(String str, int i) {
        String str2 = str + StringSet.type + i;
        if (this.f81074a.mo60703b(str2)) {
            return this.f81074a.mo60699a(str2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60713a(Aweme aweme, int i) {
        aweme.setUserDigg(i);
        AwemeStatistics statistics = aweme.getStatistics();
        if (i != 0) {
            if (statistics != null) {
                statistics.setDiggCount(statistics.getDiggCount() + 1);
            }
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_like_video_1", aweme.getAid());
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_like_video_5", null);
        } else if (statistics != null) {
            statistics.setDiggCount(statistics.getDiggCount() - 1);
        }
        this.f81074a.mo60701a(aweme.getAid(), aweme);
    }
}
