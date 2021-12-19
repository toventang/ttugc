package com.p2082ss.android.ugc.aweme.p3070im.p3072b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42066d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.AbstractC56267b;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56266c;
import com.p2082ss.android.ugc.aweme.share.improve.DialogC69122c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.b.a */
public final class C53591a implements AbstractC56266c {

    /* renamed from: g */
    public static final C53594a f123000g = new C53594a((byte) 0);

    /* renamed from: a */
    public AbstractC56267b f123001a;

    /* renamed from: b */
    public int f123002b;

    /* renamed from: c */
    public int f123003c;

    /* renamed from: d */
    public int f123004d;

    /* renamed from: e */
    public final boolean f123005e;

    /* renamed from: f */
    public final C53597b f123006f;

    static {
        Covode.recordClassIndex(63169);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: b */
    public final void mo90150b(SharePackage sharePackage) {
        C89219l.m154721d(sharePackage, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.b.a$a */
    public static final class C53594a {
        static {
            Covode.recordClassIndex(63172);
        }

        private C53594a() {
        }

        public /* synthetic */ C53594a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final boolean m98820b() {
        return this.f123006f.f123013b instanceof DialogC69122c;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: a */
    public final void mo90144a() {
        this.f123006f.f123013b.dismiss();
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC56267b m98819a(C53591a aVar) {
        AbstractC56267b bVar = aVar.f123001a;
        if (bVar == null) {
            C89219l.m154710a("realImChannel");
        }
        return bVar;
    }

    /* renamed from: d */
    private static Aweme m98823d(SharePackage sharePackage) {
        String str = "";
        String string = sharePackage.f155492i.getString("aid", str);
        if (string != null) {
            str = string;
        }
        return AwemeService.m70060b().mo60690d(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56266c
    /* renamed from: a */
    public final void mo90146a(AbstractC56267b bVar) {
        C89219l.m154721d(bVar, "");
        this.f123001a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.b.a$b */
    public static final class C53595b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C53591a f123009a;

        /* renamed from: b */
        final /* synthetic */ boolean f123010b;

        static {
            Covode.recordClassIndex(63173);
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f123010b) {
                View a = C53591a.m98819a(this.f123009a).mo92844a();
                if (a != null) {
                    a.setVisibility(8);
                }
                View b = C53591a.m98819a(this.f123009a).mo92845b();
                if (b != null) {
                    b.setVisibility(8);
                }
            } else {
                this.f123009a.f123006f.f123015d.setVisibility(8);
            }
            C53591a.m98819a(this.f123009a);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f123010b) {
                this.f123009a.f123006f.f123015d.setVisibility(0);
                return;
            }
            View a = C53591a.m98819a(this.f123009a).mo92844a();
            if (a != null) {
                a.setVisibility(0);
            }
            View b = C53591a.m98819a(this.f123009a).mo92845b();
            if (b != null) {
                b.setVisibility(0);
            }
        }

        C53595b(C53591a aVar, boolean z) {
            this.f123009a = aVar;
            this.f123010b = z;
        }
    }

    /* renamed from: b */
    private final boolean m98821b(boolean z) {
        AbstractC56267b bVar = this.f123001a;
        if (bVar == null) {
            C89219l.m154710a("realImChannel");
        }
        View a = bVar.mo92844a();
        if (a == null) {
            C89219l.m154715b();
        }
        if (!this.f123005e) {
            if (z) {
                if (a.getVisibility() != 0) {
                    return false;
                }
                return true;
            }
        } else if (z) {
            return false;
        }
        if (a.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m98822c(boolean z) {
        C53597b bVar = this.f123006f;
        bVar.f123015d.setVisibility(8);
        if (z) {
            AbstractC56267b bVar2 = this.f123001a;
            if (bVar2 == null) {
                C89219l.m154710a("realImChannel");
            }
            bVar2.mo92847d();
            bVar.f123014c.setVisibility(0);
            bVar.f123016e.setVisibility(0);
        } else {
            bVar.f123014c.setVisibility(8);
            bVar.f123016e.setVisibility(8);
        }
        if (this.f123001a == null) {
            C89219l.m154710a("realImChannel");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56266c
    /* renamed from: a */
    public final void mo90145a(IMContact iMContact) {
        boolean z;
        C89219l.m154721d(iMContact, "");
        AbstractC56267b bVar = this.f123001a;
        if (bVar == null) {
            C89219l.m154710a("realImChannel");
        }
        List<IMContact> c = bVar.mo92846c();
        if (c == null || c.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        mo90148a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.b.a$c */
    public static final class C53596c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C53591a f123011a;

        static {
            Covode.recordClassIndex(63174);
        }

        C53596c(C53591a aVar) {
            this.f123011a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            float f = floatValue / ((float) this.f123011a.f123002b);
            this.f123011a.f123006f.f123015d.setAlpha(f);
            View a = C53591a.m98819a(this.f123011a).mo92844a();
            if (a != null) {
                a.setAlpha(1.0f - f);
            }
            View b = C53591a.m98819a(this.f123011a).mo92845b();
            if (b != null) {
                b.setAlpha(1.0f - f);
            }
            ViewGroup.LayoutParams layoutParams = this.f123011a.f123006f.f123014c.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = (int) floatValue;
            marginLayoutParams.topMargin = (int) (((float) this.f123011a.f123003c) * f);
            marginLayoutParams.bottomMargin = (int) (f * ((float) this.f123011a.f123004d));
            this.f123011a.f123006f.f123014c.setLayoutParams(marginLayoutParams);
        }
    }

    public C53591a(C53597b bVar) {
        FrameLayout frameLayout;
        C89219l.m154721d(bVar, "");
        this.f123006f = bVar;
        boolean a = C89219l.m154714a((Object) bVar.f123017f.f155487d, (Object) UGCMonitor.EVENT_COMMENT);
        this.f123005e = a;
        View findViewById = bVar.f123013b.findViewById(R.id.emn);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.p3072b.C53591a.View$OnClickListenerC535921 */

                /* renamed from: a */
                final /* synthetic */ C53591a f123007a;

                static {
                    Covode.recordClassIndex(63170);
                }

                {
                    this.f123007a = r1;
                }

                public final void onClick(View view) {
                    View a;
                    ClickAgent.onClick(view);
                    if (this.f123007a.f123005e || (a = C53591a.m98819a(this.f123007a).mo92844a()) == null || a.getVisibility() != 0) {
                        this.f123007a.f123006f.f123013b.cancel();
                    } else {
                        this.f123007a.mo90148a(true);
                    }
                }
            });
        }
        bVar.f123014c.post(new Runnable(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.p3072b.C53591a.RunnableC535932 */

            /* renamed from: a */
            final /* synthetic */ C53591a f123008a;

            static {
                Covode.recordClassIndex(63171);
            }

            {
                this.f123008a = r1;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = this.f123008a.f123006f.f123014c.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                C53591a aVar = this.f123008a;
                aVar.f123002b = aVar.f123006f.f123014c.getHeight();
                this.f123008a.f123003c = marginLayoutParams.topMargin;
                this.f123008a.f123004d = marginLayoutParams.bottomMargin;
            }
        });
        Dialog dialog = bVar.f123013b;
        if (!(dialog == null || !(dialog instanceof DialogC26609a) || (frameLayout = (FrameLayout) ((DialogC26609a) dialog).findViewById(R.id.ajx)) == null)) {
            BottomSheetBehavior a2 = BottomSheetBehavior.m52754a(frameLayout);
            C89219l.m154716b(a2, "");
            a2.mo43976b(frameLayout.getHeight());
            a2.f62895i = true;
        }
        if (a) {
            bVar.f123016e.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo90148a(boolean z) {
        if (!m98821b(z)) {
            return;
        }
        if (m98820b()) {
            m98822c(z);
        } else {
            m98824d(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: c */
    public final void mo90151c(SharePackage sharePackage) {
        C89219l.m154721d(sharePackage, "");
        if (C89219l.m154714a((Object) sharePackage.f155487d, (Object) "live")) {
            new C23144b(this.f123006f.f123014c).mo37640e(R.string.ch9).mo37637b();
        }
        this.f123006f.f123013b.dismiss();
        Bundle bundle = sharePackage.f155492i;
        if (C89219l.m154714a((Object) bundle.getString("is_star"), (Object) "1")) {
            C42066d.m84194a(bundle.getString("author_id", ""), bundle.getString("sec_author_id", ""), 3, null);
        }
        AbstractC69683d dVar = this.f123006f.f123018g;
        if (dVar != null) {
            dVar.mo69718a(sharePackage);
        }
    }

    /* renamed from: d */
    private final void m98824d(boolean z) {
        float f;
        ValueAnimator ofFloat;
        AbstractC56267b bVar = this.f123001a;
        if (bVar == null) {
            C89219l.m154710a("realImChannel");
        }
        View b = bVar.mo92845b();
        if (b != null) {
            f = ((float) b.getHeight()) + C13628n.m24520b(b.getContext(), 5.0f);
        } else {
            f = 0.0f;
        }
        int i = 0;
        if (z) {
            AbstractC56267b bVar2 = this.f123001a;
            if (bVar2 == null) {
                C89219l.m154710a("realImChannel");
            }
            bVar2.mo92847d();
            ofFloat = ValueAnimator.ofFloat(f, (float) this.f123002b);
            C89219l.m154716b(ofFloat, "");
        } else {
            ofFloat = ValueAnimator.ofFloat(((float) this.f123002b) - f, 0.0f);
            C89219l.m154716b(ofFloat, "");
        }
        View view = this.f123006f.f123016e;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        this.f123006f.f123013b.setCancelable(z);
        ofFloat.addListener(new C53595b(this, z));
        ofFloat.addUpdateListener(new C53596c(this));
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: a */
    public final boolean mo90149a(SharePackage sharePackage) {
        C89219l.m154721d(sharePackage, "");
        if (C37699a.m76218U(m98823d(sharePackage))) {
            new C23144b(this.f123006f.f123014c).mo37640e(R.string.o7).mo37637b();
            return false;
        }
        AbstractC69683d dVar = this.f123006f.f123018g;
        if (dVar != null) {
            return dVar.mo69720b(sharePackage);
        }
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(sharePackage, "");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90147a(java.lang.String r9, com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage r10) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.p3072b.C53591a.mo90147a(java.lang.String, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }
}
