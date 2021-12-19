package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.services.p4500a.C87811a;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

public interface SearchService {
    static {
        Covode.recordClassIndex(103818);
    }

    @AbstractC89722f(mo144276a = "/1.1/search/tweets.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    AbstractC89716b<Object> tweets(@AbstractC89736t(mo144292a = "q") String str, @AbstractC89736t(mo144292a = "geocode", mo144293b = true) C87811a aVar, @AbstractC89736t(mo144292a = "lang") String str2, @AbstractC89736t(mo144292a = "locale") String str3, @AbstractC89736t(mo144292a = "result_type") String str4, @AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "until") String str5, @AbstractC89736t(mo144292a = "since_id") Long l, @AbstractC89736t(mo144292a = "max_id") Long l2, @AbstractC89736t(mo144292a = "include_entities") Boolean bool);
}
