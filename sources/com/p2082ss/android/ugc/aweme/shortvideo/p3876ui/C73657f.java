package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.p022b.p023a.C0464a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f */
public final /* synthetic */ class C73657f {

    /* renamed from: a */
    static boolean f165488a = true;

    static {
        Covode.recordClassIndex(86395);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f$c */
    public static final class C73660c extends AbstractC89220m implements AbstractC89183m<View, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f165493a;

        static {
            Covode.recordClassIndex(86398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73660c(Context context) {
            super(2);
            this.f165493a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View view, Boolean bool) {
            bool.booleanValue();
            mo116201a(view);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo116201a(View view) {
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.blo);
            C89219l.m154716b(findViewById, "");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C70636dh.m124833c(this.f165493a) + this.f165493a.getResources().getDimensionPixelSize(R.dimen.rk);
            findViewById.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public static final void m129769a(ViewGroup viewGroup) {
        MethodCollector.m26663i(10703);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
        }
        f165488a = false;
        MethodCollector.m26664o(10703);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f$e */
    static final class C73662e extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73660c f165495a;

        static {
            Covode.recordClassIndex(86400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73662e(C73660c cVar) {
            super(1);
            this.f165495a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            mo116202a(view);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo116202a(View view) {
            C89219l.m154721d(view, "");
            switch (C33398a.f79357a.mo59448a()) {
                case 1:
                case 4:
                    this.f165495a.mo116201a(view);
                    C73661d.m129772a(view, true);
                    return;
                case 2:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.f165495a.mo116201a(view);
                    C73661d.m129772a(view, true);
                    return;
                case 3:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    this.f165495a.mo116201a(view);
                    C73661d.m129772a(view, false);
                    return;
                default:
                    this.f165495a.mo116201a(view);
                    C73661d.m129772a(view, false);
                    return;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f$a */
    static final class C73658a extends AbstractC89220m implements AbstractC89183m<View, Integer, C89391z> {

        /* renamed from: a */
        public static final C73658a f165489a = new C73658a();

        static {
            Covode.recordClassIndex(86396);
        }

        C73658a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View view, Integer num) {
            m129770a(view, num.intValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m129770a(View view, int i) {
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f$d */
    public static final class C73661d extends AbstractC89220m implements AbstractC89183m<View, Boolean, C89391z> {

        /* renamed from: a */
        public static final C73661d f165494a = new C73661d();

        static {
            Covode.recordClassIndex(86399);
        }

        C73661d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View view, Boolean bool) {
            m129772a(view, bool.booleanValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m129772a(View view, boolean z) {
            C89219l.m154721d(view, "");
            if (z) {
                View findViewById = view.findViewById(R.id.dlt);
                C89219l.m154716b(findViewById, "");
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin + C71812ep.m126783a(33.0d, C63247i.f143610a));
                findViewById.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f$f */
    static final class C73663f implements C0464a.AbstractC0469d {

        /* renamed from: a */
        final /* synthetic */ C73662e f165496a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f165497b;

        static {
            Covode.recordClassIndex(86401);
        }

        C73663f(C73662e eVar, ViewGroup viewGroup) {
            this.f165496a = eVar;
            this.f165497b = viewGroup;
        }

        @Override // androidx.p022b.p023a.C0464a.AbstractC0469d
        public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
            MethodCollector.m26663i(9384);
            C89219l.m154721d(view, "");
            this.f165496a.mo116202a(view);
            if (C73657f.f165488a) {
                this.f165497b.addView(view);
            }
            MethodCollector.m26664o(9384);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f$b */
    public static final class C73659b implements C0464a.AbstractC0469d {

        /* renamed from: a */
        final /* synthetic */ Context f165490a;

        /* renamed from: b */
        final /* synthetic */ boolean f165491b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f165492c;

        static {
            Covode.recordClassIndex(86397);
        }

        C73659b(Context context, boolean z, ViewGroup viewGroup) {
            this.f165490a = context;
            this.f165491b = z;
            this.f165492c = viewGroup;
        }

        @Override // androidx.p022b.p023a.C0464a.AbstractC0469d
        public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
            int i2;
            MethodCollector.m26663i(9710);
            C89219l.m154721d(view, "");
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.dli);
            int c = C70636dh.m124833c(this.f165490a);
            ProgressSegmentView progressSegmentView = (ProgressSegmentView) view.findViewById(R.id.d_e);
            C89219l.m154716b(progressSegmentView, "");
            if (this.f165491b) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            progressSegmentView.setVisibility(i2);
            C73658a.m129770a(progressSegmentView, this.f165490a.getResources().getDimensionPixelSize(R.dimen.rl) + c);
            C73658a.m129770a(relativeLayout, this.f165490a.getResources().getDimensionPixelSize(R.dimen.rk) + c);
            C73658a.m129770a(view.findViewById(R.id.blo), c + this.f165490a.getResources().getDimensionPixelSize(R.dimen.rk));
            RecordLayout recordLayout = (RecordLayout) view.findViewById(R.id.der);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.a7z);
            view.findViewById(R.id.a7x);
            view.findViewById(R.id.a7y);
            C89219l.m154716b(recordLayout, "");
            ViewGroup.LayoutParams layoutParams = recordLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                C89219l.m154716b(frameLayout, "");
                ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    int a = C33398a.f79357a.mo59448a();
                    if (a == 1 || a == 2 || a == 4 || a == 5) {
                        layoutParams2.bottomMargin = C71812ep.m126783a(33.0d, C63247i.f143610a) + C71812ep.m126783a(40.0d, C63247i.f143610a);
                        layoutParams4.bottomMargin = C71812ep.m126783a(33.0d, C63247i.f143610a) + C71812ep.m126783a(40.0d, C63247i.f143610a);
                    } else {
                        layoutParams2.bottomMargin = C71812ep.m126783a(40.0d, C63247i.f143610a);
                        layoutParams4.bottomMargin = C71812ep.m126783a(40.0d, C63247i.f143610a);
                    }
                    recordLayout.setLayoutParams(layoutParams2);
                    frameLayout.setLayoutParams(layoutParams4);
                    frameLayout.bringToFront();
                    if (C73657f.f165488a) {
                        this.f165492c.addView(view);
                    }
                    MethodCollector.m26664o(9710);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                MethodCollector.m26664o(9710);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            MethodCollector.m26664o(9710);
            throw nullPointerException2;
        }
    }

    /* renamed from: a */
    public static final void m129768a(Context context, ViewGroup viewGroup, boolean z, boolean z2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        if (z) {
            C0464a aVar = new C0464a(context);
            f165488a = true;
            aVar.mo2025a(R.layout.f2, viewGroup, new C73659b(context, z2, viewGroup));
        }
    }
}
