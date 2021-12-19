package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

public interface ListService {
    static {
        Covode.recordClassIndex(103816);
    }

    @AbstractC89722f(mo144276a = "/1.1/lists/statuses.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    AbstractC89716b<List<Object>> statuses(@AbstractC89736t(mo144292a = "list_id") Long l, @AbstractC89736t(mo144292a = "slug") String str, @AbstractC89736t(mo144292a = "owner_screen_name") String str2, @AbstractC89736t(mo144292a = "owner_id") Long l2, @AbstractC89736t(mo144292a = "since_id") Long l3, @AbstractC89736t(mo144292a = "max_id") Long l4, @AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "include_entities") Boolean bool, @AbstractC89736t(mo144292a = "include_rts") Boolean bool2);
}
