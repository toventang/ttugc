package com.p2082ss.android.ugc.aweme.social.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.ext.RelationExtService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.service.b */
public final class C74742b implements IRelationExtService {

    /* renamed from: a */
    public static final C74742b f168000a = new C74742b();

    /* renamed from: b */
    private final /* synthetic */ IRelationExtService f168001b;

    @Override // com.p2082ss.android.ugc.aweme.social.service.IRelationExtService
    /* renamed from: a */
    public final void mo117776a(TuxTextView tuxTextView, User user, Aweme aweme, Integer num) {
        C89219l.m154721d(tuxTextView, "");
        this.f168001b.mo117776a(tuxTextView, user, aweme, num);
    }

    static {
        Covode.recordClassIndex(87585);
    }

    private C74742b() {
        IRelationExtService a = RelationExtService.m131187a();
        C89219l.m154716b(a, "");
        this.f168001b = a;
    }
}
