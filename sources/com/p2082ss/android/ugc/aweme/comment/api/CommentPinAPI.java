package com.p2082ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36395j;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.comment.api.CommentPinAPI */
public interface CommentPinAPI {
    static {
        Covode.recordClassIndex(43531);
    }

    @AbstractC89731o(mo144285a = "/tiktok/comment/pin/v1")
    @AbstractC89721e
    AbstractC88403ab<C36395j> pinComment(@AbstractC89719c(mo144273a = "item_id") String str, @AbstractC89719c(mo144273a = "comment_id") String str2, @AbstractC89719c(mo144273a = "pinned_at") long j, @AbstractC89719c(mo144273a = "op") int i, @AbstractC89719c(mo144273a = "pin_anyway") boolean z);
}
