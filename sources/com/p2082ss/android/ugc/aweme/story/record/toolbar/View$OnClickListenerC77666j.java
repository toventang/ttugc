package com.p2082ss.android.ugc.aweme.story.record.toolbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.story.record.p4062b.C77487d;
import com.p2082ss.android.ugc.aweme.story.record.toolbar.StoryRecordToolbarViewModel;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.j */
public final class View$OnClickListenerC77666j extends AbstractC22219j implements View.OnClickListener, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f174172a = {new C89232y(View$OnClickListenerC77666j.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};

    /* renamed from: f */
    public static final C77669b f174173f = new C77669b((byte) 0);

    /* renamed from: b */
    final AbstractC89248d f174174b = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: c */
    public ImageView f174175c;

    /* renamed from: d */
    ImageView f174176d;

    /* renamed from: e */
    ImageView f174177e;

    /* renamed from: g */
    private final AbstractC89244h f174178g;

    /* renamed from: h */
    private ImageView f174179h;

    /* renamed from: i */
    private TextView f174180i;

    /* renamed from: j */
    private boolean f174181j;

    /* renamed from: k */
    private final float f174182k;

    /* renamed from: l */
    private AnimatorSet f174183l;

    /* renamed from: t */
    private final C21582f f174184t;

    static {
        Covode.recordClassIndex(90707);
    }

    /* renamed from: b */
    private final StoryRecordToolbarViewModel m135651b() {
        return (StoryRecordToolbarViewModel) this.f174178g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.j$b */
    public static final class C77669b {
        static {
            Covode.recordClassIndex(90710);
        }

        private C77669b() {
        }

        public /* synthetic */ C77669b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f174184t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.j$d */
    public static final class RunnableC77671d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC77666j f174189a;

        /* renamed from: b */
        final /* synthetic */ boolean f174190b;

        static {
            Covode.recordClassIndex(90712);
        }

        RunnableC77671d(View$OnClickListenerC77666j jVar, boolean z) {
            this.f174189a = jVar;
            this.f174190b = z;
        }

        public final void run() {
            ImageView imageView = this.f174189a.f174175c;
            if (imageView == null) {
                C89219l.m154710a("flashButton");
            }
            imageView.setEnabled(this.f174190b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.j$a */
    public static final class C77667a extends AbstractC89220m implements AbstractC89171a<StoryRecordToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f174185a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f174186b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f174187c;

        static {
            Covode.recordClassIndex(90708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77667a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f174185a = jVar;
            this.f174186b = cVar;
            this.f174187c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.story.record.toolbar.StoryRecordToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.record.toolbar.StoryRecordToolbarViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.scene.j r0 = r3.f174185a
                android.app.Activity r1 = r0.mo36486t()
                java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                java.util.Objects.requireNonNull(r1, r0)
                androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                com.ss.android.ugc.aweme.story.record.toolbar.j$a$1 r0 = new com.ss.android.ugc.aweme.story.record.toolbar.j$a$1
                r0.<init>()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r3.f174187c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                h.k.c r0 = r3.f174186b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m135658xb01f5db0(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.record.toolbar.View$OnClickListenerC77666j.C77667a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_story_record_toolbar_StoryRecordToolbarScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m135658xb01f5db0(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: a */
    public final void mo121177a() {
        int i;
        this.f174181j = C77487d.m135488b();
        ImageView imageView = this.f174176d;
        if (imageView == null) {
            C89219l.m154710a("beautyButton");
        }
        if (this.f174181j) {
            i = 2131233940;
        } else {
            i = 2131233939;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.j$c */
    public static final class C77670c extends AbstractView$OnClickListenerC81441k {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC77666j f174188a;

        static {
            Covode.recordClassIndex(90711);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77670c(View$OnClickListenerC77666j jVar) {
            super(600, false, 2);
            this.f174188a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
        /* renamed from: a */
        public final void mo78773a(View view) {
            C89219l.m154721d(view, "");
            this.f174188a.onClick(view);
        }
    }

    /* renamed from: b */
    public final void mo121180b(boolean z) {
        ImageView imageView = this.f174179h;
        if (imageView == null) {
            C89219l.m154710a("switchButton");
        }
        imageView.setEnabled(z);
    }

    public View$OnClickListenerC77666j(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f174184t = fVar;
        AbstractC89277c a = C89204ab.m154669a(StoryRecordToolbarViewModel.class);
        this.f174178g = C89250i.m154773a((AbstractC89171a) new C77667a(this, a, a));
        this.f174182k = 0.34f;
    }

    /* renamed from: a */
    public final void mo121178a(boolean z) {
        int i;
        ImageView imageView = this.f174175c;
        if (imageView == null) {
            C89219l.m154710a("flashButton");
        }
        if (z) {
            i = 2131233943;
        } else {
            i = 2131233942;
        }
        imageView.setImageResource(i);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.pf);
        C89219l.m154716b(c, "");
        ImageView imageView = (ImageView) c;
        this.f174177e = imageView;
        if (imageView == null) {
            C89219l.m154710a("backButton");
        }
        imageView.setOnClickListener(new C77670c(this));
        View c2 = mo36475c(R.id.b5t);
        C89219l.m154716b(c2, "");
        ImageView imageView2 = (ImageView) c2;
        this.f174175c = imageView2;
        if (imageView2 == null) {
            C89219l.m154710a("flashButton");
        }
        imageView2.setOnClickListener(this);
        View c3 = mo36475c(R.id.rc);
        C89219l.m154716b(c3, "");
        ImageView imageView3 = (ImageView) c3;
        this.f174176d = imageView3;
        if (imageView3 == null) {
            C89219l.m154710a("beautyButton");
        }
        imageView3.setOnClickListener(this);
        View c4 = mo36475c(R.id.z2);
        C89219l.m154716b(c4, "");
        ImageView imageView4 = (ImageView) c4;
        this.f174179h = imageView4;
        if (imageView4 == null) {
            C89219l.m154710a("switchButton");
        }
        imageView4.setOnClickListener(this);
        View c5 = mo36475c(R.id.esw);
        C89219l.m154716b(c5, "");
        this.f174180i = (TextView) c5;
        Integer a = new C77487d().mo115058a();
        if (a == null || a.intValue() != 0) {
            mo121179a(false, false);
        }
        mo121177a();
    }

    public final void onClick(View view) {
        Integer valueOf;
        int i;
        int i2;
        ClickAgent.onClick(view);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.pf) {
                m135651b().mo33689c(StoryRecordToolbarViewModel.C77636a.f174131a);
            } else if (valueOf.intValue() == R.id.b5t) {
                m135651b().mo33689c(StoryRecordToolbarViewModel.C77638c.f174133a);
            } else if (valueOf.intValue() == R.id.rc) {
                this.f174181j = !this.f174181j;
                m135651b().mo33689c(new StoryRecordToolbarViewModel.C77637b(this.f174181j));
                ImageView imageView = this.f174176d;
                if (imageView == null) {
                    C89219l.m154710a("beautyButton");
                }
                if (this.f174181j) {
                    i = 2131233940;
                } else {
                    i = 2131233939;
                }
                imageView.setImageResource(i);
                TextView textView = this.f174180i;
                if (textView == null) {
                    C89219l.m154710a("tvBeautyHint");
                }
                Context s = mo36485s();
                if (this.f174181j) {
                    i2 = R.string.a3q;
                } else {
                    i2 = R.string.a3k;
                }
                textView.setText(s.getText(i2));
                TextView textView2 = this.f174180i;
                if (textView2 == null) {
                    C89219l.m154710a("tvBeautyHint");
                }
                textView2.setAlpha(0.0f);
                ImageView imageView2 = this.f174176d;
                if (imageView2 == null) {
                    C89219l.m154710a("beautyButton");
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 0.9f, 1.0f);
                ofFloat.setDuration(100L);
                ImageView imageView3 = this.f174176d;
                if (imageView3 == null) {
                    C89219l.m154710a("beautyButton");
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView3, "scaleY", 1.0f, 0.9f, 1.0f);
                ofFloat2.setDuration(100L);
                TextView textView3 = this.f174180i;
                if (textView3 == null) {
                    C89219l.m154710a("tvBeautyHint");
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView3, "alpha", 0.0f, 1.0f);
                ofFloat3.setDuration(100L);
                TextView textView4 = this.f174180i;
                if (textView4 == null) {
                    C89219l.m154710a("tvBeautyHint");
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView4, "alpha", 1.0f, 0.0f);
                ofFloat4.setStartDelay(600);
                ofFloat4.setDuration(100L);
                AnimatorSet animatorSet = this.f174183l;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                animatorSet2.start();
                this.f174183l = animatorSet2;
                C63253l.f143623a.mo73323s().mo93855b("key_story_default_beauty", this.f174181j);
            } else if (valueOf.intValue() == R.id.z2) {
                m135651b().mo33689c(StoryRecordToolbarViewModel.C77639d.f174134a);
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b26, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public final void mo121179a(boolean z, boolean z2) {
        float f = 1.0f;
        if (z2) {
            if (!z) {
                mo121178a(false);
            }
            ImageView imageView = this.f174175c;
            if (imageView == null) {
                C89219l.m154710a("flashButton");
            }
            ViewPropertyAnimator animate = imageView.animate();
            if (!z) {
                f = this.f174182k;
            }
            animate.alpha(f).setDuration(100).withEndAction(new RunnableC77671d(this, z));
            return;
        }
        ImageView imageView2 = this.f174175c;
        if (imageView2 == null) {
            C89219l.m154710a("flashButton");
        }
        if (!z) {
            f = this.f174182k;
        }
        imageView2.setAlpha(f);
        ImageView imageView3 = this.f174175c;
        if (imageView3 == null) {
            C89219l.m154710a("flashButton");
        }
        imageView3.setEnabled(z);
    }
}
