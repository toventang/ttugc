package com.p2082ss.android.ugc.aweme.internal;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.internal.a */
public final class C56808a implements IAVCommentService {

    /* renamed from: a */
    public static final C56808a f129376a = new C56808a();

    /* renamed from: b */
    private final /* synthetic */ IAVCommentService f129377b;

    @Override // com.p2082ss.android.ugc.aweme.internal.IAVCommentService
    /* renamed from: a */
    public final void mo93956a(Context context, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(onActivityResultCallback, "");
        this.f129377b.mo93956a(context, str, aweme, i, list, onActivityResultCallback);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IAVCommentService
    /* renamed from: a */
    public final void mo93957a(ActivityC0945e eVar, boolean z, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f129377b.mo93957a(eVar, z, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IAVCommentService
    /* renamed from: a */
    public final boolean mo93958a(boolean z) {
        return this.f129377b.mo93958a(z);
    }

    static {
        Covode.recordClassIndex(66688);
    }

    private C56808a() {
        IAVCommentService a = AVCommentServiceImpl.m102984a();
        C89219l.m154716b(a, "");
        this.f129377b = a;
    }
}
