package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.p1998c.p1999a.C27241i;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.experiment.C46937fn;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59393g;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59394h;
import com.p2082ss.android.ugc.aweme.mix.model.C59864a;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.profile.model.LiveReplayCover;
import com.p2082ss.android.ugc.aweme.profile.model.PostGuideTasks;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o;
import com.p2082ss.android.ugc.aweme.profile.service.C63868c;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.model.C77380c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.a.b */
public final class C63347b extends AbstractC39058d {

    /* renamed from: A */
    public String f143778A;

    /* renamed from: B */
    public boolean f143779B;

    /* renamed from: C */
    public String f143780C = "";

    /* renamed from: D */
    public C59864a f143781D;

    /* renamed from: E */
    public C77380c f143782E = null;

    /* renamed from: F */
    public AbstractC59394h f143783F;

    /* renamed from: G */
    public int f143784G = 0;

    /* renamed from: H */
    protected String f143785H;

    /* renamed from: I */
    private AbstractC39097c f143786I;

    /* renamed from: J */
    private RecyclerView.ViewHolder f143787J;

    /* renamed from: K */
    private PostGuideTasks f143788K;

    /* renamed from: L */
    private ArrayList<LiveReplayCover> f143789L = new ArrayList<>();

    /* renamed from: M */
    private boolean f143790M = false;

    /* renamed from: N */
    private boolean f143791N = false;

    /* renamed from: O */
    private boolean f143792O = false;

    /* renamed from: P */
    private boolean f143793P = false;

    /* renamed from: Q */
    private boolean f143794Q = false;

    /* renamed from: R */
    private int f143795R = 0;

    /* renamed from: d */
    public boolean f143796d;

    /* renamed from: e */
    public boolean f143797e = true;

    /* renamed from: f */
    public boolean f143798f;

    /* renamed from: g */
    AbstractC35500d f143799g;

    /* renamed from: h */
    public C43223c f143800h;

    /* renamed from: i */
    public LiveRoomStruct f143801i;

    /* renamed from: j */
    public boolean f143802j;

    /* renamed from: k */
    protected int f143803k;

    /* renamed from: w */
    public boolean f143804w = true;

    /* renamed from: x */
    public boolean f143805x = true;

    /* renamed from: y */
    public ActivityC0945e f143806y;

    /* renamed from: z */
    public String f143807z;

    static {
        Covode.recordClassIndex(74638);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: g */
    public final boolean mo67821g() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: e */
    public final List<Aweme> mo63369e() {
        return this.f92236l;
    }

    /* renamed from: p */
    public final int mo101983p() {
        return super.mo60933c();
    }

    /* renamed from: s */
    public final boolean mo101986s() {
        if (this.f143788K != null) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private int m114909t() {
        int i;
        boolean z = this.f143796d;
        if (this.f143801i != null) {
            i = 1;
        } else {
            i = 0;
        }
        return (z ? 1 : 0) + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: f */
    public final void mo67810f() {
        this.f143788K = null;
        this.f143801i = null;
        super.mo67810f();
    }

    /* renamed from: n */
    public final boolean mo101981n() {
        if (!this.f143792O || !mo101984q()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public final int mo60933c() {
        int i;
        int o = mo101982o() + super.mo60933c();
        if (this.f143788K == null) {
            i = 0;
        } else {
            i = 1;
        }
        return o + i + (this.f143794Q ? 1 : 0);
    }

    /* renamed from: o */
    public final int mo101982o() {
        return m114909t() + this.f143789L.size() + (this.f143793P ? 1 : 0) + (this.f143791N ? 1 : 0) + (this.f143792O ? 1 : 0);
    }

    /* renamed from: q */
    public final boolean mo101984q() {
        if (!this.f143802j || !C77260g.f173332a.mo120146a() || this.f143803k != 14) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final void mo101985r() {
        if (!C27241i.m54222a(this.f143788K, null)) {
            this.f143788K = null;
            mo67829d(true);
            notifyDataSetChanged();
        }
    }

    /* renamed from: u */
    private boolean m114910u() {
        if (this.f143802j && this.f143803k == 0) {
            C63786o.f144583c = C63786o.m115352b(m114909t() + this.f143789L.size() + super.mo60933c());
        }
        if (!C63786o.m115352b(m114909t() + this.f143789L.size() + super.mo60933c()) || !this.f143802j || this.f143803k != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m114911v() {
        if (this.f143802j && this.f143803k == 0) {
            C63786o.f144582b = C63786o.m115350a(super.mo60933c() + mo101982o());
        }
        if (!C63786o.m115350a(super.mo60933c() + mo101982o()) || !this.f143802j || this.f143803k != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void mo101980m() {
        if (this.f143793P != m114910u() || this.f143794Q != m114911v() || this.f143795R != C63786o.m115358h()) {
            this.f143793P = m114910u();
            this.f143794Q = m114911v();
            this.f143795R = C63786o.m115358h();
            notifyDataSetChanged();
        }
    }

    /* renamed from: l */
    public final void mo101979l() {
        boolean z;
        boolean z2 = true;
        if (!this.f143802j ? this.f143803k != 0 || super.mo60933c() <= 0 || !this.f143790M : this.f143803k != 0 || super.mo60933c() <= 0 || !this.f143790M || !MixFeedService.m109435k().mo97327c()) {
            z = false;
        } else {
            z = true;
        }
        this.f143791N = z;
        if (this.f143802j) {
            this.f143793P = m114910u();
            this.f143794Q = m114911v();
        }
        if (!this.f143792O || !mo101984q()) {
            z2 = false;
        }
        this.f143792O = z2;
    }

    public final String toString() {
        String str;
        int i = this.f143803k;
        if (i == 0) {
            str = "TYPE_PUBLISH_AWEME";
        } else if (i == 1) {
            str = "TYPE_FAVORITE_AWEME";
        } else if (i == 2) {
            str = "TYPE_STORY_AWEME";
        } else if (i == 3) {
            str = "TYPE_ORIGIN_MUSIC";
        } else if (i == 4) {
            str = "TYPE_COLLECT_AWEME";
        } else if (i != 5) {
            str = "TYPE_TOOL_MASTER";
        } else {
            str = "TYPE_DYNAMIC_STATE";
        }
        return "profileListType: " + str + ", itemCount: " + getItemCount() + ", baseCount: " + mo60933c() + ", mShowDraftBox: " + this.f143796d + ", mShowFooter: " + this.f92274v + ", isMyProfile: " + this.f143802j;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        this.f143787J = a_;
        return a_;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b */
    public final void mo62376b(List<Aweme> list) {
        super.mo62376b(list);
        m114908e(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<Aweme> list) {
        super.mo62377b_(list);
        m114908e(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: d */
    public final void mo67829d(boolean z) {
        boolean z2;
        if (this.f143788K != null || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        super.mo67829d(z2);
    }

    /* renamed from: a */
    private Aweme m114905a(int i) {
        int o = i - mo101982o();
        if (this.f92236l != null && o >= 0 && o < this.f92236l.size()) {
            return (Aweme) this.f92236l.get(o);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d
    /* renamed from: b */
    public final boolean mo67805b(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 7) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        GridLayoutManager.AbstractC1337c cVar;
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (cVar = ((GridLayoutManager) layoutManager).f4321g) != null) {
            cVar.f4328c = true;
            cVar.f4329d = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C63384r) {
            C63384r rVar = (C63384r) viewHolder;
            rVar.f143923g.isUserProfileFragmentVisible2().removeObserver(rVar);
        }
    }

    /* renamed from: b */
    public final void mo101978b(String str) {
        mo67814a((CharSequence) str);
        RecyclerView.ViewHolder viewHolder = this.f143787J;
        if (viewHolder != null) {
            TextView textView = (TextView) ((DmtStatusView) viewHolder.itemView).mo27380b(1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 1;
            textView.setLayoutParams(layoutParams);
            textView.setTextColor(C0643b.m2378c(this.f143806y, R.color.c4));
            textView.setText(str);
            ap_();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC39097c cVar;
        super.onViewAttachedToWindow(viewHolder);
        if (this.f143798f && mo67805b(viewHolder) && (cVar = this.f143786I) != null) {
            cVar.mo67855a(viewHolder);
        }
        if (viewHolder instanceof C63384r) {
            C63384r rVar = (C63384r) viewHolder;
            rVar.f143923g.isUserProfileFragmentVisible2().observe(rVar.f143926j, rVar);
        }
    }

    /* renamed from: a */
    public final void mo101976a(C77380c cVar) {
        this.f143782E = cVar;
        boolean z = true;
        if (cVar == null || cVar.getItems() == null || cVar.getItems().isEmpty() || !mo101984q()) {
            z = false;
        }
        this.f143792O = z;
    }

    /* renamed from: e */
    private void m114908e(List<Aweme> list) {
        if (this.f143802j && this.f143803k == 0 && list != null) {
            int size = list.size();
            int awemeCount = C31575b.m65865g().getCurUser().getAwemeCount();
            if (size > awemeCount) {
                C39162r.m79460a("publish_num_check", new C33744d().mo59980a("error_type", 1).mo59983a("num_des", size + "-" + awemeCount).f79943a);
            }
            if (size == 0 && awemeCount == 1) {
                C39162r.m79460a("publish_num_check", new C33744d().mo59980a("error_type", 2).mo59983a("num_des", size + "-" + awemeCount).f79943a);
            }
            if (!this.f143805x && size != awemeCount) {
                C39162r.m79460a("publish_num_check", new C33744d().mo59980a("error_type", 3).mo59983a("num_des", size + "-" + awemeCount).f79943a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: c */
    public final int mo60936c(int i) {
        int i2;
        int t;
        if (!this.f143792O) {
            i2 = 0;
        } else if (i == 0) {
            return 11;
        } else {
            i2 = 1;
        }
        if (this.f143791N) {
            if (i == i2) {
                return 10;
            }
            i2++;
        }
        if (this.f143803k == 15) {
            return 7;
        }
        if (this.f143796d) {
            if (i2 == i) {
                return 1;
            }
            i2++;
        }
        if (this.f143801i != null && i2 == i) {
            return 3;
        }
        if (this.f143789L.size() > 0 && i >= (t = m114909t()) && i < t + this.f143789L.size()) {
            return 6;
        }
        Aweme a = m114905a(i);
        if (a != null) {
            if (a.getAwemeType() == 40 && a.getUserStory() != null) {
                return 12;
            }
            if (a.getAwemeType() == 2) {
                return 2;
            }
            if (a.isForwardAweme()) {
                return 7;
            }
        }
        if (this.f143788K != null && i == mo60933c() - 1) {
            return 5;
        }
        if (i == 0 && this.f143802j && this.f143793P) {
            return 9;
        }
        if (!this.f143802j || ((this.f92236l != null && i != mo60933c() - 1) || !this.f143794Q)) {
            return super.mo60936c(i);
        }
        return 8;
    }

    /* renamed from: a */
    private static boolean m114907a(int i, boolean z) {
        if (i != 4 || !z || C63868c.f144795a.isDataSetChangedOnStart()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo101977a(boolean z, C59864a aVar) {
        if (this.f143790M != z) {
            this.f143790M = z;
            this.f143781D = aVar;
            notifyDataSetChanged();
            return;
        }
        List<C59867d> list = null;
        List<C59867d> mixList = aVar == null ? null : aVar.getMixList();
        C59864a aVar2 = this.f143781D;
        if (aVar2 != null) {
            list = aVar2.getMixList();
        }
        if (!(mixList == null || list == null || mixList.size() != list.size())) {
            for (int i = 0; i < mixList.size(); i++) {
                if (mixList.get(i).mixId.equals(list.get(i).mixId) && mixList.get(i).getMixName().equals(list.get(i).getMixName())) {
                }
            }
            return;
        }
        this.f143781D = aVar;
        notifyDataSetChanged();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        String str;
        View a;
        switch (i) {
            case 1:
                return new C63356e(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aps, viewGroup, false));
            case 2:
                return new C63378p(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.any, viewGroup, false), this.f143785H, this.f143799g);
            case 3:
                return new C63384r(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ao5, viewGroup, false), this.f143806y);
            case 4:
            default:
                if (C46937fn.f109392b) {
                    a = C1870c.m6046a(this.f143806y, R.layout.anm, viewGroup, false);
                } else {
                    a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.anm, viewGroup, false);
                }
                this.f143784G++;
                return new C63351c(a, this.f143785H, this.f143799g);
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return new C63400t(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ao6, viewGroup, false));
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                throw new IllegalArgumentException("not supported in i18n");
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                throw new IllegalArgumentException("not supported in i18n");
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return new C63374n(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.anv, viewGroup, false), this.f143806y);
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return new C63375o(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.anx, viewGroup, false), this.f143806y);
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                if (this.f143802j) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                return MixFeedService.m109435k().mo97305a(viewGroup, this.f143802j, false, str, (AbstractC59393g) null);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return new C63405u(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ao_, viewGroup, false), this.f143806y);
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return new C63408v(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aoa, viewGroup, false), this.f143785H, this);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f3  */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60186a(final androidx.recyclerview.widget.RecyclerView.ViewHolder r25, final int r26) {
        /*
        // Method dump skipped, instructions count: 1526
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3565a.C63347b.mo60186a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: a */
    public static void m114906a(int i, boolean z, Aweme aweme) {
        if (m114907a(i, z) && aweme != null) {
            C63868c.f144795a.onVideoItemActionShow(aweme);
        }
    }

    public C63347b(ActivityC0945e eVar, String str, boolean z, int i, AbstractC35500d dVar, AbstractC39097c cVar, String str2, String str3) {
        this.f143806y = eVar;
        this.f143785H = str;
        this.f143799g = dVar;
        this.f143802j = z;
        this.f143803k = i;
        this.f143786I = cVar;
        this.f143807z = str2;
        this.f143778A = str3;
        registerAdapterDataObserver(new RecyclerView.AbstractC1353c() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63347b.C633481 */

            static {
                Covode.recordClassIndex(74639);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4655a() {
                super.mo4655a();
                C63347b.this.mo101979l();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: b */
            public final void mo4660b(int i, int i2) {
                super.mo4660b(i, i2);
                C63347b.this.mo101979l();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: c */
            public final void mo4661c(int i, int i2) {
                super.mo4661c(i, i2);
                C63347b.this.mo101979l();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4656a(int i, int i2) {
                super.mo4656a(i, i2);
                C63347b.this.mo101979l();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4657a(int i, int i2, int i3) {
                super.mo4657a(i, i2, i3);
                C63347b.this.mo101979l();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4658a(int i, int i2, Object obj) {
                super.mo4658a(i, i2, obj);
                C63347b.this.mo101979l();
            }
        });
    }
}
