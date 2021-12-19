package com.p2082ss.android.ugc.aweme.upvote.service;

import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.upvote.event.C79898a;
import com.p2082ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.p2082ss.android.ugc.aweme.upvote.p4187a.AbstractC79704a;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.upvote.publish.AbstractC79925a;
import com.p2082ss.android.ugc.aweme.upvote.publish.C80022g;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.upvote.service.IUpvoteService */
public interface IUpvoteService {
    static {
        Covode.recordClassIndex(93250);
    }

    /* renamed from: a */
    int mo123474a();

    /* renamed from: a */
    AssemViewModel<C80022g> mo123475a(ActivityC0945e eVar);

    /* renamed from: a */
    AbstractC79704a mo123476a(FrameLayout frameLayout, AbstractC1204m mVar);

    /* renamed from: a */
    List<C79714h> mo123477a(String str);

    /* renamed from: a */
    void mo123478a(AbstractC12846h hVar, AbstractC79925a aVar);

    /* renamed from: a */
    void mo123479a(String str, int i);

    /* renamed from: a */
    void mo123480a(String str, UpvotePublishMobParam upvotePublishMobParam);

    /* renamed from: a */
    void mo123481a(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, AbstractC89171a<C89391z> aVar);

    /* renamed from: a */
    void mo123482a(List<? extends Aweme> list);

    /* renamed from: b */
    Integer mo123483b(String str);

    /* renamed from: b */
    void mo123484b();

    /* renamed from: c */
    C79898a mo123485c(String str);

    /* renamed from: c */
    void mo123486c();
}
