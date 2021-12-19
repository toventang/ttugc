package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.p025c.C0484a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2740a.C41095a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b.C41096a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71977b;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77974h;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77818a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77859d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77873d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77874e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77903b;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4096h.C77976a;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import com.p2082ss.android.ugc.tools.view.style.StyleRecyclerView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89531av;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j */
public final class C78017j implements AbstractC77872c {

    /* renamed from: a */
    public final AbstractC89516am f175024a = C77976a.m136236a();

    /* renamed from: b */
    public final RelativeLayout f175025b;

    /* renamed from: c */
    public final RelativeLayout f175026c;

    /* renamed from: d */
    final TextView f175027d;

    /* renamed from: e */
    ComposerBeauty f175028e;

    /* renamed from: f */
    ComposerBeauty f175029f;

    /* renamed from: g */
    boolean f175030g;

    /* renamed from: h */
    public Map<BeautyCategory, List<ComposerBeauty>> f175031h;

    /* renamed from: i */
    C77818a f175032i;

    /* renamed from: j */
    C77818a f175033j;

    /* renamed from: k */
    public final Context f175034k;

    /* renamed from: l */
    public final View f175035l;

    /* renamed from: m */
    public final C77861e f175036m;

    /* renamed from: n */
    public final C77990c f175037n;

    /* renamed from: o */
    private final StyleRecyclerView f175038o;

    /* renamed from: p */
    private final FrameLayout f175039p;

    /* renamed from: q */
    private final StyleRecyclerView f175040q;

    static {
        Covode.recordClassIndex(91107);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: b */
    public final ComposerBeauty mo121483b() {
        return this.f175028e;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: c */
    public final ComposerBeauty mo121485c() {
        return this.f175029f;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: d */
    public final C77818a mo121487d() {
        return this.f175032i;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: e */
    public final C77818a mo121488e() {
        return this.f175033j;
    }

    /* renamed from: a */
    public final void mo121728a(boolean z) {
        float d;
        RelativeLayout relativeLayout = this.f175025b;
        float[] fArr = new float[2];
        float f = 0.0f;
        fArr[0] = z ? -C41095a.m82774d(this.f175034k) : 0.0f;
        fArr[1] = z ? 0.0f : -C41095a.m82774d(this.f175034k);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "translationX", fArr);
        RelativeLayout relativeLayout2 = this.f175025b;
        float[] fArr2 = new float[2];
        fArr2[0] = z ? 0.0f : 1.0f;
        fArr2[1] = z ? 1.0f : 0.0f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", fArr2);
        RelativeLayout relativeLayout3 = this.f175026c;
        float[] fArr3 = new float[2];
        if (z) {
            d = 0.0f;
        } else {
            d = C41095a.m82774d(this.f175034k);
        }
        fArr3[0] = d;
        fArr3[1] = z ? C41095a.m82774d(this.f175034k) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(relativeLayout3, "translationX", fArr3);
        RelativeLayout relativeLayout4 = this.f175026c;
        float[] fArr4 = new float[2];
        fArr4[0] = z ? 1.0f : 0.0f;
        if (!z) {
            f = 1.0f;
        }
        fArr4[1] = f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(relativeLayout4, "alpha", fArr4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.addListener(new C78022e(this, z));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: a */
    public final boolean mo121482a() {
        return this.f175030g;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: g */
    public final void mo121490g() {
        AbstractC89568bz unused = C89624i.m155555a(this.f175024a, C41096a.f96058a, null, new C78026i(this, null), 2);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: h */
    public final boolean mo121491h() {
        if (!this.f175036m.f174691c.f174685q) {
            return true;
        }
        Set<BeautyCategory> keySet = this.f175031h.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                if (!this.f175037n.mo121685b(it.next().getCategoryResponse().getId())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: i */
    public final void mo121492i() {
        if (this.f175036m.f174691c.f174685q) {
            this.f175032i.mo121444a(true);
            this.f175032i.notifyDataSetChanged();
            Iterator<T> it = this.f175031h.keySet().iterator();
            while (it.hasNext()) {
                this.f175037n.mo121680a(it.next().getCategoryResponse().getId(), true);
            }
            this.f175037n.mo121679a("auto");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: f */
    public final void mo121489f() {
        String str;
        ComposerBeauty composerBeauty = this.f175028e;
        C77990c cVar = this.f175037n;
        if (composerBeauty == null || (str = composerBeauty.getCategoryId()) == null) {
            str = "";
        }
        if (cVar.mo121685b(str) && composerBeauty != null) {
            T t = null;
            if (!composerBeauty.isCollectionType()) {
                m136318a(this, composerBeauty, false, true, false, null, 18);
                this.f175037n.mo121688e(composerBeauty);
            } else if (this.f175030g) {
                TextView textView = this.f175027d;
                C89219l.m154716b(textView, "");
                textView.setText(composerBeauty.getEffect().getName());
                String d = this.f175037n.mo121687d(composerBeauty);
                List<ComposerBeauty> childList = composerBeauty.getChildList();
                if (childList != null) {
                    Iterator<T> it = childList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C89219l.m154714a((Object) next.getEffect().getResourceId(), (Object) d)) {
                            t = next;
                            break;
                        }
                    }
                    m136318a(this, t, this.f175030g, false, false, null, 20);
                    C77818a.m135936a(this.f175033j, childList);
                }
            } else {
                this.f175037n.mo121677a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: a */
    public final void mo121479a(ComposerBeauty composerBeauty) {
        this.f175028e = composerBeauty;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: b */
    public final void mo121484b(ComposerBeauty composerBeauty) {
        this.f175029f = composerBeauty;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo121729d(ComposerBeauty composerBeauty) {
        C77990c cVar = this.f175037n;
        C89219l.m154721d(composerBeauty, "");
        cVar.f174963a.mo121628m(composerBeauty);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$i */
    public static final class C78026i extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f175052a;

        /* renamed from: b */
        final /* synthetic */ C78017j f175053b;

        /* renamed from: c */
        private /* synthetic */ Object f175054c;

        static {
            Covode.recordClassIndex(91116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78026i(C78017j jVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f175053b = jVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C78026i iVar = new C78026i(this.f175053b, dVar);
            iVar.f175054c = obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78026i) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$i$a */
        public static final class C78027a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f175055a;

            /* renamed from: b */
            final /* synthetic */ C78026i f175056b;

            static {
                Covode.recordClassIndex(91117);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C78027a(C78026i iVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f175056b = iVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C78027a(this.f175056b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C78027a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$i$a$a */
            public static final /* synthetic */ class C78028a extends C89217j implements AbstractC89172b<ComposerBeauty, Boolean> {
                static {
                    Covode.recordClassIndex(91118);
                }

                C78028a(C77903b bVar) {
                    super(1, bVar, C77903b.class, "isBeautyAvailable", "isBeautyAvailable(Lcom/ss/android/ugc/aweme/beauty/ComposerBeauty;)Z", 0);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
                    ComposerBeauty composerBeauty2 = composerBeauty;
                    C89219l.m154721d(composerBeauty2, "");
                    return Boolean.valueOf(((C77903b) this.receiver).mo121555a(composerBeauty2));
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$i$a$c */
            public static final /* synthetic */ class C78030c extends C89217j implements AbstractC89172b<ComposerBeauty, Boolean> {
                static {
                    Covode.recordClassIndex(91120);
                }

                C78030c(C77903b bVar) {
                    super(1, bVar, C77903b.class, "isBeautyAvailable", "isBeautyAvailable(Lcom/ss/android/ugc/aweme/beauty/ComposerBeauty;)Z", 0);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
                    ComposerBeauty composerBeauty2 = composerBeauty;
                    C89219l.m154721d(composerBeauty2, "");
                    return Boolean.valueOf(((C77903b) this.receiver).mo121555a(composerBeauty2));
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f1, code lost:
                if (r1 == null) goto L_0x00f3;
             */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x0140 A[SYNTHETIC] */
            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                // Method dump skipped, instructions count: 361
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.beauty.impl.view.C78017j.C78026i.C78027a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$i$a$b */
            public static final /* synthetic */ class C78029b extends C89217j implements AbstractC89183m<String, String, int[]> {
                static {
                    Covode.recordClassIndex(91119);
                }

                C78029b(C77990c cVar) {
                    super(2, cVar, C77990c.class, "checkComposerNodeExclusion", "checkComposerNodeExclusion(Ljava/lang/String;Ljava/lang/String;)[I", 0);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ int[] invoke(String str, String str2) {
                    String str3 = str;
                    String str4 = str2;
                    C89219l.m154721d(str3, "");
                    C89219l.m154721d(str4, "");
                    return ((C77990c) this.receiver).mo121682a(str3, str4);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$i$a$d */
            public static final /* synthetic */ class C78031d extends C89217j implements AbstractC89183m<String, String, int[]> {
                static {
                    Covode.recordClassIndex(91121);
                }

                C78031d(C77990c cVar) {
                    super(2, cVar, C77990c.class, "checkComposerNodeExclusion", "checkComposerNodeExclusion(Ljava/lang/String;Ljava/lang/String;)[I", 0);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ int[] invoke(String str, String str2) {
                    String str3 = str;
                    String str4 = str2;
                    C89219l.m154721d(str3, "");
                    C89219l.m154721d(str4, "");
                    return ((C77990c) this.receiver).mo121682a(str3, str4);
                }
            }
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f175052a;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89531av avVar = C89624i.m155556b((AbstractC89516am) this.f175054c, C89546bf.f203267b, null, new C78027a(this, null), 2);
                this.f175052a = 1;
                if (avVar.mo144106a(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.f175053b.f175030g) {
                this.f175053b.f175033j.notifyDataSetChanged();
            } else {
                this.f175053b.f175032i.notifyDataSetChanged();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$c */
    static final class C78020c extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C78017j f175044a;

        static {
            Covode.recordClassIndex(91110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78020c(C78017j jVar) {
            super(1);
            this.f175044a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return Boolean.valueOf(this.f175044a.f175037n.mo121685b(str2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$j */
    static final /* synthetic */ class C78032j extends C89217j implements AbstractC89172b<ComposerBeauty, Boolean> {
        static {
            Covode.recordClassIndex(91122);
        }

        C78032j(C77903b bVar) {
            super(1, bVar, C77903b.class, "isBeautyAvailable", "isBeautyAvailable(Lcom/ss/android/ugc/aweme/beauty/ComposerBeauty;)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            return Boolean.valueOf(((C77903b) this.receiver).mo121555a(composerBeauty2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$e */
    public static final class C78022e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C78017j f175046a;

        /* renamed from: b */
        final /* synthetic */ boolean f175047b;

        static {
            Covode.recordClassIndex(91112);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f175047b) {
                RelativeLayout relativeLayout = this.f175046a.f175026c;
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setVisibility(8);
                return;
            }
            RelativeLayout relativeLayout2 = this.f175046a.f175025b;
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout2.setVisibility(8);
        }

        C78022e(C78017j jVar, boolean z) {
            this.f175046a = jVar;
            this.f175047b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$f */
    static final class View$OnClickListenerC78023f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78017j f175048a;

        static {
            Covode.recordClassIndex(91113);
        }

        View$OnClickListenerC78023f(C78017j jVar) {
            this.f175048a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ComposerBeauty composerBeauty = this.f175048a.f175029f;
            if (composerBeauty != null) {
                this.f175048a.mo121730e(composerBeauty);
            }
            C78017j jVar = this.f175048a;
            RelativeLayout relativeLayout = jVar.f175025b;
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setVisibility(0);
            jVar.f175032i.notifyDataSetChanged();
            jVar.mo121728a(true);
            jVar.f175030g = false;
            C78017j.m136318a(jVar, jVar.f175028e, false, false, false, null, 22);
            jVar.f175037n.mo121686c(null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: a */
    public final void mo121480a(BeautyCategory beautyCategory) {
        T t;
        C89219l.m154721d(beautyCategory, "");
        C77818a.m135936a(this.f175032i, beautyCategory.getBeautyList());
        Iterator<T> it = this.f175032i.f174570a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getSelected()) {
                break;
            }
        }
        m136318a(this, t, false, false, false, null, 30);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: c */
    public final void mo121486c(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        C77878d.m135996a(composerBeauty, new C78032j(this.f175037n.mo121683b()), new C78033k(this.f175037n));
        if (this.f175030g) {
            this.f175033j.notifyDataSetChanged();
        } else {
            this.f175032i.notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    public final void mo121730e(ComposerBeauty composerBeauty) {
        AbstractC77871b bVar;
        C89219l.m154721d(composerBeauty, "");
        if (!this.f175036m.f174735m || (bVar = (AbstractC77871b) this.f175037n.f174966d.mo121716a(AbstractC77871b.class)) == null || bVar.mo121475c()) {
            this.f175037n.mo121688e(composerBeauty);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$h */
    public static final class C78025h extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f175050a;

        /* renamed from: b */
        final /* synthetic */ Map f175051b;

        static {
            Covode.recordClassIndex(91115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78025h(boolean z, Map map) {
            super(1);
            this.f175050a = z;
            this.f175051b = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            float f;
            ComposerBeautyExtraBeautify.ItemsBean itemsBean;
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            Map map = this.f175051b;
            if (this.f175050a) {
                int progressValue = composerBeauty2.getProgressValue();
                C89219l.m154721d(composerBeauty2, "");
                List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty2.getBeautifyExtra().getItems();
                if (items == null || (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) C89070n.m154583g((List) items)) == null) {
                    f = (float) progressValue;
                } else {
                    f = C77974h.m136234a(new C77974h.C77975a(itemsBean.getDoubleDirection(), 0, 0, itemsBean.getMax(), itemsBean.getMin(), 0.0f, progressValue, 334));
                }
            } else {
                f = 0.0f;
            }
            map.put(composerBeauty2, Float.valueOf(f));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: a */
    public final void mo121478a(C0484a<String, Integer> aVar) {
        T t;
        T t2;
        if (aVar != null) {
            for (Map.Entry<String, Integer> entry : aVar.entrySet()) {
                Iterator<T> it = this.f175032i.f174570a.iterator();
                while (true) {
                    t = null;
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    if (C89219l.m154714a((Object) entry.getKey(), (Object) t2.getEffect().getEffectId())) {
                        break;
                    }
                }
                T t3 = t2;
                if (t3 != null) {
                    Integer value = entry.getValue();
                    C89219l.m154716b(value, "");
                    t3.setDownloadState(value.intValue());
                }
                Iterator<T> it2 = this.f175033j.f174570a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    if (C89219l.m154714a((Object) entry.getKey(), (Object) next.getEffect().getEffectId())) {
                        t = next;
                        break;
                    }
                }
                T t4 = t;
                if (t4 != null) {
                    Integer value2 = entry.getValue();
                    C89219l.m154716b(value2, "");
                    t4.setDownloadState(value2.intValue());
                }
            }
        }
        this.f175032i.notifyDataSetChanged();
        this.f175033j.notifyDataSetChanged();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c
    /* renamed from: a */
    public final void mo121481a(List<BeautyCategory> list) {
        C89219l.m154721d(list, "");
        for (T t : list) {
            this.f175031h.put(t, t.getBeautyList());
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        StyleRecyclerView styleRecyclerView = this.f175038o;
        C89219l.m154716b(styleRecyclerView, "");
        styleRecyclerView.setLayoutManager(linearLayoutManager);
        StyleRecyclerView styleRecyclerView2 = this.f175038o;
        C89219l.m154716b(styleRecyclerView2, "");
        styleRecyclerView2.setAdapter(this.f175032i);
        StyleRecyclerView styleRecyclerView3 = this.f175038o;
        C89219l.m154716b(styleRecyclerView3, "");
        RecyclerView.AbstractC1356f itemAnimator = styleRecyclerView3.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f4470l = 0;
        }
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
        linearLayoutManager2.mo4356b(0);
        StyleRecyclerView styleRecyclerView4 = this.f175040q;
        C89219l.m154716b(styleRecyclerView4, "");
        styleRecyclerView4.setLayoutManager(linearLayoutManager2);
        StyleRecyclerView styleRecyclerView5 = this.f175040q;
        C89219l.m154716b(styleRecyclerView5, "");
        styleRecyclerView5.setAdapter(this.f175033j);
        StyleRecyclerView styleRecyclerView6 = this.f175038o;
        C89219l.m154716b(styleRecyclerView6, "");
        RecyclerView.AbstractC1356f itemAnimator2 = styleRecyclerView6.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f4470l = 0;
        }
        if (this.f175030g) {
            m136318a(this, this.f175029f, true, false, false, null, 20);
        } else {
            m136318a(this, this.f175028e, false, false, false, null, 22);
        }
        this.f175039p.setOnClickListener(new View$OnClickListenerC78023f(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$g */
    public static final class C78024g extends AbstractC89220m implements AbstractC89183m<List<? extends ComposerBeauty>, AbstractC89172b<? super ComposerBeauty, ? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C78024g f175049a = new C78024g();

        static {
            Covode.recordClassIndex(91114);
        }

        C78024g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(List<? extends ComposerBeauty> list, AbstractC89172b<? super ComposerBeauty, ? extends C89391z> bVar) {
            m136338a(list, bVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m136338a(List<ComposerBeauty> list, AbstractC89172b<? super ComposerBeauty, C89391z> bVar) {
            C89219l.m154721d(bVar, "");
            if (list != null) {
                for (T t : list) {
                    if (t.isCollectionType()) {
                        List<ComposerBeauty> childList = t.getChildList();
                        if (childList != null) {
                            Iterator<T> it = childList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                T t2 = next;
                                if (t2.getSelected() && !t2.getExtra().isNone()) {
                                    if (next != null) {
                                        bVar.invoke(next);
                                    }
                                }
                            }
                        }
                    } else {
                        bVar.invoke(t);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$k */
    static final /* synthetic */ class C78033k extends C89217j implements AbstractC89183m<String, String, int[]> {
        static {
            Covode.recordClassIndex(91123);
        }

        C78033k(C77990c cVar) {
            super(2, cVar, C77990c.class, "checkComposerNodeExclusion", "checkComposerNodeExclusion(Ljava/lang/String;Ljava/lang/String;)[I", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ int[] invoke(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            return ((C77990c) this.receiver).mo121682a(str3, str4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$d */
    static final class C78021d extends AbstractC89220m implements AbstractC89183m<ComposerBeauty, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78017j f175045a;

        static {
            Covode.recordClassIndex(91111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78021d(C78017j jVar) {
            super(2);
            this.f175045a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty, Integer num) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            num.intValue();
            C89219l.m154721d(composerBeauty2, "");
            C78017j jVar = this.f175045a;
            C89219l.m154721d(composerBeauty2, "");
            jVar.mo121729d(composerBeauty2);
            jVar.f175037n.mo121678a(composerBeauty2);
            C78017j.m136318a(jVar, composerBeauty2, true, true, false, null, 24);
            C77990c cVar = jVar.f175037n;
            C89219l.m154721d(composerBeauty2, "");
            cVar.f174963a.mo121616g(composerBeauty2);
            jVar.mo121730e(composerBeauty2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$a */
    static final class C78018a extends AbstractC89220m implements AbstractC89183m<ComposerBeauty, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78017j f175041a;

        static {
            Covode.recordClassIndex(91108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78018a(C78017j jVar) {
            super(2);
            this.f175041a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty, Integer num) {
            T t;
            ComposerBeauty composerBeauty2 = composerBeauty;
            num.intValue();
            C89219l.m154721d(composerBeauty2, "");
            C78017j jVar = this.f175041a;
            String d = jVar.f175037n.mo121687d(composerBeauty2);
            C89219l.m154721d(composerBeauty2, "");
            jVar.mo121729d(composerBeauty2);
            jVar.f175037n.mo121678a(composerBeauty2);
            T t2 = null;
            if (composerBeauty2.isCollectionType()) {
                jVar.f175028e = composerBeauty2;
                jVar.f175037n.mo121684b(composerBeauty2);
                TextView textView = jVar.f175027d;
                C89219l.m154716b(textView, "");
                textView.setText(composerBeauty2.getEffect().getName());
                RelativeLayout relativeLayout = jVar.f175026c;
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setVisibility(0);
                jVar.mo121728a(false);
                jVar.f175030g = true;
                jVar.f175037n.mo121686c(null);
                C77990c cVar = jVar.f175037n;
                C89219l.m154721d(composerBeauty2, "");
                AbstractC78056f.AbstractC78058b bVar = cVar.f174964b;
                if (bVar != null) {
                    bVar.mo22669b(composerBeauty2);
                }
                List<ComposerBeauty> childList = composerBeauty2.getChildList();
                if (childList != null) {
                    C77818a.m135936a(jVar.f175033j, childList);
                    C0484a<String, Integer> value = jVar.f175037n.f174963a.mo121617h().getValue();
                    if (value != null) {
                        for (Map.Entry<String, Integer> entry : value.entrySet()) {
                            Iterator<T> it = jVar.f175033j.f174570a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                if (C89219l.m154714a((Object) t.getEffect().getEffectId(), (Object) entry.getKey())) {
                                    break;
                                }
                            }
                            T t3 = t;
                            if (t3 != null) {
                                t3.getDownloadState();
                                Integer value2 = entry.getValue();
                                if (value2 != null) {
                                    value2.intValue();
                                }
                            }
                        }
                    }
                    jVar.f175033j.notifyDataSetChanged();
                    Iterator<T> it2 = childList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (C89219l.m154714a((Object) next.getEffect().getResourceId(), (Object) d)) {
                            t2 = next;
                            break;
                        }
                    }
                    C78017j.m136318a(jVar, t2, true, false, false, null, 28);
                }
            } else {
                jVar.f175037n.mo121684b(composerBeauty2);
                C78017j.m136318a(jVar, composerBeauty2, false, true, false, null, 26);
                C77990c cVar2 = jVar.f175037n;
                C89219l.m154721d(composerBeauty2, "");
                cVar2.f174963a.mo121614f(composerBeauty2);
                jVar.mo121730e(composerBeauty2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo121727a(String str, boolean z) {
        ArrayList arrayList;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        Map<BeautyCategory, List<ComposerBeauty>> map = this.f175031h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<BeautyCategory, List<ComposerBeauty>> entry : map.entrySet()) {
            if (C89219l.m154714a((Object) entry.getKey().getCategoryResponse().getId(), (Object) str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List list = (List) C89070n.m154565c((Iterable) linkedHashMap.values());
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!((ComposerBeauty) obj).getExtra().isNone()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C78024g.m136338a(arrayList, new C78025h(z, linkedHashMap2));
        C77990c cVar = this.f175037n;
        C89219l.m154721d(linkedHashMap2, "");
        AbstractC77873d dVar = (AbstractC77873d) cVar.f174966d.mo121716a(AbstractC77873d.class);
        if (dVar != null) {
            dVar.mo121495a(linkedHashMap2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$b */
    static final class C78019b extends AbstractC89220m implements AbstractC89187q<String, Boolean, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77818a f175042a;

        /* renamed from: b */
        final /* synthetic */ C78017j f175043b;

        static {
            Covode.recordClassIndex(91109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78019b(C77818a aVar, C78017j jVar) {
            super(3);
            this.f175042a = aVar;
            this.f175043b = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(String str, Boolean bool, String str2) {
            String str3 = str;
            boolean booleanValue = bool.booleanValue();
            String str4 = str2;
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            this.f175043b.f175037n.mo121680a(str3, booleanValue);
            if (!booleanValue) {
                Iterator<T> it = this.f175042a.f174570a.iterator();
                while (it.hasNext()) {
                    it.next().setSelected(false);
                }
                this.f175043b.f175037n.mo121681a(false);
                AbstractC89183m<? super Context, ? super String, C89391z> mVar = C77886a.f174747d;
                if (mVar != null) {
                    Context context = this.f175043b.f175034k;
                    String string = this.f175043b.f175034k.getString(C71977b.f161299e);
                    C89219l.m154716b(string, "");
                    mVar.invoke(context, string);
                }
            }
            this.f175043b.f175037n.mo121677a();
            C41093a.m82765c("setSwitchStatus categoryId = " + str3 + ",value = " + booleanValue);
            this.f175043b.mo121727a(str3, booleanValue);
            this.f175043b.f175037n.mo121679a(str4);
            return C89391z.f203057a;
        }
    }

    public C78017j(Context context, View view, C77861e eVar, C77990c cVar) {
        C78019b bVar;
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        this.f175034k = context;
        this.f175035l = view;
        this.f175036m = eVar;
        this.f175037n = cVar;
        this.f175025b = (RelativeLayout) view.findViewById(R.id.dkz);
        StyleRecyclerView styleRecyclerView = (StyleRecyclerView) view.findViewById(R.id.do3);
        this.f175038o = styleRecyclerView;
        this.f175026c = (RelativeLayout) view.findViewById(R.id.dkx);
        this.f175039p = (FrameLayout) view.findViewById(R.id.b3u);
        this.f175027d = (TextView) view.findViewById(R.id.etv);
        StyleRecyclerView styleRecyclerView2 = (StyleRecyclerView) view.findViewById(R.id.do2);
        this.f175040q = styleRecyclerView2;
        this.f175031h = new LinkedHashMap();
        C77859d dVar = eVar.f174691c;
        C89219l.m154716b(styleRecyclerView, "");
        C77818a aVar = new C77818a(dVar, styleRecyclerView);
        aVar.f174571b = new C78018a(this);
        C78020c cVar2 = null;
        if (eVar.f174691c.f174685q) {
            bVar = new C78019b(aVar, this);
        } else {
            bVar = null;
        }
        aVar.f174572c = bVar;
        aVar.f174573d = eVar.f174691c.f174685q ? new C78020c(this) : cVar2;
        this.f175032i = aVar;
        C77859d dVar2 = eVar.f174691c;
        C89219l.m154716b(styleRecyclerView2, "");
        C77818a aVar2 = new C77818a(dVar2, styleRecyclerView2);
        aVar2.f174571b = new C78021d(this);
        this.f175033j = aVar2;
    }

    /* renamed from: a */
    private void m136317a(ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3, ComposerBeauty composerBeauty2) {
        boolean z4;
        boolean z5;
        if (z3) {
            this.f175037n.mo121686c(composerBeauty2);
        }
        if (composerBeauty == null) {
            this.f175037n.mo121681a(false);
            return;
        }
        if (z) {
            for (T t : this.f175033j.f174570a) {
                if (!C89219l.m154714a((Object) t, (Object) composerBeauty) || !t.getEnable()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                t.setSelected(z5);
            }
        } else {
            for (T t2 : this.f175032i.f174570a) {
                if (!C89219l.m154714a((Object) t2, (Object) composerBeauty) || !t2.getEnable()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                t2.setSelected(z4);
            }
        }
        if (composerBeauty.isCollectionType()) {
            this.f175037n.mo121681a(false);
            return;
        }
        if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
            this.f175037n.mo121681a(false);
        } else {
            this.f175037n.mo121681a(true);
        }
        if (C77878d.m135999b(composerBeauty)) {
            this.f175029f = composerBeauty;
        } else {
            this.f175028e = composerBeauty;
        }
        if (C77878d.m136005g(composerBeauty)) {
            Map<BeautyCategory, List<ComposerBeauty>> map = this.f175031h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<BeautyCategory, List<ComposerBeauty>> entry : map.entrySet()) {
                if (C89219l.m154714a((Object) entry.getKey().getCategoryResponse().getId(), (Object) composerBeauty.getCategoryId())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List list = (List) C89070n.m154565c((Iterable) linkedHashMap.values());
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!((ComposerBeauty) obj).getExtra().isNone()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    C77990c cVar = this.f175037n;
                    C89219l.m154721d(arrayList2, "");
                    AbstractC77873d dVar = (AbstractC77873d) cVar.f174966d.mo121716a(AbstractC77873d.class);
                    if (dVar != null) {
                        dVar.mo121494a(arrayList2);
                    }
                }
            }
        } else {
            C77990c cVar2 = this.f175037n;
            C89219l.m154721d(composerBeauty, "");
            AbstractC77874e eVar = (AbstractC77874e) cVar2.f174966d.mo121716a(AbstractC77874e.class);
            if (eVar != null) {
                eVar.mo121500a(composerBeauty, z2, true);
            }
        }
        this.f175037n.mo121677a();
    }

    /* renamed from: a */
    public static /* synthetic */ void m136318a(C78017j jVar, ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3, ComposerBeauty composerBeauty2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        if ((i & 16) != 0) {
            composerBeauty2 = composerBeauty;
        }
        jVar.m136317a(composerBeauty, z, z2, z3, composerBeauty2);
    }
}
