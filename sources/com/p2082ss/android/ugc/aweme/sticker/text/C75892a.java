package com.p2082ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.C45867a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.text.a */
public final class C75892a implements AbstractC45869b {

    /* renamed from: a */
    public final AVETParameter f170465a;

    /* renamed from: b */
    private final AbstractC89244h f170466b;

    static {
        Covode.recordClassIndex(88832);
    }

    /* renamed from: a */
    private final C84425b m133069a() {
        return (C84425b) this.f170466b.getValue();
    }

    public /* synthetic */ C75892a() {
        this(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.text.a$a */
    static final class C75893a extends AbstractC89220m implements AbstractC89171a<C84425b> {

        /* renamed from: a */
        final /* synthetic */ C75892a f170467a;

        static {
            Covode.recordClassIndex(88833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75893a(C75892a aVar) {
            super(0);
            this.f170467a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C84425b invoke() {
            String str;
            String str2;
            String str3;
            C84425b bVar = new C84425b();
            AVETParameter aVETParameter = this.f170467a.f170465a;
            String str4 = null;
            if (aVETParameter != null) {
                str = aVETParameter.getCreationId();
            } else {
                str = null;
            }
            C84425b a = bVar.mo129406a("creation_id", str);
            AVETParameter aVETParameter2 = this.f170467a.f170465a;
            if (aVETParameter2 != null) {
                str2 = aVETParameter2.getShootWay();
            } else {
                str2 = null;
            }
            C84425b a2 = a.mo129406a("shoot_way", str2);
            AVETParameter aVETParameter3 = this.f170467a.f170465a;
            if (aVETParameter3 != null) {
                str3 = aVETParameter3.getContentSource();
            } else {
                str3 = null;
            }
            C84425b a3 = a2.mo129406a("content_source", str3);
            AVETParameter aVETParameter4 = this.f170467a.f170465a;
            if (aVETParameter4 != null) {
                str4 = aVETParameter4.getContentType();
            }
            return a3.mo129406a("content_type", str4).mo129406a("enter_from", "photo_post_page");
        }
    }

    public C75892a(AVETParameter aVETParameter) {
        this.f170465a = aVETParameter;
        this.f170466b = C89250i.m154773a((AbstractC89171a) new C75893a(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b
    /* renamed from: a */
    public final void mo77219a(C45867a aVar) {
        C89219l.m154721d(aVar, "");
        C80322d.m139251a("select_cover_text_type", m133069a().mo129406a("text_id", aVar.f106853a).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b
    /* renamed from: b */
    public final void mo77221b(int i) {
        C80322d.m139251a("select_text_style", m133069a().mo129403a("text_style", i).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b
    /* renamed from: e */
    public final void mo77226e(C45867a aVar) {
        C89219l.m154721d(aVar, "");
        C80322d.m139251a("cancel_cover_edit", m133069a().mo129403a("is_toasted", aVar.f106860h).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b
    /* renamed from: a */
    public final void mo77218a(int i) {
        C80322d.m139251a("select_text_color", m133069a().mo129406a(C19386b.f45894a, Integer.toHexString(i)).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b
    /* renamed from: b */
    public final void mo77222b(C45867a aVar) {
        C89219l.m154721d(aVar, "");
        C80322d.m139251a("edit_cover_text", m133069a().mo129406a("text_id", aVar.f106853a).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b
    /* renamed from: c */
    public final void mo77224c(C45867a aVar) {
        C89219l.m154721d(aVar, "");
        C80322d.m139251a("complete_cover_text", m133069a().mo129406a("text_id", aVar.f106853a).mo129406a("font_id", aVar.f106854b).mo129406a("font_name", aVar.f106855c).mo129406a("text_color", aVar.f106856d).mo129406a("text_style", aVar.f106857e).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b
    /* renamed from: a */
    public final void mo77220a(String str) {
        C89219l.m154721d(str, "");
        C80322d.m139251a("select_text_paragraph", m133069a().mo129406a("paragraph_style", str).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b
    /* renamed from: b */
    public final void mo77223b(String str) {
        C89219l.m154721d(str, "");
        C80322d.m139251a("select_text_font", m133069a().mo129406a("font", str).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b
    /* renamed from: d */
    public final void mo77225d(C45867a aVar) {
        C89219l.m154721d(aVar, "");
        if (!C63244g.m114602a().mo73255A().mo93901a()) {
            C80322d.m139251a("save_cover_edit", m133069a().mo129406a("text_id", aVar.f106853a).mo129406a("font_id", aVar.f106854b).mo129406a("font_name", aVar.f106855c).mo129406a("text_color", aVar.f106856d).mo129406a("text_style", aVar.f106857e).mo129403a("is_text", aVar.f106858f).mo129403a("is_pic_adjust", aVar.f106859g).f188764a);
        }
    }
}
