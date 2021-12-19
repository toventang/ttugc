package com.p2082ss.android.ugc.aweme.following.p3003ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.C1428g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.ies.powerlist.AbstractC17654e;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.C20442b;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.status.TuxStatusView;
import com.google.android.material.appbar.AppBarLayout;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51107f;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51108g;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.C51188e;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter;
import com.p2082ss.android.ugc.aweme.following.p3003ui.controller.C51216a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.controller.C51217b;
import com.p2082ss.android.ugc.aweme.following.p3003ui.controller.C51218c;
import com.p2082ss.android.ugc.aweme.following.p3003ui.controller.RecommendController;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.C51393c;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationState;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationTabViewModel;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowingRelationState;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowingRelationViewModel;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.TopRecommendVM;
import com.p2082ss.android.ugc.aweme.following.repository.C51133f;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51749t;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61517e;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p2436cc.EnumC35431b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.PrivacySetting;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.C66625h;
import com.p2082ss.android.ugc.aweme.recommend.RecommendListViewModel;
import com.p2082ss.android.ugc.aweme.recommend.RecommendUserListState;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74700b;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74707c;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74785g;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74787i;
import com.p2082ss.android.ugc.aweme.social.widget.card.EnumC74790k;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74760e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.AbstractC74890a;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.aweme.utils.C80429fh;
import com.p2082ss.android.ugc.aweme.utils.C80440fo;
import com.p2082ss.android.ugc.aweme.utils.C80494gh;
import com.p2082ss.android.ugc.aweme.utils.C80590iv;
import com.p2082ss.android.ugc.aweme.views.FixScrollableLayout;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.following.ui.p */
public final class C51274p extends AbstractC51143a implements KeyboardUtils.AbstractC34711a, C39211a.AbstractC39212a, AbstractC74788j, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    private C61517e f118234A;

    /* renamed from: B */
    private boolean f118235B;

    /* renamed from: C */
    private boolean f118236C;

    /* renamed from: D */
    private SparseArray f118237D;

    /* renamed from: l */
    final AtomicBoolean f118238l = new AtomicBoolean(false);

    /* renamed from: m */
    public FollowListAdapter f118239m;

    /* renamed from: n */
    public final C51393c f118240n;

    /* renamed from: o */
    public final C51188e f118241o;

    /* renamed from: p */
    public String f118242p;

    /* renamed from: q */
    public DmtStatusView.C17269a f118243q;

    /* renamed from: r */
    public boolean f118244r;

    /* renamed from: s */
    public int f118245s;

    /* renamed from: t */
    public final Handler f118246t;

    /* renamed from: u */
    private final lifecycleAwareLazy f118247u;

    /* renamed from: v */
    private final lifecycleAwareLazy f118248v;

    /* renamed from: w */
    private final AbstractC89244h f118249w = C89250i.m154773a((AbstractC89171a) new C51297as(this));

    /* renamed from: y */
    private final AbstractC89244h f118250y;

    /* renamed from: z */
    private boolean f118251z;

    static {
        Covode.recordClassIndex(60478);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f118237D == null) {
            this.f118237D = new SparseArray();
        }
        View view = (View) this.f118237D.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118237D.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f118237D;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: g */
    public final int mo86590g() {
        return R.layout.an6;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new RunnableC90250g(C51274p.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: i */
    public final int mo86592i() {
        return R.string.ew3;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: s */
    public final FollowingRelationViewModel mo86661s() {
        return (FollowingRelationViewModel) this.f118247u.getValue();
    }

    /* renamed from: t */
    public final RecommendListViewModel mo86662t() {
        return (RecommendListViewModel) this.f118248v.getValue();
    }

    /* renamed from: u */
    public final RecommendController mo86663u() {
        return (RecommendController) this.f118249w.getValue();
    }

    /* renamed from: v */
    public final FollowRelationTabViewModel mo86664v() {
        return (FollowRelationTabViewModel) this.f118250y.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$p */
    public static final class C51324p implements C61517e.AbstractC61520b {
        static {
            Covode.recordClassIndex(60528);
        }

        C51324p() {
        }

        @Override // com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61517e.AbstractC61520b
        /* renamed from: b */
        public final void mo86688b(Context context) {
            C80428fg.m139435c(context);
        }

        @Override // com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61517e.AbstractC61520b
        /* renamed from: a */
        public final boolean mo86687a(Context context) {
            return C80429fh.m139432a(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$q */
    public static final class C51325q implements AbstractC20443c<Object, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f118319a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f118320b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f118321c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f118322d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f118323e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> f118324f;

        static {
            Covode.recordClassIndex(60529);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f118322d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f118323e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> mo33775c() {
            return this.f118324f;
        }

        public C51325q(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f118319a = bVar;
            this.f118320b = mVar;
            this.f118321c = mVar2;
            this.f118322d = bVar;
            this.f118323e = mVar;
            this.f118324f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$r */
    public static final class C51326r implements AbstractC20443c<Object, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f118325a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f118326b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f118327c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f118328d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f118329e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> f118330f;

        static {
            Covode.recordClassIndex(60530);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f118328d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f118329e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> mo33775c() {
            return this.f118330f;
        }

        public C51326r(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f118325a = bVar;
            this.f118326b = mVar;
            this.f118327c = mVar2;
            this.f118328d = bVar;
            this.f118329e = mVar;
            this.f118330f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$al */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC51288al implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C51274p f118267a;

        static {
            Covode.recordClassIndex(60492);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC51288al(C51274p pVar) {
            this.f118267a = pVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.p$al$a */
        public static final class C51289a implements AbstractC89196a, Iterable<View> {

            /* renamed from: a */
            final /* synthetic */ ViewGroup f118268a;

            static {
                Covode.recordClassIndex(60493);
            }

            /* Return type fixed from 'java.util.Iterator' to match base method */
            @Override // java.lang.Iterable
            public final /* synthetic */ Iterator<View> iterator() {
                return new Object(this) {
                    /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.ViewTreeObserver$OnGlobalLayoutListenerC51288al.C51289a.C512901 */

                    /* renamed from: a */
                    public int f118269a;

                    /* renamed from: b */
                    final /* synthetic */ C51289a f118270b;

                    static {
                        Covode.recordClassIndex(60494);
                    }

                    public final void remove() {
                        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }

                    public final boolean hasNext() {
                        if (this.f118269a < this.f118270b.f118268a.getChildCount()) {
                            return true;
                        }
                        return false;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.Iterator
                    public final /* synthetic */ View next() {
                        ViewGroup viewGroup = this.f118270b.f118268a;
                        int i = this.f118269a;
                        this.f118269a = i + 1;
                        return viewGroup.getChildAt(i);
                    }

                    {
                        this.f118270b = r1;
                    }
                };
            }

            public C51289a(ViewGroup viewGroup) {
                this.f118268a = viewGroup;
            }
        }

        public final void onGlobalLayout() {
            int a = C34723i.m70924a(this.f118267a.getContext());
            FixScrollableLayout fixScrollableLayout = (FixScrollableLayout) this.f118267a.mo60929a(R.id.dgo);
            C89219l.m154716b(fixScrollableLayout, "");
            int i = 0;
            for (View view : new C51289a(fixScrollableLayout)) {
                i += view.getMeasuredHeight();
            }
            if (i < a) {
                this.f118267a.mo86659e(0);
                return;
            }
            C51274p pVar = this.f118267a;
            LinearLayout linearLayout = (LinearLayout) pVar.mo60929a(R.id.ekt);
            C89219l.m154716b(linearLayout, "");
            pVar.mo86659e(linearLayout.getHeight());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$as */
    static final class C51297as extends AbstractC89220m implements AbstractC89171a<RecommendController> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118277a;

        static {
            Covode.recordClassIndex(60501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51297as(C51274p pVar) {
            super(0);
            this.f118277a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecommendController invoke() {
            return new RecommendController(this.f118277a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: r */
    public final int mo86600r() {
        mo86591h();
        return R.string.bzg;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$b */
    public static final class C51302b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f118282a;

        static {
            Covode.recordClassIndex(60506);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51302b(AbstractC89277c cVar) {
            super(0);
            this.f118282a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f118282a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$d */
    public static final class C51305d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f118288a;

        static {
            Covode.recordClassIndex(60509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51305d(AbstractC89277c cVar) {
            super(0);
            this.f118288a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f118288a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$f */
    static final class C51308f implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C51274p f118294a;

        static {
            Covode.recordClassIndex(60512);
        }

        C51308f(C51274p pVar) {
            this.f118294a = pVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            C51274p pVar = this.f118294a;
            pVar.withState(pVar.mo86661s(), new AbstractC89172b<FollowingRelationState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.C51308f.C513091 */

                /* renamed from: a */
                final /* synthetic */ C51308f f118295a;

                static {
                    Covode.recordClassIndex(60513);
                }

                {
                    this.f118295a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FollowingRelationState followingRelationState) {
                    FollowingRelationState followingRelationState2 = followingRelationState;
                    C89219l.m154721d(followingRelationState2, "");
                    if (followingRelationState2.getListState().getPayload().f117968c != 0) {
                        C51274p pVar = this.f118295a.f118294a;
                        pVar.withState(pVar.mo86661s(), new C51295aq(pVar));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$n */
    static final class C51322n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118315a;

        static {
            Covode.recordClassIndex(60526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51322n(C51274p pVar) {
            super(0);
            this.f118315a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f118315a.mo86664v().mo86730a("suggest_user");
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: j */
    public final String mo86593j() {
        if (mo86591h()) {
            return "following";
        }
        return "other_following";
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView, "");
        return recyclerView;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onDestroy() {
        super.onDestroy();
        C61504e.C61505a.f139616a.mo99162c();
        C35434c.m72462a("follow_relation", EnumC35431b.CANCEL);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: p */
    public final void mo86598p() {
        mo86661s().f118421e.refresh();
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: q */
    public final int mo86599q() {
        if (mo86591h()) {
            return R.string.bzj;
        }
        return R.string.bzk;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ar */
    static final class RunnableC51296ar implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C51274p f118276a;

        static {
            Covode.recordClassIndex(60500);
        }

        RunnableC51296ar(C51274p pVar) {
            this.f118276a = pVar;
        }

        public final void run() {
            TopRecommendVM b = this.f118276a.mo86663u().mo86617b();
            if (b != null && b.mo86788a()) {
                b.mo86787a(false);
            }
            this.f118276a.mo86659e(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$au */
    static final class C51299au extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118279a;

        static {
            Covode.recordClassIndex(60503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51299au(C51274p pVar) {
            super(0);
            this.f118279a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C51274p pVar = this.f118279a;
            LinearLayout linearLayout = (LinearLayout) pVar.mo60929a(R.id.ekt);
            C89219l.m154716b(linearLayout, "");
            pVar.mo86659e(linearLayout.getHeight());
            return C89391z.f203057a;
        }
    }

    /* renamed from: A */
    public final boolean mo86655A() {
        return ((Boolean) withState(mo86661s(), C51287ak.f118266a)).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
    /* renamed from: b */
    public final void mo61027b() {
        this.f118246t.removeCallbacksAndMessages(null);
        this.f118246t.postDelayed(new RunnableC51296ar(this), 200);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
    /* renamed from: c */
    public final void mo61028c() {
        this.f118246t.removeCallbacksAndMessages(null);
        this.f118246t.postDelayed(new RunnableC51294ap(this), 200);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: l */
    public final boolean mo86595l() {
        return ((Boolean) withState(mo86661s(), new C51300av(this))).booleanValue();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onResume() {
        super.onResume();
        if (mo86591h() && C74707c.f167915c.mo117722b()) {
            KeyboardUtils.m70895a(this, getView(), this);
        }
    }

    /* renamed from: z */
    public final boolean mo86668z() {
        if (!mo86591h() || !C66652b.f149825a.mo105658d()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$a */
    public static final class C51275a extends AbstractC89220m implements AbstractC89171a<FollowRelationTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f118252a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f118253b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f118254c;

        static {
            Covode.recordClassIndex(60479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51275a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f118252a = fragment;
            this.f118253b = cVar;
            this.f118254c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationTabViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r0 = r3.f118252a
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r3.f118254c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r0)
                h.k.c r0 = r3.f118253b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m95690x4cb9bb61(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.C51275a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_following_ui_FollowingRelationFragment$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m95690x4cb9bb61(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ap */
    static final class RunnableC51294ap implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C51274p f118274a;

        static {
            Covode.recordClassIndex(60498);
        }

        RunnableC51294ap(C51274p pVar) {
            this.f118274a = pVar;
        }

        public final void run() {
            RecommendController u;
            TopRecommendVM b;
            if (this.f118274a.f118242p.length() == 0 && (b = (u = this.f118274a.mo86663u()).mo86617b()) != null && b.f118445a.get() && !b.f118447c && !b.mo86788a() && !u.f118124i) {
                b.mo86787a(true);
            }
            if (this.f118274a.f118245s != -1) {
                this.f118274a.f118245s = -1;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$c */
    public static final class C51303c extends AbstractC89220m implements AbstractC89171a<FollowingRelationViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f118283a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f118284b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f118285c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f118286d;

        static {
            Covode.recordClassIndex(60507);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51303c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f118283a = fragment;
            this.f118284b = aVar;
            this.f118285c = cVar;
            this.f118286d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowingRelationViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f118283a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f118284b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f118285c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m95691x539de2f1(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel> r0 = com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowingRelationViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.following.ui.p$c$1 r0 = new com.ss.android.ugc.aweme.following.ui.p$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.C51303c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_following_ui_FollowingRelationFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m95691x539de2f1(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$e */
    public static final class C51306e extends AbstractC89220m implements AbstractC89171a<RecommendListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f118289a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f118290b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f118291c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f118292d;

        static {
            Covode.recordClassIndex(60510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51306e(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f118289a = fragment;
            this.f118290b = aVar;
            this.f118291c = cVar;
            this.f118292d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.recommend.RecommendListViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f118289a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f118290b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f118291c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m95692x7aed89f3(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.recommend.RecommendListViewModel> r0 = com.p2082ss.android.ugc.aweme.recommend.RecommendListViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.following.ui.p$e$1 r0 = new com.ss.android.ugc.aweme.following.ui.p$e$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.C51306e.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_following_ui_FollowingRelationFragment$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m95692x7aed89f3(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: x */
    public final void mo86666x() {
        ((DmtStatusView) mo60929a(R.id.e7i)).mo27382d();
        this.f118242p = "";
        ImageButton imageButton = (ImageButton) mo60929a(R.id.x7);
        C89219l.m154716b(imageButton, "");
        imageButton.setVisibility(8);
        this.f118241o.mo62377b_(new ArrayList());
        this.f118241o.f118071b = this.f118242p;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$g */
    public static final class C51310g implements C80440fo.AbstractC80442a {

        /* renamed from: a */
        final /* synthetic */ C51274p f118296a;

        static {
            Covode.recordClassIndex(60514);
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.p$g$a */
        static final class RunnableC51311a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ User f118297a;

            /* renamed from: b */
            final /* synthetic */ C51310g f118298b;

            /* renamed from: c */
            final /* synthetic */ C80440fo f118299c;

            /* renamed from: d */
            final /* synthetic */ int f118300d;

            static {
                Covode.recordClassIndex(60515);
            }

            RunnableC51311a(User user, C51310g gVar, C80440fo foVar, int i) {
                this.f118297a = user;
                this.f118298b = gVar;
                this.f118299c = foVar;
                this.f118300d = i;
            }

            public final void run() {
                String.valueOf(this.f118300d);
                C59256u q = new C59256u().mo96834a("following_list").mo96839q(this.f118298b.f118296a.mo86594k());
                q.f135350a = C59256u.EnumC59259c.CARD;
                q.f135352b = C59256u.EnumC59257a.SHOW;
                C59256u s = q.mo96832a(this.f118297a).mo96841s(this.f118297a.getRequestId());
                C51274p pVar = this.f118298b.f118296a;
                s.mo96842t((String) pVar.withState(pVar.mo86662t(), C51313h.f118305a)).mo96792f();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.p$g$b */
        static final class RunnableC51312b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ User f118301a;

            /* renamed from: b */
            final /* synthetic */ C51310g f118302b;

            /* renamed from: c */
            final /* synthetic */ C80440fo f118303c;

            /* renamed from: d */
            final /* synthetic */ int f118304d;

            static {
                Covode.recordClassIndex(60516);
            }

            RunnableC51312b(User user, C51310g gVar, C80440fo foVar, int i) {
                this.f118301a = user;
                this.f118302b = gVar;
                this.f118303c = foVar;
                this.f118304d = i;
            }

            public final void run() {
                String str;
                if (this.f118302b.f118296a.mo86591h()) {
                    str = "following";
                } else {
                    str = "other_following";
                }
                String.valueOf(this.f118304d);
                this.f118301a.getRequestId();
                C39162r.m79462a("follow_list_user_show", C89387v.m154943a(str, "enter_from"), C89387v.m154943a(this.f118301a.getRequestId(), "req_id"), C89387v.m154943a(this.f118301a.getUid(), "to_user_id"), C89387v.m154943a(Integer.valueOf(this.f118304d), "impr_order"));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51310g(C51274p pVar) {
            this.f118296a = pVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.C80440fo.AbstractC80442a
        /* renamed from: a */
        public final void mo86642a(int i, C80440fo foVar) {
            User user;
            C89219l.m154721d(foVar, "");
            Object a = C51274p.m95659a(this.f118296a).mo33762a(i);
            if (a instanceof C51108g) {
                C51108g gVar = (C51108g) a;
                if (gVar.f117933a == 13) {
                    User user2 = gVar.f117934b;
                    if (user2 != null) {
                        String uid = user2.getUid();
                        C89219l.m154716b(uid, "");
                        foVar.mo123741a(uid, new RunnableC51311a(user2, this, foVar, i));
                        return;
                    }
                    return;
                }
                C51108g gVar2 = (C51108g) a;
                if (gVar2.f117933a == 0 && (user = gVar2.f117934b) != null) {
                    String uid2 = user.getUid();
                    C89219l.m154716b(uid2, "");
                    foVar.mo123741a(uid2, new RunnableC51312b(user, this, foVar, i));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$m */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC51321m implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C51274p f118314a;

        static {
            Covode.recordClassIndex(60525);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC51321m(C51274p pVar) {
            this.f118314a = pVar;
        }

        public final void onGlobalLayout() {
            Boolean value;
            TopRecommendVM b = this.f118314a.mo86663u().mo86617b();
            if (b != null && b.f118445a.get() && (value = b.f118450f.getValue()) != null && value.booleanValue() && !b.f118447c) {
                LinearLayout linearLayout = (LinearLayout) this.f118314a.mo60929a(R.id.ekt);
                C89219l.m154716b(linearLayout, "");
                int height = linearLayout.getHeight();
                this.f118314a.mo86659e(height);
                if (height > 0 && ((RecyclerView) this.f118314a.mo60929a(R.id.dof)).computeVerticalScrollOffset() > 0) {
                    if (((RecyclerView) this.f118314a.mo60929a(R.id.dof)).computeVerticalScrollOffset() > height) {
                        ((FixScrollableLayout) this.f118314a.mo60929a(R.id.dgo)).scrollTo(0, height);
                    } else {
                        ((RecyclerView) this.f118314a.mo60929a(R.id.dof)).mo4413b(0);
                    }
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo86665w() {
        List<IMUser> searchFollowIMUser;
        if (this.f118242p.length() != 0) {
            C51393c cVar = this.f118240n;
            String str = this.f118242p;
            C89219l.m154721d(str, "");
            if (TextUtils.isEmpty(str)) {
                searchFollowIMUser = new ArrayList<>();
            } else {
                searchFollowIMUser = IMService.createIIMServicebyMonsterPlugin(false).searchFollowIMUser(cVar.f118454a, str);
            }
            if (C13603b.m24435a((Collection) searchFollowIMUser)) {
                ((DmtStatusView) mo60929a(R.id.e7i)).mo27385g();
            } else {
                ((DmtStatusView) mo60929a(R.id.e7i)).mo27382d();
            }
            this.f118241o.mo62377b_(searchFollowIMUser);
            this.f118241o.f118071b = this.f118242p;
        }
    }

    /* renamed from: y */
    public final void mo86667y() {
        if (!mo86591h()) {
            return;
        }
        if (this.f118251z) {
            C61517e eVar = this.f118234A;
            if (eVar != null) {
                eVar.mo99173a();
            }
            this.f118251z = false;
            return;
        }
        C61517e eVar2 = this.f118234A;
        if (eVar2 != null && eVar2.f139649d != null && eVar2.f139648c != null && eVar2.f139650e != null) {
            eVar2.f139650e.mo86687a(eVar2.f139649d);
            if (System.currentTimeMillis() - eVar2.mo99174b() <= ((long) C61517e.f139647b) * 86400000 || eVar2.mo99175c() >= ((long) C61517e.f139646a)) {
                eVar2.f139648c.setVisibility(8);
            }
        }
    }

    public C51274p() {
        C51292an anVar = new C51292an(this);
        AbstractC89277c a = C89204ab.m154669a(FollowingRelationViewModel.class);
        C51302b bVar = new C51302b(a);
        this.f118247u = new lifecycleAwareLazy(this, bVar, new C51303c(this, bVar, a, anVar));
        C51293ao aoVar = new C51293ao(this);
        AbstractC89277c a2 = C89204ab.m154669a(RecommendListViewModel.class);
        C51305d dVar = new C51305d(a2);
        this.f118248v = new lifecycleAwareLazy(this, dVar, new C51306e(this, dVar, a2, aoVar));
        AbstractC89277c a3 = C89204ab.m154669a(FollowRelationTabViewModel.class);
        this.f118250y = C89250i.m154773a((AbstractC89171a) new C51275a(this, a3, a3));
        this.f118240n = new C51393c();
        this.f118241o = new C51188e();
        this.f118242p = "";
        this.f118244r = true;
        this.f118251z = true;
        this.f118245s = -1;
        this.f118246t = new Handler(Looper.getMainLooper());
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$k */
    public static final class C51318k implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C51274p f118310a;

        static {
            Covode.recordClassIndex(60522);
        }

        public final void afterTextChanged(Editable editable) {
            C89219l.m154721d(editable, "");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51318k(C51274p pVar) {
            this.f118310a = pVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.p$k$a */
        static final class C51319a extends AbstractC89220m implements AbstractC89172b<FollowRelationState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C51318k f118311a;

            /* renamed from: b */
            final /* synthetic */ CharSequence f118312b;

            static {
                Covode.recordClassIndex(60523);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C51319a(C51318k kVar, CharSequence charSequence) {
                super(1);
                this.f118311a = kVar;
                this.f118312b = charSequence;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(FollowRelationState followRelationState) {
                FollowRelationState followRelationState2 = followRelationState;
                C89219l.m154721d(followRelationState2, "");
                if (!TextUtils.isEmpty(this.f118312b) && !followRelationState2.isSearching()) {
                    this.f118311a.f118310a.mo86664v().mo86731a(true);
                } else if (TextUtils.isEmpty(this.f118312b) && followRelationState2.isSearching()) {
                    this.f118311a.f118310a.mo86664v().mo86731a(false);
                }
                return C89391z.f203057a;
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            C51274p pVar = this.f118310a;
            pVar.withState(pVar.mo86664v(), new C51319a(this, charSequence));
            if (!TextUtils.isEmpty(charSequence)) {
                ImageButton imageButton = (ImageButton) this.f118310a.mo60929a(R.id.x7);
                C89219l.m154716b(imageButton, "");
                imageButton.setVisibility(0);
                this.f118310a.f118242p = charSequence.toString();
                if (this.f118310a.f118244r) {
                    C39162r.m79460a("search_friends", new C33744d().f79943a);
                    this.f118310a.f118244r = false;
                }
                this.f118310a.mo86665w();
                return;
            }
            this.f118310a.mo86666x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$am */
    static final class C51291am extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, C66625h> {

        /* renamed from: a */
        public static final C51291am f118271a = new C51291am();

        static {
            Covode.recordClassIndex(60495);
        }

        C51291am() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C66625h invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            return recommendUserListState2.getRecommendMobParams();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$h */
    static final class C51313h extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C51313h f118305a = new C51313h();

        static {
            Covode.recordClassIndex(60517);
        }

        C51313h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            return recommendUserListState2.getUserId();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FollowListAdapter m95659a(C51274p pVar) {
        FollowListAdapter followListAdapter = pVar.f118239m;
        if (followListAdapter == null) {
            C89219l.m154710a("mFollowingListAdapter");
        }
        return followListAdapter;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$af */
    static final class C51281af extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118260a;

        static {
            Covode.recordClassIndex(60485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51281af(C51274p pVar) {
            super(1);
            this.f118260a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            ((DmtStatusView) this.f118260a.mo60929a(R.id.e7i)).mo27384f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$av */
    static final class C51300av extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118280a;

        static {
            Covode.recordClassIndex(60504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51300av(C51274p pVar) {
            super(1);
            this.f118280a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            return Boolean.valueOf(this.f118280a.mo86588a(followingRelationState2.getListState()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$aw */
    public static final class C51301aw extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C51301aw f118281a = new C51301aw();

        static {
            Covode.recordClassIndex(60505);
        }

        C51301aw() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_lock;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$i */
    static final class View$OnClickListenerC51314i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51274p f118306a;

        static {
            Covode.recordClassIndex(60518);
        }

        View$OnClickListenerC51314i(C51274p pVar) {
            this.f118306a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C51274p pVar = this.f118306a;
            pVar.withState(pVar.mo86664v(), new AbstractC89172b<FollowRelationState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.View$OnClickListenerC51314i.C513151 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC51314i f118307a;

                static {
                    Covode.recordClassIndex(60519);
                }

                {
                    this.f118307a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FollowRelationState followRelationState) {
                    FollowRelationState followRelationState2 = followRelationState;
                    C89219l.m154721d(followRelationState2, "");
                    if (followRelationState2.isSearching()) {
                        this.f118307a.f118306a.mo86664v().mo86731a(false);
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$z */
    static final class C51337z extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118343a;

        static {
            Covode.recordClassIndex(60541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51337z(C51274p pVar) {
            super(1);
            this.f118343a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            C51274p.m95659a(this.f118343a).ao_();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
    /* renamed from: a */
    public final void mo86627a(User user) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(user, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ai */
    static final class C51285ai extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118264a;

        static {
            Covode.recordClassIndex(60489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51285ai(C51274p pVar) {
            super(1);
            this.f118264a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            DmtStatusView dmtStatusView = (DmtStatusView) this.f118264a.mo60929a(R.id.e7i);
            C89219l.m154716b(dmtStatusView, "");
            if (!dmtStatusView.mo27389j()) {
                C51274p.m95659a(this.f118264a).ao_();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ak */
    public static final class C51287ak extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, Boolean> {

        /* renamed from: a */
        public static final C51287ak f118266a = new C51287ak();

        static {
            Covode.recordClassIndex(60491);
        }

        C51287ak() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(FollowingRelationState followingRelationState) {
            List<Object> a;
            FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            List<Object> a2 = followingRelationState2.getListState().getRefresh().mo33695a();
            boolean z = false;
            if ((a2 == null || a2.isEmpty()) && ((a = followingRelationState2.getListState().getLoadMore().mo33695a()) == null || a.isEmpty())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$aq */
    static final class C51295aq extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118275a;

        static {
            Covode.recordClassIndex(60499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51295aq(C51274p pVar) {
            super(1);
            this.f118275a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            List<Object> recommendList = followingRelationState2.getRecommendList();
            if (recommendList == null || recommendList.isEmpty()) {
                this.f118275a.mo86661s().f118421e.loadMore();
            } else {
                C51274p.m95659a(this.f118275a).ao_();
                this.f118275a.mo86662t().mo33758l();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$v */
    static final class C51332v extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118338a;

        static {
            Covode.recordClassIndex(60536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51332v(C51274p pVar) {
            super(1);
            this.f118338a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            if (this.f118338a.mo86655A()) {
                ((DmtStatusView) this.f118338a.mo60929a(R.id.e7i)).mo27384f();
            } else {
                C51274p.m95659a(this.f118338a).ao_();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final String mo86657b(int i) {
        if (i == 2096) {
            String string = getString(R.string.esw);
            C89219l.m154716b(string, "");
            return string;
        } else if (i != 3002060) {
            String string2 = getString(R.string.esw);
            C89219l.m154716b(string2, "");
            return string2;
        } else {
            String string3 = getString(R.string.bzi);
            C89219l.m154716b(string3, "");
            return string3;
        }
    }

    /* renamed from: c */
    public final String mo86658c(int i) {
        String str;
        if (i == 2096) {
            String string = getString(R.string.evh);
            C89219l.m154716b(string, "");
            return string;
        } else if (i != 3002060) {
            String string2 = getString(R.string.evh);
            C89219l.m154716b(string2, "");
            return string2;
        } else {
            Object[] objArr = new Object[1];
            User user = this.f117989c;
            if (user != null) {
                str = user.getUniqueId();
            } else {
                str = null;
            }
            objArr[0] = str;
            String string3 = getString(R.string.bzh, objArr);
            C89219l.m154716b(string3, "");
            return string3;
        }
    }

    /* renamed from: e */
    public final void mo86659e(int i) {
        if (mo60929a(R.id.dgo) != null) {
            ScrollableLayout scrollableLayout = (ScrollableLayout) mo60929a(R.id.dgo);
            C89219l.m154716b(scrollableLayout, "");
            scrollableLayout.getHelper().f92631b = this;
            ((ScrollableLayout) mo60929a(R.id.dgo)).setMaxScrollHeight(i);
        }
    }

    @AbstractC90264r
    public final void onAntiCrawlerEvent(C34569a aVar) {
        C89219l.m154721d(aVar, "");
        String str = aVar.f81610a;
        if (str == null) {
            return;
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/user/follower/list/?", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/user/following/list/?", false)) {
            EventBus.m156962a().mo145397d(aVar);
            mo86598p();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (!this.f118235B) {
                this.f118235B = true;
                C35434c.m72461a("follow_relation");
            }
        } else if (mo60929a(R.id.ax7) != null) {
            C39115e.m79412a(getActivity(), mo60929a(R.id.ax7));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$at */
    static final class C51298at extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C51298at f118278a = new C51298at();

        static {
            Covode.recordClassIndex(60502);
        }

        C51298at() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 70.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 70.0f, system2.getDisplayMetrics()));
            aVar2.f54431a = R.raw.icon_large_person;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
    /* renamed from: a */
    public final void mo86629a(EnumC74790k kVar) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
    /* renamed from: d */
    public final void mo86630d(int i) {
        if (mo86655A() && this.f43437f && !this.f118236C) {
            this.f118236C = true;
            if (i <= 0) {
                TuxStatusView tuxStatusView = (TuxStatusView) mo60929a(R.id.b7d);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(8);
                DmtStatusView dmtStatusView = (DmtStatusView) mo60929a(R.id.e7i);
                C89219l.m154716b(dmtStatusView, "");
                dmtStatusView.setVisibility(0);
                ((DmtStatusView) mo60929a(R.id.e7i)).mo27385g();
                LinearLayout linearLayout = (LinearLayout) mo60929a(R.id.drt);
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
            } else if (this.f43437f) {
                mo86663u().mo86616a();
                TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C51298at.f118278a));
                String string = getString(R.string.bxu);
                C89219l.m154716b(string, "");
                TuxStatusView.C23263c a2 = a.mo37879a(string);
                String string2 = getString(R.string.bzj);
                C89219l.m154716b(string2, "");
                ((TuxStatusView) mo60929a(R.id.b7d)).setStatus(a2.mo37878a((CharSequence) string2));
                TuxStatusView tuxStatusView2 = (TuxStatusView) mo60929a(R.id.b7d);
                C89219l.m154716b(tuxStatusView2, "");
                tuxStatusView2.setVisibility(0);
                View a3 = mo60929a(R.id.b7d);
                C51299au auVar = new C51299au(this);
                C89219l.m154721d(auVar, "");
                if (a3 != null) {
                    a3.getViewTreeObserver().addOnGlobalLayoutListener(new C80590iv.ViewTreeObserver$OnGlobalLayoutListenerC80591a(a3, auVar));
                }
                DmtStatusView dmtStatusView2 = (DmtStatusView) mo60929a(R.id.e7i);
                C89219l.m154716b(dmtStatusView2, "");
                dmtStatusView2.setVisibility(8);
            }
        }
        if (!mo86655A() && i <= 0) {
            mo86659e(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ab */
    static final class C51277ab extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends User>, C89391z> {

        /* renamed from: a */
        public static final C51277ab f118256a = new C51277ab();

        static {
            Covode.recordClassIndex(60481);
        }

        C51277ab() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list, "");
            C61504e.C61505a.f139616a.mo99161b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$aa */
    static final class C51276aa extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118255a;

        static {
            Covode.recordClassIndex(60480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51276aa(C51274p pVar) {
            super(2);
            this.f118255a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            C51274p.m95659a(this.f118255a).mo67824j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ae */
    static final class C51280ae extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118259a;

        static {
            Covode.recordClassIndex(60484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51280ae(C51274p pVar) {
            super(2);
            this.f118259a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f118259a.mo86664v().mo86730a("following_relation");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$aj */
    static final class C51286aj extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118265a;

        static {
            Covode.recordClassIndex(60490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51286aj(C51274p pVar) {
            super(2);
            this.f118265a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            C51274p.m95659a(this.f118265a).mo67824j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$j */
    static final class View$OnTouchListenerC51316j implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C51274p f118308a;

        static {
            Covode.recordClassIndex(60520);
        }

        View$OnTouchListenerC51316j(C51274p pVar) {
            this.f118308a = pVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            C51274p pVar = this.f118308a;
            pVar.withState(pVar.mo86664v(), new AbstractC89172b<FollowRelationState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.View$OnTouchListenerC51316j.C513171 */

                /* renamed from: a */
                final /* synthetic */ View$OnTouchListenerC51316j f118309a;

                static {
                    Covode.recordClassIndex(60521);
                }

                {
                    this.f118309a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FollowRelationState followRelationState) {
                    FollowRelationState followRelationState2 = followRelationState;
                    C89219l.m154721d(followRelationState2, "");
                    if (!followRelationState2.isSearching()) {
                        DmtEditText dmtEditText = (DmtEditText) this.f118309a.f118308a.mo60929a(R.id.ax7);
                        C89219l.m154716b(dmtEditText, "");
                        dmtEditText.setCursorVisible(true);
                    }
                    return C89391z.f203057a;
                }
            });
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$s */
    static final class C51327s extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118331a;

        static {
            Covode.recordClassIndex(60531);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51327s(C51274p pVar) {
            super(2);
            this.f118331a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f118331a.mo86661s(), new AbstractC89172b<FollowingRelationState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.C51327s.C513281 */

                /* renamed from: a */
                final /* synthetic */ C51327s f118332a;

                static {
                    Covode.recordClassIndex(60532);
                }

                {
                    this.f118332a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FollowingRelationState followingRelationState) {
                    FollowingRelationState followingRelationState2 = followingRelationState;
                    C89219l.m154721d(followingRelationState2, "");
                    if (!this.f118332a.f118331a.mo86661s().mo86786a(followingRelationState2.getListState().getPayload().f48406a.f48382a, followingRelationState2.getListState().getPayload().f117970e, followingRelationState2.getListState().getPayload().f117971f)) {
                        if (!this.f118332a.f118331a.mo86655A() || this.f118332a.f118331a.mo86668z()) {
                            ((DmtStatusView) this.f118332a.f118331a.mo60929a(R.id.e7i)).mo27382d();
                        } else {
                            ((DmtStatusView) this.f118332a.f118331a.mo60929a(R.id.e7i)).mo27385g();
                        }
                    }
                    this.f118332a.f118331a.mo86667y();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$an */
    static final class C51292an extends AbstractC89220m implements AbstractC89183m<FollowingRelationState, Bundle, FollowingRelationState> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118272a;

        static {
            Covode.recordClassIndex(60496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51292an(C51274p pVar) {
            super(2);
            this.f118272a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState, Bundle bundle) {
            String secUid;
            FollowingRelationState followingRelationState2 = followingRelationState;
            String str = "";
            C89219l.m154721d(followingRelationState2, str);
            String str2 = ((AbstractC51143a) this.f118272a).f117988b;
            if (str2 == null) {
                str2 = str;
            }
            User user = this.f118272a.f117989c;
            if (!(user == null || (secUid = user.getSecUid()) == null)) {
                str = secUid;
            }
            return FollowingRelationState.copy$default(followingRelationState2, str2, str, this.f118272a.mo86591h(), null, null, false, 0, null, null, null, 1016, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$w */
    static final class C51333w extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118339a;

        static {
            Covode.recordClassIndex(60537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51333w(C51274p pVar) {
            super(2);
            this.f118339a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            if (!this.f118339a.mo86655A()) {
                C51274p.m95659a(this.f118339a).ap_();
            } else {
                ((DmtStatusView) this.f118339a.mo60929a(R.id.e7i)).mo27385g();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ac */
    static final class C51278ac extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118257a;

        static {
            Covode.recordClassIndex(60482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51278ac(C51274p pVar) {
            super(2);
            this.f118257a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list) {
            int i;
            List<? extends User> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            for (T t : list2) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                if (t2 instanceof RecommendContact) {
                    arrayList.add(t2);
                } else {
                    String requestId = t2.getRequestId();
                    C89219l.m154716b(requestId, "");
                    arrayList.add(new C51108g(13, t2, i3, requestId));
                    i3++;
                }
                i2 = i4;
            }
            if (!list2.isEmpty()) {
                Resources resources = this.f118257a.getResources();
                if (C74700b.m131157e()) {
                    i = R.string.p0;
                } else {
                    i = R.string.evs;
                }
                String string = resources.getString(i);
                C89219l.m154716b(string, "");
                arrayList.add(0, new C51107f(14, string));
            }
            this.f118257a.mo86661s().mo86785a(arrayList);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ag */
    static final class C51282ag extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118261a;

        static {
            Covode.recordClassIndex(60486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51282ag(C51274p pVar) {
            super(2);
            this.f118261a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th2, "");
            if (th2 instanceof C34485a) {
                C34480a aVar = (C34480a) th2;
                if (aVar.getErrorCode() == 2096 || aVar.getErrorCode() == 3002060) {
                    ((DmtStatusView) this.f118261a.mo60929a(R.id.e7i)).mo27382d();
                    C51274p pVar = this.f118261a;
                    pVar.mo86656a(pVar.mo86657b(aVar.getErrorCode()), this.f118261a.mo86658c(aVar.getErrorCode()));
                    this.f118261a.mo86663u().mo86616a();
                    return C89391z.f203057a;
                }
            }
            C51274p pVar2 = this.f118261a;
            DmtStatusView dmtStatusView = (DmtStatusView) pVar2.mo60929a(R.id.e7i);
            C89219l.m154716b(dmtStatusView, "");
            pVar2.mo86586a(dmtStatusView, (Exception) th2);
            ((DmtStatusView) this.f118261a.mo60929a(R.id.e7i)).mo27387h();
            this.f118261a.mo86663u().mo86616a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ao */
    static final class C51293ao extends AbstractC89220m implements AbstractC89183m<RecommendUserListState, Bundle, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118273a;

        static {
            Covode.recordClassIndex(60497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51293ao(C51274p pVar) {
            super(2);
            this.f118273a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState, Bundle bundle) {
            String secUid;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            String str = "";
            C89219l.m154721d(recommendUserListState2, str);
            String str2 = ((AbstractC51143a) this.f118273a).f117988b;
            if (str2 == null) {
                str2 = str;
            }
            User user = this.f118273a.f117989c;
            if (!(user == null || (secUid = user.getSecUid()) == null)) {
                str = secUid;
            }
            return RecommendUserListState.copy$default(recommendUserListState2, str2, str, this.f118273a.mo86591h(), 13, null, new C66625h(this.f118273a.mo86593j(), this.f118273a.mo86594k(), "empty"), null, 80, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$x */
    static final class C51334x extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118340a;

        static {
            Covode.recordClassIndex(60538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51334x(C51274p pVar) {
            super(2);
            this.f118340a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list) {
            List<? extends User> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            if (list2.isEmpty() && this.f118340a.mo86655A()) {
                ((DmtStatusView) this.f118340a.mo60929a(R.id.e7i)).mo27385g();
            } else if (!C74700b.m131157e() && this.f118340a.mo86655A()) {
                ((DmtStatusView) this.f118340a.mo60929a(R.id.e7i)).mo27382d();
                FollowingRelationViewModel s = this.f118340a.mo86661s();
                C89219l.m154721d("", "");
                s.mo33687b_(new FollowingRelationViewModel.C51381g(s, ""));
                this.f118340a.f118246t.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.C51334x.RunnableC513351 */

                    /* renamed from: a */
                    final /* synthetic */ C51334x f118341a;

                    static {
                        Covode.recordClassIndex(60539);
                    }

                    {
                        this.f118341a = r1;
                    }

                    public final void run() {
                        C51274p pVar = this.f118341a.f118340a;
                        RecyclerView recyclerView = (RecyclerView) this.f118341a.f118340a.mo60929a(R.id.dof);
                        C89219l.m154716b(recyclerView, "");
                        pVar.mo86659e(recyclerView.getHeight());
                    }
                });
            }
            C61504e eVar = C61504e.C61505a.f139616a;
            C89219l.m154716b(eVar, "");
            if (!TextUtils.isEmpty(eVar.mo99159a())) {
                C61504e.C61505a.f139616a.mo99161b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$y */
    static final class C51336y extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118342a;

        static {
            Covode.recordClassIndex(60540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51336y(C51274p pVar) {
            super(2);
            this.f118342a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                DmtEditText dmtEditText = (DmtEditText) this.f118342a.mo60929a(R.id.ax7);
                C89219l.m154716b(dmtEditText, "");
                dmtEditText.setCursorVisible(true);
                RecyclerView recyclerView = (RecyclerView) this.f118342a.mo60929a(R.id.dof);
                C89219l.m154716b(recyclerView, "");
                recyclerView.setAdapter(this.f118342a.f118241o);
                ((DmtStatusView) this.f118342a.mo60929a(R.id.e7i)).setBuilder(this.f118342a.f118243q);
                ((DmtStatusView) this.f118342a.mo60929a(R.id.e7i)).mo27382d();
                this.f118342a.f118240n.mo86789a();
            } else {
                DmtEditText dmtEditText2 = (DmtEditText) this.f118342a.mo60929a(R.id.ax7);
                C89219l.m154716b(dmtEditText2, "");
                dmtEditText2.setCursorVisible(false);
                ((DmtEditText) this.f118342a.mo60929a(R.id.ax7)).clearFocus();
                DmtEditText dmtEditText3 = (DmtEditText) this.f118342a.mo60929a(R.id.ax7);
                Objects.requireNonNull(dmtEditText3, "null cannot be cast to non-null type android.widget.TextView");
                dmtEditText3.setText("");
                C39115e.m79412a(this.f118342a.getActivity(), this.f118342a.mo60929a(R.id.ax7));
                RecyclerView recyclerView2 = (RecyclerView) this.f118342a.mo60929a(R.id.dof);
                C89219l.m154716b(recyclerView2, "");
                recyclerView2.setAdapter(C51274p.m95659a(this.f118342a));
                ((DmtStatusView) this.f118342a.mo60929a(R.id.e7i)).setBuilder(this.f118342a.mo86589e());
                this.f118342a.mo86666x();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$t */
    static final class C51329t extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118333a;

        static {
            Covode.recordClassIndex(60533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51329t(C51274p pVar) {
            super(2);
            this.f118333a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            Integer num;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                C51274p.m95659a(this.f118333a).aq_();
            } else if (this.f118333a.mo86668z()) {
                if (C74707c.f167915c.mo117723c()) {
                    C51274p pVar = this.f118333a;
                    if (!((Boolean) C74700b.f167900b.getValue()).booleanValue() && (!C74700b.m131154b() || pVar.mo86655A() || !C74707c.f167915c.mo117722b())) {
                        FollowListAdapter followListAdapter = pVar.f118239m;
                        if (followListAdapter == null) {
                            C89219l.m154710a("mFollowingListAdapter");
                        }
                        followListAdapter.ap_();
                        RecyclerView recyclerView = (RecyclerView) pVar.mo60929a(R.id.dof);
                        C89219l.m154716b(recyclerView, "");
                        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                        if (!(layoutManager instanceof LinearLayoutManager)) {
                            layoutManager = null;
                        }
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        if (linearLayoutManager != null) {
                            num = Integer.valueOf(linearLayoutManager.mo4371k());
                        } else {
                            num = null;
                        }
                        RecyclerView recyclerView2 = (RecyclerView) pVar.mo60929a(R.id.dof);
                        C89219l.m154716b(recyclerView2, "");
                        RecyclerView.AbstractC1350a[] aVarArr = new RecyclerView.AbstractC1350a[2];
                        FollowListAdapter followListAdapter2 = pVar.f118239m;
                        if (followListAdapter2 == null) {
                            C89219l.m154710a("mFollowingListAdapter");
                        }
                        aVarArr[0] = followListAdapter2;
                        C89219l.m154721d(pVar, "");
                        C89219l.m154721d(pVar, "");
                        C74787i iVar2 = C74787i.f168102a;
                        C74743a aVar = new C74743a(null, pVar, null, null, 13);
                        C74765i.C74766a aVar2 = new C74765i.C74766a();
                        aVar2.f168059a = 7;
                        C74765i.C74766a a = aVar2.mo117824a(RecommendController.C51205a.m95620a(EnumC74754a.RECTANGLE, true)).mo117825a(RecommendController.C51205a.m95621a(EnumC74754a.RECTANGLE, 20, Integer.MAX_VALUE, null)).mo117826a(pVar);
                        RecommendController.C51205a.C51206a aVar3 = RecommendController.C51205a.C51206a.f118126a;
                        a.f168060b = true;
                        a.f168061c = aVar3;
                        aVarArr[1] = iVar2.mo117806b(aVar, a.mo117827a("following_list").mo117830b("bottom").mo117831c("personal_homepage").mo117829a());
                        recyclerView2.setAdapter(new C1428g(aVarArr));
                        RecyclerView recyclerView3 = (RecyclerView) pVar.mo60929a(R.id.dof);
                        C89219l.m154716b(recyclerView3, "");
                        recyclerView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC51288al(pVar));
                        if (num != null) {
                            ((RecyclerView) pVar.mo60929a(R.id.dof)).mo4413b(num.intValue());
                        }
                    } else {
                        if (!pVar.mo86655A()) {
                            C66625h hVar = (C66625h) pVar.withState(pVar.mo86662t(), C51291am.f118271a);
                            RecommendListViewModel t = pVar.mo86662t();
                            String str = hVar.f149764a;
                            String str2 = hVar.f149765b;
                            C89219l.m154721d(str, "");
                            C89219l.m154721d(str2, "");
                            C89219l.m154721d("nonempty", "");
                            C66625h hVar2 = new C66625h(str, str2, "nonempty");
                            C89219l.m154721d(hVar2, "");
                            t.mo33689c(new RecommendListViewModel.C66605j(hVar2));
                        }
                        pVar.mo86662t().mo33757k();
                    }
                } else {
                    C51274p.m95659a(this.f118333a).ap_();
                }
                C74707c cVar = C74707c.f167915c;
                if (!cVar.mo117722b() && !cVar.mo117723c() && this.f118333a.mo86655A()) {
                    DmtStatusView dmtStatusView = (DmtStatusView) this.f118333a.mo60929a(R.id.e7i);
                    C89219l.m154716b(dmtStatusView, "");
                    dmtStatusView.setVisibility(0);
                    ((DmtStatusView) this.f118333a.mo60929a(R.id.e7i)).mo27385g();
                }
            } else if (this.f118333a.mo86595l()) {
                FollowingRelationViewModel s = this.f118333a.mo86661s();
                s.mo33687b_(new FollowingRelationViewModel.C51380f(s));
                C51274p.m95659a(this.f118333a).aq_();
            } else {
                C51274p.m95659a(this.f118333a).ap_();
                ((DmtStatusView) this.f118333a.mo60929a(R.id.e7i)).mo27385g();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo86656a(String str, String str2) {
        ((TuxStatusView) mo60929a(R.id.b7l)).setStatus(new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C51301aw.f118281a)).mo37879a(str).mo37878a((CharSequence) str2));
        TuxStatusView tuxStatusView = (TuxStatusView) mo60929a(R.id.b7l);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ah */
    static final class C51283ah extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118262a;

        static {
            Covode.recordClassIndex(60487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51283ah(C51274p pVar) {
            super(2);
            this.f118262a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            AbstractC17654e a;
            MethodCollector.m26663i(10093);
            AbstractC20477i iVar2 = iVar;
            List<? extends Object> list2 = list;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list2, "");
            if (!C13603b.m24435a((Collection) list2)) {
                ((DmtStatusView) this.f118262a.mo60929a(R.id.e7i)).mo27382d();
                this.f118262a.mo86667y();
                C35434c.m72464b("follow_relation");
            }
            iVar2.withState(this.f118262a.mo86661s(), new AbstractC89172b<FollowingRelationState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.C51283ah.C512841 */

                /* renamed from: a */
                final /* synthetic */ C51283ah f118263a;

                static {
                    Covode.recordClassIndex(60488);
                }

                {
                    this.f118263a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FollowingRelationState followingRelationState) {
                    FollowingRelationState followingRelationState2 = followingRelationState;
                    C89219l.m154721d(followingRelationState2, "");
                    if (!this.f118263a.f118262a.mo86661s().mo86786a(followingRelationState2.getListState().getPayload().f48406a.f48382a, followingRelationState2.getListState().getPayload().f117970e, followingRelationState2.getListState().getPayload().f117971f) && !this.f118263a.f118262a.mo86655A() && this.f118263a.f118262a.mo86591h() && IMService.createIIMServicebyMonsterPlugin(false).isIMAvailable()) {
                        LinearLayout linearLayout = (LinearLayout) this.f118263a.f118262a.mo60929a(R.id.drt);
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                        }
                        C80494gh.m139518a((RecyclerView) this.f118263a.f118262a.mo60929a(R.id.dof), 0);
                    }
                    return C89391z.f203057a;
                }
            });
            C51274p pVar = this.f118262a;
            if (pVar.mo86591h() && ((!C74700b.m131154b() || !pVar.mo86655A()) && C74707c.f167915c.mo117722b() && !pVar.f118238l.getAndSet(true))) {
                RecommendController u = pVar.mo86663u();
                LinearLayout linearLayout = (LinearLayout) pVar.mo60929a(R.id.ekt);
                C89219l.m154716b(linearLayout, "");
                DmtStatusView dmtStatusView = (DmtStatusView) pVar.mo60929a(R.id.e7i);
                C89219l.m154716b(dmtStatusView, "");
                C89219l.m154721d(linearLayout, "");
                C89219l.m154721d(dmtStatusView, "");
                C89219l.m154721d(pVar, "");
                TopRecommendVM b = u.mo86617b();
                if (b != null && !b.f118445a.getAndSet(true)) {
                    Fragment fragment = u.f118125j;
                    u.f118118c = linearLayout;
                    u.f118123h = dmtStatusView;
                    View findViewById = linearLayout.findViewById(R.id.eku);
                    C89219l.m154716b(findViewById, "");
                    u.f118119d = (PowerList) findViewById;
                    u.f118117b = new C74743a(null, fragment, null, null, 13);
                    LinearLayout linearLayout2 = u.f118118c;
                    if (linearLayout2 == null) {
                        C89219l.m154710a("container");
                    }
                    linearLayout2.getViewTreeObserver().addOnGlobalLayoutListener(u);
                    u.f118125j.getLifecycle().mo4012a(u);
                    u.f118120e = pVar;
                    AbstractC74785g a2 = C74787i.f168102a.mo117805a();
                    C74743a aVar = u.f118117b;
                    if (aVar == null) {
                        C89219l.m154710a("socialContext");
                    }
                    AbstractC74890a a3 = a2.mo117845a(aVar, new RecommendController.C51210d(u, b));
                    LinearLayout linearLayout3 = u.f118118c;
                    if (linearLayout3 == null) {
                        C89219l.m154710a("container");
                    }
                    linearLayout3.addView(a3, 0);
                    if (!u.f118116a) {
                        LayoutInflater from = LayoutInflater.from(u.f118125j.requireContext());
                        LinearLayout linearLayout4 = u.f118118c;
                        if (linearLayout4 == null) {
                            C89219l.m154710a("container");
                        }
                        u.f118121f = C1764a.m5927a(from, R.layout.amx, linearLayout4, false);
                        LinearLayout linearLayout5 = u.f118118c;
                        if (linearLayout5 == null) {
                            C89219l.m154710a("container");
                        }
                        linearLayout5.addView(u.f118121f, 2);
                    }
                    PowerList powerList = u.f118119d;
                    if (powerList == null) {
                        C89219l.m154710a("topRecommendList");
                    }
                    powerList.setVisibility(0);
                    u.f118125j.requireContext();
                    WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(C74700b.m131154b() ? 1 : 0);
                    powerList.setLayoutManager(wrapLinearLayoutManager);
                    if (wrapLinearLayoutManager.f4334j == 0) {
                        Resources system = Resources.getSystem();
                        C89219l.m154709a((Object) system, "");
                        C23163i.m43668b(powerList, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()))), null, null, false, 29);
                        Resources system2 = Resources.getSystem();
                        C89219l.m154709a((Object) system2, "");
                        C23163i.m43660a((View) powerList, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()))), (Integer) null, (Integer) null, (Integer) null, false, 30);
                        powerList.setClipToPadding(false);
                        powerList.setItemAnimator(new C51749t());
                        powerList.mo4402a(C74787i.f168102a.mo117805a().mo117844a());
                    }
                    if (C74700b.m131154b()) {
                        C74787i iVar3 = C74787i.f168102a;
                        C74743a aVar2 = u.f118117b;
                        if (aVar2 == null) {
                            C89219l.m154710a("socialContext");
                        }
                        C74765i.C74766a aVar3 = new C74765i.C74766a();
                        aVar3.f168059a = 7;
                        C74765i.C74766a a4 = aVar3.mo117827a("following_list").mo117831c("personal_homepage").mo117830b("top").mo117824a(RecommendController.C51205a.m95620a(EnumC74754a.RECTANGLE, false));
                        Fragment fragment2 = u.f118125j;
                        TopRecommendVM b2 = u.mo86617b();
                        if (b2 == null) {
                            C89219l.m154715b();
                        }
                        DmtStatusView dmtStatusView2 = u.f118123h;
                        if (dmtStatusView2 == null) {
                            C89219l.m154710a("statusView");
                        }
                        AbstractC74788j jVar = u.f118120e;
                        if (jVar == null) {
                            C89219l.m154710a("externalStateListener");
                        }
                        a = iVar3.mo117803a(aVar2, a4.mo117826a(new C51217b(fragment2, b2, dmtStatusView2, jVar)).mo117829a());
                    } else if (C74700b.m131155c() || C74700b.m131156d()) {
                        C74765i.C74766a aVar4 = new C74765i.C74766a();
                        aVar4.f168059a = 7;
                        C74765i.C74766a a5 = aVar4.mo117827a("following_list").mo117831c("personal_homepage").mo117830b("top").mo117824a(RecommendController.C51205a.m95620a(EnumC74754a.SQUARE, true));
                        EnumC74754a aVar5 = EnumC74754a.SQUARE;
                        PowerList powerList2 = u.f118119d;
                        if (powerList2 == null) {
                            C89219l.m154710a("topRecommendList");
                        }
                        C74765i.C74766a a6 = a5.mo117825a(RecommendController.C51205a.m95621a(aVar5, 30, 30, powerList2));
                        if (C74700b.m131156d()) {
                            TopRecommendVM b3 = u.mo86617b();
                            if (b3 == null) {
                                C89219l.m154715b();
                            }
                            DmtStatusView dmtStatusView3 = u.f118123h;
                            if (dmtStatusView3 == null) {
                                C89219l.m154710a("statusView");
                            }
                            AbstractC74788j jVar2 = u.f118120e;
                            if (jVar2 == null) {
                                C89219l.m154710a("externalStateListener");
                            }
                            a6.mo117826a(new C51218c(b3, dmtStatusView3, jVar2));
                        } else {
                            TopRecommendVM b4 = u.mo86617b();
                            if (b4 == null) {
                                C89219l.m154715b();
                            }
                            DmtStatusView dmtStatusView4 = u.f118123h;
                            if (dmtStatusView4 == null) {
                                C89219l.m154710a("statusView");
                            }
                            AbstractC74788j jVar3 = u.f118120e;
                            if (jVar3 == null) {
                                C89219l.m154710a("externalStateListener");
                            }
                            a6.mo117826a(new C51216a(b4, dmtStatusView4, jVar3));
                        }
                        C74787i iVar4 = C74787i.f168102a;
                        C74743a aVar6 = u.f118117b;
                        if (aVar6 == null) {
                            C89219l.m154710a("socialContext");
                        }
                        a = iVar4.mo117803a(aVar6, a6.mo117829a());
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("experiment group 1 shouldn't enter here.");
                        MethodCollector.m26664o(10093);
                        throw illegalStateException;
                    }
                    powerList.mo28080a(a);
                    b.f118449e.observe(u, new RecommendController.C51213e(u));
                    b.f118451g.observe(u, new RecommendController.C51214f(u));
                }
                LinearLayout linearLayout6 = (LinearLayout) pVar.mo60929a(R.id.ekt);
                C89219l.m154716b(linearLayout6, "");
                linearLayout6.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC51321m(pVar));
                RecommendController u2 = pVar.mo86663u();
                C51322n nVar = new C51322n(pVar);
                C89219l.m154721d(nVar, "");
                u2.f118122g = nVar;
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(10093);
            return zVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PrivacySetting privacySetting;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        User user = this.f117989c;
        if (user == null || (privacySetting = user.getPrivacySetting()) == null || privacySetting.getFollowingVisibility() != 2) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo60929a(R.id.e5w);
            C89219l.m154716b(swipeRefreshLayout, "");
            swipeRefreshLayout.setEnabled(false);
            DmtStatusView dmtStatusView = (DmtStatusView) mo60929a(R.id.e7i);
            C89219l.m154716b(dmtStatusView, "");
            mo86585a(dmtStatusView);
            getActivity();
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
            wrapLinearLayoutManager.mo4356b(1);
            RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.dof);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setLayoutManager(wrapLinearLayoutManager);
            RecyclerView recyclerView2 = (RecyclerView) mo60929a(R.id.dof);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setItemAnimator(new C51749t());
            C80494gh.m139518a((RecyclerView) mo60929a(R.id.dof), 8);
            if (mo86591h()) {
                C89233z.C89234a aVar = new C89233z.C89234a();
                aVar.element = true;
                ((RecyclerView) mo60929a(R.id.dof)).mo4405a(new C51323o(this, wrapLinearLayoutManager, aVar));
            }
            if (mo86591h()) {
                ((NoticeView) mo60929a(R.id.bbc)).setIconImage(2131233415);
                SpannableString spannableString = new SpannableString(C34722h.m70923b(R.string.bzm));
                SpannableString spannableString2 = new SpannableString(C34722h.m70923b(R.string.bzn) + " ");
                Context context = getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                spannableString2.setSpan(new ForegroundColorSpan(C0643b.m2378c(context, R.color.bx)), 0, spannableString2.length(), 34);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) spannableString2);
                if (getContext() != null) {
                    Context context2 = getContext();
                    if (context2 == null) {
                        C89219l.m154715b();
                    }
                    spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(context2, R.color.m2)), 0, spannableString.length(), 34);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                ((NoticeView) mo60929a(R.id.bbc)).setTitleText(spannableStringBuilder);
                C61517e eVar = new C61517e((NoticeView) mo60929a(R.id.bbc), new C51324p());
                this.f118234A = eVar;
                eVar.f139651f = C61517e.EnumC61519a.Follow;
            }
            FollowListAdapter followListAdapter = new FollowListAdapter(this, "following_relation", mo86591h());
            followListAdapter.mo86602a(this.f117992j);
            this.f118239m = followListAdapter;
            RecyclerView recyclerView3 = (RecyclerView) mo60929a(R.id.dof);
            C89219l.m154716b(recyclerView3, "");
            followListAdapter.mo67820g(C0643b.m2378c(recyclerView3.getContext(), R.color.nc));
            RecyclerView recyclerView4 = (RecyclerView) mo60929a(R.id.dof);
            C89219l.m154716b(recyclerView4, "");
            FollowListAdapter followListAdapter2 = this.f118239m;
            if (followListAdapter2 == null) {
                C89219l.m154710a("mFollowingListAdapter");
            }
            recyclerView4.setAdapter(followListAdapter2);
            FollowListAdapter followListAdapter3 = this.f118239m;
            if (followListAdapter3 == null) {
                C89219l.m154710a("mFollowingListAdapter");
            }
            followListAdapter3.mo67813a(new C51308f(this));
            RecyclerView recyclerView5 = (RecyclerView) mo60929a(R.id.dof);
            C89219l.m154716b(recyclerView5, "");
            new C80440fo(recyclerView5, new C51310g(this));
            if (mo86591h()) {
                this.f118243q = DmtStatusView.C17269a.m31905a(getContext());
                MtEmptyView a = MtEmptyView.m31926a(getContext());
                a.setStatus(new C17273d.C17274a(getContext()).mo27457a(2131232652).mo27462b(R.string.gzz).mo27464c(R.string.h00).f41365a);
                DmtStatusView.C17269a aVar2 = this.f118243q;
                if (aVar2 != null) {
                    aVar2.mo27406b(a);
                }
                DmtEditText dmtEditText = (DmtEditText) mo60929a(R.id.ax7);
                Objects.requireNonNull(dmtEditText, "null cannot be cast to non-null type android.widget.TextView");
                dmtEditText.setHint(getResources().getString(R.string.bzf));
                ((ImageButton) mo60929a(R.id.x7)).setOnClickListener(new View$OnClickListenerC51314i(this));
                ((DmtEditText) mo60929a(R.id.ax7)).setOnTouchListener(new View$OnTouchListenerC51316j(this));
                ((DmtEditText) mo60929a(R.id.ax7)).addTextChangedListener(new C51318k(this));
                ((DmtEditText) mo60929a(R.id.ax7)).setOnEditorActionListener(new C51320l(this));
                this.f118240n.mo86789a();
            }
            AbstractC88412b unused = selectSubscribe(mo86664v(), C51338q.f118344a, new C20370ah(), new C51336y(this));
            AbstractC88412b unused2 = selectSubscribe(mo86664v(), C51397y.f118458a, new C20370ah(), new C51280ae(this));
            ListMiddleware<FollowingRelationState, Object, C51133f> listMiddleware = mo86661s().f118421e;
            FollowListAdapter followListAdapter4 = this.f118239m;
            if (followListAdapter4 == null) {
                C89219l.m154710a("mFollowingListAdapter");
            }
            ListMiddleware.m38615a(listMiddleware, this, followListAdapter4, false, new C51325q(new C51281af(this), new C51282ag(this), new C51283ah(this)), new C51326r(new C51285ai(this), new C51286aj(this), new C51327s(this)), new C51329t(this), null, 908);
            AbstractC88412b unused3 = selectSubscribe(mo86661s(), C51339r.f118345a, C51340s.f118346a, new C20370ah(), new C51330u(this));
            AbstractC20468h.C20469a.m38667a(this, mo86662t(), C51341t.f118347a, (C20370ah) null, new C51333w(this), new C51332v(this), new C51334x(this), 2);
            AbstractC20468h.C20469a.m38667a(this, mo86662t(), C51342u.f118348a, (C20370ah) null, new C51276aa(this), new C51337z(this), C51277ab.f118256a, 2);
            AbstractC88412b unused4 = selectSubscribe(mo86662t(), C51343v.f118349a, new C20370ah(), new C51278ac(this));
            AbstractC88412b unused5 = selectSubscribe(mo86662t(), C51395w.f118456a, C51396x.f118457a, new C20370ah(), new C51279ad(this));
            if (!this.f117990d) {
                mo86661s().f118421e.refresh();
                return;
            }
            return;
        }
        mo86656a(mo86657b(3002060), mo86658c(3002060));
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$l */
    static final class C51320l implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C51274p f118313a;

        static {
            Covode.recordClassIndex(60524);
        }

        C51320l(C51274p pVar) {
            this.f118313a = pVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f118313a.mo86665w();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$o */
    public static final class C51323o extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C51274p f118316a;

        /* renamed from: b */
        final /* synthetic */ WrapLinearLayoutManager f118317b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f118318c;

        static {
            Covode.recordClassIndex(60527);
        }

        C51323o(C51274p pVar, WrapLinearLayoutManager wrapLinearLayoutManager, C89233z.C89234a aVar) {
            this.f118316a = pVar;
            this.f118317b = wrapLinearLayoutManager;
            this.f118318c = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            ViewGroup.LayoutParams layoutParams;
            LinearLayout linearLayout;
            LinearLayout linearLayout2;
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            if (this.f118317b.mo4372l() == 0) {
                ((AppBarLayout) this.f118316a.mo60929a(R.id.kh)).mo43718a(true, true, true);
            }
            C51274p pVar = this.f118316a;
            if (!pVar.mo86655A() && (linearLayout = (LinearLayout) pVar.mo60929a(R.id.drt)) != null && linearLayout.getVisibility() == 8 && (linearLayout2 = (LinearLayout) pVar.mo60929a(R.id.drt)) != null) {
                linearLayout2.setVisibility(0);
            }
            if (this.f118318c.element) {
                this.f118318c.element = false;
                int n = this.f118317b.mo4374n() + 1;
                RecyclerView recyclerView2 = (RecyclerView) this.f118316a.mo60929a(R.id.dof);
                C89219l.m154716b(recyclerView2, "");
                RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
                if (adapter != null && n == adapter.getItemCount()) {
                    LinearLayout linearLayout3 = (LinearLayout) this.f118316a.mo60929a(R.id.drt);
                    if (linearLayout3 != null) {
                        layoutParams = linearLayout3.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
                    AppBarLayout.C26570b bVar = (AppBarLayout.C26570b) layoutParams;
                    if (bVar != null) {
                        bVar.f62704a = 0;
                    }
                    LinearLayout linearLayout4 = (LinearLayout) this.f118316a.mo60929a(R.id.drt);
                    if (linearLayout4 != null) {
                        linearLayout4.setLayoutParams(bVar);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$ad */
    static final class C51279ad extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, List<? extends User>, C20442b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118258a;

        static {
            Covode.recordClassIndex(60483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51279ad(C51274p pVar) {
            super(3);
            this.f118258a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list, C20442b bVar) {
            List<? extends User> list2 = list;
            C20442b bVar2 = bVar;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            C89219l.m154721d(bVar2, "");
            if (bVar2.f48382a) {
                C51274p.m95659a(this.f118258a).aq_();
            } else if (!this.f118258a.mo86655A() || !list2.isEmpty()) {
                C51274p.m95659a(this.f118258a).ap_();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$u */
    static final class C51330u extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, ListState<Object, C51133f>, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51274p f118334a;

        static {
            Covode.recordClassIndex(60534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51330u(C51274p pVar) {
            super(3);
            this.f118334a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, ListState<Object, C51133f> listState, List<? extends Object> list) {
            final ListState<Object, C51133f> listState2 = listState;
            final List<? extends Object> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(listState2, "");
            C89219l.m154721d(list2, "");
            RecyclerView recyclerView = (RecyclerView) this.f118334a.mo60929a(R.id.dof);
            C89219l.m154716b(recyclerView, "");
            if (!recyclerView.mo4484l()) {
                ((RecyclerView) this.f118334a.mo60929a(R.id.dof)).post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51274p.C51330u.RunnableC513311 */

                    /* renamed from: a */
                    final /* synthetic */ C51330u f118335a;

                    static {
                        Covode.recordClassIndex(60535);
                    }

                    {
                        this.f118335a = r1;
                    }

                    public final void run() {
                        C51274p.m95659a(this.f118335a.f118334a).mo60931a(C89070n.m154572d((Collection) listState2.getList(), (Iterable) list2));
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
    /* renamed from: a */
    public final void mo86628a(EnumC74761f fVar, EnumC74760e eVar, List<? extends User> list) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eVar, "");
    }
}
