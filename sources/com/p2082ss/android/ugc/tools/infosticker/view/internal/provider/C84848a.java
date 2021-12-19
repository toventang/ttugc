package com.p2082ss.android.ugc.tools.infosticker.view.internal.provider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1468k.C20674a;
import com.p2082ss.android.ugc.aweme.views.C81429a;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84697h;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.C84689h;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84729c;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84632c;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85019f;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85029d;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85030e;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.a */
public class C84848a extends AbstractC84650b<ProviderEffect> implements AbstractC84632c<ProviderEffect> {

    /* renamed from: A */
    private final boolean f189608A;

    /* renamed from: B */
    private final boolean f189609B;

    /* renamed from: a */
    private String f189610a;

    /* renamed from: b */
    private C84849a f189611b;

    /* renamed from: c */
    private C84729c f189612c;

    /* renamed from: v */
    public int f189613v;

    /* renamed from: w */
    private final AbstractC1204m f189614w;

    /* renamed from: x */
    private final AbstractC84697h<ProviderEffect> f189615x;

    /* renamed from: y */
    private final int f189616y;

    /* renamed from: z */
    private final boolean f189617z;

    static {
        Covode.recordClassIndex(98835);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84632c
    /* renamed from: a */
    public final String mo114473a() {
        return this.f189610a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: c */
    public final AbstractC1204m mo114480c() {
        return this.f189614w;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: d */
    public final int mo114481d() {
        return this.f189616y;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final /* synthetic */ void mo114476a(RecyclerView.ViewHolder viewHolder, int i, ProviderEffect providerEffect, EnumC84444c cVar, Integer num) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(providerEffect, "");
        C89219l.m154721d(cVar, "");
        if (!(viewHolder instanceof C84857d)) {
            viewHolder = null;
        }
        AbstractC84686f fVar = (AbstractC84686f) viewHolder;
        if (fVar != null) {
            int i2 = this.f189613v;
            C89219l.m154721d(providerEffect, "");
            C89219l.m154721d(cVar, "");
            fVar.mo129601a(providerEffect, i, cVar, num);
            CircleDraweeView imageView = fVar.f189208g.getImageView();
            if ((imageView instanceof C81429a) && imageView != null) {
                imageView.mo125081a(i2 == 0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: w */
    public final RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> mo129588w() {
        RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> w = super.mo129588w();
        if (!this.f189608A || this.f189609B) {
            return w;
        }
        C84849a aVar = new C84849a(this, w);
        this.f189611b = aVar;
        return aVar;
    }

    /* renamed from: y */
    public final void mo129672y() {
        C84729c cVar;
        if (!this.f189608A) {
            return;
        }
        if (!this.f189609B) {
            C84849a aVar = this.f189611b;
            if (aVar != null) {
                aVar.notifyItemChanged(0);
            }
        } else if (this.f189609B && (cVar = this.f189612c) != null) {
            mo129670a(cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: t */
    public final void mo129585t() {
        super.mo129585t();
        if (this.f189608A && this.f189609B) {
            View findViewById = mo129580o().findViewById(R.id.ayh);
            C89219l.m154716b(findViewById, "");
            View findViewById2 = findViewById.findViewById(R.id.e8w);
            C89219l.m154716b(findViewById2, "");
            C84729c cVar = new C84729c(findViewById, (TextView) findViewById2);
            View view = cVar.itemView;
            C89219l.m154716b(view, "");
            view.setVisibility(0);
            mo129670a(cVar);
            this.f189612c = cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final void mo114479b() {
        LiveData<String> a;
        super.mo114479b();
        AbstractC84697h<ProviderEffect> hVar = this.f189615x;
        if (hVar != null && (a = hVar.mo129617a()) != null) {
            a.removeObservers(this.f189614w);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.a$b */
    static final class C84850b<T> implements AbstractC1214u<String> {

        /* renamed from: a */
        final /* synthetic */ C84848a f189619a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f189620b;

        static {
            Covode.recordClassIndex(98837);
        }

        C84850b(C84848a aVar, AbstractC1204m mVar) {
            this.f189619a = aVar;
            this.f189620b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(String str) {
            this.f189619a.mo129671b(str);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.a$c */
    static final class C84851c<T> implements AbstractC1214u<String> {

        /* renamed from: a */
        final /* synthetic */ C84848a f189621a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f189622b;

        static {
            Covode.recordClassIndex(98838);
        }

        C84851c(C84848a aVar, AbstractC1204m mVar) {
            this.f189621a = aVar;
            this.f189622b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(String str) {
            this.f189621a.mo129672y();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.a$d */
    public static final class C84852d extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C84848a f189623a;

        static {
            Covode.recordClassIndex(98839);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84852d(C84848a aVar) {
            this.f189623a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (this.f189623a.f189613v != i) {
                this.f189623a.f189613v = i;
                C84848a aVar = this.f189623a;
                aVar.mo129669a(aVar.f189613v);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            C84848a aVar = this.f189623a;
            aVar.mo129669a(aVar.f189613v);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84632c
    /* renamed from: a */
    public final void mo114477a(String str) {
        AbstractC84697h<ProviderEffect> hVar = this.f189615x;
        if (hVar != null) {
            hVar.mo129618a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.a$a */
    public final class C84849a extends AbstractC85019f {

        /* renamed from: a */
        final /* synthetic */ C84848a f189618a;

        static {
            Covode.recordClassIndex(98836);
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85019f
        /* renamed from: a */
        public final void mo129674a(RecyclerView.ViewHolder viewHolder) {
            C89219l.m154721d(viewHolder, "");
            this.f189618a.mo129670a(viewHolder);
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85019f
        /* renamed from: a */
        public final RecyclerView.ViewHolder mo129673a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3y, viewGroup, false);
            TextView textView = (TextView) a.findViewById(R.id.e8w);
            C89219l.m154716b(a, "");
            C89219l.m154716b(textView, "");
            return new C84729c(a, textView);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84849a(C84848a aVar, RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar2) {
            super(aVar2, (byte) 0);
            C89219l.m154721d(aVar2, "");
            this.f189618a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.a$e */
    static final class C84853e extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        public static final C84853e f189624a = new C84853e();

        static {
            Covode.recordClassIndex(98840);
        }

        C84853e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146190a(viewGroup2, C848541.f189625a);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final int mo129577b(int i) {
        C84849a aVar;
        int b = super.mo129577b(i);
        if (!this.f189608A || this.f189609B || (aVar = this.f189611b) == null) {
            return b;
        }
        return b + aVar.mo129945a();
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: c */
    public final int mo129579c(int i) {
        C84849a aVar;
        if (this.f189608A && !this.f189609B && (aVar = this.f189611b) != null) {
            i -= aVar.mo129945a();
        }
        return super.mo129579c(i);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final View mo129572a(ViewGroup viewGroup) {
        if (!this.f189608A || !this.f189609B) {
            return super.mo129572a(viewGroup);
        }
        View a = C1764a.m5927a(LayoutInflater.from(this.f189154s), R.layout.b3n, viewGroup, this.f189617z);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final AbstractC85027b<EnumC85026a> mo114478b(View view) {
        C89219l.m154721d(view, "");
        AbstractC85027b<EnumC85026a> b = super.mo114478b(view);
        if (b instanceof C85029d) {
            ((C85029d) b).mo129961a(EnumC85026a.EMPTY, C84853e.f189624a);
        }
        return b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final RecyclerView mo114472a(View view) {
        C89219l.m154721d(view, "");
        RecyclerView a = super.mo114472a(view);
        if (this.f189616y >= 4) {
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            a.setFadingEdgeLength((int) C84912r.m145930a(context, 8.0f));
            a.setVerticalFadingEdgeEnabled(true);
            Context context2 = view.getContext();
            C89219l.m154716b(context2, "");
            int a2 = (int) C84912r.m145930a(context2, 3.0f);
            a.setPadding(a2, 0, a2, 0);
        }
        return a;
    }

    /* renamed from: b */
    public final void mo129671b(String str) {
        C84729c cVar;
        this.f189610a = str;
        if (!this.f189608A) {
            return;
        }
        if (!this.f189609B) {
            C84849a aVar = this.f189611b;
            if (aVar != null) {
                aVar.notifyItemChanged(0);
            }
        } else if (this.f189609B && (cVar = this.f189612c) != null) {
            mo129670a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo129669a(int i) {
        int k;
        int m;
        boolean z;
        RecyclerView.AbstractC1362i layoutManager = mo129581p().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null && (k = linearLayoutManager.mo4371k()) <= (m = linearLayoutManager.mo4373m())) {
            while (true) {
                RecyclerView.ViewHolder f = mo129581p().mo4451f(k);
                if (!(f instanceof C84857d)) {
                    f = null;
                }
                AbstractC84686f fVar = (AbstractC84686f) f;
                if (fVar != null) {
                    CircleDraweeView imageView = fVar.f189208g.getImageView();
                    if ((imageView instanceof C81429a) && imageView != null) {
                        if (i == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        imageView.mo125081a(z);
                    }
                }
                if (k != m) {
                    k++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final void mo114475a(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        super.mo114475a(mVar);
        AbstractC84697h<ProviderEffect> hVar = this.f189615x;
        if (hVar != null) {
            hVar.mo129617a().observe(mVar, new C84850b(this, mVar));
            C20674a.m38925a(hVar.mo129619h()).observe(mVar, new C84851c(this, mVar));
        }
        mo129581p().mo4405a(new C84852d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo129670a(RecyclerView.ViewHolder viewHolder) {
        TextView textView;
        LiveData<String> h;
        C89219l.m154721d(viewHolder, "");
        String str = null;
        if (!(viewHolder instanceof C84729c)) {
            viewHolder = null;
        }
        C84729c cVar = (C84729c) viewHolder;
        if (cVar != null && (textView = cVar.f189322a) != null) {
            AbstractC84697h<ProviderEffect> hVar = this.f189615x;
            if (!(hVar == null || (h = hVar.mo129619h()) == null)) {
                str = h.getValue();
            }
            textView.setText(str);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo114471a(ViewGroup viewGroup, AbstractC89187q<? super ProviderEffect, ? super Integer, ? super EnumC84444c, C89391z> qVar) {
        C89378p<FrameLayout, C85037b> a;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(qVar, "");
        if (this.f189616y >= 4) {
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            a = C84689h.m145533b(context);
        } else {
            Context context2 = viewGroup.getContext();
            C89219l.m154716b(context2, "");
            a = C84689h.m145531a(context2);
        }
        return new C84857d(a.component1(), a.component2(), qVar);
    }

    public /* synthetic */ C84848a(Context context, AbstractC1204m mVar, AbstractC84697h hVar, AbstractC84700k kVar, ViewGroup viewGroup, int i, boolean z, AbstractC89172b bVar) {
        this(context, mVar, hVar, kVar, viewGroup, i, true, z, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C84848a(Context context, AbstractC1204m mVar, AbstractC84697h<ProviderEffect> hVar, AbstractC84700k<ProviderEffect> kVar, ViewGroup viewGroup, int i, boolean z, boolean z2, AbstractC89172b<? super AbstractC84650b.C84654c, C89391z> bVar) {
        super(context, mVar, hVar, kVar, viewGroup, i, true, true, true, bVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        this.f189614w = mVar;
        this.f189615x = hVar;
        this.f189616y = i;
        this.f189617z = true;
        this.f189608A = true;
        this.f189609B = z2;
    }
}
