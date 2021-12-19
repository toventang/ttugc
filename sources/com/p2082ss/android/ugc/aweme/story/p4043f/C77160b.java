package com.p2082ss.android.ugc.aweme.story.p4043f;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.story.f.b */
public final class C77160b {
    @AbstractC27891c(mo46611a = "should_refresh_in_background")

    /* renamed from: a */
    public final int f173092a;
    @AbstractC27891c(mo46611a = "background_refresh_interval")

    /* renamed from: b */
    public final long f173093b;
    @AbstractC27891c(mo46611a = "refresh_interval_when_sidebar_opened")

    /* renamed from: c */
    public final long f173094c;
    @AbstractC27891c(mo46611a = "tiktok_story_get_user_stories_pagesize")

    /* renamed from: d */
    public final int f173095d;
    @AbstractC27891c(mo46611a = "story_user_state_cache_expiration_time")

    /* renamed from: e */
    public final long f173096e;
    @AbstractC27891c(mo46611a = "tiktok_story_official_foru_guide_max_count")

    /* renamed from: f */
    public final int f173097f;

    static {
        Covode.recordClassIndex(90168);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77160b)) {
            return false;
        }
        C77160b bVar = (C77160b) obj;
        return this.f173092a == bVar.f173092a && this.f173093b == bVar.f173093b && this.f173094c == bVar.f173094c && this.f173095d == bVar.f173095d && this.f173096e == bVar.f173096e && this.f173097f == bVar.f173097f;
    }

    public final String toString() {
        return "StoryConfig(enableBackgroundRefresh=" + this.f173092a + ", backgroundRefreshInterval=" + this.f173093b + ", sidebarCacheValidInterval=" + this.f173094c + ", getUserStoryPageSize=" + this.f173095d + ", userStoryCacheValidInterval=" + this.f173096e + ", guidePageShowMaxCount=" + this.f173097f + ")";
    }

    private C77160b() {
        this.f173092a = 1;
        this.f173093b = 1800;
        this.f173094c = 600;
        this.f173095d = 8;
        this.f173096e = 1800;
        this.f173097f = 1;
    }

    public final int hashCode() {
        long j = this.f173093b;
        long j2 = this.f173094c;
        long j3 = this.f173096e;
        return (((((((((this.f173092a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f173095d) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f173097f;
    }

    public /* synthetic */ C77160b(byte b) {
        this();
    }
}
