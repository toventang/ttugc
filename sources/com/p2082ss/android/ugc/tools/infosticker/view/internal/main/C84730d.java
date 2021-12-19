package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84691c;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.C84649a;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.C84689h;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.d */
public final class C84730d extends AbstractC84650b<Effect> implements AbstractC84691c {

    /* renamed from: a */
    private boolean f189323a;

    /* renamed from: b */
    private final AbstractC1204m f189324b;

    /* renamed from: c */
    private final int f189325c;

    /* renamed from: v */
    private final boolean f189326v;

    static {
        Covode.recordClassIndex(98706);
    }

    /* renamed from: a */
    public final void mo129642a() {
        mo129585t();
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: c */
    public final AbstractC1204m mo114480c() {
        return this.f189324b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: d */
    public final int mo114481d() {
        return this.f189325c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final void mo114479b() {
        super.mo114479b();
        this.f189323a = false;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84691c
    /* renamed from: e */
    public final void mo129602e() {
        if (this.f189326v && !this.f189323a) {
            this.f189323a = true;
            mo114475a(this.f189324b);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: t */
    public final void mo129585t() {
        super.mo129585t();
        if (this.f189326v) {
            mo129582q().setState(EnumC85026a.LOADING);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: x */
    public final RecyclerView.AbstractC1361h mo129589x() {
        int b = C70636dh.m124831b(this.f189154s);
        return new C84649a((((float) (b / this.f189325c)) - C84912r.m145930a(this.f189154s, 57.0f)) / 2.0f);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo114471a(ViewGroup viewGroup, AbstractC89187q<? super Effect, ? super Integer, ? super EnumC84444c, C89391z> qVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(qVar, "");
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        C89219l.m154721d(context, "");
        Float valueOf = Float.valueOf(8.0f);
        C89378p<FrameLayout, C85037b> a = C84689h.m145532a(context, 40.0f, 40.0f, (int) C84912r.m145930a(context, 57.0f), (int) C84912r.m145930a(context, 75.0f), null, valueOf, null, valueOf);
        return new C84811n(a.component1(), a.component2(), qVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final /* synthetic */ void mo114476a(RecyclerView.ViewHolder viewHolder, int i, Effect effect, EnumC84444c cVar, Integer num) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(effect, "");
        C89219l.m154721d(cVar, "");
        if (!(viewHolder instanceof C84811n)) {
            viewHolder = null;
        }
        AbstractC84686f fVar = (AbstractC84686f) viewHolder;
        if (fVar != null) {
            fVar.mo129601a(effect, i, cVar, num);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C84730d(Context context, AbstractC1204m mVar, AbstractC84693e<Effect> eVar, AbstractC84700k<Effect> kVar, boolean z, AbstractC89172b<? super AbstractC84650b.C84654c, C89391z> bVar) {
        super(context, mVar, eVar, kVar, null, 5, false, true, true, bVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        this.f189324b = mVar;
        this.f189325c = 5;
        this.f189326v = z;
    }

    public /* synthetic */ C84730d(Context context, AbstractC1204m mVar, AbstractC84693e eVar, AbstractC84700k kVar, boolean z, AbstractC89172b bVar, byte b) {
        this(context, mVar, eVar, kVar, z, bVar);
    }
}
