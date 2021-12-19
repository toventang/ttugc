package com.bytedance.android.livesdk.container.p513j;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.C6887ax;
import com.bytedance.android.livesdk.browser.C6952c;
import com.bytedance.android.livesdk.browser.C7021g;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7186n;
import com.bytedance.android.livesdk.container.AbstractC8210a;
import com.bytedance.android.livesdk.container.config.base.CardConfig;
import com.bytedance.android.livesdk.container.p507d.EnumC8236a;
import com.bytedance.android.livesdk.container.p512i.C8250a;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardConfig;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.j.c */
public final class C8273c extends FrameLayout implements AbstractC8210a {

    /* renamed from: e */
    public static final C8274a f20517e = new C8274a((byte) 0);

    /* renamed from: b */
    public CardConfig f20518b;

    /* renamed from: c */
    public boolean f20519c;

    /* renamed from: d */
    public boolean f20520d;

    /* renamed from: f */
    private final AbstractC89244h f20521f;

    /* renamed from: g */
    private final C8270b f20522g;

    /* renamed from: h */
    private boolean f20523h;

    static {
        Covode.recordClassIndex(9108);
    }

    public final String getContainerId() {
        return (String) this.f20521f.getValue();
    }

    public final Fragment getFragment() {
        return null;
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.c$a */
    public static final class C8274a {
        static {
            Covode.recordClassIndex(9109);
        }

        private C8274a() {
        }

        public /* synthetic */ C8274a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C8273c m16428a(Context context, Uri uri, boolean z) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(uri, "");
            if (C8250a.f20476a.contains(uri.getHost())) {
                uri = uri.buildUpon().appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis())).build();
            }
            CardConfig cardConfig = new CardConfig(uri);
            C8273c cVar = new C8273c(context, (byte) 0);
            cVar.setConfig(cardConfig);
            if (z) {
                cVar.mo14606a();
            }
            C7021g gVar = C7021g.C7023b.f17618a;
            String containerId = cVar.getContainerId();
            C89219l.m154721d(containerId, "");
            C89219l.m154721d(cVar, "");
            gVar.f17617a.put(containerId, cVar);
            return cVar;
        }
    }

    public final C8270b getHybridView() {
        return this.f20522g;
    }

    public final boolean getInitFinished() {
        return this.f20523h;
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8212b
    public final String getHybridContainerId() {
        return getContainerId();
    }

    public final CardConfig getConfig() {
        CardConfig cardConfig = this.f20518b;
        if (cardConfig == null) {
            C89219l.m154710a("config");
        }
        return cardConfig;
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.c$b */
    static final class C8275b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C8273c f20524a;

        static {
            Covode.recordClassIndex(9110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8275b(C8273c cVar) {
            super(0);
            this.f20524a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (this.f20524a.getConfig().getEngineType() == EnumC8236a.LYNX) {
                return C6952c.m14838b();
            }
            return C6952c.m14837a();
        }
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8212b
    /* renamed from: b */
    public final void mo14465b() {
        DataChannelGlobal.f42558d.mo28328c(C6887ax.class, getContainerId());
        this.f20522g.mo14482c();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f20519c) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) C3966y.m9653a((float) LynxCardConfig.INSTANCE.getItemWidth()));
            ofFloat.setDuration(200L);
            ofFloat.addListener(new C8276c(this));
            ofFloat.addUpdateListener(new C8277d(this));
            ofFloat.start();
            return;
        }
        this.f20520d = true;
    }

    /* renamed from: a */
    public final void mo14606a() {
        C18364w wVar;
        C8270b bVar = this.f20522g;
        CardConfig cardConfig = this.f20518b;
        if (cardConfig == null) {
            C89219l.m154710a("config");
        }
        bVar.setConfig(cardConfig);
        bVar.setContainerId(getContainerId());
        this.f20522g.mo14480a();
        this.f20522g.mo14481b();
        C8270b bVar2 = this.f20522g;
        Context context = getContext();
        C89219l.m154716b(context, "");
        bVar2.setBackgroundColor(context.getResources().getColor(R.color.c9));
        C7038b bVar3 = this.f20522g.getComponent().f20419a;
        if (!(bVar3 == null || (wVar = bVar3.f17644b) == null)) {
            wVar.mo29405b("close", new C7186n(this));
        }
        addView(this.f20522g);
        this.f20523h = true;
    }

    public final void setAnimatorFinished(boolean z) {
        this.f20520d = z;
    }

    public final void setInitFinished(boolean z) {
        this.f20523h = z;
    }

    public final void setPreview(boolean z) {
        this.f20519c = z;
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.c$c */
    public static final class C8276c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C8273c f20525a;

        static {
            Covode.recordClassIndex(9111);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C8276c(C8273c cVar) {
            this.f20525a = cVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f20525a.setAnimatorFinished(true);
        }

        public final void onAnimationStart(Animator animator) {
            this.f20525a.setAnimatorFinished(false);
        }
    }

    public final void setConfig(CardConfig cardConfig) {
        C89219l.m154721d(cardConfig, "");
        this.f20518b = cardConfig;
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.c$d */
    static final class C8277d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C8273c f20526a;

        static {
            Covode.recordClassIndex(9112);
        }

        C8277d(C8273c cVar) {
            this.f20526a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8273c cVar = this.f20526a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) ((Float) animatedValue).floatValue(), C3966y.m9653a((float) LynxCardConfig.INSTANCE.getItemHeight()));
            layoutParams.setMarginEnd(C3966y.m9653a((float) LynxCardConfig.INSTANCE.getItemSpacing()));
            cVar.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8273c(Context context) {
        super(context, null);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8565);
        this.f20521f = C11831d.m20835a(new C8275b(this));
        this.f20522g = new C8270b(context);
        this.f20520d = true;
        MethodCollector.m26664o(8565);
    }

    public /* synthetic */ C8273c(Context context, byte b) {
        this(context);
    }
}
