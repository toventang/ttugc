package com.bytedance.android.livesdk.container.config.base;

import android.net.Uri;
import com.bytedance.android.livesdk.container.p503a.AbstractC8211a;
import com.bytedance.android.livesdk.container.p507d.EnumC8236a;
import com.bytedance.android.livesdk.container.p512i.C8250a;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public abstract class HybridConfig implements Serializable {
    @AbstractC8211a(mo14464a = "container_bg_color")
    private HColor containerBgColor;
    @AbstractC8211a(mo14464a = "disable_back_press")
    private boolean disableBackPress;
    @AbstractC8211a(mo14464a = "disable_builtin")
    private boolean disableBuiltin;
    @AbstractC8211a(mo14464a = "disable_offline")
    private boolean disableOffline;
    @AbstractC8211a(mo14464a = "enable_canvas")
    private boolean enableCanvas;
    private EnumC8236a engineType;
    @AbstractC8211a(mo14464a = "fallback_url")
    private String fallbackUrl;
    @AbstractC8211a(mo14464a = "hide_loading")
    private boolean hideLoading;
    @AbstractC8211a(mo14464a = "initial_data")
    private String initialData;
    @AbstractC8211a(mo14464a = "loading_bg_color")
    private HColor loadingBgColor;
    private String originUri;
    @AbstractC8211a(mo14464a = "url")
    private String url;

    static {
        Covode.recordClassIndex(9059);
    }

    public HybridConfig() {
        this(null, 1, null);
    }

    public final HColor getContainerBgColor() {
        return this.containerBgColor;
    }

    public final boolean getDisableBackPress() {
        return this.disableBackPress;
    }

    public final boolean getDisableBuiltin() {
        return this.disableBuiltin;
    }

    public final boolean getDisableOffline() {
        return this.disableOffline;
    }

    public final boolean getEnableCanvas() {
        return this.enableCanvas;
    }

    public final EnumC8236a getEngineType() {
        return this.engineType;
    }

    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final boolean getHideLoading() {
        return this.hideLoading;
    }

    public final String getInitialData() {
        return this.initialData;
    }

    public final HColor getLoadingBgColor() {
        return this.loadingBgColor;
    }

    public final String getOriginUri() {
        return this.originUri;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setContainerBgColor(HColor hColor) {
        this.containerBgColor = hColor;
    }

    public final void setDisableBackPress(boolean z) {
        this.disableBackPress = z;
    }

    public final void setDisableBuiltin(boolean z) {
        this.disableBuiltin = z;
    }

    public final void setDisableOffline(boolean z) {
        this.disableOffline = z;
    }

    public final void setEnableCanvas(boolean z) {
        this.enableCanvas = z;
    }

    public final void setHideLoading(boolean z) {
        this.hideLoading = z;
    }

    public final void setLoadingBgColor(HColor hColor) {
        this.loadingBgColor = hColor;
    }

    public final void setOriginUri(String str) {
        this.originUri = str;
    }

    public final void setEngineType(EnumC8236a aVar) {
        C89219l.m154721d(aVar, "");
        this.engineType = aVar;
    }

    public final void setFallbackUrl(String str) {
        C89219l.m154721d(str, "");
        this.fallbackUrl = str;
    }

    public final void setInitialData(String str) {
        C89219l.m154721d(str, "");
        this.initialData = str;
    }

    public final void setUrl(String str) {
        C89219l.m154721d(str, "");
        this.url = str;
    }

    public HybridConfig(Uri uri) {
        EnumC8236a aVar;
        this.engineType = EnumC8236a.WEB_VIEW;
        this.url = "";
        this.fallbackUrl = "";
        this.initialData = "";
        if (uri != null) {
            this.originUri = uri.toString();
            if (C8250a.f20476a.contains(uri.getHost())) {
                aVar = EnumC8236a.LYNX;
            } else {
                aVar = EnumC8236a.WEB_VIEW;
            }
            this.engineType = aVar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HybridConfig(Uri uri, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : uri);
    }
}
