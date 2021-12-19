package com.p2082ss.android.ugc.gamora.editor;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84750j;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84751k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84752l;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84634e;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.x */
public final class C83389x {
    static {
        Covode.recordClassIndex(97275);
    }

    /* renamed from: a */
    public static final AnimationSet m143780a() {
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.x$a */
    public static final class C83390a extends C84752l {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f186242a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f186243b;

        /* renamed from: c */
        final /* synthetic */ AbstractC84701l f186244c;

        /* renamed from: d */
        final /* synthetic */ boolean f186245d;

        /* renamed from: e */
        final /* synthetic */ boolean f186246e = true;

        /* renamed from: f */
        final /* synthetic */ boolean f186247f;

        /* renamed from: g */
        final /* synthetic */ boolean f186248g;

        static {
            Covode.recordClassIndex(97276);
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84752l
        /* renamed from: a */
        public final AbstractC84634e<EffectCategoryResponse, Effect> mo128389a(TabLayout tabLayout) {
            C89219l.m154721d(tabLayout, "");
            return new C83391a(tabLayout, tabLayout);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.x$a$a */
        public static final class C83391a extends C84751k {

            /* renamed from: a */
            public final double f186249a;

            /* renamed from: b */
            final /* synthetic */ TabLayout f186250b;

            /* renamed from: e */
            private final int f186251e;

            /* renamed from: f */
            private final int f186252f;

            /* renamed from: g */
            private final double f186253g;

            static {
                Covode.recordClassIndex(97277);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>>] */
            @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84681e
            /* renamed from: a */
            public final void mo128395a(List<? extends C89378p<? extends EffectCategoryResponse, ? extends List<? extends Effect>>> list) {
                C89219l.m154721d(list, "");
                super.mo128395a((List) list);
                if (this.f186251e <= this.f186252f || list.size() >= 8) {
                    this.f186250b.setTabMode(0);
                } else {
                    this.f186250b.setTabMode(1);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, java.lang.Object] */
            @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84751k, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84681e
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ View mo128391a(Context context, EffectCategoryResponse effectCategoryResponse) {
                return mo128391a(context, effectCategoryResponse);
            }

            @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84751k, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84681e
            /* renamed from: a */
            public final void mo128392a(View view, int i) {
                if (!(view instanceof C84750j)) {
                    view = null;
                }
                C84750j jVar = (C84750j) view;
                if (jVar != null) {
                    jVar.getContentView().setBackground(null);
                }
                View c = this.f186250b.mo115536c(i);
                if (c != null) {
                    c.setBackground(null);
                }
            }

            @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84751k, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84681e
            /* renamed from: b */
            public final void mo128396b(View view, int i) {
                if (!(view instanceof C84750j)) {
                    view = null;
                }
                C84750j jVar = (C84750j) view;
                if (jVar != null) {
                    View contentView = jVar.getContentView();
                    Context context = this.f186250b.getContext();
                    C89219l.m154716b(context, "");
                    contentView.setBackground(context.getResources().getDrawable(R.drawable.s3));
                }
            }

            /* renamed from: com.ss.android.ugc.gamora.editor.x$a$a$a */
            static final class View$OnTouchListenerC83392a implements View.OnTouchListener {

                /* renamed from: a */
                final /* synthetic */ C84750j f186254a;

                static {
                    Covode.recordClassIndex(97278);
                }

                View$OnTouchListenerC83392a(C84750j jVar) {
                    this.f186254a = jVar;
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    C89219l.m154716b(motionEvent, "");
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        SimpleDraweeView iconImgView = this.f186254a.getIconImgView();
                        AnimationSet animationSet = new AnimationSet(true);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(100);
                        animationSet.setFillAfter(true);
                        animationSet.addAnimation(scaleAnimation);
                        iconImgView.startAnimation(animationSet);
                        return false;
                    } else if (action == 1) {
                        this.f186254a.getIconImgView().startAnimation(C83389x.m143780a());
                        return false;
                    } else if (action != 2) {
                        return false;
                    } else {
                        this.f186254a.getIconImgView().startAnimation(C83389x.m143780a());
                        return false;
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C83391a(TabLayout tabLayout, TabLayout tabLayout2) {
                super(tabLayout2);
                this.f186250b = tabLayout;
                this.f186251e = C84912r.m145931a(tabLayout.getContext());
                Context context = tabLayout.getContext();
                C89219l.m154716b(context, "");
                this.f186252f = (int) C84912r.m145930a(context, 320.0f);
                Context context2 = tabLayout.getContext();
                C89219l.m154716b(context2, "");
                this.f186253g = (double) C84912r.m145930a(context2, 32.0f);
                Context context3 = tabLayout.getContext();
                C89219l.m154716b(context3, "");
                this.f186249a = (double) C84912r.m145930a(context3, 12.0f);
            }

            @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84751k
            /* renamed from: a */
            public final View mo128390a(Context context, EffectCategoryResponse effectCategoryResponse) {
                View view;
                C89219l.m154721d(context, "");
                C89219l.m154721d(effectCategoryResponse, "");
                View a = super.mo128391a(context, effectCategoryResponse);
                ViewGroup.MarginLayoutParams marginLayoutParams = null;
                if (!(a instanceof C84750j)) {
                    view = null;
                } else {
                    view = a;
                }
                C84750j jVar = (C84750j) view;
                if (jVar != null) {
                    jVar.getTextView().setVisibility(8);
                    ViewGroup.LayoutParams layoutParams = jVar.getContentView().getLayoutParams();
                    layoutParams.width = (int) this.f186253g;
                    layoutParams.height = (int) this.f186253g;
                    jVar.getContentView().setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = jVar.getIconImgView().getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = layoutParams2;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    if (marginLayoutParams2 != null) {
                        int i = Build.VERSION.SDK_INT;
                        marginLayoutParams2.setMarginStart(0);
                    }
                    jVar.getIconImgView().setAlpha(1.0f);
                    jVar.setOnTouchListener(new View$OnTouchListenerC83392a(jVar));
                }
                return a;
            }

            @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84751k
            /* renamed from: a */
            public final void mo128394a(View view, EffectCategoryResponse effectCategoryResponse, int i, int i2) {
                double d;
                double d2;
                double d3;
                double d4;
                C89219l.m154721d(view, "");
                C89219l.m154721d(effectCategoryResponse, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    int i3 = this.f186251e;
                    if (i3 <= this.f186252f) {
                        double d5 = (double) i3;
                        double d6 = this.f186249a;
                        Double.isNaN(d5);
                        d = (d5 - d6) - (this.f186253g * 6.5d);
                        d2 = 6.0d;
                    } else if (i2 > 8) {
                        double d7 = (double) i3;
                        double d8 = this.f186249a;
                        Double.isNaN(d7);
                        d = (d7 - d8) - (this.f186253g * 8.5d);
                        d2 = 8.0d;
                    } else {
                        double d9 = (double) i3;
                        Double.isNaN(d9);
                        double d10 = d9 - (this.f186249a * 2.0d);
                        double d11 = (double) i2;
                        double d12 = this.f186253g;
                        Double.isNaN(d11);
                        d = d10 - (d11 * d12);
                        d2 = (double) (i2 - 1);
                        Double.isNaN(d2);
                    }
                    double d13 = d / d2;
                    if (i == 0) {
                        d3 = this.f186249a;
                    } else {
                        d3 = d13 / 2.0d;
                    }
                    if (i == i2 - 1) {
                        d4 = this.f186249a;
                    } else {
                        d4 = d13 / 2.0d;
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    marginLayoutParams.setMarginStart((int) d3);
                    marginLayoutParams.setMarginEnd((int) d4);
                    marginLayoutParams.leftMargin = (int) d3;
                    marginLayoutParams.rightMargin = (int) d4;
                    view.setLayoutParams(marginLayoutParams);
                    view.invalidate();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83390a(ViewGroup viewGroup, AbstractC1204m mVar, AbstractC84701l lVar, boolean z, boolean z2, boolean z3, ViewGroup viewGroup2, AbstractC1204m mVar2, AbstractC84701l lVar2, AbstractC89172b bVar) {
            super(viewGroup2, mVar2, lVar2, bVar, (byte) 0);
            this.f186242a = viewGroup;
            this.f186243b = mVar;
            this.f186244c = lVar;
            this.f186245d = z;
            this.f186247f = z2;
            this.f186248g = z3;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.x$b */
    public static final class C83393b extends AbstractC89220m implements AbstractC89172b<C84752l.C84785c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f186255a;

        /* renamed from: b */
        final /* synthetic */ boolean f186256b = true;

        /* renamed from: c */
        final /* synthetic */ boolean f186257c;

        /* renamed from: d */
        final /* synthetic */ boolean f186258d;

        static {
            Covode.recordClassIndex(97279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83393b(boolean z, boolean z2, boolean z3) {
            super(1);
            this.f186255a = z;
            this.f186257c = z2;
            this.f186258d = z3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84752l.C84785c cVar) {
            C84752l.C84785c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            cVar2.f189459a = this.f186255a;
            cVar2.f189460b = this.f186256b;
            cVar2.f189467i = this.f186257c;
            C84752l.C84753a aVar = new C84752l.C84753a(0, new AbstractC89172b<AbstractC84650b.C84654c, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.C83389x.C83393b.C833941 */

                /* renamed from: a */
                final /* synthetic */ C83393b f186259a;

                static {
                    Covode.recordClassIndex(97280);
                }

                {
                    this.f186259a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(AbstractC84650b.C84654c cVar) {
                    AbstractC84650b.C84654c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    cVar2.f189165a = this.f186259a.f186258d;
                    return C89391z.f203057a;
                }
            }, 7);
            C89219l.m154721d(aVar, "");
            cVar2.f189469k = aVar;
            return C89391z.f203057a;
        }
    }
}
