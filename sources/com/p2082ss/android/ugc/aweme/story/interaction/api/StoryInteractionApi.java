package com.p2082ss.android.ugc.aweme.story.interaction.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p2082ss.android.ugc.aweme.story.model.C77383f;
import com.p2082ss.android.ugc.aweme.story.model.C77386i;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi */
public final class StoryInteractionApi implements IStoryInteractionApi {

    /* renamed from: a */
    public static final StoryInteractionApi f173406a = new StoryInteractionApi();

    /* renamed from: b */
    private final /* synthetic */ IStoryInteractionApi f173407b;

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.api.IStoryInteractionApi
    @AbstractC22000h(mo35789a = "/aweme/v2/comment/list/")
    public final AbstractC88979t<CommentItemList> fetchCommentListV2(@AbstractC22018z(mo35807a = "aweme_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "insert_ids") String str2, @AbstractC22018z(mo35807a = "channel_id") int i2, @AbstractC22018z(mo35807a = "source_type") int i3) {
        C89219l.m154721d(str, "");
        return this.f173407b.fetchCommentListV2(str, j, i, str2, i2, i3);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.api.IStoryInteractionApi
    @AbstractC22000h(mo35789a = "/tiktok/story/like/list/v1")
    public final AbstractC88979t<C77383f> fetchStoryLikedList(@AbstractC22018z(mo35807a = "story_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i) {
        C89219l.m154721d(str, "");
        return this.f173407b.fetchStoryLikedList(str, j, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.api.IStoryInteractionApi
    @AbstractC22000h(mo35789a = "/tiktok/story/view/list/v1")
    public final AbstractC88979t<C77386i> getStoryViewerList(@AbstractC22018z(mo35807a = "story_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "insert_id") String str2) {
        C89219l.m154721d(str, "");
        return this.f173407b.getStoryViewerList(str, j, i, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.api.IStoryInteractionApi
    @AbstractC22012t(mo35799a = "/tiktok/story/emoji_reaction/send/v1")
    @AbstractC21999g
    public final AbstractC88979t<BaseResponse> sendEmojiReaction(@AbstractC21997e(mo35786a = "story_id") String str, @AbstractC21997e(mo35786a = "emoji_id") int i) {
        C89219l.m154721d(str, "");
        return this.f173407b.sendEmojiReaction(str, i);
    }

    static {
        Covode.recordClassIndex(90313);
    }

    private StoryInteractionApi() {
        Object a = RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(IStoryInteractionApi.class);
        C89219l.m154716b(a, "");
        this.f173407b = (IStoryInteractionApi) a;
    }
}
