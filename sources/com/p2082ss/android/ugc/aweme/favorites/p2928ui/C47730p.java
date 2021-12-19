package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.favorites.model.C47473d;
import com.p2082ss.android.ugc.aweme.favorites.model.C47476f;
import com.p2082ss.android.ugc.aweme.favorites.p2919a.C47183d;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.p */
public class C47730p extends AbstractC47599a implements AbstractC90252i, AbstractC90253j {
    static {
        Covode.recordClassIndex(56352);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new RunnableC90250g(C47730p.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
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
            this.f110455j.mo67838a((AbstractC39085b) new C47476f());
        }
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
    /* renamed from: n */
    public final AbstractC39060f mo79782n() {
        if (getActivity() != null) {
            return new C47183d(getActivity(), this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: q */
    public final void mo79785q() {
        C22999a aVar = new C22999a();
        aVar.f54431a = R.raw.icon_large_error_qa;
        aVar.f54435e = Integer.valueOf((int) R.attr.bd);
        this.f110451b.setStatus(new TuxStatusView.C23263c().mo37877a(aVar).mo37879a(getString(R.string.f0r)).mo37878a((CharSequence) getString(R.string.f0q)));
        this.f110451b.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: a */
    public final void mo79778a(View view) {
        super.mo79778a(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f110450a.getLayoutParams();
        marginLayoutParams.topMargin = (int) C13628n.m24520b(getContext(), 8.0f);
        this.f110450a.setLayoutParams(marginLayoutParams);
    }

    @AbstractC90264r
    public void onAntiCrawlerEvent(C34569a aVar) {
        String str = aVar.f81610a;
        if (str != null && str.contains("/tiktok/v1/forum/listcollection/?")) {
            EventBus.m156962a().mo145397d(aVar);
            mo79779c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List list, boolean z) {
        int i;
        super.mo59512a(list, z);
        if (this.f110455j.f92286h instanceof C47476f) {
            C47476f fVar = (C47476f) this.f110455j.f92286h;
            if (fVar.mData == null) {
                i = 0;
            } else {
                i = ((C47473d) fVar.mData).f110290d;
            }
            ActivityC0945e activity = getActivity();
            if (i != 0 && activity != null) {
                new C23144b(this).mo37635a(activity.getString(R.string.f0s, Integer.valueOf(i))).mo37637b();
            }
        }
    }
}
