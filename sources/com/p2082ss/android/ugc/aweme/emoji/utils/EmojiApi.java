package com.p2082ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResourcesResponse;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a.C46561d;
import kotlinx.coroutines.AbstractC89531av;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.EmojiApi */
public interface EmojiApi {
    static {
        Covode.recordClassIndex(55230);
    }

    @AbstractC89731o(mo144285a = "im/resources/sticker/collect/")
    AbstractC89531av<Object> collectEmoji(@AbstractC89736t(mo144292a = "action") int i, @AbstractC89736t(mo144292a = "sticker_ids") String str);

    @AbstractC89722f(mo144276a = "im/resources/")
    AbstractC89531av<ResourcesResponse> getResources(@AbstractC89736t(mo144292a = "resource_type") String str);

    @AbstractC89722f(mo144276a = "im/resources/sticker/list/")
    AbstractC89531av<EmojiResourcesResponse> getSelfEmojis();

    @AbstractC89722f(mo144276a = "im/resources/emoji/")
    AbstractC88979t<C46561d> getSmallEmojiResources();

    @AbstractC89722f(mo144276a = "im/resources/emoticon/trending/")
    AbstractC89531av<Object> getTrendingEmojis(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "source") String str, @AbstractC89736t(mo144292a = "group_id") String str2);

    @AbstractC89731o(mo144285a = "im/resources/sticker/collect/")
    AbstractC88979t<Object> rxCollectEmoji(@AbstractC89736t(mo144292a = "action") int i, @AbstractC89736t(mo144292a = "sticker_ids") String str);

    @AbstractC89731o(mo144285a = "im/resources/sticker/collect/")
    AbstractC88979t<Object> rxCollectEmoji(@AbstractC89736t(mo144292a = "action") int i, @AbstractC89736t(mo144292a = "sticker_ids") String str, @AbstractC89736t(mo144292a = "sticker_uri") String str2, @AbstractC89736t(mo144292a = "sticker_url") String str3, @AbstractC89736t(mo144292a = "resource_id") long j, @AbstractC89736t(mo144292a = "sticker_type") int i2);
}
