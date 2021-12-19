package com.p2082ss.android.ugc.aweme.ftc.p3034f;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
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
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.AbstractC70604g;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70594c;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.f.c */
public final class C52544c extends AbstractC22219j implements AbstractC20382b, RepeatMusicPlayer.AbstractC70589a, AbstractC70604g.AbstractC70605a {

    /* renamed from: a */
    public static final C52545a f120971a = new C52545a((byte) 0);

    /* renamed from: b */
    private ShortVideoContext f120972b;

    /* renamed from: c */
    private AbstractC70604g f120973c;

    /* renamed from: d */
    private RepeatMusicPlayer f120974d;

    /* renamed from: e */
    private String f120975e;

    /* renamed from: f */
    private int f120976f;

    /* renamed from: g */
    private int f120977g;

    /* renamed from: h */
    private final AbstractC89172b<Integer, C89391z> f120978h;

    static {
        Covode.recordClassIndex(61940);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.f.c$a */
    public static final class C52545a {
        static {
            Covode.recordClassIndex(61941);
        }

        private C52545a() {
        }

        public /* synthetic */ C52545a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
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

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        super.mo36492y();
        m97461a();
    }

    /* renamed from: a */
    private final void m97461a() {
        RepeatMusicPlayer repeatMusicPlayer = this.f120974d;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.mo111361a();
        }
        this.f120974d = null;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AbstractC70604g gVar = this.f120973c;
        if (gVar != null) {
            gVar.mo111388a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer.AbstractC70589a
    /* renamed from: f */
    public final void mo88314f(int i) {
        AbstractC70604g gVar = this.f120973c;
        if (gVar != null) {
            gVar.mo111386a(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52544c(AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f120978h = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.AbstractC70604g.AbstractC70605a
    /* renamed from: e */
    public final void mo88313e(int i) {
        this.f120977g = i;
        this.f120978h.invoke(Integer.valueOf(i));
        m97461a();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.AbstractC70604g.AbstractC70605a
    /* renamed from: d */
    public final void mo88312d(int i) {
        String str = this.f120975e;
        if (str == null) {
            C89219l.m154710a("mMusicPath");
        }
        if (!TextUtils.isEmpty(str)) {
            this.f120977g = i;
            m97462a(i, this.f120976f);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        int i;
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
        C89219l.m154716b(shortVideoContext, "");
        this.f120972b = shortVideoContext;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext.f155817b.f155662r != null) {
            i = (int) C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration();
            ShortVideoContext shortVideoContext2 = this.f120972b;
            if (shortVideoContext2 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (!shortVideoContext2.f155817b.f155664t) {
                i = 15000;
            }
        } else {
            ShortVideoContext shortVideoContext3 = this.f120972b;
            if (shortVideoContext3 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            i = (int) shortVideoContext3.f155817b.f155646b;
        }
        if (C70005cr.m123611a().f156482a != null) {
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null) {
                C89219l.m154715b();
            }
            if (cVar.shootDuration > 0) {
                C69905c cVar2 = C70005cr.m123611a().f156482a;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                i = Math.min(i, cVar2.shootDuration);
            }
        }
        this.f120976f = i;
        ShortVideoContext shortVideoContext4 = this.f120972b;
        if (shortVideoContext4 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        this.f120977g = shortVideoContext4.f155817b.f155661q;
        ShortVideoContext shortVideoContext5 = this.f120972b;
        if (shortVideoContext5 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        String str = shortVideoContext5.f155817b.f155669y;
        C89219l.m154716b(str, "");
        this.f120975e = str;
        View view = this.f52550n;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        C70594c cVar3 = new C70594c((FrameLayout) view, this);
        ShortVideoContext shortVideoContext6 = this.f120972b;
        if (shortVideoContext6 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        cVar3.f157965a = shortVideoContext6.f155811au;
        int i2 = this.f120976f;
        ShortVideoContext shortVideoContext7 = this.f120972b;
        if (shortVideoContext7 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        cVar3.mo111387a(i2, shortVideoContext7.f155822g, this.f120977g);
        this.f120973c = cVar3;
        m97462a(this.f120977g, this.f120976f);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a39, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    private final void m97462a(int i, int i2) {
        String str = this.f120975e;
        if (str == null) {
            C89219l.m154710a("mMusicPath");
        }
        if (!TextUtils.isEmpty(str)) {
            if (this.f120974d == null) {
                Activity activity = this.f52549m;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.adaptation.AbsActivityAdaptationActivity");
                ActivityC33402b bVar = (ActivityC33402b) activity;
                String str2 = this.f120975e;
                if (str2 == null) {
                    C89219l.m154710a("mMusicPath");
                }
                this.f120974d = new RepeatMusicPlayer(bVar, str2, i2);
            }
            RepeatMusicPlayer repeatMusicPlayer = this.f120974d;
            if (repeatMusicPlayer == null) {
                C89219l.m154715b();
            }
            repeatMusicPlayer.mo111362a(i);
            RepeatMusicPlayer repeatMusicPlayer2 = this.f120974d;
            if (repeatMusicPlayer2 == null) {
                C89219l.m154715b();
            }
            repeatMusicPlayer2.f157946e = this;
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
