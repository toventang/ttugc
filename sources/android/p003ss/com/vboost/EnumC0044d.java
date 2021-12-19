package android.p003ss.com.vboost;

import com.bytedance.covode.number.Covode;

/* renamed from: android.ss.com.vboost.d */
public enum EnumC0044d {
    COMMON_APP_START(100001, "common_app_start"),
    COMMON_CAMERA_START(100002, "common_camera_start"),
    COMMON_WINDOW_SWITCH(100003, "common_window_switch"),
    COMMON_TAB_SWITCH(100004, "common_tab_switch"),
    DY_GO_DUET(200001, "dy_go_duet"),
    DY_GO_REACTION(200002, "dy_go_reaction"),
    DY_TAB_LIVING_LOAD(200003, "dy_tab_living_load"),
    DY_TAB_NEARBY_LOAD(200004, "dy_tab_nearby_load"),
    DY_TAB_FOLLOW_LOAD(200005, "dy_tab_follow_load"),
    DY_TAB_SEARCH_LOAD(200006, "dy_tab_search_load"),
    DY_TAB_HOME_LOAD(200007, "dy_tab_home_load"),
    DY_TAB_FAMILIAR_LOAD(200008, "dy_tab_familiar_load"),
    DY_TAB_PUBLISH_LOAD(200009, "dy_tab_publish_load"),
    DY_TAB_NOTIFICATION_LOAD(200010, "dy_tab_notification_load"),
    DY_TAB_USER_LOAD(200011, "dy_tab_user_load"),
    DY_CONCURRENT_UPLOAD_COMPILE(200012, "dy_concurrent_upload_compile"),
    DY_FEED_SCROLL(200013, "dy_feed_scroll"),
    DY_COMMENT_LOAD(200014, "dy_comment_load"),
    DY_TAB_MUSIC(200015, "dy_tab_music"),
    DY_15S_CAPTURE_START(200016, "dy_15s_capture_start"),
    DY_LIVING_SCROLL(200017, "dy_living_scroll"),
    DY_LIVING_ENTER_GIFT_PANEL(200018, "dy_living_enter_gift_panel"),
    DY_LIVING_ENTER_GOODS_LIST(200019, "dy_living_enter_goods_list"),
    TO_FIRST_FRAME_DRAW(300001, "to_first_frame_draw"),
    TO_TAB_SWITCH(300002, "to_tab_switch"),
    TO_CLICK_NEWS(300003, "to_click_news"),
    TO_SCROLL_NEWS(300004, "to_scroll_news"),
    TO_VIDEO_FIRST_FRAME(300005, "to_video_first_frame"),
    TL_FIRST_FRAME_DRAW(400001, "tl_first_frame_draw"),
    TL_TAB_SWITCH(400002, "tl_tab_switch"),
    TL_CLICK_NEWS(400003, "tl_click_news"),
    TL_SCROLL_NEWS(400004, "tl_scroll_news"),
    DC_SCROLL_HOME(500001, "dc_scroll_home"),
    DC_TAB_SWITCH(500002, "dc_tab_switch"),
    DC_SCROLL_MOMENTS(500003, "dc_scroll_moments"),
    DC_VIDEO_FIRST_DRAW(500004, "dc_video_first_draw"),
    TT_GO_DUET(600001, "tt_go_duet"),
    TT_GO_REACTION(600002, "tt_go_reaction"),
    TT_TAB_LIVING_LOAD(600003, "tt_tab_living_load"),
    TT_TAB_NEARBY_LOAD(600004, "tt_tab_nearby_load"),
    TT_TAB_FOLLOW_LOAD(600005, "tt_tab_follow_load"),
    TT_TAB_SEARCH_LOAD(600006, "tt_tab_search_load"),
    TT_TAB_HOME_LOAD(600007, "tt_tab_home_load"),
    TT_TAB_FAMILIAR_LOAD(600008, "tt_tab_familiar_load"),
    TT_TAB_PUBLISH_LOAD(600009, "tt_tab_publish_load"),
    TT_TAB_NOTIFICATION_LOAD(600010, "tt_tab_notification_load"),
    TT_TAB_USER_LOAD(600011, "tt_tab_user_load"),
    TT_CONCURRENT_UPLOAD_COMPILE(600012, "tt_concurrent_upload_compile"),
    TT_FEED_SCROLL(600013, "tt_feed_scroll"),
    TT_COMMENT_LOAD(600014, "tt_comment_load"),
    TT_TAB_MUSIC(600015, "tt_tab_music"),
    TT_15S_CAPTURE_START(600016, "tt_15s_capture_start"),
    TT_LIVING_SCROLL(600017, "tt_living_scroll"),
    TT_LIVING_ENTER_GIFT_PANEL(600018, "tt_living_enter_gift_panel"),
    TT_LIVING_ENTER_GOODS_LIST(600019, "tt_living_enter_goods_list");
    
    public static final int MAX_CLASS;

    /* renamed from: a */
    private static final int f150a = COMMON_TAB_SWITCH.f158h;

    /* renamed from: b */
    private static final int f151b;

    /* renamed from: c */
    private static final int f152c;

    /* renamed from: d */
    private static final int f153d;

    /* renamed from: e */
    private static final int f154e;

    /* renamed from: f */
    private static final int f155f;

    /* renamed from: g */
    private static final int f156g;

    /* renamed from: h */
    private int f158h;

    /* renamed from: i */
    private String f159i;

    public final String getDesc() {
        return this.f159i;
    }

    public final int getId() {
        return this.f158h;
    }

    static {
        Covode.recordClassIndex(47);
        EnumC0044d dVar = DY_LIVING_ENTER_GOODS_LIST;
        EnumC0044d dVar2 = TO_VIDEO_FIRST_FRAME;
        EnumC0044d dVar3 = TL_SCROLL_NEWS;
        EnumC0044d dVar4 = DC_VIDEO_FIRST_DRAW;
        EnumC0044d dVar5 = TT_LIVING_ENTER_GOODS_LIST;
        f151b = dVar.f158h;
        f152c = dVar2.f158h;
        f153d = dVar3.f158h;
        f154e = dVar4.f158h;
        int i = dVar5.f158h;
        f155f = i;
        f156g = i;
        MAX_CLASS = i / 100000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0011 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isValidId(int r5) {
        /*
            r4 = 100000(0x186a0, float:1.4013E-40)
            int r3 = r5 / r4
            int r5 = r5 % r4
            r2 = 1
            r1 = 0
            if (r3 <= 0) goto L_0x0011
            int r0 = android.p003ss.com.vboost.EnumC0044d.MAX_CLASS
            if (r3 > r0) goto L_0x0011
            switch(r3) {
                case 1: goto L_0x003a;
                case 2: goto L_0x0032;
                case 3: goto L_0x002a;
                case 4: goto L_0x0022;
                case 5: goto L_0x001a;
                case 6: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            return r1
        L_0x0012:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.p003ss.com.vboost.EnumC0044d.f155f
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
            goto L_0x0041
        L_0x001a:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.p003ss.com.vboost.EnumC0044d.f154e
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
            goto L_0x0041
        L_0x0022:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.p003ss.com.vboost.EnumC0044d.f153d
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
            goto L_0x0041
        L_0x002a:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.p003ss.com.vboost.EnumC0044d.f152c
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
            goto L_0x0041
        L_0x0032:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.p003ss.com.vboost.EnumC0044d.f151b
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
            goto L_0x0041
        L_0x003a:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.p003ss.com.vboost.EnumC0044d.f150a
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
        L_0x0041:
            return r2
            switch-data {1->0x003a, 2->0x0032, 3->0x002a, 4->0x0022, 5->0x001a, 6->0x0012, }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.EnumC0044d.isValidId(int):boolean");
    }

    private EnumC0044d(int i, String str) {
        this.f158h = i;
        this.f159i = str;
    }
}
