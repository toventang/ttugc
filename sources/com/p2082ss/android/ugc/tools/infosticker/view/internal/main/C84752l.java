package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84640a;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84641b;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84692d;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84694f;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84696g;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84697h;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84698i;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84699j;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.provider.C84848a;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.search.C84867a;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84632c;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84633d;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84634e;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84635f;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.C84636g;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.EnumC84637h;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.EnumC84638i;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.EnumC84639j;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84443b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84457n;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.base.AbstractC84940c;
import com.p2082ss.android.ugc.tools.view.base.AbstractC84941d;
import com.p2082ss.android.ugc.tools.view.base.C84933a;
import com.p2082ss.android.ugc.tools.view.base.C84943f;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85029d;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85030e;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l */
public class C84752l implements AbstractC84635f {

    /* renamed from: A */
    public final C88411a f189381A;

    /* renamed from: B */
    ViewGroup f189382B;

    /* renamed from: C */
    public final ViewGroup f189383C;

    /* renamed from: D */
    final AbstractC1204m f189384D;

    /* renamed from: E */
    public final AbstractC84701l f189385E;

    /* renamed from: a */
    private AbstractC84940c f189386a;

    /* renamed from: b */
    private View f189387b;

    /* renamed from: c */
    private final AbstractC89244h f189388c;

    /* renamed from: d */
    private boolean f189389d;

    /* renamed from: e */
    private final AbstractC88969g<C89378p<Boolean, String>> f189390e;

    /* renamed from: f */
    private final AbstractC88969g<EnumC85026a> f189391f;

    /* renamed from: g */
    private final boolean f189392g;

    /* renamed from: h */
    public final C84785c f189393h;

    /* renamed from: i */
    AbstractC84941d f189394i;

    /* renamed from: j */
    public AbstractC84694f f189395j;

    /* renamed from: k */
    public AbstractC84696g f189396k;

    /* renamed from: l */
    public AbstractC84699j f189397l;

    /* renamed from: m */
    AbstractC84641b f189398m;

    /* renamed from: n */
    final AbstractC89244h f189399n;

    /* renamed from: o */
    final AbstractC89244h f189400o;

    /* renamed from: p */
    final AbstractC89244h f189401p;

    /* renamed from: q */
    final AbstractC89244h f189402q;

    /* renamed from: r */
    final AbstractC89244h f189403r;

    /* renamed from: s */
    boolean f189404s;

    /* renamed from: t */
    final AbstractC88969g<Boolean> f189405t;

    /* renamed from: u */
    final AbstractC88969g<C89378p<AbstractC84694f.C84695a, Integer>> f189406u;

    /* renamed from: v */
    final AbstractC88969g<C89378p<Boolean, String>> f189407v;

    /* renamed from: w */
    public final AbstractC88969g<C89378p<Effect, Boolean>> f189408w;

    /* renamed from: x */
    public final AbstractC88969g<C89378p<ProviderEffect, Boolean>> f189409x;

    /* renamed from: y */
    public final AbstractC88969g<C89378p<InfoStickerEffect, Boolean>> f189410y;

    /* renamed from: z */
    public final AbstractC88969g<C84636g> f189411z;

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$e */
    static final class View$OnTouchListenerC84788e implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC84788e f189479a = new View$OnTouchListenerC84788e();

        static {
            Covode.recordClassIndex(98764);
        }

        View$OnTouchListenerC84788e() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$f */
    static final class View$OnClickListenerC84789f implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC84789f f189480a = new View$OnClickListenerC84789f();

        static {
            Covode.recordClassIndex(98765);
        }

        View$OnClickListenerC84789f() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$y */
    static final class C84808y<T> implements AbstractC88433f<Integer> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189499a;

        static {
            Covode.recordClassIndex(98784);
        }

        C84808y(C84752l lVar) {
            this.f189499a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Integer num) {
        }
    }

    static {
        Covode.recordClassIndex(98728);
    }

    /* renamed from: i */
    public final AbstractC84632c<ProviderEffect> mo129661i() {
        return (AbstractC84632c) this.f189388c.getValue();
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$an */
    public static final class C84767an extends C84848a {

        /* renamed from: a */
        final /* synthetic */ C84752l f189429a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f189430b;

        /* renamed from: c */
        final /* synthetic */ int f189431c;

        static {
            Covode.recordClassIndex(98743);
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$an$a */
        static final class C84768a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C84767an f189432a;

            static {
                Covode.recordClassIndex(98744);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C84768a(C84767an anVar) {
                super(0);
                this.f189432a = anVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f189432a.mo129586u();
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
        /* renamed from: b */
        public final RecyclerView.ViewHolder mo129578b(ViewGroup viewGroup) {
            RecyclerView.ViewHolder viewHolder;
            C89219l.m154721d(viewGroup, "");
            AbstractC89183m<? super ViewGroup, ? super AbstractC89171a<C89391z>, ? extends RecyclerView.ViewHolder> mVar = this.f189429a.f189393h.f189470l.f189413b;
            if (mVar == null || (viewHolder = (RecyclerView.ViewHolder) mVar.invoke(viewGroup, new C84768a(this))) == null) {
                return super.mo129578b(viewGroup);
            }
            return viewHolder;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
        /* renamed from: a */
        public final void mo129573a(RecyclerView.ViewHolder viewHolder, EnumC85026a aVar) {
            C89219l.m154721d(viewHolder, "");
            C89219l.m154721d(aVar, "");
            AbstractC89183m<? super RecyclerView.ViewHolder, ? super EnumC85026a, C89391z> mVar = this.f189429a.f189393h.f189470l.f189414c;
            if (mVar == null || mVar.invoke(viewHolder, aVar) == null) {
                super.mo129573a(viewHolder, aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84767an(C84752l lVar, ViewGroup viewGroup, int i, Context context, AbstractC1204m mVar, AbstractC84697h hVar, AbstractC84700k kVar, ViewGroup viewGroup2, int i2, boolean z, AbstractC89172b bVar) {
            super(context, mVar, hVar, kVar, viewGroup2, i2, z, bVar);
            this.f189429a = lVar;
            this.f189430b = viewGroup;
            this.f189431c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ao */
    public static final class C84769ao extends C84867a {

        /* renamed from: a */
        final /* synthetic */ C84752l f189433a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f189434b;

        /* renamed from: c */
        final /* synthetic */ int f189435c;

        static {
            Covode.recordClassIndex(98745);
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ao$a */
        static final class C84770a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C84769ao f189436a;

            static {
                Covode.recordClassIndex(98746);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C84770a(C84769ao aoVar) {
                super(0);
                this.f189436a = aoVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f189436a.mo129586u();
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
        /* renamed from: b */
        public final RecyclerView.ViewHolder mo129578b(ViewGroup viewGroup) {
            RecyclerView.ViewHolder viewHolder;
            C89219l.m154721d(viewGroup, "");
            AbstractC89183m<? super ViewGroup, ? super AbstractC89171a<C89391z>, ? extends RecyclerView.ViewHolder> mVar = this.f189433a.f189393h.f189471m.f189413b;
            if (mVar == null || (viewHolder = (RecyclerView.ViewHolder) mVar.invoke(viewGroup, new C84770a(this))) == null) {
                return super.mo129578b(viewGroup);
            }
            return viewHolder;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
        /* renamed from: a */
        public final void mo129573a(RecyclerView.ViewHolder viewHolder, EnumC85026a aVar) {
            C89219l.m154721d(viewHolder, "");
            C89219l.m154721d(aVar, "");
            AbstractC89183m<? super RecyclerView.ViewHolder, ? super EnumC85026a, C89391z> mVar = this.f189433a.f189393h.f189471m.f189414c;
            if (mVar == null || mVar.invoke(viewHolder, aVar) == null) {
                super.mo129573a(viewHolder, aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84769ao(C84752l lVar, ViewGroup viewGroup, int i, Context context, AbstractC1204m mVar, AbstractC84698i iVar, AbstractC84700k kVar, ViewGroup viewGroup2, int i2, AbstractC89172b bVar, String str) {
            super(context, mVar, iVar, kVar, viewGroup2, i2, str, bVar);
            this.f189433a = lVar;
            this.f189434b = viewGroup;
            this.f189435c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$am */
    static final class C84766am extends AbstractC89220m implements AbstractC89171a<AbstractC84632c<ProviderEffect>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189428a;

        static {
            Covode.recordClassIndex(98742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84766am(C84752l lVar) {
            super(0);
            this.f189428a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84632c<ProviderEffect> invoke() {
            return this.f189428a.mo129661i();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$aw */
    static final class C84782aw extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189448a;

        static {
            Covode.recordClassIndex(98758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84782aw(C84752l lVar) {
            super(0);
            this.f189448a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            return this.f189448a.mo129662j();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ak */
    static final class C84764ak extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189426a;

        static {
            Covode.recordClassIndex(98740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84764ak(C84752l lVar) {
            super(0);
            this.f189426a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return (ViewGroup) this.f189426a.f189399n.getValue();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$al */
    static final class C84765al extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189427a;

        static {
            Covode.recordClassIndex(98741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84765al(C84752l lVar) {
            super(0);
            this.f189427a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return ((AbstractC84631b) this.f189427a.f189400o.getValue()).mo129538l();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84635f
    /* renamed from: c */
    public final AbstractC88979t<Boolean> mo129546c() {
        AbstractC88979t<Boolean> c = this.f189405t.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84635f
    /* renamed from: d */
    public final AbstractC88979t<C89378p<AbstractC84694f.C84695a, Integer>> mo129547d() {
        AbstractC88979t<C89378p<AbstractC84694f.C84695a, Integer>> c = this.f189406u.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84635f
    /* renamed from: e */
    public final AbstractC88979t<C89378p<Effect, Boolean>> mo129548e() {
        AbstractC88979t<C89378p<Effect, Boolean>> c = this.f189408w.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84635f
    /* renamed from: f */
    public final AbstractC88979t<C89378p<ProviderEffect, Boolean>> mo129549f() {
        AbstractC88979t<C89378p<ProviderEffect, Boolean>> c = this.f189409x.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84635f
    /* renamed from: g */
    public final AbstractC88979t<C89378p<Boolean, String>> mo129550g() {
        AbstractC88979t<C89378p<Boolean, String>> c = this.f189407v.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84635f
    /* renamed from: h */
    public final AbstractC88979t<C84636g> mo129551h() {
        AbstractC88979t<C84636g> c = this.f189411z.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$av */
    static final class C84780av extends AbstractC89220m implements AbstractC89171a<AbstractC85027b<EnumC85026a>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189446a;

        static {
            Covode.recordClassIndex(98756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84780av(C84752l lVar) {
            super(0);
            this.f189446a = lVar;
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$av$a */
        static final class C84781a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C84780av f189447a;

            static {
                Covode.recordClassIndex(98757);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C84781a(C84780av avVar) {
                super(0);
                this.f189447a = avVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC84692d a;
                AbstractC84701l lVar = this.f189447a.f189446a.f189385E;
                if (!(lVar == null || (a = lVar.mo129623a()) == null)) {
                    a.mo129605c();
                }
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC85027b<EnumC85026a> invoke() {
            MethodCollector.m26663i(10260);
            C84752l lVar = this.f189446a;
            ViewGroup viewGroup = lVar.f189382B;
            if (viewGroup == null) {
                C89219l.m154710a("content");
            }
            View findViewById = viewGroup.findViewById(R.id.bnk);
            C89219l.m154716b(findViewById, "");
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            C89219l.m154721d(viewGroup2, "");
            Map a = C89041ag.m154421a(C89387v.m154943a(EnumC85026a.LOADING, C84771ap.f189437a), C89387v.m154943a(EnumC85026a.EMPTY, C84772aq.f189438a), C89387v.m154943a(EnumC85026a.ERROR, new C84774ar(lVar)));
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            C85029d dVar = new C85029d(context, a, EnumC85026a.NONE, (byte) 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            dVar.setLayoutParams(layoutParams);
            viewGroup2.addView(dVar);
            AbstractC89183m<? super AbstractC85027b<EnumC85026a>, ? super AbstractC89171a<C89391z>, C89391z> mVar = this.f189446a.f189393h.f189472n;
            if (mVar != null) {
                mVar.invoke(dVar, new C84781a(this));
            }
            MethodCollector.m26664o(10260);
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ax */
    static final class C84783ax extends AbstractC89220m implements AbstractC89171a<Vibrator> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189449a;

        static {
            Covode.recordClassIndex(98759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84783ax(C84752l lVar) {
            super(0);
            this.f189449a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Vibrator invoke() {
            Object a = m145692a(this.f189449a.f189383C.getContext(), "vibrator");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.os.Vibrator");
            return a;
        }

        /* renamed from: a */
        private static Object m145692a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(10101);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(10101);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$b */
    public static class C84784b {

        /* renamed from: a */
        public int f189450a;

        /* renamed from: b */
        public float f189451b;

        /* renamed from: c */
        public int f189452c;

        /* renamed from: d */
        public int f189453d;

        /* renamed from: e */
        public int f189454e;

        /* renamed from: f */
        public int f189455f;

        /* renamed from: g */
        public int f189456g;

        /* renamed from: h */
        public AbstractC89172b<? super ViewPager, C89391z> f189457h;

        /* renamed from: i */
        public AbstractC89172b<? super TabLayout, C89391z> f189458i;

        static {
            Covode.recordClassIndex(98760);
        }

        private C84784b() {
            this.f189450a = -1;
            this.f189451b = 74.0f;
            this.f189452c = 0;
            this.f189453d = 0;
            this.f189454e = 0;
            this.f189455f = 0;
            this.f189456g = 0;
            this.f189457h = null;
            this.f189458i = null;
        }

        public /* synthetic */ C84784b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84635f
    /* renamed from: b */
    public final void mo129545b() {
        if (this.f189393h.f189461c) {
            AbstractC84941d dVar = this.f189394i;
            if (dVar == null) {
                C89219l.m154710a("transitionView");
            }
            dVar.mo86260c();
            return;
        }
        AbstractC84941d dVar2 = this.f189394i;
        if (dVar2 == null) {
            C89219l.m154710a("transitionView");
        }
        dVar2.mo86263f();
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$c */
    public static class C84785c {

        /* renamed from: a */
        public boolean f189459a;

        /* renamed from: b */
        public boolean f189460b;

        /* renamed from: c */
        public boolean f189461c;

        /* renamed from: d */
        public boolean f189462d;

        /* renamed from: e */
        public boolean f189463e;

        /* renamed from: f */
        public boolean f189464f;

        /* renamed from: g */
        public boolean f189465g;

        /* renamed from: h */
        public boolean f189466h;

        /* renamed from: i */
        public boolean f189467i;

        /* renamed from: j */
        public AbstractC89172b<? super String, C89391z> f189468j;

        /* renamed from: k */
        public C84753a f189469k;

        /* renamed from: l */
        public C84753a f189470l;

        /* renamed from: m */
        public C84753a f189471m;

        /* renamed from: n */
        public AbstractC89183m<? super AbstractC85027b<EnumC85026a>, ? super AbstractC89171a<C89391z>, C89391z> f189472n;

        /* renamed from: o */
        public String f189473o;

        /* renamed from: p */
        public String f189474p;

        /* renamed from: q */
        public boolean f189475q;

        /* renamed from: r */
        public C84784b f189476r;

        static {
            Covode.recordClassIndex(98761);
        }

        public /* synthetic */ C84785c() {
            this(C847861.f189477a, new C84753a(0, null, 15), new C84753a(0, null, 14), new C84753a(0, null, 14), "", new C84784b((byte) 0));
        }

        private C84785c(AbstractC89172b<? super String, C89391z> bVar, C84753a aVar, C84753a aVar2, C84753a aVar3, String str, C84784b bVar2) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(aVar3, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(bVar2, "");
            this.f189459a = false;
            this.f189460b = true;
            this.f189461c = true;
            this.f189462d = true;
            this.f189463e = true;
            this.f189464f = true;
            this.f189465g = false;
            this.f189466h = true;
            this.f189467i = false;
            this.f189468j = bVar;
            this.f189469k = aVar;
            this.f189470l = aVar2;
            this.f189471m = aVar3;
            this.f189472n = null;
            this.f189473o = null;
            this.f189474p = str;
            this.f189475q = true;
            this.f189476r = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$at */
    static final class C84778at extends AbstractC89220m implements AbstractC89171a<AbstractC84632c<ProviderEffect>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189444a;

        static {
            Covode.recordClassIndex(98754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84778at(C84752l lVar) {
            super(0);
            this.f189444a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84632c<ProviderEffect> invoke() {
            AbstractC84697h<ProviderEffect> hVar;
            C84752l lVar = this.f189444a;
            ViewGroup viewGroup = lVar.f189382B;
            if (viewGroup == null) {
                C89219l.m154710a("content");
            }
            C89219l.m154721d(viewGroup, "");
            int i = lVar.f189393h.f189470l.f189412a;
            if (i == 0) {
                if (lVar.f189393h.f189460b) {
                    i = 4;
                } else {
                    i = 3;
                }
            }
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            AbstractC1204m mVar = lVar.f189384D;
            AbstractC84701l lVar2 = lVar.f189385E;
            AbstractC84700k<ProviderEffect> kVar = null;
            if (lVar2 != null) {
                hVar = lVar2.mo129630f();
            } else {
                hVar = null;
            }
            AbstractC84701l lVar3 = lVar.f189385E;
            if (lVar3 != null) {
                kVar = lVar3.mo129631g();
            }
            C84767an anVar = new C84767an(lVar, viewGroup, i, context, mVar, hVar, kVar, (ViewGroup) viewGroup.findViewById(R.id.bnm), i, lVar.f189393h.f189460b, lVar.f189393h.f189470l.f189415d);
            anVar.mo129584s();
            lVar.f189381A.mo142945a(anVar.mo129537k().mo143254a(new C84799p(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(anVar.mo129532f().mo143254a(new C84800q(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(anVar.mo129533g().mo143254a(new C84801r(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(anVar.mo129534h().mo143254a(new C84802s(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(anVar.mo129536j().mo143254a(new C84803t(lVar), C84909p.f189747a));
            return anVar;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$au */
    static final class C84779au extends AbstractC89220m implements AbstractC89171a<AbstractC84633d<InfoStickerEffect>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189445a;

        static {
            Covode.recordClassIndex(98755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84779au(C84752l lVar) {
            super(0);
            this.f189445a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84633d<InfoStickerEffect> invoke() {
            AbstractC84698i<InfoStickerEffect> iVar;
            C84752l lVar = this.f189445a;
            ViewGroup viewGroup = lVar.f189382B;
            if (viewGroup == null) {
                C89219l.m154710a("content");
            }
            C89219l.m154721d(viewGroup, "");
            int i = lVar.f189393h.f189471m.f189412a;
            if (i == 0) {
                if (lVar.f189393h.f189460b) {
                    i = 4;
                } else {
                    i = 3;
                }
            }
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            AbstractC1204m mVar = lVar.f189384D;
            AbstractC84701l lVar2 = lVar.f189385E;
            AbstractC84700k<InfoStickerEffect> kVar = null;
            if (lVar2 != null) {
                iVar = lVar2.mo129632h();
            } else {
                iVar = null;
            }
            AbstractC84701l lVar3 = lVar.f189385E;
            if (lVar3 != null) {
                kVar = lVar3.mo129633i();
            }
            C84769ao aoVar = new C84769ao(lVar, viewGroup, i, context, mVar, iVar, kVar, (ViewGroup) viewGroup.findViewById(R.id.bnm), i, lVar.f189393h.f189471m.f189415d, lVar.f189393h.f189474p);
            aoVar.mo129584s();
            lVar.f189381A.mo142945a(aoVar.mo129537k().mo143254a(new C84804u(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(aoVar.mo129532f().mo143254a(new C84805v(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(aoVar.mo129533g().mo143254a(new C84806w(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(aoVar.mo129534h().mo143254a(new C84807x(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(aoVar.mo129536j().mo143254a(new C84808y(lVar), C84909p.f189747a));
            return aoVar;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$d */
    static final class C84787d extends AbstractC89220m implements AbstractC89171a<AbstractC84631b<Effect>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189478a;

        static {
            Covode.recordClassIndex(98763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84787d(C84752l lVar) {
            super(0);
            this.f189478a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84631b<Effect> invoke() {
            AbstractC84693e<Effect> eVar;
            C84752l lVar = this.f189478a;
            ViewGroup viewGroup = lVar.f189382B;
            if (viewGroup == null) {
                C89219l.m154710a("content");
            }
            C89219l.m154721d(viewGroup, "");
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            AbstractC1204m mVar = lVar.f189384D;
            AbstractC84701l lVar2 = lVar.f189385E;
            AbstractC84700k<Effect> kVar = null;
            if (lVar2 != null) {
                eVar = lVar2.mo129628d();
            } else {
                eVar = null;
            }
            AbstractC84701l lVar3 = lVar.f189385E;
            if (lVar3 != null) {
                kVar = lVar3.mo129629e();
            }
            C84730d dVar = new C84730d(context, mVar, eVar, kVar, lVar.f189393h.f189467i, lVar.f189393h.f189469k.f189415d, (byte) 0);
            if (lVar.f189393h.f189467i) {
                dVar.mo129642a();
            } else {
                dVar.mo129584s();
            }
            dVar.cK_();
            dVar.mo129538l().setTag(R.id.bni, dVar);
            lVar.f189381A.mo142945a(dVar.mo129537k().mo143254a(new C84791h(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(dVar.mo129539m().mo143254a(new C84792i(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(dVar.mo129532f().mo143254a(new C84793j(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(dVar.mo129533g().mo143254a(new C84794k(lVar), C84909p.f189747a));
            lVar.f189381A.mo142945a(dVar.mo129534h().mo143254a(new C84795l(lVar), C84909p.f189747a));
            return dVar;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84635f
    /* renamed from: a */
    public final void mo129544a() {
        AbstractC84692d a;
        if (!this.f189389d) {
            ViewGroup viewGroup = this.f189382B;
            if (viewGroup == null) {
                C89219l.m154710a("content");
            }
            C89219l.m154721d(viewGroup, "");
            View findViewById = viewGroup.findViewById(R.id.bns);
            C89219l.m154716b(findViewById, "");
            ViewPager viewPager = (ViewPager) findViewById;
            View findViewById2 = viewGroup.findViewById(R.id.e9g);
            C89219l.m154716b(findViewById2, "");
            TabLayout tabLayout = (TabLayout) findViewById2;
            View findViewById3 = viewGroup.findViewById(R.id.bnb);
            C89219l.m154716b(findViewById3, "");
            tabLayout.setTabMargin(0);
            C84784b bVar = this.f189393h.f189476r;
            Drawable a2 = m145675a(bVar.f189456g);
            if (a2 != null) {
                viewPager.setBackground(a2);
            }
            Drawable a3 = m145675a(bVar.f189455f);
            if (a3 != null) {
                View findViewById4 = viewGroup.findViewById(R.id.e9h);
                C89219l.m154716b(findViewById4, "");
                findViewById4.setBackground(a3);
            }
            AbstractC89172b<? super ViewPager, C89391z> bVar2 = bVar.f189457h;
            if (bVar2 != null) {
                bVar2.invoke(viewPager);
            }
            AbstractC89172b<? super TabLayout, C89391z> bVar3 = bVar.f189458i;
            if (bVar3 != null) {
                bVar3.invoke(tabLayout);
            }
            C84733f fVar = new C84733f(viewPager, tabLayout, findViewById3, this.f189393h);
            this.f189381A.mo142945a(fVar.mo129610c().mo143254a(new C84796m(this), C84909p.f189747a));
            fVar.mo129608a(true);
            fVar.mo129609b();
            this.f189395j = fVar;
            ViewGroup viewGroup2 = this.f189382B;
            if (viewGroup2 == null) {
                C89219l.m154710a("content");
            }
            C89219l.m154721d(viewGroup2, "");
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.bnj);
            View findViewById5 = viewGroup2.findViewById(R.id.bnm);
            Drawable a4 = m145675a(this.f189393h.f189476r.f189453d);
            if (a4 != null) {
                C89219l.m154716b(viewGroup3, "");
                viewGroup3.setBackground(a4);
            }
            Drawable a5 = m145675a(this.f189393h.f189476r.f189454e);
            if (a5 != null) {
                C89219l.m154716b(findViewById5, "");
                findViewById5.setBackground(a5);
            }
            C89219l.m154716b(viewGroup3, "");
            C84766am amVar = new C84766am(this);
            C89219l.m154716b(findViewById5, "");
            Context context = viewGroup2.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            C84737g gVar = new C84737g(viewGroup3, amVar, findViewById5, (Activity) context, this.f189393h.f189473o, this.f189393h.f189475q);
            this.f189396k = gVar;
            gVar.mo129615a(this.f189393h.f189459a);
            if (this.f189393h.f189459a) {
                C88411a aVar = this.f189381A;
                AbstractC84696g gVar2 = this.f189396k;
                if (gVar2 == null) {
                    C89219l.m154715b();
                }
                aVar.mo142945a(gVar2.mo129616b().mo143254a(new C84798o(this), C84909p.f189747a));
            }
            boolean z = this.f189393h.f189462d;
            ViewGroup viewGroup4 = this.f189382B;
            if (viewGroup4 == null) {
                C89219l.m154710a("content");
            }
            AbstractC84694f fVar2 = this.f189395j;
            if (fVar2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(viewGroup4, "");
            C89219l.m154721d(fVar2, "");
            View findViewById6 = viewGroup4.findViewById(R.id.e89);
            C89219l.m154716b(findViewById6, "");
            C84727b bVar4 = new C84727b(findViewById6, fVar2.mo129606a(), z);
            this.f189398m = bVar4;
            if (z) {
                bVar4.mo129557a(false);
                C88411a aVar2 = this.f189381A;
                AbstractC84641b bVar5 = this.f189398m;
                if (bVar5 == null) {
                    C89219l.m154715b();
                }
                aVar2.mo142945a(bVar5.mo129556a().mo143254a(new C84790g(this), C84909p.f189747a));
            }
            ViewGroup viewGroup5 = this.f189382B;
            if (viewGroup5 == null) {
                C89219l.m154710a("content");
            }
            C89219l.m154721d(viewGroup5, "");
            this.f189386a = new C84763aj(viewGroup5);
            if (this.f189393h.f189463e) {
                AbstractC84940c cVar = this.f189386a;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                cVar.mo86243a(new View$OnClickListenerC84797n(this));
            }
            AbstractC84701l lVar = this.f189385E;
            if (!(lVar == null || (a = lVar.mo129623a()) == null)) {
                a.mo129604b().observe(this.f189384D, new C84761ah(this));
                a.mo129603a().observe(this.f189384D, new C84762ai(this));
            }
            this.f189389d = true;
        }
        if (this.f189393h.f189461c) {
            AbstractC84941d dVar = this.f189394i;
            if (dVar == null) {
                C89219l.m154710a("transitionView");
            }
            dVar.mo86258a();
            return;
        }
        AbstractC84941d dVar2 = this.f189394i;
        if (dVar2 == null) {
            C89219l.m154710a("transitionView");
        }
        dVar2.mo86259b();
    }

    /* renamed from: j */
    public final ViewGroup mo129662j() {
        AbstractC84640a<EffectCategoryResponse, Effect> aVar;
        int i;
        ViewGroup viewGroup = this.f189382B;
        if (viewGroup == null) {
            C89219l.m154710a("content");
        }
        C89219l.m154721d(viewGroup, "");
        AbstractC84700k<Effect> kVar = null;
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3r, null, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        View findViewById = viewGroup2.findViewById(R.id.e94);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup3 = (ViewGroup) findViewById;
        C89219l.m154721d(viewGroup3, "");
        Context context = viewGroup3.getContext();
        C89219l.m154716b(context, "");
        AbstractC1204m mVar = this.f189384D;
        AbstractC84701l lVar = this.f189385E;
        if (lVar != null) {
            aVar = lVar.mo129626b();
        } else {
            aVar = null;
        }
        AbstractC84701l lVar2 = this.f189385E;
        if (lVar2 != null) {
            kVar = lVar2.mo129627c();
        }
        if (this.f189393h.f189460b) {
            i = 4;
        } else {
            i = 3;
        }
        C84723a aVar2 = new C84723a(context, mVar, aVar, kVar, viewGroup3, i, this.f189393h.f189460b, this.f189393h.f189467i, this.f189393h.f189469k.f189415d);
        if (this.f189393h.f189467i) {
            aVar2.mo129641y();
        } else {
            aVar2.mo129584s();
        }
        viewGroup2.setTag(R.id.bni, aVar2);
        this.f189381A.mo142945a(aVar2.mo129537k().mo143254a(new C84809z(this), C84909p.f189747a));
        this.f189381A.mo142945a(aVar2.mo129539m().mo143254a(new C84754aa(this), C84909p.f189747a));
        this.f189381A.mo142945a(aVar2.mo129532f().mo143254a(new C84755ab(this), C84909p.f189747a));
        this.f189381A.mo142945a(aVar2.mo129533g().mo143254a(new C84756ac(this), C84909p.f189747a));
        this.f189381A.mo142945a(aVar2.mo129534h().mo143254a(new C84757ad(this), C84909p.f189747a));
        this.f189381A.mo142945a(aVar2.mo129540n().mo143254a(new C84758ae(this), C84909p.f189747a));
        View findViewById2 = viewGroup2.findViewById(R.id.uj);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout");
        AbstractC84634e<EffectCategoryResponse, Effect> a2 = mo128389a((TabLayout) findViewById2);
        a2.mo129543a(aVar2);
        this.f189381A.mo142945a(a2.mo129542a().mo143254a(new C84759af(this), C84909p.f189747a));
        aVar2.cK_();
        return viewGroup2;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$aj */
    public static final class C84763aj implements AbstractC84940c {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f189425a;

        static {
            Covode.recordClassIndex(98739);
        }

        C84763aj(ViewGroup viewGroup) {
            this.f189425a = viewGroup;
        }

        @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84940c
        /* renamed from: a */
        public final void mo86243a(View.OnClickListener onClickListener) {
            C89219l.m154721d(onClickListener, "");
            View findViewById = this.f189425a.findViewById(R.id.e9o);
            if (findViewById != null) {
                findViewById.setOnClickListener(onClickListener);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ap */
    static final class C84771ap extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        public static final C84771ap f189437a = new C84771ap();

        static {
            Covode.recordClassIndex(98747);
        }

        C84771ap() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146192a(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$aq */
    static final class C84772aq extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        public static final C84772aq f189438a = new C84772aq();

        static {
            Covode.recordClassIndex(98748);
        }

        C84772aq() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146190a(viewGroup2, C847731.f189439a);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$as */
    static final class C84777as extends AbstractC89220m implements AbstractC89172b<View, AbstractC40905d> {

        /* renamed from: a */
        public static final C84777as f189443a = new C84777as();

        static {
            Covode.recordClassIndex(98753);
        }

        C84777as() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC40905d invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            return new C84943f(view2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC84634e<EffectCategoryResponse, Effect> mo128389a(TabLayout tabLayout) {
        C89219l.m154721d(tabLayout, "");
        return new C84751k(tabLayout);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ac */
    public static final class C84756ac<T> implements AbstractC88433f<Effect> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189418a;

        static {
            Covode.recordClassIndex(98732);
        }

        C84756ac(C84752l lVar) {
            this.f189418a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Effect effect) {
            this.f189418a.f189408w.onNext(C89387v.m154943a(effect, true));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ad */
    public static final class C84757ad<T> implements AbstractC88433f<Effect> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189419a;

        static {
            Covode.recordClassIndex(98733);
        }

        C84757ad(C84752l lVar) {
            this.f189419a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Effect effect) {
            this.f189419a.f189408w.onNext(C89387v.m154943a(effect, false));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ah */
    static final class C84761ah<T> implements AbstractC1214u<EnumC85026a> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189423a;

        static {
            Covode.recordClassIndex(98737);
        }

        C84761ah(C84752l lVar) {
            this.f189423a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(EnumC85026a aVar) {
            EnumC85026a aVar2 = aVar;
            if (aVar2 != null) {
                ((AbstractC85027b) this.f189423a.f189402q.getValue()).setState(aVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ar */
    static final class C84774ar extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189440a;

        static {
            Covode.recordClassIndex(98750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84774ar(C84752l lVar) {
            super(1);
            this.f189440a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146191a(viewGroup2, new AbstractC89187q<TextView, TextView, TextView, C89391z>(this) {
                /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84752l.C84774ar.C847751 */

                /* renamed from: a */
                final /* synthetic */ C84774ar f189441a;

                static {
                    Covode.recordClassIndex(98751);
                }

                {
                    this.f189441a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89187q
                public final /* synthetic */ C89391z invoke(TextView textView, TextView textView2, TextView textView3) {
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    TextView textView6 = textView3;
                    C89219l.m154721d(textView4, "");
                    C89219l.m154721d(textView5, "");
                    C89219l.m154721d(textView6, "");
                    textView4.setText(R.string.gzs);
                    textView5.setText(R.string.gzr);
                    textView6.setText(R.string.gzy);
                    textView6.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84752l.C84774ar.C847751.View$OnClickListenerC847761 */

                        /* renamed from: a */
                        final /* synthetic */ C847751 f189442a;

                        static {
                            Covode.recordClassIndex(98752);
                        }

                        {
                            this.f189442a = r1;
                        }

                        public final void onClick(View view) {
                            AbstractC84692d a;
                            ClickAgent.onClick(view);
                            AbstractC84701l lVar = this.f189442a.f189441a.f189440a.f189385E;
                            if (lVar != null && (a = lVar.mo129623a()) != null) {
                                a.mo129605c();
                            }
                        }
                    });
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$k */
    static final class C84794k<T> implements AbstractC88433f<Effect> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189485a;

        static {
            Covode.recordClassIndex(98770);
        }

        C84794k(C84752l lVar) {
            this.f189485a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Effect effect) {
            this.f189485a.f189408w.onNext(C89387v.m154943a(effect, true));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$l */
    static final class C84795l<T> implements AbstractC88433f<Effect> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189486a;

        static {
            Covode.recordClassIndex(98771);
        }

        C84795l(C84752l lVar) {
            this.f189486a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Effect effect) {
            this.f189486a.f189408w.onNext(C89387v.m154943a(effect, false));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$m */
    static final class C84796m<T> implements AbstractC88433f<C89378p<? extends AbstractC84694f.C84695a, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189487a;

        static {
            Covode.recordClassIndex(98772);
        }

        C84796m(C84752l lVar) {
            this.f189487a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89378p<? extends AbstractC84694f.C84695a, ? extends Integer> pVar) {
            C89378p<? extends AbstractC84694f.C84695a, ? extends Integer> pVar2 = pVar;
            this.f189487a.f189406u.onNext(C89387v.m154943a(pVar2.component1(), Integer.valueOf(((Number) pVar2.component2()).intValue())));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$r */
    static final class C84801r<T> implements AbstractC88433f<ProviderEffect> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189492a;

        static {
            Covode.recordClassIndex(98777);
        }

        C84801r(C84752l lVar) {
            this.f189492a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(ProviderEffect providerEffect) {
            this.f189492a.f189409x.onNext(C89387v.m154943a(providerEffect, true));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$s */
    static final class C84802s<T> implements AbstractC88433f<ProviderEffect> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189493a;

        static {
            Covode.recordClassIndex(98778);
        }

        C84802s(C84752l lVar) {
            this.f189493a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(ProviderEffect providerEffect) {
            this.f189493a.f189409x.onNext(C89387v.m154943a(providerEffect, false));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$t */
    static final class C84803t<T> implements AbstractC88433f<Integer> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189494a;

        static {
            Covode.recordClassIndex(98779);
        }

        C84803t(C84752l lVar) {
            this.f189494a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Integer num) {
            AbstractC84696g gVar;
            if ((this.f189494a.f189393h.f189459a || this.f189494a.f189393h.f189465g) && (gVar = this.f189494a.f189396k) != null) {
                gVar.mo129614a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$w */
    static final class C84806w<T> implements AbstractC88433f<InfoStickerEffect> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189497a;

        static {
            Covode.recordClassIndex(98782);
        }

        C84806w(C84752l lVar) {
            this.f189497a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(InfoStickerEffect infoStickerEffect) {
            this.f189497a.f189410y.onNext(C89387v.m154943a(infoStickerEffect, true));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$x */
    static final class C84807x<T> implements AbstractC88433f<InfoStickerEffect> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189498a;

        static {
            Covode.recordClassIndex(98783);
        }

        C84807x(C84752l lVar) {
            this.f189498a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(InfoStickerEffect infoStickerEffect) {
            this.f189498a.f189410y.onNext(C89387v.m154943a(infoStickerEffect, false));
        }
    }

    /* renamed from: a */
    private final Drawable m145675a(int i) {
        if (i == 0) {
            return null;
        }
        Context context = this.f189383C.getContext();
        C89219l.m154716b(context, "");
        return context.getResources().getDrawable(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$aa */
    public static final class C84754aa<T> implements AbstractC88433f<List<? extends C89378p<? extends Effect, ? extends Integer>>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189416a;

        static {
            Covode.recordClassIndex(98730);
        }

        C84754aa(C84752l lVar) {
            this.f189416a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(List<? extends C89378p<? extends Effect, ? extends Integer>> list) {
            this.f189416a.f189411z.onNext(new C84636g(EnumC84637h.BIND_DATA, EnumC84639j.MAIN, null, null, null, 0, null, null, null, null, list, null, 12284));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ab */
    public static final class C84755ab<T> implements AbstractC88433f<C20375am<Effect, Integer, EnumC84444c>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189417a;

        static {
            Covode.recordClassIndex(98731);
        }

        C84755ab(C84752l lVar) {
            this.f189417a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20375am<Effect, Integer, EnumC84444c> amVar) {
            C20375am<Effect, Integer, EnumC84444c> amVar2 = amVar;
            this.f189417a.f189411z.onNext(new C84636g(EnumC84637h.STICKER_CLICK, EnumC84639j.MAIN, C89070n.m154516a((Object) amVar2.f48260a), null, null, 0, null, amVar2.f48261b, amVar2.f48262c, null, null, null, 15992));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$af */
    public static final class C84759af<T> implements AbstractC88433f<EffectCategoryResponse> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189421a;

        static {
            Covode.recordClassIndex(98735);
        }

        C84759af(C84752l lVar) {
            this.f189421a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(EffectCategoryResponse effectCategoryResponse) {
            EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
            if (this.f189421a.f189393h.f189464f) {
                ((Vibrator) this.f189421a.f189403r.getValue()).vibrate(6);
            }
            this.f189421a.f189411z.onNext(new C84636g(EnumC84637h.CATEGORY_CLICK, EnumC84639j.MAIN, null, null, null, 0, effectCategoryResponse2, null, null, null, null, null, 16316));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ag */
    static final class C84760ag<T> implements AbstractC88433f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189422a;

        static {
            Covode.recordClassIndex(98736);
        }

        C84760ag(C84752l lVar) {
            this.f189422a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Boolean bool) {
            AbstractC84641b bVar;
            AbstractC84696g gVar;
            Boolean bool2 = bool;
            C84752l lVar = this.f189422a;
            C89219l.m154716b(bool2, "");
            boolean booleanValue = bool2.booleanValue();
            AbstractC84701l lVar2 = lVar.f189385E;
            if (lVar2 != null) {
                lVar2.mo129625a(booleanValue);
            }
            if (!booleanValue && lVar.f189393h.f189459a && (gVar = lVar.f189396k) != null) {
                gVar.mo129614a();
            }
            if (lVar.f189393h.f189462d && (bVar = lVar.f189398m) != null) {
                bVar.mo129557a(booleanValue);
            }
            lVar.f189405t.onNext(Boolean.valueOf(booleanValue));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$g */
    static final class C84790g<T> implements AbstractC88433f<AbstractC84641b.EnumC84642a> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189481a;

        static {
            Covode.recordClassIndex(98766);
        }

        C84790g(C84752l lVar) {
            this.f189481a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC84641b.EnumC84642a aVar) {
            AbstractC84696g gVar;
            C84752l lVar = this.f189481a;
            C89219l.m154716b(aVar, "");
            if (aVar == AbstractC84641b.EnumC84642a.DRAGGING) {
                if (lVar.f189393h.f189459a && (gVar = lVar.f189396k) != null) {
                    gVar.mo129614a();
                }
                if (lVar.f189393h.f189465g && lVar.f189397l != null) {
                }
            } else if (aVar == AbstractC84641b.EnumC84642a.CLOSE) {
                AbstractC84941d dVar = lVar.f189394i;
                if (dVar == null) {
                    C89219l.m154710a("transitionView");
                }
                dVar.mo86263f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$h */
    static final class C84791h<T> implements AbstractC88433f<C89378p<? extends List<? extends Effect>, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189482a;

        static {
            Covode.recordClassIndex(98767);
        }

        C84791h(C84752l lVar) {
            this.f189482a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89378p<? extends List<? extends Effect>, ? extends Integer> pVar) {
            C89378p<? extends List<? extends Effect>, ? extends Integer> pVar2 = pVar;
            this.f189482a.f189411z.onNext(new C84636g(EnumC84637h.DATA_VISIBLE, EnumC84639j.EMOJI, (List) pVar2.getFirst(), null, null, ((Number) pVar2.getSecond()).intValue(), null, null, null, null, null, null, 16344));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$i */
    static final class C84792i<T> implements AbstractC88433f<List<? extends C89378p<? extends Effect, ? extends Integer>>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189483a;

        static {
            Covode.recordClassIndex(98768);
        }

        C84792i(C84752l lVar) {
            this.f189483a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(List<? extends C89378p<? extends Effect, ? extends Integer>> list) {
            this.f189483a.f189411z.onNext(new C84636g(EnumC84637h.BIND_DATA, EnumC84639j.EMOJI, null, null, null, 0, null, null, null, null, list, null, 12284));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$j */
    static final class C84793j<T> implements AbstractC88433f<C20375am<Effect, Integer, EnumC84444c>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189484a;

        static {
            Covode.recordClassIndex(98769);
        }

        C84793j(C84752l lVar) {
            this.f189484a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20375am<Effect, Integer, EnumC84444c> amVar) {
            C20375am<Effect, Integer, EnumC84444c> amVar2 = amVar;
            this.f189484a.f189411z.onNext(new C84636g(EnumC84637h.STICKER_CLICK, EnumC84639j.EMOJI, C89070n.m154516a((Object) amVar2.f48260a), null, null, 0, null, amVar2.f48261b, amVar2.f48262c, null, null, null, 15992));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$n */
    static final class View$OnClickListenerC84797n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C84752l f189488a;

        static {
            Covode.recordClassIndex(98773);
        }

        View$OnClickListenerC84797n(C84752l lVar) {
            this.f189488a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C84752l lVar = this.f189488a;
            lVar.mo129545b();
            lVar.f189411z.onNext(new C84636g(EnumC84637h.STICKER_LOAD, EnumC84639j.MAIN, null, null, null, 0, null, null, null, null, null, EnumC84638i.CANCEL, 8188));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$o */
    static final class C84798o<T> implements AbstractC88433f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189489a;

        static {
            Covode.recordClassIndex(98774);
        }

        C84798o(C84752l lVar) {
            this.f189489a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Boolean bool) {
            Boolean bool2 = bool;
            C84752l lVar = this.f189489a;
            C89219l.m154716b(bool2, "");
            boolean booleanValue = bool2.booleanValue();
            AbstractC84694f fVar = lVar.f189395j;
            if (fVar != null) {
                fVar.mo129608a(!booleanValue);
            }
            lVar.f189407v.onNext(C89387v.m154943a(Boolean.valueOf(booleanValue), lVar.mo129661i().mo114473a()));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$p */
    static final class C84799p<T> implements AbstractC88433f<C89378p<? extends List<? extends ProviderEffect>, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189490a;

        static {
            Covode.recordClassIndex(98775);
        }

        C84799p(C84752l lVar) {
            this.f189490a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89378p<? extends List<? extends ProviderEffect>, ? extends Integer> pVar) {
            C89378p<? extends List<? extends ProviderEffect>, ? extends Integer> pVar2 = pVar;
            this.f189490a.f189411z.onNext(new C84636g(EnumC84637h.DATA_VISIBLE, EnumC84639j.PROVIDER, null, (List) pVar2.getFirst(), null, ((Number) pVar2.getSecond()).intValue(), null, null, null, null, null, null, 16340));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$q */
    static final class C84800q<T> implements AbstractC88433f<C20375am<ProviderEffect, Integer, EnumC84444c>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189491a;

        static {
            Covode.recordClassIndex(98776);
        }

        C84800q(C84752l lVar) {
            this.f189491a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20375am<ProviderEffect, Integer, EnumC84444c> amVar) {
            C20375am<ProviderEffect, Integer, EnumC84444c> amVar2 = amVar;
            this.f189491a.f189411z.onNext(new C84636g(EnumC84637h.STICKER_CLICK, EnumC84639j.PROVIDER, null, C89070n.m154516a((Object) amVar2.f48260a), null, 0, null, amVar2.f48261b, amVar2.f48262c, this.f189491a.mo129661i().mo114473a(), null, null, 15476));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$u */
    static final class C84804u<T> implements AbstractC88433f<C89378p<? extends List<? extends InfoStickerEffect>, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189495a;

        static {
            Covode.recordClassIndex(98780);
        }

        C84804u(C84752l lVar) {
            this.f189495a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89378p<? extends List<? extends InfoStickerEffect>, ? extends Integer> pVar) {
            C89378p<? extends List<? extends InfoStickerEffect>, ? extends Integer> pVar2 = pVar;
            this.f189495a.f189411z.onNext(new C84636g(EnumC84637h.DATA_VISIBLE, EnumC84639j.SEARCH, null, null, (List) pVar2.getFirst(), ((Number) pVar2.getSecond()).intValue(), null, null, null, null, null, null, 16332));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$v */
    static final class C84805v<T> implements AbstractC88433f<C20375am<InfoStickerEffect, Integer, EnumC84444c>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189496a;

        static {
            Covode.recordClassIndex(98781);
        }

        C84805v(C84752l lVar) {
            this.f189496a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20375am<InfoStickerEffect, Integer, EnumC84444c> amVar) {
            C20375am<InfoStickerEffect, Integer, EnumC84444c> amVar2 = amVar;
            this.f189496a.f189411z.onNext(new C84636g(EnumC84637h.STICKER_CLICK, EnumC84639j.SEARCH, null, null, C89070n.m154516a((Object) amVar2.f48260a), 0, null, amVar2.f48261b, amVar2.f48262c, ((AbstractC84633d) this.f189496a.f189401p.getValue()).mo129541a(), null, null, 15468));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ae */
    public static final class C84758ae<T> implements AbstractC88433f<EnumC84444c> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189420a;

        static {
            Covode.recordClassIndex(98734);
        }

        C84758ae(C84752l lVar) {
            this.f189420a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(EnumC84444c cVar) {
            EnumC84444c cVar2 = cVar;
            if (cVar2 != null) {
                int i = C84810m.f189501a[cVar2.ordinal()];
                if (i == 1) {
                    this.f189420a.f189411z.onNext(new C84636g(EnumC84637h.STICKER_LOAD, EnumC84639j.MAIN, null, null, null, 0, null, null, null, null, null, EnumC84638i.LOAD_SUCCESS, 8188));
                } else if (i == 2) {
                    this.f189420a.f189411z.onNext(new C84636g(EnumC84637h.STICKER_LOAD, EnumC84639j.MAIN, null, null, null, 0, null, null, null, null, null, EnumC84638i.LOAD_FAIL, 8188));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$ai */
    static final class C84762ai<T> implements AbstractC1214u<List<? extends AbstractC84456m>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189424a;

        static {
            Covode.recordClassIndex(98738);
        }

        C84762ai(C84752l lVar) {
            this.f189424a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends AbstractC84456m> list) {
            AbstractC84694f fVar;
            C89378p a;
            List<? extends AbstractC84456m> list2 = list;
            if (!(list2 == null || (fVar = this.f189424a.f189395j) == null)) {
                C84752l lVar = this.f189424a;
                C89219l.m154721d(list2, "");
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                for (T t : list2) {
                    if (t instanceof C84457n) {
                        a = C89387v.m154943a(new AbstractC84694f.C84695a(t), new C84764ak(lVar));
                    } else if (t instanceof C84443b) {
                        a = C89387v.m154943a(new AbstractC84694f.C84695a(t), new C84765al(lVar));
                    } else {
                        throw new C89376n();
                    }
                    arrayList.add(a);
                }
                fVar.mo129607a(arrayList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$z */
    public static final class C84809z<T> implements AbstractC88433f<C89378p<? extends List<? extends Effect>, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C84752l f189500a;

        static {
            Covode.recordClassIndex(98785);
        }

        C84809z(C84752l lVar) {
            this.f189500a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89378p<? extends List<? extends Effect>, ? extends Integer> pVar) {
            C89378p<? extends List<? extends Effect>, ? extends Integer> pVar2 = pVar;
            this.f189500a.f189411z.onNext(new C84636g(EnumC84637h.DATA_VISIBLE, EnumC84639j.MAIN, (List) pVar2.getFirst(), null, null, ((Number) pVar2.getSecond()).intValue(), null, null, null, null, null, null, 16344));
            C84752l lVar = this.f189500a;
            List<? extends Effect> list = (List) pVar2.getFirst();
            if (!lVar.f189404s && list != null && !list.isEmpty()) {
                AbstractC84701l lVar2 = lVar.f189385E;
                if (lVar2 != null) {
                    lVar2.mo129624a(list);
                }
                lVar.f189404s = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$a */
    public static class C84753a {

        /* renamed from: a */
        public int f189412a;

        /* renamed from: b */
        public AbstractC89183m<? super ViewGroup, ? super AbstractC89171a<C89391z>, ? extends RecyclerView.ViewHolder> f189413b;

        /* renamed from: c */
        public AbstractC89183m<? super RecyclerView.ViewHolder, ? super EnumC85026a, C89391z> f189414c;

        /* renamed from: d */
        public AbstractC89172b<? super AbstractC84650b.C84654c, C89391z> f189415d;

        static {
            Covode.recordClassIndex(98729);
        }

        public C84753a() {
            this(0, null, 15);
        }

        private C84753a(int i, AbstractC89172b<? super AbstractC84650b.C84654c, C89391z> bVar) {
            this.f189412a = i;
            this.f189413b = null;
            this.f189414c = null;
            this.f189415d = bVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C84753a(int i, AbstractC89172b bVar, int i2) {
            this((i2 & 1) != 0 ? 4 : i, (i2 & 8) != 0 ? null : bVar);
        }
    }

    private C84752l(ViewGroup viewGroup, AbstractC1204m mVar, AbstractC84701l lVar, AbstractC89172b<? super C84785c, C89391z> bVar) {
        float f;
        AbstractC84692d a;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(mVar, "");
        MethodCollector.m26663i(11232);
        this.f189383C = viewGroup;
        this.f189384D = mVar;
        this.f189385E = lVar;
        this.f189392g = true;
        C84785c cVar = new C84785c();
        this.f189393h = cVar;
        this.f189399n = C89250i.m154774a(EnumC89331m.NONE, new C84782aw(this));
        this.f189400o = C89250i.m154774a(EnumC89331m.NONE, new C84787d(this));
        this.f189388c = C89250i.m154774a(EnumC89331m.NONE, new C84778at(this));
        this.f189401p = C89250i.m154774a(EnumC89331m.NONE, new C84779au(this));
        this.f189402q = C89250i.m154774a(EnumC89331m.NONE, new C84780av(this));
        this.f189403r = C89250i.m154774a(EnumC89331m.NONE, new C84783ax(this));
        C88960c cVar2 = new C88960c();
        C89219l.m154716b(cVar2, "");
        this.f189405t = cVar2;
        C88960c cVar3 = new C88960c();
        C89219l.m154716b(cVar3, "");
        this.f189406u = cVar3;
        C88960c cVar4 = new C88960c();
        C89219l.m154716b(cVar4, "");
        this.f189407v = cVar4;
        C88960c cVar5 = new C88960c();
        C89219l.m154716b(cVar5, "");
        this.f189390e = cVar5;
        C88960c cVar6 = new C88960c();
        C89219l.m154716b(cVar6, "");
        this.f189408w = cVar6;
        C88960c cVar7 = new C88960c();
        C89219l.m154716b(cVar7, "");
        this.f189409x = cVar7;
        C88960c cVar8 = new C88960c();
        C89219l.m154716b(cVar8, "");
        this.f189410y = cVar8;
        C88960c cVar9 = new C88960c();
        C89219l.m154716b(cVar9, "");
        this.f189391f = cVar9;
        C88960c cVar10 = new C88960c();
        C89219l.m154716b(cVar10, "");
        this.f189411z = cVar10;
        C88411a aVar = new C88411a();
        this.f189381A = aVar;
        if (bVar != null) {
            bVar.invoke(cVar);
        }
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3s, viewGroup, false);
        if (a2 != null) {
            ViewGroup viewGroup2 = (ViewGroup) a2;
            this.f189382B = viewGroup2;
            if (viewGroup2 == null) {
                C89219l.m154710a("content");
            }
            View findViewById = viewGroup2.findViewById(R.id.bn6);
            findViewById.setOnClickListener(View$OnClickListenerC84789f.f189480a);
            Drawable a3 = m145675a(cVar.f189476r.f189452c);
            if (a3 != null) {
                C89219l.m154716b(findViewById, "");
                findViewById.setBackground(a3);
            }
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Integer num = null;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (!(layoutParams instanceof ViewGroup.MarginLayoutParams) ? null : layoutParams);
            if (marginLayoutParams != null) {
                Context context = findViewById.getContext();
                C89219l.m154716b(context, "");
                boolean z = cVar.f189459a;
                int i = cVar.f189476r.f189450a;
                if (!(i == -2 || i == -1)) {
                    if (z) {
                        f = 500.0f;
                    } else {
                        f = 300.0f;
                    }
                    num = Integer.valueOf(Math.max((int) C84912r.m145930a(context, f), i));
                }
                Context context2 = findViewById.getContext();
                C89219l.m154716b(context2, "");
                int a4 = (int) C84912r.m145930a(context2, cVar.f189476r.f189451b);
                marginLayoutParams.topMargin = num != null ? Math.max(C84912r.m145933b(context2) - num.intValue(), a4) : a4;
            }
            ViewGroup viewGroup3 = this.f189382B;
            if (viewGroup3 == null) {
                C89219l.m154710a("content");
            }
            viewGroup.addView(viewGroup3);
            ViewGroup viewGroup4 = this.f189382B;
            if (viewGroup4 == null) {
                C89219l.m154710a("content");
            }
            View findViewById2 = viewGroup4.findViewById(R.id.t2);
            this.f189387b = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
                findViewById2.setOnTouchListener(View$OnTouchListenerC84788e.f189479a);
            }
            ViewGroup viewGroup5 = this.f189382B;
            if (viewGroup5 == null) {
                C89219l.m154710a("content");
            }
            C89219l.m154721d(viewGroup5, "");
            C84933a aVar2 = new C84933a(viewGroup5, this.f189387b, viewGroup5.findViewById(R.id.e89), C84777as.f189443a);
            this.f189394i = aVar2;
            aVar.mo142945a(aVar2.mo86261d().mo143254a(new C84760ag(this), C84909p.f189747a));
            AbstractC84941d dVar = this.f189394i;
            if (dVar == null) {
                C89219l.m154710a("transitionView");
            }
            dVar.mo86263f();
            if (!(lVar == null || (a = lVar.mo129623a()) == null)) {
                a.mo129605c();
            }
            mVar.getLifecycle().mo4012a(new InfoStickerView$1(this));
            MethodCollector.m26664o(11232);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(11232);
        throw nullPointerException;
    }

    public /* synthetic */ C84752l(ViewGroup viewGroup, AbstractC1204m mVar, AbstractC84701l lVar, AbstractC89172b bVar, byte b) {
        this(viewGroup, mVar, lVar, bVar);
    }
}
