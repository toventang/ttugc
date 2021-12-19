package com.p2082ss.android.ugc.aweme.social.widget.card;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.AbstractC17654e;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.i */
public final class C74787i implements ISocialCardService {

    /* renamed from: a */
    public static final C74787i f168102a = new C74787i();

    /* renamed from: b */
    private final /* synthetic */ ISocialCardService f168103b;

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.ISocialCardService
    /* renamed from: a */
    public final LinearLayout mo117802a(C74743a aVar, int i, C74765i iVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        return this.f168103b.mo117802a(aVar, i, iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.ISocialCardService
    /* renamed from: a */
    public final AbstractC17654e mo117803a(C74743a aVar, C74765i iVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        return this.f168103b.mo117803a(aVar, iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.ISocialCardService
    /* renamed from: a */
    public final AbstractC74782d mo117804a(C74743a aVar, int i) {
        C89219l.m154721d(aVar, "");
        return this.f168103b.mo117804a(aVar, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.ISocialCardService
    /* renamed from: a */
    public final AbstractC74785g mo117805a() {
        return this.f168103b.mo117805a();
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.ISocialCardService
    /* renamed from: b */
    public final RecyclerView.AbstractC1350a<?> mo117806b(C74743a aVar, C74765i iVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        return this.f168103b.mo117806b(aVar, iVar);
    }

    static {
        Covode.recordClassIndex(87632);
    }

    private C74787i() {
        ISocialCardService b = SocialCardServiceImp.m131250b();
        C89219l.m154716b(b, "");
        this.f168103b = b;
    }
}
