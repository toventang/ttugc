package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.C1465n;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70096q;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VideoLayoutManager;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70410e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70415f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c */
public final class C71588c {

    /* renamed from: a */
    public long f160413a;

    /* renamed from: b */
    public int f160414b = 1;

    /* renamed from: c */
    public ValueAnimator f160415c;

    /* renamed from: d */
    public C70582z f160416d;

    /* renamed from: e */
    public RecyclerView f160417e;

    /* renamed from: f */
    public View f160418f;

    /* renamed from: g */
    private final Context f160419g;

    /* renamed from: h */
    private final AbstractC1204m f160420h;

    /* renamed from: i */
    private final VideoEditViewModel f160421i;

    /* renamed from: j */
    private final CutMultiVideoViewModel f160422j;

    static {
        Covode.recordClassIndex(84133);
    }

    /* renamed from: a */
    public final void mo113336a() {
        ValueAnimator valueAnimator = this.f160415c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f160415c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c$a */
    static final class ViewTreeObserver$OnPreDrawListenerC71589a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C71588c f160423a;

        static {
            Covode.recordClassIndex(84134);
        }

        ViewTreeObserver$OnPreDrawListenerC71589a(C71588c cVar) {
            this.f160423a = cVar;
        }

        public final boolean onPreDraw() {
            ValueAnimator valueAnimator = this.f160423a.f160415c;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                int a = C71588c.m126492a(this.f160423a).mo110979a(C71588c.m126493b(this.f160423a), C71588c.m126492a(this.f160423a).f157925b);
                if (a == -1) {
                    C71588c.m126494c(this.f160423a).setVisibility(4);
                } else if (this.f160423a.f160414b != 2) {
                    C71588c.m126494c(this.f160423a).setVisibility(0);
                    C71588c.m126494c(this.f160423a).setX(((float) a) - ((float) (C71588c.m126494c(this.f160423a).getMeasuredWidth() / 2)));
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c$d */
    static final class C71592d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71588c f160428a;

        static {
            Covode.recordClassIndex(84137);
        }

        C71592d(C71588c cVar) {
            this.f160428a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Integer num = (Integer) obj;
            C71588c cVar = this.f160428a;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            cVar.f160414b = i;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C70582z m126492a(C71588c cVar) {
        C70582z zVar = cVar.f160416d;
        if (zVar == null) {
            C89219l.m154710a("videoSegAdapter");
        }
        return zVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecyclerView m126493b(C71588c cVar) {
        RecyclerView recyclerView = cVar.f160417e;
        if (recyclerView == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m126494c(C71588c cVar) {
        View view = cVar.f160418f;
        if (view == null) {
            C89219l.m154710a("animTabDot");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c$c */
    static final class C71591c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C71588c f160425a;

        /* renamed from: b */
        final /* synthetic */ int f160426b;

        /* renamed from: c */
        final /* synthetic */ int f160427c;

        static {
            Covode.recordClassIndex(84136);
        }

        C71591c(C71588c cVar, int i, int i2) {
            this.f160425a = cVar;
            this.f160426b = i;
            this.f160427c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c;
            float f;
            int a = C71588c.m126492a(this.f160425a).mo110979a(C71588c.m126493b(this.f160425a), this.f160426b);
            int a2 = C71588c.m126492a(this.f160425a).mo110979a(C71588c.m126493b(this.f160425a), this.f160427c);
            if (a == -1 && a2 == -1) {
                C71588c.m126494c(this.f160425a).setTranslationX(0.0f);
                C71588c.m126494c(this.f160425a).setVisibility(4);
                return;
            }
            if (a < 0 || a2 < 0) {
                C71588c.m126494c(this.f160425a).setVisibility(0);
                c = C71588c.m126494c(this.f160425a);
                if (a2 == -1) {
                    f = (float) a;
                } else {
                    f = (float) a2;
                }
            } else {
                C71588c.m126494c(this.f160425a).setVisibility(0);
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                f = (((Float) animatedValue).floatValue() * ((float) (a2 - a))) + ((float) a);
                c = C71588c.m126494c(this.f160425a);
            }
            c.setX(f - ((float) (C71588c.m126494c(this.f160425a).getMeasuredWidth() / 2)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c$e */
    static final class C71593e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71588c f160429a;

        static {
            Covode.recordClassIndex(84138);
        }

        C71593e(C71588c cVar) {
            this.f160429a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            C0692e eVar = (C0692e) obj;
            if (eVar != null) {
                C71588c cVar = this.f160429a;
                F f = eVar.f2750a;
                if (f == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(f, "");
                int intValue = f.intValue();
                S s = eVar.f2751b;
                if (s == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(s, "");
                int intValue2 = s.intValue();
                if (cVar.f160414b != 2) {
                    if (intValue != intValue2) {
                        if (cVar.f160416d != null && System.currentTimeMillis() - cVar.f160413a >= 3000) {
                            if (intValue2 == 0) {
                                i = 0;
                            } else {
                                C70582z zVar = cVar.f160416d;
                                if (zVar == null) {
                                    C89219l.m154710a("videoSegAdapter");
                                }
                                if (zVar instanceof C70410e) {
                                    C70582z zVar2 = cVar.f160416d;
                                    if (zVar2 == null) {
                                        C89219l.m154710a("videoSegAdapter");
                                    }
                                    Objects.requireNonNull(zVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter");
                                    if (((C70410e) zVar2).mo110985d()) {
                                        i = intValue2 + 1;
                                    }
                                }
                                i = intValue2;
                            }
                            RecyclerView recyclerView = cVar.f160417e;
                            if (recyclerView == null) {
                                C89219l.m154710a("videoRecyclerView");
                            }
                            recyclerView.mo4435d(i);
                        }
                        C70582z zVar3 = cVar.f160416d;
                        if (zVar3 == null) {
                            C89219l.m154710a("videoSegAdapter");
                        }
                        if (intValue == zVar3.f157925b) {
                            ValueAnimator valueAnimator = cVar.f160415c;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.setDuration(500L);
                            ofFloat.addUpdateListener(new C71591c(cVar, intValue, intValue2));
                            cVar.f160415c = ofFloat;
                            ValueAnimator valueAnimator2 = cVar.f160415c;
                            if (valueAnimator2 != null) {
                                valueAnimator2.start();
                            }
                        } else {
                            return;
                        }
                    }
                    C70582z zVar4 = cVar.f160416d;
                    if (zVar4 == null) {
                        C89219l.m154710a("videoSegAdapter");
                    }
                    zVar4.f157925b = intValue2;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c$b */
    static final class View$OnTouchListenerC71590b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C71588c f160424a;

        static {
            Covode.recordClassIndex(84135);
        }

        View$OnTouchListenerC71590b(C71588c cVar) {
            this.f160424a = cVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer valueOf;
            if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null) {
                return false;
            }
            if (valueOf.intValue() != 0 && valueOf.intValue() != 2 && valueOf.intValue() != 1) {
                return false;
            }
            this.f160424a.f160413a = System.currentTimeMillis();
            return false;
        }
    }

    public C71588c(Context context, AbstractC1204m mVar, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(videoEditViewModel, "");
        C89219l.m154721d(cutMultiVideoViewModel, "");
        this.f160419g = context;
        this.f160420h = mVar;
        this.f160421i = videoEditViewModel;
        this.f160422j = cutMultiVideoViewModel;
        videoEditViewModel.f157677b.observe(mVar, new C71592d(this));
        cutMultiVideoViewModel.f156529a.observe(mVar, new C71593e(this));
    }

    /* renamed from: a */
    public final void mo113337a(RecyclerView recyclerView, View view, C71587b bVar, C70582z.AbstractC70584b bVar2) {
        C70410e eVar;
        C1465n.AbstractC1471a qVar;
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f160417e = recyclerView;
        this.f160418f = view;
        if (bVar.f160410a) {
            VideoEditViewModel videoEditViewModel = this.f160421i;
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f160422j;
            List<VideoSegment> j = videoEditViewModel.mo111231j();
            C89219l.m154716b(j, "");
            C70410e eVar2 = new C70410e(videoEditViewModel, cutMultiVideoViewModel, j);
            eVar2.mo110982a(bVar.f160412c);
            eVar = eVar2;
        } else {
            VideoEditViewModel videoEditViewModel2 = this.f160421i;
            eVar = new C70582z(videoEditViewModel2, this.f160422j, videoEditViewModel2.mo111231j());
        }
        this.f160416d = eVar;
        eVar.f157926c = bVar2;
        C70582z zVar = this.f160416d;
        if (zVar == null) {
            C89219l.m154710a("videoSegAdapter");
        }
        zVar.f157931h = bVar.f160411b;
        if (bVar.f160410a) {
            C70582z zVar2 = this.f160416d;
            if (zVar2 == null) {
                C89219l.m154710a("videoSegAdapter");
            }
            qVar = new C70415f(zVar2);
        } else {
            C70582z zVar3 = this.f160416d;
            if (zVar3 == null) {
                C89219l.m154710a("videoSegAdapter");
            }
            qVar = new C70096q(zVar3);
        }
        C1465n nVar = new C1465n(qVar);
        RecyclerView recyclerView2 = this.f160417e;
        if (recyclerView2 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        nVar.mo4979a(recyclerView2);
        RecyclerView recyclerView3 = this.f160417e;
        if (recyclerView3 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        recyclerView3.setLayoutManager(new VideoLayoutManager(this.f160419g));
        RecyclerView recyclerView4 = this.f160417e;
        if (recyclerView4 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        C70582z zVar4 = this.f160416d;
        if (zVar4 == null) {
            C89219l.m154710a("videoSegAdapter");
        }
        recyclerView4.setAdapter(zVar4);
        RecyclerView recyclerView5 = this.f160417e;
        if (recyclerView5 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        C1434i iVar = new C1434i();
        iVar.f4468j = 300;
        iVar.f4470l = 300;
        iVar.f4469k = 300;
        iVar.f4467i = 300;
        recyclerView5.setItemAnimator(iVar);
        RecyclerView recyclerView6 = this.f160417e;
        if (recyclerView6 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        recyclerView6.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC71589a(this));
        RecyclerView recyclerView7 = this.f160417e;
        if (recyclerView7 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        recyclerView7.setOnTouchListener(new View$OnTouchListenerC71590b(this));
        C70582z zVar5 = this.f160416d;
        if (zVar5 == null) {
            C89219l.m154710a("videoSegAdapter");
        }
        zVar5.notifyDataSetChanged();
    }
}
