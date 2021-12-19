package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.C1465n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20371ai;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.scene.navigation.AbstractC22259h;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.navigation.C22243f;
import com.bytedance.scene.p1617a.p1618a.C22121c;
import com.bytedance.scene.p1621c.C22152e;
import com.bytedance.scene.p1622d.C22170j;
import com.bytedance.scene.p1622d.C22171k;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.experiment.C46916ew;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.setting.C68062ck;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.C71989a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewGestureViewPager;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72422a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.C72432f;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.wdiget.HorizontalCenterLayoutManager;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73986be;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f */
public final class C72377f extends AbstractC22186b implements AbstractC72363b {

    /* renamed from: t */
    public static AbstractC72365d f162257t;

    /* renamed from: u */
    public static final C72378a f162258u = new C72378a((byte) 0);

    /* renamed from: A */
    private TextView f162259A;

    /* renamed from: B */
    private ImageView f162260B;

    /* renamed from: C */
    private View f162261C;

    /* renamed from: b */
    boolean f162262b = true;

    /* renamed from: c */
    public int f162263c = -1;

    /* renamed from: d */
    public PreviewGestureViewPager f162264d;

    /* renamed from: e */
    public C72401l f162265e;

    /* renamed from: f */
    public ChooseMediaViewModel f162266f;

    /* renamed from: g */
    public RecyclerView f162267g;

    /* renamed from: h */
    public TextView f162268h;

    /* renamed from: i */
    public TextView f162269i;

    /* renamed from: j */
    public AbstractC72425c f162270j;

    /* renamed from: k */
    public int f162271k = -1;

    /* renamed from: l */
    public boolean f162272l = true;

    /* renamed from: v */
    private TextView f162273v;

    /* renamed from: w */
    private ImageView f162274w;

    /* renamed from: x */
    private TextView f162275x;

    /* renamed from: y */
    private ViewGroup f162276y;

    /* renamed from: z */
    private View f162277z;

    static {
        Covode.recordClassIndex(85050);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72363b
    /* renamed from: b */
    public final void mo114651b() {
        this.f162262b = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$a */
    public static final class C72378a {
        static {
            Covode.recordClassIndex(85051);
        }

        private C72378a() {
        }

        public /* synthetic */ C72378a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72363b
    /* renamed from: a */
    public final boolean mo114650a() {
        return this.f162262b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$p */
    public static final class RunnableC72395p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72377f f162299a;

        static {
            Covode.recordClassIndex(85068);
        }

        RunnableC72395p(C72377f fVar) {
            this.f162299a = fVar;
        }

        public final void run() {
            this.f162299a.f162272l = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72363b
    /* renamed from: f */
    public final void mo114655f() {
        m127654a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72363b
    /* renamed from: g */
    public final void mo114656g() {
        m127654a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$o */
    public static final class C72394o implements AbstractC22259h {

        /* renamed from: a */
        final /* synthetic */ C72377f f162298a;

        static {
            Covode.recordClassIndex(85067);
        }

        @Override // com.bytedance.scene.navigation.AbstractC22259h
        /* renamed from: a */
        public final boolean mo36540a() {
            AbstractC72364c b = C72377f.m127655b(this.f162298a).mo114673b(C72377f.m127653a(this.f162298a).getCurrentItem());
            if (b == null) {
                return true;
            }
            b.mo114661d();
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72394o(C72377f fVar) {
            this.f162298a = fVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72363b
    /* renamed from: c */
    public final View mo114652c() {
        AbstractC72365d dVar = f162257t;
        if (dVar != null) {
            return dVar.mo114388b();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72363b
    /* renamed from: d */
    public final void mo114653d() {
        C22239d a = C22227b.m41825a(this);
        if (a != null) {
            C22152e.C22153a aVar = new C22152e.C22153a();
            aVar.f52378a = new C22121c();
            C22152e eVar = new C22152e(aVar.f52378a, aVar.f52379b, (byte) 0);
            C22170j.m41654a();
            if (C22171k.m41661a(a.f52549m)) {
                a.mo36522C();
                a.mo36523D();
                C22243f fVar = a.f52597c;
                fVar.mo36545a(new C22243f.C22252e(fVar, eVar, (byte) 0));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$b */
    static final class RunnableC72379b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f162278a;

        /* renamed from: b */
        final /* synthetic */ int f162279b;

        static {
            Covode.recordClassIndex(85052);
        }

        RunnableC72379b(View view, int i) {
            this.f162278a = view;
            this.f162279b = i;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f162278a.setEnabled(true);
            this.f162278a.getHitRect(rect);
            rect.top -= this.f162279b;
            rect.bottom += this.f162279b;
            rect.left -= this.f162279b;
            rect.right += this.f162279b;
            ViewParent parent = this.f162278a.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            View view = (View) parent;
            if (view != null) {
                view.setTouchDelegate(new TouchDelegate(rect, this.f162278a));
            }
        }
    }

    /* renamed from: E */
    public final void mo62771E() {
        List<? extends MvImageChooseAdapter.MyMediaModel> list;
        PreviewGestureViewPager previewGestureViewPager = this.f162264d;
        if (previewGestureViewPager == null) {
            C89219l.m154710a("viewPager");
        }
        PagerAdapter adapter = previewGestureViewPager.getAdapter();
        if (!(adapter instanceof C72401l)) {
            adapter = null;
        }
        C72401l lVar = (C72401l) adapter;
        if (lVar != null && (list = lVar.f162305a) != null && !list.isEmpty()) {
            PreviewGestureViewPager previewGestureViewPager2 = this.f162264d;
            if (previewGestureViewPager2 == null) {
                C89219l.m154710a("viewPager");
            }
            MvImageChooseAdapter.MyMediaModel myMediaModel = (MvImageChooseAdapter.MyMediaModel) C89070n.m154561b((List) list, previewGestureViewPager2.getCurrentItem());
            if (myMediaModel != null) {
                AbstractC72365d dVar = f162257t;
                if (dVar != null && !dVar.mo114387a(myMediaModel)) {
                    return;
                }
                if (myMediaModel.f161471v >= 0) {
                    ChooseMediaViewModel chooseMediaViewModel = this.f162266f;
                    if (chooseMediaViewModel == null) {
                        C89219l.m154710a("chooseMediaViewModel");
                    }
                    chooseMediaViewModel.mo114226b(myMediaModel);
                    return;
                }
                ChooseMediaViewModel chooseMediaViewModel2 = this.f162266f;
                if (chooseMediaViewModel2 == null) {
                    C89219l.m154710a("chooseMediaViewModel");
                }
                C89219l.m154721d(myMediaModel, "");
                chooseMediaViewModel2.mo33689c(new ChooseMediaViewModel.C72016k(myMediaModel));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72363b
    /* renamed from: e */
    public final void mo114654e() {
        View view = this.f162277z;
        if (view == null) {
            C89219l.m154710a("previewDockView");
        }
        boolean z = true;
        if (view.getAlpha() == 0.0f) {
            Activity activity = this.f52549m;
            if (activity != null) {
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                C23073a.C23074a.m43508a((ActivityC0945e) activity).mo37496a(false, false).f54627a.mo33415d();
            }
        } else {
            Activity activity2 = this.f52549m;
            if (activity2 != null) {
                Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                C23073a.C23074a.m43508a((ActivityC0945e) activity2).mo37496a(false, true).f54627a.mo33415d();
            }
        }
        View view2 = this.f162277z;
        if (view2 == null) {
            C89219l.m154710a("previewDockView");
        }
        View view3 = this.f162277z;
        if (view3 == null) {
            C89219l.m154710a("previewDockView");
        }
        if (view3.getAlpha() != 0.0f) {
            z = false;
        }
        C71989a.m127080a(view2, z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$j */
    public static final class C72388j extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C72377f f162292a;

        static {
            Covode.recordClassIndex(85061);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72388j(C72377f fVar) {
            this.f162292a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            List<? extends MvImageChooseAdapter.MyMediaModel> list;
            MvImageChooseAdapter.MyMediaModel myMediaModel;
            RecyclerView.AbstractC1350a adapter = C72377f.m127657d(this.f162292a).getAdapter();
            if (adapter == null || adapter.getItemCount() != 0 || this.f162292a.f162271k < 0 || !C46916ew.m90218c()) {
                C72377f.m127656c(this.f162292a).mo33689c(ChooseMediaViewModel.C72006a.f161365a);
                return;
            }
            PagerAdapter adapter2 = C72377f.m127653a(this.f162292a).getAdapter();
            if (!(adapter2 instanceof C72401l)) {
                adapter2 = null;
            }
            C72401l lVar = (C72401l) adapter2;
            if (lVar != null && (list = lVar.f162305a) != null && (myMediaModel = (MvImageChooseAdapter.MyMediaModel) list.get(this.f162292a.f162271k)) != null) {
                ChooseMediaViewModel c = C72377f.m127656c(this.f162292a);
                C89219l.m154721d(myMediaModel, "");
                c.mo33689c(new ChooseMediaViewModel.C72007b(myMediaModel));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$l */
    public static final class C72390l implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C72377f f162294a;

        static {
            Covode.recordClassIndex(85063);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72390l(C72377f fVar) {
            this.f162294a = fVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$l$a */
        static final class C72391a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C72390l f162295a;

            static {
                Covode.recordClassIndex(85064);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72391a(C72390l lVar) {
                super(1);
                this.f162295a = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                MvImageChooseAdapter.MyMediaModel myMediaModel = (MvImageChooseAdapter.MyMediaModel) C89070n.m154561b((List) C72377f.m127655b(this.f162295a.f162294a).f162305a, C72377f.m127653a(this.f162295a.f162294a).getCurrentItem());
                if (myMediaModel != null && !booleanValue && myMediaModel.f161471v >= 0) {
                    C72377f.m127656c(this.f162295a.f162294a).mo114226b(myMediaModel);
                }
                return C89391z.f203057a;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            AbstractC72364c b;
            if (i == 1) {
                C72377f fVar = this.f162294a;
                fVar.f162263c = C72377f.m127653a(fVar).getCurrentItem();
            } else if (C72377f.m127653a(this.f162294a).getCurrentItem() == this.f162294a.f162263c && i == 0 && (b = C72377f.m127655b(this.f162294a).mo114673b(this.f162294a.f162263c)) != null) {
                b.mo114657a();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            AbstractC72425c cVar;
            Integer c;
            this.f162294a.f162271k = i;
            if (!this.f162294a.f162262b) {
                C72377f fVar = this.f162294a;
                fVar.mo114665a(C72377f.m127655b(fVar).f162305a, new C72391a(this));
                MvImageChooseAdapter.MyMediaModel myMediaModel = (MvImageChooseAdapter.MyMediaModel) C89070n.m154561b((List) C72377f.m127655b(this.f162294a).f162305a, i);
                if (myMediaModel != null) {
                    ChooseMediaViewModel c2 = C72377f.m127656c(this.f162294a);
                    C89219l.m154721d(myMediaModel, "");
                    c2.mo33689c(new ChooseMediaViewModel.C72010e(myMediaModel));
                    if (C46916ew.m90217b() && (cVar = this.f162294a.f162270j) != null && (c = cVar.mo114690c(myMediaModel)) != null) {
                        this.f162294a.mo114666e(c.intValue() + 1);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            AbstractC72364c b;
            if (C72377f.m127653a(this.f162294a).getCurrentItem() == this.f162294a.f162263c && i2 > 0 && (b = C72377f.m127655b(this.f162294a).mo114673b(this.f162294a.f162263c)) != null) {
                b.mo114660b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$m */
    public static final class C72392m implements PreviewGestureViewPager.AbstractC72361a {

        /* renamed from: a */
        final /* synthetic */ C72377f f162296a;

        static {
            Covode.recordClassIndex(85065);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72392m(C72377f fVar) {
            this.f162296a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewGestureViewPager.AbstractC72361a
        /* renamed from: a */
        public final void mo114645a(boolean z) {
            Integer valueOf;
            int i;
            Integer valueOf2;
            int i2;
            if (z) {
                AbstractC72365d dVar = C72377f.f162257t;
                if (dVar != null && (valueOf2 = Integer.valueOf(dVar.mo114390d())) != null) {
                    if (valueOf2.intValue() == 1) {
                        i2 = R.string.c2n;
                    } else if (valueOf2.intValue() == 2) {
                        i2 = R.string.c2m;
                    } else if (valueOf2.intValue() == 3) {
                        i2 = R.string.c2l;
                    } else {
                        return;
                    }
                    this.f162296a.mo114649a(i2);
                    return;
                }
                return;
            }
            AbstractC72365d dVar2 = C72377f.f162257t;
            if (dVar2 != null && (valueOf = Integer.valueOf(dVar2.mo114390d())) != null) {
                if (valueOf.intValue() == 1) {
                    i = R.string.c2q;
                } else if (valueOf.intValue() == 2) {
                    i = R.string.c2p;
                } else if (valueOf.intValue() == 3) {
                    i = R.string.c2o;
                } else {
                    return;
                }
                this.f162296a.mo114649a(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$c */
    public static final class C72380c implements AbstractC72431e {

        /* renamed from: a */
        final /* synthetic */ AbstractC72425c f162280a;

        /* renamed from: b */
        final /* synthetic */ C72377f f162281b;

        static {
            Covode.recordClassIndex(85053);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e
        /* renamed from: a */
        public final void mo114400a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            if (myMediaModel != null) {
                C72377f.m127656c(this.f162281b).mo114226b(myMediaModel);
            }
        }

        C72380c(AbstractC72425c cVar, C72377f fVar) {
            this.f162280a = cVar;
            this.f162281b = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e
        /* renamed from: a */
        public final void mo114399a(int i, int i2) {
            boolean z;
            boolean z2 = true;
            if (i < 0 || i >= this.f162280a.f162349b.size()) {
                z = false;
            } else {
                z = true;
            }
            if (i2 < 0 || i2 >= this.f162280a.f162349b.size()) {
                z2 = false;
            }
            if (z && z2) {
                MvImageChooseAdapter.MyMediaModel myMediaModel = this.f162280a.f162349b.get(i2);
                C89219l.m154716b(myMediaModel, "");
                final MvImageChooseAdapter.MyMediaModel myMediaModel2 = myMediaModel;
                C72377f.m127656c(this.f162281b).mo33689c(new ChooseMediaViewModel.C72014i(i, i2));
                C72377f.m127653a(this.f162281b).postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C72377f.C72380c.RunnableC723811 */

                    /* renamed from: a */
                    final /* synthetic */ C72380c f162282a;

                    static {
                        Covode.recordClassIndex(85054);
                    }

                    {
                        this.f162282a = r1;
                    }

                    public final void run() {
                        List<? extends MvImageChooseAdapter.MyMediaModel> list;
                        MvImageChooseAdapter.MyMediaModel myMediaModel;
                        List<? extends MvImageChooseAdapter.MyMediaModel> list2;
                        MvImageChooseAdapter.MyMediaModel myMediaModel2;
                        PagerAdapter adapter = C72377f.m127653a(this.f162282a.f162281b).getAdapter();
                        C72401l lVar = null;
                        if (!(adapter instanceof C72401l)) {
                            adapter = null;
                        }
                        C72401l lVar2 = (C72401l) adapter;
                        if (lVar2 == null || (list2 = lVar2.f162305a) == null || (myMediaModel2 = (MvImageChooseAdapter.MyMediaModel) C89070n.m154561b((List) list2, myMediaModel2.f161472w)) == null || !C89219l.m154714a((Object) myMediaModel2.f134662b, (Object) myMediaModel2.f134662b)) {
                            PagerAdapter adapter2 = C72377f.m127653a(this.f162282a.f162281b).getAdapter();
                            if (adapter2 instanceof C72401l) {
                                lVar = adapter2;
                            }
                            C72401l lVar3 = lVar;
                            if (lVar3 != null && (list = lVar3.f162305a) != null && (myMediaModel = (MvImageChooseAdapter.MyMediaModel) C89070n.m154561b((List) list, C72377f.m127653a(this.f162282a.f162281b).getCurrentItem())) != null) {
                                C72377f.m127658e(this.f162282a.f162281b).setText(String.valueOf(myMediaModel.f161471v));
                                return;
                            }
                            return;
                        }
                        if (C72377f.m127653a(this.f162282a.f162281b).getCurrentItem() == myMediaModel2.f161472w) {
                            C72377f.m127658e(this.f162282a.f162281b).setText(String.valueOf(myMediaModel2.f161471v));
                        } else {
                            C72377f.m127653a(this.f162282a.f162281b).setCurrentItem(myMediaModel2.f161472w);
                        }
                        this.f162282a.f162280a.mo114689b(myMediaModel2.f161471v - 1);
                        this.f162282a.f162280a.notifyDataSetChanged();
                    }
                }, 100);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e
        /* renamed from: a */
        public final void mo114401a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            int i;
            Integer c;
            if (myMediaModel != null && myMediaModel.f161472w != C72377f.m127653a(this.f162281b).getCurrentItem()) {
                MediaModel mediaModel = (MediaModel) C89070n.m154561b((List) C72377f.m127655b(this.f162281b).f162305a, myMediaModel.f161472w);
                if (mediaModel != null && C89219l.m154714a((Object) mediaModel.f134662b, (Object) myMediaModel.f134662b)) {
                    C72377f.m127653a(this.f162281b).setCurrentItem(myMediaModel.f161472w);
                    AbstractC72425c cVar = this.f162281b.f162270j;
                    if (!(cVar == null || (c = cVar.mo114690c(myMediaModel)) == null)) {
                        this.f162281b.mo114666e(c.intValue() + 1);
                        if (C89391z.f203057a != null) {
                            return;
                        }
                    }
                }
                C72377f fVar = this.f162281b;
                if (myMediaModel.mo96674b()) {
                    i = R.string.b1m;
                } else {
                    i = R.string.b1p;
                }
                fVar.mo114649a(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$h */
    static final class View$OnClickListenerC72386h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72377f f162290a;

        static {
            Covode.recordClassIndex(85059);
        }

        View$OnClickListenerC72386h(C72377f fVar) {
            this.f162290a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C22227b.m41826b(this.f162290a).mo36524E();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$i */
    static final class View$OnClickListenerC72387i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72377f f162291a;

        static {
            Covode.recordClassIndex(85060);
        }

        View$OnClickListenerC72387i(C72377f fVar) {
            this.f162291a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f162291a.mo62771E();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$k */
    static final class View$OnClickListenerC72389k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72377f f162293a;

        static {
            Covode.recordClassIndex(85062);
        }

        View$OnClickListenerC72389k(C72377f fVar) {
            this.f162293a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f162293a.mo62771E();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PreviewGestureViewPager m127653a(C72377f fVar) {
        PreviewGestureViewPager previewGestureViewPager = fVar.f162264d;
        if (previewGestureViewPager == null) {
            C89219l.m154710a("viewPager");
        }
        return previewGestureViewPager;
    }

    /* renamed from: b */
    public static final /* synthetic */ C72401l m127655b(C72377f fVar) {
        C72401l lVar = fVar.f162265e;
        if (lVar == null) {
            C89219l.m154710a("viewPagerAdapter");
        }
        return lVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ ChooseMediaViewModel m127656c(C72377f fVar) {
        ChooseMediaViewModel chooseMediaViewModel = fVar.f162266f;
        if (chooseMediaViewModel == null) {
            C89219l.m154710a("chooseMediaViewModel");
        }
        return chooseMediaViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ RecyclerView m127657d(C72377f fVar) {
        RecyclerView recyclerView = fVar.f162267g;
        if (recyclerView == null) {
            C89219l.m154710a("mediaRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: e */
    public static final /* synthetic */ TextView m127658e(C72377f fVar) {
        TextView textView = fVar.f162268h;
        if (textView == null) {
            C89219l.m154710a("selectIndicator");
        }
        return textView;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$g */
    static final class C72385g extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72377f f162289a;

        static {
            Covode.recordClassIndex(85058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72385g(C72377f fVar) {
            super(1);
            this.f162289a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            TextView textView = this.f162289a.f162269i;
            if (textView == null) {
                C89219l.m154710a("nextBtn");
            }
            textView.setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m127654a(boolean z) {
        if (z) {
            View view = this.f162277z;
            if (view == null) {
                C89219l.m154710a("previewDockView");
            }
            view.setVisibility(0);
            return;
        }
        View view2 = this.f162277z;
        if (view2 == null) {
            C89219l.m154710a("previewDockView");
        }
        view2.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$f */
    static final class C72384f extends AbstractC89220m implements AbstractC89172b<MediaState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC72425c f162287a;

        /* renamed from: b */
        final /* synthetic */ C72377f f162288b;

        static {
            Covode.recordClassIndex(85057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72384f(AbstractC72425c cVar, C72377f fVar) {
            super(1);
            this.f162287a = cVar;
            this.f162288b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(MediaState mediaState) {
            MediaState mediaState2 = mediaState;
            C89219l.m154721d(mediaState2, "");
            MvImageChooseAdapter.MyMediaModel media = mediaState2.getMedia();
            if (media != null) {
                if (this.f162287a.getItemCount() == 0) {
                    C71989a.m127080a(C72377f.m127657d(this.f162288b), true);
                }
                this.f162287a.mo114689b(media.f161471v - 1);
                this.f162287a.mo114500b(media);
                this.f162288b.mo114666e(this.f162287a.mo114494a());
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72363b
    /* renamed from: a */
    public final void mo114649a(int i) {
        if (this.f162272l) {
            this.f162272l = false;
            new C79459a(mo36486t()).mo123050a(i).mo123053a();
            C22228c.m41831a(this, new RunnableC72395p(this), (long) InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    /* renamed from: e */
    public final void mo114666e(int i) {
        View view;
        if (i >= 0) {
            RecyclerView recyclerView = this.f162267g;
            if (recyclerView == null) {
                C89219l.m154710a("mediaRecyclerView");
            }
            RecyclerView.ViewHolder f = recyclerView.mo4451f(i);
            if (f != null) {
                view = f.itemView;
            } else {
                view = null;
            }
            int i2 = 0;
            if (view == null) {
                RecyclerView recyclerView2 = this.f162267g;
                if (recyclerView2 == null) {
                    C89219l.m154710a("mediaRecyclerView");
                }
                int i3 = i - 1;
                if (i3 > 0) {
                    i2 = i3;
                }
                recyclerView2.mo4413b(i2);
                return;
            }
            RecyclerView recyclerView3 = this.f162267g;
            if (recyclerView3 == null) {
                C89219l.m154710a("mediaRecyclerView");
            }
            int i4 = i - 1;
            if (i4 > 0) {
                i2 = i4;
            }
            recyclerView3.mo4435d(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$e */
    static final class C72383e extends AbstractC89220m implements AbstractC89172b<MediaState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC72425c f162285a;

        /* renamed from: b */
        final /* synthetic */ C72377f f162286b;

        static {
            Covode.recordClassIndex(85056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72383e(AbstractC72425c cVar, C72377f fVar) {
            super(1);
            this.f162285a = cVar;
            this.f162286b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(MediaState mediaState) {
            List<? extends MvImageChooseAdapter.MyMediaModel> list;
            MvImageChooseAdapter.MyMediaModel myMediaModel;
            MediaState mediaState2 = mediaState;
            C89219l.m154721d(mediaState2, "");
            MvImageChooseAdapter.MyMediaModel media = mediaState2.getMedia();
            if (media != null) {
                PagerAdapter adapter = C72377f.m127653a(this.f162286b).getAdapter();
                if (!(adapter instanceof C72401l)) {
                    adapter = null;
                }
                C72401l lVar = (C72401l) adapter;
                if (!(lVar == null || (list = lVar.f162305a) == null || (myMediaModel = (MvImageChooseAdapter.MyMediaModel) C89070n.m154561b((List) list, C72377f.m127653a(this.f162286b).getCurrentItem())) == null)) {
                    this.f162285a.mo114690c(myMediaModel);
                }
                this.f162285a.mo114497a(media);
                if (this.f162285a.getItemCount() <= 0) {
                    C71989a.m127080a(C72377f.m127657d(this.f162286b), false);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$n */
    static final class C72393n extends AbstractC89220m implements AbstractC89172b<MediaListState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72377f f162297a;

        static {
            Covode.recordClassIndex(85066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72393n(C72377f fVar) {
            super(1);
            this.f162297a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(MediaListState mediaListState) {
            int i;
            MediaListState mediaListState2 = mediaListState;
            C89219l.m154721d(mediaListState2, "");
            List<? extends MvImageChooseAdapter.MyMediaModel> j = C89070n.m154590j(mediaListState2.getMediaList());
            C72401l b = C72377f.m127655b(this.f162297a);
            C89219l.m154721d(j, "");
            b.f162305a = j;
            C72377f.m127655b(this.f162297a).notifyDataSetChanged();
            if (this.f162297a.f162262b) {
                PreviewGestureViewPager a = C72377f.m127653a(this.f162297a);
                AbstractC72365d dVar = C72377f.f162257t;
                if (dVar != null) {
                    i = dVar.mo114389c();
                } else {
                    i = 0;
                }
                a.setCurrentItem(i);
            }
            this.f162297a.mo114665a(j, (AbstractC89172b<? super Boolean, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f$d */
    static final class C72382d extends AbstractC89220m implements AbstractC89172b<MediaListState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72377f f162284a;

        static {
            Covode.recordClassIndex(85055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72382d(C72377f fVar) {
            super(1);
            this.f162284a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(MediaListState mediaListState) {
            AbstractC72425c cVar;
            Integer c;
            MediaListState mediaListState2 = mediaListState;
            C89219l.m154721d(mediaListState2, "");
            ArrayList<MvImageChooseAdapter.MyMediaModel> mediaList = mediaListState2.getMediaList();
            AbstractC72425c cVar2 = this.f162284a.f162270j;
            if (cVar2 != null) {
                List j = C89070n.m154590j(mediaList);
                C89219l.m154721d(j, "");
                cVar2.f162349b.clear();
                C89070n.m154535a((Collection) cVar2.f162349b, (Iterable) j);
                cVar2.notifyDataSetChanged();
                C84911q.m145928d("VideoImageMixedBaseAdapter setMediaList size " + j.size() + ' ' + C73986be.m130119a());
            }
            if (mediaList.size() == 0) {
                C72377f.m127657d(this.f162284a).setVisibility(8);
            }
            MvImageChooseAdapter.MyMediaModel myMediaModel = (MvImageChooseAdapter.MyMediaModel) C89070n.m154561b((List) C72377f.m127655b(this.f162284a).f162305a, C72377f.m127653a(this.f162284a).getCurrentItem());
            if (!(myMediaModel == null || (cVar = this.f162284a.f162270j) == null || (c = cVar.mo114690c(myMediaModel)) == null)) {
                this.f162284a.mo114666e(c.intValue());
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72363b
    /* renamed from: a */
    public final void mo114648a(float f) {
        int max = Math.max(0, (int) (255.0f * f));
        PreviewGestureViewPager previewGestureViewPager = this.f162264d;
        if (previewGestureViewPager == null) {
            C89219l.m154710a("viewPager");
        }
        previewGestureViewPager.setBackgroundColor(Color.argb(max, 0, 0, 0));
        if (f == 1.0f) {
            if (C46916ew.m90217b()) {
                View view = this.f162277z;
                if (view == null) {
                    C89219l.m154710a("previewDockView");
                }
                view.setVisibility(0);
                return;
            }
            ImageView imageView = this.f162274w;
            if (imageView == null) {
                C89219l.m154710a("backBtn");
            }
            imageView.setVisibility(0);
            TextView textView = this.f162273v;
            if (textView == null) {
                C89219l.m154710a("indexTxt");
            }
            textView.setVisibility(0);
            TextView textView2 = this.f162275x;
            if (textView2 == null) {
                C89219l.m154710a("tipTxt");
            }
            textView2.setVisibility(0);
        } else if (C46916ew.m90217b()) {
            View view2 = this.f162277z;
            if (view2 == null) {
                C89219l.m154710a("previewDockView");
            }
            view2.setVisibility(4);
        } else {
            ImageView imageView2 = this.f162274w;
            if (imageView2 == null) {
                C89219l.m154710a("backBtn");
            }
            imageView2.setVisibility(4);
            TextView textView3 = this.f162273v;
            if (textView3 == null) {
                C89219l.m154710a("indexTxt");
            }
            textView3.setVisibility(4);
            TextView textView4 = this.f162275x;
            if (textView4 == null) {
                C89219l.m154710a("tipTxt");
            }
            textView4.setVisibility(4);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        AbstractC72425c cVar;
        Context r;
        Activity activity;
        Window window;
        super.mo22704a(bundle);
        View c = mo36475c(R.id.bms);
        C89219l.m154716b(c, "");
        this.f162273v = (TextView) c;
        View c2 = mo36475c(R.id.eig);
        C89219l.m154716b(c2, "");
        this.f162275x = (TextView) c2;
        View c3 = mo36475c(R.id.pi);
        C89219l.m154716b(c3, "");
        this.f162274w = (ImageView) c3;
        View c4 = mo36475c(R.id.duj);
        C89219l.m154716b(c4, "");
        this.f162276y = (ViewGroup) c4;
        TextView textView = this.f162273v;
        if (textView == null) {
            C89219l.m154710a("indexTxt");
        }
        int b = (int) C13628n.m24520b(mo36486t(), 20.0f);
        ViewParent parent = textView.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view = (View) parent;
        if (view != null) {
            view.post(new RunnableC72379b(textView, b));
        }
        ViewGroup viewGroup = this.f162276y;
        if (viewGroup == null) {
            C89219l.m154710a("selectLayout");
        }
        viewGroup.setOnClickListener(new View$OnClickListenerC72389k(this));
        this.f162265e = new C72401l(this, this);
        View c5 = mo36475c(R.id.ffo);
        C89219l.m154716b(c5, "");
        this.f162264d = (PreviewGestureViewPager) c5;
        if (C46916ew.m90217b()) {
            View c6 = mo36475c(R.id.d6a);
            C89219l.m154716b(c6, "");
            c6.setVisibility(8);
            TextView textView2 = this.f162273v;
            if (textView2 == null) {
                C89219l.m154710a("indexTxt");
            }
            textView2.setVisibility(8);
            ImageView imageView = this.f162274w;
            if (imageView == null) {
                C89219l.m154710a("backBtn");
            }
            imageView.setVisibility(8);
            ViewGroup viewGroup2 = this.f162276y;
            if (viewGroup2 == null) {
                C89219l.m154710a("selectLayout");
            }
            viewGroup2.setVisibility(8);
            if (!(Build.VERSION.SDK_INT < 21 || (r = mo36484r()) == null || (activity = this.f52549m) == null || (window = activity.getWindow()) == null)) {
                C89219l.m154716b(r, "");
                window.setNavigationBarColor(r.getResources().getColor(R.color.a2));
            }
            View c7 = mo36475c(R.id.d5y);
            C89219l.m154716b(c7, "");
            this.f162277z = c7;
            View c8 = mo36475c(R.id.cj0);
            C89219l.m154716b(c8, "");
            RecyclerView recyclerView = (RecyclerView) c8;
            this.f162267g = recyclerView;
            if (recyclerView == null) {
                C89219l.m154710a("mediaRecyclerView");
            }
            Context r2 = mo36484r();
            Objects.requireNonNull(r2, "null cannot be cast to non-null type android.content.Context");
            recyclerView.setLayoutManager(new HorizontalCenterLayoutManager(r2));
            RecyclerView recyclerView2 = this.f162267g;
            if (recyclerView2 == null) {
                C89219l.m154710a("mediaRecyclerView");
            }
            C1434i iVar = new C1434i();
            iVar.f4467i = 250;
            iVar.f4468j = 250;
            iVar.f4469k = 250;
            iVar.f4470l = 250;
            recyclerView2.setItemAnimator(iVar);
            View c9 = mo36475c(R.id.bla);
            C89219l.m154716b(c9, "");
            this.f162268h = (TextView) c9;
            View c10 = mo36475c(R.id.blb);
            C89219l.m154716b(c10, "");
            this.f162259A = (TextView) c10;
            C72422a aVar = new C72422a();
            C1465n nVar = new C1465n(new C72432f(aVar));
            RecyclerView recyclerView3 = this.f162267g;
            if (recyclerView3 == null) {
                C89219l.m154710a("mediaRecyclerView");
            }
            nVar.mo4979a(recyclerView3);
            this.f162270j = aVar;
            RecyclerView recyclerView4 = this.f162267g;
            if (recyclerView4 == null) {
                C89219l.m154710a("mediaRecyclerView");
            }
            recyclerView4.setAdapter(this.f162270j);
            View c11 = mo36475c(R.id.crn);
            C89219l.m154716b(c11, "");
            ImageView imageView2 = (ImageView) c11;
            this.f162260B = imageView2;
            if (imageView2 == null) {
                C89219l.m154710a("newBackBtn");
            }
            imageView2.setOnClickListener(new View$OnClickListenerC72386h(this));
            View c12 = mo36475c(R.id.duk);
            C89219l.m154716b(c12, "");
            this.f162261C = c12;
            if (c12 == null) {
                C89219l.m154710a("previewSelectLayout");
            }
            c12.setOnClickListener(new View$OnClickListenerC72387i(this));
            View c13 = mo36475c(R.id.cs_);
            C89219l.m154716b(c13, "");
            TextView textView3 = (TextView) c13;
            this.f162269i = textView3;
            if (textView3 == null) {
                C89219l.m154710a("nextBtn");
            }
            textView3.setOnClickListener(new C72388j(this));
        }
        if (C68062ck.m120368a()) {
            View c14 = mo36475c(R.id.d6a);
            C89219l.m154716b(c14, "");
            c14.setVisibility(8);
            ImageView imageView3 = this.f162274w;
            if (imageView3 == null) {
                C89219l.m154710a("backBtn");
            }
            imageView3.setImageResource(2131232190);
            TextView textView4 = this.f162275x;
            if (textView4 == null) {
                C89219l.m154710a("tipTxt");
            }
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            float applyDimension = TypedValue.applyDimension(1, 3.0f, system.getDisplayMetrics());
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            textView4.setShadowLayer(applyDimension, 0.0f, TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics()), Color.parseColor("#33000000"));
        }
        PreviewGestureViewPager previewGestureViewPager = this.f162264d;
        if (previewGestureViewPager == null) {
            C89219l.m154710a("viewPager");
        }
        previewGestureViewPager.addOnPageChangeListener(new C72390l(this));
        PreviewGestureViewPager previewGestureViewPager2 = this.f162264d;
        if (previewGestureViewPager2 == null) {
            C89219l.m154710a("viewPager");
        }
        previewGestureViewPager2.setGestureCallback(new C72392m(this));
        PreviewGestureViewPager previewGestureViewPager3 = this.f162264d;
        if (previewGestureViewPager3 == null) {
            C89219l.m154710a("viewPager");
        }
        C72401l lVar = this.f162265e;
        if (lVar == null) {
            C89219l.m154710a("viewPagerAdapter");
        }
        previewGestureViewPager3.setAdapter(lVar);
        Activity t = mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) t).mo33800a(ChooseMediaViewModel.class);
        C89219l.m154716b(a, "");
        ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) a;
        this.f162266f = chooseMediaViewModel;
        if (chooseMediaViewModel == null) {
            C89219l.m154710a("chooseMediaViewModel");
        }
        AbstractC88412b unused = chooseMediaViewModel.mo33677a(this, C72400k.f162304a, new C20370ah(), new C72393n(this));
        C22227b.m41826b(this).mo36528a(this, new C72394o(this));
        if (C46916ew.m90217b() && (cVar = this.f162270j) != null) {
            cVar.f162353f = new C72380c(cVar, this);
            ChooseMediaViewModel chooseMediaViewModel2 = this.f162266f;
            if (chooseMediaViewModel2 == null) {
                C89219l.m154710a("chooseMediaViewModel");
            }
            AbstractC88412b unused2 = chooseMediaViewModel2.mo33677a(this, C72396g.f162300a, new C20370ah(), new C72382d(this));
            ChooseMediaViewModel chooseMediaViewModel3 = this.f162266f;
            if (chooseMediaViewModel3 == null) {
                C89219l.m154710a("chooseMediaViewModel");
            }
            chooseMediaViewModel3.mo33677a(this, C72397h.f162301a, C20371ai.m38578b(), new C72383e(cVar, this));
            ChooseMediaViewModel chooseMediaViewModel4 = this.f162266f;
            if (chooseMediaViewModel4 == null) {
                C89219l.m154710a("chooseMediaViewModel");
            }
            chooseMediaViewModel4.mo33677a(this, C72398i.f162302a, C20371ai.m38578b(), new C72384f(cVar, this));
            ChooseMediaViewModel chooseMediaViewModel5 = this.f162266f;
            if (chooseMediaViewModel5 == null) {
                C89219l.m154710a("chooseMediaViewModel");
            }
            AbstractC88412b unused3 = chooseMediaViewModel5.mo33677a(this, C72399j.f162303a, new C20370ah(), new C72385g(this));
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        View a = C1764a.m5927a(t.getLayoutInflater(), R.layout.at8, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114665a(java.util.List<? extends com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel> r18, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Boolean, p4600h.C89391z> r19) {
        /*
        // Method dump skipped, instructions count: 586
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C72377f.mo114665a(java.util.List, h.f.a.b):void");
    }
}
