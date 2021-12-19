package com.p2082ss.android.ugc.aweme.lancet;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.lancet.a */
public final class C58002a {

    /* renamed from: a */
    public static final Set<String> f132196a;

    /* renamed from: b */
    public static final Set<String> f132197b;

    /* renamed from: c */
    public static volatile boolean f132198c = false;

    static {
        Covode.recordClassIndex(68037);
        HashSet hashSet = new HashSet();
        f132196a = hashSet;
        HashSet hashSet2 = new HashSet();
        f132197b = hashSet2;
        hashSet.add("video_play");
        hashSet.add("play_time");
        hashSet.add("like");
        hashSet.add("follow");
        hashSet.add(UGCMonitor.EVENT_COMMENT);
        hashSet.add("share_video");
        hashSet.add("head");
        hashSet.add(StringSet.name);
        hashSet.add("slide_left");
        hashSet.add("challenge_click");
        hashSet.add("song_cover");
        hashSet.add("shoot");
        hashSet2.add("video_play");
        hashSet2.add("video_play_finish");
        hashSet2.add("play_time");
        hashSet2.add("like");
        hashSet2.add("follow");
        hashSet2.add("post_comment");
        hashSet2.add("share_video");
        hashSet2.add("enter_personal_detail");
        hashSet2.add("enter_tag_detail");
        hashSet2.add("enter_challenge_detail");
        hashSet2.add("shoot");
        hashSet2.add("enter_music_detail");
    }
}
