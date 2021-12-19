package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35886af;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35899b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35911m;
import com.p2082ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35701a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35830e;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35958ab;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p077b.C1731i;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.d */
public abstract class AbstractC35789d extends AbstractC34586a implements AbstractC1214u<C33942b>, AbstractC39063h.AbstractC39067a, C39211a.AbstractC39212a {

    /* renamed from: a */
    RecyclerView f84473a;

    /* renamed from: b */
    TuxStatusView f84474b;

    /* renamed from: c */
    public DataCenter f84475c;

    /* renamed from: d */
    public C33947e f84476d;

    /* renamed from: e */
    public C35701a f84477e;

    /* renamed from: j */
    AbstractC35827b f84478j;

    /* renamed from: k */
    AbstractC35830e f84479k;

    /* renamed from: l */
    AbstractC60731k<C35757c> f84480l;

    /* renamed from: m */
    public C35899b f84481m;

    /* renamed from: n */
    private int f84482n;

    /* renamed from: o */
    private int f84483o;

    /* renamed from: p */
    private int f84484p;

    static {
        Covode.recordClassIndex(43028);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62864a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62866a(C33942b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo62867b();

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        return this.f84473a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ C89391z mo62870e() {
        mo62869d();
        return C89391z.f203057a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62869d() {
        C35701a aVar;
        C1731i<C35886af> iVar;
        int i = this.f84483o - 2;
        if (i < 0) {
            i = 0;
        }
        C35899b bVar = this.f84481m;
        int i2 = this.f84484p;
        if (!bVar.f84730c) {
            bVar.f84730c = true;
            C27252o a = C27252o.m54253a();
            Integer valueOf = Integer.valueOf(i);
            if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
                iVar = ChooseMusicApi.f84343a.commerceMusicCollectionFeed(valueOf, 10);
            } else {
                iVar = ChooseMusicApi.f84343a.musicCollectionFeed(valueOf, 10, i2);
            }
            iVar.mo5534a(new C35911m(bVar, a), C1731i.f5564c, null);
        }
        if (af_() && (aVar = this.f84477e) != null) {
            aVar.ao_();
        }
    }

    /* renamed from: a */
    public final void mo62865a(int i) {
        C35701a aVar = this.f84477e;
        if (aVar != null) {
            aVar.mo62743d(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C35701a aVar;
        super.setUserVisibleHint(z);
        if (this.f84473a != null && z && (aVar = this.f84477e) != null) {
            aVar.mo62742a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 1;
        }
        this.f84482n = i;
        if (getArguments() != null) {
            i2 = getArguments().getInt("sound_page_scene");
        } else {
            i2 = 0;
        }
        this.f84484p = i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        List list;
        Integer num;
        C33942b bVar2 = bVar;
        String str = bVar2.f80277a;
        str.hashCode();
        switch (str.hashCode()) {
            case -1635157503:
                if (str.equals("music_collect_status")) {
                    mo62866a(bVar2);
                    return;
                }
                return;
            case 3322014:
                if (str.equals("list") && (list = (List) this.f84475c.mo60192a("list")) != null && list.size() > 0) {
                    AVExternalServiceImpl.m113114a().provideAVPerformance().end(OpenMusicPanelPerformanceMonitor.f142464a, "set_music_data");
                    int itemCount = this.f84477e.getItemCount();
                    this.f84483o = list.size();
                    boolean booleanValue = ((Boolean) this.f84475c.mo60195b("is_busi_sticker", (Object) false)).booleanValue();
                    if ("challenge".equals(this.f84475c.mo60195b("shoot_way", (Object) null))) {
                        if (this.f84475c.mo60192a("data_challenge") != null) {
                            this.f84477e.mo62744e(5);
                        } else {
                            List list2 = (List) this.f84475c.mo60195b("data_sticker", (Object) null);
                            if (list2 != null && list2.size() > 0) {
                                this.f84477e.mo62744e(4);
                            }
                        }
                    } else if (booleanValue) {
                        mo62867b();
                    } else {
                        List list3 = (List) this.f84475c.mo60195b("data_sticker", (Object) null);
                        if (list3 != null && list3.size() > 0) {
                            this.f84477e.mo62744e(4);
                        } else if (this.f84475c.mo60192a("data_challenge") != null) {
                            this.f84477e.mo62744e(5);
                        }
                    }
                    this.f84477e.f84205g = ((Boolean) this.f84475c.mo60195b("show_music_radio", (Object) false)).booleanValue();
                    this.f84477e.f84204f = this.f84483o;
                    int itemCount2 = this.f84477e.getItemCount() - itemCount;
                    if (itemCount2 <= 0) {
                        this.f84477e.notifyDataSetChanged();
                    } else if (TextUtils.equals(Build.MODEL, "Redmi 6A") || TextUtils.equals(Build.MODEL, "Redmi 6")) {
                        this.f84477e.notifyDataSetChanged();
                    } else {
                        this.f84477e.notifyItemRangeInserted(itemCount, itemCount2);
                    }
                    if (this.f84475c.mo60192a("collection_feed_has_more") == null) {
                        return;
                    }
                    if (((Integer) this.f84475c.mo60192a("collection_feed_has_more")).intValue() == 1) {
                        this.f84477e.aq_();
                        return;
                    } else {
                        mo62864a();
                        return;
                    }
                } else {
                    return;
                }
            case 510590654:
                if (str.equals("should_load_more_pick")) {
                    this.f84481m.mo63025a(true, (String) null, (Music) null, false, this.f84484p);
                    return;
                }
                return;
            case 1110903186:
                if (str.equals("collection_feed_status") && (num = (Integer) this.f84475c.mo60192a("collection_feed_status")) != null && num.intValue() == 1) {
                    mo62864a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a;
        if (C68027bm.m120329a()) {
            a = C1764a.m5927a(layoutInflater, R.layout.a0t, viewGroup, false);
        } else {
            a = C1764a.m5927a(layoutInflater, R.layout.a17, viewGroup, false);
        }
        this.f84473a = (RecyclerView) a.findViewById(R.id.c_4);
        this.f84474b = (TuxStatusView) a.findViewById(R.id.e7i);
        C35701a aVar = new C35701a(this.f84476d, this.f84475c, this.f84478j, this.f84479k, this.f84480l, this.f84482n, this.f84484p);
        this.f84477e = aVar;
        aVar.mo67813a((AbstractC39063h.AbstractC39067a) this);
        this.f84477e.mo67820g(C0643b.m2378c(getContext(), R.color.c5));
        this.f84473a.setOverScrollMode(2);
        RecyclerView recyclerView = this.f84473a;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.f84473a.setRecycledViewPool(MusicRecyclerViewPoolViewModel.C36027a.m73455a(viewGroup.getContext()));
        this.f84473a.setAdapter(this.f84477e);
        ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) C1181ae.m3881a(requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class);
        if (chooseMusicWithSceneViewModel.f84642a) {
            chooseMusicWithSceneViewModel.mo62972d().observe(this, new C35790e(this));
        } else {
            new C35958ab(new C35791f(this), 5).mo63094a(this.f84473a);
        }
        this.f84475c.mo60190a("list", this, C68027bm.m120329a()).mo60189a("should_load_more_pick", (AbstractC1214u<C33942b>) this).mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("collection_feed_status", (AbstractC1214u<C33942b>) this);
        return a;
    }
}
