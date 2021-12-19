package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.experiment.C46720aw;
import com.p2082ss.android.ugc.aweme.feed.guide.C49594i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.main.C59038ax;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79665j;
import com.p2082ss.android.ugc.aweme.recommend.C66642o;
import com.p2082ss.android.ugc.aweme.recommend.RecommendUsersDialogViewModel;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.ISearchService;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.search.model.C67673a;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67677c;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67554j;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67556k;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89623h;
import kotlinx.coroutines.internal.C89652o;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4616h.AbstractC89247c;
import p4600h.p4616h.AbstractC89249e;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f */
public final class C22778f extends AbstractC22773c implements AwemeChangeCallBack.AbstractC59111a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f53793a = {new C89225r(C22778f.class, "isMainPageVisible", "isMainPageVisible()Z", 0)};

    /* renamed from: k */
    public static final C22780b f53794k = new C22780b((byte) 0);

    /* renamed from: b */
    public TuxIconView f53795b;

    /* renamed from: c */
    public AbstractC23317a f53796c;

    /* renamed from: d */
    public boolean f53797d;

    /* renamed from: e */
    public final C67673a f53798e;

    /* renamed from: f */
    public final C67673a f53799f;

    /* renamed from: g */
    public final C67673a f53800g;

    /* renamed from: h */
    public final C67673a f53801h;

    /* renamed from: i */
    public final C67673a f53802i;

    /* renamed from: j */
    final AbstractC22772b f53803j;

    /* renamed from: l */
    private final AbstractC89244h f53804l = C89250i.m154773a((AbstractC89171a) C22792j.f53830a);

    /* renamed from: m */
    private AbstractC1214u<Aweme> f53805m;

    /* renamed from: n */
    private final List<C67673a> f53806n;

    /* renamed from: o */
    private final AbstractC89244h f53807o;

    /* renamed from: p */
    private final AbstractC89244h f53808p;

    /* renamed from: q */
    private final AbstractC89244h f53809q;

    /* renamed from: r */
    private final AbstractC89244h f53810r;

    /* renamed from: s */
    private final AbstractC89244h f53811s;

    /* renamed from: t */
    private final AbstractC89244h f53812t;

    /* renamed from: u */
    private final AbstractC89249e f53813u;

    static {
        Covode.recordClassIndex(26674);
    }

    /* renamed from: i */
    private final AbstractC1214u<Boolean> m42992i() {
        return (AbstractC1214u) this.f53807o.getValue();
    }

    /* renamed from: j */
    private final AbstractC1214u<Boolean> m42993j() {
        return (AbstractC1214u) this.f53808p.getValue();
    }

    /* renamed from: k */
    private final AbstractC1214u<Boolean> m42994k() {
        return (AbstractC1214u) this.f53809q.getValue();
    }

    /* renamed from: l */
    private final AbstractC1214u<Boolean> m42995l() {
        return (AbstractC1214u) this.f53810r.getValue();
    }

    /* renamed from: m */
    private final AbstractC1214u<Boolean> m42996m() {
        return (AbstractC1214u) this.f53811s.getValue();
    }

    /* renamed from: n */
    private final AbstractC1214u<Boolean> m42997n() {
        return (AbstractC1214u) this.f53812t.getValue();
    }

    /* renamed from: r */
    private boolean m43001r() {
        return ((Boolean) this.f53813u.mo23374a(this, f53793a[0])).booleanValue();
    }

    /* renamed from: a */
    public final void mo37103a(boolean z) {
        this.f53813u.mo143655a(f53793a[0], Boolean.valueOf(z));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: c */
    public final int mo37087c() {
        return 8388629;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final ISearchService mo37104e() {
        return (ISearchService) this.f53804l.getValue();
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$b */
    static final class C22780b {
        static {
            Covode.recordClassIndex(26676);
        }

        private C22780b() {
        }

        public /* synthetic */ C22780b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$c */
    public static final class C22781c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C22781c f53816a = new C22781c();

        static {
            Covode.recordClassIndex(26677);
        }

        C22781c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$d */
    public static final class C22782d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C22778f f53817a;

        static {
            Covode.recordClassIndex(26678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22782d(C22778f fVar) {
            super(0);
            this.f53817a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f53817a.mo37107h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$e */
    static final class C22783e extends AbstractC89220m implements AbstractC89171a<AbstractC1214u<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C22778f f53818a;

        static {
            Covode.recordClassIndex(26679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22783e(C22778f fVar) {
            super(0);
            this.f53818a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC1214u<Boolean> invoke() {
            return new AbstractC1214u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.C22778f.C22783e.C227841 */

                /* renamed from: a */
                final /* synthetic */ C22783e f53819a;

                static {
                    Covode.recordClassIndex(26680);
                }

                {
                    this.f53819a = r1;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        this.f53819a.f53818a.mo37102a(this.f53819a.f53818a.f53801h);
                    }
                }
            };
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$g */
    static final class C22786g extends AbstractC89220m implements AbstractC89171a<AbstractC1214u<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C22778f f53824a;

        static {
            Covode.recordClassIndex(26682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22786g(C22778f fVar) {
            super(0);
            this.f53824a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC1214u<Boolean> invoke() {
            return new AbstractC1214u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.C22778f.C22786g.C227871 */

                /* renamed from: a */
                final /* synthetic */ C22786g f53825a;

                static {
                    Covode.recordClassIndex(26683);
                }

                {
                    this.f53825a = r1;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        this.f53825a.f53824a.mo37102a(this.f53825a.f53824a.f53802i);
                    }
                }
            };
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$h */
    static final class C22788h extends AbstractC89220m implements AbstractC89171a<AbstractC1214u<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C22778f f53826a;

        static {
            Covode.recordClassIndex(26684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22788h(C22778f fVar) {
            super(0);
            this.f53826a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC1214u<Boolean> invoke() {
            return new AbstractC1214u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.C22778f.C22788h.C227891 */

                /* renamed from: a */
                final /* synthetic */ C22788h f53827a;

                static {
                    Covode.recordClassIndex(26685);
                }

                {
                    this.f53827a = r1;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        this.f53827a.f53826a.mo37102a(this.f53827a.f53826a.f53798e);
                    }
                }
            };
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$i */
    static final class C22790i extends AbstractC89220m implements AbstractC89171a<AbstractC1214u<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C22778f f53828a;

        static {
            Covode.recordClassIndex(26686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22790i(C22778f fVar) {
            super(0);
            this.f53828a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC1214u<Boolean> invoke() {
            return new AbstractC1214u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.C22778f.C22790i.C227911 */

                /* renamed from: a */
                final /* synthetic */ C22790i f53829a;

                static {
                    Covode.recordClassIndex(26687);
                }

                {
                    this.f53829a = r1;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C89219l.m154716b(bool, "");
                    if (bool.booleanValue()) {
                        this.f53829a.f53828a.f53799f.f151608a = true;
                        return;
                    }
                    this.f53829a.f53828a.f53798e.f151608a = false;
                    this.f53829a.f53828a.mo37102a(this.f53829a.f53828a.f53799f);
                }
            };
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$j */
    static final class C22792j extends AbstractC89220m implements AbstractC89171a<ISearchService> {

        /* renamed from: a */
        public static final C22792j f53830a = new C22792j();

        static {
            Covode.recordClassIndex(26688);
        }

        C22792j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchService invoke() {
            return SearchServiceImpl.m119336t();
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$l */
    static final class C22794l extends AbstractC89220m implements AbstractC89171a<AbstractC1214u<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C22778f f53832a;

        static {
            Covode.recordClassIndex(26690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22794l(C22778f fVar) {
            super(0);
            this.f53832a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC1214u<Boolean> invoke() {
            return new AbstractC1214u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.C22778f.C22794l.C227951 */

                /* renamed from: a */
                final /* synthetic */ C22794l f53833a;

                static {
                    Covode.recordClassIndex(26691);
                }

                {
                    this.f53833a = r1;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C67673a aVar = this.f53833a.f53832a.f53800g;
                    C89219l.m154716b(bool, "");
                    aVar.f151608a = bool.booleanValue();
                    if (!bool.booleanValue()) {
                        this.f53833a.f53832a.mo37102a(this.f53833a.f53832a.f53800g);
                    }
                }
            };
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$m */
    static final class C22796m extends AbstractC89220m implements AbstractC89171a<AbstractC1214u<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C22778f f53834a;

        static {
            Covode.recordClassIndex(26692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22796m(C22778f fVar) {
            super(0);
            this.f53834a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC1214u<Boolean> invoke() {
            return new AbstractC1214u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.C22778f.C22796m.C227971 */

                /* renamed from: a */
                final /* synthetic */ C22796m f53835a;

                static {
                    Covode.recordClassIndex(26693);
                }

                {
                    this.f53835a = r1;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C89219l.m154716b(bool, "");
                    if (bool.booleanValue()) {
                        this.f53835a.f53834a.mo37105f();
                    }
                }
            };
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$k */
    static final class RunnableC22793k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22778f f53831a;

        static {
            Covode.recordClassIndex(26689);
        }

        RunnableC22793k(C22778f fVar) {
            this.f53831a = fVar;
        }

        public final /* synthetic */ void run() {
            AbstractC23317a aVar = this.f53831a.f53796c;
            if (!(aVar == null && (aVar = this.f53831a.mo37106g()) == null) && !aVar.isShowing()) {
                aVar.mo38001a();
            }
        }
    }

    /* renamed from: o */
    private static boolean m42998o() {
        boolean z = C59038ax.f134410a;
        boolean a = C79665j.C79666a.m138473a();
        boolean b = C49594i.m93009b();
        if (z || (a && b)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private final void m42999p() {
        ActivityC0945e activity;
        if (this.f53805m == null && (activity = this.f53803j.getActivity()) != null && this.f53805m == null) {
            this.f53805m = AwemeChangeCallBack.m108597b(activity, activity, this);
        }
    }

    /* renamed from: q */
    private final void m43000q() {
        ActivityC0945e activity;
        if (this.f53805m != null && (activity = this.f53803j.getActivity()) != null) {
            AwemeChangeCallBack.m108595a(activity, this.f53805m);
            this.f53805m = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$n */
    public static final class RunnableC22798n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22778f f53836a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f53837b;

        static {
            Covode.recordClassIndex(26694);
        }

        RunnableC22798n(C22778f fVar, ActivityC0945e eVar) {
            this.f53836a = fVar;
            this.f53837b = eVar;
        }

        public final void run() {
            Context context;
            TuxIconView tuxIconView = this.f53836a.f53795b;
            Activity activity = null;
            if (tuxIconView != null && tuxIconView.getContext() != null) {
                TuxIconView tuxIconView2 = this.f53836a.f53795b;
                if (tuxIconView2 != null) {
                    context = tuxIconView2.getContext();
                } else {
                    context = null;
                }
                if (context instanceof Activity) {
                    activity = context;
                }
                Activity activity2 = activity;
                if (activity2 == null || !activity2.isFinishing()) {
                    C17205a aVar = C17205a.C17206a.f41116a;
                    DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f53837b);
                    aVar2.f41106a = AbstractC17207b.EnumC17208a.SEARCH_ICON_TIPS;
                    aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                        /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.C22778f.RunnableC22798n.C227991 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC22798n f53838a;

                        static {
                            Covode.recordClassIndex(26695);
                        }

                        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                        /* renamed from: a */
                        public final void mo27201a() {
                            ActivityC0945e activity;
                            C22778f fVar = this.f53838a.f53836a;
                            if (fVar.mo37104e().mo106223l() && (activity = fVar.f53803j.getActivity()) != null) {
                                activity.runOnUiThread(new RunnableC22793k(fVar));
                            }
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f53838a = r1;
                        }

                        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                        /* renamed from: a */
                        public final void mo27202a(List<Integer> list) {
                            if (list != null) {
                                Integer.valueOf(list.size());
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                        }

                        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                        /* renamed from: a */
                        public final void mo27203a(List<Integer> list, int i) {
                            if (list != null) {
                                Integer.valueOf(list.size());
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                        }
                    }));
                }
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: b */
    public final View mo37086b() {
        ViewParent viewParent;
        MethodCollector.m26663i(6297);
        ActivityC0945e activity = this.f53803j.getActivity();
        ViewGroup viewGroup = null;
        if (activity == null) {
            MethodCollector.m26664o(6297);
            return null;
        }
        if (C46720aw.m90103b()) {
            View h = HomePageUIFrameServiceImpl.m108627e().mo89398h(activity);
            if (!(h instanceof TuxIconView)) {
                h = null;
            }
            TuxIconView tuxIconView = (TuxIconView) h;
            this.f53795b = tuxIconView;
            if (tuxIconView != null) {
                viewParent = tuxIconView.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ViewGroup) {
                viewGroup = viewParent;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f53795b);
            }
        } else {
            View i = HomePageUIFrameServiceImpl.m108627e().mo89399i(activity);
            if (i instanceof TuxIconView) {
                viewGroup = i;
            }
            this.f53795b = viewGroup;
        }
        if (mo37104e().mo106223l()) {
            mo37106g();
            mo37105f();
        }
        TuxIconView tuxIconView2 = this.f53795b;
        MethodCollector.m26664o(6297);
        return tuxIconView2;
    }

    /* renamed from: g */
    public final AbstractC23317a mo37106g() {
        ActivityC0945e activity = this.f53803j.getActivity();
        if (activity == null) {
            return null;
        }
        C23329a aVar = new C23329a(activity);
        TuxIconView tuxIconView = this.f53795b;
        if (tuxIconView == null) {
            C89219l.m154715b();
        }
        AbstractC23317a d = ((C23329a) aVar.mo38041b(tuxIconView).mo38034a(EnumC23352h.BOTTOM).mo38030a(5000L).mo38046d(C34728n.m70946a(8.0d))).mo38023e(R.string.h6).mo38036a(true).mo38035a(C22781c.f53816a).mo38042b(new C22782d(this)).mo38012d();
        this.f53796c = d;
        return d;
    }

    /* renamed from: h */
    public final void mo37107h() {
        mo37104e().mo106211b(true);
        ActivityC0945e activity = this.f53803j.getActivity();
        if (activity != null) {
            FeedPanelStateViewModel feedPanelStateViewModel = (FeedPanelStateViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(FeedPanelStateViewModel.class);
            feedPanelStateViewModel.f155227a.removeObserver(m42992i());
            feedPanelStateViewModel.f155237k.removeObserver(m42993j());
            feedPanelStateViewModel.f155232f.removeObserver(m42994k());
            RecommendUsersDialogViewModel a = RecommendUsersDialogViewModel.C66613a.m118371a(activity);
            a.f149745a.removeObserver(m42995l());
            a.f149746b.removeObserver(m42996m());
            FeedSearchIconViewModel a2 = mo37104e().mo106192a(activity);
            a2.mo106649d();
            a2.mo106648c().removeObserver(m42997n());
            m43000q();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final boolean mo37085a() {
        String g = this.f53803j.mo37091g();
        if ((TextUtils.equals(g, "homepage_hot") || TextUtils.equals(g, "homepage_follow")) && !C80580in.m139687c() && mo37104e().mo106222k()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo37105f() {
        boolean z;
        TuxIconView tuxIconView;
        ActivityC0945e activity = this.f53803j.getActivity();
        if (activity != null) {
            Aweme a = AwemeChangeCallBack.m108593a(activity);
            if (a == null || !a.isAd()) {
                m43000q();
                if (!(!this.f53797d) || m43001r()) {
                    AbstractC1174ac a2 = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(FeedPanelStateViewModel.class);
                    C89219l.m154716b(a2, "");
                    FeedPanelStateViewModel feedPanelStateViewModel = (FeedPanelStateViewModel) a2;
                    boolean o = m42998o();
                    if (C89219l.m154714a((Object) feedPanelStateViewModel.f155227a.getValue(), (Object) true) || o) {
                        m42991a(feedPanelStateViewModel.f155227a, activity, m42992i());
                        return;
                    }
                    RecommendUsersDialogViewModel a3 = RecommendUsersDialogViewModel.C66613a.m118371a(activity);
                    if (!C66642o.m118413b() || !C66642o.m118412a(a)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean a4 = a3.mo105622a();
                    if (!z || !a4) {
                        AbstractC1174ac a5 = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(FeedPanelStateViewModel.class);
                        C89219l.m154716b(a5, "");
                        FeedPanelStateViewModel feedPanelStateViewModel2 = (FeedPanelStateViewModel) a5;
                        this.f53801h.f151608a = C89219l.m154714a((Object) feedPanelStateViewModel2.f155237k.getValue(), (Object) true);
                        if (this.f53801h.f151608a) {
                            m42991a(feedPanelStateViewModel2.f155237k, activity, m42993j());
                        }
                        this.f53802i.f151608a = C89219l.m154714a((Object) feedPanelStateViewModel2.f155232f.getValue(), (Object) true);
                        if (this.f53802i.f151608a) {
                            m42991a(feedPanelStateViewModel2.f155232f, activity, m42994k());
                        }
                        List<C67673a> list = this.f53806n;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (it.next().f151608a) {
                                    return;
                                }
                            }
                        }
                        if (!mo37104e().mo106192a(activity).mo106650e() && (tuxIconView = this.f53795b) != null) {
                            tuxIconView.postDelayed(new RunnableC22798n(this, activity), 500);
                            return;
                        }
                        return;
                    }
                    this.f53798e.f151608a = true;
                    m42991a(a3.f149745a, activity, m42995l());
                    m42991a(a3.f149746b, activity, m42996m());
                    return;
                }
                this.f53797d = true;
                return;
            }
            m42999p();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
    /* renamed from: a */
    public final void mo37101a(Aweme aweme) {
        if (aweme != null) {
            aweme.getAid();
            Boolean.valueOf(aweme.isAd());
        }
        mo37105f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$f */
    public static final class C22785f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f53820a;

        /* renamed from: b */
        final /* synthetic */ LiveData f53821b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1204m f53822c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1214u f53823d;

        static {
            Covode.recordClassIndex(26681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22785f(LiveData liveData, AbstractC1204m mVar, AbstractC1214u uVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f53821b = liveData;
            this.f53822c = mVar;
            this.f53823d = uVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C22785f(this.f53821b, this.f53822c, this.f53823d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C22785f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f53820a == 0) {
                C89382r.m154942a(obj);
                this.f53821b.observe(this.f53822c, this.f53823d);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final void mo37102a(C67673a aVar) {
        aVar.f151608a = false;
        for (C67673a aVar2 : this.f53806n) {
            if (aVar2.f151608a) {
                return;
            }
        }
        ActivityC0945e activity = this.f53803j.getActivity();
        if (activity != null) {
            FeedSearchIconViewModel a = mo37104e().mo106192a(activity);
            if (!a.mo106650e()) {
                a.mo106646a().postValue(1);
                m42991a(a.mo106648c(), activity, m42997n());
            }
        }
    }

    public C22778f(AbstractC22772b bVar) {
        C89219l.m154721d(bVar, "");
        this.f53803j = bVar;
        C67673a aVar = new C67673a("recommend-users-process");
        this.f53798e = aVar;
        C67673a aVar2 = new C67673a("recommend-users-show");
        this.f53799f = aVar2;
        C67673a aVar3 = new C67673a("swipe-up");
        this.f53800g = aVar3;
        C67673a aVar4 = new C67673a("open-follow");
        this.f53801h = aVar4;
        C67673a aVar5 = new C67673a("privacy");
        this.f53802i = aVar5;
        this.f53806n = C89070n.m154522b(aVar, aVar2, aVar3, aVar4, aVar5);
        this.f53807o = C89250i.m154773a((AbstractC89171a) new C22794l(this));
        this.f53808p = C89250i.m154773a((AbstractC89171a) new C22783e(this));
        this.f53809q = C89250i.m154773a((AbstractC89171a) new C22786g(this));
        this.f53810r = C89250i.m154773a((AbstractC89171a) new C22788h(this));
        this.f53811s = C89250i.m154773a((AbstractC89171a) new C22790i(this));
        this.f53812t = C89250i.m154773a((AbstractC89171a) new C22796m(this));
        this.f53813u = new C22779a(false, false, this);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final void mo37084a(View view) {
        String str;
        C89219l.m154721d(view, "");
        ActivityC0945e activity = this.f53803j.getActivity();
        if (activity != null && !C69488a.C69489a.m122709a(activity).mo109737a("swipe_up_guide")) {
            if (mo37104e().mo106223l()) {
                mo37107h();
            }
            Aweme e = this.f53803j.mo37090e();
            if (e == null || (str = e.getAid()) == null) {
                str = "";
            }
            String g = this.f53803j.mo37091g();
            C67674b.C67675a newBuilder = C67674b.Companion.newBuilder();
            newBuilder.f151627c = str;
            newBuilder.f151625a = g;
            C67674b a = newBuilder.mo106686a();
            C67678d searchFrom = new C67678d().setSearchFrom(g);
            C67446h hVar = C67446h.f151111a;
            ActivityC0945e activity2 = this.f53803j.getActivity();
            C89219l.m154716b(searchFrom, "");
            hVar.mo106201a(new C67677c(activity2, searchFrom, a, g));
            new C67554j().mo106459o(g).mo106460p("enter").mo96792f();
            new C67556k().mo106459o(g).mo106460p("enter").mo96792f();
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$a */
    public static final class C22779a extends AbstractC89247c<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f53814a;

        /* renamed from: b */
        final /* synthetic */ C22778f f53815b;

        static {
            Covode.recordClassIndex(26675);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22779a(Object obj, Object obj2, C22778f fVar) {
            super(obj2);
            this.f53814a = obj;
            this.f53815b = fVar;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, Boolean bool, Boolean bool2) {
            C89219l.m154721d(iVar, "");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (this.f53815b.f53797d && booleanValue) {
                this.f53815b.mo37105f();
                this.f53815b.f53797d = false;
            }
        }
    }

    /* renamed from: a */
    private static <T> void m42991a(LiveData<T> liveData, AbstractC1204m mVar, AbstractC1214u<T> uVar) {
        if (liveData != null && mVar != null) {
            if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                liveData.observe(mVar, uVar);
            } else {
                C89623h.m155552a(C89652o.f203399a, new C22785f(liveData, mVar, uVar, null));
            }
        }
    }
}
