package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.EnumC50699g;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84981g;
import com.p2082ss.android.ugc.tools.view.style.StyleRecyclerView;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85012b;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85013c;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.C85023h;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f */
public class C50871f implements AbstractC50822h {

    /* renamed from: k */
    public static final AbstractC89187q<AbstractC50822h, FilterBean, EnumC50699g, C89391z> f117370k = C50873b.f117386a;

    /* renamed from: l */
    public static final C50872a f117371l = new C50872a((byte) 0);

    /* renamed from: a */
    public final AbstractC85012b<C89378p<FilterBean, EnumC50699g>> f117372a;

    /* renamed from: b */
    public final AbstractC85013c<C89391z> f117373b;

    /* renamed from: c */
    public Map<FilterBean, ? extends EnumC50699g> f117374c = C89041ag.m154415a();

    /* renamed from: d */
    public FilterBean f117375d;

    /* renamed from: e */
    final AbstractC88969g<FilterBean> f117376e;

    /* renamed from: f */
    public final AbstractC88969g<FilterBean> f117377f;

    /* renamed from: g */
    public final AbstractC89183m<FilterBean, EnumC50699g, C89391z> f117378g;

    /* renamed from: h */
    public final RecyclerView f117379h;

    /* renamed from: i */
    final AbstractC89187q<AbstractC50822h, FilterBean, EnumC50699g, C89391z> f117380i;

    /* renamed from: j */
    public C50885g f117381j;

    /* renamed from: m */
    private final AbstractC88969g<C20169f<FilterBean>> f117382m;

    /* renamed from: n */
    private final AbstractC1204m f117383n;

    /* renamed from: o */
    private final AbstractC50935r f117384o;

    /* renamed from: p */
    private final AbstractC50936s f117385p;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$a */
    public static final class C50872a {
        static {
            Covode.recordClassIndex(60047);
        }

        private C50872a() {
        }

        public /* synthetic */ C50872a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: a */
    public final FilterBean mo86179a() {
        return this.f117375d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$j */
    public static final class RunnableC50881j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50871f f117395a;

        /* renamed from: b */
        final /* synthetic */ int f117396b;

        /* renamed from: c */
        final /* synthetic */ int f117397c;

        static {
            Covode.recordClassIndex(60056);
        }

        RunnableC50881j(C50871f fVar, int i, int i2) {
            this.f117395a = fVar;
            this.f117396b = i;
            this.f117397c = i2;
        }

        public final void run() {
            this.f117395a.mo86245a(this.f117396b, this.f117397c + 1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: b */
    public final AbstractC88979t<FilterBean> mo86182b() {
        AbstractC88979t<FilterBean> c = this.f117376e.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: c */
    public final AbstractC88979t<C20169f<FilterBean>> mo86184c() {
        AbstractC88979t<C20169f<FilterBean>> c = this.f117382m.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: d */
    public final AbstractC88979t<FilterBean> mo86185d() {
        AbstractC88979t<FilterBean> c = this.f117377f.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    static {
        Covode.recordClassIndex(60046);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$d */
    final class C50875d extends AbstractC85012b<C89378p<? extends FilterBean, ? extends EnumC50699g>> {
        static {
            Covode.recordClassIndex(60050);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m95280a(this, viewGroup, i);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C50875d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            C89219l.m154721d(viewHolder, "");
            C89378p pVar = (C89378p) mo129933a(i);
            C50871f fVar = C50871f.this;
            FilterBean filterBean = (FilterBean) pVar.getFirst();
            EnumC50699g gVar = (EnumC50699g) pVar.getSecond();
            C89219l.m154721d(viewHolder, "");
            C89219l.m154721d(filterBean, "");
            C89219l.m154721d(gVar, "");
            String str = null;
            if (!(viewHolder instanceof C50925o)) {
                viewHolder = null;
            }
            C50925o oVar = (C50925o) viewHolder;
            if (oVar != null) {
                FilterBean filterBean2 = fVar.f117375d;
                if (filterBean2 == null || filterBean2.getId() != filterBean.getId()) {
                    z = false;
                } else {
                    z = true;
                }
                C89219l.m154721d(filterBean, "");
                C89219l.m154721d(gVar, "");
                CircleDraweeView imageView = oVar.f117510b.getImageView();
                Uri thumbnailFileUri = filterBean.getThumbnailFileUri();
                if (thumbnailFileUri != null) {
                    str = thumbnailFileUri.toString();
                }
                C84402a.m145173a(imageView, str);
                oVar.f117510b.setText(filterBean.getName());
                oVar.f117510b.setCustomSelected(z);
                if (oVar.f117513e != gVar) {
                    int i2 = C50927p.f117516a[gVar.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        oVar.mo86279a();
                        ImageView imageView2 = oVar.f117509a;
                        C89219l.m154716b(imageView2, "");
                        imageView2.setVisibility(0);
                    } else if (i2 == 3 || i2 == 4) {
                        oVar.mo86279a();
                        ImageView imageView3 = oVar.f117509a;
                        C89219l.m154716b(imageView3, "");
                        imageView3.setVisibility(8);
                    } else if (i2 == 5) {
                        ImageView imageView4 = oVar.f117509a;
                        C89219l.m154716b(imageView4, "");
                        imageView4.setVisibility(0);
                        oVar.f117509a.setImageResource(2131230947);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oVar.f117509a, "rotation", 0.0f, 360.0f);
                        C89219l.m154716b(ofFloat, "");
                        ofFloat.setDuration(800L);
                        ofFloat.setRepeatMode(1);
                        ofFloat.setRepeatCount(-1);
                        ofFloat.start();
                        oVar.f117511c = ofFloat;
                    }
                }
                oVar.f117512d = filterBean;
                oVar.f117513e = gVar;
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m95280a(C50875d dVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(1865);
            C89219l.m154721d(viewGroup, "");
            C50871f fVar = C50871f.this;
            AbstractC89183m<FilterBean, EnumC50699g, C89391z> mVar = fVar.f117378g;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(mVar, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.dg, viewGroup, false);
            C89219l.m154716b(a2, "");
            Context context = a2.getContext();
            C89219l.m154716b(context, "");
            C50876e eVar = new C50876e(fVar, a2);
            C89219l.m154721d(context, "");
            C89219l.m154721d(eVar, "");
            C85035a.C85036a aVar = new C85035a.C85036a(context);
            eVar.invoke(aVar);
            C85035a b = aVar.mo122016b();
            if (C84370a.f188623l.f188630f) {
                TextView textView = b.getTextView();
                if (textView != null) {
                    textView.setTextSize(12.0f);
                }
                TextView textView2 = b.getTextView();
                if (textView2 != null) {
                    C84981g.m146055a(textView2);
                }
            } else {
                TextView textView3 = b.getTextView();
                if (textView3 != null) {
                    textView3.setTextSize(11.0f);
                }
                TextView textView4 = b.getTextView();
                if (textView4 != null) {
                    textView4.setTypeface(Typeface.defaultFromStyle(0));
                }
            }
            b.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            b.setId(R.id.br3);
            ((FrameLayout) a2.findViewById(R.id.bqs)).addView(b, 0);
            C50925o oVar = new C50925o(a2, mVar);
            try {
                if (oVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(oVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) oVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(oVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = oVar.getClass().getName();
            MethodCollector.m26664o(1865);
            return oVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$h */
    static final class C50879h<T> implements AbstractC1214u<FilterBean> {

        /* renamed from: a */
        final /* synthetic */ C50871f f117393a;

        static {
            Covode.recordClassIndex(60054);
        }

        C50879h(C50871f fVar) {
            this.f117393a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(FilterBean filterBean) {
            this.f117393a.mo86247c(filterBean);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$i */
    public static final class C50880i extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C50871f f117394a;

        static {
            Covode.recordClassIndex(60055);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50880i(C50871f fVar) {
            this.f117394a = fVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: f.a.l.g<com.ss.android.ugc.aweme.filter.FilterBean> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (i == 0) {
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    C89378p pVar = (C89378p) C89070n.m154561b((List) this.f117394a.f117372a.mo129934a(), this.f117394a.f117373b.mo129938a(linearLayoutManager.mo4371k()));
                    if (pVar != null) {
                        this.f117394a.f117377f.onNext(pVar.getFirst());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$k */
    public static final class C50882k extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C50871f f117398a;

        static {
            Covode.recordClassIndex(60057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50882k(C50871f fVar) {
            super(1);
            this.f117398a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f117398a.mo86245a((C50871f) num.intValue(), 0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$l */
    static final class C50883l extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C50871f f117399a;

        /* renamed from: b */
        final /* synthetic */ int f117400b;

        static {
            Covode.recordClassIndex(60058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50883l(C50871f fVar, int i) {
            super(1);
            this.f117399a = fVar;
            this.f117400b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f117399a.mo86246b(num.intValue(), this.f117400b);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: a */
    public final void mo86180a(FilterBean filterBean) {
        mo86183b(filterBean);
        AbstractC50935r rVar = this.f117384o;
        if (rVar != null) {
            rVar.mo86239a(filterBean);
        } else {
            mo86247c(filterBean);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$c */
    final class C50874c extends AbstractC85013c<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C50871f f117387a;

        static {
            Covode.recordClassIndex(60049);
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85013c
        /* renamed from: a */
        public final RecyclerView.ViewHolder mo86248a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.de, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C85023h(a);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C50874c(C50871f fVar, RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
            super(aVar);
            C89219l.m154721d(aVar, "");
            this.f117387a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
        @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85013c
        /* renamed from: a */
        public final /* synthetic */ void mo86249a(RecyclerView.ViewHolder viewHolder, C89391z zVar) {
            C89219l.m154721d(viewHolder, "");
            C89219l.m154721d(zVar, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$g */
    static final class C50878g<T> implements AbstractC1214u<Map<FilterBean, ? extends EnumC50699g>> {

        /* renamed from: a */
        final /* synthetic */ C50871f f117392a;

        static {
            Covode.recordClassIndex(60053);
        }

        C50878g(C50871f fVar) {
            this.f117392a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Map<FilterBean, ? extends EnumC50699g> map) {
            Map<FilterBean, ? extends EnumC50699g> map2 = map;
            if (map2 != null) {
                C50871f fVar = this.f117392a;
                fVar.f117374c = map2;
                int i = 0;
                for (T t : fVar.f117372a.mo129934a()) {
                    Object second = t.getSecond();
                    EnumC50699g a = C50871f.m95264a(map2, (FilterBean) t.getFirst());
                    if (second != a) {
                        fVar.f117372a.mo129935a(C89387v.m154943a(t.getFirst(), a), i);
                    }
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$m */
    public static final class C50884m extends AbstractC89220m implements AbstractC89172b<FilterBean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C50871f f117401a;

        static {
            Covode.recordClassIndex(60059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50884m(C50871f fVar) {
            super(1);
            this.f117401a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            if (filterBean2 != null) {
                Iterator<C89378p<FilterBean, EnumC50699g>> it = this.f117401a.f117372a.mo129934a().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().getFirst().getId() != filterBean2.getId()) {
                        i++;
                    } else if (i >= 0) {
                        this.f117401a.f117372a.notifyItemChanged(i);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: b */
    public final void mo86183b(FilterBean filterBean) {
        m95265a(filterBean, new C50882k(this));
    }

    /* renamed from: c */
    public final void mo86247c(FilterBean filterBean) {
        FilterBean filterBean2 = this.f117375d;
        if (filterBean2 != null || filterBean != null) {
            this.f117375d = filterBean;
            C50884m mVar = new C50884m(this);
            if (!C89219l.m154714a(filterBean2, filterBean)) {
                mVar.invoke(filterBean2);
                mVar.invoke(filterBean);
            }
            this.f117382m.onNext(C20171g.m38149a(filterBean));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$e */
    public static final class C50876e extends AbstractC89220m implements AbstractC89172b<C85035a.C85036a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C50871f f117389a;

        /* renamed from: b */
        final /* synthetic */ View f117390b;

        static {
            Covode.recordClassIndex(60051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50876e(C50871f fVar, View view) {
            super(1);
            this.f117389a = fVar;
            this.f117390b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C85035a.C85036a aVar) {
            C85035a.C85036a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f190273d = true;
            View view = this.f117390b;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            aVar2.f190277h = (int) C84912r.m145930a(context, 52.0f);
            View view2 = this.f117390b;
            C89219l.m154716b(view2, "");
            Context context2 = view2.getContext();
            C89219l.m154716b(context2, "");
            aVar2.f190276g = (int) C84912r.m145930a(context2, 52.0f);
            aVar2.f190278i = 2131230949;
            aVar2.f190284o = true;
            aVar2.f190279j = true;
            AbstractC89172b<? super C85035a.C85036a, C89391z> bVar = this.f117389a.f117381j.f117404c;
            if (bVar != null) {
                bVar.invoke(aVar2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50821g
    /* renamed from: a */
    public final void mo86178a(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        C89219l.m154721d(map, "");
        ArrayList<FilterBean> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (T t : map.entrySet()) {
            arrayList.addAll((Collection) t.getValue());
            if (i < map.size() - 1 && (!((Collection) t.getValue()).isEmpty())) {
                arrayList2.add(C89387v.m154943a(Integer.valueOf(arrayList.size() - 1), C89391z.f203057a));
            }
            i++;
        }
        AbstractC85012b<C89378p<FilterBean, EnumC50699g>> bVar = this.f117372a;
        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
        for (FilterBean filterBean : arrayList) {
            arrayList3.add(C89387v.m154943a(filterBean, m95264a(this.f117374c, filterBean)));
        }
        bVar.mo129937b(arrayList3);
        this.f117373b.mo129940a(arrayList2);
        AbstractC50936s sVar = this.f117385p;
        if (sVar != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry<EffectCategoryResponse, ? extends List<? extends FilterBean>> entry : map.entrySet()) {
                C89070n.m154535a((Collection) arrayList4, (Iterable) ((List) entry.getValue()));
            }
            sVar.mo86242a(arrayList4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$f */
    static final class C50877f extends AbstractC89220m implements AbstractC89183m<FilterBean, EnumC50699g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C50871f f117391a;

        static {
            Covode.recordClassIndex(60052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50877f(C50871f fVar) {
            super(2);
            this.f117391a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(FilterBean filterBean, EnumC50699g gVar) {
            C89219l.m154721d(filterBean, "");
            C89219l.m154721d(gVar, "");
            C50871f fVar = this.f117391a;
            fVar.f117376e.onNext(filterBean);
            AbstractC89187q<AbstractC50822h, FilterBean, EnumC50699g, C89391z> qVar = fVar.f117380i;
            if (qVar != null) {
                qVar.invoke(fVar, filterBean, gVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    static EnumC50699g m95264a(Map<FilterBean, ? extends EnumC50699g> map, FilterBean filterBean) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(filterBean, "");
        EnumC50699g gVar = (EnumC50699g) map.get(filterBean);
        if (gVar == null) {
            return EnumC50699g.FILTER_STATE_UNKNOWN;
        }
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo86246b(int i, int i2) {
        RecyclerView.AbstractC1362i layoutManager = this.f117379h.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            linearLayoutManager.mo4347a(i, i2);
        }
    }

    /* renamed from: a */
    private final void m95265a(FilterBean filterBean, AbstractC89172b<? super Integer, C89391z> bVar) {
        if (filterBean != null) {
            int i = 0;
            for (C89378p<FilterBean, EnumC50699g> pVar : this.f117372a.mo129934a()) {
                if (pVar.getFirst().getId() != filterBean.getId()) {
                    i++;
                } else if (i >= 0) {
                    bVar.invoke(Integer.valueOf(this.f117373b.mo129941b(i)));
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo86245a(int i, int i2) {
        if (this.f117379h.getWidth() != 0 || i2 >= 3) {
            this.f117379h.mo4413b(i);
        } else {
            this.f117379h.post(new RunnableC50881j(this, i, i2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: a */
    public final void mo86181a(FilterBean filterBean, int i) {
        m95265a(filterBean, new C50883l(this, i));
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$b */
    static final class C50873b extends AbstractC89220m implements AbstractC89187q<AbstractC50822h, FilterBean, EnumC50699g, C89391z> {

        /* renamed from: a */
        public static final C50873b f117386a = new C50873b();

        static {
            Covode.recordClassIndex(60048);
        }

        C50873b() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC50822h hVar, FilterBean filterBean, EnumC50699g gVar) {
            AbstractC50822h hVar2 = hVar;
            FilterBean filterBean2 = filterBean;
            C89219l.m154721d(hVar2, "");
            C89219l.m154721d(filterBean2, "");
            C89219l.m154721d(gVar, "");
            hVar2.mo86180a(filterBean2);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.q<? super com.ss.android.ugc.aweme.filter.view.a.h, ? super com.ss.android.ugc.aweme.filter.FilterBean, ? super com.ss.android.ugc.aweme.filter.repository.a.g, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C50871f(RecyclerView recyclerView, AbstractC1204m mVar, AbstractC50935r rVar, AbstractC50936s sVar, AbstractC89187q<? super AbstractC50822h, ? super FilterBean, ? super EnumC50699g, C89391z> qVar, C50885g gVar) {
        RecyclerView recyclerView2;
        LiveData<FilterBean> a;
        LiveData<Map<FilterBean, EnumC50699g>> a2;
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(gVar, "");
        this.f117379h = recyclerView;
        this.f117383n = mVar;
        this.f117384o = rVar;
        this.f117385p = sVar;
        this.f117380i = qVar;
        this.f117381j = gVar;
        C50875d dVar = new C50875d();
        this.f117372a = dVar;
        C50874c cVar = new C50874c(this, dVar);
        this.f117373b = cVar;
        C88960c cVar2 = new C88960c();
        C89219l.m154716b(cVar2, "");
        this.f117376e = cVar2;
        C88960c cVar3 = new C88960c();
        C89219l.m154716b(cVar3, "");
        this.f117382m = cVar3;
        C88960c cVar4 = new C88960c();
        C89219l.m154716b(cVar4, "");
        this.f117377f = cVar4;
        this.f117378g = new C50877f(this);
        RecyclerView recyclerView3 = null;
        if (!(recyclerView instanceof StyleRecyclerView)) {
            recyclerView2 = null;
        } else {
            recyclerView2 = recyclerView;
        }
        StyleRecyclerView styleRecyclerView = (StyleRecyclerView) recyclerView2;
        if (styleRecyclerView != null) {
            styleRecyclerView.setItemShowBorder(this.f117381j.f117403b);
        }
        Context context = recyclerView.getContext();
        if (context != null) {
            StyleRecyclerView styleRecyclerView2 = (StyleRecyclerView) (recyclerView instanceof StyleRecyclerView ? recyclerView : recyclerView3);
            if (styleRecyclerView2 != null) {
                styleRecyclerView2.setItemMargin((int) C84912r.m145930a(context, (float) this.f117381j.f117402a));
            }
        }
        recyclerView.setAdapter(cVar);
        if (!(sVar == null || (a2 = sVar.mo86241a()) == null)) {
            a2.observe(mVar, new C50878g(this));
        }
        if (!(rVar == null || (a = rVar.mo86238a()) == null)) {
            a.observe(mVar, new C50879h(this));
        }
        recyclerView.mo4405a(new C50880i(this));
    }
}
