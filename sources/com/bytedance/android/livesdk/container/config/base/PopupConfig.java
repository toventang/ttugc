package com.bytedance.android.livesdk.container.config.base;

import android.net.Uri;
import com.bytedance.android.livesdk.container.config.live.LivePopupConfig;
import com.bytedance.android.livesdk.container.p503a.AbstractC8211a;
import com.bytedance.android.livesdk.container.p507d.C8237b;
import com.bytedance.android.livesdk.container.p512i.C8252c;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class PopupConfig extends HybridConfig {
    @AbstractC8211a(mo14464a = "transition_animation")
    private String animation;
    @AbstractC8211a(mo14464a = "dialog_transition_animation")
    private String dialogAnimation;
    @AbstractC8211a(mo14464a = "disable_mask_click_close")
    private boolean disableMaskClose;
    private LivePopupConfig extraConfig;
    @AbstractC8211a(mo14464a = "gravity")
    private String gravity;
    @AbstractC8211a(mo14464a = "height")
    private int height;
    @AbstractC8211a(mo14464a = "mask_bg_color")
    private HColor maskBgColor;
    @AbstractC8211a(mo14464a = "enable_pull_down_close")
    private boolean pullDownClose;
    @AbstractC8211a(mo14464a = "radius")
    private int radius;
    @AbstractC8211a(mo14464a = "show_mask")
    private boolean showMask;
    @AbstractC8211a(mo14464a = "width")
    private int width;

    static {
        Covode.recordClassIndex(9061);
    }

    public PopupConfig() {
        this(null, 1, null);
    }

    public final String getAnimation() {
        return this.animation;
    }

    public final String getDialogAnimation() {
        return this.dialogAnimation;
    }

    public final boolean getDisableMaskClose() {
        return this.disableMaskClose;
    }

    public final LivePopupConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final String getGravity() {
        return this.gravity;
    }

    public final int getHeight() {
        return this.height;
    }

    public final HColor getMaskBgColor() {
        return this.maskBgColor;
    }

    public final boolean getPullDownClose() {
        return this.pullDownClose;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final boolean getShowMask() {
        return this.showMask;
    }

    public final int getWidth() {
        return this.width;
    }

    private final void adjustValues() {
        if (C89219l.m154714a((Object) this.gravity, (Object) "center")) {
            if (this.width == C8237b.C8238a.C8240b.f20466a) {
                this.width = C8237b.C8238a.C8240b.f20468c;
            }
            if (this.height == C8237b.C8238a.C8240b.f20467b) {
                this.height = C8237b.C8238a.C8240b.f20469d;
            }
        }
    }

    public final void setDisableMaskClose(boolean z) {
        this.disableMaskClose = z;
    }

    public final void setExtraConfig(LivePopupConfig livePopupConfig) {
        this.extraConfig = livePopupConfig;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMaskBgColor(HColor hColor) {
        this.maskBgColor = hColor;
    }

    public final void setPullDownClose(boolean z) {
        this.pullDownClose = z;
    }

    public final void setRadius(int i) {
        this.radius = i;
    }

    public final void setShowMask(boolean z) {
        this.showMask = z;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void setAnimation(String str) {
        C89219l.m154721d(str, "");
        this.animation = str;
    }

    public final void setDialogAnimation(String str) {
        C89219l.m154721d(str, "");
        this.dialogAnimation = str;
    }

    public final void setGravity(String str) {
        C89219l.m154721d(str, "");
        this.gravity = str;
    }

    public PopupConfig(Uri uri) {
        super(uri);
        String a;
        String queryParameter;
        String a2;
        String queryParameter2;
        this.gravity = "bottom";
        this.width = C8237b.C8238a.C8240b.f20466a;
        this.height = C8237b.C8238a.C8240b.f20467b;
        this.radius = C8237b.C8238a.C8239a.f20465a;
        this.animation = "auto";
        this.dialogAnimation = "none";
        if (uri != null) {
            setOriginUri(uri.toString());
            Class<PopupConfig> cls = PopupConfig.class;
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
            Class<LivePopupConfig> cls2 = LivePopupConfig.class;
            LivePopupConfig newInstance = cls2.newInstance();
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
            adjustValues();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PopupConfig(Uri uri, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : uri);
    }
}
