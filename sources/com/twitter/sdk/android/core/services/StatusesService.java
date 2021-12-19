package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89735s;
import p4640l.p4644b.AbstractC89736t;

public interface StatusesService {
    static {
        Covode.recordClassIndex(103819);
    }

    @AbstractC89731o(mo144285a = "/1.1/statuses/destroy/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @AbstractC89721e
    AbstractC89716b<Object> destroy(@AbstractC89735s(mo144290a = "id") Long l, @AbstractC89719c(mo144273a = "trim_user") Boolean bool);

    @AbstractC89722f(mo144276a = "/1.1/statuses/home_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    AbstractC89716b<List<Object>> homeTimeline(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "since_id") Long l, @AbstractC89736t(mo144292a = "max_id") Long l2, @AbstractC89736t(mo144292a = "trim_user") Boolean bool, @AbstractC89736t(mo144292a = "exclude_replies") Boolean bool2, @AbstractC89736t(mo144292a = "contributor_details") Boolean bool3, @AbstractC89736t(mo144292a = "include_entities") Boolean bool4);

    @AbstractC89722f(mo144276a = "/1.1/statuses/lookup.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    AbstractC89716b<List<Object>> lookup(@AbstractC89736t(mo144292a = "id") String str, @AbstractC89736t(mo144292a = "include_entities") Boolean bool, @AbstractC89736t(mo144292a = "trim_user") Boolean bool2, @AbstractC89736t(mo144292a = "map") Boolean bool3);

    @AbstractC89722f(mo144276a = "/1.1/statuses/mentions_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    AbstractC89716b<List<Object>> mentionsTimeline(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "since_id") Long l, @AbstractC89736t(mo144292a = "max_id") Long l2, @AbstractC89736t(mo144292a = "trim_user") Boolean bool, @AbstractC89736t(mo144292a = "contributor_details") Boolean bool2, @AbstractC89736t(mo144292a = "include_entities") Boolean bool3);

    @AbstractC89731o(mo144285a = "/1.1/statuses/retweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @AbstractC89721e
    AbstractC89716b<Object> retweet(@AbstractC89735s(mo144290a = "id") Long l, @AbstractC89719c(mo144273a = "trim_user") Boolean bool);

    @AbstractC89722f(mo144276a = "/1.1/statuses/retweets_of_me.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    AbstractC89716b<List<Object>> retweetsOfMe(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "since_id") Long l, @AbstractC89736t(mo144292a = "max_id") Long l2, @AbstractC89736t(mo144292a = "trim_user") Boolean bool, @AbstractC89736t(mo144292a = "include_entities") Boolean bool2, @AbstractC89736t(mo144292a = "include_user_entities") Boolean bool3);

    @AbstractC89722f(mo144276a = "/1.1/statuses/show.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    AbstractC89716b<Object> show(@AbstractC89736t(mo144292a = "id") Long l, @AbstractC89736t(mo144292a = "trim_user") Boolean bool, @AbstractC89736t(mo144292a = "include_my_retweet") Boolean bool2, @AbstractC89736t(mo144292a = "include_entities") Boolean bool3);

    @AbstractC89731o(mo144285a = "/1.1/statuses/unretweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @AbstractC89721e
    AbstractC89716b<Object> unretweet(@AbstractC89735s(mo144290a = "id") Long l, @AbstractC89719c(mo144273a = "trim_user") Boolean bool);

    @AbstractC89731o(mo144285a = "/1.1/statuses/update.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @AbstractC89721e
    AbstractC89716b<Object> update(@AbstractC89719c(mo144273a = "status") String str, @AbstractC89719c(mo144273a = "in_reply_to_status_id") Long l, @AbstractC89719c(mo144273a = "possibly_sensitive") Boolean bool, @AbstractC89719c(mo144273a = "lat") Double d, @AbstractC89719c(mo144273a = "long") Double d2, @AbstractC89719c(mo144273a = "place_id") String str2, @AbstractC89719c(mo144273a = "display_coordinates") Boolean bool2, @AbstractC89719c(mo144273a = "trim_user") Boolean bool3, @AbstractC89719c(mo144273a = "media_ids") String str3);

    @AbstractC89722f(mo144276a = "/1.1/statuses/user_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    AbstractC89716b<List<Object>> userTimeline(@AbstractC89736t(mo144292a = "user_id") Long l, @AbstractC89736t(mo144292a = "screen_name") String str, @AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "since_id") Long l2, @AbstractC89736t(mo144292a = "max_id") Long l3, @AbstractC89736t(mo144292a = "trim_user") Boolean bool, @AbstractC89736t(mo144292a = "exclude_replies") Boolean bool2, @AbstractC89736t(mo144292a = "contributor_details") Boolean bool3, @AbstractC89736t(mo144292a = "include_rts") Boolean bool4);
}
