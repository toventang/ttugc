package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.r */
public final class C60283r extends AbstractC60267o {
    static {
        Covode.recordClassIndex(70815);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60283r();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.TRIP_ADVISOR.getTYPE();
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.r$a */
    static final class C60284a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SmartImageView f137385a;

        static {
            Covode.recordClassIndex(70816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60284a(SmartImageView smartImageView) {
            super(0);
            this.f137385a = smartImageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            SmartImageView smartImageView = this.f137385a;
            C22999a a = C23005c.m43393a(C602851.f137386a);
            Context context = this.f137385a.getContext();
            C89219l.m154716b(context, "");
            smartImageView.setImageDrawable(a.mo37368a(context));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: a */
    public final void mo97889a(SmartImageView smartImageView) {
        C89219l.m154721d(smartImageView, "");
        mo97943a(smartImageView, new C60284a(smartImageView));
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        mo97945a(new C60286b(this, dVar));
        AbstractC60267o.m109921a(this, dVar, false, false, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.r$b */
    static final class C60286b extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60283r f137387a;

        /* renamed from: b */
        final /* synthetic */ C33744d f137388b;

        static {
            Covode.recordClassIndex(70818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60286b(C60283r rVar, C33744d dVar) {
            super(1);
            this.f137387a = rVar;
            this.f137388b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            C89219l.m154721d(anchorCommonStruct2, "");
            String schema = anchorCommonStruct2.getSchema();
            String keyword = anchorCommonStruct2.getKeyword();
            if (!TextUtils.isEmpty(schema) && !TextUtils.isEmpty(keyword)) {
                HashMap hashMap = new HashMap();
                if (keyword == null) {
                    C89219l.m154715b();
                }
                hashMap.put("title", keyword);
                String authorUid = this.f137387a.mo97949o().getAuthorUid();
                if (authorUid == null) {
                    authorUid = "";
                }
                hashMap.put("author_id", authorUid);
                String aid = this.f137387a.mo97949o().getAid();
                C89219l.m154716b(aid, "");
                hashMap.put("group_id", aid);
                hashMap.put("enter_from", this.f137387a.mo97950p());
                hashMap.put("anchor_entry", keyword);
                hashMap.put("anchor_type", "TripAdvisor");
                hashMap.put("anchor_id", anchorCommonStruct2.getId());
                Activity r = this.f137387a.mo97952r();
                if (schema == null) {
                    C89219l.m154715b();
                }
                Map<String, String> map = this.f137388b.f79943a;
                C89219l.m154716b(map, "");
                AddWikiActivity.C81638a.m141514a(r, schema, hashMap, map);
            }
            return C89391z.f203057a;
        }
    }
}
