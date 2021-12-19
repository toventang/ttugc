package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.p3995a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.p3995a.p3996a.AbstractC75861c;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75695d;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75700g;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a */
public final class C75855a implements AbstractC75863c {

    /* renamed from: b */
    public final Context f170390b;

    /* renamed from: c */
    public final boolean f170391c;

    /* renamed from: d */
    private final int f170392d;

    /* renamed from: e */
    private final EffectCategoryModel f170393e;

    /* renamed from: f */
    private final List<AbstractC75730a> f170394f;

    /* renamed from: g */
    private final AbstractC75695d f170395g;

    /* renamed from: h */
    private final AbstractC75861c f170396h;

    static {
        Covode.recordClassIndex(88789);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: a */
    public final int mo119418a() {
        return this.f170392d;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: b */
    public final EffectCategoryModel mo119419b() {
        return this.f170393e;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: c */
    public final List<AbstractC75730a> mo119420c() {
        return this.f170394f;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: d */
    public final AbstractC75695d mo119421d() {
        return this.f170395g;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: e */
    public final void mo119422e() {
        this.f170396h.mo119532a();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a$a */
    static final class C75856a extends AbstractC89220m implements AbstractC89172b<EffectCategoryModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75855a f170397a;

        static {
            Covode.recordClassIndex(88790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75856a(C75855a aVar) {
            super(1);
            this.f170397a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EffectCategoryModel effectCategoryModel) {
            EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
            C89219l.m154721d(effectCategoryModel2, "");
            effectCategoryModel2.setId("1");
            effectCategoryModel2.setKey("sticker_category:favorite");
            String string = this.f170397a.f170390b.getString(R.string.g46);
            C89219l.m154716b(string, "");
            effectCategoryModel2.setName(string);
            if (this.f170397a.f170391c) {
                C758571 r3 = C758571.f170398a;
                C89219l.m154721d(effectCategoryModel2, "");
                C89219l.m154721d(r3, "");
                UrlModel urlModel = new UrlModel(null, 1, null);
                r3.invoke(urlModel);
                effectCategoryModel2.setIcon(urlModel);
            }
            return C89391z.f203057a;
        }
    }

    public C75855a(AbstractC75861c cVar, Context context) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(context, "");
        this.f170396h = cVar;
        this.f170390b = context;
        this.f170391c = true;
        this.f170393e = C75700g.m132814a(new C75856a(this));
        this.f170395g = cVar;
    }

    public /* synthetic */ C75855a(AbstractC75861c cVar, Context context, byte b) {
        this(cVar, context);
    }
}
