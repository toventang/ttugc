package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
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

/* renamed from: com.ss.android.ugc.aweme.multi.maker.t */
public final class C60289t extends AbstractC60267o {
    static {
        Covode.recordClassIndex(70821);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60289t();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.YELP.getTYPE();
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.t$a */
    static final class C60290a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SmartImageView f137391a;

        static {
            Covode.recordClassIndex(70822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60290a(SmartImageView smartImageView) {
            super(0);
            this.f137391a = smartImageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f137391a.setImageResource(2131232159);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: a */
    public final void mo97889a(SmartImageView smartImageView) {
        C89219l.m154721d(smartImageView, "");
        mo97943a(smartImageView, new C60290a(smartImageView));
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        mo97945a(new C60291b(this, dVar));
        AbstractC60267o.m109921a(this, dVar, false, false, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.t$b */
    static final class C60291b extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60289t f137392a;

        /* renamed from: b */
        final /* synthetic */ C33744d f137393b;

        static {
            Covode.recordClassIndex(70823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60291b(C60289t tVar, C33744d dVar) {
            super(1);
            this.f137392a = tVar;
            this.f137393b = dVar;
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
                String authorUid = this.f137392a.mo97949o().getAuthorUid();
                if (authorUid == null) {
                    authorUid = "";
                }
                hashMap.put("author_id", authorUid);
                String aid = this.f137392a.mo97949o().getAid();
                C89219l.m154716b(aid, "");
                hashMap.put("group_id", aid);
                hashMap.put("enter_from", this.f137392a.mo97950p());
                hashMap.put("anchor_entry", keyword);
                hashMap.put("anchor_type", "Yelp");
                hashMap.put("anchor_id", anchorCommonStruct2.getId());
                Activity r = this.f137392a.mo97952r();
                if (schema == null) {
                    C89219l.m154715b();
                }
                Map<String, String> map = this.f137393b.f79943a;
                C89219l.m154716b(map, "");
                AddWikiActivity.C81638a.m141514a(r, schema, hashMap, map);
            }
            return C89391z.f203057a;
        }
    }
}
