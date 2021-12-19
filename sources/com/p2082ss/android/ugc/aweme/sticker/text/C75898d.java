package com.p2082ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46106q;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.TextStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.text.d */
public final class C75898d {
    static {
        Covode.recordClassIndex(88838);
    }

    /* renamed from: a */
    public static final boolean m133086a(BaseShortVideoContext baseShortVideoContext) {
        C46106q b = m133087b(baseShortVideoContext);
        if (b != null) {
            return b.mo78293a();
        }
        return false;
    }

    /* renamed from: b */
    private static C46106q m133087b(BaseShortVideoContext baseShortVideoContext) {
        String str;
        if (baseShortVideoContext == null || (str = baseShortVideoContext.commerceData) == null || str.length() == 0) {
            return null;
        }
        try {
            return (C46106q) C63244g.m114602a().mo73261G().mo46670a(baseShortVideoContext.commerceData, C46106q.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m133088b(VideoPublishEditModel videoPublishEditModel) {
        List<CreateAnchorInfo> anchors;
        C89219l.m154721d(videoPublishEditModel, "");
        List<InteractStickerStruct> a = C71073b.m125566a(videoPublishEditModel.getMainBusinessContext(), EnumC71088d.TRACK_PAGE_EDIT);
        if (a == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : a) {
            T t2 = t;
            C89219l.m154716b(t2, "");
            if (t2.getType() == 5) {
                arrayList.add(t);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) next;
            try {
                C27910f G = C63244g.m114602a().mo73261G();
                C89219l.m154716b(interactStickerStruct, "");
                TextStruct textStruct = (TextStruct) G.mo46670a(interactStickerStruct.getTextStruct(), TextStruct.class);
                if (!(textStruct == null || (anchors = textStruct.getAnchors()) == null || anchors.isEmpty())) {
                    if (next != null) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final List<TextStickerTextWrap> m133085a(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        TextStickerData textStickerData;
        boolean z;
        if (videoPublishEditModel == null) {
            return new ArrayList();
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (!(infoStickerModel == null || (list = infoStickerModel.stickers) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.type == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(t);
                }
            }
            ArrayList<StickerItemModel> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
            for (StickerItemModel stickerItemModel : arrayList2) {
                try {
                    textStickerData = (TextStickerData) C63244g.m114602a().mo73261G().mo46670a(stickerItemModel.extra, TextStickerData.class);
                } catch (Exception unused) {
                    textStickerData = null;
                }
                arrayList3.add(textStickerData);
            }
            List<TextStickerData> f = C89070n.m154580f((Iterable) arrayList3);
            if (f != null) {
                ArrayList arrayList4 = new ArrayList();
                for (TextStickerData textStickerData2 : f) {
                    C89070n.m154535a((Collection) arrayList4, (Iterable) textStickerData2.getTextWrapList());
                }
                return arrayList4;
            }
        }
        return new ArrayList();
    }
}
