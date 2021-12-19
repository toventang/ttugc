package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.C0569a;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.track.C22886c;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1706a.p1707a.C22971a;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.UgAllServiceImpl;
import com.p2082ss.android.ugc.aweme.app.C33593ai;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.p2636h.C39133d;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41702g;
import com.p2082ss.android.ugc.aweme.discover.helper.C41986af;
import com.p2082ss.android.ugc.aweme.discover.helper.C41987ag;
import com.p2082ss.android.ugc.aweme.discover.helper.C42002c;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42469q;
import com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUserFeedback;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.p2082ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41503ak;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41535k;
import com.p2082ss.android.ugc.aweme.discover.p2760a.p2761a.C41488a;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41921a;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41925d;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41929h;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41932k;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41935n;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42097l;
import com.p2082ss.android.ugc.aweme.discover.p2777k.C42180d;
import com.p2082ss.android.ugc.aweme.discover.p2787m.C42304g;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42673an;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog.C42557d;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.C42611b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2799a.p2800a.C42607a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.C42613a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42618a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42619b;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2395bk.C34883a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.EnumC67453i;
import com.p2082ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3684b.C67350b;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67487an;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67532bk;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67546f;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67554j;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67556k;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67564o;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67688c;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67690d;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67693e;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67694f;
import com.p2082ss.android.ugc.aweme.search.p3701o.C67695a;
import com.p2082ss.android.ugc.aweme.search.p3705s.C67723c;
import com.p2082ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.p2082ss.android.ugc.aweme.search.theme.C67782c;
import com.p2082ss.android.ugc.aweme.search.theme.dark.ThemeViewModel;
import com.p2082ss.android.ugc.aweme.search.theme.p3706a.C67767b;
import com.p2082ss.android.ugc.aweme.search.theme.p3706a.C67777e;
import com.p2082ss.android.ugc.aweme.utils.C80514gu;
import com.p2082ss.android.ugc.aweme.utils.C80594ix;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bj */
public class C42759bj extends AbstractC42715b implements AbstractC42636ab {

    /* renamed from: O */
    public static final int f99738O = C34728n.m70946a(16.0d);

    /* renamed from: P */
    public static final C42760a f99739P = new C42760a((byte) 0);

    /* renamed from: A */
    public SearchIntermediateViewModel f99740A;

    /* renamed from: B */
    public ImageView f99741B;

    /* renamed from: C */
    ImageView f99742C;

    /* renamed from: D */
    ViewGroup f99743D;

    /* renamed from: E */
    boolean f99744E;

    /* renamed from: F */
    ThemeViewModel f99745F;

    /* renamed from: G */
    public SurveyViewModel f99746G;

    /* renamed from: H */
    Integer f99747H;

    /* renamed from: I */
    Integer f99748I;

    /* renamed from: J */
    Integer f99749J;

    /* renamed from: K */
    boolean f99750K;

    /* renamed from: L */
    public boolean f99751L;

    /* renamed from: M */
    public boolean f99752M;

    /* renamed from: N */
    public String f99753N = "";

    /* renamed from: Q */
    private ViewGroup f99754Q;

    /* renamed from: R */
    private ViewGroup f99755R;

    /* renamed from: S */
    private View f99756S;

    /* renamed from: T */
    private ViewGroup f99757T;

    /* renamed from: U */
    private View f99758U;

    /* renamed from: V */
    private int f99759V = -1;

    /* renamed from: W */
    private SearchEditTextViewModel f99760W;

    /* renamed from: X */
    private final AbstractC89244h f99761X = C89250i.m154773a((AbstractC89171a) C42761b.f99766a);

    /* renamed from: Y */
    private boolean f99762Y = true;

    /* renamed from: Z */
    private SparseArray f99763Z;

    /* renamed from: y */
    ViewGroup f99764y;

    /* renamed from: z */
    ViewGroup f99765z;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final ArgbEvaluator mo73042d() {
        return (ArgbEvaluator) this.f99761X.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(258, new RunnableC90250g(C42759bj.class, "onSetOnPageChangeListener", C67777e.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(259, new RunnableC90250g(C42759bj.class, "onChangeBgColorEvent", C67767b.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(260, new RunnableC90250g(C42759bj.class, "onSearchCorrectEvent", C41932k.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(261, new RunnableC90250g(C42759bj.class, "onInnerSearchEvent", C41929h.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(262, new RunnableC90250g(C42759bj.class, "onShareSearchCompleteEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: h */
    public final int mo72968h() {
        return R.layout.aw_;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: i */
    public final int mo72969i() {
        return 2;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$a */
    public static final class C42760a {
        static {
            Covode.recordClassIndex(50864);
        }

        private C42760a() {
        }

        public /* synthetic */ C42760a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C42759bj m85478a(C67678d dVar, C67674b bVar, Context context) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(context, "");
            Bundle bundle = new Bundle();
            bundle.putSerializable("searchParam", dVar);
            bundle.putSerializable("search_enter_param", bVar);
            C42759bj bjVar = new C42759bj();
            bjVar.setArguments(bundle);
            return bjVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: y */
    public final boolean mo72984y() {
        return this.f99751L;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$b */
    static final class C42761b extends AbstractC89220m implements AbstractC89171a<ArgbEvaluator> {

        /* renamed from: a */
        public static final C42761b f99766a = new C42761b();

        static {
            Covode.recordClassIndex(50865);
        }

        C42761b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArgbEvaluator invoke() {
            return new ArgbEvaluator();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$n */
    static final class RunnableC42773n implements Runnable {

        /* renamed from: a */
        public static final RunnableC42773n f99780a = new RunnableC42773n();

        static {
            Covode.recordClassIndex(50877);
        }

        RunnableC42773n() {
        }

        public final void run() {
            AbstractC81915c.m141874a(new C41935n());
        }
    }

    /* renamed from: O */
    private final int m85431O() {
        if (this.f99744E) {
            return 2131233652;
        }
        return 2131233651;
    }

    /* renamed from: S */
    private final boolean m85435S() {
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        return C42776bk.m85481a(activity);
    }

    /* renamed from: T */
    private final void m85436T() {
        EditText editText = this.f99631b;
        if (editText != null) {
            editText.postDelayed(new RunnableC42775p(this), 200);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final int mo73032D() {
        if (this.f99744E) {
            return 2131233656;
        }
        return 2131233655;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final int mo73033E() {
        if (this.f99744E) {
            return 2131233654;
        }
        return 2131233653;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final int mo73034I() {
        if (this.f99744E) {
            return R.color.a_;
        }
        return R.color.bx;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final int mo73035J() {
        if (this.f99744E) {
            return R.color.ac;
        }
        return R.color.c5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final int mo73036K() {
        if (this.f99744E) {
            return R.drawable.ben;
        }
        return R.drawable.bea;
    }

    /* renamed from: M */
    public final ISearchHistoryManager mo73038M() {
        ISearchHistoryManager inst = SearchHistoryManager.inst(mo72977r());
        C89219l.m154716b(inst, "");
        return inst;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: j */
    public final void mo72970j() {
        if (this.f99645t != null) {
            C67678d dVar = this.f99645t;
            if (dVar == null) {
                C89219l.m154715b();
            }
            mo72960c(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo73043l() {
        if (this.f99744E) {
            return R.drawable.bec;
        }
        return R.drawable.beb;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f99763Z;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$p */
    public static final class RunnableC42775p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99782a;

        static {
            Covode.recordClassIndex(50879);
        }

        RunnableC42775p(C42759bj bjVar) {
            this.f99782a = bjVar;
        }

        public final void run() {
            if (this.f99782a.af_()) {
                EditText editText = this.f99782a.f99631b;
                if (editText != null) {
                    editText.requestFocus();
                }
                KeyboardUtils.m70896b(this.f99782a.f99631b);
            }
        }
    }

    static {
        Covode.recordClassIndex(50863);
    }

    /* renamed from: N */
    private final int m85430N() {
        if (mo73039b() == null) {
            return 0;
        }
        C42681ap b = mo73039b();
        if (b == null) {
            C89219l.m154715b();
        }
        if (b.f99538c != null) {
            return b.f99538c.getCurrentItem();
        }
        return 0;
    }

    /* renamed from: Q */
    private final void m85433Q() {
        this.f99752M = true;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99740A;
        if (searchIntermediateViewModel != null) {
            searchIntermediateViewModel.enterSearchMiddlePageByBack = true;
        }
        mo72979t();
        this.f99631b.setText("");
        this.f99631b.requestFocus();
        this.f99631b.setSelection(0);
    }

    /* renamed from: R */
    private final void m85434R() {
        mo72955b(2);
        EditText editText = this.f99631b;
        C89219l.m154716b(editText, "");
        editText.setCursorVisible(false);
        mo72953a(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: c */
    public final void mo72959c() {
        ActivityC0945e requireActivity = requireActivity();
        C89219l.m154716b(requireActivity, "");
        if (C42776bk.m85482b(requireActivity) || mo72975p()) {
            super.mo72959c();
        } else {
            requireActivity.finish();
        }
        C80514gu.m139558a((Activity) requireActivity);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: n */
    public final void mo72972n() {
        if (mo72982w() == 2) {
            this.f99751L = true;
            new C41921a("SearchResultFragment#handleBackPressed").mo71067a();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventBus a = EventBus.m156962a();
        if (!a.mo145393a(this)) {
            EventBus.m156966a(a, this);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventBus a = EventBus.m156962a();
        if (a.mo145393a(this)) {
            a.mo145395b(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: r */
    public final String mo72977r() {
        String enterSearchFrom;
        C67674b bVar = SearchEnterViewModel.C42997a.m85830a(getActivity()).f100248a;
        if (bVar == null || (enterSearchFrom = bVar.getEnterSearchFrom()) == null) {
            return "";
        }
        return enterSearchFrom;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: s */
    public final void mo72978s() {
        Window window;
        ActivityC0945e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(50);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: v */
    public final boolean mo72981v() {
        C67674b searchEnterParam;
        C67678d dVar = this.f99645t;
        if (dVar == null || (searchEnterParam = dVar.getSearchEnterParam()) == null) {
            return true;
        }
        return searchEnterParam.getShouldShowSug();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: z */
    public final String mo72985z() {
        String b = C67458j.m119531b(m85430N());
        if (b.length() <= 0 || b == null) {
            return EnumC67453i.TOP.getTabName();
        }
        return b;
    }

    /* renamed from: P */
    private final boolean m85432P() {
        ActivityC0945e requireActivity = requireActivity();
        C89219l.m154716b(requireActivity, "");
        if (C42776bk.m85482b(requireActivity)) {
            ActivityC0945e requireActivity2 = requireActivity();
            C89219l.m154716b(requireActivity2, "");
            if (!C42776bk.m85483c(requireActivity2)) {
                return true;
            }
        }
        if (C89219l.m154714a((Object) "1", SearchEnterViewModel.C42997a.m85830a(requireActivity()).mo73185b().obtainLogData("is_from_video"))) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private final void m85437U() {
        if (this.f99645t != null && !this.f99762Y) {
            ActivityC0945e requireActivity = requireActivity();
            C89219l.m154716b(requireActivity, "");
            if (C80514gu.m139560a(requireActivity)) {
                C80514gu.m139562b(getActivity());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: A */
    public final String mo72943A() {
        String str;
        EnumC67453i iVar = (EnumC67453i) C89070n.m154561b((List) C67458j.f151132a, m85430N());
        if (iVar == null || (str = iVar.getTabName()) == null) {
            str = "";
        }
        if (C89219l.m154714a((Object) str, (Object) EnumC67453i.HASHTAG.getTabName())) {
            str = "challenge";
        }
        if (str.length() > 0) {
            return str;
        }
        return EnumC67453i.TOP.getTabName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final int mo73037L() {
        Boolean bool;
        C33943c<Boolean> showSearchFilterDot;
        ViewGroup viewGroup = this.f99743D;
        if (viewGroup == null || !viewGroup.isClickable()) {
            return 2131233602;
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99740A;
        if (searchIntermediateViewModel == null || (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) == null) {
            bool = null;
        } else {
            bool = showSearchFilterDot.getValue();
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            return 2131233604;
        }
        return m85431O();
    }

    /* renamed from: b */
    public final C42681ap mo73039b() {
        try {
            Fragment a = getChildFragmentManager().mo3551a("Container");
            if (a == null || !(a instanceof C42681ap) || a.isDetached()) {
                return null;
            }
            return (C42681ap) a;
        } catch (Exception e) {
            ALog.m59868e("SearchResultFragment", e);
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: k */
    public final void mo72971k() {
        super.mo72945C();
        new C41921a("SearchResultFragment#handleBackPressed").mo71067a();
        KeyboardUtils.m70897c(this.f99631b);
        if (!mo72827a()) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C0569a.m2179a((Activity) activity);
            if (!m85435S()) {
                AbstractC81915c.m141874a(new C41925d(false));
            }
            C41702g.m83659a("");
            C67695a.m119852a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$c */
    public static final class CallableC42762c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99767a;

        /* renamed from: b */
        final /* synthetic */ C67678d f99768b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f99769c;

        static {
            Covode.recordClassIndex(50866);
        }

        CallableC42762c(C42759bj bjVar, C67678d dVar, C89233z.C89238e eVar) {
            this.f99767a = bjVar;
            this.f99768b = dVar;
            this.f99769c = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            T t;
            boolean z;
            if (!TextUtils.isEmpty(this.f99768b.getKeyword())) {
                t = this.f99768b.getKeyword();
            } else {
                t = this.f99769c.element;
            }
            String searchFrom = this.f99768b.getSearchFrom();
            if (searchFrom == null || searchFrom.length() == 0) {
                z = false;
            } else {
                z = this.f99768b.getSearchFrom().equals("trending_topic");
            }
            if (!TextUtils.isEmpty(t) && !z) {
                this.f99767a.mo73038M().recordSearchHistory(new SearchHistory(t, 0));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$e */
    static final class RunnableC42764e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99771a;

        static {
            Covode.recordClassIndex(50868);
        }

        RunnableC42764e(C42759bj bjVar) {
            this.f99771a = bjVar;
        }

        public final void run() {
            if (this.f99771a.mo72982w() == 2) {
                new C41921a("SearchResultFragment#handleBackPressed").mo71067a();
                C67695a.f151729c = true;
                this.f99771a.f99751L = true;
                this.f99771a.mo72961c("click");
            }
            EditText editText = this.f99771a.f99631b;
            C89219l.m154716b(editText, "");
            editText.setCursorVisible(true);
            EditText editText2 = this.f99771a.f99631b;
            C89219l.m154716b(editText2, "");
            if (!TextUtils.isEmpty(editText2.getText().toString())) {
                this.f99771a.mo72980u();
            } else {
                this.f99771a.mo72979t();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C29339a.m58753a(RunnableC42773n.f99780a, 100);
        if (C16048b.m29633a().mo25412a(true, "search_filter_entrance_animated", 0) > 0 && !C34883a.f82329a.f82330b.getBoolean("has_shown_filter_animated", false)) {
            long a = C34883a.f82329a.mo61771a("first_shown_filter_animated_time");
            if (a != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - a > 604800000 || currentTimeMillis - C34883a.f82329a.mo61771a("last_shown_filter_animated_time") <= 86400000) {
                    return;
                }
            }
            ImageView imageView = this.f99741B;
            if (imageView != null) {
                imageView.postDelayed(new RunnableC42774o(this), 1000);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72979t() {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.C42759bj.mo72979t():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$o */
    static final class RunnableC42774o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99781a;

        static {
            Covode.recordClassIndex(50878);
        }

        RunnableC42774o(C42759bj bjVar) {
            this.f99781a = bjVar;
        }

        public final void run() {
            if (this.f99781a.getActivity() != null) {
                ActivityC0945e activity = this.f99781a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                if (!activity.isFinishing()) {
                    ImageView imageView = this.f99781a.f99741B;
                    if (imageView == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154721d(imageView, "");
                    C89233z.C89238e eVar = new C89233z.C89238e();
                    eVar.element = (T) ObjectAnimator.ofFloat(imageView, "translationY", -35.0f, 10.0f);
                    C89233z.C89238e eVar2 = new C89233z.C89238e();
                    eVar2.element = (T) ObjectAnimator.ofFloat(imageView, "translationY", 0.0f, -35.0f);
                    C89233z.C89238e eVar3 = new C89233z.C89238e();
                    eVar3.element = (T) ObjectAnimator.ofFloat(imageView, "translationY", 10.0f, 0.0f);
                    T t = eVar.element;
                    C89219l.m154716b(t, "");
                    t.setDuration(250);
                    T t2 = eVar2.element;
                    C89219l.m154716b(t2, "");
                    t2.setDuration(200);
                    T t3 = eVar3.element;
                    C89219l.m154716b(t3, "");
                    t3.setDuration(250);
                    C89233z.C89234a aVar = new C89233z.C89234a();
                    aVar.element = false;
                    Interpolator b = C22971a.m43306b();
                    T t4 = eVar.element;
                    C89219l.m154716b(t4, "");
                    t4.setInterpolator(b);
                    T t5 = eVar2.element;
                    C89219l.m154716b(t5, "");
                    t5.setInterpolator(b);
                    T t6 = eVar3.element;
                    C89219l.m154716b(t6, "");
                    t6.setInterpolator(b);
                    eVar.element.addListener(new C42613a.C42614a(eVar3));
                    eVar2.element.addListener(new C42613a.C42615b(eVar));
                    eVar3.element.addListener(new C42613a.C42616c(aVar, imageView, eVar2));
                    eVar2.element.start();
                    if (C34883a.f82329a.mo61771a("first_shown_filter_animated_time") == 0) {
                        C34883a.f82329a.mo61772a("first_shown_filter_animated_time", System.currentTimeMillis());
                    }
                    C34883a.f82329a.mo61772a("last_shown_filter_animated_time", System.currentTimeMillis());
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42636ab
    /* renamed from: a */
    public final boolean mo72827a() {
        if (mo72982w() == 2) {
            new C41921a("SearchResultFragment#handleBackPressed").mo71067a();
        }
        if (getActivity() == null || this.f99645t == null) {
            return false;
        }
        mo72983x();
        int w = mo72982w();
        if (w == 2) {
            ActivityC0945e requireActivity = requireActivity();
            C89219l.m154716b(requireActivity, "");
            if (C80514gu.m139560a(requireActivity) || !m85432P()) {
                return false;
            }
            m85433Q();
            if (!C41488a.f96795a) {
                m85436T();
            }
            return true;
        } else if (w != 3 || !(!TextUtils.isEmpty(this.f99631b.getText().toString().trim()))) {
            return false;
        } else {
            ActivityC0945e requireActivity2 = requireActivity();
            C89219l.m154716b(requireActivity2, "");
            if (C80514gu.m139560a(requireActivity2)) {
                this.f99631b.setText(this.f99753N);
                m85434R();
                return true;
            } else if (!m85432P()) {
                return false;
            } else {
                m85433Q();
                m85436T();
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: o */
    public final void mo72973o() {
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        View view2;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        ImageView imageView;
        ImageView imageView2;
        boolean z;
        C1213t<C67782c> c;
        C1213t<C67782c> d;
        NextLiveData<EditText> a;
        SearchIntermediateViewModel searchIntermediateViewModel;
        C33943c<Word> firstGuessWord;
        C33943c<Boolean> showSearchFilterDot;
        C33943c<Boolean> enableSearchFilter;
        C33943c<Integer> intermediateState;
        C33943c<Boolean> dismissKeyboard;
        C67674b searchEnterParam;
        super.mo72973o();
        View view3 = getView();
        ViewGroup viewGroup6 = null;
        if (view3 != null) {
            view = view3.findViewById(16908335);
        } else {
            view = null;
        }
        this.f99758U = view;
        View view4 = getView();
        if (view4 != null) {
            viewGroup = (ViewGroup) view4.findViewById(R.id.cgi);
        } else {
            viewGroup = null;
        }
        this.f99754Q = viewGroup;
        View view5 = getView();
        if (view5 != null) {
            viewGroup2 = (ViewGroup) view5.findViewById(R.id.dr6);
        } else {
            viewGroup2 = null;
        }
        this.f99755R = viewGroup2;
        View view6 = getView();
        if (view6 != null) {
            viewGroup3 = (ViewGroup) view6.findViewById(R.id.dl5);
        } else {
            viewGroup3 = null;
        }
        this.f99765z = viewGroup3;
        View view7 = getView();
        if (view7 != null) {
            view2 = view7.findViewById(R.id.pk);
        } else {
            view2 = null;
        }
        this.f99756S = view2;
        View view8 = getView();
        if (view8 != null) {
            viewGroup4 = (ViewGroup) view8.findViewById(R.id.b4r);
        } else {
            viewGroup4 = null;
        }
        this.f99764y = viewGroup4;
        View view9 = getView();
        if (view9 != null) {
            viewGroup5 = (ViewGroup) view9.findViewById(R.id.em2);
        } else {
            viewGroup5 = null;
        }
        this.f99757T = viewGroup5;
        View view10 = getView();
        if (view10 != null) {
            imageView = (ImageView) view10.findViewById(R.id.bzd);
        } else {
            imageView = null;
        }
        this.f99742C = imageView;
        View view11 = getView();
        if (view11 != null) {
            imageView2 = (ImageView) view11.findViewById(R.id.bzf);
        } else {
            imageView2 = null;
        }
        this.f99741B = imageView2;
        View view12 = getView();
        if (view12 != null) {
            viewGroup6 = (ViewGroup) view12.findViewById(R.id.dr7);
        }
        this.f99743D = viewGroup6;
        if (viewGroup6 != null) {
            viewGroup6.setOnClickListener(new View$OnClickListenerC42765f(this));
        }
        C17235c.m31810a(this.f99635j, 0.5f);
        C67678d dVar = this.f99645t;
        if (dVar == null || (searchEnterParam = dVar.getSearchEnterParam()) == null) {
            z = true;
        } else {
            z = searchEnterParam.getShouldShowScanView();
        }
        if (z) {
            ImageView imageView3 = this.f99635j;
            C89219l.m154716b(imageView3, "");
            imageView3.setVisibility(0);
        } else {
            ViewGroup viewGroup7 = this.f99764y;
            if (viewGroup7 != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup7.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) C13628n.m24520b(getContext(), 16.0f);
                }
                viewGroup7.setLayoutParams(layoutParams);
            }
            ImageView imageView4 = this.f99635j;
            C89219l.m154716b(imageView4, "");
            imageView4.setVisibility(8);
        }
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f99740A;
        if (!(searchIntermediateViewModel2 == null || (dismissKeyboard = searchIntermediateViewModel2.getDismissKeyboard()) == null)) {
            dismissKeyboard.observe(this, new C42766g(this));
        }
        if (C41503ak.f96822a) {
            SearchIntermediateViewModel searchIntermediateViewModel3 = this.f99740A;
            if (!(searchIntermediateViewModel3 == null || (intermediateState = searchIntermediateViewModel3.getIntermediateState()) == null)) {
                intermediateState.observe(this, new C42767h(this));
            }
            SearchIntermediateViewModel searchIntermediateViewModel4 = this.f99740A;
            if (!(searchIntermediateViewModel4 == null || (enableSearchFilter = searchIntermediateViewModel4.getEnableSearchFilter()) == null)) {
                enableSearchFilter.observe(this, new C42768i(this));
            }
            SearchIntermediateViewModel searchIntermediateViewModel5 = this.f99740A;
            if (!(searchIntermediateViewModel5 == null || (showSearchFilterDot = searchIntermediateViewModel5.getShowSearchFilterDot()) == null)) {
                showSearchFilterDot.observe(this, new C42769j(this));
            }
        }
        if (!(((!C41535k.m83471a() || !m85435S()) && !SearchEnterViewModel.C42997a.m85830a(getActivity()).mo73184a()) || (searchIntermediateViewModel = this.f99740A) == null || (firstGuessWord = searchIntermediateViewModel.getFirstGuessWord()) == null)) {
            firstGuessWord.observe(this, new C42770k(this));
        }
        SearchEditTextViewModel searchEditTextViewModel = this.f99760W;
        if (!(searchEditTextViewModel == null || (a = searchEditTextViewModel.mo106527a()) == null)) {
            a.setValue(this.f99631b);
        }
        ThemeViewModel themeViewModel = this.f99745F;
        if (!(themeViewModel == null || (d = themeViewModel.mo106891d()) == null)) {
            d.observe(this, new C42771l(this));
        }
        ThemeViewModel themeViewModel2 = this.f99745F;
        if (themeViewModel2 != null && (c = themeViewModel2.mo106889c()) != null) {
            c.observe(this, new C42772m(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$d */
    public static final class C42763d implements DmtTabLayout.AbstractC17289c {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99770a;

        static {
            Covode.recordClassIndex(50867);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
        /* renamed from: b */
        public final void mo27575b(DmtTabLayout.C17294f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42763d(C42759bj bjVar) {
            this.f99770a = bjVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
        /* renamed from: a */
        public final void mo27574a(DmtTabLayout.C17294f fVar) {
            C89219l.m154721d(fVar, "");
            EditText editText = this.f99770a.f99631b;
            C89219l.m154716b(editText, "");
            if (C42759bj.m85325a(editText.getHint().toString())) {
                EditText editText2 = this.f99770a.f99631b;
                C89219l.m154716b(editText2, "");
                editText2.setHint(C67350b.f150919a.mo106246a(fVar.f41524e));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: b */
    public final void mo72956b(View view) {
        if (this.f99631b != null) {
            this.f99631b.post(new RunnableC42764e(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$g */
    static final class C42766g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99773a;

        static {
            Covode.recordClassIndex(50870);
        }

        C42766g(C42759bj bjVar) {
            this.f99773a = bjVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (C89219l.m154714a(obj, (Object) true)) {
                KeyboardUtils.m70897c(this.f99773a.f99631b);
                EditText editText = this.f99773a.f99631b;
                C89219l.m154716b(editText, "");
                editText.setCursorVisible(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$i */
    static final class C42768i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99775a;

        static {
            Covode.recordClassIndex(50872);
        }

        C42768i(C42759bj bjVar) {
            this.f99775a = bjVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (C89219l.m154714a(obj, (Object) true)) {
                this.f99775a.mo73040b(true);
            } else {
                this.f99775a.mo73040b(false);
            }
        }
    }

    @AbstractC90264r
    public final void onInnerSearchEvent(C41929h hVar) {
        C89219l.m154721d(hVar, "");
        SearchStateViewModel searchStateViewModel = this.f99639n;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
        }
        mo72960c(hVar.f97808a);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$h */
    static final class C42767h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99774a;

        static {
            Covode.recordClassIndex(50871);
        }

        C42767h(C42759bj bjVar) {
            this.f99774a = bjVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 2) {
                    this.f99774a.mo73041c(false);
                } else if (num != null) {
                    if (num.intValue() == 0) {
                        this.f99774a.mo73041c(true);
                    } else if (num.intValue() == 1) {
                        this.f99774a.mo73041c(false);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$j */
    static final class C42769j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99776a;

        static {
            Covode.recordClassIndex(50873);
        }

        C42769j(C42759bj bjVar) {
            this.f99776a = bjVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            C33943c<Boolean> enableSearchFilter;
            C42759bj bjVar = this.f99776a;
            SearchIntermediateViewModel searchIntermediateViewModel = bjVar.f99740A;
            if (searchIntermediateViewModel == null || (enableSearchFilter = searchIntermediateViewModel.getEnableSearchFilter()) == null || (bool = enableSearchFilter.getValue()) == null) {
                bool = true;
            }
            C89219l.m154716b(bool, "");
            bjVar.mo73040b(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$k */
    static final class C42770k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99777a;

        static {
            Covode.recordClassIndex(50874);
        }

        C42770k(C42759bj bjVar) {
            this.f99777a = bjVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Word word = (Word) obj;
            if (!TextUtils.isEmpty(word.getWord())) {
                this.f99777a.mo72948a(new AbstractC42715b.C42720a(word.getWord(), word.getId(), word.getImplId()));
            }
        }
    }

    /* renamed from: f */
    private final void m85439f(C67678d dVar) {
        C42681ap a = C42681ap.m85223a(dVar);
        a.f99549r = new C42763d(this);
        getChildFragmentManager().mo3552a().mo3470b(R.id.b82, a, "Container").mo3473c();
        C42097l.m84313b();
    }

    /* renamed from: g */
    private final String m85440g(C67678d dVar) {
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) dVar.getKeyword();
        if (!TextUtils.isEmpty(dVar.getRealSearchWord())) {
            eVar.element = (T) dVar.getRealSearchWord();
        }
        if (C67723c.m119890a(eVar.element)) {
            return null;
        }
        C1731i.m5640b(new CallableC42762c(this, dVar, eVar), C1731i.f5562a);
        return eVar.element;
    }

    /* renamed from: h */
    private final void m85441h(C67678d dVar) {
        String str;
        AbstractC89171a<String> aVar;
        C67487an anVar = (C67487an) new C67487an().mo106460p(dVar.getSearchFrom());
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99740A;
        if (searchIntermediateViewModel == null || (aVar = searchIntermediateViewModel.getIntermediateContainer) == null) {
            str = null;
        } else {
            str = aVar.invoke();
        }
        anVar.mo106437r(str).mo96792f();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: c */
    public final void mo72961c(String str) {
        String str2;
        int N = m85430N();
        if (N == C67458j.f151133b) {
            str2 = "general_search";
        } else if (N == C67458j.f151134c) {
            str2 = "search_user";
        } else if (N == C67458j.f151138g) {
            str2 = "search_tag";
        } else if (N == C67458j.f151136e) {
            str2 = "search_music";
        } else if (N == C67458j.f151135d) {
            str2 = "search_video";
        } else {
            return;
        }
        new C67556k().mo106460p(str).mo106459o(str2).mo96792f();
        C39133d.f92337a = System.currentTimeMillis();
    }

    @AbstractC90264r
    public final void onSearchCorrectEvent(C41932k kVar) {
        C89219l.m154721d(kVar, "");
        C67678d searchFrom = new C67678d().setKeyword(kVar.f97811a).setNeedCorrect(0).setSearchFrom("correct_word");
        C89219l.m154716b(searchFrom, "");
        mo72960c(searchFrom);
    }

    @AbstractC90264r
    public final void onSetOnPageChangeListener(C67777e eVar) {
        C42681ap b;
        C89219l.m154721d(eVar, "");
        if (this.f43437f && eVar.f151901b != null) {
            C42681ap b2 = mo73039b();
            if (b2 != null) {
                ViewPager.AbstractC1579e eVar2 = eVar.f151901b;
                b2.f99541j = null;
                if (b2.f99538c != null) {
                    b2.f99538c.removeOnPageChangeListener(eVar2);
                }
            }
            if (eVar.f151900a && (b = mo73039b()) != null) {
                b.mo72891a(eVar.f151901b);
            }
        }
    }

    @AbstractC90264r
    public final void onShareSearchCompleteEvent(C56257j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        C89219l.m154721d(jVar, "");
        if (af_() && TextUtils.equals("search", jVar.f128321d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null && getActivity() != null && this.f99754Q != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(getActivity(), this.f99754Q, jVar);
        }
    }

    /* renamed from: e */
    private boolean m85438e(C67678d dVar) {
        int a;
        SearchIntermediateViewModel searchIntermediateViewModel;
        C89219l.m154721d(dVar, "");
        if (!C89219l.m154714a((Object) dVar.getSearchFrom(), (Object) "recom_search") && !C89219l.m154714a((Object) dVar.getSearchFrom(), (Object) "trending_topic") && (a = C16048b.m29633a().mo25412a(true, "none_recom_locate_page", 0)) != 1) {
            if (a != 2) {
                return false;
            }
            if (C89219l.m154714a((Object) dVar.getSearchFrom(), (Object) "default_search_keyword") || ((searchIntermediateViewModel = this.f99740A) != null && searchIntermediateViewModel.enterSearchMiddlePageByBack)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: a */
    public final void mo72947a(View view) {
        C89219l.m154721d(view, "");
        super.mo72947a(view);
        this.f99630a = view.findViewById(R.id.b9r);
        this.f99633d = view.findViewById(R.id.dsw);
        this.f99634e = (TextView) view.findViewById(R.id.f39);
        this.f99635j = (ImageView) view.findViewById(R.id.pj);
        this.f99636k = (FrameLayout) view.findViewById(R.id.b82);
        this.f99637l = (SearchIntermediateView) view.findViewById(R.id.drz);
        this.f99637l.f99320g = R.id.drz;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchIntermediateView.AbstractC42578c
    /* renamed from: b */
    public final void mo72767b(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        if (SearchStateViewModel.isSearchIntermediate(mo72982w()) && !TextUtils.isEmpty(dVar.getKeyword())) {
            mo72962d(dVar);
            mo72960c(dVar);
        }
    }

    /* renamed from: c */
    public final void mo73041c(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.f99743D;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            TextView textView = this.f99634e;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.f99743D;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        TextView textView2 = this.f99634e;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: d */
    public final void mo72962d(C67678d dVar) {
        Integer num;
        NextLiveData<C33593ai> nextLiveData;
        C33943c<Integer> searchTabIndex;
        C89219l.m154721d(dVar, "");
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99740A;
        if (searchIntermediateViewModel == null || (searchTabIndex = searchIntermediateViewModel.getSearchTabIndex()) == null || (num = searchTabIndex.getValue()) == null) {
            num = -1;
        }
        C89219l.m154716b(num, "");
        if (!TextUtils.equals(C67458j.m119528a(num.intValue()), "general") && m85438e(dVar)) {
            C42452d.f98939k = 0;
            SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
            if (searchTabViewModel != null && (nextLiveData = searchTabViewModel.tabInfo) != null) {
                nextLiveData.setValue(new C33593ai("general"));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$m */
    static final class C42772m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99779a;

        static {
            Covode.recordClassIndex(50876);
        }

        C42772m(C42759bj bjVar) {
            this.f99779a = bjVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C1213t<Boolean> b;
            C67782c cVar = (C67782c) obj;
            C42759bj bjVar = this.f99779a;
            C89219l.m154716b(cVar, "");
            bjVar.f99744E = C89219l.m154714a((Object) cVar.f151910a, (Object) "dark");
            int i = cVar.f151911b;
            ActivityC0945e activity = bjVar.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            C23073a.C23074a.m43508a(activity).mo37498b(i).mo37499b(!bjVar.f99744E).f54627a.mo33415d();
            ViewGroup viewGroup = bjVar.f99765z;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(i);
            }
            bjVar.f99635j.setImageResource(bjVar.mo73043l());
            ImageView imageView = bjVar.f99741B;
            if (imageView != null) {
                imageView.setImageResource(bjVar.mo73037L());
            }
            ImageView imageView2 = bjVar.f99742C;
            if (imageView2 != null) {
                imageView2.setImageResource(bjVar.mo73032D());
            }
            bjVar.f99632c.setBackgroundResource(bjVar.mo73033E());
            ActivityC0945e activity2 = bjVar.getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            int c = C0643b.m2378c(activity2, bjVar.mo73034I());
            ActivityC0945e activity3 = bjVar.getActivity();
            if (activity3 == null) {
                C89219l.m154715b();
            }
            int c2 = C0643b.m2378c(activity3, bjVar.mo73035J());
            EditText editText = bjVar.f99631b;
            if (editText != null) {
                editText.setTextColor(c);
            }
            EditText editText2 = bjVar.f99631b;
            if (editText2 != null) {
                editText2.setHintTextColor(c2);
            }
            ViewGroup viewGroup2 = bjVar.f99764y;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundResource(bjVar.mo73036K());
            }
            ThemeViewModel themeViewModel = bjVar.f99745F;
            if (themeViewModel != null && (b = themeViewModel.mo106887b()) != null) {
                b.postValue(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: a */
    public final void mo72948a(AbstractC42715b.C42720a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (mo72967g() || mo72975p()) {
            SearchIntermediateViewModel searchIntermediateViewModel = this.f99740A;
            if (searchIntermediateViewModel == null || !searchIntermediateViewModel.backFromSearchResult) {
                str = "search_bar_outer";
            } else {
                str = "search_bar_inner";
            }
            C67530bj v = new C67532bk().mo106477y(mo72976q()).mo106471d((Integer) 0).mo106474v(str);
            String str5 = "";
            if (aVar == null || (str2 = aVar.f99654a) == null) {
                str2 = str5;
            }
            C67530bj w = v.mo106475w(str2);
            if (aVar == null || (str3 = aVar.f99655b) == null) {
                str3 = str5;
            }
            C67540c cVar = (C67540c) w.mo106453i(str3);
            if (!(aVar == null || (str4 = aVar.f99656c) == null)) {
                str5 = str4;
            }
            C67530bj bjVar = (C67530bj) cVar.mo106484d(str5).mo106479a((Integer) -1);
            Object obtainLogData = SearchEnterViewModel.C42997a.m85830a(getActivity()).mo73185b().obtainLogData("tab_name");
            if (obtainLogData != null) {
                bjVar.mo106469a(obtainLogData);
            }
            bjVar.mo96792f();
        }
        super.mo72948a(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: b */
    public final void mo72958b(String str) {
        String A;
        C67674b bVar = SearchEnterViewModel.C42997a.m85830a(getActivity()).f100248a;
        if (bVar == null) {
            C89219l.m154715b();
        }
        if (this.f99752M) {
            new C67554j().mo106502b(bVar.obtainLogData("is_from_video")).mo106501a(bVar.obtainLogData("tab_name")).mo106460p("cancel").mo106459o("return").mo96792f();
            this.f99752M = false;
            return;
        }
        int w = mo72982w();
        if (w == 2) {
            A = mo72943A();
        } else if (w != 3) {
            A = mo72977r();
        } else if (this.f99751L) {
            A = mo72943A();
        } else {
            A = mo72977r();
        }
        new C67554j().mo106502b(bVar.obtainLogData("is_from_video")).mo106501a(bVar.obtainLogData("tab_name")).mo106460p(str).mo106459o(A).mo96792f();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: c */
    public final void mo72960c(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        this.f99645t = dVar;
        String g = m85440g(dVar);
        m85437U();
        this.f99640o = g;
        if (TextUtils.isEmpty(this.f99640o)) {
            this.f99631b.setText("");
            return;
        }
        String str = this.f99640o;
        C89219l.m154716b(str, "");
        this.f99753N = str;
        String keyword = dVar.getKeyword();
        mo72955b(2);
        this.f99631b.setText(keyword);
        dVar.setKeyword(this.f99640o);
        if (mo73039b() != null) {
            C42681ap b = mo73039b();
            if (b == null) {
                C89219l.m154715b();
            }
            b.mo72894b(dVar);
            C67678d dVar2 = this.f99645t;
            if (dVar2 != null && dVar2.isOpenNewSearchContainer()) {
                C42681ap b2 = mo73039b();
                if (b2 == null) {
                    C89219l.m154715b();
                }
                b2.mo72890a(0);
            }
        } else {
            m85439f(dVar);
        }
        m85434R();
        TuxIconView tuxIconView = this.f99632c;
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        KeyboardUtils.m70897c(this.f99631b);
        UgAllServiceImpl.m65444c().mo57255a("search", dVar.getKeyword());
        m85441h(dVar);
        C89219l.m154721d("search_transfer_search", "");
        C42469q.m84883a();
        this.f99762Y = false;
        C67674b bVar = SearchEnterViewModel.C42997a.m85830a(getActivity()).f100248a;
        if (bVar != null) {
            bVar.restEnterSearchPosition();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: d */
    public final void mo72963d(String str) {
        SearchStateViewModel searchStateViewModel = this.f99639n;
        boolean z = true;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
        }
        EditText editText = this.f99631b;
        C89219l.m154716b(editText, "");
        String obj = editText.getHint().toString();
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(obj) || m85325a(obj)) {
            z = false;
        } else {
            ((C67564o) new C67564o().mo106488q("click").mo106459o("default_search_keyword")).mo106505r(str).mo106506s("general_word").mo96792f();
            str = obj;
        }
        mo72952a(str, z);
    }

    @AbstractC90264r
    public final void onChangeBgColorEvent(C67767b bVar) {
        C89219l.m154721d(bVar, "");
        if (this.f43437f) {
            Window window = null;
            if (!bVar.f151869b) {
                ViewGroup viewGroup = this.f99757T;
                if (viewGroup != null) {
                    viewGroup.setBackground(null);
                }
                View view = this.f99630a;
                if (view != null) {
                    view.setBackground(null);
                }
                ViewGroup viewGroup2 = this.f99755R;
                if (viewGroup2 != null) {
                    viewGroup2.setBackground(null);
                }
                ViewGroup viewGroup3 = this.f99754Q;
                if (viewGroup3 != null) {
                    viewGroup3.setBackground(bVar.f151868a);
                }
                ActivityC0945e activity = getActivity();
                if (activity != null) {
                    window = activity.getWindow();
                }
                C42304g.m84664a(window, 0);
                return;
            }
            Context context = getContext();
            if (context != null) {
                if (this.f99759V == -1) {
                    this.f99759V = C0643b.m2378c(context, R.color.l);
                }
                ViewGroup viewGroup4 = this.f99757T;
                if (viewGroup4 != null) {
                    viewGroup4.setBackgroundColor(this.f99759V);
                }
                View view2 = this.f99630a;
                if (view2 != null) {
                    view2.setBackgroundColor(this.f99759V);
                }
                ViewGroup viewGroup5 = this.f99755R;
                if (viewGroup5 != null) {
                    viewGroup5.setBackgroundColor(this.f99759V);
                }
                ViewGroup viewGroup6 = this.f99754Q;
                if (viewGroup6 != null) {
                    viewGroup6.setBackground(null);
                }
                ActivityC0945e activity2 = getActivity();
                if (activity2 != null) {
                    window = activity2.getWindow();
                }
                C42304g.m84664a(window, this.f99759V);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable("searchParam");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            this.f99645t = (C67678d) serializable;
        }
        C67688c cVar = new C67688c(new C67693e(mo72977r()), new C67694f());
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C22886c.m43139a(activity).f54030c.mo35380a().mo35384a("tracker_key", cVar, C67688c.class);
        }
        ActivityC0945e activity2 = getActivity();
        if (activity2 != null) {
            C22886c.m43139a(activity2).f54030c.mo35380a().mo35384a("tracker_key", new C67690d(), C67690d.class);
        }
        ActivityC0945e activity3 = getActivity();
        if (activity3 != null) {
            this.f99740A = (SearchIntermediateViewModel) C1181ae.m3881a(activity3, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
            this.f99760W = (SearchEditTextViewModel) C1181ae.m3881a(activity3, (C1175ad.AbstractC1177b) null).mo3983a(SearchEditTextViewModel.class);
            this.f99745F = (ThemeViewModel) C1181ae.m3881a(activity3, (C1175ad.AbstractC1177b) null).mo3983a(ThemeViewModel.class);
            this.f99746G = (SurveyViewModel) C1181ae.m3881a(activity3, (C1175ad.AbstractC1177b) null).mo3983a(SurveyViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$f */
    static final class View$OnClickListenerC42765f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99772a;

        static {
            Covode.recordClassIndex(50869);
        }

        View$OnClickListenerC42765f(C42759bj bjVar) {
            this.f99772a = bjVar;
        }

        public final void onClick(View view) {
            AbstractC42670am amVar;
            C67469ad adVar;
            String str;
            NextLiveData<Boolean> nextLiveData;
            C42673an e;
            Boolean bool;
            C42618a aVar;
            List<? extends Object> list;
            int i;
            String str2;
            String str3;
            String str4;
            C67469ad b;
            String schema;
            boolean z;
            C33943c<Boolean> enableSearchFilter;
            ClickAgent.onClick(view);
            C42681ap b2 = this.f99772a.mo73039b();
            String str5 = null;
            if (b2 != null) {
                amVar = b2.mo72897d();
            } else {
                amVar = null;
            }
            int i2 = 0;
            if (!(amVar == null || (e = amVar.mo72875e()) == null)) {
                ActivityC0945e activity = this.f99772a.getActivity();
                SearchIntermediateViewModel searchIntermediateViewModel = this.f99772a.f99740A;
                C67678d dVar = this.f99772a.f99645t;
                C89219l.m154721d(amVar, "");
                C42611b c = e.mo72885c();
                if (searchIntermediateViewModel == null || (enableSearchFilter = searchIntermediateViewModel.getEnableSearchFilter()) == null) {
                    bool = null;
                } else {
                    bool = enableSearchFilter.getValue();
                }
                if (!C89219l.m154714a((Object) bool, (Object) false)) {
                    aVar = C42619b.f99427b.mo72818a(C67458j.m119528a(amVar.f99497B));
                } else {
                    aVar = null;
                }
                C34883a.f82329a.f82330b.storeBoolean("has_shown_filter_animated", true);
                C42557d.C42559b bVar = e.f99520e;
                if (bVar != null) {
                    bVar.f99280d = new C42673an.View$OnClickListenerC42679d(e, activity, aVar, c);
                    if (c != null) {
                        z = c.f99410k;
                    } else {
                        z = false;
                    }
                    bVar.f99278b = C42002c.m84069a(activity, aVar, z);
                    bVar.f99286j = C42002c.m84070a(aVar);
                } else {
                    bVar = null;
                }
                if (c != null) {
                    c.mo72808a().f99396a = aVar;
                    C42607a a = c.mo72808a();
                    C42180d.C42181a a2 = C42180d.m84432a(C67458j.m119528a(amVar.f99497B));
                    if (a2 == null || (schema = a2.getSchema()) == null || schema.length() == 0) {
                        list = null;
                    } else {
                        list = C89070n.m154524c(new SearchUserFeedback(schema));
                    }
                    a.f99397b = list;
                    C89378p[] pVarArr = new C89378p[4];
                    if (activity != null) {
                        i = activity.hashCode();
                    } else {
                        i = 0;
                    }
                    AbstractC67567q a3 = C67486am.m119565a(i);
                    if (a3 == null || (b = a3.mo106429b(amVar.f99497B)) == null || (str2 = b.f151151a) == null) {
                        str2 = "";
                    }
                    pVarArr[0] = C89387v.m154943a("search_id", str2);
                    pVarArr[1] = C89387v.m154943a("search_type", C41987ag.m84047a(C67458j.m119528a(amVar.f99497B)));
                    if (dVar == null || (str3 = dVar.getKeyword()) == null) {
                        str3 = "";
                    }
                    pVarArr[2] = C89387v.m154943a("search_keyword", str3);
                    if (amVar.f99497B == C67458j.f151133b) {
                        str4 = "general_search";
                    } else {
                        str4 = "search_result";
                    }
                    pVarArr[3] = C89387v.m154943a("enter_from", str4);
                    c.f99407d = C89041ag.m154427b(pVarArr);
                }
                C42557d a4 = C42557d.C42558a.m85060a(R.id.bba, activity, c, bVar);
                if (c != null) {
                    c.f99405b = a4;
                }
            }
            SurveyViewModel surveyViewModel = this.f99772a.f99746G;
            if (!(surveyViewModel == null || (nextLiveData = surveyViewModel.f151840c) == null)) {
                nextLiveData.postValue(true);
            }
            C89219l.m154721d("open_filter", "");
            AbstractC67567q a5 = C67486am.m119564a();
            if (a5 != null) {
                adVar = a5.mo106431c();
            } else {
                adVar = null;
            }
            C67546f fVar = new C67546f();
            AbstractC67567q a6 = C67486am.m119564a();
            if (a6 != null) {
                i2 = a6.mo106426a();
            }
            C67540c f = fVar.mo106486f(C67458j.m119528a(i2));
            if (adVar != null) {
                str = adVar.f151152b;
            } else {
                str = null;
            }
            C67540c b3 = f.mo106482b(str);
            if (adVar != null) {
                str5 = adVar.f151151a;
            }
            ((C67546f) b3.mo106480a(str5)).mo106500r("by_all").mo96786a("button_type", "open_filter").mo96792f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$l */
    static final class C42771l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42759bj f99778a;

        static {
            Covode.recordClassIndex(50875);
        }

        C42771l(C42759bj bjVar) {
            this.f99778a = bjVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            boolean z;
            C33943c<Boolean> showSearchFilterDot;
            Float f;
            ImageView imageView;
            C67782c cVar = (C67782c) obj;
            C42759bj bjVar = this.f99778a;
            C89219l.m154716b(cVar, "");
            C67782c.C67783a aVar = cVar.f151913d;
            if (aVar != null) {
                bjVar.f99744E = C89219l.m154714a((Object) cVar.f151910a, (Object) "dark");
                int i = aVar.f151915a;
                if (i == 1) {
                    ViewGroup viewGroup = bjVar.f99765z;
                    Boolean bool = null;
                    if (viewGroup != null) {
                        num = C80594ix.m139734a(viewGroup);
                    } else {
                        num = null;
                    }
                    bjVar.f99747H = num;
                    EditText editText = bjVar.f99631b;
                    if (editText != null) {
                        num2 = Integer.valueOf(editText.getCurrentTextColor());
                    } else {
                        num2 = null;
                    }
                    bjVar.f99748I = num2;
                    EditText editText2 = bjVar.f99631b;
                    if (editText2 != null) {
                        num3 = Integer.valueOf(editText2.getCurrentHintTextColor());
                    } else {
                        num3 = null;
                    }
                    bjVar.f99749J = num3;
                    ViewGroup viewGroup2 = bjVar.f99743D;
                    if (viewGroup2 == null || !viewGroup2.isClickable()) {
                        z = false;
                    } else {
                        SearchIntermediateViewModel searchIntermediateViewModel = bjVar.f99740A;
                        if (!(searchIntermediateViewModel == null || (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) == null)) {
                            bool = showSearchFilterDot.getValue();
                        }
                        z = !C89219l.m154714a((Object) bool, (Object) true);
                    }
                    bjVar.f99750K = z;
                } else if (i == 2 && (f = aVar.f151916b) != null) {
                    float floatValue = f.floatValue();
                    Integer num4 = bjVar.f99747H;
                    if (num4 != null) {
                        int intValue = num4.intValue();
                        Integer num5 = bjVar.f99748I;
                        if (num5 != null) {
                            int intValue2 = num5.intValue();
                            Integer num6 = bjVar.f99749J;
                            if (num6 != null) {
                                int intValue3 = num6.intValue();
                                Object evaluate = bjVar.mo73042d().evaluate(floatValue, Integer.valueOf(intValue), Integer.valueOf(cVar.f151911b));
                                Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
                                int intValue4 = ((Integer) evaluate).intValue();
                                ActivityC0945e activity = bjVar.getActivity();
                                if (activity == null) {
                                    C89219l.m154715b();
                                }
                                C89219l.m154716b(activity, "");
                                C23073a.C23074a.m43508a(activity).mo37498b(intValue4).mo37499b(true ^ bjVar.f99744E).f54627a.mo33415d();
                                ViewGroup viewGroup3 = bjVar.f99765z;
                                if (viewGroup3 != null) {
                                    viewGroup3.setBackgroundColor(intValue4);
                                }
                                ActivityC0945e activity2 = bjVar.getActivity();
                                if (activity2 == null) {
                                    C89219l.m154715b();
                                }
                                int c = C0643b.m2378c(activity2, bjVar.mo73034I());
                                ActivityC0945e activity3 = bjVar.getActivity();
                                if (activity3 == null) {
                                    C89219l.m154715b();
                                }
                                int c2 = C0643b.m2378c(activity3, bjVar.mo73035J());
                                Object evaluate2 = bjVar.mo73042d().evaluate(floatValue, Integer.valueOf(intValue2), Integer.valueOf(c));
                                Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                                int intValue5 = ((Integer) evaluate2).intValue();
                                Object evaluate3 = bjVar.mo73042d().evaluate(floatValue, Integer.valueOf(intValue3), Integer.valueOf(c2));
                                Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.Int");
                                int intValue6 = ((Integer) evaluate3).intValue();
                                EditText editText3 = bjVar.f99631b;
                                if (editText3 != null) {
                                    editText3.setTextColor(intValue5);
                                }
                                EditText editText4 = bjVar.f99631b;
                                if (editText4 != null) {
                                    editText4.setHintTextColor(intValue6);
                                }
                                if (floatValue >= 0.0f && floatValue <= 0.49f) {
                                    float f2 = 1.0f - (floatValue * 2.0f);
                                    ImageView imageView2 = bjVar.f99635j;
                                    if (imageView2 != null) {
                                        imageView2.setAlpha(f2);
                                    }
                                    ImageView imageView3 = bjVar.f99742C;
                                    if (imageView3 != null) {
                                        imageView3.setAlpha(f2);
                                    }
                                    TuxIconView tuxIconView = bjVar.f99632c;
                                    if (tuxIconView != null) {
                                        tuxIconView.setAlpha(f2);
                                    }
                                    ViewGroup viewGroup4 = bjVar.f99764y;
                                    if (viewGroup4 != null) {
                                        viewGroup4.setAlpha(f2);
                                    }
                                    if (bjVar.f99750K && (imageView = bjVar.f99741B) != null) {
                                        imageView.setAlpha(f2);
                                    }
                                } else if (floatValue >= 0.5f && floatValue <= 1.0f) {
                                    float f3 = (floatValue * 2.0f) - 1.0f;
                                    ImageView imageView4 = bjVar.f99635j;
                                    if (imageView4 != null) {
                                        imageView4.setImageResource(bjVar.mo73043l());
                                    }
                                    ImageView imageView5 = bjVar.f99635j;
                                    if (imageView5 != null) {
                                        imageView5.setAlpha(f3);
                                    }
                                    ImageView imageView6 = bjVar.f99742C;
                                    if (imageView6 != null) {
                                        imageView6.setImageResource(bjVar.mo73032D());
                                    }
                                    ImageView imageView7 = bjVar.f99742C;
                                    if (imageView7 != null) {
                                        imageView7.setAlpha(f3);
                                    }
                                    bjVar.f99632c.setBackgroundResource(bjVar.mo73033E());
                                    TuxIconView tuxIconView2 = bjVar.f99632c;
                                    if (tuxIconView2 != null) {
                                        tuxIconView2.setAlpha(f3);
                                    }
                                    ViewGroup viewGroup5 = bjVar.f99764y;
                                    if (viewGroup5 != null) {
                                        viewGroup5.setBackgroundResource(bjVar.mo73036K());
                                    }
                                    ViewGroup viewGroup6 = bjVar.f99764y;
                                    if (viewGroup6 != null) {
                                        viewGroup6.setAlpha(f3);
                                    }
                                    if (bjVar.f99750K) {
                                        ImageView imageView8 = bjVar.f99741B;
                                        if (imageView8 != null) {
                                            imageView8.setImageResource(bjVar.mo73037L());
                                        }
                                        ImageView imageView9 = bjVar.f99741B;
                                        if (imageView9 != null) {
                                            imageView9.setAlpha(f3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo73040b(boolean z) {
        C42180d.C42181a a;
        String schema;
        C33943c<Boolean> showSearchFilterDot;
        Boolean bool = null;
        if (z) {
            ViewGroup viewGroup = this.f99743D;
            if (viewGroup != null) {
                viewGroup.setClickable(true);
            }
            SearchIntermediateViewModel searchIntermediateViewModel = this.f99740A;
            if (!(searchIntermediateViewModel == null || (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) == null)) {
                bool = showSearchFilterDot.getValue();
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                ImageView imageView = this.f99741B;
                if (imageView != null) {
                    imageView.setImageResource(2131233604);
                    return;
                }
                return;
            }
            ImageView imageView2 = this.f99741B;
            if (imageView2 != null) {
                imageView2.setImageResource(m85431O());
                return;
            }
            return;
        }
        C42681ap b = mo73039b();
        if (b == null || (a = C42180d.m84432a(C67458j.m119528a(b.f99542k))) == null || (schema = a.getSchema()) == null || schema.length() == 0) {
            ViewGroup viewGroup2 = this.f99743D;
            if (viewGroup2 != null) {
                viewGroup2.setClickable(false);
            }
            ImageView imageView3 = this.f99741B;
            if (imageView3 != null) {
                imageView3.setImageResource(2131233602);
            }
            C42557d.C42558a.m85061a(getActivity());
            return;
        }
        ViewGroup viewGroup3 = this.f99743D;
        if (viewGroup3 != null) {
            viewGroup3.setClickable(true);
        }
        ImageView imageView4 = this.f99741B;
        if (imageView4 != null) {
            imageView4.setImageResource(m85431O());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            Fade fade = new Fade();
            C41986af afVar = new C41986af();
            afVar.addTarget(R.id.dgw);
            transitionSet.addTransition(afVar);
            transitionSet.addTransition(fade);
            ActivityC0945e activity = getActivity();
            if (!(activity == null || (window = activity.getWindow()) == null)) {
                window.setEnterTransition(transitionSet);
            }
            C51423a.m95792b("SearchResultFragment", "initWindowTransition");
        }
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        C89219l.m154721d(context, "");
    }
}
