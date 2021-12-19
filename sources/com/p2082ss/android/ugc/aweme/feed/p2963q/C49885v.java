package com.p2082ss.android.ugc.aweme.feed.p2963q;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48142ac;
import com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49588e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49750g;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49764q;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.main.C59063c;
import com.p2082ss.android.ugc.aweme.main.p3429c.C59065b;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.feed.q.v */
public class C49885v extends C49888x {

    /* renamed from: a */
    public AbstractC49588e f114981a;

    /* renamed from: b */
    public AbstractC49750g f114982b;

    /* renamed from: c */
    public AbstractC49764q f114983c;

    /* renamed from: r */
    private boolean f114984r = true;

    /* renamed from: s */
    private boolean f114985s;

    static {
        Covode.recordClassIndex(58992);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: aW */
    public final void mo84715aW() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(191, new RunnableC90250g(C49885v.class, "onFollowCleanModeChangedEvent", C59065b.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: H */
    public final void mo70402H() {
        super.mo70402H();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x
    /* renamed from: c */
    public final boolean mo84905c() {
        return super.mo84905c();
    }

    /* renamed from: d */
    public final void mo84906d() {
        this.f114760O.setVisibility(8);
    }

    /* renamed from: j */
    public final void mo84908j() {
        this.f114760O.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: by */
    public final void mo84772by() {
        super.mo84772by();
        if (this.f114823ay) {
            this.f114823ay = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x
    /* renamed from: f */
    public final void mo84907f() {
        super.mo84907f();
        if (this.f114989bu) {
            ScrollSwitchStateManager.C52950a.m97811a((ActivityC0945e) this.f183419bv).mo89345a(false);
        }
        if (this.f114768W != null && this.f114768W.getCount() > 0) {
            if (this.f114989bu) {
                mo84717aY();
            }
            this.f114768W.mo80286a(Collections.emptyList());
            this.f114768W.f111624b = false;
            View bv = mo84769bv();
            if (bv != null) {
                bv.setAlpha(0.0f);
            }
        }
        mo84927l();
        AbstractC49588e eVar = this.f114981a;
        if (eVar != null) {
            eVar.mo81326a(this.f114778aF);
        }
        AbstractC49764q qVar = this.f114983c;
        if (qVar != null) {
            qVar.mo71309d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: q */
    public final void mo70513q() {
        Aweme a;
        if (C76660b.m134246f() && TextUtils.equals(this.f114782aJ.getEventType(), "homepage_follow")) {
            Aweme c = this.f114768W.mo80287c(0);
            if (C50545m.m94762a(c) && C76706a.m134277c(c) && (a = C77260g.f173332a.mo120157e().mo120171a(c.getAuthorUid())) != null && a != c) {
                this.f114768W.mo80327d().set(0, a);
                AbstractC48149ai n = mo84791n(a.getAid());
                if (n != null) {
                    n.mo70615a(a);
                }
            }
        }
        super.mo70513q();
    }

    public C49885v(String str) {
        super(str, 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: b */
    public final void mo71320b(FollowStatus followStatus) {
        super.mo71320b(followStatus);
        if (followStatus != null && followStatus.followStatus == 0) {
            mo84919a(followStatus.userId);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: g */
    public final void mo70495g(String str) {
        super.mo70495g(str);
        if (!this.f114985s) {
            this.f114985s = true;
            C35434c.m72464b("homepage_follow");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: n */
    public final void mo84793n(boolean z) {
        super.mo84793n(z);
        if (!this.f114842bq) {
            this.f114823ay = true;
        } else {
            this.f114823ay = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x
    /* renamed from: c */
    public final void mo84904c(Exception exc) {
        super.mo84904c(exc);
        new C79459a(this.f183419bv).mo123050a(R.string.g1d).mo123053a();
    }

    @AbstractC90264r
    public void onFollowCleanModeChangedEvent(C59065b bVar) {
        boolean z = C59063c.m108543a().f134456b;
        for (int i = 0; i < this.f114759N.getChildCount(); i++) {
            AbstractC48149ai j = mo84782j(i);
            if (j != null) {
                j.mo80095b(z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x
    /* renamed from: b */
    public final void mo84903b(List<Aweme> list, boolean z) {
        super.mo84903b(list, z);
        if (!z) {
            this.f114758M.mo85752c();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo62668a(List<Aweme> list, int i) {
        if (this.f114768W.getCount() == 0) {
            this.f114768W.mo80286a(list);
        } else {
            this.f114768W.mo80322a(list, i);
        }
        if (i >= 0 && i < this.f114768W.getCount()) {
            this.f114759N.setCurrentItem(i);
            Aweme c = this.f114768W.mo80287c(i);
            if (C76706a.m134277c(c)) {
                mo84754bg().mo80114a(c, i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x
    /* renamed from: a */
    public final void mo84902a(List<Aweme> list, boolean z) {
        AbstractC49588e eVar = this.f114981a;
        if (eVar != null) {
            eVar.mo81333c();
        }
        if (this.f183419bv instanceof ActivityC0945e) {
            FollowPageFirstFrameViewModel.m138884a((ActivityC0945e) this.f183419bv);
        }
        super.mo84902a(list, z);
        if (!this.f114984r) {
            if (!C13603b.m24435a((Collection) list)) {
                mo84851q(list.get(0));
            }
            this.f114984r = false;
        }
        if (this.f114989bu) {
            ScrollSwitchStateManager.C52950a.m97811a((ActivityC0945e) this.f183419bv).mo89345a(!C13603b.m24435a((Collection) this.f114768W.mo80288e()));
        }
        AbstractC49750g gVar = this.f114982b;
        if (gVar == null || !gVar.mo84306g()) {
            new C79459a(this.f183419bv).mo123050a(R.string.b3f).mo123053a();
            AbstractC49764q qVar = this.f114983c;
            if (qVar != null) {
                qVar.mo71309d();
                return;
            }
            return;
        }
        final int currentItem = this.f114759N.getCurrentItem();
        final Aweme c = this.f114768W.mo80287c(currentItem);
        this.f114759N.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49885v.RunnableC498861 */

            static {
                Covode.recordClassIndex(58993);
            }

            public final void run() {
                if (C49885v.this.f114759N != null) {
                    C49885v.this.f114770Y = 0;
                    if (currentItem == 0) {
                        C49885v.this.mo84789m(c);
                        C49885v.this.f114800ab = false;
                    } else {
                        C49885v.this.f114800ab = true;
                        C49885v.this.f114759N.mo67973a(C49885v.this.f114770Y, true);
                    }
                    if (C49885v.this.f114983c != null) {
                        C49885v.this.f114983c.mo71309d();
                    }
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final AbstractC48191b mo70459a(Context context, LayoutInflater layoutInflater, AbstractC49691s<C49672ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, AbstractC49439l lVar) {
        return new C48142ac(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
    }
}
