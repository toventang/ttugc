package com.p2082ss.android.ugc.aweme.feed.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.h */
public final class C49324h {

    /* renamed from: a */
    public static final C49324h f113362a = new C49324h();

    /* renamed from: b */
    private static final AbstractC89244h f113363b = C89250i.m154773a((AbstractC89171a) C49325a.f113364a);

    /* renamed from: a */
    public static Keva m92399a() {
        return (Keva) f113363b.getValue();
    }

    private C49324h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.h$a */
    static final class C49325a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C49325a f113364a = new C49325a();

        static {
            Covode.recordClassIndex(58126);
        }

        C49325a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoFromSp(C17867d.m33078a(), "feed_video_cache", 1);
        }
    }

    /* renamed from: b */
    public static long m92402b() {
        return m92399a().getLong("feed_video_cache_time", 0);
    }

    /* renamed from: c */
    public static long m92405c() {
        return m92399a().getLong("feed_video_cache_time2", 0);
    }

    /* renamed from: d */
    public static String m92407d() {
        return m92399a().getString("feed_video_group_key", "");
    }

    /* renamed from: e */
    public static String m92409e() {
        return m92399a().getString("feed_video_group_key2", "");
    }

    /* renamed from: g */
    public static String m92413g() {
        String string = m92399a().getString("key_cookie_feed_url", "");
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: h */
    public static String m92415h() {
        String string = m92399a().getString("key_cookie_feed", "");
        C89219l.m154716b(string, "");
        return string;
    }

    static {
        Covode.recordClassIndex(58125);
    }

    /* renamed from: f */
    public static String m92411f() {
        String string = m92399a().getString("feed_cache_source", "def");
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: f */
    public static void m92412f(String str) {
        C89219l.m154721d(str, "");
        m92399a().storeString("feed_cache_source", str);
    }

    /* renamed from: a */
    public static void m92400a(long j) {
        m92399a().storeLong("feed_video_cache_time", j);
    }

    /* renamed from: b */
    public static void m92403b(long j) {
        m92399a().storeLong("feed_video_cache_time2", j);
    }

    /* renamed from: c */
    public static void m92406c(String str) {
        m92399a().storeString("feed_cache_request_id", str);
    }

    /* renamed from: d */
    public static void m92408d(String str) {
        m92399a().storeString("feed_cache_request_id2", str);
    }

    /* renamed from: e */
    public static void m92410e(String str) {
        m92399a().storeString("feed_video_cache_current_uid", str);
    }

    /* renamed from: g */
    public static void m92414g(String str) {
        C89219l.m154721d(str, "");
        m92399a().storeString("key_cookie_feed_url", str);
    }

    /* renamed from: h */
    public static void m92416h(String str) {
        C89219l.m154721d(str, "");
        m92399a().storeString("key_cookie_feed", str);
    }

    /* renamed from: a */
    public static void m92401a(String str) {
        m92399a().storeString("feed_video_group_key", str);
    }

    /* renamed from: b */
    public static void m92404b(String str) {
        m92399a().storeString("feed_video_group_key2", str);
    }
}
