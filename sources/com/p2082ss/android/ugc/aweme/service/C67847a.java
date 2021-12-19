package com.p2082ss.android.ugc.aweme.service;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p2082ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.service.a */
public final class C67847a implements IFollowFeedService {

    /* renamed from: a */
    public static final C67847a f152048a = new C67847a();

    /* renamed from: b */
    private final /* synthetic */ IFollowFeedService f152049b;

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: a */
    public final AbstractC35329by mo86498a(Context context) {
        C89219l.m154721d(context, "");
        return this.f152049b.mo86498a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: a */
    public final String mo86499a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return this.f152049b.mo86499a(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: a */
    public final List<Aweme> mo86500a(List<? extends FollowFeed> list) {
        C89219l.m154721d(list, "");
        return this.f152049b.mo86500a(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: a */
    public final void mo86501a() {
        this.f152049b.mo86501a();
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: a */
    public final void mo86502a(ActivityC0945e eVar, float f) {
        C89219l.m154721d(eVar, "");
        this.f152049b.mo86502a(eVar, f);
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: b */
    public final float mo86503b(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return this.f152049b.mo86503b(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: b */
    public final Fragment mo86504b() {
        return this.f152049b.mo86504b();
    }

    static {
        Covode.recordClassIndex(79534);
    }

    private C67847a() {
        IFollowFeedService c = FollowFeedServiceImpl.m95503c();
        C89219l.m154716b(c, "");
        this.f152049b = c;
    }
}
