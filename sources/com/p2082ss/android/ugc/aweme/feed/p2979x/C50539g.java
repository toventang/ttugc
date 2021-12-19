package com.p2082ss.android.ugc.aweme.feed.p2979x;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.KtfInfo;
import com.p2082ss.android.ugc.aweme.feed.model.VPAInfo;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88438k;

/* renamed from: com.ss.android.ugc.aweme.feed.x.g */
public final class C50539g {
    static {
        Covode.recordClassIndex(59686);
    }

    /* renamed from: a */
    public static boolean m94743a(AbstractC48149ai aiVar) {
        if (aiVar == null || !C50536e.m94741a(aiVar.mo80206b())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Aweme m94745b(AbstractC48149ai aiVar) {
        if (aiVar == null) {
            return null;
        }
        return aiVar.mo80206b();
    }

    /* renamed from: e */
    public static boolean m94752e(AbstractC48149ai aiVar) {
        if (aiVar == null || aiVar.mo80225p().mo80228s() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m94746b(Aweme aweme) {
        KtfInfo ktfInfo;
        if (aweme == null || (ktfInfo = aweme.getUploadMiscInfoStruct().ktfInfo) == null || !ktfInfo.getShowWarning()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m94748c(AbstractC48149ai aiVar) {
        if (aiVar == null || aiVar.mo80206b() == null || !aiVar.mo80206b().isAd()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m94749d(AbstractC48149ai aiVar) {
        if (aiVar == null || aiVar.mo80206b() == null || aiVar.mo80206b().getAwemeType() != 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m94744a(Aweme aweme) {
        C71872i uploadMiscInfoStruct;
        VPAInfo vPAInfo;
        if (aweme == null || (uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct()) == null || (vPAInfo = uploadMiscInfoStruct.vpaInfo) == null || vPAInfo.getInfoBarType() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m94747c(Aweme aweme) {
        List<AwemeLabelModel> videoLabels = aweme.getVideoLabels();
        if (!C13603b.m24435a((Collection) videoLabels)) {
            for (int i = 0; i < videoLabels.size(); i++) {
                AwemeLabelModel awemeLabelModel = videoLabels.get(i);
                if (awemeLabelModel != null && awemeLabelModel.getLabelType() == 1 && !C50545m.m94762a(aweme) && aweme.getStatus() != null && aweme.isPrivate()) {
                    videoLabels.remove(awemeLabelModel);
                }
            }
        }
    }

    /* renamed from: e */
    public static C75309d m94751e(Aweme aweme) {
        if (!(aweme == null || aweme.getInteractStickerStructs() == null || aweme.getInteractStickerStructs().size() <= 0)) {
            for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
                if (interactStickerStruct.getCaptionStruct() != null) {
                    return interactStickerStruct.getCaptionStruct();
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m94750d(Aweme aweme) {
        if (!(aweme == null || aweme.getInteractStickerStructs() == null || aweme.getInteractStickerStructs().size() <= 0)) {
            for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
                if (interactStickerStruct.getCaptionStruct() != null && !C13603b.m24435a((Collection) interactStickerStruct.getCaptionStruct().getAutoCaptions())) {
                    if (interactStickerStruct.getCaptionStruct().getDisable() == 0) {
                        return true;
                    }
                    if (interactStickerStruct.getCaptionStruct().getDisable() > 0 && !C50532ah.m94725a(aweme)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m94742a(C33942b bVar, AbstractC88438k<Aweme> kVar) {
        if (bVar == null || !(bVar.mo60212a() instanceof VideoItemParams)) {
            return true;
        }
        Aweme aweme = ((VideoItemParams) bVar.mo60212a()).mAweme;
        if (aweme == null) {
            return false;
        }
        try {
            if (kVar.mo7718a(aweme)) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
