package com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.effect.C46360i;
import com.p2082ss.android.ugc.aweme.effect.EffectModel;
import com.p2082ss.android.ugc.aweme.effect.p2889b.C46300a;
import com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.C46310a;
import com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50896j;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import com.p2082ss.android.ugc.tools.view.base.AbstractC84941d;
import com.p2082ss.android.ugc.tools.view.widget.AVStatusView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.StoryEditEffectView */
public final class StoryEditEffectView implements AbstractC33974au {

    /* renamed from: a */
    AVStatusView f172743a;

    /* renamed from: b */
    public AbstractC84941d f172744b;

    /* renamed from: c */
    RecyclerView f172745c;

    /* renamed from: d */
    public C77001b f172746d;

    /* renamed from: e */
    public final AbstractC77000a f172747e;

    /* renamed from: f */
    private final AbstractC89244h f172748f = C89250i.m154773a((AbstractC89171a) C76994a.f172750a);

    /* renamed from: g */
    private final ViewGroup f172749g;

    static {
        Covode.recordClassIndex(89992);
    }

    /* renamed from: c */
    private final C46300a m134606c() {
        return (C46300a) this.f172748f.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.StoryEditEffectView$a */
    static final class C76994a extends AbstractC89220m implements AbstractC89171a<C46300a> {

        /* renamed from: a */
        public static final C76994a f172750a = new C76994a();

        static {
            Covode.recordClassIndex(89993);
        }

        C76994a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C46300a invoke() {
            C46300a.C46302b bVar = new C46300a.C46302b();
            bVar.f107950a = 3;
            bVar.f107951b = new C46310a();
            return bVar.mo78796a();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    private final void onDestroy() {
        C77001b bVar = this.f172746d;
        if (bVar == null) {
            C89219l.m154710a("viewAdapter");
        }
        bVar.f172761e.mo78793b(bVar);
        m134606c().mo78795c();
    }

    /* renamed from: a */
    public final void mo120537a() {
        AbstractC84941d dVar = this.f172744b;
        if (dVar == null) {
            C89219l.m154710a("transitionView");
        }
        dVar.mo86260c();
    }

    /* renamed from: b */
    public final void mo120539b() {
        AVStatusView aVStatusView = this.f172743a;
        if (aVStatusView == null) {
            C89219l.m154710a("statusView");
        }
        aVStatusView.setVisibility(0);
        RecyclerView recyclerView = this.f172745c;
        if (recyclerView == null) {
            C89219l.m154710a("effectRecyclerView");
        }
        recyclerView.setVisibility(8);
        AVStatusView aVStatusView2 = this.f172743a;
        if (aVStatusView2 == null) {
            C89219l.m154710a("statusView");
        }
        aVStatusView2.mo129846b();
        this.f172747e.mo120531b().mo78864a(new C76999f(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.StoryEditEffectView$e */
    public static final class C76998e extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ StoryEditEffectView f172754a;

        static {
            Covode.recordClassIndex(89997);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76998e(StoryEditEffectView storyEditEffectView) {
            this.f172754a = storyEditEffectView;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f172754a.f172747e.mo120533h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.StoryEditEffectView$f */
    public static final class C76999f implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ StoryEditEffectView f172755a;

        static {
            Covode.recordClassIndex(89998);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76999f(StoryEditEffectView storyEditEffectView) {
            this.f172755a = storyEditEffectView;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            AVStatusView aVStatusView = this.f172755a.f172743a;
            if (aVStatusView == null) {
                C89219l.m154710a("statusView");
            }
            aVStatusView.mo129848d();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            EffectCategoryResponseTemplate effectCategoryResponseTemplate;
            List<Effect> totalEffects;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (effectChannelResponse2 != null) {
                List<EffectCategoryResponse> categoryResponseList = effectChannelResponse2.getCategoryResponseList();
                int i = 0;
                if (!(categoryResponseList == null || categoryResponseList.isEmpty() || (effectCategoryResponseTemplate = (EffectCategoryResponseTemplate) C89070n.m154561b((List) effectChannelResponse2.getCategoryResponseList(), 0)) == null || (totalEffects = effectCategoryResponseTemplate.getTotalEffects()) == null || totalEffects.isEmpty())) {
                    StoryEditEffectView storyEditEffectView = this.f172755a;
                    AVStatusView aVStatusView = storyEditEffectView.f172743a;
                    if (aVStatusView == null) {
                        C89219l.m154710a("statusView");
                    }
                    aVStatusView.mo129845a();
                    AVStatusView aVStatusView2 = storyEditEffectView.f172743a;
                    if (aVStatusView2 == null) {
                        C89219l.m154710a("statusView");
                    }
                    aVStatusView2.setVisibility(8);
                    RecyclerView recyclerView = storyEditEffectView.f172745c;
                    if (recyclerView == null) {
                        C89219l.m154710a("effectRecyclerView");
                    }
                    recyclerView.setVisibility(0);
                    C77001b a = StoryEditEffectView.m134605a(this.f172755a);
                    List<Effect> totalEffects2 = effectChannelResponse2.getCategoryResponseList().get(0).getTotalEffects();
                    C89219l.m154721d(totalEffects2, "");
                    a.f172760d = -1;
                    a.f172758a.clear();
                    a.f172758a.add(C77001b.f172756g);
                    if (true ^ totalEffects2.isEmpty()) {
                        a.f172758a.addAll(totalEffects2);
                    }
                    List<Effect> list = a.f172758a;
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C89070n.m154520a();
                        }
                        arrayList.add(C46360i.m89446a(i, t, ""));
                        i = i2;
                    }
                    a.mo78740a(arrayList);
                    return;
                }
            }
            AVStatusView aVStatusView3 = this.f172755a.f172743a;
            if (aVStatusView3 == null) {
                C89219l.m154710a("statusView");
            }
            aVStatusView3.mo129847c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.StoryEditEffectView$c */
    static final class View$OnClickListenerC76996c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StoryEditEffectView f172752a;

        static {
            Covode.recordClassIndex(89995);
        }

        View$OnClickListenerC76996c(StoryEditEffectView storyEditEffectView) {
            this.f172752a = storyEditEffectView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f172752a.mo120539b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.StoryEditEffectView$d */
    static final class View$OnClickListenerC76997d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StoryEditEffectView f172753a;

        static {
            Covode.recordClassIndex(89996);
        }

        View$OnClickListenerC76997d(StoryEditEffectView storyEditEffectView) {
            this.f172753a = storyEditEffectView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f172753a.mo120537a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C77001b m134605a(StoryEditEffectView storyEditEffectView) {
        C77001b bVar = storyEditEffectView.f172746d;
        if (bVar == null) {
            C89219l.m154710a("viewAdapter");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo120538a(String str) {
        if (this.f172746d != null) {
            C77001b bVar = this.f172746d;
            if (bVar == null) {
                C89219l.m154710a("viewAdapter");
            }
            C77001b bVar2 = this.f172746d;
            if (bVar2 == null) {
                C89219l.m154710a("viewAdapter");
            }
            bVar.mo120542a(bVar2.mo120543a(str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.StoryEditEffectView$b */
    static final class C76995b extends AbstractC89220m implements AbstractC89187q<Effect, EffectModel, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryEditEffectView f172751a;

        static {
            Covode.recordClassIndex(89994);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76995b(StoryEditEffectView storyEditEffectView) {
            super(3);
            this.f172751a = storyEditEffectView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Effect effect, EffectModel effectModel, Integer num) {
            EffectModel effectModel2 = effectModel;
            StoryEditEffectView.m134605a(this.f172751a).mo120544b(num.intValue());
            if (effectModel2 == null) {
                this.f172751a.f172747e.mo120532g();
            } else {
                this.f172751a.f172747e.mo120530a(effectModel2);
            }
            return C89391z.f203057a;
        }
    }

    public StoryEditEffectView(AbstractC1204m mVar, ViewGroup viewGroup, AbstractC77000a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(5047);
        this.f172749g = viewGroup;
        this.f172747e = aVar;
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b2_, viewGroup, false);
        viewGroup.addView(a);
        C89219l.m154716b(a, "");
        this.f172744b = new C50896j(a, a.findViewById(R.id.cd5));
        View findViewById = a.findViewById(R.id.at3);
        C89219l.m154716b(findViewById, "");
        this.f172745c = (RecyclerView) findViewById;
        a.findViewById(R.id.fgg).setOnClickListener(new View$OnClickListenerC76997d(this));
        a.findViewById(R.id.b5f).setOnClickListener(new C76998e(this));
        RecyclerView recyclerView = this.f172745c;
        if (recyclerView == null) {
            C89219l.m154710a("effectRecyclerView");
        }
        this.f172746d = new C77001b(recyclerView, m134606c(), new C76995b(this));
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        C77001b bVar = this.f172746d;
        if (bVar == null) {
            C89219l.m154710a("viewAdapter");
        }
        recyclerView.setAdapter(bVar);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.eq, (ViewGroup) null);
        inflate.findViewById(R.id.f2l).setOnClickListener(new View$OnClickListenerC76996c(this));
        ((TextView) inflate.findViewById(R.id.f2m)).setText(R.string.g5a);
        View findViewById2 = a.findViewById(R.id.cfy);
        C89219l.m154716b(findViewById2, "");
        AVStatusView aVStatusView = (AVStatusView) findViewById2;
        this.f172743a = aVStatusView;
        if (aVStatusView == null) {
            C89219l.m154710a("statusView");
        }
        AVStatusView.C84988a a2 = AVStatusView.C84988a.m146075a(viewGroup.getContext()).mo129851a(R.string.g5_).mo129852a(inflate);
        a2.f190052g = 1;
        aVStatusView.setBuilder(a2);
        AbstractC84941d dVar = this.f172744b;
        if (dVar == null) {
            C89219l.m154710a("transitionView");
        }
        dVar.mo86263f();
        mo120539b();
        mVar.getLifecycle().mo4012a(this);
        MethodCollector.m26664o(5047);
    }
}
