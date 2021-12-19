package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

public interface CollectionService {
    static {
        Covode.recordClassIndex(103813);
    }

    @AbstractC89722f(mo144276a = "/1.1/collections/entries.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    AbstractC89716b<Object> collection(@AbstractC89736t(mo144292a = "id") String str, @AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "max_position") Long l, @AbstractC89736t(mo144292a = "min_position") Long l2);
}
