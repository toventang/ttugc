package com.p2082ss.android.ugc.aweme.shortvideo.p3797c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.shoutout.AVAnchorPublishStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73939ad;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c.a */
public final class C69906a {

    /* renamed from: a */
    public static final C69906a f156212a = new C69906a();

    private C69906a() {
    }

    static {
        Covode.recordClassIndex(82315);
    }

    /* renamed from: a */
    public static List<CreateAnchorInfo> m123469a(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        AVAnchorPublishStruct b;
        boolean z2;
        boolean z3;
        C89219l.m154721d(videoPublishEditModel, "");
        ArrayList arrayList = new ArrayList();
        if (PrivacyServiceImpl.m103033c().mo93976b()) {
            return arrayList;
        }
        String stickers = videoPublishEditModel.getStickers();
        if (stickers == null || stickers.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String propSource = videoPublishEditModel.getPropSource();
            if (propSource == null || propSource.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                C73939ad.C73940a.m130035a(arrayList, videoPublishEditModel);
            }
        }
        if (!videoPublishEditModel.isPhotoMvMode) {
            String b2 = C80342dg.m139300a().mo46674b(videoPublishEditModel.uploadMiscInfoStruct);
            if (b2 == null || b2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                try {
                    C71872i iVar = videoPublishEditModel.uploadMiscInfoStruct;
                    C89219l.m154716b(iVar, "");
                    C73939ad.C73940a.m130036a(arrayList, iVar);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (videoPublishEditModel.getMainBusinessContext() != null) {
            arrayList.addAll(C46110t.m88974j(C71073b.m125566a(videoPublishEditModel.getMainBusinessContext(), EnumC71088d.TRACK_PAGE_EDIT)));
        }
        if (videoPublishEditModel.getMainBusinessContext() != null) {
            arrayList.addAll(C46110t.m88975k(C71073b.m125566a(videoPublishEditModel.getMainBusinessContext(), EnumC71088d.TRACK_PAGE_EDIT)));
        }
        if (!videoPublishEditModel.mIsFromDraft && videoPublishEditModel.mShoutOutsData != null && C89361p.m154872a(videoPublishEditModel.mShoutOutsData.getShoutOutsMode(), C74418d.MODE_POST, false) && (b = C63238c.f143593t.mo93794b()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("third_id", videoPublishEditModel.mShoutOutsData.getProductId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            String keyword = b.getKeyword();
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, "");
            arrayList.add(new CreateAnchorInfo(40, keyword, "", "", jSONObject2, b.getImg(), -1L, null, null, null, null, null, 3968, null));
        }
        AbstractC63199ax axVar = C63238c.f143591r;
        C89219l.m154716b(axVar, "");
        List<AbstractC72627e> b3 = axVar.mo93938b();
        C89219l.m154716b(b3, "");
        for (AbstractC72627e eVar : b3) {
            eVar.mo65459a(videoPublishEditModel, arrayList);
        }
        return arrayList;
    }
}
