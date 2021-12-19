package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SayHelloContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3096a.C53842a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.b */
public final class C53848b extends AbstractC53845a {

    /* renamed from: g */
    private RecyclerView f123480g;

    /* renamed from: h */
    private C53842a f123481h;

    static {
        Covode.recordClassIndex(63508);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.AbstractC53845a
    /* renamed from: b */
    public final List<C46534a> mo90994b() {
        return mo90989a().getEmojiList();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.AbstractC53845a
    /* renamed from: c */
    public final void mo90995c() {
        super.mo90995c();
        this.f123480g = (RecyclerView) mo90993b(R.id.do8);
        C53842a aVar = new C53842a();
        this.f123481h = aVar;
        aVar.f123465a = new C53849a(this);
        RecyclerView recyclerView = this.f123480g;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        C53842a aVar2 = this.f123481h;
        if (aVar2 == null) {
            C89219l.m154710a("adapter");
        }
        recyclerView.setAdapter(aVar2);
        RecyclerView recyclerView2 = this.f123480g;
        if (recyclerView2 == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53848b(C53856d dVar) {
        super(dVar);
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.AbstractC53845a
    /* renamed from: a */
    public final void mo90992a(boolean z) {
        int i;
        RecyclerView recyclerView = this.f123480g;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.b$a */
    static final class C53849a extends AbstractC89220m implements AbstractC89183m<View, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53848b f123482a;

        static {
            Covode.recordClassIndex(63509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53849a(C53848b bVar) {
            super(2);
            this.f123482a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View view, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(view, "");
            this.f123482a.mo90990a(intValue);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.AbstractC53845a
    /* renamed from: a */
    public final void mo90991a(C19538ai aiVar, C19538ai aiVar2, SayHelloContent sayHelloContent, int i, boolean z) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(sayHelloContent, "");
        super.mo90991a(aiVar, aiVar2, sayHelloContent, i, z);
        mo90992a(true);
        C53842a aVar = this.f123481h;
        if (aVar == null) {
            C89219l.m154710a("adapter");
        }
        aVar.mo92315f(mo90989a().getEmojiList());
    }
}
