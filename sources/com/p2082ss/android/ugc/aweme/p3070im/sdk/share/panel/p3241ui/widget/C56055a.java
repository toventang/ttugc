package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55213i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55967b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56201b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a */
public final class C56055a {

    /* renamed from: e */
    public static final C56057a f127840e = new C56057a((byte) 0);

    /* renamed from: a */
    public final ValueAnimator.AnimatorUpdateListener f127841a;

    /* renamed from: b */
    public boolean f127842b;

    /* renamed from: c */
    public boolean f127843c;

    /* renamed from: d */
    public final C55967b f127844d;

    /* renamed from: f */
    private final AbstractC89244h f127845f;

    /* renamed from: g */
    private final AbstractC89244h f127846g;

    /* renamed from: h */
    private final AbstractC89244h f127847h;

    /* renamed from: i */
    private final AbstractC89244h f127848i;

    /* renamed from: j */
    private final SharePackage f127849j;

    /* renamed from: k */
    private final AbstractC55948b f127850k;

    /* renamed from: l */
    private final boolean f127851l;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$b */
    public static final class C56058b {

        /* renamed from: a */
        public static final C56059a f127853a = new C56059a((byte) 0);

        /* renamed from: b */
        private final AbstractC89244h f127854b = C89250i.m154773a((AbstractC89171a) C56061c.f127858a);

        /* renamed from: c */
        private final AbstractC89244h f127855c = C89250i.m154773a((AbstractC89171a) C56060b.f127857a);

        /* renamed from: d */
        private final AbstractC89244h f127856d = C89250i.m154773a((AbstractC89171a) C56062d.f127859a);

        static {
            Covode.recordClassIndex(65855);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Set<IMContact> mo92920a() {
            return (Set) this.f127854b.getValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final LinkedHashSet<IMContact> mo92922b() {
            return (LinkedHashSet) this.f127855c.getValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final Set<IMContact> mo92923c() {
            return (Set) this.f127856d.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$b$a */
        public static final class C56059a {
            static {
                Covode.recordClassIndex(65856);
            }

            private C56059a() {
            }

            public /* synthetic */ C56059a(byte b) {
                this();
            }

            /* renamed from: a */
            public static void m101959a(IMContact iMContact, Set<IMContact> set, boolean z) {
                C89219l.m154721d(iMContact, "");
                C89219l.m154721d(set, "");
                if (z) {
                    set.add(iMContact);
                } else {
                    set.remove(iMContact);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$b$b */
        static final class C56060b extends AbstractC89220m implements AbstractC89171a<LinkedHashSet<IMContact>> {

            /* renamed from: a */
            public static final C56060b f127857a = new C56060b();

            static {
                Covode.recordClassIndex(65857);
            }

            C56060b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LinkedHashSet<IMContact> invoke() {
                return new LinkedHashSet();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$b$c */
        static final class C56061c extends AbstractC89220m implements AbstractC89171a<Set<IMContact>> {

            /* renamed from: a */
            public static final C56061c f127858a = new C56061c();

            static {
                Covode.recordClassIndex(65858);
            }

            C56061c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Set<IMContact> invoke() {
                return new LinkedHashSet();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$b$d */
        static final class C56062d extends AbstractC89220m implements AbstractC89171a<Set<IMContact>> {

            /* renamed from: a */
            public static final C56062d f127859a = new C56062d();

            static {
                Covode.recordClassIndex(65859);
            }

            C56062d() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Set<IMContact> invoke() {
                return new LinkedHashSet();
            }
        }

        /* renamed from: h */
        public final List<String> mo92928h() {
            return C55213i.m100956b(C89070n.m154590j(mo92922b()));
        }

        /* renamed from: d */
        public final void mo92924d() {
            mo92920a().clear();
            mo92922b().clear();
            mo92923c().clear();
        }

        /* renamed from: f */
        public final boolean mo92926f() {
            if (!mo92920a().isEmpty() || !mo92923c().isEmpty()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public final boolean mo92925e() {
            if (mo92920a().size() + mo92922b().size() + mo92923c().size() < 2) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final boolean mo92927g() {
            Set<IMContact> c = mo92923c();
            if ((c instanceof Collection) && c.isEmpty()) {
                return false;
            }
            Iterator<T> it = c.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C74721a) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private static boolean m101948a(IMContact iMContact) {
            int i = C19489e.AbstractC19490a.f46181b;
            if (!(iMContact instanceof IMConversation)) {
                iMContact = null;
            }
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation == null || i != iMConversation.getConversationType()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        private static boolean m101949b(IMContact iMContact) {
            if (!(iMContact instanceof IMUser) || ((IMUser) iMContact).getFollowStatus() != 2) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo92921a(IMContact iMContact, boolean z) {
            C89219l.m154721d(iMContact, "");
            if (m101948a(iMContact)) {
                C56059a.m101959a(iMContact, mo92920a(), z);
            } else if (!m101949b(iMContact)) {
                C56059a.m101959a(iMContact, mo92923c(), z);
            } else if (!IMUser.isSelf(((IMUser) iMContact).getUid())) {
                C56059a.m101959a(iMContact, mo92922b(), z);
            }
        }
    }

    static {
        Covode.recordClassIndex(65852);
    }

    /* renamed from: e */
    private final AnimatorSet m101936e() {
        return (AnimatorSet) this.f127847h.getValue();
    }

    /* renamed from: a */
    public final int mo92911a() {
        return ((Number) this.f127845f.getValue()).intValue();
    }

    /* renamed from: b */
    public final C56058b mo92916b() {
        return (C56058b) this.f127848i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$a */
    public static final class C56057a {
        static {
            Covode.recordClassIndex(65854);
        }

        private C56057a() {
        }

        public /* synthetic */ C56057a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m101947a(SharePackage sharePackage) {
            if (!C56201b.m102110a() || C55339a.m101149a(sharePackage)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$f */
    static final class C56067f extends AbstractC89220m implements AbstractC89171a<C56058b> {

        /* renamed from: a */
        public static final C56067f f127864a = new C56067f();

        static {
            Covode.recordClassIndex(65864);
        }

        C56067f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56058b invoke() {
            return new C56058b();
        }
    }

    /* renamed from: c */
    public final void mo92917c() {
        boolean z = this.f127851l;
        if (z) {
            mo92915a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$e */
    static final class C56066e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C56066e f127863a = new C56066e();

        static {
            Covode.recordClassIndex(65863);
        }

        C56066e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            return Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics())));
        }
    }

    /* renamed from: f */
    private final void m101937f() {
        LinearLayout linearLayout = this.f127844d.f127624a;
        if (linearLayout.getVisibility() != 0) {
            linearLayout.setVisibility(0);
            ((AnimatorSet) this.f127846g.getValue()).start();
        }
    }

    /* renamed from: d */
    public final void mo92918d() {
        if (this.f127844d.f127624a.getVisibility() != 8) {
            mo92915a(false);
            m101936e().start();
        }
    }

    /* renamed from: g */
    private final void m101938g() {
        if (!C56057a.m101947a(this.f127849j) || mo92916b().mo92927g() || mo92916b().mo92925e() || !mo92916b().mo92926f()) {
            mo92918d();
            this.f127850k.mo92817b(false);
            return;
        }
        m101937f();
        this.f127850k.mo92817b(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$c */
    static final class C56063c extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C56055a f127860a;

        static {
            Covode.recordClassIndex(65860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56063c(C56055a aVar) {
            super(0);
            this.f127860a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f127860a.f127844d.f127624a, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.setStartDelay(100);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f127860a.mo92911a());
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(this.f127860a.f127841a);
            animatorSet.playTogether(ofInt, ofFloat);
            return animatorSet;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$d */
    static final class C56064d extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C56055a f127861a;

        static {
            Covode.recordClassIndex(65861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56064d(C56055a aVar) {
            super(0);
            this.f127861a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f127861a.f127844d.f127624a, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(100L);
            ValueAnimator ofInt = ValueAnimator.ofInt(this.f127861a.mo92911a(), 0);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(this.f127861a.f127841a);
            ofInt.addListener(new C56065a(this));
            animatorSet.playTogether(ofFloat, ofInt);
            return animatorSet;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$d$a */
        public static final class C56065a implements Animator.AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C56064d f127862a;

            static {
                Covode.recordClassIndex(65862);
            }

            public final void onAnimationCancel(Animator animator) {
                C89219l.m154719c(animator, "");
            }

            public final void onAnimationRepeat(Animator animator) {
                C89219l.m154719c(animator, "");
            }

            public final void onAnimationStart(Animator animator) {
                C89219l.m154719c(animator, "");
            }

            public C56065a(C56064d dVar) {
                this.f127862a = dVar;
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154719c(animator, "");
                this.f127862a.f127861a.f127844d.f127624a.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$g */
    static final class C56068g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C56055a f127865a;

        static {
            Covode.recordClassIndex(65865);
        }

        C56068g(C56055a aVar) {
            this.f127865a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f127865a.f127844d.f127624a.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f127865a.f127844d.f127624a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo92913a(Collection<? extends IMContact> collection) {
        C89219l.m154721d(collection, "");
        mo92916b().mo92924d();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            mo92916b().mo92921a(it.next(), true);
        }
        m101938g();
    }

    /* renamed from: a */
    public final boolean mo92915a(boolean z) {
        if (this.f127842b == z) {
            return false;
        }
        this.f127842b = z;
        this.f127844d.f127625b.setChecked(this.f127842b);
        this.f127850k.mo92816a(this.f127842b);
        return true;
    }

    /* renamed from: a */
    public final boolean mo92914a(AbstractC89172b<? super C19638h, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        if (!C56201b.m102110a()) {
            C56244a.m102191c("CreateGroupChatWidget", "group chat not supported");
            mo92918d();
        } else if (this.f127843c) {
            C56244a.m102191c("CreateGroupChatWidget", "is requesting");
        } else {
            C56058b b = mo92916b();
            if (b.mo92920a().isEmpty() && b.mo92922b().isEmpty() && b.mo92923c().isEmpty()) {
                C56244a.m102191c("CreateGroupChatWidget", "empty contact list");
            } else if (mo92916b().mo92925e()) {
                C56244a.m102191c("CreateGroupChatWidget", "contact list size is less than 2");
            } else if (!mo92916b().mo92926f()) {
                C56244a.m102191c("CreateGroupChatWidget", "contact list contains group chat or single-follow user");
            } else {
                this.f127843c = true;
                C55357e.C55358a.m101168a();
                C55357e.m101166a(mo92916b().mo92928h(), bVar);
                C54603a.m100106a(mo92916b().mo92928h());
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo92912a(IMContact iMContact, boolean z) {
        C89219l.m154721d(iMContact, "");
        mo92916b().mo92921a(iMContact, z);
        m101938g();
    }

    public /* synthetic */ C56055a(C55967b bVar, SharePackage sharePackage, AbstractC55948b bVar2) {
        this(bVar, sharePackage, bVar2, false);
    }

    public C56055a(C55967b bVar, SharePackage sharePackage, AbstractC55948b bVar2, boolean z) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f127844d = bVar;
        this.f127849j = sharePackage;
        this.f127850k = bVar2;
        this.f127851l = z;
        this.f127845f = C89250i.m154773a((AbstractC89171a) C56066e.f127863a);
        this.f127841a = new C56068g(this);
        this.f127846g = C89250i.m154773a((AbstractC89171a) new C56063c(this));
        this.f127847h = C89250i.m154773a((AbstractC89171a) new C56064d(this));
        this.f127848i = C89250i.m154773a((AbstractC89171a) C56067f.f127864a);
        C55173ae.m100882a(bVar.f127624a);
        bVar.f127625b.setClickable(false);
        bVar.f127624a.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget.C56055a.View$OnClickListenerC560561 */

            /* renamed from: a */
            final /* synthetic */ C56055a f127852a;

            static {
                Covode.recordClassIndex(65853);
            }

            {
                this.f127852a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C56055a aVar = this.f127852a;
                aVar.mo92915a(!aVar.f127842b);
            }
        });
        C54603a.m100103a("share");
    }
}
