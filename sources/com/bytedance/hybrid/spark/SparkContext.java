package com.bytedance.hybrid.spark;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.monitorV2.p739k.C12121d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15506b;
import com.bytedance.hybrid.spark.p1107a.AbstractC15507c;
import com.bytedance.hybrid.spark.p1107a.AbstractC15509e;
import com.bytedance.hybrid.spark.p1111e.C15575e;
import com.bytedance.lynx.hybrid.p1515a.EnumC21149c;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import com.bytedance.lynx.hybrid.p1522h.C21198c;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21137b;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21138c;
import com.bytedance.lynx.p1507a.p1508a.p1511c.C21139a;
import com.bytedance.lynx.p1507a.p1508a.p1511c.C21140b;
import com.bytedance.lynx.p1507a.p1508a.p1514f.C21144b;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public class SparkContext extends C21196a implements Parcelable {
    public static final Parcelable.Creator<SparkContext> CREATOR = new C15503b();

    /* renamed from: d */
    public static final Map<String, C21196a> f37776d = new LinkedHashMap();

    /* renamed from: e */
    public static final C15502a f37777e = new C15502a((byte) 0);

    /* renamed from: a */
    public String f37778a;

    /* renamed from: b */
    public Map<String, String> f37779b;

    /* renamed from: c */
    public C21198c f37780c;

    /* renamed from: j */
    private int f37781j;

    /* renamed from: k */
    private C21138c f37782k;

    /* renamed from: l */
    private boolean f37783l;

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.bytedance.hybrid.spark.SparkContext$a */
    public static final class C15502a {
        static {
            Covode.recordClassIndex(17762);
        }

        private C15502a() {
        }

        public /* synthetic */ C15502a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.SparkContext$b */
    public static final class C15503b implements Parcelable.Creator<SparkContext> {
        static {
            Covode.recordClassIndex(17763);
        }

        C15503b() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SparkContext[] newArray(int i) {
            return new SparkContext[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SparkContext createFromParcel(Parcel parcel) {
            C89219l.m154719c(parcel, "");
            return new SparkContext(parcel);
        }
    }

    static {
        Covode.recordClassIndex(17761);
    }

    public SparkContext() {
        this.f37781j = -1;
        this.f37778a = "";
        this.f37779b = new LinkedHashMap();
        this.f37780c = new C21198c();
    }

    /* renamed from: a */
    public final AbstractC15509e mo25239a() {
        return (AbstractC15509e) mo34746a(AbstractC15509e.class);
    }

    /* renamed from: b */
    public final C21138c mo25241b() {
        C21137b bVar;
        EnumC21149c cVar;
        EnumC21149c cVar2;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        String str;
        EnumC21149c cVar3;
        SparkContext sparkContext = this;
        if (!sparkContext.f37783l) {
            int a = C15575e.C15576a.m28693a(sparkContext.f37778a);
            if (sparkContext.f37778a.length() > 0) {
                if (a == 1) {
                    String str2 = sparkContext.f37778a;
                    Map<String, String> map = sparkContext.f37779b;
                    C89219l.m154719c(str2, "");
                    Uri parse = Uri.parse(str2);
                    C21136a aVar = new C21136a(null, 1, null);
                    C89219l.m154709a((Object) parse, "");
                    Map<String, String> a2 = C21139a.m39800a(aVar, parse, map);
                    C89219l.m154719c(parse, "");
                    C89219l.m154719c(a2, "");
                    C89219l.m154719c(aVar, "");
                    String str3 = a2.get("should_full_screen");
                    bVar = aVar;
                    if (str3 != null) {
                        aVar.setTransStatusBar(C89219l.m154714a((Object) str3, (Object) "1"));
                    }
                    String str4 = a2.get("status_bar_color");
                    if (str4 != null) {
                        aVar.setStatusBgColor(C21140b.m39804d("status_bar_color", str4, a2, parse));
                    }
                    String str5 = a2.get("show_loading");
                    if (str5 != null) {
                        aVar.setHideLoading(C89219l.m154714a((Object) str5, (Object) "0"));
                    }
                    String str6 = a2.get("block_back_press");
                    if (str6 != null) {
                        aVar.setBlockBackPress(C21140b.m39802b("block_back_press", str6, a2, parse));
                    }
                    String str7 = a2.get("bundle");
                    if (str7 != null) {
                        aVar.setBundle(C21140b.m39803c("bundle", str7, a2, parse));
                    }
                    String str8 = a2.get("channel");
                    if (str8 != null) {
                        aVar.setChannel(C21140b.m39803c("channel", str8, a2, parse));
                    }
                    String str9 = a2.get("container_bg_color");
                    if (str9 != null) {
                        aVar.setContainerBgColor(C21140b.m39805e("container_bg_color", str9, a2, parse));
                    }
                    String str10 = a2.get("disable_back_press");
                    if (str10 != null) {
                        aVar.setDisableBackPress(C21140b.m39802b("disable_back_press", str10, a2, parse));
                    }
                    String str11 = a2.get("disable_builtin");
                    if (str11 != null) {
                        aVar.setDisableBuiltin(C21140b.m39802b("disable_builtin", str11, a2, parse));
                    }
                    String str12 = a2.get("disable_gecko");
                    if (str12 != null) {
                        aVar.setDisableGecko(C21140b.m39802b("disable_gecko", str12, a2, parse));
                    }
                    String str13 = a2.get("no_hw");
                    if (str13 != null) {
                        aVar.setDisableHardwareAccelerate(C21140b.m39802b("no_hw", str13, a2, parse));
                    }
                    String str14 = a2.get("disable_save_image");
                    if (str14 != null) {
                        aVar.setDisableSaveImage(C21140b.m39802b("disable_save_image", str14, a2, parse));
                    }
                    String str15 = a2.get("enable_canvas");
                    if (str15 != null) {
                        aVar.setEnableCanvas(C21140b.m39802b("enable_canvas", str15, a2, parse));
                    }
                    String str16 = a2.get("fallback_url");
                    if (str16 != null) {
                        aVar.setFallbackUrl(C21140b.m39803c("fallback_url", str16, a2, parse));
                    }
                    String str17 = a2.get("force_h5");
                    if (str17 != null) {
                        aVar.setForceH5(C21140b.m39802b("force_h5", str17, a2, parse));
                    }
                    String str18 = a2.get("group");
                    if (str18 != null) {
                        aVar.setGroup(C21140b.m39803c("group", str18, a2, parse));
                    }
                    String str19 = a2.get("hide_loading");
                    if (str19 != null) {
                        aVar.setHideLoading(C21140b.m39802b("hide_loading", str19, a2, parse));
                    }
                    String str20 = a2.get("hide_nav_bar");
                    if (str20 != null) {
                        aVar.setHideNavBar(C21140b.m39802b("hide_nav_bar", str20, a2, parse));
                    }
                    String str21 = a2.get("hide_status_bar");
                    if (str21 != null) {
                        aVar.setHideStatusBar(C21140b.m39802b("hide_status_bar", str21, a2, parse));
                    }
                    String str22 = a2.get("ignore_cache_policy");
                    if (str22 != null) {
                        aVar.setIgnoreCachePolicy(C21140b.m39801a("ignore_cache_policy", str22, a2, parse));
                    }
                    String str23 = a2.get("initial_data");
                    if (str23 != null) {
                        aVar.setInitData(C21140b.m39803c("initial_data", str23, a2, parse));
                    }
                    String str24 = a2.get("loading_bg_color");
                    if (str24 != null) {
                        aVar.setLoadingBgColor(C21140b.m39805e("loading_bg_color", str24, a2, parse));
                    }
                    String str25 = a2.get("lynxview_height");
                    if (str25 != null) {
                        aVar.setLynxViewHeight(C21140b.m39801a("lynxview_height", str25, a2, parse));
                    }
                    String str26 = a2.get("lynxview_width");
                    if (str26 != null) {
                        aVar.setLynxViewWidth(C21140b.m39801a("lynxview_width", str26, a2, parse));
                    }
                    String str27 = a2.get("nav_bar_color");
                    if (str27 != null) {
                        aVar.setNavBarColor(C21140b.m39805e("nav_bar_color", str27, a2, parse));
                    }
                    String str28 = a2.get("nav_btn_type");
                    if (str28 != null) {
                        aVar.setNavBtnType(C21140b.m39803c("nav_btn_type", str28, a2, parse));
                    }
                    String str29 = a2.get("need_sec_link");
                    if (str29 != null) {
                        aVar.setNeedSecLink(C21140b.m39802b("need_sec_link", str29, a2, parse));
                    }
                    String str30 = a2.get("preloadFonts");
                    if (str30 != null) {
                        aVar.setPreloadFonts(C21140b.m39803c("preloadFonts", str30, a2, parse));
                    }
                    String str31 = a2.get("preset_height");
                    if (str31 != null) {
                        aVar.setPresetHeight(C21140b.m39801a("preset_height", str31, a2, parse));
                    }
                    String str32 = a2.get("preset_safe_point");
                    if (str32 != null) {
                        aVar.setPresetSafePoint(C21140b.m39802b("preset_safe_point", str32, a2, parse));
                    }
                    String str33 = a2.get("preset_width");
                    if (str33 != null) {
                        aVar.setPresetWidth(C21140b.m39801a("preset_width", str33, a2, parse));
                    }
                    String str34 = a2.get("surl");
                    if (str34 != null) {
                        aVar.setSUrl(C21140b.m39803c("surl", str34, a2, parse));
                    }
                    String str35 = a2.get("sec_link_scene");
                    if (str35 != null) {
                        aVar.setSecLinkScene(C21140b.m39803c("sec_link_scene", str35, a2, parse));
                    }
                    String str36 = a2.get("share_group");
                    if (str36 != null) {
                        aVar.setShareGroup(C21140b.m39802b("share_group", str36, a2, parse));
                    }
                    String str37 = a2.get("show_closeall");
                    if (str37 != null) {
                        aVar.setShowCloseAll(C21140b.m39802b("show_closeall", str37, a2, parse));
                    }
                    String str38 = a2.get("status_bar_bg_color");
                    if (str38 != null) {
                        aVar.setStatusBgColor(C21140b.m39805e("status_bar_bg_color", str38, a2, parse));
                    }
                    String str39 = a2.get("status_font_mode");
                    if (str39 != null) {
                        aVar.setStatusFontMode(C21140b.m39803c("status_font_mode", str39, a2, parse));
                    }
                    String str40 = a2.get("thread_strategy");
                    if (str40 != null) {
                        aVar.setThreadStrategy(C21140b.m39801a("thread_strategy", str40, a2, parse));
                    }
                    String str41 = a2.get("title");
                    if (str41 != null) {
                        aVar.setTitle(C21140b.m39803c("title", str41, a2, parse));
                    }
                    String str42 = a2.get("title_color");
                    if (str42 != null) {
                        aVar.setTitleColor(C21140b.m39805e("title_color", str42, a2, parse));
                    }
                    String str43 = a2.get("trans_status_bar");
                    if (str43 != null) {
                        aVar.setTransStatusBar(C21140b.m39802b("trans_status_bar", str43, a2, parse));
                    }
                    String str44 = a2.get("ui_running_mode");
                    if (str44 != null) {
                        aVar.setUiRunningMode(C21140b.m39802b("ui_running_mode", str44, a2, parse));
                    }
                    String str45 = a2.get("url");
                    if (str45 != null) {
                        aVar.setUrl(C21140b.m39803c("url", str45, a2, parse));
                    }
                    String str46 = a2.get("__use_ttnet");
                    if (str46 != null) {
                        aVar.setUseTtnet(C21140b.m39801a("__use_ttnet", str46, a2, parse));
                    }
                    String str47 = a2.get("use_webview_title");
                    if (str47 != null) {
                        aVar.setUseWebTitle(C21140b.m39802b("use_webview_title", str47, a2, parse));
                    }
                    String host = parse.getHost();
                    if (host == null) {
                        C89219l.m154707a();
                    }
                    C89219l.m154709a((Object) host, "");
                    if (C89361p.m154908a((CharSequence) host, (CharSequence) "webview", false)) {
                        cVar = EnumC21149c.WEB;
                    } else if (C89361p.m154908a((CharSequence) host, (CharSequence) "lynxview", false)) {
                        cVar = EnumC21149c.LYNX;
                    } else {
                        cVar = EnumC21149c.UNKNOWN;
                    }
                    bVar.setEngineType(cVar);
                } else if (a != 2) {
                    String str48 = sparkContext.f37778a;
                    Map<String, String> map2 = sparkContext.f37779b;
                    C89219l.m154719c(str48, "");
                    Uri parse2 = Uri.parse(str48);
                    bVar = new C21138c(null, 1, null);
                    C89219l.m154709a((Object) parse2, "");
                    Map<String, String> a3 = C21139a.m39800a(bVar, parse2, map2);
                    String str49 = a3.get("block_back_press");
                    if (str49 != null) {
                        bVar.setBlockBackPress(C21140b.m39802b("block_back_press", str49, a3, parse2));
                    }
                    String str50 = a3.get("bundle");
                    if (str50 != null) {
                        bVar.setBundle(C21140b.m39803c("bundle", str50, a3, parse2));
                    }
                    String str51 = a3.get("channel");
                    if (str51 != null) {
                        bVar.setChannel(C21140b.m39803c("channel", str51, a3, parse2));
                    }
                    String str52 = a3.get("container_bg_color");
                    if (str52 != null) {
                        bVar.setContainerBgColor(C21140b.m39805e("container_bg_color", str52, a3, parse2));
                    }
                    String str53 = a3.get("disable_back_press");
                    if (str53 != null) {
                        bVar.setDisableBackPress(C21140b.m39802b("disable_back_press", str53, a3, parse2));
                    }
                    String str54 = a3.get("disable_builtin");
                    if (str54 != null) {
                        bVar.setDisableBuiltin(C21140b.m39802b("disable_builtin", str54, a3, parse2));
                    }
                    String str55 = a3.get("disable_gecko");
                    if (str55 != null) {
                        bVar.setDisableGecko(C21140b.m39802b("disable_gecko", str55, a3, parse2));
                    }
                    String str56 = a3.get("no_hw");
                    if (str56 != null) {
                        bVar.setDisableHardwareAccelerate(C21140b.m39802b("no_hw", str56, a3, parse2));
                    }
                    String str57 = a3.get("disable_save_image");
                    if (str57 != null) {
                        bVar.setDisableSaveImage(C21140b.m39802b("disable_save_image", str57, a3, parse2));
                    }
                    String str58 = a3.get("enable_canvas");
                    if (str58 != null) {
                        bVar.setEnableCanvas(C21140b.m39802b("enable_canvas", str58, a3, parse2));
                    }
                    String str59 = a3.get("fallback_url");
                    if (str59 != null) {
                        bVar.setFallbackUrl(C21140b.m39803c("fallback_url", str59, a3, parse2));
                    }
                    String str60 = a3.get("force_h5");
                    if (str60 != null) {
                        bVar.setForceH5(C21140b.m39802b("force_h5", str60, a3, parse2));
                    }
                    String str61 = a3.get("group");
                    if (str61 != null) {
                        bVar.setGroup(C21140b.m39803c("group", str61, a3, parse2));
                    }
                    String str62 = a3.get("hide_loading");
                    if (str62 != null) {
                        bVar.setHideLoading(C21140b.m39802b("hide_loading", str62, a3, parse2));
                    }
                    String str63 = a3.get("ignore_cache_policy");
                    if (str63 != null) {
                        bVar.setIgnoreCachePolicy(C21140b.m39801a("ignore_cache_policy", str63, a3, parse2));
                    }
                    String str64 = a3.get("initial_data");
                    if (str64 != null) {
                        bVar.setInitData(C21140b.m39803c("initial_data", str64, a3, parse2));
                    }
                    String str65 = a3.get("loading_bg_color");
                    if (str65 != null) {
                        bVar.setLoadingBgColor(C21140b.m39805e("loading_bg_color", str65, a3, parse2));
                    }
                    String str66 = a3.get("lynxview_height");
                    if (str66 != null) {
                        bVar.setLynxViewHeight(C21140b.m39801a("lynxview_height", str66, a3, parse2));
                    }
                    String str67 = a3.get("lynxview_width");
                    if (str67 != null) {
                        bVar.setLynxViewWidth(C21140b.m39801a("lynxview_width", str67, a3, parse2));
                    }
                    String str68 = a3.get("need_sec_link");
                    if (str68 != null) {
                        bVar.setNeedSecLink(C21140b.m39802b("need_sec_link", str68, a3, parse2));
                    }
                    String str69 = a3.get("preloadFonts");
                    if (str69 != null) {
                        bVar.setPreloadFonts(C21140b.m39803c("preloadFonts", str69, a3, parse2));
                    }
                    String str70 = a3.get("preset_height");
                    if (str70 != null) {
                        bVar.setPresetHeight(C21140b.m39801a("preset_height", str70, a3, parse2));
                    }
                    String str71 = a3.get("preset_safe_point");
                    if (str71 != null) {
                        bVar.setPresetSafePoint(C21140b.m39802b("preset_safe_point", str71, a3, parse2));
                    }
                    String str72 = a3.get("preset_width");
                    if (str72 != null) {
                        bVar.setPresetWidth(C21140b.m39801a("preset_width", str72, a3, parse2));
                    }
                    String str73 = a3.get("surl");
                    if (str73 != null) {
                        bVar.setSUrl(C21140b.m39803c("surl", str73, a3, parse2));
                    }
                    String str74 = a3.get("sec_link_scene");
                    if (str74 != null) {
                        bVar.setSecLinkScene(C21140b.m39803c("sec_link_scene", str74, a3, parse2));
                    }
                    String str75 = a3.get("share_group");
                    if (str75 != null) {
                        bVar.setShareGroup(C21140b.m39802b("share_group", str75, a3, parse2));
                    }
                    String str76 = a3.get("thread_strategy");
                    if (str76 != null) {
                        bVar.setThreadStrategy(C21140b.m39801a("thread_strategy", str76, a3, parse2));
                    }
                    String str77 = a3.get("ui_running_mode");
                    if (str77 != null) {
                        bVar.setUiRunningMode(C21140b.m39802b("ui_running_mode", str77, a3, parse2));
                    }
                    String str78 = a3.get("url");
                    if (str78 != null) {
                        bVar.setUrl(C21140b.m39803c("url", str78, a3, parse2));
                    }
                    String str79 = a3.get("__use_ttnet");
                    if (str79 != null) {
                        bVar.setUseTtnet(C21140b.m39801a("__use_ttnet", str79, a3, parse2));
                    }
                    String host2 = parse2.getHost();
                    if (host2 == null) {
                        C89219l.m154707a();
                    }
                    C89219l.m154709a((Object) host2, "");
                    if (C89361p.m154908a((CharSequence) host2, (CharSequence) "webview", false)) {
                        cVar3 = EnumC21149c.WEB;
                    } else if (C89361p.m154908a((CharSequence) host2, (CharSequence) "lynxview", false)) {
                        cVar3 = EnumC21149c.LYNX;
                    } else {
                        cVar3 = EnumC21149c.UNKNOWN;
                    }
                    bVar.setEngineType(cVar3);
                } else {
                    String str80 = sparkContext.f37778a;
                    Map<String, String> map3 = sparkContext.f37779b;
                    C89219l.m154719c(str80, "");
                    Uri parse3 = Uri.parse(str80);
                    C21137b bVar2 = new C21137b(null, 1, null);
                    C89219l.m154709a((Object) parse3, "");
                    Map<String, String> a4 = C21139a.m39800a(bVar2, parse3, map3);
                    C89219l.m154719c(bVar2, "");
                    C89219l.m154719c(a4, "");
                    C89219l.m154719c(parse3, "");
                    String str81 = a4.get("width_percent");
                    if (str81 != null) {
                        bVar = bVar2;
                        bVar2.setWidth((int) ((Float.parseFloat(str81) / 100.0f) * ((float) C21144b.m39810b())));
                    } else {
                        bVar = bVar2;
                    }
                    String str82 = a4.get("height_percent");
                    if (str82 != null) {
                        bVar2.setHeight((int) ((Float.parseFloat(str82) / 100.0f) * ((float) C21144b.m39808a())));
                    }
                    String str83 = a4.get("mask_color");
                    if (str83 != null) {
                        bVar2.setMaskBgColor(C21140b.m39804d("mask_color", str83, a4, parse3));
                    }
                    String str84 = a4.get("container_bgcolor");
                    if (str84 != null) {
                        bVar2.setContainerBgColor(C21140b.m39804d("container_bgcolor", str84, a4, parse3));
                    }
                    bVar2.setDisableMaskClose(!C89219l.m154714a((Object) a4.get("close_by_mask"), (Object) "1"));
                    bVar2.setPullDownClose(C89219l.m154714a((Object) a4.get("close_by_gesture"), (Object) "1"));
                    String str85 = a4.get("popup_enter_type");
                    if (str85 != null) {
                        bVar2.setAnimation(str85);
                    }
                    if (a4.get("drag_height") == null && (str = a4.get("drag_height_percent")) != null) {
                        bVar2.setDragHeight((int) ((Float.parseFloat(str) / 100.0f) * ((float) C21144b.m39808a())));
                    }
                    if (bVar2.getPullDownClose()) {
                        String str86 = a4.get("drag_down_threshold");
                        if (str86 == null || (valueOf3 = Integer.valueOf(Integer.parseInt(str86))) == null) {
                            bVar2.setDragDownThreshold(bVar2.getDragHeight() - bVar2.getHeight());
                        } else {
                            bVar2.setDragDownThreshold(valueOf3.intValue());
                        }
                        String str87 = a4.get("drag_down_close_threshold");
                        if (str87 == null || (valueOf2 = Integer.valueOf(Integer.parseInt(str87))) == null) {
                            bVar2.setDragDownCloseThreshold((int) (((float) bVar2.getDragHeight()) - (((float) bVar2.getHeight()) * 0.8f)));
                        } else {
                            bVar2.setDragDownCloseThreshold(valueOf2.intValue());
                        }
                        String str88 = a4.get("peek_down_close_threshold");
                        if (str88 == null || (valueOf = Integer.valueOf(Integer.parseInt(str88))) == null) {
                            bVar2.setPeekDownCloseThreshold((int) (((float) bVar2.getHeight()) * 0.2f));
                        } else {
                            bVar2.setPeekDownCloseThreshold(valueOf.intValue());
                        }
                    }
                    String str89 = a4.get("show_loading");
                    if (str89 != null) {
                        bVar2.setHideLoading(C89219l.m154714a((Object) str89, (Object) "0"));
                    }
                    String str90 = a4.get("transition_animation");
                    if (str90 != null) {
                        bVar2.setAnimation(C21140b.m39803c("transition_animation", str90, a4, parse3));
                    }
                    String str91 = a4.get("block_back_press");
                    if (str91 != null) {
                        bVar2.setBlockBackPress(C21140b.m39802b("block_back_press", str91, a4, parse3));
                    }
                    String str92 = a4.get("bundle");
                    if (str92 != null) {
                        bVar2.setBundle(C21140b.m39803c("bundle", str92, a4, parse3));
                    }
                    String str93 = a4.get("channel");
                    if (str93 != null) {
                        bVar2.setChannel(C21140b.m39803c("channel", str93, a4, parse3));
                    }
                    String str94 = a4.get("container_bg_color");
                    if (str94 != null) {
                        bVar2.setContainerBgColor(C21140b.m39805e("container_bg_color", str94, a4, parse3));
                    }
                    String str95 = a4.get("disable_back_press");
                    if (str95 != null) {
                        bVar2.setDisableBackPress(C21140b.m39802b("disable_back_press", str95, a4, parse3));
                    }
                    String str96 = a4.get("disable_builtin");
                    if (str96 != null) {
                        bVar2.setDisableBuiltin(C21140b.m39802b("disable_builtin", str96, a4, parse3));
                    }
                    String str97 = a4.get("disable_gecko");
                    if (str97 != null) {
                        bVar2.setDisableGecko(C21140b.m39802b("disable_gecko", str97, a4, parse3));
                    }
                    String str98 = a4.get("no_hw");
                    if (str98 != null) {
                        bVar2.setDisableHardwareAccelerate(C21140b.m39802b("no_hw", str98, a4, parse3));
                    }
                    String str99 = a4.get("disable_mask_click_close");
                    if (str99 != null) {
                        bVar2.setDisableMaskClose(C21140b.m39802b("disable_mask_click_close", str99, a4, parse3));
                    }
                    String str100 = a4.get("disable_save_image");
                    if (str100 != null) {
                        bVar2.setDisableSaveImage(C21140b.m39802b("disable_save_image", str100, a4, parse3));
                    }
                    String str101 = a4.get("drag_back");
                    if (str101 != null) {
                        bVar2.setDragBack(C21140b.m39802b("drag_back", str101, a4, parse3));
                    }
                    String str102 = a4.get("drag_by_gesture");
                    if (str102 != null) {
                        bVar2.setDragByGesture(C21140b.m39802b("drag_by_gesture", str102, a4, parse3));
                    }
                    String str103 = a4.get("drag_down_close_threshold");
                    if (str103 != null) {
                        bVar2.setDragDownCloseThreshold(C21140b.m39801a("drag_down_close_threshold", str103, a4, parse3));
                    }
                    String str104 = a4.get("drag_down_threshold");
                    if (str104 != null) {
                        bVar2.setDragDownThreshold(C21140b.m39801a("drag_down_threshold", str104, a4, parse3));
                    }
                    String str105 = a4.get("drag_height");
                    if (str105 != null) {
                        bVar2.setDragHeight(C21140b.m39801a("drag_height", str105, a4, parse3));
                    }
                    String str106 = a4.get("drag_up_threshold");
                    if (str106 != null) {
                        bVar2.setDragUpThreshold(C21140b.m39801a("drag_up_threshold", str106, a4, parse3));
                    }
                    String str107 = a4.get("enable_canvas");
                    if (str107 != null) {
                        bVar2.setEnableCanvas(C21140b.m39802b("enable_canvas", str107, a4, parse3));
                    }
                    String str108 = a4.get("fallback_url");
                    if (str108 != null) {
                        bVar2.setFallbackUrl(C21140b.m39803c("fallback_url", str108, a4, parse3));
                    }
                    String str109 = a4.get("force_h5");
                    if (str109 != null) {
                        bVar2.setForceH5(C21140b.m39802b("force_h5", str109, a4, parse3));
                    }
                    String str110 = a4.get("gravity");
                    if (str110 != null) {
                        bVar2.setGravity(C21140b.m39803c("gravity", str110, a4, parse3));
                    }
                    String str111 = a4.get("group");
                    if (str111 != null) {
                        bVar2.setGroup(C21140b.m39803c("group", str111, a4, parse3));
                    }
                    String str112 = a4.get("height");
                    if (str112 != null) {
                        bVar2.setHeight(C21140b.m39801a("height", str112, a4, parse3));
                    }
                    String str113 = a4.get("hide_loading");
                    if (str113 != null) {
                        bVar2.setHideLoading(C21140b.m39802b("hide_loading", str113, a4, parse3));
                    }
                    String str114 = a4.get("ignore_cache_policy");
                    if (str114 != null) {
                        bVar2.setIgnoreCachePolicy(C21140b.m39801a("ignore_cache_policy", str114, a4, parse3));
                    }
                    String str115 = a4.get("initial_data");
                    if (str115 != null) {
                        bVar2.setInitData(C21140b.m39803c("initial_data", str115, a4, parse3));
                    }
                    String str116 = a4.get("loading_bg_color");
                    if (str116 != null) {
                        bVar2.setLoadingBgColor(C21140b.m39805e("loading_bg_color", str116, a4, parse3));
                    }
                    String str117 = a4.get("lynxview_height");
                    if (str117 != null) {
                        bVar2.setLynxViewHeight(C21140b.m39801a("lynxview_height", str117, a4, parse3));
                    }
                    String str118 = a4.get("lynxview_width");
                    if (str118 != null) {
                        bVar2.setLynxViewWidth(C21140b.m39801a("lynxview_width", str118, a4, parse3));
                    }
                    String str119 = a4.get("mask_bg_color");
                    if (str119 != null) {
                        bVar2.setMaskBgColor(C21140b.m39805e("mask_bg_color", str119, a4, parse3));
                    }
                    String str120 = a4.get("need_sec_link");
                    if (str120 != null) {
                        bVar2.setNeedSecLink(C21140b.m39802b("need_sec_link", str120, a4, parse3));
                    }
                    String str121 = a4.get("peek_down_close_threshold");
                    if (str121 != null) {
                        bVar2.setPeekDownCloseThreshold(C21140b.m39801a("peek_down_close_threshold", str121, a4, parse3));
                    }
                    String str122 = a4.get("preloadFonts");
                    if (str122 != null) {
                        bVar2.setPreloadFonts(C21140b.m39803c("preloadFonts", str122, a4, parse3));
                    }
                    String str123 = a4.get("preset_height");
                    if (str123 != null) {
                        bVar2.setPresetHeight(C21140b.m39801a("preset_height", str123, a4, parse3));
                    }
                    String str124 = a4.get("preset_safe_point");
                    if (str124 != null) {
                        bVar2.setPresetSafePoint(C21140b.m39802b("preset_safe_point", str124, a4, parse3));
                    }
                    String str125 = a4.get("preset_width");
                    if (str125 != null) {
                        bVar2.setPresetWidth(C21140b.m39801a("preset_width", str125, a4, parse3));
                    }
                    String str126 = a4.get("enable_pull_down_close");
                    if (str126 != null) {
                        bVar2.setPullDownClose(C21140b.m39802b("enable_pull_down_close", str126, a4, parse3));
                    }
                    String str127 = a4.get("radius");
                    if (str127 != null) {
                        bVar2.setRadius(C21140b.m39801a("radius", str127, a4, parse3));
                    }
                    String str128 = a4.get("surl");
                    if (str128 != null) {
                        bVar2.setSUrl(C21140b.m39803c("surl", str128, a4, parse3));
                    }
                    String str129 = a4.get("sec_link_scene");
                    if (str129 != null) {
                        bVar2.setSecLinkScene(C21140b.m39803c("sec_link_scene", str129, a4, parse3));
                    }
                    String str130 = a4.get("share_group");
                    if (str130 != null) {
                        bVar2.setShareGroup(C21140b.m39802b("share_group", str130, a4, parse3));
                    }
                    String str131 = a4.get("show_mask");
                    if (str131 != null) {
                        bVar2.setShowMask(C21140b.m39802b("show_mask", str131, a4, parse3));
                    }
                    String str132 = a4.get("thread_strategy");
                    if (str132 != null) {
                        bVar2.setThreadStrategy(C21140b.m39801a("thread_strategy", str132, a4, parse3));
                    }
                    String str133 = a4.get("ui_running_mode");
                    if (str133 != null) {
                        bVar2.setUiRunningMode(C21140b.m39802b("ui_running_mode", str133, a4, parse3));
                    }
                    String str134 = a4.get("url");
                    if (str134 != null) {
                        bVar2.setUrl(C21140b.m39803c("url", str134, a4, parse3));
                    }
                    String str135 = a4.get("__use_ttnet");
                    if (str135 != null) {
                        bVar2.setUseTtnet(C21140b.m39801a("__use_ttnet", str135, a4, parse3));
                    }
                    String str136 = a4.get("width");
                    if (str136 != null) {
                        bVar2.setWidth(C21140b.m39801a("width", str136, a4, parse3));
                    }
                    String host3 = parse3.getHost();
                    if (host3 == null) {
                        C89219l.m154707a();
                    }
                    C89219l.m154709a((Object) host3, "");
                    if (C89361p.m154908a((CharSequence) host3, (CharSequence) "webview", false)) {
                        cVar2 = EnumC21149c.WEB;
                    } else if (C89361p.m154908a((CharSequence) host3, (CharSequence) "lynxview", false)) {
                        cVar2 = EnumC21149c.LYNX;
                    } else {
                        cVar2 = EnumC21149c.UNKNOWN;
                    }
                    bVar.setEngineType(cVar2);
                }
                sparkContext = this;
                sparkContext.f37782k = bVar;
            }
            sparkContext.f37783l = true;
        }
        return sparkContext.f37782k;
    }

    /* renamed from: a */
    public final SparkContext mo25236a(AbstractC15506b bVar) {
        C89219l.m154719c(bVar, "");
        mo34748a(AbstractC15506b.class, bVar);
        return this;
    }

    /* renamed from: a */
    public final SparkContext mo25237a(AbstractC15507c cVar) {
        C89219l.m154719c(cVar, "");
        mo34748a(AbstractC15507c.class, cVar);
        return this;
    }

    /* renamed from: a */
    public final SparkContext mo25238a(String str) {
        C89219l.m154719c(str, "");
        this.f37778a = str;
        this.f37783l = false;
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SparkContext(Parcel parcel) {
        this();
        boolean z;
        C89219l.m154719c(parcel, "");
        this.f37781j = parcel.readInt();
        String readString = parcel.readString();
        this.f37778a = readString == null ? "" : readString;
        parcel.readMap(this.f37779b, Map.class.getClassLoader());
        parcel.readMap(this.f37780c, Map.class.getClassLoader());
        Serializable readSerializable = parcel.readSerializable();
        this.f37782k = (C21138c) (!(readSerializable instanceof C21138c) ? null : readSerializable);
        String readString2 = parcel.readString();
        readString2 = readString2 == null ? C12121d.m21607a() : readString2;
        C89219l.m154719c(readString2, "");
        this.f50280f = readString2;
        String readString3 = parcel.readString();
        readString3 = readString3 == null ? "default_bid" : readString3;
        C89219l.m154719c(readString3, "");
        this.f50281g = readString3;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37783l = z;
    }

    /* renamed from: a */
    public final void mo25240a(AbstractC15509e eVar) {
        C89219l.m154719c(eVar, "");
        mo34748a(AbstractC15509e.class, eVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C89219l.m154719c(parcel, "");
        parcel.writeInt(this.f37781j);
        parcel.writeString(this.f37778a);
        parcel.writeMap(this.f37779b);
        parcel.writeMap(this.f37780c);
        parcel.writeSerializable(this.f37782k);
        parcel.writeString(this.f50280f);
        parcel.writeString(this.f50281g);
        parcel.writeInt(this.f37783l ? 1 : 0);
    }
}
