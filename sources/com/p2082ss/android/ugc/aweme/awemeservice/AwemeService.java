package com.p2082ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.VideoControl;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.AwemeService */
public class AwemeService implements IAwemeService {
    static {
        Covode.recordClassIndex(41207);
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: a */
    public final void mo60681a() {
        C1731i.m5640b(new CallableC34291c(C34288b.m70151a()), C1731i.f5562a);
    }

    /* renamed from: b */
    public static IAwemeService m70060b() {
        MethodCollector.m26663i(8945);
        Object a = C81908b.m141854a(IAwemeService.class, false);
        if (a != null) {
            IAwemeService iAwemeService = (IAwemeService) a;
            MethodCollector.m26664o(8945);
            return iAwemeService;
        }
        if (C81908b.f183134Q == null) {
            synchronized (IAwemeService.class) {
                try {
                    if (C81908b.f183134Q == null) {
                        C81908b.f183134Q = new AwemeService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8945);
                    throw th;
                }
            }
        }
        AwemeService awemeService = (AwemeService) C81908b.f183134Q;
        MethodCollector.m26664o(8945);
        return awemeService;
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: b */
    public final Aweme mo60684b(String str) {
        return C34288b.m70151a().mo60711a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: d */
    public final Aweme mo60690d(String str) {
        return C34269a.m70081a().mo60697a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: a */
    public final Aweme mo60677a(Aweme aweme) {
        C34288b a = C34288b.m70151a();
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || aweme.getUserStory() != null) {
            return aweme;
        }
        if (C34288b.m70153a(aweme) || C34288b.m70154b(aweme) || C34288b.m70155c(aweme)) {
            return C34269a.m70081a().mo60696a(aweme);
        }
        return C34288b.m70152a(aweme, a.f81074a);
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: c */
    public final void mo60688c(String str) {
        C34288b a = C34288b.m70151a();
        AwemeStatistics b = C34269a.m70081a().mo60698b(str);
        if (b != null) {
            b.setCommentCount(b.getCommentCount() + 1);
        }
        Aweme b2 = a.mo60714b(str);
        AwemeStatistics d = C34288b.m70156d(b2);
        if (d != null) {
            d.setCommentCount(d.getCommentCount() + 1);
            a.f81074a.mo60701a(b2.getAid(), b2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: e */
    public final Aweme mo60691e(String str) {
        for (Aweme aweme : C34269a.m70081a().f81044b.values()) {
            if (TextUtils.equals(aweme.getAwemeRawAdIdStr(), str)) {
                return aweme;
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: a */
    public final Aweme mo60679a(String str) {
        C34288b a = C34288b.m70151a();
        String str2 = str + "type0";
        String str3 = str + "type1";
        if (a.f81074a.mo60703b(str2)) {
            return a.f81074a.mo60699a(str2);
        }
        if (a.f81074a.mo60703b(str3)) {
            return a.f81074a.mo60699a(str3);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: a */
    public final void mo60682a(long j) {
        for (Aweme aweme : C34288b.m70151a().f81074a.mo60700a()) {
            aweme.setFeedCount(j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: a */
    public final Aweme mo60680a(String str, int i) {
        return C34288b.m70151a().mo60712a(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: c */
    public final void mo60687c(Aweme aweme, int i) {
        VideoControl videoControl;
        C34288b.m70151a();
        if (aweme != null && (videoControl = aweme.getVideoControl()) != null) {
            videoControl.preventDownloadType = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: b */
    public final void mo60685b(Aweme aweme, int i) {
        C34288b.m70151a();
        if (aweme != null) {
            aweme.setCommentSetting(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: a */
    public final Aweme mo60678a(Aweme aweme, int i) {
        C34288b a = C34288b.m70151a();
        if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        if (C34288b.m70153a(aweme) || C34288b.m70154b(aweme) || C34288b.m70155c(aweme)) {
            return C34269a.m70081a().mo60696a(aweme);
        }
        String str = aweme.getAid() + StringSet.type + i;
        if (a.f81074a.mo60703b(str)) {
            Aweme a2 = a.f81074a.mo60699a(str);
            if (a2 != null) {
                a2.update(aweme);
                return a2;
            }
            a.f81074a.mo60701a(str, aweme);
        } else {
            a.f81074a.mo60701a(str, aweme);
        }
        return aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: b */
    public final void mo60686b(String str, int i) {
        Aweme a;
        C34288b a2 = C34288b.m70151a();
        if (!TextUtils.isEmpty(str)) {
            C34269a a3 = C34269a.m70081a();
            if (!TextUtils.isEmpty(str) && (a = a3.mo60697a(str)) != null) {
                a.setUserDigg(i);
                if (i == 0) {
                    AwemeStatistics b = a3.mo60698b(str);
                    if (b != null) {
                        b.setDiggCount(b.getDiggCount() - 1);
                    }
                } else {
                    AwemeStatistics b2 = a3.mo60698b(str);
                    if (b2 != null) {
                        b2.setDiggCount(b2.getDiggCount() + 1);
                    }
                }
            }
            Aweme b3 = a2.mo60714b(str);
            if (b3 == null) {
                Aweme a4 = a2.mo60712a(str, 0);
                if (a4 != null) {
                    a2.mo60713a(a4, i);
                }
                Aweme a5 = a2.mo60712a(str, 1);
                if (a5 != null) {
                    a2.mo60713a(a5, i);
                    return;
                }
                return;
            }
            a2.mo60713a(b3, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: c */
    public final void mo60689c(String str, int i) {
        C34288b a = C34288b.m70151a();
        Aweme a2 = a.mo60711a(str);
        if (a2 != null) {
            a2.setCollectStatus(i);
            a.f81074a.mo60701a(a2.getAid(), a2);
        }
        if (i == 1) {
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("collect_video", str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService
    /* renamed from: a */
    public final void mo60683a(String str, long j) {
        C34288b a = C34288b.m70151a();
        AwemeStatistics b = C34269a.m70081a().mo60698b(str);
        if (b != null) {
            b.setCommentCount(j);
        }
        Aweme b2 = a.mo60714b(str);
        AwemeStatistics d = C34288b.m70156d(b2);
        if (d != null) {
            d.setCommentCount(j);
            a.f81074a.mo60701a(b2.getAid(), b2);
        }
    }
}
