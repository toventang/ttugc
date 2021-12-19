package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49693u;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59254s;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.C66639l;
import com.p2082ss.android.ugc.aweme.recommend.C66640m;
import com.p2082ss.android.ugc.aweme.recommend.C66642o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.d */
public final class C22831d implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public final Fragment f53923a;

    /* renamed from: b */
    public String f53924b;

    /* renamed from: c */
    private final AbstractC56223a f53925c;

    /* renamed from: d */
    private final HomePageDataViewModel f53926d;

    /* renamed from: e */
    private final ScrollSwitchStateManager f53927e;

    /* renamed from: f */
    private boolean f53928f;

    static {
        Covode.recordClassIndex(26729);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(18, new RunnableC90250g(C22831d.class, "onVideoPageChangeEvent", C49693u.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo37157a() {
        if (this.f53923a.getActivity() != null) {
            Aweme aweme = this.f53926d.f121745k;
            if (aweme == null || !C37699a.m76199B(aweme)) {
                if (C66642o.m118413b() && C66642o.m118412a(aweme)) {
                    m43055a("", "HOME");
                }
                C66639l.f149800b = true;
                return;
            }
            this.f53928f = true;
        }
    }

    @AbstractC90264r
    public final void onVideoPageChangeEvent(C49693u uVar) {
        C89219l.m154721d(uVar, "");
        if (uVar.f114359a != null) {
            this.f53926d.f121745k = uVar.f114359a;
            Aweme aweme = uVar.f114359a;
            C89219l.m154716b(aweme, "");
            if (aweme.getAuthor() != null) {
                Aweme aweme2 = uVar.f114359a;
                C89219l.m154716b(aweme2, "");
                User author = aweme2.getAuthor();
                C89219l.m154716b(author, "");
                this.f53924b = author.getUid();
            } else {
                this.f53924b = "";
            }
            if (this.f53928f && this.f53923a.getActivity() != null) {
                this.f53928f = false;
                mo37157a();
            }
        }
    }

    /* renamed from: a */
    public final String mo37156a(String str) {
        if (str == null) {
            return "";
        }
        if (TextUtils.equals(str, "HOME")) {
            String j = this.f53925c.mo93047j();
            if (j != null) {
                return j;
            }
            return "homepage_hot";
        } else if (TextUtils.equals(str, "DISCOVER")) {
            return "discovery";
        } else {
            if (TextUtils.equals(str, "NOTIFICATION")) {
                return "notification_page";
            }
            if (!TextUtils.equals(str, "USER")) {
                return "homepage_hot";
            }
            Fragment b = this.f53927e.mo89347b();
            if (b instanceof AbstractC59254s) {
                return ((AbstractC59254s) b).mo96829f();
            }
            return "personal_homepage";
        }
    }

    /* renamed from: a */
    private void m43055a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if ((TextUtils.equals(str, "HOME") || TextUtils.equals(str2, "HOME")) && TextUtils.equals(this.f53925c.mo93044g(), "homepage_hot")) {
            C66639l.m118407a(new C66640m(new WeakReference(this.f53923a.getActivity()), mo37156a(str2), mo37156a(str), (byte) 0));
        }
    }

    public C22831d(AbstractC56223a aVar, Fragment fragment, HomePageDataViewModel homePageDataViewModel, ScrollSwitchStateManager scrollSwitchStateManager) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(homePageDataViewModel, "");
        C89219l.m154721d(scrollSwitchStateManager, "");
        this.f53925c = aVar;
        this.f53923a = fragment;
        this.f53926d = homePageDataViewModel;
        this.f53927e = scrollSwitchStateManager;
        EventBus.m156966a(EventBus.m156962a(), this);
    }
}
