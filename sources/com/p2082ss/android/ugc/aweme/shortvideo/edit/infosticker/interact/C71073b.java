package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import androidx.core.p036g.C0692e;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b */
public final class C71073b {
    static {
        Covode.recordClassIndex(83572);
    }

    /* renamed from: a */
    public static boolean m125568a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            if (!C13603b.m24435a((Collection) m125570b(videoPublishEditModel.getMainBusinessContext(), EnumC71088d.TRACK_PAGE_RECORD))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static List<InteractStickerStruct> m125566a(C71164e eVar, EnumC71088d... dVarArr) {
        C71085c d = m125573d(eVar);
        if (d == null || d.isEmpty(dVarArr)) {
            return null;
        }
        List<InteractStickerStruct> stickerStructsByPage = d.getStickerStructsByPage(dVarArr);
        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
            if (interactStickerStruct.getPollStruct() != null) {
                PollStruct pollStruct = interactStickerStruct.getPollStruct();
                if (!C13603b.m24435a((Collection) pollStruct.getOptions()) && pollStruct.getOptions().size() >= 2) {
                    if (C13627m.m24498a(pollStruct.getOptions().get(0).getPostOption())) {
                        pollStruct.getOptions().get(0).setPostOption(C63247i.f143610a.getString(R.string.haa));
                    }
                    if (C13627m.m24498a(pollStruct.getOptions().get(1).getPostOption())) {
                        pollStruct.getOptions().get(1).setPostOption(C63247i.f143610a.getString(R.string.hab));
                    }
                }
            }
        }
        return stickerStructsByPage;
    }

    /* renamed from: a */
    public static void m125567a(AbstractC31071f fVar, C71164e eVar) {
        if (eVar != null) {
            HashMap hashMap = new HashMap();
            List<InteractStickerStruct> a = m125566a(eVar, EnumC71088d.TRACK_PAGE_RECORD);
            if (!C13603b.m24435a((Collection) a)) {
                hashMap.put("interaction_stickers", C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(a));
                C63244g.m114602a().mo73298z().mo93821a(true);
            } else {
                C63244g.m114602a().mo73298z().mo93821a(false);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("com.bytedance.info", C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(hashMap));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            fVar.mo56288a("com.android.information", jSONObject.toString());
        }
    }

    /* renamed from: d */
    private static C71085c m125573d(C71164e eVar) {
        if (eVar != null) {
            return eVar.mInteractStickerContext;
        }
        return null;
    }

    /* renamed from: a */
    public static C71085c m125558a(String str) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        try {
            return ((C71164e) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46670a(str, C71164e.class)).mInteractStickerContext;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static NormalTrackTimeStamp m125560a(InteractStickerStruct interactStickerStruct) {
        List list;
        try {
            list = (List) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46671a(interactStickerStruct.getTrackList(), new C27895a<List<NormalTrackTimeStamp>>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b.C710752 */

                static {
                    Covode.recordClassIndex(83574);
                }
            }.type);
        } catch (Exception unused) {
            list = null;
        }
        if (C13603b.m24435a((Collection) list)) {
            return null;
        }
        return (NormalTrackTimeStamp) list.get(0);
    }

    /* renamed from: b */
    public static void m125571b(VideoPublishEditModel videoPublishEditModel) {
        C71085c d;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null && (d = m125573d(videoPublishEditModel.getMainBusinessContext())) != null && d.removeStickerStructByPage(EnumC71088d.TRACK_PAGE_EDIT, 16)) {
            videoPublishEditModel.changeStickerStruct = true;
            videoPublishEditModel.onlyUpdateSuperMainBusinessData(videoPublishEditModel.getMainBusinessContext());
        }
    }

    /* renamed from: a */
    public static DuetStickerStruct m125559a(C71164e eVar) {
        C71085c d;
        List<InteractStickerStruct> stickerStructsByPage;
        if (!(eVar == null || (d = m125573d(eVar)) == null || (stickerStructsByPage = d.getStickerStructsByPage(EnumC71088d.TRACK_PAGE_EDIT)) == null || stickerStructsByPage.isEmpty())) {
            for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
                if (interactStickerStruct.getType() == 16 && interactStickerStruct.getDuetStickerStruct() != null) {
                    return interactStickerStruct.getDuetStickerStruct();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static QaStruct m125569b(C71164e eVar) {
        C71085c d;
        List<InteractStickerStruct> stickerStructsByPage;
        if (!(eVar == null || (d = m125573d(eVar)) == null || (stickerStructsByPage = d.getStickerStructsByPage(EnumC71088d.TRACK_PAGE_EDIT)) == null || stickerStructsByPage.isEmpty())) {
            for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
                if (interactStickerStruct.getType() == 17 && interactStickerStruct.getQaStruct() != null) {
                    return interactStickerStruct.getQaStruct();
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C0692e<String, String> m125572c(C71164e eVar) {
        String str;
        String str2;
        Exception e;
        List<InteractStickerStruct> a = m125565a(eVar, 1, EnumC71088d.TRACK_PAGE_EDIT);
        String str3 = "";
        if (a == null || a.isEmpty() || C13627m.m24498a(a.get(0).getAttr())) {
            return new C0692e<>(str3, str3);
        }
        try {
            HashMap hashMap = (HashMap) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46671a(a.get(0).getAttr(), new C27895a<HashMap<String, String>>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b.C710741 */

                static {
                    Covode.recordClassIndex(83573);
                }
            }.type);
            if (hashMap != null) {
                if (hashMap.containsKey("poll_sticker_id")) {
                    str2 = (String) hashMap.get("poll_sticker_id");
                } else {
                    str2 = str3;
                }
                try {
                    if (hashMap.containsKey("poll_sticker_tab_id")) {
                        str = (String) hashMap.get("poll_sticker_tab_id");
                        str3 = str2;
                        return new C0692e<>(str3, str);
                    }
                } catch (Exception e2) {
                    e = e2;
                    C63244g.m114602a().mo73263I().mo101637a((Throwable) e);
                    str = str3;
                    str3 = str2;
                    return new C0692e<>(str3, str);
                }
                str = str3;
                str3 = str2;
                return new C0692e<>(str3, str);
            }
            str = str3;
            return new C0692e<>(str3, str);
        } catch (Exception e3) {
            e = e3;
            str2 = str3;
            C63244g.m114602a().mo73263I().mo101637a((Throwable) e);
            str = str3;
            str3 = str2;
            return new C0692e<>(str3, str);
        }
    }

    /* renamed from: b */
    private static List<InteractStickerStruct> m125570b(C71164e eVar, EnumC71088d... dVarArr) {
        LinkedList linkedList = new LinkedList();
        C71085c d = m125573d(eVar);
        if (d == null || d.isEmpty(dVarArr)) {
            return null;
        }
        linkedList.addAll(d.getStickerStructsByPage(dVarArr));
        return linkedList;
    }

    /* renamed from: a */
    public static Collection<InteractStickerStruct> m125563a(BaseShortVideoContext baseShortVideoContext, EnumC71088d... dVarArr) {
        C71085c a;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            a = m125573d(((VideoPublishEditModel) baseShortVideoContext).getMainBusinessContext());
        } else {
            a = m125558a(baseShortVideoContext.getMainBusinessData());
        }
        if (a == null || a.isEmpty(dVarArr)) {
            return null;
        }
        List<InteractStickerStruct> stickerStructsByPage = a.getStickerStructsByPage(dVarArr);
        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
            if (interactStickerStruct.getPollStruct() != null) {
                PollStruct pollStruct = interactStickerStruct.getPollStruct();
                if (!C13603b.m24435a((Collection) pollStruct.getOptions()) && pollStruct.getOptions().size() >= 2) {
                    if (C13627m.m24498a(pollStruct.getOptions().get(0).getPostOption())) {
                        pollStruct.getOptions().get(0).setPostOption(C63247i.f143610a.getString(R.string.haa));
                    }
                    if (C13627m.m24498a(pollStruct.getOptions().get(1).getPostOption())) {
                        pollStruct.getOptions().get(1).setPostOption(C63247i.f143610a.getString(R.string.hab));
                    }
                }
            }
        }
        return stickerStructsByPage;
    }

    /* renamed from: a */
    public static String m125561a(C71164e eVar, List<InteractStickerStruct> list, EnumC71088d dVar) {
        C71085c cVar;
        if (eVar == null) {
            eVar = new C71164e();
        }
        if (eVar.mInteractStickerContext == null) {
            cVar = new C71085c();
        } else {
            cVar = eVar.mInteractStickerContext;
        }
        cVar.upDateStickerStructs(list, dVar);
        eVar.setInteractStickerContext(cVar);
        return C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(eVar);
    }

    /* renamed from: a */
    public static List<InteractStickerStruct> m125564a(BaseShortVideoContext baseShortVideoContext, int i, EnumC71088d dVar) {
        C71085c a;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            a = m125573d(((VideoPublishEditModel) baseShortVideoContext).getMainBusinessContext());
        } else {
            a = m125558a(baseShortVideoContext.getMainBusinessData());
        }
        if (a == null) {
            return null;
        }
        return a.getTrackByType(Integer.valueOf(i), dVar);
    }

    /* renamed from: a */
    public static List<InteractStickerStruct> m125565a(C71164e eVar, int i, EnumC71088d dVar) {
        C71085c d = m125573d(eVar);
        if (d == null) {
            return null;
        }
        return d.getTrackByType(Integer.valueOf(i), dVar);
    }

    /* renamed from: a */
    public static String m125562a(String str, List<InteractStickerStruct> list, EnumC71088d dVar, boolean z) {
        C71164e eVar;
        C71085c cVar;
        if (C13627m.m24498a(str)) {
            eVar = new C71164e();
        } else {
            try {
                eVar = (C71164e) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46670a(str, C71164e.class);
            } catch (Exception unused) {
                eVar = new C71164e();
            }
        }
        if (eVar.mInteractStickerContext == null) {
            cVar = new C71085c();
        } else {
            cVar = eVar.mInteractStickerContext;
        }
        cVar.upDateStickerStructs(list, dVar);
        eVar.setInteractStickerContext(cVar);
        eVar.interactStickerCheckEffectSdk = z;
        return C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(eVar);
    }
}
