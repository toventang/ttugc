package com.p2082ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a */
public final class C34269a {

    /* renamed from: a */
    public static C34269a f81043a;

    /* renamed from: b */
    Map<String, Aweme> f81044b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41210);
    }

    /* renamed from: a */
    public static C34269a m70081a() {
        if (f81043a == null) {
            f81043a = new C34269a();
        }
        return f81043a;
    }

    /* renamed from: a */
    public final Aweme mo60697a(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f81044b.get(str);
    }

    /* renamed from: b */
    public final AwemeStatistics mo60698b(String str) {
        Aweme a;
        if (TextUtils.isEmpty(str) || (a = mo60697a(str)) == null) {
            return null;
        }
        AwemeStatistics statistics = a.getStatistics();
        if (statistics != null) {
            return statistics;
        }
        AwemeStatistics awemeStatistics = new AwemeStatistics();
        a.setStatistics(awemeStatistics);
        return awemeStatistics;
    }

    /* renamed from: a */
    public final Aweme mo60696a(Aweme aweme) {
        String str;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            if (aweme.getVideo() != null && aweme.isAd()) {
                if (C37699a.m76199B(aweme)) {
                    str = "topview";
                } else {
                    str = "is_ads";
                }
                aweme.getVideo().setVideoAdTag(str);
            }
            Aweme aweme2 = this.f81044b.get(aweme.getAid());
            if (aweme2 != null) {
                aweme2.update(aweme);
                return aweme2;
            }
            this.f81044b.put(aweme.getAid(), aweme);
        }
        return aweme;
    }
}
