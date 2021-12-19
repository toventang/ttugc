package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

public interface FavoriteService {
    static {
        Covode.recordClassIndex(103815);
    }

    @AbstractC89731o(mo144285a = "/1.1/favorites/create.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @AbstractC89721e
    AbstractC89716b<Object> create(@AbstractC89719c(mo144273a = "id") Long l, @AbstractC89719c(mo144273a = "include_entities") Boolean bool);

    @AbstractC89731o(mo144285a = "/1.1/favorites/destroy.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @AbstractC89721e
    AbstractC89716b<Object> destroy(@AbstractC89719c(mo144273a = "id") Long l, @AbstractC89719c(mo144273a = "include_entities") Boolean bool);

    @AbstractC89722f(mo144276a = "/1.1/favorites/list.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    AbstractC89716b<List<Object>> list(@AbstractC89736t(mo144292a = "user_id") Long l, @AbstractC89736t(mo144292a = "screen_name") String str, @AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "since_id") String str2, @AbstractC89736t(mo144292a = "max_id") String str3, @AbstractC89736t(mo144292a = "include_entities") Boolean bool);
}
