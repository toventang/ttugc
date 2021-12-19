package com.p2082ss.android.ugc.aweme.feed.api;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46864dy;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.C50520x;
import com.p2082ss.android.ugc.aweme.feed.interest.C49701a;
import com.p2082ss.android.ugc.aweme.feed.interest.InterestApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a.AbstractC49787b;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a.C49788c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import java.util.concurrent.Callable;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl */
public abstract class FeedModuleServiceCommonImpl implements IFeedModuleService {
    static {
        Covode.recordClassIndex(57084);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.IFeedModuleService
    public boolean fullscreenShowLive() {
        return false;
    }

    public void requestInterestSelect() {
    }

    public String getFeedRequstParam() {
        return C46864dy.f109193c;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.IFeedModuleService
    public boolean canResumePlay() {
        String str = C46864dy.f109193c;
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public void maybeRequestAfterFirstFrame() {
        if (C46864dy.m90175d() && C46864dy.m90173b() != 0 && !C46864dy.f109198h) {
            C46864dy.f109198h = true;
            C39162r.m79460a("ask_interest_lable", new C33744d().mo59983a("enter_from", "homepage_hot").mo59983a("user_id", C49701a.m93115a()).f79943a);
            C51423a.m95791b(4, C46864dy.f109192b, "start to request,current expr is group1:" + C46864dy.f109200j.mo79348e());
            ((InterestApi) C46864dy.f109195e.getValue()).getInterestList().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(C46864dy.C46867c.f109211a, C46864dy.C46868d.f109212a);
        }
    }

    public void setFeedRequstParam(String str) {
        if (!C89219l.m154714a((Object) str, (Object) C46864dy.f109193c)) {
            C46864dy.f109193c = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.IFeedModuleService
    public AbstractC49787b newTopNoticeFeedManager(Activity activity, View view) {
        return C49788c.m93240a(activity, view);
    }

    public void mobStartRequest(Fragment fragment, String str) {
        new C50520x(fragment).mo85843a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.IFeedModuleService
    public Integer getInsertIndex(int i, Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (C46864dy.f109200j.mo79348e()) {
            int c = C46864dy.m90174c() - 1;
            int i2 = i + 2;
            if (i2 >= c) {
                c = i2;
            }
            return Integer.valueOf(c);
        } else if (C46864dy.f109200j.mo79349f()) {
            return Integer.valueOf(i + 1);
        } else {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.IFeedModuleService
    public void maybeMonitorTimeSpend(Aweme aweme, Long l) {
        long longValue = l.longValue();
        if (C46864dy.f109197g && C46864dy.m90175d() && C46864dy.f109200j.mo79349f() && aweme != null && !aweme.isAd()) {
            if (System.currentTimeMillis() - longValue <= ((long) C46864dy.m90176g()) * 1000) {
                int i = C46864dy.f109196f + 1;
                C46864dy.f109196f = i;
                if (i >= C46864dy.m90177h()) {
                    Activity j = C17873f.m33102j();
                    if (j instanceof AbstractC59103j) {
                        C46864dy.m90172a(j);
                        C46864dy.f109197g = false;
                        return;
                    }
                    C51423a.m95784a(4, C46864dy.f109192b, "not insert cause not IMainActivity");
                    return;
                }
                return;
            }
            C46864dy.f109196f = 0;
        }
    }

    public void commitFeedRequest(int i, WeakHandler weakHandler, Callable callable, int i2, boolean z) {
        C49710k.m93118a(i, -1, weakHandler, callable, i2, z, null);
    }
}
