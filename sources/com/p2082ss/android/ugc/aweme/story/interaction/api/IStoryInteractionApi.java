package com.p2082ss.android.ugc.aweme.story.interaction.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p2082ss.android.ugc.aweme.story.model.C77383f;
import com.p2082ss.android.ugc.aweme.story.model.C77386i;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.api.IStoryInteractionApi */
public interface IStoryInteractionApi {

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.api.IStoryInteractionApi$a */
    public static final class C77294a {
        static {
            Covode.recordClassIndex(90312);
        }
    }

    static {
        Covode.recordClassIndex(90311);
    }

    @AbstractC22000h(mo35789a = "/aweme/v2/comment/list/")
    AbstractC88979t<CommentItemList> fetchCommentListV2(@AbstractC22018z(mo35807a = "aweme_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "insert_ids") String str2, @AbstractC22018z(mo35807a = "channel_id") int i2, @AbstractC22018z(mo35807a = "source_type") int i3);

    @AbstractC22000h(mo35789a = "/tiktok/story/like/list/v1")
    AbstractC88979t<C77383f> fetchStoryLikedList(@AbstractC22018z(mo35807a = "story_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i);

    @AbstractC22000h(mo35789a = "/tiktok/story/view/list/v1")
    AbstractC88979t<C77386i> getStoryViewerList(@AbstractC22018z(mo35807a = "story_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "insert_id") String str2);

    @AbstractC22012t(mo35799a = "/tiktok/story/emoji_reaction/send/v1")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> sendEmojiReaction(@AbstractC21997e(mo35786a = "story_id") String str, @AbstractC21997e(mo35786a = "emoji_id") int i);
}
