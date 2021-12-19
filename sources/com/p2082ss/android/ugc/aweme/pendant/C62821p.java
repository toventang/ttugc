package com.p2082ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.pendant.p */
public final class C62821p extends FrameLayout implements AbstractC62770d, AbstractC62809n {

    /* renamed from: a */
    public static final C62822a f142451a = new C62822a((byte) 0);

    /* renamed from: b */
    private final View f142452b;

    /* renamed from: c */
    private final FrameLayout f142453c;

    /* renamed from: d */
    private final SmartImageView f142454d;

    /* renamed from: e */
    private final SmartImageView f142455e;

    /* renamed from: f */
    private final OptimizedLottieAnimationView f142456f;

    /* renamed from: g */
    private final OptimizedLottieAnimationView f142457g;

    /* renamed from: h */
    private final ImageView f142458h;

    /* renamed from: i */
    private final RelativeLayout f142459i;

    /* renamed from: j */
    private AbstractC62753a f142460j;

    /* renamed from: k */
    private final AbstractC89171a<C89391z> f142461k;

    static {
        Covode.recordClassIndex(73644);
    }

    private final void setPendantType(int i) {
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.p$a */
    public static final class C62822a {
        static {
            Covode.recordClassIndex(73645);
        }

        private C62822a() {
        }

        public /* synthetic */ C62822a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.p$b */
    static final class C62823b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C62823b f142462a = new C62823b();

        static {
            Covode.recordClassIndex(73646);
        }

        C62823b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    public final FrameLayout getContent() {
        return this.f142453c;
    }

    /* renamed from: a */
    public final void mo100772a() {
        AbstractC62753a aVar = this.f142460j;
        if (aVar != null) {
            aVar.mo100713a();
        }
    }

    /* renamed from: b */
    public final void mo100773b() {
        AbstractC62753a aVar = this.f142460j;
        if (aVar != null) {
            aVar.mo100716b();
        }
    }

    /* renamed from: c */
    public final void mo100774c() {
        AbstractC62753a aVar = this.f142460j;
        if (aVar != null) {
            aVar.mo100718d();
        }
    }

    private final boolean getCollapsing() {
        AbstractC62753a aVar = this.f142460j;
        if (aVar != null) {
            return aVar.f142253k;
        }
        return false;
    }

    public final boolean getClosed() {
        AbstractC62753a aVar = this.f142460j;
        if (aVar != null) {
            return aVar.f142249g;
        }
        return false;
    }

    public final boolean getCollapsed() {
        AbstractC62753a aVar = this.f142460j;
        if (aVar != null) {
            return aVar.f142250h;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62770d
    public final boolean getTimeLimitState() {
        AbstractC62753a aVar = this.f142460j;
        if (!(aVar instanceof AbstractC62770d)) {
            aVar = null;
        }
        AbstractC62770d dVar = (AbstractC62770d) aVar;
        if (dVar != null) {
            return dVar.getTimeLimitState();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62809n
    /* renamed from: a */
    public final void mo100758a(C62802k kVar) {
        C89219l.m154721d(kVar, "");
        AbstractC62753a aVar = this.f142460j;
        if (aVar != null) {
            aVar.mo100758a(kVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62770d
    public final void setTimeLimitState(boolean z) {
        AbstractC62753a aVar = this.f142460j;
        if (!(aVar instanceof AbstractC62770d)) {
            aVar = null;
        }
        AbstractC62770d dVar = (AbstractC62770d) aVar;
        if (dVar != null) {
            dVar.setTimeLimitState(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62809n
    /* renamed from: a */
    public final void mo100714a(AbstractC89171a<C89391z> aVar) {
        AbstractC62753a aVar2 = this.f142460j;
        if (aVar2 != null) {
            aVar2.mo100714a(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C62821p(int i, C62795i iVar, Context context) {
        super(context, null, 0);
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(context, "");
        AbstractC62753a aVar = null;
        MethodCollector.m26663i(8188);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.mn, this, true);
        this.f142452b = a;
        FrameLayout frameLayout = (FrameLayout) a.findViewById(R.id.d0_);
        this.f142453c = frameLayout;
        SmartImageView smartImageView = (SmartImageView) frameLayout.findViewById(R.id.sd);
        this.f142454d = smartImageView;
        SmartImageView smartImageView2 = (SmartImageView) frameLayout.findViewById(R.id.e35);
        this.f142455e = smartImageView2;
        OptimizedLottieAnimationView optimizedLottieAnimationView = (OptimizedLottieAnimationView) frameLayout.findViewById(R.id.se);
        this.f142456f = optimizedLottieAnimationView;
        OptimizedLottieAnimationView optimizedLottieAnimationView2 = (OptimizedLottieAnimationView) frameLayout.findViewById(R.id.e38);
        this.f142457g = optimizedLottieAnimationView2;
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.a6z);
        this.f142458h = imageView;
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.a1g);
        this.f142459i = relativeLayout;
        C62823b bVar = C62823b.f142462a;
        this.f142461k = bVar;
        setPendantType(i);
        iVar.f142370h = bVar;
        if (i == 0) {
            C89219l.m154716b(frameLayout, "");
            C89219l.m154716b(smartImageView, "");
            C89219l.m154716b(smartImageView2, "");
            C89219l.m154716b(imageView, "");
            C89219l.m154716b(relativeLayout, "");
            aVar = new C62805m(context, frameLayout, smartImageView, smartImageView2, imageView, relativeLayout, iVar);
        } else if (i == 1) {
            C89219l.m154716b(frameLayout, "");
            C89219l.m154716b(smartImageView, "");
            C89219l.m154716b(smartImageView2, "");
            C89219l.m154716b(imageView, "");
            C89219l.m154716b(relativeLayout, "");
            aVar = new C62824q(context, frameLayout, smartImageView, smartImageView2, imageView, relativeLayout, iVar);
        } else if (i == 2) {
            C89219l.m154716b(frameLayout, "");
            C89219l.m154716b(optimizedLottieAnimationView, "");
            C89219l.m154716b(optimizedLottieAnimationView2, "");
            C89219l.m154716b(imageView, "");
            C89219l.m154716b(relativeLayout, "");
            aVar = new C62780g(context, frameLayout, optimizedLottieAnimationView, optimizedLottieAnimationView2, imageView, relativeLayout, iVar);
        }
        this.f142460j = aVar;
        MethodCollector.m26664o(8188);
    }

    public /* synthetic */ C62821p(int i, C62795i iVar, Context context, byte b) {
        this(i, iVar, context);
    }
}
