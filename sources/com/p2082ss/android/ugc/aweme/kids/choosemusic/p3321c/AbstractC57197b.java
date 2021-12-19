package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57172a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57237e;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57238a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57241c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57293q;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.b */
public abstract class AbstractC57197b extends AbstractC34586a implements AbstractC1214u<C33942b>, AbstractC39063h.AbstractC39067a, C39211a.AbstractC39212a {

    /* renamed from: a */
    RecyclerView f130262a;

    /* renamed from: b */
    TuxStatusView f130263b;

    /* renamed from: c */
    public DataCenter f130264c;

    /* renamed from: d */
    public C33947e f130265d;

    /* renamed from: e */
    public C57172a f130266e;

    /* renamed from: j */
    AbstractC57234b f130267j;

    /* renamed from: k */
    AbstractC57237e f130268k;

    /* renamed from: l */
    AbstractC57080c<C57192b> f130269l;

    /* renamed from: m */
    public C57238a f130270m;

    /* renamed from: n */
    private int f130271n;

    /* renamed from: o */
    private int f130272o;

    static {
        Covode.recordClassIndex(67102);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94408a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94410a(C33942b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo94411b();

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        return this.f130262a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo94412c() {
        C57172a aVar;
        int i = this.f130272o - 2;
        if (i < 0) {
            i = 0;
        }
        C57238a aVar2 = this.f130270m;
        if (!aVar2.f130381c) {
            aVar2.f130381c = true;
            ChooseMusicApi.f130230a.musicCollectionFeed(Integer.valueOf(i), 10).mo5534a(new C57241c(aVar2, C27252o.m54253a()), C1731i.f5564c, null);
        }
        if (af_() && (aVar = this.f130266e) != null) {
            aVar.ao_();
        }
    }

    /* renamed from: a */
    public final void mo94409a(int i) {
        C57172a aVar = this.f130266e;
        if (aVar != null) {
            aVar.mo94372d(i);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 1;
        }
        this.f130271n = i;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C57172a aVar;
        super.setUserVisibleHint(z);
        if (this.f130262a != null && z && (aVar = this.f130266e) != null) {
            aVar.mo94371a(true);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // androidx.lifecycle.AbstractC1214u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r11) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57197b.onChanged(java.lang.Object):void");
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1764a.m5927a(layoutInflater, R.layout.ad_, viewGroup, false);
        this.f130262a = (RecyclerView) a.findViewById(R.id.c_4);
        this.f130263b = (TuxStatusView) a.findViewById(R.id.e7i);
        C57172a aVar = new C57172a(this.f130265d, this.f130264c, this.f130267j, this.f130268k, this.f130269l, this.f130271n);
        this.f130266e = aVar;
        aVar.mo67813a((AbstractC39063h.AbstractC39067a) this);
        this.f130266e.mo67820g(C0643b.m2378c(getContext(), R.color.c5));
        this.f130262a.setOverScrollMode(2);
        RecyclerView recyclerView = this.f130262a;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.f130262a.setAdapter(this.f130266e);
        new C57293q(new C57198c(this), 5).mo94496a(this.f130262a);
        this.f130264c.mo60189a("list", (AbstractC1214u<C33942b>) this).mo60189a("should_load_more_pick", (AbstractC1214u<C33942b>) this).mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("collection_feed_status", (AbstractC1214u<C33942b>) this);
        return a;
    }
}
