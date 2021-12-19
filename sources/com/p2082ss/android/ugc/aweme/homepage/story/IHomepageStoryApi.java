package com.p2082ss.android.ugc.aweme.homepage.story;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.homepage.story.p3053b.C53029a;
import com.p2082ss.android.ugc.aweme.story.p4043f.C77161c;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.IHomepageStoryApi */
public interface IHomepageStoryApi {

    /* renamed from: b */
    public static final C52994a f121860b = C52994a.f121862b;

    static {
        Covode.recordClassIndex(62533);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/story/get_feed")
    AbstractC88979t<C53029a> getFeed(@AbstractC22018z(mo35807a = "refresh") boolean z);

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.IHomepageStoryApi$a */
    public static final class C52994a {

        /* renamed from: a */
        public static final int f121861a = C77161c.m134769a().f173095d;

        /* renamed from: b */
        static final /* synthetic */ C52994a f121862b = new C52994a();

        private C52994a() {
        }

        static {
            Covode.recordClassIndex(62534);
        }
    }
}
