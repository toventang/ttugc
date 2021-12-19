package com.p2082ss.android.ugc.aweme.comment.page.tag;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SearchResultListCell */
public final class SearchResultListCell extends BaseFriendsListCell<C36893j> {

    /* renamed from: j */
    private final AbstractC89244h f86614j = C89250i.m154773a((AbstractC89171a) C36624a.f86615a);

    static {
        Covode.recordClassIndex(43957);
    }

    /* renamed from: c */
    private final IIMService m74449c() {
        return (IIMService) this.f86614j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SearchResultListCell$a */
    static final class C36624a extends AbstractC89220m implements AbstractC89171a<IIMService> {

        /* renamed from: a */
        public static final C36624a f86615a = new C36624a();

        static {
            Covode.recordClassIndex(43958);
        }

        C36624a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IIMService invoke() {
            return IMService.createIIMServicebyMonsterPlugin(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo64271a(C36893j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo23350a((C36890g) jVar);
        IIMService c = m74449c();
        if (c != null) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.cpq);
            C89219l.m154716b(tuxTextView, "");
            c.setHighlightText(tuxTextView, mo64270a().mo64382a(jVar.f86884a), jVar.f86891c);
        }
        IIMService c2 = m74449c();
        if (c2 != null) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.akb);
            C89219l.m154716b(tuxTextView2, "");
            c2.setHighlightText(tuxTextView2, mo64270a().mo64385b(jVar.f86884a), jVar.f86891c);
        }
    }
}
