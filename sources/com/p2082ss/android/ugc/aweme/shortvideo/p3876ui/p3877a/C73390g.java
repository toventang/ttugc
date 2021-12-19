package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.bytedance.creativex.recorder.filter.p942a.C14216f;
import com.bytedance.creativex.recorder.filter.p942a.C14219i;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.g */
public final class C73390g extends AbstractC2562j<AbstractC73389f> implements AbstractC21566a, AbstractC73389f {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f164896a = {new C89232y(C73390g.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0)};

    /* renamed from: b */
    final ShortVideoContext f164897b = ((ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null));

    /* renamed from: c */
    private final AbstractC89248d f164898c = C21572a.m40504a(getDiContainer(), AbstractC14210a.class);

    /* renamed from: d */
    private final C21582f f164899d;

    static {
        Covode.recordClassIndex(86127);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC14210a mo116028a() {
        return (AbstractC14210a) this.f164898c.mo23374a(this, f164896a[0]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC73389f getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f164899d;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        mo116028a().getFilterUpdateEvent().mo6997a(this, new C73391a(this));
    }

    public C73390g(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f164899d = fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.g$a */
    static final class C73391a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73390g f164900a;

        static {
            Covode.recordClassIndex(86128);
        }

        C73391a(C73390g gVar) {
            this.f164900a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            float f;
            AbstractC50705m mVar;
            String name;
            C14219i iVar = (C14219i) obj;
            C73390g gVar = this.f164900a;
            String str2 = "";
            C89219l.m154716b(iVar, str2);
            if (C14216f.m25969a(iVar.f34505b) && iVar.f34506c) {
                EffectCategoryResponse b = C50691c.m94991b(iVar.f34505b.f34498b.mo86071f(), iVar.f34504a);
                if (!(b == null || (name = b.getName()) == null)) {
                    str2 = name;
                }
                ShortVideoContext shortVideoContext = gVar.f164897b;
                C84425b a = new C84425b().mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("shoot_way", shortVideoContext.f155831p).mo129403a("draft_id", shortVideoContext.f155740A);
                if (!C89219l.m154714a((Object) iVar.f34507d, (Object) "slide")) {
                    str = "click";
                } else {
                    str = iVar.f34507d;
                }
                C84425b a2 = a.mo129406a("enter_method", str).mo129403a("is_selected_from_entrance", !C89219l.m154714a(iVar.f34507d, "slide") ? 1 : 0).mo129406a("enter_from", "video_shoot_page").mo129406a("filter_name", iVar.f34504a.getEnName()).mo129403a("filter_id", iVar.f34504a.getId());
                C14215e value = gVar.mo116028a().getCurrentFilterSource().getValue();
                if (value == null || (mVar = value.f34499c) == null) {
                    f = -1.0f;
                } else {
                    f = C50691c.m94984a(mVar, iVar.f34504a);
                }
                C80322d.m139251a("select_filter", a2.mo129405a("filter_value", Float.valueOf(f)).mo129406a("tab_name", str2).mo129406a("content_source", shortVideoContext.mo110034j().getContentSource()).mo129406a("content_type", shortVideoContext.mo110034j().getContentType()).mo129406a("enter_from", "video_shoot_page").f188764a);
            }
        }
    }
}
