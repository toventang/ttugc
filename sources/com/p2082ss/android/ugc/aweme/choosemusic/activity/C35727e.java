package com.p2082ss.android.ugc.aweme.choosemusic.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.legacy.widget.Space;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.choosemusic.model.AbstractC35864a;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35917s;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35919t;
import com.p2082ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35780al;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35818v;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35857c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35938d;
import com.p2082ss.android.ugc.aweme.choosemusic.widgets.p2476a.View$OnClickListenerC36068a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60717d;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e */
public final class C35727e extends AbstractC22186b implements AbstractC84917a, AbstractC84918b {

    /* renamed from: b */
    public int f84291b;

    /* renamed from: c */
    public boolean f84292c;

    /* renamed from: d */
    public TuxTextView f84293d;

    /* renamed from: e */
    public C35938d f84294e;

    /* renamed from: f */
    private final AbstractC89244h f84295f = C89250i.m154773a((AbstractC89171a) C35728a.f84299a);

    /* renamed from: g */
    private final AbstractC89244h f84296g = C89250i.m154773a((AbstractC89171a) new C35729b(this));

    /* renamed from: h */
    private final AbstractC89244h f84297h = C89250i.m154773a((AbstractC89171a) new C35742o(this));

    /* renamed from: i */
    private boolean f84298i;

    static {
        Covode.recordClassIndex(42962);
    }

    /* renamed from: E */
    public final IAVPerformance mo62771E() {
        return (IAVPerformance) this.f84295f.getValue();
    }

    /* renamed from: F */
    public final ChooseMusicWithSceneViewModel mo62772F() {
        return (ChooseMusicWithSceneViewModel) this.f84296g.getValue();
    }

    /* renamed from: G */
    public final float mo62773G() {
        return ((Number) this.f84297h.getValue()).floatValue();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        m72913L();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$a */
    static final class C35728a extends AbstractC89220m implements AbstractC89171a<IAVPerformance> {

        /* renamed from: a */
        public static final C35728a f84299a = new C35728a();

        static {
            Covode.recordClassIndex(42963);
        }

        C35728a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAVPerformance invoke() {
            return AVExternalServiceImpl.m113114a().provideAVPerformance();
        }
    }

    /* renamed from: L */
    private final void m72913L() {
        if (this.f84291b == 2) {
            C35936b.f84812a = "video_shoot_page";
        } else {
            C35936b.f84812a = "video_edit_page";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$b */
    static final class C35729b extends AbstractC89220m implements AbstractC89171a<ChooseMusicWithSceneViewModel> {

        /* renamed from: a */
        final /* synthetic */ C35727e f84300a;

        static {
            Covode.recordClassIndex(42964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35729b(C35727e eVar) {
            super(0);
            this.f84300a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ChooseMusicWithSceneViewModel invoke() {
            Activity t = this.f84300a.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return C1181ae.m3881a((ActivityC0945e) t, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$h */
    static final class C35735h extends AbstractC89220m implements AbstractC89171a<C35818v> {

        /* renamed from: a */
        final /* synthetic */ String f84306a;

        /* renamed from: b */
        final /* synthetic */ MusicModel f84307b;

        /* renamed from: c */
        final /* synthetic */ boolean f84308c;

        /* renamed from: d */
        final /* synthetic */ boolean f84309d;

        /* renamed from: e */
        final /* synthetic */ String f84310e;

        /* renamed from: f */
        final /* synthetic */ String f84311f;

        /* renamed from: g */
        final /* synthetic */ C35727e f84312g;

        /* renamed from: h */
        final /* synthetic */ Bundle f84313h;

        /* renamed from: i */
        final /* synthetic */ AbstractC0952i f84314i;

        static {
            Covode.recordClassIndex(42970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35735h(String str, MusicModel musicModel, boolean z, boolean z2, String str2, String str3, C35727e eVar, Bundle bundle, AbstractC0952i iVar) {
            super(0);
            this.f84306a = str;
            this.f84307b = musicModel;
            this.f84308c = z;
            this.f84309d = z2;
            this.f84310e = str2;
            this.f84311f = str3;
            this.f84312g = eVar;
            this.f84313h = bundle;
            this.f84314i = iVar;
        }

        /* renamed from: a */
        public final C35818v invoke() {
            return C35818v.C35819a.m73160a(this.f84312g.f84291b, this.f84306a, this.f84307b, C60717d.EnumC60718a.BtnConfirm, this.f84308c, this.f84309d, this.f84313h, this.f84310e, this.f84311f, this.f84312g.f84292c ? 1 : 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$l */
    public static final class ViewTreeObserver$OnPreDrawListenerC35739l implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C35727e f84321a;

        static {
            Covode.recordClassIndex(42974);
        }

        public final boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            this.f84321a.mo62774H();
            View view = this.f84321a.f52550n;
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnPreDrawListenerC35739l(C35727e eVar) {
            this.f84321a = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$o */
    static final class C35742o extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C35727e f84324a;

        static {
            Covode.recordClassIndex(42977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35742o(C35727e eVar) {
            super(0);
            this.f84324a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            Context context;
            View view = this.f84324a.f52550n;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            return Float.valueOf((float) C13628n.m24521b(context));
        }
    }

    /* renamed from: M */
    private final boolean m72914M() {
        boolean z = false;
        if (this.f84298i) {
            return false;
        }
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean enableLocalMusicEntrance = iESSettingsProxy.getEnableLocalMusicEntrance();
            C89219l.m154716b(enableLocalMusicEntrance, "");
            z = enableLocalMusicEntrance.booleanValue();
            return z;
        } catch (C16041a e) {
            e.printStackTrace();
            return z;
        }
    }

    /* renamed from: H */
    public final void mo62774H() {
        View view = this.f52550n;
        if (view != null) {
            view.setTranslationY(mo62773G());
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new C35740m(this));
        ofFloat.addListener(new C35741n(this));
        ofFloat.start();
    }

    /* renamed from: K */
    public final void mo62777K() {
        if (mo62772F().f84643b) {
            ChooseMusicWithSceneViewModel F = mo62772F();
            Intent intent = new Intent();
            AVExternalServiceImpl.m113114a().publishService().setCurMusic(null);
            intent.putExtra("is_cancel_current_choose_music", true);
            F.mo62969a(new C35917s(-1, intent));
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: o */
    public final void mo36481o() {
        super.mo36481o();
        Activity t = mo36486t();
        if (!(t instanceof AbstractC84919c)) {
            t = null;
        }
        AbstractC84919c cVar = (AbstractC84919c) t;
        if (cVar != null) {
            cVar.mo87534b((AbstractC84918b) this);
            cVar.mo87535c(this);
        }
        IAVPerformance E = mo62771E();
        Activity t2 = mo36486t();
        C89219l.m154716b(t2, "");
        E.leave(t2, "music_select");
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        String str;
        super.mo36491x();
        IAVPerformance E = mo62771E();
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        Bundle bundle = this.f52554r;
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("creation_id");
        } else {
            str = null;
        }
        Bundle bundle2 = this.f52554r;
        if (bundle2 != null) {
            str2 = bundle2.getString("shoot_way");
        }
        E.pause(t, "music_select", str, str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$i */
    static final class C35736i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35735h f84315a;

        /* renamed from: b */
        final /* synthetic */ C35727e f84316b;

        /* renamed from: c */
        final /* synthetic */ Bundle f84317c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0952i f84318d;

        static {
            Covode.recordClassIndex(42971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35736i(C35735h hVar, C35727e eVar, Bundle bundle, AbstractC0952i iVar) {
            super(0);
            this.f84315a = hVar;
            this.f84316b = eVar;
            this.f84317c = bundle;
            this.f84318d = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f84316b.mo62772F().f84643b) {
                AVExternalServiceImpl.m113114a().publishService().setCurMusic(null);
            }
            this.f84316b.mo62776J();
            C35818v vVar = (C35818v) this.f84318d.mo3549a(R.id.b83);
            if (vVar != null) {
                if (vVar.f84386d) {
                    vVar.mo62813e();
                }
                this.f84318d.mo3552a().mo3469b(R.id.b83, this.f84315a.invoke()).mo3467b();
            } else {
                this.f84318d.mo3552a().mo3453a(R.id.b83, this.f84315a.invoke()).mo3467b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: I */
    public final void mo62775I() {
        if (!(!C89219l.m154714a(mo62772F().mo62971c().getValue(), AbstractC35864a.C35867c.f84657a))) {
            mo62772F().mo62968a(AbstractC35864a.C35866b.f84656a);
            TuxTextView tuxTextView = this.f84293d;
            if (tuxTextView == null) {
                C89219l.m154710a("tvTitle");
            }
            KeyboardUtils.m70897c(tuxTextView);
            View view = this.f52550n;
            if (view != null) {
                view.setEnabled(false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new C35730c(this));
            ofFloat.addListener(new C35731d(this));
            ofFloat.start();
        }
    }

    /* renamed from: J */
    public final void mo62776J() {
        View c = mo36475c(R.id.f2v);
        C89219l.m154716b(c, "");
        TextView textView = (TextView) c;
        if (m72914M()) {
            C35938d dVar = this.f84294e;
            if (dVar == null) {
                C89219l.m154710a("commerceChooseMusicHelper");
            }
            if (dVar.mo63057a()) {
                textView.setVisibility(0);
                if (this.f84292c) {
                    textView.setAlpha(0.5f);
                    textView.setOnClickListener(View$OnClickListenerC36068a.m73522a(new View$OnClickListenerC35732e(this)));
                    return;
                }
                textView.setOnClickListener(View$OnClickListenerC36068a.m73522a(new View$OnClickListenerC35733f(this)));
                return;
            }
        }
        textView.setVisibility(8);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        String str;
        super.mo22713n_();
        Activity t = mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0952i supportFragmentManager = ((ActivityC0945e) t).getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo3549a(R.id.b83);
        if (!(a instanceof C35818v)) {
            a = null;
        }
        C35818v vVar = (C35818v) a;
        if (vVar != null) {
            C35780al alVar = vVar.f84385c;
            C89219l.m154716b(alVar, "");
            AbstractC0952i childFragmentManager = alVar.getChildFragmentManager();
            AbstractC0976n a2 = childFragmentManager.mo3552a();
            Fragment a3 = childFragmentManager.mo3551a(AbstractC35809r.f84539b + 0);
            if (a3 != null) {
                a2.mo3455a(a3);
            }
            Fragment a4 = childFragmentManager.mo3551a(AbstractC35809r.f84539b + 1);
            if (a4 != null) {
                a2.mo3455a(a4);
            }
            a2.mo3473c();
            AbstractC0976n a5 = vVar.getChildFragmentManager().mo3552a();
            a5.mo3455a(alVar);
            a5.mo3473c();
            AbstractC0976n a6 = supportFragmentManager.mo3552a();
            a6.mo3455a(vVar);
            a6.mo3473c();
        }
        String str2 = mo62772F().f84645d;
        if (!TextUtils.isEmpty(str2)) {
            C69905c curMusic = AVExternalServiceImpl.m113114a().publishService().getCurMusic();
            if (curMusic != null) {
                str = curMusic.getMid();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, str2)) {
                C39162r.m79460a("mission_requirement_modified", new C33744d().mo59980a("value", 1).mo59983a("mission_id", mo62772F().f84646e).f79943a);
                mo62772F().f84645d = null;
                mo62772F().f84645d = null;
            }
        }
        ChooseMusicWithSceneViewModel F = mo62772F();
        F.f84642a = false;
        F.f84643b = false;
        F.f84645d = null;
        F.f84646e = null;
        F.f84644c = null;
        F.mo62967a().setValue(null);
        F.mo62970b().setValue(new C35917s());
        F.mo62971c().setValue(AbstractC35864a.C35867c.f84657a);
        F.mo62972d().setValue(AbstractC35864a.C35867c.f84657a);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$d */
    public static final class C35731d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C35727e f84302a;

        static {
            Covode.recordClassIndex(42966);
        }

        C35731d(C35727e eVar) {
            this.f84302a = eVar;
        }

        public final void onAnimationEnd(Animator animator) {
            if (C89219l.m154714a(this.f84302a.mo62772F().mo62971c().getValue(), AbstractC35864a.C35866b.f84656a)) {
                this.f84302a.mo62772F().mo62968a(AbstractC35864a.C35865a.f84655a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$g */
    public static final class C35734g extends ViewPagerBottomSheetBehavior.AbstractC34617a {

        /* renamed from: a */
        final /* synthetic */ C35727e f84305a;

        static {
            Covode.recordClassIndex(42969);
        }

        C35734g(C35727e eVar) {
            this.f84305a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.AbstractC34617a
        /* renamed from: a */
        public final void mo61099a(View view, float f) {
            C89219l.m154721d(view, "");
            C35938d dVar = this.f84305a.f84294e;
            if (dVar == null) {
                C89219l.m154710a("commerceChooseMusicHelper");
            }
            dVar.mo63055a(f);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.AbstractC34617a
        /* renamed from: a */
        public final void mo61100a(View view, int i) {
            C89219l.m154721d(view, "");
            if (i == 5) {
                KeyboardUtils.m70897c(C35727e.m72915a(this.f84305a));
                this.f84305a.mo62777K();
                this.f84305a.mo62772F().mo62968a(AbstractC35864a.C35865a.f84655a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$n */
    public static final class C35741n extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C35727e f84323a;

        static {
            Covode.recordClassIndex(42976);
        }

        C35741n(C35727e eVar) {
            this.f84323a = eVar;
        }

        public final void onAnimationEnd(Animator animator) {
            ChooseMusicWithSceneViewModel F = this.f84323a.mo62772F();
            AbstractC35864a.C35865a aVar = AbstractC35864a.C35865a.f84655a;
            C89219l.m154721d(aVar, "");
            F.mo62972d().setValue(aVar);
            this.f84323a.mo62771E().end(OpenMusicPanelPerformanceMonitor.f142464a, "animation_finished");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$k */
    static final class C35738k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C35727e f84320a;

        static {
            Covode.recordClassIndex(42973);
        }

        C35738k(C35727e eVar) {
            this.f84320a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (((C35917s) obj).f84770a != Integer.MAX_VALUE) {
                this.f84320a.mo62775I();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxTextView m72915a(C35727e eVar) {
        TuxTextView tuxTextView = eVar.f84293d;
        if (tuxTextView == null) {
            C89219l.m154710a("tvTitle");
        }
        return tuxTextView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$f */
    public static final class View$OnClickListenerC35733f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35727e f84304a;

        static {
            Covode.recordClassIndex(42968);
        }

        View$OnClickListenerC35733f(C35727e eVar) {
            this.f84304a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.m70897c(C35727e.m72915a(this.f84304a));
            C35727e eVar = this.f84304a;
            C60826d.m110425a(eVar.mo36486t(), eVar.f84291b);
            C35936b.m73310a(2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$j */
    static final class View$OnClickListenerC35737j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35727e f84319a;

        static {
            Covode.recordClassIndex(42972);
        }

        View$OnClickListenerC35737j(C35727e eVar) {
            this.f84319a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f84319a.mo62777K();
            this.f84319a.mo62775I();
            C35857c.C35858a.m73253a("");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$c */
    public static final class C35730c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C35727e f84301a;

        static {
            Covode.recordClassIndex(42965);
        }

        C35730c(C35727e eVar) {
            this.f84301a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            String.valueOf(valueAnimator.getAnimatedFraction());
            View view = this.f84301a.f52550n;
            if (view != null) {
                view.setTranslationY(this.f84301a.mo62773G() * valueAnimator.getAnimatedFraction());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$e */
    public static final class View$OnClickListenerC35732e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35727e f84303a;

        static {
            Covode.recordClassIndex(42967);
        }

        View$OnClickListenerC35732e(C35727e eVar) {
            this.f84303a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.m70897c(C35727e.m72915a(this.f84303a));
            new C79459a(this.f84303a.mo36486t()).mo123050a(R.string.czp).mo123053a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$m */
    public static final class C35740m implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C35727e f84322a;

        static {
            Covode.recordClassIndex(42975);
        }

        C35740m(C35727e eVar) {
            this.f84322a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            String.valueOf(valueAnimator.getAnimatedFraction());
            View view = this.f84322a.f52550n;
            if (view != null) {
                view.setTranslationY(this.f84322a.mo62773G() - (this.f84322a.mo62773G() * valueAnimator.getAnimatedFraction()));
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        Bundle bundle2;
        String str;
        String str2;
        boolean z;
        boolean z2;
        ViewTreeObserver viewTreeObserver;
        Bundle bundle3;
        super.mo22704a(bundle);
        Bundle bundle4 = this.f52554r;
        String str3 = null;
        if (bundle4 != null) {
            bundle2 = bundle4.getBundle("arguments");
        } else {
            bundle2 = null;
        }
        mo62771E().step(OpenMusicPanelPerformanceMonitor.f142464a, "choose_music_created");
        IAVPerformance E = mo62771E();
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        E.enter(t, "music_select");
        View c = mo36475c(R.id.f63);
        C89219l.m154716b(c, "");
        TuxTextView tuxTextView = (TuxTextView) c;
        Bundle bundle5 = this.f52554r;
        if (bundle5 != null) {
            str = bundle5.getString("title");
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(33);
        this.f84293d = tuxTextView;
        ChooseMusicWithSceneViewModel F = mo62772F();
        if (bundle2 != null) {
            str2 = bundle2.getString("mission_music_id");
        } else {
            str2 = null;
        }
        F.f84645d = str2;
        ChooseMusicWithSceneViewModel F2 = mo62772F();
        if (bundle2 != null) {
            str3 = bundle2.getString("mission_id");
        }
        F2.f84646e = str3;
        Activity t2 = mo36486t();
        C89219l.m154716b(t2, "");
        View view = this.f52550n;
        C89219l.m154716b(view, "");
        this.f84294e = new C35938d(t2, view);
        Bundle bundle6 = this.f52554r;
        if (bundle6 == null || !bundle6.getBoolean("hide_local_music", false)) {
            z = false;
        } else {
            z = true;
        }
        this.f84298i = z;
        Bundle bundle7 = this.f52554r;
        if (bundle7 == null || !bundle7.getBoolean("long_video", false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f84292c = z2;
        mo62776J();
        mo36475c(R.id.pi).setOnClickListener(new View$OnClickListenerC35737j(this));
        ((Space) mo36475c(R.id.e4f)).setMinimumHeight(C34723i.m70927b());
        ViewPagerBottomSheetBehavior<View> a = ViewPagerBottomSheetBehavior.m70672a(mo36475c(R.id.ajx));
        a.f81685k = new C35734g(this);
        a.f81678d = true;
        a.mo61092b(C34723i.m70924a(mo36486t()) + C34723i.m70932e(mo36486t()));
        ChooseMusicWithSceneViewModel F3 = mo62772F();
        C89219l.m154716b(a, "");
        C89219l.m154721d(a, "");
        F3.f84644c = a;
        Activity t3 = mo36486t();
        Objects.requireNonNull(t3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0952i supportFragmentManager = ((ActivityC0945e) t3).getSupportFragmentManager();
        if (supportFragmentManager.mo3549a(R.id.b83) == null && (bundle3 = this.f52554r) != null) {
            this.f84291b = bundle3.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            m72913L();
            AVExternalServiceImpl.m113114a().publishService().setMusicChooseType(this.f84291b);
            C35735h hVar = new C35735h(bundle3.getString("challenge"), (MusicModel) bundle3.getSerializable("music_model"), bundle3.getBoolean("music_allow_clear", false), bundle3.getBoolean("music_is_photomv", false), bundle3.getString("shoot_way"), bundle3.getString("creation_id"), this, bundle2, supportFragmentManager);
            supportFragmentManager.mo3552a().mo3453a(R.id.b83, hVar.invoke()).mo3476d();
            C35938d dVar = this.f84294e;
            if (dVar == null) {
                C89219l.m154710a("commerceChooseMusicHelper");
            }
            dVar.mo63056a(new C35736i(hVar, this, bundle2, supportFragmentManager));
        }
        mo62772F().f84642a = true;
        mo62772F().mo62970b().observe(this, new C35738k(this));
        int i = Build.VERSION.SDK_INT;
        ViewTreeObserver$OnPreDrawListenerC35739l lVar = new ViewTreeObserver$OnPreDrawListenerC35739l(this);
        View view2 = this.f52550n;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(lVar);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        mo62777K();
        mo62775I();
        return true;
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        Activity t = mo36486t();
        if (!(t instanceof AbstractC84919c)) {
            t = null;
        }
        AbstractC84919c cVar = (AbstractC84919c) t;
        if (cVar != null) {
            cVar.mo87532a((AbstractC84918b) this);
            cVar.mo87533b((AbstractC84917a) this);
        }
        View a = C1764a.m5927a(layoutInflater, R.layout.arh, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b
    /* renamed from: a */
    public final boolean mo62778a(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return true;
        }
        View view = this.f52550n;
        if (view != null) {
            view.setVisibility(8);
        }
        C35919t value = mo62772F().mo62967a().getValue();
        if (value == null) {
            return true;
        }
        value.f84773b.invoke(new C35917s(i2, intent));
        value.f84772a.invoke();
        return true;
    }
}
