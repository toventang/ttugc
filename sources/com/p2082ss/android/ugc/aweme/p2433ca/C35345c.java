package com.p2082ss.android.ugc.aweme.p2433ca;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.experiment.C46734bg;
import com.p2082ss.android.ugc.aweme.experiment.C46902eq;
import com.p2082ss.android.ugc.aweme.experiment.C47033k;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.p3682s.C67261e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ca.c */
public class C35345c {

    /* renamed from: a */
    public static boolean f83378a;

    /* renamed from: b */
    private static final String[] f83379b = {"homepage_common_black_mask_layer_tmp_wrapper", "homepage_common_ad_half_web_page_container_tmp_wrapper"};

    /* renamed from: c */
    private static final List<String> f83380c;

    /* renamed from: d */
    private static final String[] f83381d = {"common_feed_item_feed", "story_item_story_list", "common_feed_layout_video_desc", "layout_video_multi_tag", "common_feed_layout_video_digg", "common_feed_view_video_progress_bar", "common_feed_layout_video_comment_count", "common_feed_layout_video_share", "common_feed_layout_video_more", "common_feed_addiction_hint", "common_feed_layout_feed_avatar", "common_feed_view_video_caution", "common_feed_layout_video_title_with_relation", "common_feed_layout_video_title_music", "common_feed_layout_video_cover_music"};

    /* renamed from: e */
    private static final String[] f83382e = {"common_feed_item_feed"};

    /* renamed from: b */
    public static void m72337b() {
        String[] strArr;
        if (C67261e.m119183a() == 2) {
            strArr = f83382e;
        } else {
            strArr = f83381d;
        }
        for (String str : strArr) {
            C1870c.m6051a(str);
        }
    }

    /* renamed from: a */
    public static void m72333a() {
        if (!C1870c.m6052b(null, "detail_feed_activity_video_detail")) {
            C1870c.m6050a((Context) null, "detail_feed_activity_video_detail");
        }
        if (!C1870c.m6052b(null, "detail_feed_fragment_detail_page")) {
            C1870c.m6050a((Context) null, "detail_feed_fragment_detail_page");
        }
        if (!C1870c.m6052b(null, "detail_feed_insights_bottom")) {
            C1870c.m6050a((Context) null, "detail_feed_insights_bottom");
        }
        if (!C1870c.m6052b(null, "detail_feed_video_seek_bar")) {
            C1870c.m6050a((Context) null, "detail_feed_video_seek_bar");
        }
        if (!C1870c.m6052b(null, "aweme_comment_fragment_input_detail")) {
            C1870c.m6050a((Context) null, "aweme_comment_fragment_input_detail");
        }
    }

    static {
        Covode.recordClassIndex(42513);
        ArrayList arrayList = new ArrayList();
        f83380c = arrayList;
        if (C67261e.m119184b()) {
            arrayList.add("homepage_common_fragment_main_page_opt");
        } else {
            arrayList.add("homepage_common_fragment_main_page");
        }
        if (C67261e.m119185c()) {
            arrayList.add("homepage_common_fragment_main_opt");
        } else {
            arrayList.add("homepage_common_fragment_main");
        }
        if (C67261e.m119187e()) {
            arrayList.add("homepage_common_view_main_tab_item_follow_opt");
        } else {
            arrayList.add("homepage_common_view_main_tab_item_follow");
        }
        if (C67261e.m119186d()) {
            arrayList.add("common_feed_fragment_feed_opt");
        } else {
            arrayList.add("common_feed_fragment_feed");
        }
    }

    /* renamed from: a */
    private static void m72335a(Context context) {
        for (String str : f83379b) {
            C1870c.m6050a(context, str);
        }
    }

    /* renamed from: b */
    private static void m72338b(Context context) {
        for (String str : f83380c) {
            C1870c.m6050a(context, str);
        }
    }

    /* renamed from: a */
    public static void m72334a(Activity activity) {
        if (!f83378a) {
            if (!C47033k.f109574d) {
                if (!C67248d.m119174b()) {
                    m72335a((Context) activity);
                }
                C1870c.m6048a(activity);
                m72338b(activity);
            }
            f83378a = true;
        } else if (!C47033k.f109572b) {
            if (!C67248d.m119174b()) {
                m72335a((Context) activity);
            }
            C1870c.m6048a(activity);
            m72338b(activity);
        }
        if (C46902eq.m90200a()) {
            C1870c.m6050a(activity, "common_feed_swipe_up_strengthen_layout");
        }
        if (C49907s.m93685a().booleanValue()) {
            m72336a(activity, C46902eq.m90201b());
        } else {
            m72336a(activity, C46734bg.m90112a());
        }
    }

    /* renamed from: a */
    public static void m72336a(Context context, int i) {
        String[] strArr;
        if (C67261e.m119183a() == 2) {
            strArr = f83382e;
        } else {
            strArr = f83381d;
        }
        for (int i2 = 0; i2 < i; i2++) {
            for (String str : strArr) {
                C1870c.m6050a(context, str);
            }
        }
    }
}
