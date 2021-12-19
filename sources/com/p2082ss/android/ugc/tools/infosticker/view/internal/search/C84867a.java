package com.p2082ss.android.ugc.tools.infosticker.view.internal.search;

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
import com.p2082ss.android.ugc.aweme.views.C81429a;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84698i;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.C84689h;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84729c;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84633d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85019f;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85029d;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85030e;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.a */
public class C84867a extends AbstractC84650b<InfoStickerEffect> implements AbstractC84633d<InfoStickerEffect> {

    /* renamed from: A */
    final boolean f189670A;

    /* renamed from: B */
    final boolean f189671B;

    /* renamed from: C */
    final String f189672C;

    /* renamed from: D */
    private final int f189673D;

    /* renamed from: E */
    private final boolean f189674E;

    /* renamed from: a */
    private C84868a f189675a;

    /* renamed from: b */
    private final AbstractC1204m f189676b;

    /* renamed from: c */
    private final AbstractC84698i<InfoStickerEffect> f189677c;

    /* renamed from: v */
    String f189678v;

    /* renamed from: w */
    public int f189679w;

    /* renamed from: x */
    C84729c f189680x;

    /* renamed from: y */
    RecyclerView.ViewHolder f189681y;

    /* renamed from: z */
    TextView f189682z;

    static {
        Covode.recordClassIndex(98858);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84633d
    /* renamed from: a */
    public final String mo129541a() {
        return this.f189678v;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: c */
    public final AbstractC1204m mo114480c() {
        return this.f189676b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: d */
    public final int mo114481d() {
        return this.f189673D;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final /* synthetic */ void mo114476a(RecyclerView.ViewHolder viewHolder, int i, InfoStickerEffect infoStickerEffect, EnumC84444c cVar, Integer num) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(infoStickerEffect, "");
        C89219l.m154721d(cVar, "");
        if (!(viewHolder instanceof C84876d)) {
            viewHolder = null;
        }
        AbstractC84686f fVar = (AbstractC84686f) viewHolder;
        if (fVar != null) {
            int i2 = this.f189679w;
            C89219l.m154721d(infoStickerEffect, "");
            C89219l.m154721d(cVar, "");
            fVar.mo129601a(infoStickerEffect, i, cVar, num);
            CircleDraweeView imageView = fVar.f189208g.getImageView();
            if ((imageView instanceof C81429a) && imageView != null) {
                imageView.mo125081a(i2 == 0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final void mo129574a(EnumC85026a aVar) {
        C89219l.m154721d(aVar, "");
        int i = C84874b.f189691a[aVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                super.mo129574a(aVar);
                return;
            }
            m145783y();
            m145784z();
        } else if (NetworkUtils.isNetworkAvailable(this.f189154s)) {
            m145783y();
            m145784z();
        } else {
            super.mo129574a(aVar);
        }
    }

    /* renamed from: y */
    private void m145783y() {
        AbstractC84698i<InfoStickerEffect> iVar = this.f189677c;
        if (iVar != null) {
            iVar.mo129622i();
        }
    }

    /* renamed from: z */
    private void m145784z() {
        TextView textView = this.f189682z;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) C84912r.m145930a(this.f189154s, 64.0f)));
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: w */
    public final RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> mo129588w() {
        RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> w = super.mo129588w();
        if (!this.f189670A || this.f189671B) {
            return w;
        }
        C84868a aVar = new C84868a(this, w);
        this.f189675a = aVar;
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: t */
    public final void mo129585t() {
        super.mo129585t();
        if (this.f189670A && this.f189671B) {
            View findViewById = mo129580o().findViewById(R.id.ayh);
            C89219l.m154716b(findViewById, "");
            View findViewById2 = findViewById.findViewById(R.id.e8w);
            C89219l.m154716b(findViewById2, "");
            C84729c cVar = new C84729c(findViewById, (TextView) findViewById2);
            View view = cVar.itemView;
            C89219l.m154716b(view, "");
            view.setVisibility(0);
            mo129676a(cVar);
            this.f189680x = cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final void mo114479b() {
        LiveData<String> a;
        super.mo114479b();
        AbstractC84698i<InfoStickerEffect> iVar = this.f189677c;
        if (iVar != null && (a = iVar.mo129620a()) != null) {
            a.removeObservers(this.f189676b);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.a$d */
    public static final class C84871d extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C84867a f189688a;

        static {
            Covode.recordClassIndex(98862);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84871d(C84867a aVar) {
            this.f189688a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (this.f189688a.f189679w != i) {
                this.f189688a.f189679w = i;
                C84867a aVar = this.f189688a;
                aVar.mo129675a(aVar.f189679w);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            C84867a aVar = this.f189688a;
            aVar.mo129675a(aVar.f189679w);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.a$e */
    static final class C84872e extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        public static final C84872e f189689a = new C84872e();

        static {
            Covode.recordClassIndex(98863);
        }

        C84872e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146190a(viewGroup2, C848731.f189690a);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.a$b */
    static final class C84869b<T> implements AbstractC1214u<String> {

        /* renamed from: a */
        final /* synthetic */ C84867a f189684a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f189685b;

        static {
            Covode.recordClassIndex(98860);
        }

        C84869b(C84867a aVar, AbstractC1204m mVar) {
            this.f189684a = aVar;
            this.f189685b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(String str) {
            C84729c cVar;
            C84867a aVar = this.f189684a;
            aVar.f189678v = str;
            if ((!aVar.f189670A || aVar.f189671B) && aVar.f189670A && aVar.f189671B && (cVar = aVar.f189680x) != null) {
                aVar.mo129676a(cVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.a$c */
    static final class C84870c<T> implements AbstractC1214u<String> {

        /* renamed from: a */
        final /* synthetic */ C84867a f189686a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f189687b;

        static {
            Covode.recordClassIndex(98861);
        }

        C84870c(C84867a aVar, AbstractC1204m mVar) {
            this.f189686a = aVar;
            this.f189687b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(String str) {
            C84729c cVar;
            C84867a aVar = this.f189686a;
            if ((!aVar.f189670A || aVar.f189671B) && (cVar = aVar.f189680x) != null) {
                aVar.mo129676a(cVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final int mo129577b(int i) {
        C84868a aVar;
        int b = super.mo129577b(i);
        if (!this.f189670A || this.f189671B || (aVar = this.f189675a) == null) {
            return b;
        }
        return b + aVar.mo129945a();
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: c */
    public final int mo129579c(int i) {
        C84868a aVar;
        if (this.f189670A && !this.f189671B && (aVar = this.f189675a) != null) {
            i -= aVar.mo129945a();
        }
        return super.mo129579c(i);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.a$a */
    final class C84868a extends AbstractC85019f {

        /* renamed from: a */
        final /* synthetic */ C84867a f189683a;

        static {
            Covode.recordClassIndex(98859);
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85019f
        /* renamed from: a */
        public final void mo129674a(RecyclerView.ViewHolder viewHolder) {
            C89219l.m154721d(viewHolder, "");
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85019f
        /* renamed from: a */
        public final RecyclerView.ViewHolder mo129673a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            C84867a aVar = this.f189683a;
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3z, viewGroup, false);
            aVar.f189682z = (TextView) a.findViewById(R.id.ct_);
            TextView textView = aVar.f189682z;
            if (textView != null) {
                textView.setText(aVar.f189672C);
            }
            C89219l.m154716b(a, "");
            aVar.f189681y = new C84877e(a);
            RecyclerView.ViewHolder viewHolder = aVar.f189681y;
            if (viewHolder == null) {
                C89219l.m154715b();
            }
            return viewHolder;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84868a(C84867a aVar, RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar2) {
            super(aVar2, (byte) 0);
            C89219l.m154721d(aVar2, "");
            this.f189683a = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final View mo129572a(ViewGroup viewGroup) {
        if (!this.f189670A || !this.f189671B) {
            return super.mo129572a(viewGroup);
        }
        View a = C1764a.m5927a(LayoutInflater.from(this.f189154s), R.layout.b3n, viewGroup, this.f189674E);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final AbstractC85027b<EnumC85026a> mo114478b(View view) {
        C89219l.m154721d(view, "");
        AbstractC85027b<EnumC85026a> b = super.mo114478b(view);
        if (b instanceof C85029d) {
            ((C85029d) b).mo129961a(EnumC85026a.EMPTY, C84872e.f189689a);
        }
        return b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final RecyclerView mo114472a(View view) {
        C89219l.m154721d(view, "");
        RecyclerView a = super.mo114472a(view);
        if (this.f189673D >= 4) {
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

    /* renamed from: a */
    public final void mo129675a(int i) {
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
                if (!(f instanceof C84876d)) {
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
        AbstractC84698i<InfoStickerEffect> iVar = this.f189677c;
        if (iVar != null) {
            iVar.mo129620a().observe(mVar, new C84869b(this, mVar));
            iVar.mo129621h().observe(mVar, new C84870c(this, mVar));
        }
        mo129581p().mo4405a(new C84871d(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo129676a(RecyclerView.ViewHolder viewHolder) {
        TextView textView;
        LiveData<String> h;
        String str = null;
        if (!(viewHolder instanceof C84729c)) {
            viewHolder = null;
        }
        C84729c cVar = (C84729c) viewHolder;
        if (cVar != null && (textView = cVar.f189322a) != null) {
            AbstractC84698i<InfoStickerEffect> iVar = this.f189677c;
            if (!(iVar == null || (h = iVar.mo129621h()) == null)) {
                str = h.getValue();
            }
            textView.setText(str);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo114471a(ViewGroup viewGroup, AbstractC89187q<? super InfoStickerEffect, ? super Integer, ? super EnumC84444c, C89391z> qVar) {
        C89378p<FrameLayout, C85037b> a;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(qVar, "");
        if (this.f189673D >= 4) {
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            a = C84689h.m145533b(context);
        } else {
            Context context2 = viewGroup.getContext();
            C89219l.m154716b(context2, "");
            a = C84689h.m145531a(context2);
        }
        return new C84876d(a.component1(), a.component2(), qVar);
    }

    public /* synthetic */ C84867a(Context context, AbstractC1204m mVar, AbstractC84698i iVar, AbstractC84700k kVar, ViewGroup viewGroup, int i, String str, AbstractC89172b bVar) {
        this(context, mVar, iVar, kVar, viewGroup, i, true, false, str, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C84867a(Context context, AbstractC1204m mVar, AbstractC84698i<InfoStickerEffect> iVar, AbstractC84700k<InfoStickerEffect> kVar, ViewGroup viewGroup, int i, boolean z, boolean z2, String str, AbstractC89172b<? super AbstractC84650b.C84654c, C89391z> bVar) {
        super(context, mVar, iVar, kVar, viewGroup, i, true, true, true, bVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        this.f189676b = mVar;
        this.f189677c = iVar;
        this.f189673D = i;
        this.f189674E = true;
        this.f189670A = true;
        this.f189671B = false;
        this.f189672C = str;
    }
}
