package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67528bi;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67688c;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67694f;
import com.p2082ss.android.ugc.aweme.search.p3705s.C67724d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.a */
public abstract class AbstractView$OnAttachStateChangeListenerC41749a extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener {

    /* renamed from: h */
    public static final C41751a f97392h = new C41751a((byte) 0);

    /* renamed from: a */
    public final String f97393a;

    /* renamed from: b */
    public final AnimationImageView f97394b;

    /* renamed from: c */
    public boolean f97395c;

    /* renamed from: d */
    final AbstractC89244h f97396d;

    /* renamed from: e */
    public final AbstractC42664al.AbstractC42668d f97397e;

    /* renamed from: f */
    public final SearchIntermediateViewModel f97398f;

    /* renamed from: g */
    public final Fragment f97399g;

    static {
        Covode.recordClassIndex(49664);
    }

    public void onViewAttachedToWindow(View view) {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.a$a */
    public static final class C41751a {
        static {
            Covode.recordClassIndex(49666);
        }

        private C41751a() {
        }

        public /* synthetic */ C41751a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.a$c */
    public static final class C41753c implements Animator.AnimatorListener {
        static {
            Covode.recordClassIndex(49668);
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        C41753c() {
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        this.f97394b.mo5837e();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        if (this.f97395c) {
            this.f97394b.mo5831b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.a$d */
    static final class C41754d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnAttachStateChangeListenerC41749a f97404a;

        static {
            Covode.recordClassIndex(49669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41754d(AbstractView$OnAttachStateChangeListenerC41749a aVar) {
            super(0);
            this.f97404a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            C33943c<C67678d> openSearchParam;
            C67678d value;
            C67674b searchEnterParam;
            String enterSearchFrom;
            SearchIntermediateViewModel searchIntermediateViewModel = this.f97404a.f97398f;
            if (searchIntermediateViewModel == null || (openSearchParam = searchIntermediateViewModel.getOpenSearchParam()) == null || (value = openSearchParam.getValue()) == null || (searchEnterParam = value.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam.getEnterSearchFrom()) == null) {
                return "";
            }
            return enterSearchFrom;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        onPause();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.a$b */
    static final class View$OnClickListenerC41752b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnAttachStateChangeListenerC41749a f97401a;

        /* renamed from: b */
        final /* synthetic */ Word f97402b;

        /* renamed from: c */
        final /* synthetic */ String f97403c;

        static {
            Covode.recordClassIndex(49667);
        }

        View$OnClickListenerC41752b(AbstractView$OnAttachStateChangeListenerC41749a aVar, Word word, String str) {
            this.f97401a = aVar;
            this.f97402b = word;
            this.f97403c = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC42664al.AbstractC42668d dVar = this.f97401a.f97397e;
            if (dVar != null) {
                dVar.mo72868a(this.f97402b, this.f97401a.getPosition());
            }
            int position = this.f97401a.getPosition();
            Word word = this.f97402b;
            String str = this.f97403c;
            String str2 = this.f97401a.f97393a;
            if (str2 == null || str2.length() <= 0) {
                str2 = (String) this.f97401a.f97396d.getValue();
            }
            View view2 = this.f97401a.itemView;
            C89219l.m154716b(view2, "");
            Context context = view2.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ActivityC0945e eVar = (ActivityC0945e) context;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(eVar, "");
            if (word != null) {
                ((C67530bj) ((C67530bj) new C67528bi().mo106453i(word.getId())).mo106475w(word.getWord()).mo106484d(str)).mo106477y(str2).mo106469a(SearchEnterViewModel.C42997a.m85830a(eVar).mo73185b().obtainLogData("tab_name")).mo106474v("recom_search").mo106471d(Integer.valueOf(position)).mo106475w(word.getWord()).mo106464A(word.getWordType()).mo106453i(word.getId()).mo96792f();
            }
        }
    }

    /* renamed from: a */
    public void mo70930a(Word word, String str) {
        SearchIntermediateViewModel searchIntermediateViewModel;
        C33943c<Integer> intermediateState;
        Integer value;
        C89219l.m154721d(str, "");
        this.itemView.setOnClickListener(new View$OnClickListenerC41752b(this, word, str));
        this.f97394b.setVisibility(8);
        this.f97395c = false;
        if (word != null) {
            C89219l.m154721d(word, "");
            if (C89219l.m154714a((Object) word.getWordType(), (Object) "10") || C89219l.m154714a((Object) word.getWordType(), (Object) "2") || C89219l.m154714a((Object) word.getWordType(), (Object) "6")) {
                this.f97394b.setVisibility(0);
                AnimationImageView animationImageView = this.f97394b;
                View view = this.itemView;
                C89219l.m154716b(view, "");
                animationImageView.setImageDrawable(view.getResources().getDrawable(C67724d.m119891a(word)));
                if (C89219l.m154714a((Object) word.getWordType(), (Object) "10") && (searchIntermediateViewModel = this.f97398f) != null && (intermediateState = searchIntermediateViewModel.getIntermediateState()) != null && (value = intermediateState.getValue()) != null && value.intValue() == 1 && !((LottieAnimationView) this.f97394b).f5900b.mo6025g()) {
                    hashCode();
                    this.f97395c = true;
                    this.f97394b.setAnimation("search_LIVE_1color.json");
                    this.f97394b.mo5826a();
                    this.f97394b.setRepeatMode(1);
                    this.f97394b.setRepeatCount(-1);
                    this.f97394b.mo5828a(new C41753c());
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractView$OnAttachStateChangeListenerC41749a(View view, AbstractC42664al.AbstractC42668d dVar, SearchIntermediateViewModel searchIntermediateViewModel, Fragment fragment) {
        super(view);
        String str;
        C33943c<Integer> intermediateState;
        C89219l.m154721d(view, "");
        this.f97397e = dVar;
        this.f97398f = searchIntermediateViewModel;
        this.f97399g = fragment;
        view.getContext();
        if (!(fragment == null || searchIntermediateViewModel == null || (intermediateState = searchIntermediateViewModel.getIntermediateState()) == null)) {
            intermediateState.observe(fragment, new AbstractC1214u(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.AbstractView$OnAttachStateChangeListenerC41749a.C417501 */

                /* renamed from: a */
                final /* synthetic */ AbstractView$OnAttachStateChangeListenerC41749a f97400a;

                static {
                    Covode.recordClassIndex(49665);
                }

                {
                    this.f97400a = r1;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    Integer num = (Integer) obj;
                    if (num != null) {
                        if (num.intValue() == 1) {
                            this.f97400a.onResume();
                        } else if (num.intValue() == 2) {
                            this.f97400a.onPause();
                        } else if (num.intValue() == 0) {
                            this.f97400a.onPause();
                        }
                    }
                }
            });
        }
        view.addOnAttachStateChangeListener(this);
        C67694f b = C67688c.C67689a.m119841b();
        if (b != null) {
            str = b.f151724b;
        } else {
            str = null;
        }
        this.f97393a = str;
        View findViewById = view.findViewById(R.id.fjl);
        C89219l.m154716b(findViewById, "");
        this.f97394b = (AnimationImageView) findViewById;
        this.f97396d = C89250i.m154773a((AbstractC89171a) new C41754d(this));
    }
}
