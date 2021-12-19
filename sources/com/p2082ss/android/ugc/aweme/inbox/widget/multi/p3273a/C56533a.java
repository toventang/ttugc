package com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56346e;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56562b;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.EnumC56565e;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89266e;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a */
public final class C56533a extends AbstractC56557f<C56562b> {

    /* renamed from: a */
    public final String f128913a = "1";

    /* renamed from: b */
    public final String f128914b = "0";

    /* renamed from: c */
    public String f128915c;

    /* renamed from: d */
    public String f128916d;

    /* renamed from: k */
    private final AbstractC89244h f128917k;

    /* renamed from: l */
    private final AbstractC89244h f128918l;

    /* renamed from: m */
    private final AbstractC89244h f128919m;

    /* renamed from: n */
    private final AbstractC89244h f128920n;

    /* renamed from: o */
    private final AbstractC89244h f128921o;

    /* renamed from: p */
    private final AbstractC89244h f128922p;

    /* renamed from: q */
    private final AbstractC89244h f128923q;

    /* renamed from: r */
    private final AbstractC89244h f128924r;

    /* renamed from: s */
    private final AbstractC89244h f128925s;

    /* renamed from: t */
    private final Runnable f128926t;

    static {
        Covode.recordClassIndex(66356);
    }

    /* renamed from: f */
    private final TuxIconView m102505f() {
        return (TuxIconView) this.f128917k.getValue();
    }

    /* renamed from: g */
    private final LinearLayoutCompat m102506g() {
        return (LinearLayoutCompat) this.f128919m.getValue();
    }

    /* renamed from: h */
    private final AvatarImageView m102507h() {
        return (AvatarImageView) this.f128920n.getValue();
    }

    /* renamed from: i */
    private final TuxTextView m102508i() {
        return (TuxTextView) this.f128921o.getValue();
    }

    /* renamed from: j */
    private final TuxAlertBadge m102509j() {
        return (TuxAlertBadge) this.f128922p.getValue();
    }

    /* renamed from: k */
    private final TuxTextView m102510k() {
        return (TuxTextView) this.f128923q.getValue();
    }

    /* renamed from: l */
    private final TuxIconView m102511l() {
        return (TuxIconView) this.f128924r.getValue();
    }

    /* renamed from: m */
    private final int m102512m() {
        return ((Number) this.f128925s.getValue()).intValue();
    }

    /* renamed from: a */
    public final TuxTextView mo93478a() {
        return (TuxTextView) this.f128918l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$b */
    static final class C56536b extends AbstractC89220m implements AbstractC89171a<LinearLayoutCompat> {

        /* renamed from: a */
        final /* synthetic */ View f128929a;

        static {
            Covode.recordClassIndex(66359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56536b(View view) {
            super(0);
            this.f128929a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayoutCompat invoke() {
            return this.f128929a.findViewById(R.id.c_9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$c */
    static final class C56537c extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f128930a;

        static {
            Covode.recordClassIndex(66360);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56537c(View view) {
            super(0);
            this.f128930a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f128930a.findViewById(R.id.c_8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$d */
    static final class C56538d extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ View f128931a;

        static {
            Covode.recordClassIndex(66361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56538d(View view) {
            super(0);
            this.f128931a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f128931a.findViewById(R.id.bsj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$e */
    static final class C56539e extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ View f128932a;

        static {
            Covode.recordClassIndex(66362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56539e(View view) {
            super(0);
            this.f128932a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f128932a.findViewById(R.id.p_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$f */
    static final class C56540f extends AbstractC89220m implements AbstractC89171a<AvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ View f128933a;

        static {
            Covode.recordClassIndex(66363);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56540f(View view) {
            super(0);
            this.f128933a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.f128933a.findViewById(R.id.bzq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$g */
    static final class C56541g extends AbstractC89220m implements AbstractC89171a<TuxAlertBadge> {

        /* renamed from: a */
        final /* synthetic */ View f128934a;

        static {
            Covode.recordClassIndex(66364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56541g(View view) {
            super(0);
            this.f128934a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxAlertBadge invoke() {
            return this.f128934a.findViewById(R.id.c__);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$h */
    static final class C56542h extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f128935a;

        static {
            Covode.recordClassIndex(66365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56542h(View view) {
            super(0);
            this.f128935a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f128935a.findViewById(R.id.c_a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$i */
    static final class C56543i extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f128936a;

        static {
            Covode.recordClassIndex(66366);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56543i(View view) {
            super(0);
            this.f128936a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f128936a.findViewById(R.id.pa);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$a */
    static final class C56535a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ View f128928a;

        static {
            Covode.recordClassIndex(66358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56535a(View view) {
            super(0);
            this.f128928a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0643b.m2378c(this.f128928a.getContext(), R.color.b6));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.a$j */
    static final class RunnableC56544j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56533a f128937a;

        static {
            Covode.recordClassIndex(66367);
        }

        RunnableC56544j(C56533a aVar) {
            this.f128937a = aVar;
        }

        public final void run() {
            List<String> list;
            String str;
            C56562b bVar = (C56562b) this.f128937a.mo93488c();
            if (bVar != null && bVar.f128964b != null && (list = ((C56562b) this.f128937a.mo93488c()).f128964b) != null && !list.isEmpty()) {
                int size = ((C56562b) this.f128937a.mo93488c()).f128964b.size();
                if (size % 2 == 0) {
                    C89266e a = C89271h.m154765a((C89266e) C89271h.m154766a(0, size), 2);
                    int i = a.f202927a;
                    int i2 = a.f202928b;
                    int i3 = a.f202929c;
                    if (i3 >= 0) {
                        if (i > i2) {
                            return;
                        }
                    } else if (i < i2) {
                        return;
                    }
                    while (true) {
                        String str2 = ((C56562b) this.f128937a.mo93488c()).f128964b.get(i);
                        TuxTextView a2 = this.f128937a.mo93478a();
                        C89219l.m154716b(a2, "");
                        float measureText = a2.getPaint().measureText(str2);
                        TuxTextView a3 = this.f128937a.mo93478a();
                        C89219l.m154716b(a3, "");
                        if (measureText <= ((float) a3.getWidth())) {
                            TuxTextView a4 = this.f128937a.mo93478a();
                            C89219l.m154716b(a4, "");
                            a4.setText(str2);
                            C56533a aVar = this.f128937a;
                            aVar.f128915c = ((C56562b) aVar.mo93488c()).f128964b.get(i + 1);
                            C56533a aVar2 = this.f128937a;
                            if (i == 0) {
                                str = aVar2.f128914b;
                            } else {
                                str = aVar2.f128913a;
                            }
                            aVar2.f128916d = str;
                            if (this.f128937a.mo93489d() != null) {
                                MultiViewModel.m102491a((C56562b) this.f128937a.mo93488c(), this.f128937a.f128915c, this.f128937a.f128916d);
                                return;
                            }
                            return;
                        } else if (i != i2) {
                            i += i3;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m102504a(boolean z) {
        if (z) {
            AvatarImageView h = m102507h();
            C89219l.m154716b(h, "");
            C24246a aVar = (C24246a) h.getHierarchy();
            C89219l.m154716b(aVar, "");
            C24250e eVar = aVar.f57470a;
            if (eVar != null) {
                int m = m102512m();
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                eVar.mo39981a(m, TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics()));
                return;
            }
            return;
        }
        AvatarImageView h2 = m102507h();
        C89219l.m154716b(h2, "");
        C24246a aVar2 = (C24246a) h2.getHierarchy();
        C89219l.m154716b(aVar2, "");
        C24250e eVar2 = aVar2.f57470a;
        if (eVar2 != null) {
            eVar2.mo39985c(0.0f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56533a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f128917k = C89250i.m154773a((AbstractC89171a) new C56539e(view));
        this.f128918l = C89250i.m154773a((AbstractC89171a) new C56543i(view));
        this.f128919m = C89250i.m154773a((AbstractC89171a) new C56536b(view));
        this.f128920n = C89250i.m154773a((AbstractC89171a) new C56540f(view));
        this.f128921o = C89250i.m154773a((AbstractC89171a) new C56537c(view));
        this.f128922p = C89250i.m154773a((AbstractC89171a) new C56541g(view));
        this.f128923q = C89250i.m154773a((AbstractC89171a) new C56542h(view));
        this.f128924r = C89250i.m154773a((AbstractC89171a) new C56538d(view));
        this.f128915c = "";
        this.f128916d = "0";
        this.f128925s = C89250i.m154773a((AbstractC89171a) new C56535a(view));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.C56533a.View$OnClickListenerC565341 */

            /* renamed from: a */
            final /* synthetic */ C56533a f128927a;

            static {
                Covode.recordClassIndex(66357);
            }

            {
                this.f128927a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200)) {
                    this.f128927a.mo93489d();
                    C56562b bVar = (C56562b) this.f128927a.mo93488c();
                    String str2 = this.f128927a.f128915c;
                    String str3 = this.f128927a.f128916d;
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(str2, "");
                    C89219l.m154721d(str3, "");
                    MultiViewModel.m102492a("click", bVar, str2, str3);
                    C56346e.m102333a();
                    if (((C56562b) this.f128927a.mo93488c()).f128963a == EnumC56565e.FOLLOWER) {
                        str = "aweme://user/inbox/follower";
                    } else {
                        str = "aweme://user/notification";
                    }
                    SmartRouter.buildRoute(this.f128927a.mo93490e().requireActivity(), str).open();
                }
            }
        });
        this.f128926t = new RunnableC56544j(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    /* renamed from: b */
    public final void mo93480b(C56520b bVar) {
        boolean z;
        C56520b bVar2;
        C89219l.m154721d(bVar, "");
        super.mo93480b(bVar);
        if (bVar.f128860b != -1) {
            z = true;
        } else {
            z = false;
        }
        C56520b bVar3 = null;
        if (z) {
            TuxIconView f = m102505f();
            C89219l.m154716b(f, "");
            TuxIconView f2 = m102505f();
            C89219l.m154716b(f2, "");
            ViewGroup.LayoutParams layoutParams = f2.getLayoutParams();
            layoutParams.width = bVar.f128860b;
            layoutParams.height = bVar.f128860b;
            f.setLayoutParams(layoutParams);
        }
        if (bVar.f128863e != -1) {
            mo93478a().setTuxFont(bVar.f128863e);
        }
        if (bVar.f128864f != -1) {
            mo93478a().mo37697a((float) bVar.f128864f);
        }
        if (bVar.f128865g != -1) {
            m102508i().setTuxFont(bVar.f128865g);
        }
        if (bVar.f128867i != -1) {
            m102508i().setTextColor(bVar.f128867i);
        }
        if (bVar.f128868j != -1) {
            bVar2 = bVar;
        } else {
            bVar2 = null;
        }
        if (bVar2 != null) {
            LinearLayoutCompat g = m102506g();
            C89219l.m154716b(g, "");
            if (g.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                LinearLayoutCompat g2 = m102506g();
                C89219l.m154716b(g2, "");
                LinearLayoutCompat g3 = m102506g();
                C89219l.m154716b(g3, "");
                ViewGroup.LayoutParams layoutParams2 = g3.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.topMargin = bVar2.f128868j;
                g2.setLayoutParams(marginLayoutParams);
            }
        }
        if (bVar.f128871m != -1) {
            bVar3 = bVar;
        }
        TuxAlertBadge j = m102509j();
        C89219l.m154716b(j, "");
        if ((j.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && bVar3 != null) {
            TuxAlertBadge j2 = m102509j();
            C89219l.m154716b(j2, "");
            TuxAlertBadge j3 = m102509j();
            C89219l.m154716b(j3, "");
            ViewGroup.LayoutParams layoutParams3 = j3.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams2.setMarginStart(bVar3.f128871m);
            j2.setLayoutParams(marginLayoutParams2);
        }
        if (bVar.f128869k != -1) {
            m102510k().setTuxFont(bVar.f128869k);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.widget.multi.k] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0195  */
    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo93479a(com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56562b r11) {
        /*
        // Method dump skipped, instructions count: 416
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.C56533a.mo93479a(com.ss.android.ugc.aweme.inbox.widget.multi.k):void");
    }
}
