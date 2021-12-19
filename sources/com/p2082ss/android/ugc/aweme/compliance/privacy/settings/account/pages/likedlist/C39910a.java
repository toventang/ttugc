package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist.a */
public final class C39910a extends AbstractC39856a<LikedListViewModel> {
    static {
        Covode.recordClassIndex(47656);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: c */
    public final String mo69150c() {
        return "favorite";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        C33842s sVar = C33842s.C33843a.f80132a;
        C89219l.m154716b(sVar, "");
        C33594aj<Boolean> d = sVar.mo60060d();
        C89219l.m154716b(d, "");
        d.mo59940b(true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39910a(com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist.LikedListViewModel r4, androidx.fragment.app.Fragment r5) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist.C39910a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist.LikedListViewModel, androidx.fragment.app.Fragment):void");
    }
}
