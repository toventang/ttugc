package com.p2082ss.android.ugc.tools.infosticker.view.internal.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85012b;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85021g;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.C85023h;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85029d;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85030e;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b */
public abstract class AbstractC84650b<DATA> implements AbstractC84631b<DATA> {

    /* renamed from: a */
    private Map<DATA, ? extends C89378p<? extends EnumC84444c, Integer>> f189136a;

    /* renamed from: b */
    private final AbstractC88969g<C89378p<List<DATA>, Integer>> f189137b;

    /* renamed from: c */
    private final AbstractC1204m f189138c;

    /* renamed from: d */
    public final C84654c f189139d;

    /* renamed from: e */
    protected View f189140e;

    /* renamed from: f */
    protected RecyclerView f189141f;

    /* renamed from: g */
    protected AbstractC85027b<EnumC85026a> f189142g;

    /* renamed from: h */
    protected AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> f189143h;

    /* renamed from: i */
    AbstractC85021g f189144i;

    /* renamed from: j */
    final AbstractC88969g<C20375am<DATA, Integer, EnumC84444c>> f189145j;

    /* renamed from: k */
    final AbstractC88969g<DATA> f189146k;

    /* renamed from: l */
    final AbstractC88969g<DATA> f189147l;

    /* renamed from: m */
    public final AbstractC88969g<Integer> f189148m;

    /* renamed from: n */
    public final AbstractC88969g<C89378p<DATA, Integer>> f189149n;

    /* renamed from: o */
    public final AbstractC88969g<C89378p<DATA, Integer>> f189150o;

    /* renamed from: p */
    public final AbstractC88969g<EnumC84444c> f189151p;

    /* renamed from: q */
    int f189152q;

    /* renamed from: r */
    public final AbstractC89187q<DATA, Integer, EnumC84444c, C89391z> f189153r;

    /* renamed from: s */
    public final Context f189154s;

    /* renamed from: t */
    final AbstractC84693e<DATA> f189155t;

    /* renamed from: u */
    public final AbstractC84700k<DATA> f189156u;

    /* renamed from: v */
    private final ViewGroup f189157v;

    /* renamed from: w */
    private final int f189158w;

    /* renamed from: x */
    private final boolean f189159x;

    /* renamed from: y */
    private final boolean f189160y;

    /* renamed from: z */
    private final boolean f189161z;

    static {
        Covode.recordClassIndex(98617);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo114471a(ViewGroup viewGroup, AbstractC89187q<? super DATA, ? super Integer, ? super EnumC84444c, C89391z> qVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo114476a(RecyclerView.ViewHolder viewHolder, int i, DATA data, EnumC84444c cVar, Integer num);

    /* renamed from: b */
    public int mo129577b(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public RecyclerView.AbstractC1361h mo129589x() {
        return null;
    }

    /* renamed from: c */
    public AbstractC1204m mo114480c() {
        return this.f189138c;
    }

    /* renamed from: d */
    public int mo114481d() {
        return this.f189158w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$n */
    public static final class C84669n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189182a;

        static {
            Covode.recordClassIndex(98636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84669n(AbstractC84650b bVar) {
            super(0);
            this.f189182a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f189182a.cK_();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$s */
    public static final class RunnableC84677s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189190a;

        static {
            Covode.recordClassIndex(98644);
        }

        RunnableC84677s(AbstractC84650b bVar) {
            this.f189190a = bVar;
        }

        public final void run() {
            this.f189190a.mo129587v();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    public final void cK_() {
        AbstractC84693e<DATA> eVar = this.f189155t;
        if (eVar != null) {
            eVar.mo129563f();
        }
    }

    /* renamed from: u */
    public final void mo129586u() {
        AbstractC84693e<DATA> eVar = this.f189155t;
        if (eVar != null) {
            eVar.mo129564g();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$c */
    public static class C84654c {

        /* renamed from: a */
        public boolean f189165a;

        /* renamed from: b */
        public AbstractC89183m<? super AbstractC85027b<EnumC85026a>, ? super AbstractC89171a<C89391z>, C89391z> f189166b;

        /* renamed from: c */
        public AbstractC89172b<? super RecyclerView, C89391z> f189167c;

        /* renamed from: d */
        public AbstractC89172b<? super RecyclerView.ViewHolder, C89391z> f189168d;

        static {
            Covode.recordClassIndex(98621);
        }

        private C84654c() {
            this.f189165a = false;
            this.f189166b = null;
            this.f189167c = null;
            this.f189168d = null;
        }

        public /* synthetic */ C84654c(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$k */
    public static final /* synthetic */ class C84666k extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(98633);
        }

        C84666k(AbstractC84650b bVar) {
            super(0, bVar, AbstractC84650b.class, "onLoadMoreTriggered", "onLoadMoreTriggered()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC84693e<DATA> eVar = ((AbstractC84650b) this.receiver).f189155t;
            if (eVar != null) {
                eVar.mo129564g();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    /* renamed from: f */
    public final AbstractC88979t<C20375am<DATA, Integer, EnumC84444c>> mo129532f() {
        AbstractC88979t<C20375am<DATA, Integer, EnumC84444c>> c = this.f189145j.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    /* renamed from: g */
    public final AbstractC88979t<DATA> mo129533g() {
        AbstractC88979t<DATA> c = this.f189146k.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    /* renamed from: h */
    public final AbstractC88979t<DATA> mo129534h() {
        AbstractC88979t<DATA> c = this.f189147l.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    /* renamed from: i */
    public final AbstractC88979t<C89378p<DATA, Integer>> mo129535i() {
        AbstractC88979t<C89378p<DATA, Integer>> c = this.f189149n.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    /* renamed from: j */
    public final AbstractC88979t<Integer> mo129536j() {
        AbstractC88979t<Integer> c = this.f189148m.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    /* renamed from: k */
    public final AbstractC88979t<C89378p<List<DATA>, Integer>> mo129537k() {
        AbstractC88979t<C89378p<List<DATA>, Integer>> c = this.f189137b.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    /* renamed from: l */
    public final View mo129538l() {
        View view = this.f189140e;
        if (view == null) {
            C89219l.m154710a("contentView");
        }
        return view;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    /* renamed from: n */
    public final AbstractC88979t<EnumC84444c> mo129540n() {
        AbstractC88979t<EnumC84444c> c = this.f189151p.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final View mo129580o() {
        View view = this.f189140e;
        if (view == null) {
            C89219l.m154710a("contentView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final RecyclerView mo129581p() {
        RecyclerView recyclerView = this.f189141f;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final AbstractC85027b<EnumC85026a> mo129582q() {
        AbstractC85027b<EnumC85026a> bVar = this.f189142g;
        if (bVar == null) {
            C89219l.m154710a("pageStateView");
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> mo129583r() {
        AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> bVar = this.f189143h;
        if (bVar == null) {
            C89219l.m154710a("dataAdapter");
        }
        return bVar;
    }

    /* renamed from: s */
    public final void mo129584s() {
        mo129585t();
        mo114475a(mo114480c());
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    /* renamed from: m */
    public final AbstractC88979t<List<C89378p<DATA, Integer>>> mo129539m() {
        AbstractC88979t<List<C89378p<DATA, Integer>>> c = this.f189150o.mo143284c(500, TimeUnit.MILLISECONDS).mo143268a(C84670o.f189183a).mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ss.android.ugc.tools.view.widget.a.g, com.ss.android.ugc.tools.infosticker.view.internal.base.b$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.recyclerview.widget.RecyclerView.AbstractC1350a<androidx.recyclerview.widget.RecyclerView.ViewHolder> mo129588w() {
        /*
            r3 = this;
            boolean r0 = r3.f189160y
            java.lang.String r2 = "dataAdapter"
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.tools.infosticker.view.internal.base.b$b r1 = new com.ss.android.ugc.tools.infosticker.view.internal.base.b$b
            com.ss.android.ugc.tools.view.widget.a.b<com.bytedance.jedi.arch.am<DATA, com.ss.android.ugc.tools.h.a.c, java.lang.Integer>> r0 = r3.f189143h
            if (r0 != 0) goto L_0x000f
            p4600h.p4611f.p4613b.C89219l.m154710a(r2)
        L_0x000f:
            r1.<init>(r3, r0)
            r3.f189144i = r1
        L_0x0014:
            return r1
        L_0x0015:
            com.ss.android.ugc.tools.view.widget.a.b<com.bytedance.jedi.arch.am<DATA, com.ss.android.ugc.tools.h.a.c, java.lang.Integer>> r1 = r3.f189143h
            if (r1 != 0) goto L_0x0014
            p4600h.p4611f.p4613b.C89219l.m154710a(r2)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b.mo129588w():androidx.recyclerview.widget.RecyclerView$a");
    }

    /* renamed from: t */
    public void mo129585t() {
        View a = mo129572a(this.f189157v);
        this.f189140e = a;
        if (a == null) {
            C89219l.m154710a("contentView");
        }
        RecyclerView a2 = mo114472a(a);
        AbstractC89172b<? super RecyclerView, C89391z> bVar = this.f189139d.f189167c;
        if (bVar != null) {
            bVar.invoke(a2);
        }
        this.f189141f = a2;
        View view = this.f189140e;
        if (view == null) {
            C89219l.m154710a("contentView");
        }
        AbstractC85027b<EnumC85026a> b = mo114478b(view);
        AbstractC89183m<? super AbstractC85027b<EnumC85026a>, ? super AbstractC89171a<C89391z>, C89391z> mVar = this.f189139d.f189166b;
        if (mVar != null) {
            mVar.invoke(b, new C84669n(this));
        }
        this.f189142g = b;
        this.f189143h = new C84652a();
        RecyclerView recyclerView = this.f189141f;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView.setAdapter(mo129588w());
        RecyclerView.AbstractC1361h x = mo129589x();
        if (x != null) {
            RecyclerView recyclerView2 = this.f189141f;
            if (recyclerView2 == null) {
                C89219l.m154710a("recyclerView");
            }
            recyclerView2.mo4415b(x);
        }
    }

    /* renamed from: v */
    public final void mo129587v() {
        if (this.f189161z) {
            RecyclerView recyclerView = this.f189141f;
            if (recyclerView == null) {
                C89219l.m154710a("recyclerView");
            }
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                ArrayList arrayList = new ArrayList();
                int c = mo129579c(linearLayoutManager.mo4371k());
                int c2 = mo129579c(linearLayoutManager.mo4373m());
                if (c < c2 && c <= c2) {
                    int i = c;
                    while (true) {
                        AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> bVar = this.f189143h;
                        if (bVar == null) {
                            C89219l.m154710a("dataAdapter");
                        }
                        C20375am amVar = (C20375am) C89070n.m154561b((List) bVar.mo129934a(), i);
                        if (amVar != null) {
                            arrayList.add(amVar.f48260a);
                        }
                        if (i == c2) {
                            break;
                        }
                        i++;
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f189137b.onNext(C89387v.m154943a(arrayList, Integer.valueOf(c)));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b
    /* renamed from: b */
    public void mo114479b() {
        AbstractC84693e<DATA> eVar = this.f189155t;
        if (eVar != null) {
            eVar.mo129559b().removeObservers(mo114480c());
            eVar.mo129560c().removeObservers(mo114480c());
            eVar.mo129561d().removeObservers(mo114480c());
        }
        AbstractC84700k<DATA> kVar = this.f189156u;
        if (kVar != null) {
            kVar.mo129569j().removeObservers(mo114480c());
            kVar.mo129570k().removeObservers(mo114480c());
            kVar.mo129571l().removeObservers(mo114480c());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$a */
    public final class C84652a extends AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> {
        static {
            Covode.recordClassIndex(98619);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m145508a(this, viewGroup, i);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C84652a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            C89219l.m154721d(viewHolder, "");
            C20375am amVar = (C20375am) mo129933a(i);
            AbstractC84650b.this.mo114476a(viewHolder, i, amVar.f48260a, amVar.f48261b, amVar.f48262c);
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m145508a(C84652a aVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(10774);
            C89219l.m154721d(viewGroup, "");
            AbstractC84650b bVar = AbstractC84650b.this;
            RecyclerView.ViewHolder a2 = bVar.mo114471a(viewGroup, bVar.f189153r);
            AbstractC89172b<? super RecyclerView.ViewHolder, C89391z> bVar2 = AbstractC84650b.this.f189139d.f189168d;
            if (bVar2 != null) {
                bVar2.invoke(a2);
            }
            try {
                if (a2.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(a2.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = a2.getClass().getName();
            MethodCollector.m26664o(10774);
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$l */
    public static final class C84667l extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189180a;

        static {
            Covode.recordClassIndex(98634);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84667l(AbstractC84650b bVar) {
            this.f189180a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            this.f189180a.f189148m.onNext(Integer.valueOf(i));
            if (i == 0) {
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    int c = this.f189180a.mo129579c(linearLayoutManager.mo4371k());
                    C20375am amVar = (C20375am) C89070n.m154561b((List) this.f189180a.mo129583r().mo129934a(), c);
                    if (amVar != null) {
                        this.f189180a.f189149n.onNext(C89387v.m154943a(amVar.f48260a, Integer.valueOf(c)));
                    }
                }
                this.f189180a.mo129587v();
            }
            AbstractC84650b bVar = this.f189180a;
            if (bVar.f189139d.f189165a) {
                if (i == 0) {
                    C24413h c2 = C24182c.m45844c();
                    C89219l.m154716b(c2, "");
                    if (c2.mo40237d()) {
                        C24182c.m45844c().mo40233c();
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        C24182c.m45844c().mo40230b();
                    }
                } else if (bVar.f189152q == 2) {
                    C24182c.m45844c().mo40230b();
                } else {
                    C24413h c3 = C24182c.m45844c();
                    C89219l.m154716b(c3, "");
                    if (c3.mo40237d()) {
                        C24182c.m45844c().mo40233c();
                    }
                }
                bVar.f189152q = i;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$m */
    public static final class C84668m implements RecyclerView.AbstractC1368k {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189181a;

        static {
            Covode.recordClassIndex(98635);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1368k
        /* renamed from: b */
        public final void mo4748b(View view) {
            C89219l.m154721d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84668m(AbstractC84650b bVar) {
            this.f189181a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1368k
        /* renamed from: a */
        public final void mo4747a(View view) {
            C89219l.m154721d(view, "");
            this.f189181a.mo129581p();
            int d = RecyclerView.m4277d(view);
            C20375am amVar = (C20375am) C89070n.m154561b((List) this.f189181a.mo129583r().mo129934a(), this.f189181a.mo129579c(d));
            if (amVar != null) {
                this.f189181a.f189150o.onNext(C89387v.m154943a(amVar.f48260a, Integer.valueOf(d + 1)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$b */
    public final class C84653b extends AbstractC85021g {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189164a;

        static {
            Covode.recordClassIndex(98620);
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85021g
        /* renamed from: a */
        public final RecyclerView.ViewHolder mo129590a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            return this.f189164a.mo129578b(viewGroup);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84653b(AbstractC84650b bVar, RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
            super(aVar, (byte) 0);
            C89219l.m154721d(aVar, "");
            this.f189164a = bVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85021g
        /* renamed from: a */
        public final void mo129591a(RecyclerView.ViewHolder viewHolder, EnumC85026a aVar) {
            C89219l.m154721d(viewHolder, "");
            C89219l.m154721d(aVar, "");
            this.f189164a.mo129573a(viewHolder, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$g */
    public static final class C84660g<T> implements AbstractC1214u<EnumC85026a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189174a;

        static {
            Covode.recordClassIndex(98627);
        }

        C84660g(AbstractC84650b bVar) {
            this.f189174a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(EnumC85026a aVar) {
            AbstractC85021g gVar;
            EnumC85026a aVar2 = aVar;
            if (aVar2 != null && (gVar = this.f189174a.f189144i) != null) {
                gVar.setState(aVar2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$h */
    public static final class C84661h<T> implements AbstractC1214u<Map<DATA, ? extends C89378p<? extends EnumC84444c, ? extends Integer>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189175a;

        static {
            Covode.recordClassIndex(98628);
        }

        C84661h(AbstractC84650b bVar) {
            this.f189175a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Map<DATA, ? extends C89378p<? extends EnumC84444c, Integer>> map = (Map) obj;
            if (map != null) {
                this.f189175a.mo129576a(map);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$i */
    public static final class C84662i<T> implements AbstractC1214u<C20391d<? extends List<? extends DATA>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189176a;

        static {
            Covode.recordClassIndex(98629);
        }

        C84662i(AbstractC84650b bVar) {
            this.f189176a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C20391d dVar = (C20391d) obj;
            if (dVar != null) {
                dVar.mo33724a(new AbstractC89172b<List<? extends DATA>, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b.C84662i.C846631 */

                    /* renamed from: a */
                    final /* synthetic */ C84662i f189177a;

                    static {
                        Covode.recordClassIndex(98630);
                    }

                    {
                        this.f189177a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Object obj) {
                        List<T> list = (List) obj;
                        C89219l.m154721d(list, "");
                        AbstractC84650b bVar = this.f189177a.f189176a;
                        for (T t : list) {
                            bVar.f189146k.onNext(t);
                        }
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$j */
    public static final class C84664j<T> implements AbstractC1214u<C20391d<? extends List<? extends DATA>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189178a;

        static {
            Covode.recordClassIndex(98631);
        }

        C84664j(AbstractC84650b bVar) {
            this.f189178a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C20391d dVar = (C20391d) obj;
            if (dVar != null) {
                dVar.mo33724a(new AbstractC89172b<List<? extends DATA>, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b.C84664j.C846651 */

                    /* renamed from: a */
                    final /* synthetic */ C84664j f189179a;

                    static {
                        Covode.recordClassIndex(98632);
                    }

                    {
                        this.f189179a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Object obj) {
                        List<T> list = (List) obj;
                        C89219l.m154721d(list, "");
                        AbstractC84650b bVar = this.f189179a.f189178a;
                        for (T t : list) {
                            bVar.f189147l.onNext(t);
                        }
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$p */
    public static final class C84671p extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        public static final C84671p f189184a = new C84671p();

        static {
            Covode.recordClassIndex(98638);
        }

        C84671p() {
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$q */
    public static final class C84672q extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        public static final C84672q f189185a = new C84672q();

        static {
            Covode.recordClassIndex(98639);
        }

        C84672q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146190a(viewGroup2, C846731.f189186a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$d */
    public static final class C84655d extends AbstractC89220m implements AbstractC89172b<TextView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189169a;

        static {
            Covode.recordClassIndex(98622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84655d(AbstractC84650b bVar) {
            super(1);
            this.f189169a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TextView textView) {
            TextView textView2 = textView;
            C89219l.m154721d(textView2, "");
            textView2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b.C84655d.View$OnClickListenerC846561 */

                /* renamed from: a */
                final /* synthetic */ C84655d f189170a;

                static {
                    Covode.recordClassIndex(98623);
                }

                {
                    this.f189170a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f189170a.f189169a.mo129586u();
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$e */
    public static final class C84657e<T> implements AbstractC1214u<List<? extends DATA>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189171a;

        static {
            Covode.recordClassIndex(98624);
        }

        C84657e(AbstractC84650b bVar) {
            this.f189171a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<? extends DATA> list = (List) obj;
            if (list != null) {
                this.f189171a.mo129575a(list);
            }
            this.f189171a.mo129581p().post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b.C84657e.RunnableC846581 */

                /* renamed from: a */
                final /* synthetic */ C84657e f189172a;

                static {
                    Covode.recordClassIndex(98625);
                }

                {
                    this.f189172a = r1;
                }

                public final void run() {
                    this.f189172a.f189171a.f189151p.onNext(EnumC84444c.DOWNLOAD_SUCCESS);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$f */
    public static final class C84659f<T> implements AbstractC1214u<EnumC85026a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189173a;

        static {
            Covode.recordClassIndex(98626);
        }

        C84659f(AbstractC84650b bVar) {
            this.f189173a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(EnumC85026a aVar) {
            EnumC85026a aVar2 = aVar;
            if (aVar2 != null) {
                this.f189173a.mo129574a(aVar2);
                if (aVar2 == EnumC85026a.ERROR) {
                    this.f189173a.f189151p.onNext(EnumC84444c.DOWNLOAD_FAILED);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$o */
    static final class C84670o<T> implements AbstractC88438k<List<C89378p<? extends DATA, ? extends Integer>>> {

        /* renamed from: a */
        public static final C84670o f189183a = new C84670o();

        static {
            Covode.recordClassIndex(98637);
        }

        C84670o() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            if (!list.isEmpty()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$r */
    public static final class C84674r extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189187a;

        static {
            Covode.recordClassIndex(98641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84674r(AbstractC84650b bVar) {
            super(1);
            this.f189187a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146191a(viewGroup2, new AbstractC89187q<TextView, TextView, TextView, C89391z>(this) {
                /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b.C84674r.C846751 */

                /* renamed from: a */
                final /* synthetic */ C84674r f189188a;

                static {
                    Covode.recordClassIndex(98642);
                }

                {
                    this.f189188a = r2;
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
                        /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b.C84674r.C846751.View$OnClickListenerC846761 */

                        /* renamed from: a */
                        final /* synthetic */ C846751 f189189a;

                        static {
                            Covode.recordClassIndex(98643);
                        }

                        {
                            this.f189189a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            this.f189189a.f189188a.f189187a.cK_();
                        }
                    });
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: a */
    public View mo129572a(ViewGroup viewGroup) {
        View a = C1764a.m5927a(LayoutInflater.from(this.f189154s), R.layout.b3o, viewGroup, this.f189159x);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public RecyclerView mo114472a(View view) {
        C89219l.m154721d(view, "");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.e93);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mo114481d(), 1, false);
        recyclerView.setItemViewCacheSize(mo114481d());
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(gridLayoutManager);
        return recyclerView;
    }

    /* renamed from: c */
    public int mo129579c(int i) {
        AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> bVar = this.f189143h;
        if (bVar == null) {
            C89219l.m154710a("dataAdapter");
        }
        if (i < bVar.getItemCount()) {
            return i;
        }
        AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> bVar2 = this.f189143h;
        if (bVar2 == null) {
            C89219l.m154710a("dataAdapter");
        }
        if (bVar2.getItemCount() == 0) {
            return 0;
        }
        AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> bVar3 = this.f189143h;
        if (bVar3 == null) {
            C89219l.m154710a("dataAdapter");
        }
        return bVar3.getItemCount() - 1;
    }

    /* renamed from: b */
    public RecyclerView.ViewHolder mo129578b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        C84655d dVar = new C84655d(this);
        C89219l.m154721d(context, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC85026a.LOADING, C85030e.C85031a.f190237a);
        linkedHashMap.put(EnumC85026a.EMPTY, new C85030e.C85032b());
        linkedHashMap.put(EnumC85026a.ERROR, new C85030e.C85033c(dVar));
        C85029d dVar2 = new C85029d(context, linkedHashMap, EnumC85026a.NONE, (byte) 0);
        dVar2.setLayoutParams(new RecyclerView.C1367j(-1, context.getResources().getDimensionPixelSize(R.dimen.ts)));
        return new C85023h(dVar2);
    }

    /* renamed from: a */
    public void mo114475a(AbstractC1204m mVar) {
        LiveData<C20391d<List<DATA>>> l;
        LiveData<C20391d<List<DATA>>> k;
        LiveData<Map<DATA, C89378p<EnumC84444c, Integer>>> j;
        AbstractC84693e<DATA> eVar;
        LiveData<EnumC85026a> d;
        LiveData<EnumC85026a> c;
        LiveData<List<DATA>> b;
        C89219l.m154721d(mVar, "");
        AbstractC84693e<DATA> eVar2 = this.f189155t;
        if (!(eVar2 == null || (b = eVar2.mo129559b()) == null)) {
            b.observe(mVar, new C84657e(this));
        }
        AbstractC84693e<DATA> eVar3 = this.f189155t;
        if (!(eVar3 == null || (c = eVar3.mo129560c()) == null)) {
            c.observe(mVar, new C84659f(this));
        }
        if (!(!this.f189160y || (eVar = this.f189155t) == null || (d = eVar.mo129561d()) == null)) {
            d.observe(mVar, new C84660g(this));
        }
        AbstractC84700k<DATA> kVar = this.f189156u;
        if (!(kVar == null || (j = kVar.mo129569j()) == null)) {
            j.observe(mVar, new C84661h(this));
        }
        AbstractC84700k<DATA> kVar2 = this.f189156u;
        if (!(kVar2 == null || (k = kVar2.mo129570k()) == null)) {
            k.observe(mVar, new C84662i(this));
        }
        AbstractC84700k<DATA> kVar3 = this.f189156u;
        if (!(kVar3 == null || (l = kVar3.mo129571l()) == null)) {
            l.observe(mVar, new C84664j(this));
        }
        AbstractC85021g gVar = this.f189144i;
        if (gVar != null) {
            gVar.f190202d = new C84666k(this);
        }
        RecyclerView recyclerView = this.f189141f;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView.mo4405a(new C84667l(this));
        RecyclerView recyclerView2 = this.f189141f;
        if (recyclerView2 == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView2.mo4403a(new C84668m(this));
    }

    /* renamed from: b */
    public AbstractC85027b<EnumC85026a> mo114478b(View view) {
        C89219l.m154721d(view, "");
        Map a = C89041ag.m154421a(C89387v.m154943a(EnumC85026a.LOADING, C84671p.f189184a), C89387v.m154943a(EnumC85026a.EMPTY, C84672q.f189185a), C89387v.m154943a(EnumC85026a.ERROR, new C84674r(this)));
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        C85029d dVar = new C85029d(context, a, EnumC85026a.NONE, (byte) 0);
        dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View view2 = this.f189140e;
        if (view2 == null) {
            C89219l.m154710a("contentView");
        }
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).addView(dVar);
        return dVar;
    }

    /* renamed from: a */
    public void mo129574a(EnumC85026a aVar) {
        C89219l.m154721d(aVar, "");
        AbstractC85027b<EnumC85026a> bVar = this.f189142g;
        if (bVar == null) {
            C89219l.m154710a("pageStateView");
        }
        bVar.setState(aVar);
    }

    /* renamed from: a */
    public final void mo129575a(List<? extends DATA> list) {
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            C89378p<EnumC84444c, Integer> a = C84679c.m145516a(this.f189136a, t);
            arrayList.add(new C20375am(t, a.getFirst(), a.getSecond()));
        }
        ArrayList arrayList2 = arrayList;
        AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> bVar = this.f189143h;
        if (bVar == null) {
            C89219l.m154710a("dataAdapter");
        }
        List<C20375am<DATA, EnumC84444c, Integer>> a2 = bVar.mo129934a();
        if (arrayList2.size() <= a2.size() || !(!a2.isEmpty())) {
            AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> bVar2 = this.f189143h;
            if (bVar2 == null) {
                C89219l.m154710a("dataAdapter");
            }
            bVar2.mo129936a(arrayList2);
        } else {
            List f = C89070n.m154581f(a2, arrayList2.subList(0, a2.size()));
            if (!f.isEmpty()) {
                Iterator it = f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C89378p pVar = (C89378p) it.next();
                    if (!C89219l.m154714a((Object) ((C20375am) pVar.component1()).f48260a, (Object) ((C20375am) pVar.component2()).f48260a)) {
                        break;
                    }
                }
            }
            AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> bVar3 = this.f189143h;
            if (bVar3 == null) {
                C89219l.m154710a("dataAdapter");
            }
            List subList = arrayList2.subList(a2.size(), arrayList2.size());
            if (subList != null) {
                int size = bVar3.f190187b.size();
                bVar3.f190187b.addAll(subList);
                bVar3.notifyItemRangeInserted(size, subList.size());
            }
        }
        RecyclerView recyclerView = this.f189141f;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView.post(new RunnableC84677s(this));
    }

    /* renamed from: a */
    public final void mo129576a(Map<DATA, ? extends C89378p<? extends EnumC84444c, Integer>> map) {
        this.f189136a = map;
        AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> bVar = this.f189143h;
        if (bVar == null) {
            C89219l.m154710a("dataAdapter");
        }
        int i = 0;
        for (T t : bVar.mo129934a()) {
            C89378p a = C89387v.m154943a(t.f48261b, t.f48262c);
            C89378p<EnumC84444c, Integer> a2 = C84679c.m145516a(map, t.f48260a);
            if (!C89219l.m154714a(a, a2)) {
                AbstractC85012b<C20375am<DATA, EnumC84444c, Integer>> bVar2 = this.f189143h;
                if (bVar2 == null) {
                    C89219l.m154710a("dataAdapter");
                }
                bVar2.mo129935a(new C20375am<>(t.f48260a, a2.getFirst(), a2.getSecond()), i);
            }
            i++;
        }
    }

    /* renamed from: a */
    public void mo129573a(RecyclerView.ViewHolder viewHolder, EnumC85026a aVar) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(aVar, "");
        View view = viewHolder.itemView;
        if (!(view instanceof C85029d)) {
            view = null;
        }
        C85029d dVar = (C85029d) view;
        if (dVar != null) {
            dVar.setState(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$t */
    static final class C84678t extends AbstractC89220m implements AbstractC89187q<DATA, Integer, EnumC84444c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84650b f189191a;

        static {
            Covode.recordClassIndex(98645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84678t(AbstractC84650b bVar) {
            super(3);
            this.f189191a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Object obj, Integer num, EnumC84444c cVar) {
            int intValue = num.intValue();
            C89219l.m154721d(cVar, "");
            this.f189191a.f189145j.onNext(new C20375am<>(obj, Integer.valueOf(intValue), cVar));
            return C89391z.f203057a;
        }
    }

    public /* synthetic */ AbstractC84650b(Context context, AbstractC1204m mVar, AbstractC84693e eVar, AbstractC84700k kVar, ViewGroup viewGroup, AbstractC89172b bVar) {
        this(context, mVar, eVar, kVar, viewGroup, 2, false, true, true, bVar);
    }

    public AbstractC84650b(Context context, AbstractC1204m mVar, AbstractC84693e<DATA> eVar, AbstractC84700k<DATA> kVar, ViewGroup viewGroup, int i, boolean z, boolean z2, boolean z3, AbstractC89172b<? super C84654c, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        this.f189154s = context;
        this.f189138c = mVar;
        this.f189155t = eVar;
        this.f189156u = kVar;
        this.f189157v = viewGroup;
        this.f189158w = i;
        this.f189159x = z;
        this.f189160y = z2;
        this.f189161z = true;
        C84654c cVar = new C84654c((byte) 0);
        this.f189139d = cVar;
        this.f189136a = C89041ag.m154415a();
        C88960c cVar2 = new C88960c();
        C89219l.m154716b(cVar2, "");
        this.f189145j = cVar2;
        C88960c cVar3 = new C88960c();
        C89219l.m154716b(cVar3, "");
        this.f189146k = cVar3;
        C88960c cVar4 = new C88960c();
        C89219l.m154716b(cVar4, "");
        this.f189147l = cVar4;
        C88960c cVar5 = new C88960c();
        C89219l.m154716b(cVar5, "");
        this.f189148m = cVar5;
        C88960c cVar6 = new C88960c();
        C89219l.m154716b(cVar6, "");
        this.f189149n = cVar6;
        C88960c cVar7 = new C88960c();
        C89219l.m154716b(cVar7, "");
        this.f189137b = cVar7;
        C88960c cVar8 = new C88960c();
        C89219l.m154716b(cVar8, "");
        this.f189150o = cVar8;
        C88960c cVar9 = new C88960c();
        C89219l.m154716b(cVar9, "");
        this.f189151p = cVar9;
        this.f189152q = -1;
        this.f189153r = new C84678t(this);
        if (bVar != null) {
            bVar.invoke(cVar);
        }
        cVar2.mo143301g(800, TimeUnit.MILLISECONDS).mo143289d(new AbstractC88433f<C20375am<DATA, Integer, EnumC84444c>>(this) {
            /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b.C846511 */

            /* renamed from: a */
            final /* synthetic */ AbstractC84650b f189162a;

            static {
                Covode.recordClassIndex(98618);
            }

            {
                this.f189162a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C20375am amVar = (C20375am) obj;
                AbstractC84700k<DATA> kVar = this.f189162a.f189156u;
                if (kVar != null) {
                    kVar.mo129567a(amVar.f48260a);
                }
            }
        });
    }
}
