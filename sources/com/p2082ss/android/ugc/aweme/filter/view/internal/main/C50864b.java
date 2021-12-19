package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50828d;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.b */
public final class C50864b implements AbstractC50828d {

    /* renamed from: a */
    private final AbstractC84398d f117349a;

    /* renamed from: b */
    private final AbstractC50707o f117350b;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.b$a */
    static final class C50865a implements IUpdateTagListener {

        /* renamed from: a */
        public static final C50865a f117351a = new C50865a();

        static {
            Covode.recordClassIndex(60040);
        }

        C50865a() {
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
        public final void onFinally() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.b$b */
    static final class C50866b implements IUpdateTagListener {

        /* renamed from: a */
        public static final C50866b f117352a = new C50866b();

        static {
            Covode.recordClassIndex(60041);
        }

        C50866b() {
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
        public final void onFinally() {
        }
    }

    static {
        Covode.recordClassIndex(60039);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50828d
    /* renamed from: a */
    public final void mo86212a(EffectCategoryResponse effectCategoryResponse) {
        C89219l.m154721d(effectCategoryResponse, "");
        this.f117349a.mo78897a(effectCategoryResponse.getId(), effectCategoryResponse.getTagsUpdateTime(), C50866b.f117352a);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50828d
    /* renamed from: a */
    public final void mo86211a(FilterBean filterBean) {
        Map<String, Effect> value;
        C89219l.m154721d(filterBean, "");
        AbstractC50709q f = this.f117350b.mo86071f();
        C89219l.m154721d(f, "");
        if (filterBean != null && (value = f.mo86077d().getValue()) != null) {
            Effect effect = value.get(filterBean.getName());
            if (effect != null || (effect = value.get(filterBean.getEnName())) != null) {
                this.f117349a.mo78897a(effect.getId(), effect.getTagsUpdatedAt(), C50865a.f117351a);
            }
        }
    }

    public C50864b(AbstractC84398d dVar, AbstractC50707o oVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(oVar, "");
        this.f117349a = dVar;
        this.f117350b = oVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50828d
    /* renamed from: a */
    public final void mo86213a(EffectCategoryResponse effectCategoryResponse, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        C89219l.m154721d(effectCategoryResponse, "");
        C89219l.m154721d(iIsTagNeedUpdatedListener, "");
        this.f117349a.mo78904a(effectCategoryResponse.getId(), effectCategoryResponse.getTags(), effectCategoryResponse.getTagsUpdateTime(), iIsTagNeedUpdatedListener);
    }
}
