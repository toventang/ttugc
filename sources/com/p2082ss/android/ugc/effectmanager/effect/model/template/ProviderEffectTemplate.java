package com.p2082ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate */
public class ProviderEffectTemplate extends ProviderEffect {
    private String clickUrl;
    private final transient ProviderEffect kProviderEffect;
    private ProviderEffect.StickerBean thumbnailSticker;

    static {
        Covode.recordClassIndex(95635);
    }

    public ProviderEffectTemplate() {
        this(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate$StickerBeanTemplate */
    public static class StickerBeanTemplate extends ProviderEffect.StickerBean {
        private final transient ProviderEffect.StickerBean kStickerBean;

        static {
            Covode.recordClassIndex(95636);
        }

        public StickerBeanTemplate() {
            this(null, 1, null);
        }

        public ProviderEffect.StickerBean getKStickerBean() {
            return this.kStickerBean;
        }

        public StickerBeanTemplate(ProviderEffect.StickerBean stickerBean) {
            super(null, null, null, null, 15, null);
            this.kStickerBean = stickerBean;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StickerBeanTemplate(ProviderEffect.StickerBean stickerBean, int i, C89214g gVar) {
            this((i & 1) != 0 ? null : stickerBean);
        }
    }

    public com.p2082ss.ugc.effectplatform.model.ProviderEffect getKProviderEffect() {
        return this.kProviderEffect;
    }

    public String getClickUrl() {
        String click_url;
        com.p2082ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (click_url = kProviderEffect2.getClick_url()) == null) {
            return super.getClick_url();
        }
        return click_url;
    }

    public ProviderEffect.StickerBean getSticker() {
        ProviderEffect.StickerBean stickerBean;
        com.p2082ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (stickerBean = kProviderEffect2.getSticker_info()) == null) {
            stickerBean = super.getSticker_info();
        }
        return new ProviderEffect.StickerBean(stickerBean);
    }

    public ProviderEffect.StickerBean getThumbnailSticker() {
        ProviderEffect.StickerBean stickerBean;
        com.p2082ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (stickerBean = kProviderEffect2.getThumbnail_sticker()) == null) {
            stickerBean = super.getThumbnail_sticker();
        }
        return new ProviderEffect.StickerBean(stickerBean);
    }

    public void setClickUrl(String str) {
        this.clickUrl = str;
        com.p2082ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setClick_url(str);
        }
        super.setClick_url(str);
    }

    public void setSticker(ProviderEffect.StickerBean stickerBean) {
        com.p2082ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSticker_info(stickerBean);
        }
        super.setSticker_info(stickerBean);
    }

    public void setThumbnailSticker(ProviderEffect.StickerBean stickerBean) {
        this.thumbnailSticker = stickerBean;
        com.p2082ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setThumbnail_sticker(stickerBean);
        }
        super.setThumbnail_sticker(stickerBean);
    }

    public ProviderEffectTemplate(com.p2082ss.ugc.effectplatform.model.ProviderEffect providerEffect) {
        super(null, null, null, null, null, null, null, null, 255, null);
        this.kProviderEffect = providerEffect;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectTemplate(com.p2082ss.ugc.effectplatform.model.ProviderEffect providerEffect, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : providerEffect);
    }
}
