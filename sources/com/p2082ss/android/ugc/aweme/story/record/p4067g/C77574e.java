package com.p2082ss.android.ugc.aweme.story.record.p4067g;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.story.record.g.e */
public final class C77574e extends AbstractC22219j {

    /* renamed from: b */
    public static final C77577b f173980b = new C77577b((byte) 0);

    /* renamed from: a */
    public final AbstractC89171a<C89391z> f173981a;

    /* renamed from: c */
    private final AbstractC89244h f173982c;

    /* renamed from: d */
    private View f173983d;

    /* renamed from: e */
    private final boolean f173984e;

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.e$d */
    static final class View$OnTouchListenerC77579d implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC77579d f173989a = new View$OnTouchListenerC77579d();

        static {
            Covode.recordClassIndex(90616);
        }

        View$OnTouchListenerC77579d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(90611);
    }

    /* renamed from: a */
    public final StoryRecordBaseViewModel mo121134a() {
        return (StoryRecordBaseViewModel) this.f173982c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.e$b */
    public static final class C77577b {
        static {
            Covode.recordClassIndex(90614);
        }

        private C77577b() {
        }

        public /* synthetic */ C77577b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.e$a */
    public static final class C77575a extends AbstractC89220m implements AbstractC89171a<StoryRecordBaseViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f173985a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f173986b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f173987c;

        static {
            Covode.recordClassIndex(90612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77575a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f173985a = jVar;
            this.f173986b = cVar;
            this.f173987c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.scene.j r0 = r3.f173985a
                android.app.Activity r1 = r0.mo36486t()
                java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                java.util.Objects.requireNonNull(r1, r0)
                androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                com.ss.android.ugc.aweme.story.record.g.e$a$1 r0 = new com.ss.android.ugc.aweme.story.record.g.e$a$1
                r0.<init>()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r3.f173987c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                h.k.c r0 = r3.f173986b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m135577x5f50e2c4(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.record.p4067g.C77574e.C77575a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_story_record_permission_StoryRecordPermissionScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m135577x5f50e2c4(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: b */
    public final void mo121136b() {
        int i;
        if (this.f52550n != null) {
            if (this.f173984e) {
                i = R.id.pp;
            } else {
                i = R.id.pf;
            }
            View c = mo36475c(i);
            C89219l.m154716b(c, "");
            ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin + C70636dh.m124833c(mo36485s()), layoutParams2.rightMargin, layoutParams2.bottomMargin);
            c.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.e$c */
    static final class View$OnClickListenerC77578c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77574e f173988a;

        static {
            Covode.recordClassIndex(90615);
        }

        View$OnClickListenerC77578c(C77574e eVar) {
            this.f173988a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f173988a.f173981a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.e$e */
    static final class View$OnClickListenerC77580e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77574e f173990a;

        static {
            Covode.recordClassIndex(90617);
        }

        View$OnClickListenerC77580e(C77574e eVar) {
            this.f173990a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f173990a.mo121134a().mo121089a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.e$f */
    static final class View$OnClickListenerC77581f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77574e f173991a;

        static {
            Covode.recordClassIndex(90618);
        }

        View$OnClickListenerC77581f(C77574e eVar) {
            this.f173991a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f173991a.mo121134a().mo121089a();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        mo36475c(R.id.i_).setOnClickListener(new View$OnClickListenerC77578c(this));
        mo36475c(R.id.dnb).setOnTouchListener(View$OnTouchListenerC77579d.f173989a);
        mo36475c(R.id.pf).setOnClickListener(new View$OnClickListenerC77580e(this));
        mo36475c(R.id.pp).setOnClickListener(new View$OnClickListenerC77581f(this));
    }

    /* renamed from: a */
    public final void mo121135a(boolean z) {
        int i;
        View view = this.f173983d;
        if (view == null) {
            C89219l.m154710a("maskView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public C77574e(boolean z, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f173984e = z;
        this.f173981a = aVar;
        AbstractC89277c a = C89204ab.m154669a(StoryRecordBaseViewModel.class);
        this.f173982c = C89250i.m154773a((AbstractC89171a) new C77575a(this, a, a));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b23, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.cif);
        C89219l.m154716b(c, "");
        this.f173983d = c;
        if (this.f173984e) {
            View c2 = mo36475c(R.id.pf);
            C89219l.m154716b(c2, "");
            c2.setVisibility(8);
            View c3 = mo36475c(R.id.pp);
            C89219l.m154716b(c3, "");
            c3.setVisibility(0);
        }
    }
}
