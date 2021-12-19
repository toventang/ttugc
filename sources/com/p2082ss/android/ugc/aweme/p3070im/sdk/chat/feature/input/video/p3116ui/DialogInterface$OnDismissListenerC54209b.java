package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.p025c.C0484a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.sheet.AbstractC23219c;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2307ai.C33471c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.data.p3115a.C54200a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.C55256c;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b */
public final class DialogInterface$OnDismissListenerC54209b extends C17372a implements DialogInterface.OnDismissListener {

    /* renamed from: j */
    public static final C54210a f124195j = new C54210a((byte) 0);

    /* renamed from: e */
    public RecyclerView f124196e;

    /* renamed from: f */
    public ProgressBar f124197f;

    /* renamed from: g */
    public View f124198g;

    /* renamed from: h */
    public View f124199h;

    /* renamed from: i */
    public AbstractC54211b f124200i;

    /* renamed from: k */
    private ViewGroup f124201k;

    /* renamed from: l */
    private TuxDualBallView f124202l;

    /* renamed from: m */
    private ImageView f124203m;

    /* renamed from: n */
    private final AbstractC89244h f124204n = C89250i.m154773a((AbstractC89171a) new C54225n(this));

    /* renamed from: o */
    private final C54222k f124205o = new C54222k(this);

    /* renamed from: p */
    private final AbstractC89244h f124206p = C89250i.m154773a((AbstractC89171a) C54224m.f124228a);

    /* renamed from: q */
    private HashMap f124207q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$b */
    public interface AbstractC54211b {
        static {
            Covode.recordClassIndex(63898);
        }

        /* renamed from: a */
        void mo91255a(Aweme aweme, AbstractC54212c cVar);
    }

    static {
        Covode.recordClassIndex(63896);
    }

    /* renamed from: e */
    private final long m99476e() {
        return ((Number) this.f124206p.getValue()).longValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f124207q == null) {
            this.f124207q = new HashMap();
        }
        View view = (View) this.f124207q.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f124207q.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        HashMap hashMap = this.f124207q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final FavoriteVideoPickerViewModel mo64296c() {
        return (FavoriteVideoPickerViewModel) this.f124204n.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$a */
    public static final class C54210a {
        static {
            Covode.recordClassIndex(63897);
        }

        private C54210a() {
        }

        public /* synthetic */ C54210a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$c */
    public static abstract class AbstractC54212c {

        /* renamed from: a */
        public final String f124208a;

        static {
            Covode.recordClassIndex(63899);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$c$a */
        public static final class C54213a extends AbstractC54212c {

            /* renamed from: b */
            public static final C54213a f124209b = new C54213a();

            private C54213a() {
                super("detail", (byte) 0);
            }

            static {
                Covode.recordClassIndex(63900);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$c$b */
        public static final class C54214b extends AbstractC54212c {

            /* renamed from: b */
            public static final C54214b f124210b = new C54214b();

            private C54214b() {
                super("panel", (byte) 0);
            }

            static {
                Covode.recordClassIndex(63901);
            }
        }

        private AbstractC54212c(String str) {
            this.f124208a = str;
        }

        public /* synthetic */ AbstractC54212c(String str, byte b) {
            this(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        m99476e();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$m */
    static final class C54224m extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C54224m f124228a = new C54224m();

        static {
            Covode.recordClassIndex(63911);
        }

        C54224m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: d */
    static boolean m99475d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$n */
    static final class C54225n extends AbstractC89220m implements AbstractC89171a<FavoriteVideoPickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC54209b f124229a;

        static {
            Covode.recordClassIndex(63912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54225n(DialogInterface$OnDismissListenerC54209b bVar) {
            super(0);
            this.f124229a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FavoriteVideoPickerViewModel invoke() {
            DialogInterface$OnDismissListenerC54209b bVar = this.f124229a;
            C89219l.m154721d(bVar, "");
            AbstractC1174ac a = C1181ae.m3879a(bVar, (C1175ad.AbstractC1177b) null).mo3983a(FavoriteVideoPickerViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$k */
    public static final class C54222k extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC54209b f124225a;

        static {
            Covode.recordClassIndex(63909);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54222k(DialogInterface$OnDismissListenerC54209b bVar) {
            this.f124225a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            int i3;
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int m = ((LinearLayoutManager) layoutManager).mo4373m() + 1;
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i3 = adapter.getItemCount() - 6;
            } else {
                i3 = 0;
            }
            if (m >= i3) {
                FavoriteVideoPickerViewModel c = this.f124225a.mo64296c();
                if ((!C89219l.m154714a((Object) c.f124175b.getValue(), (Object) true)) && c.f124174a >= 0) {
                    c.mo91299a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$j */
    static final class View$OnClickListenerC54221j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC54209b f124224a;

        static {
            Covode.recordClassIndex(63908);
        }

        View$OnClickListenerC54221j(DialogInterface$OnDismissListenerC54209b bVar) {
            this.f124224a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a.C23228b.m43789a(this.f124224a, AbstractC23219c.C23223d.f55028a);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RecyclerView m99474a(DialogInterface$OnDismissListenerC54209b bVar) {
        RecyclerView recyclerView = bVar.f124196e;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        return recyclerView;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$h */
    static final class C54219h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC54209b f124220a;

        /* renamed from: b */
        final /* synthetic */ View f124221b;

        static {
            Covode.recordClassIndex(63906);
        }

        C54219h(DialogInterface$OnDismissListenerC54209b bVar, View view) {
            this.f124220a = bVar;
            this.f124221b = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (((C55256c) obj).mo92235a() != null) {
                new C23144b(this.f124221b).mo37640e(R.string.fil).mo37634a(3000L).mo37637b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$i */
    static final class C54220i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC54209b f124222a;

        /* renamed from: b */
        final /* synthetic */ View f124223b;

        static {
            Covode.recordClassIndex(63907);
        }

        C54220i(DialogInterface$OnDismissListenerC54209b bVar, View view) {
            this.f124222a = bVar;
            this.f124223b = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC54211b bVar;
            C54200a aVar = (C54200a) obj;
            if (aVar != null && (bVar = this.f124222a.f124200i) != null) {
                bVar.mo91255a(aVar.f124169a, aVar.f124170b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$d */
    static final class C54215d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC54209b f124211a;

        /* renamed from: b */
        final /* synthetic */ View f124212b;

        static {
            Covode.recordClassIndex(63902);
        }

        C54215d(DialogInterface$OnDismissListenerC54209b bVar, View view) {
            this.f124211a = bVar;
            this.f124212b = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            List<? extends Aweme> list = (List) obj;
            View view = this.f124211a.f124199h;
            if (view == null) {
                C89219l.m154710a("emptyView");
            }
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            RecyclerView.AbstractC1350a adapter = DialogInterface$OnDismissListenerC54209b.m99474a(this.f124211a).getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerAdapter");
            C54206a aVar = (C54206a) adapter;
            C89219l.m154716b(list, "");
            C89219l.m154721d(list, "");
            aVar.f124190a = list;
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$f */
    static final class C54217f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC54209b f124216a;

        /* renamed from: b */
        final /* synthetic */ View f124217b;

        static {
            Covode.recordClassIndex(63904);
        }

        C54217f(DialogInterface$OnDismissListenerC54209b bVar, View view) {
            this.f124216a = bVar;
            this.f124217b = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            RecyclerView.AbstractC1350a adapter = DialogInterface$OnDismissListenerC54209b.m99474a(this.f124216a).getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerAdapter");
            C54206a aVar = (C54206a) adapter;
            int i = aVar.f124191b;
            aVar.f124191b = C89070n.m154546a((List) aVar.f124190a, obj);
            boolean z = false;
            if (i != -1) {
                aVar.notifyItemChanged(i, false);
            }
            DialogInterface$OnDismissListenerC54209b bVar = this.f124216a;
            if (obj != null) {
                z = true;
            }
            bVar.mo91304a(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$l */
    public static final class View$OnClickListenerC54223l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC54209b f124226a;

        /* renamed from: b */
        final /* synthetic */ ConstraintLayout f124227b;

        static {
            Covode.recordClassIndex(63910);
        }

        View$OnClickListenerC54223l(DialogInterface$OnDismissListenerC54209b bVar, ConstraintLayout constraintLayout) {
            this.f124226a = bVar;
            this.f124227b = constraintLayout;
        }

        public final void onClick(View view) {
            C54200a aVar;
            ClickAgent.onClick(view);
            FavoriteVideoPickerViewModel c = this.f124226a.mo64296c();
            C1213t<C54200a> tVar = c.f124177d;
            Aweme value = c.f124178e.getValue();
            if (value != null) {
                C89219l.m154716b(value, "");
                aVar = new C54200a(value, AbstractC54212c.C54214b.f124210b);
            } else {
                aVar = null;
            }
            tVar.setValue(aVar);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C0484a aVar = new C0484a();
        aVar.put("enter_from", "chat");
        aVar.put("duration", String.valueOf(System.currentTimeMillis() - m99476e()));
        C39162r.m79460a("video_stay_time", aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$e */
    static final class C54216e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ FavoriteVideoPickerViewModel f124213a;

        /* renamed from: b */
        final /* synthetic */ DialogInterface$OnDismissListenerC54209b f124214b;

        /* renamed from: c */
        final /* synthetic */ View f124215c;

        static {
            Covode.recordClassIndex(63903);
        }

        C54216e(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel, DialogInterface$OnDismissListenerC54209b bVar, View view) {
            this.f124213a = favoriteVideoPickerViewModel;
            this.f124214b = bVar;
            this.f124215c = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            ProgressBar progressBar = this.f124214b.f124197f;
            if (progressBar == null) {
                C89219l.m154710a("progressBar");
            }
            C89219l.m154716b(bool, "");
            int i2 = 8;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            progressBar.setVisibility(i);
            View view = this.f124214b.f124198g;
            if (view == null) {
                C89219l.m154710a("loadingViewContainer");
            }
            List<Aweme> value = this.f124213a.f124176c.getValue();
            if ((value == null || value.isEmpty()) && bool.booleanValue()) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$g */
    static final class C54218g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC54209b f124218a;

        /* renamed from: b */
        final /* synthetic */ View f124219b;

        static {
            Covode.recordClassIndex(63905);
        }

        C54218g(DialogInterface$OnDismissListenerC54209b bVar, View view) {
            this.f124218a = bVar;
            this.f124219b = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            int i2;
            Aweme aweme = (Aweme) ((C55256c) obj).mo92235a();
            if (aweme != null) {
                DialogInterface$OnDismissListenerC54209b bVar = this.f124218a;
                bVar.getContext();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = DialogInterface$OnDismissListenerC54209b.m99475d();
                }
                if (!C58029j.f132256h) {
                    new C23144b(bVar).mo37640e(R.string.dcq).mo37637b();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("id", aweme.getAid());
                bundle.putString("video_from", "from_chat_favorite_video_panel");
                bundle.putString("extra_detail_title_text", bVar.getResources().getString(R.string.cuz));
                bundle.putInt("video_type", 1);
                bundle.putString("userid", C55197c.m100919b().toString());
                bundle.putString("sec_userid", C55197c.m100921c().toString());
                bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                bundle.putInt("from_post_list", 0);
                bundle.putString("enter_from", "chat_liked_panel");
                if (C80471gb.m139483a(bVar.requireContext())) {
                    i = R.anim.dx;
                } else {
                    i = R.anim.dv;
                }
                if (C80471gb.m139483a(bVar.requireContext())) {
                    i2 = R.anim.f205073do;
                } else {
                    i2 = R.anim.dq;
                }
                bVar.startActivityForResult(SmartRouter.buildRoute(bVar.getActivity(), "aweme://aweme/detail/").withParam(bundle).withAnimation(i2, i).buildIntent(), 6248);
            }
        }
    }

    /* renamed from: a */
    public final void mo91304a(boolean z) {
        MethodCollector.m26663i(3627);
        int i = 0;
        if (this.f124201k == null) {
            View view = getView();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    parent = null;
                }
                FrameLayout frameLayout = (View) parent;
                while (true) {
                    if (frameLayout != null) {
                        if (frameLayout.getId() == R.id.acf && (frameLayout instanceof FrameLayout)) {
                            break;
                        }
                        ViewParent parent2 = frameLayout.getParent();
                        if (!(parent2 instanceof View)) {
                            parent2 = null;
                        }
                        frameLayout = (View) parent2;
                    } else {
                        frameLayout = null;
                        break;
                    }
                }
                FrameLayout frameLayout2 = frameLayout;
                if (frameLayout2 != null) {
                    ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
                    constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
                    int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(R.dimen.lr);
                    int dimensionPixelSize2 = constraintLayout.getResources().getDimensionPixelSize(R.dimen.ls);
                    C23163i.m43660a((View) constraintLayout, Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize2), Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize2), false, 16);
                    constraintLayout.setBackgroundColor(-1);
                    frameLayout2.addView(constraintLayout, frameLayout2.getChildCount());
                    Context requireContext = requireContext();
                    C89219l.m154716b(requireContext, "");
                    TuxButton tuxButton = new TuxButton(requireContext, null, 0, 6);
                    ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a(-1, -2);
                    aVar.f2270h = 0;
                    tuxButton.setLayoutParams(aVar);
                    tuxButton.setButtonSize(3);
                    tuxButton.setButtonVariant(0);
                    tuxButton.setText(R.string.fie);
                    tuxButton.setTextColor(-1);
                    constraintLayout.addView(tuxButton);
                    tuxButton.setOnClickListener(new View$OnClickListenerC54223l(this, constraintLayout));
                    this.f124201k = constraintLayout;
                }
            }
            MethodCollector.m26664o(3627);
            return;
        }
        ViewGroup viewGroup = this.f124201k;
        if (viewGroup != null) {
            C89219l.m154719c(viewGroup, "");
            if (!z) {
                i = 8;
            }
            viewGroup.setVisibility(i);
            MethodCollector.m26664o(3627);
            return;
        }
        MethodCollector.m26664o(3627);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.dzp);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f124196e = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        getActivity();
        recyclerView.setLayoutManager(new WrapGridLayoutManager(3, 1));
        recyclerView.setAdapter(new C54206a(mo64296c()));
        recyclerView.mo4402a(new C33471c(recyclerView.getResources().getDimensionPixelSize(R.dimen.m1)));
        recyclerView.mo4405a(this.f124205o);
        RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f4470l = 0;
        }
        FavoriteVideoPickerViewModel c = mo64296c();
        c.f124176c.observe(this, new C54215d(this, view));
        c.f124175b.observe(this, new C54216e(c, this, view));
        c.f124178e.observe(this, new C54217f(this, view));
        c.f124179f.observe(this, new C54218g(this, view));
        c.f124180g.observe(this, new C54219h(this, view));
        c.f124177d.observe(this, new C54220i(this, view));
        View findViewById2 = view.findViewById(R.id.ave);
        C89219l.m154716b(findViewById2, "");
        this.f124199h = findViewById2;
        View findViewById3 = view.findViewById(R.id.cg4);
        C89219l.m154716b(findViewById3, "");
        this.f124198g = findViewById3;
        View findViewById4 = view.findViewById(R.id.cg3);
        C89219l.m154716b(findViewById4, "");
        TuxDualBallView tuxDualBallView = (TuxDualBallView) findViewById4;
        this.f124202l = tuxDualBallView;
        if (tuxDualBallView == null) {
            C89219l.m154710a("loadingView");
        }
        tuxDualBallView.mo37884b();
        View findViewById5 = view.findViewById(R.id.d_6);
        C89219l.m154716b(findViewById5, "");
        this.f124197f = (ProgressBar) findViewById5;
        View findViewById6 = view.findViewById(R.id.dze);
        C89219l.m154716b(findViewById6, "");
        ImageView imageView = (ImageView) findViewById6;
        this.f124203m = imageView;
        if (imageView == null) {
            C89219l.m154710a("closeButton");
        }
        imageView.setOnClickListener(new View$OnClickListenerC54221j(this));
        mo64296c().mo91299a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a77, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Serializable serializable = null;
        if (i != 6248 || i2 != -1) {
            mo64296c().mo91301b(null);
        } else if (intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("send_video");
            if (serializableExtra instanceof Aweme) {
                serializable = serializableExtra;
            }
            Aweme aweme = (Aweme) serializable;
            if (aweme != null) {
                mo64296c().mo91301b(aweme);
            }
        }
    }
}
