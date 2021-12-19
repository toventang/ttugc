package com.bytedance.android.livesdk.container.config.base;

import android.net.Uri;
import com.bytedance.android.livesdk.container.config.live.LivePageConfig;
import com.bytedance.android.livesdk.container.p503a.AbstractC8211a;
import com.bytedance.android.livesdk.container.p512i.C8252c;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class PageConfig extends HybridConfig {
    private LivePageConfig extraConfig;
    @AbstractC8211a(mo14464a = "hide_nav_bar")
    private boolean hideNavBar;
    @AbstractC8211a(mo14464a = "hide_status_bar")
    private boolean hideStatusBar;
    @AbstractC8211a(mo14464a = "nav_bar_color")
    private HColor navBarColor;
    @AbstractC8211a(mo14464a = "nav_btn_type")
    private String navBtnType;
    @AbstractC8211a(mo14464a = "show_closeall")
    private boolean showCloseAll;
    @AbstractC8211a(mo14464a = "status_bar_bg_color")
    private HColor statusBgColor;
    @AbstractC8211a(mo14464a = "status_font_mode")
    private String statusFontMode;
    @AbstractC8211a(mo14464a = "title")
    private String title;
    @AbstractC8211a(mo14464a = "title_color")
    private HColor titleColor;
    @AbstractC8211a(mo14464a = "trans_status_bar")
    private boolean transStatusBar;

    static {
        Covode.recordClassIndex(9060);
    }

    public PageConfig() {
        this(null, 1, null);
    }

    public final LivePageConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final boolean getHideNavBar() {
        return this.hideNavBar;
    }

    public final boolean getHideStatusBar() {
        return this.hideStatusBar;
    }

    public final HColor getNavBarColor() {
        return this.navBarColor;
    }

    public final String getNavBtnType() {
        return this.navBtnType;
    }

    public final boolean getShowCloseAll() {
        return this.showCloseAll;
    }

    public final HColor getStatusBgColor() {
        return this.statusBgColor;
    }

    public final String getStatusFontMode() {
        return this.statusFontMode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final HColor getTitleColor() {
        return this.titleColor;
    }

    public final boolean getTransStatusBar() {
        return this.transStatusBar;
    }

    public final void setExtraConfig(LivePageConfig livePageConfig) {
        this.extraConfig = livePageConfig;
    }

    public final void setHideNavBar(boolean z) {
        this.hideNavBar = z;
    }

    public final void setHideStatusBar(boolean z) {
        this.hideStatusBar = z;
    }

    public final void setNavBarColor(HColor hColor) {
        this.navBarColor = hColor;
    }

    public final void setNavBtnType(String str) {
        this.navBtnType = str;
    }

    public final void setShowCloseAll(boolean z) {
        this.showCloseAll = z;
    }

    public final void setStatusBgColor(HColor hColor) {
        this.statusBgColor = hColor;
    }

    public final void setStatusFontMode(String str) {
        this.statusFontMode = str;
    }

    public final void setTitleColor(HColor hColor) {
        this.titleColor = hColor;
    }

    public final void setTransStatusBar(boolean z) {
        this.transStatusBar = z;
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        this.title = str;
    }

    public PageConfig(Uri uri) {
        super(uri);
        String a;
        String queryParameter;
        String a2;
        String queryParameter2;
        this.title = "";
        if (uri != null) {
            setOriginUri(uri.toString());
            Class<PageConfig> cls = PageConfig.class;
            while (true) {
                if (cls == null) {
                    break;
                }
                Field[] declaredFields = cls.getDeclaredFields();
                C89219l.m154716b(declaredFields, "");
                for (Field field : declaredFields) {
                    AbstractC8211a aVar = (AbstractC8211a) field.getAnnotation(AbstractC8211a.class);
                    if (!(aVar == null || (queryParameter2 = uri.getQueryParameter((a2 = aVar.mo14464a()))) == null)) {
                        C89219l.m154716b(queryParameter2, "");
                        C89219l.m154716b(field, "");
                        field.setAccessible(true);
                        Class<?> type = field.getType();
                        C89219l.m154716b(type, "");
                        field.set(this, C8252c.m16397a(uri, a2, queryParameter2, type));
                    }
                }
                cls = cls.getSuperclass();
            }
            Class<LivePageConfig> cls2 = LivePageConfig.class;
            LivePageConfig newInstance = cls2.newInstance();
            do {
                Field[] declaredFields2 = cls2.getDeclaredFields();
                C89219l.m154716b(declaredFields2, "");
                for (Field field2 : declaredFields2) {
                    AbstractC8211a aVar2 = (AbstractC8211a) field2.getAnnotation(AbstractC8211a.class);
                    if (!(aVar2 == null || (queryParameter = uri.getQueryParameter((a = aVar2.mo14464a()))) == null)) {
                        C89219l.m154716b(queryParameter, "");
                        C89219l.m154716b(field2, "");
                        field2.setAccessible(true);
                        Class<?> type2 = field2.getType();
                        C89219l.m154716b(type2, "");
                        field2.set(newInstance, C8252c.m16397a(uri, a, queryParameter, type2));
                    }
                }
                cls2 = cls2.getSuperclass();
            } while (cls2 != null);
            this.extraConfig = newInstance;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageConfig(Uri uri, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : uri);
    }
}
