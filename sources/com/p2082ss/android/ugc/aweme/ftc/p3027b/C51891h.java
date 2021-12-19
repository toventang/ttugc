package com.p2082ss.android.ugc.aweme.ftc.p3027b;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2730de.C40977l;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.shortvideo.C69837ao;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.b.h */
public final class C51891h extends AbstractC22219j implements AbstractC20382b {

    /* renamed from: j */
    public static final C51892a f119568j = new C51892a((byte) 0);

    /* renamed from: a */
    AbstractC51911i f119569a;

    /* renamed from: b */
    public AbstractC23317a f119570b;

    /* renamed from: c */
    ShortVideoContextViewModel f119571c;

    /* renamed from: d */
    public ImageView f119572d;

    /* renamed from: e */
    public TextView f119573e;

    /* renamed from: f */
    public RelativeLayout f119574f;

    /* renamed from: g */
    boolean f119575g;

    /* renamed from: h */
    boolean f119576h;

    /* renamed from: i */
    public final C51873c f119577i;

    /* renamed from: k */
    private boolean f119578k = true;

    /* renamed from: l */
    private final AbstractC89244h f119579l = C89250i.m154773a((AbstractC89171a) new C51910q(this));

    /* renamed from: t */
    private final C2560h<Boolean> f119580t;

    static {
        Covode.recordClassIndex(61260);
    }

    /* renamed from: a */
    public final SafeHandler mo87600a() {
        return (SafeHandler) this.f119579l.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$a */
    public static final class C51892a {
        static {
            Covode.recordClassIndex(61261);
        }

        private C51892a() {
        }

        public /* synthetic */ C51892a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$q */
    static final class C51910q extends AbstractC89220m implements AbstractC89171a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C51891h f119600a;

        static {
            Covode.recordClassIndex(61279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51910q(C51891h hVar) {
            super(0);
            this.f119600a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.f119600a);
        }
    }

    /* renamed from: C */
    public final void mo87599C() {
        AbstractC23317a aVar = this.f119570b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$c */
    static final class RunnableC51894c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C51891h f119582a;

        static {
            Covode.recordClassIndex(61263);
        }

        RunnableC51894c(C51891h hVar) {
            this.f119582a = hVar;
        }

        public final void run() {
            C51891h.m96590a(this.f119582a).requestFocus();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$o */
    public static final class RunnableC51908o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C51891h f119597a;

        static {
            Covode.recordClassIndex(61277);
        }

        RunnableC51908o(C51891h hVar) {
            this.f119597a = hVar;
        }

        public final void run() {
            C51891h.m96590a(this.f119597a).requestFocus();
            C51891h.m96590a(this.f119597a).setSelected(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final View mo87602b() {
        TextView textView = this.f119573e;
        if (textView == null) {
            C89219l.m154710a("tvChooseMusic");
        }
        return textView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo87603d() {
        if (this.f119569a == null) {
            Activity activity = this.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.f119569a = new C51875e((ActivityC0945e) activity);
        }
    }

    /* renamed from: D */
    private final boolean m96589D() {
        ShortVideoContextViewModel shortVideoContextViewModel = this.f119571c;
        if (shortVideoContextViewModel == null) {
            C89219l.m154710a("shortVideoContextViewModel");
        }
        if (shortVideoContextViewModel == null) {
            return false;
        }
        ShortVideoContextViewModel shortVideoContextViewModel2 = this.f119571c;
        if (shortVideoContextViewModel2 == null) {
            C89219l.m154710a("shortVideoContextViewModel");
        }
        if (shortVideoContextViewModel2.f155842a.f155778aL) {
            ShortVideoContextViewModel shortVideoContextViewModel3 = this.f119571c;
            if (shortVideoContextViewModel3 == null) {
                C89219l.m154710a("shortVideoContextViewModel");
            }
            if (shortVideoContextViewModel3.f155842a.f155752M) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$p */
    static final class RunnableC51909p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C51891h f119598a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f119599b;

        static {
            Covode.recordClassIndex(61278);
        }

        RunnableC51909p(C51891h hVar, C89233z.C89238e eVar) {
            this.f119598a = hVar;
            this.f119599b = eVar;
        }

        public final void run() {
            if (this.f119598a.f52549m != null) {
                Activity activity = this.f119598a.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                if (!activity.isFinishing() && this.f119599b.element != null) {
                    this.f119598a.f119570b = this.f119599b.element.mo38041b(C51891h.m96590a(this.f119598a)).mo38034a(EnumC23352h.BOTTOM).mo38012d();
                    AbstractC23317a aVar = this.f119598a.f119570b;
                    if (aVar != null) {
                        aVar.mo38001a();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$k */
    static final class C51904k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51891h f119592a;

        static {
            Covode.recordClassIndex(61273);
        }

        C51904k(C51891h hVar) {
            this.f119592a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C51891h hVar = this.f119592a;
            hVar.mo87603d();
            AbstractC51911i iVar = hVar.f119569a;
            if (iVar != null) {
                iVar.mo87585a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m96590a(C51891h hVar) {
        TextView textView = hVar.f119573e;
        if (textView == null) {
            C89219l.m154710a("tvChooseMusic");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ RelativeLayout m96591b(C51891h hVar) {
        RelativeLayout relativeLayout = hVar.f119574f;
        if (relativeLayout == null) {
            C89219l.m154710a("chooseMusicContainer");
        }
        return relativeLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m96592c(C51891h hVar) {
        ImageView imageView = hVar.f119572d;
        if (imageView == null) {
            C89219l.m154710a("ivChooseMusic");
        }
        return imageView;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$d */
    static final class C51895d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51891h f119583a;

        static {
            Covode.recordClassIndex(61264);
        }

        C51895d(C51891h hVar) {
            this.f119583a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C51891h hVar = this.f119583a;
            C89219l.m154716b(bool, "");
            hVar.mo87601a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$l */
    static final class C51905l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51891h f119593a;

        static {
            Covode.recordClassIndex(61274);
        }

        C51905l(C51891h hVar) {
            this.f119593a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            ImageView c = C51891h.m96592c(this.f119593a);
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            c.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$f */
    static final class C51897f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51891h f119585a;

        static {
            Covode.recordClassIndex(61266);
        }

        C51897f(C51891h hVar) {
            this.f119585a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = C51891h.m96591b(this.f119585a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f119585a.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            marginLayoutParams.topMargin = C70636dh.m124833c(activity) + this.f119585a.mo36486t().getResources().getDimensionPixelSize(R.dimen.rk);
            C51891h.m96591b(this.f119585a).setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$g */
    static final class C51898g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51891h f119586a;

        static {
            Covode.recordClassIndex(61267);
        }

        C51898g(C51891h hVar) {
            this.f119586a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C51891h hVar = this.f119586a;
            C89219l.m154716b(bool, "");
            boolean booleanValue = bool.booleanValue();
            ShortVideoContextViewModel shortVideoContextViewModel = hVar.f119571c;
            if (shortVideoContextViewModel == null) {
                C89219l.m154710a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f155842a;
            if (booleanValue) {
                hVar.mo87602b().setOnClickListener(new View$OnClickListenerC51906m(hVar, shortVideoContext));
            } else {
                hVar.mo87602b().setOnClickListener(new View$OnClickListenerC51907n(shortVideoContext));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$i */
    static final class C51900i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51891h f119588a;

        static {
            Covode.recordClassIndex(61269);
        }

        C51900i(C51891h hVar) {
            this.f119588a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C51891h.m96592c(this.f119588a).setImageAlpha(255);
                C51891h.m96590a(this.f119588a).setAlpha(1.0f);
                return;
            }
            C51891h.m96592c(this.f119588a).setImageAlpha(127);
            C51891h.m96590a(this.f119588a).setAlpha(0.5f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$n */
    static final class View$OnClickListenerC51907n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f119596a;

        static {
            Covode.recordClassIndex(61276);
        }

        View$OnClickListenerC51907n(ShortVideoContext shortVideoContext) {
            this.f119596a = shortVideoContext;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("change_music_grey", new C84425b().mo129406a("creation_id", this.f119596a.f155830o).mo129406a("shoot_way", this.f119596a.f155831p).f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$h */
    static final class C51899h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51891h f119587a;

        static {
            Covode.recordClassIndex(61268);
        }

        C51899h(C51891h hVar) {
            this.f119587a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null) {
                this.f119587a.mo87599C();
                return;
            }
            C51891h hVar = this.f119587a;
            int intValue = num.intValue();
            AbstractC23317a aVar = hVar.f119570b;
            if (aVar == null || !aVar.isShowing()) {
                hVar.mo87603d();
                C89233z.C89238e eVar = new C89233z.C89238e();
                T t = null;
                if (intValue == 1) {
                    AbstractC51911i iVar = hVar.f119569a;
                    if (iVar != null) {
                        t = (T) iVar.mo87586b();
                    }
                } else {
                    AbstractC51911i iVar2 = hVar.f119569a;
                    if (iVar2 != null) {
                        t = (T) iVar2.mo87587c();
                    }
                }
                eVar.element = t;
                hVar.mo87600a().post(new RunnableC51909p(hVar, eVar));
                TextView textView = hVar.f119573e;
                if (textView == null) {
                    C89219l.m154710a("tvChooseMusic");
                }
                textView.setOnTouchListener(new View$OnTouchListenerC51893b(hVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$m */
    static final class View$OnClickListenerC51906m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51891h f119594a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f119595b;

        static {
            Covode.recordClassIndex(61275);
        }

        View$OnClickListenerC51906m(C51891h hVar, ShortVideoContext shortVideoContext) {
            this.f119594a = hVar;
            this.f119595b = shortVideoContext;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C40977l.m82500a(view, 1200)) {
                ShortVideoContext shortVideoContext = this.f119595b;
                C89219l.m154716b(shortVideoContext, "");
                if (!shortVideoContext.mo110022c()) {
                    C39162r.m79460a("change_music", new C84425b().mo129406a("creation_id", this.f119595b.f155830o).mo129406a("shoot_way", this.f119595b.f155831p).mo129403a("draft_id", this.f119595b.f155740A).mo129406a("enter_from", "video_shoot_page").mo129403a("creation_duration", this.f119595b.f155772aF).f188764a);
                    this.f119594a.f119577i.f119531k.mo6999a(C89391z.f203057a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87601a(boolean z) {
        if (m96589D()) {
            ImageView imageView = this.f119572d;
            if (imageView == null) {
                C89219l.m154710a("ivChooseMusic");
            }
            imageView.setVisibility(8);
            TextView textView = this.f119573e;
            if (textView == null) {
                C89219l.m154710a("tvChooseMusic");
            }
            textView.setVisibility(8);
        } else if (!z || !this.f119578k) {
            TextView textView2 = this.f119573e;
            if (textView2 == null) {
                C89219l.m154710a("tvChooseMusic");
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = this.f119573e;
            if (textView3 == null) {
                C89219l.m154710a("tvChooseMusic");
            }
            textView3.setVisibility(0);
            mo87600a().post(new RunnableC51908o(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$e */
    static final class C51896e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51891h f119584a;

        static {
            Covode.recordClassIndex(61265);
        }

        C51896e(C51891h hVar) {
            this.f119584a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            C51891h hVar = this.f119584a;
            ShortVideoContextViewModel shortVideoContextViewModel = hVar.f119571c;
            if (shortVideoContextViewModel == null) {
                C89219l.m154710a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f155842a;
            C89219l.m154716b(shortVideoContext, "");
            if (shortVideoContext.mo110022c()) {
                StitchParams stitchParams = shortVideoContext.f155743D.f155846a;
                if (stitchParams == null) {
                    C89219l.m154715b();
                }
                hVar.f119576h = true;
                TextView textView = hVar.f119573e;
                if (textView == null) {
                    C89219l.m154710a("tvChooseMusic");
                }
                textView.setClickable(false);
                TextView textView2 = hVar.f119573e;
                if (textView2 == null) {
                    C89219l.m154710a("tvChooseMusic");
                }
                textView2.setAlpha(0.5f);
                ImageView imageView = hVar.f119572d;
                if (imageView == null) {
                    C89219l.m154710a("ivChooseMusic");
                }
                imageView.setImageAlpha(127);
                if (!shortVideoContext.mo110025d()) {
                    hVar.f119575g = true;
                    RelativeLayout relativeLayout = hVar.f119574f;
                    if (relativeLayout == null) {
                        C89219l.m154710a("chooseMusicContainer");
                    }
                    relativeLayout.setVisibility(4);
                    return;
                }
                C69905c music = stitchParams.getMusic();
                TextView textView3 = hVar.f119573e;
                if (textView3 == null) {
                    C89219l.m154710a("tvChooseMusic");
                }
                if (music == null || (str = music.getMusicName()) == null) {
                    str = "";
                }
                textView3.setText(str);
                if (C65350at.m117036a()) {
                    ImageView imageView2 = hVar.f119572d;
                    if (imageView2 == null) {
                        C89219l.m154710a("ivChooseMusic");
                    }
                    imageView2.setImageResource(2131232533);
                    return;
                }
                ImageView imageView3 = hVar.f119572d;
                if (imageView3 == null) {
                    C89219l.m154710a("ivChooseMusic");
                }
                imageView3.setImageResource(2131232531);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$j */
    static final class C51901j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51891h f119589a;

        static {
            Covode.recordClassIndex(61270);
        }

        C51901j(C51891h hVar) {
            this.f119589a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C69905c cVar = (C69905c) obj;
            if (cVar == null) {
                C51891h.m96590a(this.f119589a).setText(R.string.ad6);
                if (C65350at.m117036a()) {
                    C51891h.m96592c(this.f119589a).setImageResource(2131232533);
                } else {
                    C51891h.m96592c(this.f119589a).setImageResource(2131232345);
                }
                this.f119589a.mo87600a().post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ftc.p3027b.C51891h.C51901j.RunnableC519021 */

                    /* renamed from: a */
                    final /* synthetic */ C51901j f119590a;

                    static {
                        Covode.recordClassIndex(61271);
                    }

                    {
                        this.f119590a = r1;
                    }

                    public final void run() {
                        C51891h.m96590a(this.f119590a.f119589a).clearFocus();
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder(cVar.getName());
            String singer = cVar.getSinger();
            if (!(singer == null || singer.length() == 0)) {
                sb.append('-');
                sb.append(cVar.getSinger());
            }
            C51891h.m96590a(this.f119589a).setText(sb);
            if (C65350at.m117036a()) {
                C51891h.m96592c(this.f119589a).setImageResource(2131232533);
            } else {
                C51891h.m96592c(this.f119589a).setImageResource(2131232531);
            }
            this.f119589a.mo87600a().post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3027b.C51891h.C51901j.RunnableC519032 */

                /* renamed from: a */
                final /* synthetic */ C51901j f119591a;

                static {
                    Covode.recordClassIndex(61272);
                }

                {
                    this.f119591a = r1;
                }

                public final void run() {
                    C51891h.m96590a(this.f119591a.f119589a).requestFocus();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$b */
    static final class View$OnTouchListenerC51893b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C51891h f119581a;

        static {
            Covode.recordClassIndex(61262);
        }

        View$OnTouchListenerC51893b(C51891h hVar) {
            this.f119581a = hVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f119581a.mo87599C();
            return false;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    public C51891h(C51873c cVar, C2560h<Boolean> hVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(hVar, "");
        this.f119577i = cVar;
        this.f119580t = hVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a34, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.dli);
        C89219l.m154716b(c, "");
        this.f119574f = (RelativeLayout) c;
        View c2 = mo36475c(R.id.btx);
        C89219l.m154716b(c2, "");
        this.f119572d = (ImageView) c2;
        View c3 = mo36475c(R.id.etm);
        C89219l.m154716b(c3, "");
        this.f119573e = (TextView) c3;
        if (C65350at.m117036a()) {
            ImageView imageView = this.f119572d;
            if (imageView == null) {
                C89219l.m154710a("ivChooseMusic");
            }
            imageView.setImageResource(2131232533);
        } else {
            ImageView imageView2 = this.f119572d;
            if (imageView2 == null) {
                C89219l.m154710a("ivChooseMusic");
            }
            imageView2.setImageResource(2131232345);
        }
        mo87600a().post(new RunnableC51894c(this));
        Typeface a = C69837ao.m123399a();
        if (a != null) {
            TextView textView = this.f119573e;
            if (textView == null) {
                C89219l.m154710a("tvChooseMusic");
            }
            textView.setTypeface(a);
        }
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a2, "");
        this.f119571c = (ShortVideoContextViewModel) a2;
        this.f119580t.mo7036a(this, new C51897f(this));
        this.f119577i.f119528h.mo7036a(this, new C51898g(this));
        this.f119577i.f119529i.mo6997a(this, new C51899h(this));
        this.f119577i.f119526f.mo7036a(this, new C51900i(this));
        this.f119577i.f119527g.mo6997a(this, new C51901j(this));
        this.f119577i.f119525e.mo6997a(this, new C51904k(this));
        this.f119577i.f119522b.mo7036a(this, new C51905l(this));
        this.f119577i.f119523c.mo7036a(this, new C51895d(this));
        this.f119577i.f119530j.mo6997a(this, new C51896e(this));
        if (m96589D()) {
            mo87601a(false);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
