package com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a.b */
public final class C78047b extends C78046a {

    /* renamed from: b */
    public static final C78048a f175102b = new C78048a((byte) 0);

    /* renamed from: c */
    private final AVETParameter f175103c;

    static {
        Covode.recordClassIndex(91138);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a.b$a */
    public static final class C78048a {
        static {
            Covode.recordClassIndex(91139);
        }

        private C78048a() {
        }

        public /* synthetic */ C78048a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a.C78046a, com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b
    /* renamed from: a */
    public final void mo121775a() {
        C80322d.m139251a("reset_beautify_all", m136390a(this.f175103c).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a.C78046a
    /* renamed from: b */
    public final void mo121780b() {
        C80322d.m139251a("click_beautify_entrance", m136390a(this.f175103c).f188764a);
    }

    public C78047b(AVETParameter aVETParameter) {
        C89219l.m154721d(aVETParameter, "");
        this.f175103c = aVETParameter;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a.C78046a, com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b
    /* renamed from: a */
    public final void mo121776a(ComposerBeauty composerBeauty) {
        if (composerBeauty != null) {
            C80322d.m139251a("click_beautify_tab", m136389a(composerBeauty, this.f175103c).f188764a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a.C78046a, com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b
    /* renamed from: c */
    public final void mo121783c(ComposerBeauty composerBeauty) {
        if (composerBeauty != null) {
            C80322d.m139251a("reset_beautify", m136389a(composerBeauty, this.f175103c).mo129406a("beautify_value", String.valueOf(composerBeauty.getProgressValue())).f188764a);
        }
    }

    /* renamed from: a */
    private static C84425b m136390a(AVETParameter aVETParameter) {
        C84425b a = new C84425b().mo129406a("creation_id", aVETParameter.getCreationId()).mo129406a("shoot_way", aVETParameter.getShootWay()).mo129406a("content_source", aVETParameter.getContentSource()).mo129406a("content_type", aVETParameter.getContentType()).mo129406a("enter_from", "video_shoot_page");
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a.C78046a, com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b
    /* renamed from: b */
    public final void mo121781b(ComposerBeauty composerBeauty) {
        int defaultProgress;
        if (composerBeauty != null) {
            if (composerBeauty.getProgressValue() != 0) {
                defaultProgress = composerBeauty.getProgressValue();
            } else {
                defaultProgress = composerBeauty.getDefaultProgress();
            }
            C80322d.m139251a("select_beautify", m136389a(composerBeauty, this.f175103c).mo129406a("beautify_value", String.valueOf(defaultProgress)).f188764a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a.C78046a, com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b
    /* renamed from: a */
    public final void mo121777a(BeautyCategory beautyCategory) {
        if (beautyCategory != null) {
            C80322d.m139251a("click_beautify_category", m136390a(this.f175103c).mo129406a("beautify_category_id", beautyCategory.getCategoryResponse().getId()).mo129406a("beautify_category_name", beautyCategory.getCategoryResponse().getName()).f188764a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a.C78046a, com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b
    /* renamed from: a */
    public final void mo121778a(String str) {
        C89219l.m154721d(str, "");
        C80322d.m139251a("reset_beautify_popup", m136390a(this.f175103c).mo129406a("event_type", str).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a.C78046a, com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b
    /* renamed from: a */
    public final void mo121779a(boolean z) {
        String str;
        C84425b a = m136390a(this.f175103c);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C80322d.m139251a("click_beauty_switch", a.mo129406a("final_status", str).f188764a);
    }

    /* renamed from: a */
    private static C84425b m136389a(ComposerBeauty composerBeauty, AVETParameter aVETParameter) {
        C84425b a = m136390a(aVETParameter);
        if (C77878d.m135999b(composerBeauty)) {
            a.mo129406a("beautify_name_parent", composerBeauty.getParentName()).mo129406a("beautify_id_parent", composerBeauty.getParentId()).mo129406a("beautify_name_child", composerBeauty.getEffect().getName()).mo129406a("beautify_id_child", composerBeauty.getEffect().getEffectId());
        } else {
            a.mo129406a("beautify_name_parent", composerBeauty.getEffect().getName()).mo129406a("beautify_id_parent", composerBeauty.getEffect().getEffectId());
        }
        return a;
    }
}
