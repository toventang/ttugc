package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SayHelloContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55190b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56203d;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.c */
public final class C53850c extends AbstractC53845a {

    /* renamed from: g */
    public View f123483g;

    /* renamed from: h */
    public View f123484h;

    /* renamed from: i */
    public View f123485i;

    /* renamed from: j */
    private View f123486j;

    /* renamed from: k */
    private RemoteImageView f123487k;

    /* renamed from: l */
    private RemoteImageView f123488l;

    /* renamed from: m */
    private RemoteImageView f123489m;

    /* renamed from: n */
    private Animation f123490n;

    /* renamed from: o */
    private final C53851a f123491o = new C53851a(this);

    static {
        Covode.recordClassIndex(63510);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.AbstractC53845a
    /* renamed from: b */
    public final List<C46534a> mo90994b() {
        return mo90989a().getEmojiList();
    }

    /* renamed from: e */
    public final void mo90998e() {
        View view = this.f123483g;
        if (view == null) {
            C89219l.m154710a("reloadLayout");
        }
        view.setVisibility(8);
        View view2 = this.f123484h;
        if (view2 == null) {
            C89219l.m154710a("loadingIv");
        }
        view2.setVisibility(0);
        View view3 = this.f123485i;
        if (view3 == null) {
            C89219l.m154710a("emojiLayout");
        }
        view3.setVisibility(0);
        View view4 = this.f123484h;
        if (view4 == null) {
            C89219l.m154710a("loadingIv");
        }
        Animation animation = this.f123490n;
        if (animation == null) {
            C89219l.m154710a("animation");
        }
        view4.startAnimation(animation);
        m99100f();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.c$a */
    public static final class C53851a implements AbstractC55220o {

        /* renamed from: a */
        final /* synthetic */ C53850c f123492a;

        /* renamed from: b */
        private int f123493b;

        /* renamed from: c */
        private int f123494c;

        static {
            Covode.recordClassIndex(63511);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final void mo90999a(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final boolean mo91002a() {
            return true;
        }

        /* renamed from: b */
        private final void m99106b() {
            if ((this.f123494c == 3 && !C56203d.m102114c()) || (this.f123494c == 1 && C56203d.m102114c())) {
                C53850c.m99097a(this.f123492a).setVisibility(8);
                C55190b.m100903a(C53850c.m99097a(this.f123492a));
                if (this.f123493b != this.f123494c) {
                    C53850c.m99098b(this.f123492a).setVisibility(8);
                    C53850c.m99099c(this.f123492a).setVisibility(0);
                } else {
                    C53850c.m99098b(this.f123492a).setVisibility(0);
                    C53850c.m99099c(this.f123492a).setVisibility(8);
                }
                this.f123494c = 0;
                this.f123493b = 0;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53851a(C53850c cVar) {
            this.f123492a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final void mo91001a(String str, Throwable th) {
            this.f123494c++;
            m99106b();
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final void mo91000a(String str, AbstractC24457f fVar, Animatable animatable) {
            this.f123494c++;
            this.f123493b++;
            m99106b();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    /* renamed from: f */
    private final void m99100f() {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.C53850c.m99100f():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.AbstractC53845a
    /* renamed from: c */
    public final void mo90995c() {
        super.mo90995c();
        this.f123486j = mo90993b(R.id.c54);
        this.f123484h = mo90993b(R.id.cfb);
        this.f123483g = mo90993b(R.id.brj);
        this.f123485i = mo90993b(R.id.bri);
        this.f123487k = (RemoteImageView) mo90993b(R.id.acr);
        this.f123488l = (RemoteImageView) mo90993b(R.id.acs);
        this.f123489m = (RemoteImageView) mo90993b(R.id.act);
        this.f123490n = C55190b.m100901a(400, (Animation.AnimationListener) null);
        View view = this.f123484h;
        if (view == null) {
            C89219l.m154710a("loadingIv");
        }
        Animation animation = this.f123490n;
        if (animation == null) {
            C89219l.m154710a("animation");
        }
        view.startAnimation(animation);
        View view2 = this.f123483g;
        if (view2 == null) {
            C89219l.m154710a("reloadLayout");
        }
        view2.setOnClickListener(new View$OnClickListenerC53852b(this));
        RemoteImageView remoteImageView = this.f123487k;
        if (remoteImageView == null) {
            C89219l.m154710a("emojiIvFirst");
        }
        remoteImageView.setOnClickListener(new View$OnClickListenerC53853c(this));
        RemoteImageView remoteImageView2 = this.f123488l;
        if (remoteImageView2 == null) {
            C89219l.m154710a("emojiIvSecond");
        }
        remoteImageView2.setOnClickListener(new View$OnClickListenerC53854d(this));
        RemoteImageView remoteImageView3 = this.f123489m;
        if (remoteImageView3 == null) {
            C89219l.m154710a("emojiIvThird");
        }
        remoteImageView3.setOnClickListener(new View$OnClickListenerC53855e(this));
        if (C56203d.m102114c()) {
            RemoteImageView remoteImageView4 = this.f123487k;
            if (remoteImageView4 == null) {
                C89219l.m154710a("emojiIvFirst");
            }
            remoteImageView4.setVisibility(8);
            RemoteImageView remoteImageView5 = this.f123488l;
            if (remoteImageView5 == null) {
                C89219l.m154710a("emojiIvSecond");
            }
            remoteImageView5.setVisibility(8);
            RemoteImageView remoteImageView6 = this.f123489m;
            if (remoteImageView6 == null) {
                C89219l.m154710a("emojiIvThird");
            }
            ViewGroup.LayoutParams layoutParams = remoteImageView6.getLayoutParams();
            if (layoutParams != null) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 120.0f, system.getDisplayMetrics()));
                remoteImageView6.setLayoutParams(layoutParams);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.c$b */
    static final class View$OnClickListenerC53852b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C53850c f123495a;

        static {
            Covode.recordClassIndex(63512);
        }

        View$OnClickListenerC53852b(C53850c cVar) {
            this.f123495a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f123495a.mo90998e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.c$c */
    static final class View$OnClickListenerC53853c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C53850c f123496a;

        static {
            Covode.recordClassIndex(63513);
        }

        View$OnClickListenerC53853c(C53850c cVar) {
            this.f123496a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f123496a.mo90990a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.c$d */
    static final class View$OnClickListenerC53854d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C53850c f123497a;

        static {
            Covode.recordClassIndex(63514);
        }

        View$OnClickListenerC53854d(C53850c cVar) {
            this.f123497a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f123497a.mo90990a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.c$e */
    static final class View$OnClickListenerC53855e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C53850c f123498a;

        static {
            Covode.recordClassIndex(63515);
        }

        View$OnClickListenerC53855e(C53850c cVar) {
            this.f123498a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f123498a.mo90990a(2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53850c(C53856d dVar) {
        super(dVar);
        C89219l.m154721d(dVar, "");
    }

    /* renamed from: a */
    public static final /* synthetic */ View m99097a(C53850c cVar) {
        View view = cVar.f123484h;
        if (view == null) {
            C89219l.m154710a("loadingIv");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m99098b(C53850c cVar) {
        View view = cVar.f123485i;
        if (view == null) {
            C89219l.m154710a("emojiLayout");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m99099c(C53850c cVar) {
        View view = cVar.f123483g;
        if (view == null) {
            C89219l.m154710a("reloadLayout");
        }
        return view;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.AbstractC53845a
    /* renamed from: a */
    public final void mo90992a(boolean z) {
        int i;
        View view = this.f123486j;
        if (view == null) {
            C89219l.m154710a("rootLayout");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.AbstractC53845a
    /* renamed from: a */
    public final void mo90991a(C19538ai aiVar, C19538ai aiVar2, SayHelloContent sayHelloContent, int i, boolean z) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(sayHelloContent, "");
        super.mo90991a(aiVar, aiVar2, sayHelloContent, i, z);
        mo90992a(true);
        m99100f();
    }
}
