package com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.p2306ah.C33447a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x;
import com.p2082ss.android.ugc.aweme.tools.draft.C78133ai;
import com.p2082ss.android.ugc.aweme.tools.draft.C78135ak;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4108c.C78257a;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78279e;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder;
import com.p2082ss.android.ugc.aweme.tools.draft.p4109g.AbstractC78376a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4111i.AbstractC78387a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78405c;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g */
public final class C78291g extends AbstractC78471x implements FTCAwemeDraftViewHolder.AbstractC78263a {

    /* renamed from: h */
    public static final C78294c f175858h = new C78294c((byte) 0);

    /* renamed from: b */
    public TextView f175859b;

    /* renamed from: c */
    public boolean f175860c;

    /* renamed from: d */
    public C78279e f175861d;

    /* renamed from: e */
    public final Set<C43223c> f175862e = new HashSet();

    /* renamed from: f */
    public boolean f175863f;

    /* renamed from: g */
    ObjectAnimator f175864g;

    /* renamed from: i */
    private final Map<ImageView, C24117a<AbstractC24454c>> f175865i = new WeakHashMap();

    /* renamed from: j */
    private ObjectAnimator f175866j;

    /* renamed from: k */
    private long f175867k;

    /* renamed from: l */
    private final IDraftService.DraftListener f175868l = new C78295d(this);

    /* renamed from: m */
    private HashMap f175869m;

    static {
        Covode.recordClassIndex(91408);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c, com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x
    /* renamed from: a */
    public final View mo93985a(int i) {
        if (this.f175869m == null) {
            this.f175869m = new HashMap();
        }
        View view = (View) this.f175869m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f175869m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c, com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x
    /* renamed from: a */
    public final void mo93986a() {
        HashMap hashMap = this.f175869m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder.AbstractC78263a
    /* renamed from: a */
    public final void mo122157a(View view, C43223c cVar) {
        C89219l.m154721d(cVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$c */
    public static final class C78294c {
        static {
            Covode.recordClassIndex(91411);
        }

        private C78294c() {
        }

        public /* synthetic */ C78294c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$e */
    public static final class C78296e implements AbstractC78323i {

        /* renamed from: a */
        final /* synthetic */ C78291g f175873a;

        static {
            Covode.recordClassIndex(91413);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.AbstractC78323i
        /* renamed from: a */
        public final void mo122183a() {
            this.f175873a.mo122180g();
        }

        C78296e(C78291g gVar) {
            this.f175873a = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$j */
    static final class RunnableC78301j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ButtonTitleBar f175878a;

        static {
            Covode.recordClassIndex(91418);
        }

        RunnableC78301j(ButtonTitleBar buttonTitleBar) {
            this.f175878a = buttonTitleBar;
        }

        public final void run() {
            this.f175878a.getStartBtn().setImageResource(2131230985);
        }
    }

    /* renamed from: g */
    public final void mo122180g() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x
    /* renamed from: b */
    public final void mo122087b() {
        if (this.f175863f) {
            this.f175863f = false;
            mo122179f();
            mo122178e();
            return;
        }
        mo122180g();
    }

    /* renamed from: c */
    public final void mo122176c() {
        ((DmtStatusView) mo93985a(R.id.cfc)).mo27384f();
        C77807b.f174559a.execute(new RunnableC78297f(this));
    }

    /* renamed from: f */
    public final void mo122179f() {
        this.f175862e.clear();
        FrameLayout frameLayout = (FrameLayout) mo93985a(R.id.c2z);
        if (frameLayout.getVisibility() != 8) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, "translationY", (float) frameLayout.getMeasuredHeight()).setDuration(200L);
            duration.addListener(new C78293b(frameLayout));
            duration.start();
            this.f175866j = duration;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final void onDestroy() {
        for (C24117a<AbstractC24454c> aVar : this.f175865i.values()) {
            aVar.close();
        }
        this.f175865i.clear();
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x
    public final void onDestroyView() {
        C78397c.m136927a().unregisterDraftListener(this.f175868l);
        ObjectAnimator objectAnimator = this.f175866j;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.f175866j;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        ObjectAnimator objectAnimator3 = this.f175864g;
        if (objectAnimator3 != null) {
            objectAnimator3.removeAllListeners();
        }
        ObjectAnimator objectAnimator4 = this.f175864g;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        super.onDestroyView();
        mo93986a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        mo122179f();
        if (!C63244g.m114602a().mo73275c().mo101852d()) {
            C63244g.m114602a().mo73275c().mo101846a(true);
            return;
        }
        C78279e eVar = this.f175861d;
        if (eVar == null) {
            C89219l.m154710a("mAdapter");
        }
        eVar.mo129692c();
        mo122176c();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$m */
    static final class CallableC78304m<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C78291g f175881a;

        /* renamed from: b */
        final /* synthetic */ List f175882b;

        static {
            Covode.recordClassIndex(91421);
        }

        CallableC78304m(C78291g gVar, List list) {
            this.f175881a = gVar;
            this.f175882b = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (this.f175881a.f129386a) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.f175881a.mo93985a(R.id.cfc);
                C89219l.m154716b(dmtStatusView, "");
                dmtStatusView.setVisibility(8);
                C78279e a = C78291g.m136770a(this.f175881a);
                List list = this.f175882b;
                C89219l.m154721d(list, "");
                if (!list.isEmpty()) {
                    C43223c cVar = new C43223c();
                    cVar.f100924x = 2;
                    cVar.f100900W.f100772aE = false;
                    a.f175832b = true;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(0, cVar);
                    arrayList.addAll(list);
                    list = arrayList;
                }
                a.mo122352b(list);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    public final void mo122177d() {
        C17197a.C17200a aVar = new C17197a.C17200a(getContext());
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        aVar.f41071b = context.getResources().getQuantityString(R.plurals.b3, this.f175862e.size());
        aVar.mo27195b(R.string.bc3, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.bc2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC78302k(this), false).mo27193a().mo27184b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$f */
    public static final class RunnableC78297f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78291g f175874a;

        static {
            Covode.recordClassIndex(91414);
        }

        RunnableC78297f(C78291g gVar) {
            this.f175874a = gVar;
        }

        public final void run() {
            C70005cr a = C70005cr.m123611a();
            C89219l.m154716b(a, "");
            String e = a.mo110455e();
            C89219l.m154716b(e, "");
            C78291g gVar = this.f175874a;
            C84911q.m145921a("Before DraftDataProvider.getDraftDataV2()");
            boolean z = gVar.f175860c;
            ArrayList arrayList = new ArrayList();
            C78133ai a2 = C78133ai.m136600a();
            if (a2 != null) {
                C84911q.m145921a("Before DraftDataProvider.queryMusicAwemeCollectionV2()");
                List<AbstractC78387a> a3 = a2.mo122066a(e);
                C89219l.m154716b(a3, "");
                C84911q.m145921a("After DraftDataProvider.queryMusicAwemeCollectionV2()");
                for (AbstractC78387a aVar : a3) {
                    List<AbstractC78376a<Object>> b = aVar.mo122326b();
                    if (!C13617h.m24465a(b)) {
                        C43223c cVar = new C43223c();
                        cVar.f100924x = 3;
                        cVar.f100879B = aVar.mo122324a();
                        arrayList.add(cVar);
                        arrayList.addAll(C78257a.m136746a(b, z));
                    }
                    if (z && arrayList.size() > 0) {
                        ((C43223c) arrayList.get(arrayList.size() - 1)).f100926z = true;
                    }
                }
            }
            if (z) {
                C78257a.m136747a(arrayList);
            }
            C84911q.m145921a("After DraftDataProvider.getDraftDataV2()");
            C1731i.m5640b(new CallableC78304m(gVar, arrayList), C1731i.f5564c);
        }
    }

    /* renamed from: e */
    public final void mo122178e() {
        if (this.f175863f) {
            ButtonTitleBar buttonTitleBar = (ButtonTitleBar) mo93985a(R.id.eim);
            buttonTitleBar.getEndBtn().setTextColor(C0643b.m2378c(requireContext(), C33447a.f79499b));
            DmtTextView endBtn = buttonTitleBar.getEndBtn();
            C89219l.m154716b(endBtn, "");
            endBtn.setText(getText(R.string.y9));
            ImageView startBtn = buttonTitleBar.getStartBtn();
            C89219l.m154716b(startBtn, "");
            startBtn.setVisibility(8);
            DmtTextView titleView = buttonTitleBar.getTitleView();
            C89219l.m154716b(titleView, "");
            titleView.setVisibility(8);
        } else {
            ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) mo93985a(R.id.eim);
            buttonTitleBar2.getEndBtn().setTextColor(C0643b.m2378c(requireContext(), C33447a.f79498a));
            DmtTextView endBtn2 = buttonTitleBar2.getEndBtn();
            C89219l.m154716b(endBtn2, "");
            endBtn2.setText(getText(R.string.y_));
            ImageView startBtn2 = buttonTitleBar2.getStartBtn();
            C89219l.m154716b(startBtn2, "");
            startBtn2.setVisibility(0);
            DmtTextView titleView2 = buttonTitleBar2.getTitleView();
            C89219l.m154716b(titleView2, "");
            titleView2.setVisibility(0);
            mo122179f();
        }
        C78279e eVar = this.f175861d;
        if (eVar == null) {
            C89219l.m154710a("mAdapter");
        }
        eVar.f175831a = this.f175863f;
        eVar.notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$a */
    public static final class C78292a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f175870a;

        static {
            Covode.recordClassIndex(91409);
        }

        C78292a(FrameLayout frameLayout) {
            this.f175870a = frameLayout;
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f175870a.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$b */
    public static final class C78293b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f175871a;

        static {
            Covode.recordClassIndex(91410);
        }

        C78293b(FrameLayout frameLayout) {
            this.f175871a = frameLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f175871a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$d */
    public static final class C78295d extends IDraftService.DraftListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C78291g f175872a;

        static {
            Covode.recordClassIndex(91412);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78295d(C78291g gVar) {
            this.f175872a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftDelete(C43223c cVar) {
            if (cVar != null) {
                C78279e a = C78291g.m136770a(this.f175872a);
                String r = cVar.mo73726r();
                if (a.f189754f != null) {
                    for (C43223c cVar2 : a.f189754f) {
                        C89219l.m154716b(cVar2, "");
                        if (TextUtils.equals(r, cVar2.mo73726r())) {
                            a.mo122170a(cVar2);
                            return;
                        }
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftUpdate(C43223c cVar) {
            C89219l.m154721d(cVar, "");
            if (this.f175872a.f129386a) {
                C78279e a = C78291g.m136770a(this.f175872a);
                if (!(a.getItemCount() == 0 || cVar == null)) {
                    int size = a.f189754f.size();
                    for (int i = 0; i < size; i++) {
                        C43223c cVar2 = (C43223c) a.f189754f.get(i);
                        if (cVar2 != null && C13627m.m24499a(cVar.mo73726r(), cVar2.mo73726r())) {
                            a.f189754f.set(i, cVar);
                            a.notifyItemChanged(i);
                        }
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftCheckedChanged(C43223c cVar, boolean z) {
            String string;
            C89219l.m154721d(cVar, "");
            if (z) {
                this.f175872a.f175862e.add(cVar);
            } else {
                this.f175872a.f175862e.remove(cVar);
            }
            TuxTextView tuxTextView = (TuxTextView) this.f175872a.mo93985a(R.id.erg);
            C89219l.m154716b(tuxTextView, "");
            String string2 = this.f175872a.getString(R.string.ya);
            C89219l.m154716b(string2, "");
            String a = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{Integer.valueOf(this.f175872a.f175862e.size())}, 1));
            C89219l.m154716b(a, "");
            tuxTextView.setText(a);
            if (this.f175872a.f175860c) {
                TextView textView = this.f175872a.f175859b;
                if (textView == null) {
                    C89219l.m154715b();
                }
                C78291g gVar = this.f175872a;
                long j = 0;
                for (C43223c cVar2 : gVar.f175862e) {
                    j += cVar2.f100880C;
                }
                DecimalFormat decimalFormat = new DecimalFormat();
                decimalFormat.setMaximumFractionDigits(1);
                if (j / 1073741824 > 1) {
                    double d = (double) (((float) j) * 1.0f);
                    Double.isNaN(d);
                    string = gVar.getString(R.string.fnd, decimalFormat.format(d / 1.073741824E9d).toString());
                    C89219l.m154716b(string, "");
                } else {
                    double d2 = (double) (((float) j) * 1.0f);
                    Double.isNaN(d2);
                    string = gVar.getString(R.string.fnc, decimalFormat.format(d2 / 1048576.0d).toString());
                    C89219l.m154716b(string, "");
                }
                textView.setText(string);
            }
            if (this.f175872a.f175862e.size() <= 0) {
                this.f175872a.mo122179f();
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f175872a.mo93985a(R.id.c2z);
            C89219l.m154716b(frameLayout, "");
            if (frameLayout.getVisibility() != 0) {
                C78291g gVar2 = this.f175872a;
                FrameLayout frameLayout2 = (FrameLayout) gVar2.mo93985a(R.id.c2z);
                if (frameLayout2.getVisibility() != 0) {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout2, "translationY", (float) frameLayout2.getMeasuredHeight(), 0.0f).setDuration(200L);
                    duration.addListener(new C78292a(frameLayout2));
                    duration.start();
                    gVar2.f175864g = duration;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$h */
    public static final class C78299h implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C78291g f175876a;

        static {
            Covode.recordClassIndex(91416);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78299h(C78291g gVar) {
            this.f175876a = gVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f175876a.mo122180g();
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
            C78291g gVar = this.f175876a;
            gVar.f175863f = !gVar.f175863f;
            gVar.mo122178e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$l */
    public static final class C78303l extends IDraftService.DraftListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C78291g f175880a;

        static {
            Covode.recordClassIndex(91420);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78303l(C78291g gVar) {
            this.f175880a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftUpdate(C43223c cVar) {
            C89219l.m154721d(cVar, "");
            this.f175880a.mo122176c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$g */
    static final class View$OnClickListenerC78298g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78291g f175875a;

        static {
            Covode.recordClassIndex(91415);
        }

        View$OnClickListenerC78298g(C78291g gVar) {
            this.f175875a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f175875a.mo122177d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$i */
    static final class View$OnClickListenerC78300i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78291g f175877a;

        static {
            Covode.recordClassIndex(91417);
        }

        View$OnClickListenerC78300i(C78291g gVar) {
            this.f175877a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f175877a.mo122177d();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C78279e m136770a(C78291g gVar) {
        C78279e eVar = gVar.f175861d;
        if (eVar == null) {
            C89219l.m154710a("mAdapter");
        }
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C45989b.m88764a().mo77590a(getActivity());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.g$k */
    public static final class DialogInterface$OnClickListenerC78302k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78291g f175879a;

        static {
            Covode.recordClassIndex(91419);
        }

        DialogInterface$OnClickListenerC78302k(C78291g gVar) {
            this.f175879a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C78279e a = C78291g.m136770a(this.f175879a);
            ArrayList<C43223c> arrayList = new ArrayList(a.f189754f);
            C77807b.f174559a.execute(new C78279e.RunnableC78281b(a, arrayList));
            for (C43223c cVar : arrayList) {
                if (cVar.f100925y) {
                    a.mo122170a(cVar);
                }
            }
            this.f175879a.mo122179f();
            this.f175879a.f175863f = false;
            this.f175879a.mo122178e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder.AbstractC78263a
    /* renamed from: a */
    public final void mo122156a(int i, C43223c cVar) {
        C89219l.m154721d(cVar, "");
        C84911q.m145921a("draft onEdit: position " + i + ", draftId " + cVar.f100901a);
        C78135ak.m136630a(getActivity(), cVar, 0, System.currentTimeMillis(), new C78303l(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f175860c) {
            if (this.f175859b == null) {
                TextView textView = (TextView) C0792v.m2762c(view, (int) R.id.ewf);
                this.f175859b = textView;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
            TextView textView2 = this.f175859b;
            if (textView2 == null) {
                C89219l.m154715b();
            }
            textView2.setVisibility(0);
        }
        if (this.f175860c) {
            ((FrameLayout) mo93985a(R.id.c2z)).setOnClickListener(new View$OnClickListenerC78298g(this));
        }
        if (this.f175860c) {
            FrameLayout frameLayout = (FrameLayout) mo93985a(R.id.c2z);
            C89219l.m154716b(frameLayout, "");
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = C89241a.m154730a(C13628n.m24520b(getContext(), 60.0f));
            FrameLayout frameLayout2 = (FrameLayout) mo93985a(R.id.c2z);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setLayoutParams(layoutParams2);
        } else {
            TuxTextView tuxTextView = (TuxTextView) mo93985a(R.id.erg);
            C89219l.m154716b(tuxTextView, "");
            ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 17;
            layoutParams4.topMargin = 0;
            TuxTextView tuxTextView2 = (TuxTextView) mo93985a(R.id.erg);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setLayoutParams(layoutParams4);
        }
        ((ButtonTitleBar) mo93985a(R.id.eim)).setOnTitleBarClickListener(new C78299h(this));
        ((TuxTextView) mo93985a(R.id.erg)).setOnClickListener(new View$OnClickListenerC78300i(this));
        int i = Build.VERSION.SDK_INT;
        View a = mo93985a(R.id.e74);
        C89219l.m154716b(a, "");
        a.getLayoutParams().height = C18247a.m33946a(requireContext());
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) mo93985a(R.id.eim);
        buttonTitleBar.setTitle(getText(R.string.bbz));
        ImageView startBtn = buttonTitleBar.getStartBtn();
        C89219l.m154716b(startBtn, "");
        startBtn.setVisibility(0);
        DmtTextView endBtn = buttonTitleBar.getEndBtn();
        C89219l.m154716b(endBtn, "");
        endBtn.setVisibility(0);
        buttonTitleBar.getEndBtn().setTextColor(C0643b.m2378c(requireContext(), C33447a.f79498a));
        DmtTextView endBtn2 = buttonTitleBar.getEndBtn();
        C89219l.m154716b(endBtn2, "");
        endBtn2.setText(getText(R.string.y_));
        buttonTitleBar.getEndBtn().setFontType(C17303d.f41573g);
        buttonTitleBar.getEndBtn().setBackgroundColor(0);
        buttonTitleBar.post(new RunnableC78301j(buttonTitleBar));
        RecyclerView recyclerView = (RecyclerView) mo93985a(R.id.aoi);
        recyclerView.setOverScrollMode(2);
        getActivity();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        recyclerView.mo4415b(new C78405c(C0643b.m2378c(requireContext(), R.color.c9), (int) C13628n.m24520b(getActivity(), 0.0f), C13628n.m24520b(getActivity(), 0.0f), C13628n.m24520b(getActivity(), 0.0f)));
        C78279e eVar = this.f175861d;
        if (eVar == null) {
            C89219l.m154710a("mAdapter");
        }
        recyclerView.setAdapter(eVar);
        ((DmtStatusView) mo93985a(R.id.cfc)).setBuilder(DmtStatusView.C17269a.m31905a(getContext()));
        ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) mo93985a(R.id.eim);
        DmtTextView endBtn3 = buttonTitleBar2.getEndBtn();
        DmtTextView endBtn4 = buttonTitleBar2.getEndBtn();
        C89219l.m154716b(endBtn4, "");
        endBtn3.setTypeface(Typeface.create(endBtn4.getTypeface(), 0), 0);
        buttonTitleBar2.getEndBtn().setFontType(C17303d.f41567a);
        buttonTitleBar2.getEndBtn().setTextSize(1, 17.0f);
        buttonTitleBar2.getTitleView().setTextSize(1, 17.0f);
        C78397c.m136927a().registerDraftListener(this.f175868l);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        C89219l.m154721d(layoutInflater, "");
        this.f175867k = System.currentTimeMillis();
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_disk_manage_mode", false);
        } else {
            z = false;
        }
        this.f175860c = z;
        C78279e eVar = new C78279e(this.f175865i, this);
        eVar.f175833c = this.f175860c;
        eVar.mo129702d(false);
        eVar.f175834d = new C78296e(this);
        this.f175861d = eVar;
        return C1764a.m5927a(layoutInflater, R.layout.a11, viewGroup, false);
    }
}
