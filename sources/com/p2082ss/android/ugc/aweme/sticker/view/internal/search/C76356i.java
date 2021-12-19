package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75695d;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75700g;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.i */
public final class C76356i implements AbstractC75698f {

    /* renamed from: b */
    public static final C76357a f171523b = new C76357a((byte) 0);

    /* renamed from: c */
    private final int f171524c;

    /* renamed from: d */
    private final EffectCategoryModel f171525d = C75700g.m132814a(C76358b.f171529a);

    /* renamed from: e */
    private final List<AbstractC75730a> f171526e;

    /* renamed from: f */
    private final AbstractC75695d f171527f;

    /* renamed from: g */
    private final Context f171528g;

    static {
        Covode.recordClassIndex(89311);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: e */
    public final void mo119422e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.i$a */
    public static final class C76357a {
        static {
            Covode.recordClassIndex(89312);
        }

        private C76357a() {
        }

        public /* synthetic */ C76357a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: a */
    public final int mo119418a() {
        return this.f171524c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: b */
    public final EffectCategoryModel mo119419b() {
        return this.f171525d;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: c */
    public final List<AbstractC75730a> mo119420c() {
        return this.f171526e;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: d */
    public final AbstractC75695d mo119421d() {
        return this.f171527f;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.i$b */
    static final class C76358b extends AbstractC89220m implements AbstractC89172b<EffectCategoryModel, C89391z> {

        /* renamed from: a */
        public static final C76358b f171529a = new C76358b();

        static {
            Covode.recordClassIndex(89313);
        }

        C76358b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EffectCategoryModel effectCategoryModel) {
            EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
            C89219l.m154721d(effectCategoryModel2, "");
            effectCategoryModel2.setId("0");
            effectCategoryModel2.setKey("sticker_category:search");
            effectCategoryModel2.setName("Search");
            return C89391z.f203057a;
        }
    }

    public C76356i(Context context) {
        C89219l.m154721d(context, "");
        this.f171528g = context;
    }
}
