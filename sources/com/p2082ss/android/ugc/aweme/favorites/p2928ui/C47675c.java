package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35501a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.favorites.model.C47469a;
import com.p2082ss.android.ugc.aweme.favorites.p2919a.C47178a;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.c */
public class C47675c extends AbstractC47599a implements AbstractC90252i, AbstractC90253j {
    static {
        Covode.recordClassIndex(56297);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(144, new RunnableC90250g(C47675c.class, "onChallengeCollectEvent", C35501a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new RunnableC90250g(C47675c.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: s */
    public final void mo79786s() {
        mo79783o();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: l */
    public final void mo79781l() {
        if (this.f110455j != null) {
            this.f110455j.mo67838a((AbstractC39085b) new C47469a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: n */
    public final AbstractC39060f mo79782n() {
        return new C47178a(getActivity());
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: p */
    public final void mo79784p() {
        super.mo79784p();
        if (this.f110450a != null) {
            this.f110450a.setBackground(null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: c */
    public final void mo79779c() {
        if (this.f110455j != null) {
            C18285c.m34003a("discovery_collect_hashtag_native_list_first_screen");
            this.f110455j.mo57616a(1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: k */
    public final void mo79780k() {
        if (this.f110455j != null) {
            this.f110455j.mo57616a(4);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: q */
    public final void mo79785q() {
        C22999a aVar = new C22999a();
        aVar.f54431a = R.raw.icon_large_bookmark;
        aVar.f54435e = Integer.valueOf((int) R.attr.bd);
        this.f110451b.setStatus(new TuxStatusView.C23263c().mo37877a(aVar).mo37879a(getString(R.string.bs4)).mo37878a((CharSequence) getString(R.string.bs3)));
        this.f110451b.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: a */
    public final void mo79778a(View view) {
        super.mo79778a(view);
        C80330da.C80331a.m139266a("discovery_collect_hashtag_recycler_list").mo123698a(this.f110450a);
    }

    @AbstractC90264r
    public void onAntiCrawlerEvent(C34569a aVar) {
        String str = aVar.f81610a;
        if (str != null && str.contains("/aweme/v1/challenge/listcollection/?")) {
            EventBus.m156962a().mo145397d(aVar);
            mo79779c();
        }
    }

    @AbstractC90264r
    public void onChallengeCollectEvent(C35501a aVar) {
        List items;
        if (af_()) {
            Challenge challenge = aVar.f83726a;
            boolean z = false;
            if (challenge.getCollectStatus() == 0 && this.f110455j != null && this.f110455j.f92286h != null && (items = ((AbstractC39100a) this.f110455j.f92286h).getItems()) != null && items.size() > 0) {
                Iterator it = items.iterator();
                while (it.hasNext()) {
                    Challenge challenge2 = (Challenge) it.next();
                    if (challenge2 != null && !TextUtils.isEmpty(challenge2.getCid()) && challenge2.getCid().equals(challenge.getCid())) {
                        it.remove();
                        z = true;
                    }
                }
                if (z) {
                    this.f110452c.notifyDataSetChanged();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List list, boolean z) {
        C18285c.m34003a("discovery_collect_hashtag_native_list_render");
        super.mo59512a(list, z);
        if (af_() && this.f110450a != null) {
            this.f110450a.post(RunnableC47676d.f110543a);
        }
    }
}
