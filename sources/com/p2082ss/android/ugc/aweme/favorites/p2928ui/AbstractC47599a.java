package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39108i;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.utils.C80472gc;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.a */
public abstract class AbstractC47599a extends AbstractC64118co implements AbstractC39102c, AbstractC39103d, AbstractC49762o {

    /* renamed from: a */
    RecyclerView f110450a;

    /* renamed from: b */
    TuxStatusView f110451b;

    /* renamed from: c */
    AbstractC39060f f110452c;

    /* renamed from: d */
    protected String f110453d;

    /* renamed from: e */
    protected boolean f110454e = true;

    /* renamed from: j */
    public C39101b<AbstractC39100a> f110455j;

    /* renamed from: k */
    private boolean f110456k = true;

    static {
        Covode.recordClassIndex(56221);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final boolean mo62670a(C39108i iVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo79779c();

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo79780k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo79781l();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract AbstractC39060f mo79782n();

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final void bS_() {
        mo79783o();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final void ba_() {
        mo79780k();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final boolean bn_() {
        return this.f110456k;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final boolean ci_() {
        return this.f110454e;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f110454e = true;
    }

    /* renamed from: a */
    private static boolean mo79703a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        if (af_()) {
            this.f110452c.ao_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        if (af_()) {
            this.f110451b.mo37867a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        if (!af_()) {
            return null;
        }
        return this.f110450a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo79784p() {
        AbstractC39060f n = mo79782n();
        this.f110452c = n;
        this.f110450a.setAdapter(n);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: s */
    public void mo79786s() {
        C39101b<AbstractC39100a> bVar = this.f110455j;
        if (bVar != null && bVar.f92286h != null) {
            this.f110455j.mo57528c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public void mo59525f() {
        if (af_()) {
            mo79785q();
            this.f110450a.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo79785q() {
        TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
        cVar.mo37878a((CharSequence) getString(R.string.bmo));
        this.f110451b.setStatus(cVar);
        this.f110451b.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: g */
    public final void mo65254g() {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        View childAt;
        if (!(!getUserVisibleHint() || (recyclerView = this.f110450a) == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) == null)) {
            int k = linearLayoutManager.mo4371k();
            int m = linearLayoutManager.mo4373m();
            for (int i = k; i <= m; i++) {
                if (i >= 0 && i < linearLayoutManager.mo4685A() && (childAt = this.f110450a.getChildAt(i - k)) != null && this.f110450a.mo4393a(childAt) != null && (this.f110450a.mo4393a(childAt) instanceof C47434a.AbstractC47435a)) {
                    ((C47434a.AbstractC47435a) this.f110450a.mo4393a(childAt)).mo79706c();
                }
            }
        }
    }

    /* renamed from: o */
    public final boolean mo79783o() {
        if (!af_()) {
            return false;
        }
        getActivity();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = mo79703a();
        }
        if (!C58029j.f132256h) {
            if (!this.f110454e) {
                new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            }
            this.f110454e = true;
            return false;
        }
        this.f110454e = false;
        this.f110451b.mo37867a();
        boolean z = !this.f110455j.mo67842j();
        if (TextUtils.isEmpty(this.f110453d)) {
            this.f110453d = C31575b.m65865g().getCurUserId();
        }
        if (!TextUtils.isEmpty(this.f110453d)) {
            mo79779c();
        }
        return z;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        if (af_()) {
            this.f110452c.mo67823i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    /* renamed from: a */
    public final void mo59513a(boolean z) {
        if (!z) {
            this.f110452c.mo67813a((AbstractC39063h.AbstractC39067a) null);
            this.f110452c.mo67825k();
            this.f110452c.mo67829d(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: b */
    public final void mo62671b(int i) {
        if (af_()) {
            this.f110452c.notifyItemRemoved(i);
            if (this.f110452c.mo60933c() == 0) {
                mo79785q();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo79778a(View view) {
        this.f110450a = (RecyclerView) view.findViewById(R.id.a7r);
        this.f110451b = (TuxStatusView) view.findViewById(R.id.e7i);
        this.f110450a.setOverScrollMode(2);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.mo4356b(1);
        this.f110450a.setLayoutManager(wrapLinearLayoutManager);
        this.f110450a.mo4402a(new C47601a());
        this.f110450a = C80472gc.m139484a(this.f110450a, this, 2);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        if (af_()) {
            this.f110451b.setVisibility(0);
            this.f110451b.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C47674b(this)));
            this.f110454e = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo79778a(view);
        mo79784p();
        C39101b<AbstractC39100a> bVar = new C39101b<>();
        this.f110455j = bVar;
        bVar.mo67839a_(this);
        this.f110455j.mo67865a((AbstractC39103d) this);
        mo79781l();
        if (this.f145458N) {
            mo79783o();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final void mo62668a(List list, int i) {
        if (!af_() || C13603b.m24435a((Collection) list)) {
            return;
        }
        if (this.f110452c.mo60933c() == 0) {
            this.f110452c.mo62377b_(list);
            return;
        }
        this.f110452c.notifyItemInserted(i);
        RecyclerView recyclerView = this.f110450a;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a.RunnableC476001 */

                static {
                    Covode.recordClassIndex(56222);
                }

                public final void run() {
                    AbstractC47599a.this.f110450a.mo4413b(0);
                    AbstractC47599a.this.f110450a.requestFocus();
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List list, boolean z) {
        if (af_()) {
            this.f110452c.aq_();
            this.f110452c.mo62376b(list);
            this.f110451b.setVisibility(4);
            if (this.f110450a.getVisibility() == 4) {
                this.f110450a.setVisibility(0);
            }
            this.f110456k = z;
            mo59513a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public void mo59512a(List list, boolean z) {
        if (af_()) {
            this.f110452c.aq_();
            this.f110452c.mo67829d(true);
            this.f110452c.mo62377b_(list);
            this.f110456k = z;
            this.f110451b.setVisibility(4);
            if (this.f110450a.getVisibility() == 4) {
                this.f110450a.setVisibility(0);
            }
            mo59513a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.mm, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.a$a */
    public static class C47601a extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        private int f110458a = 1;

        static {
            Covode.recordClassIndex(56223);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            rect.bottom = this.f110458a;
        }
    }
}
