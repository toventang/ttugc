package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.b */
public final class C72621b {

    /* renamed from: a */
    public static final Map<String, String> f162801a = new LinkedHashMap();

    /* renamed from: b */
    public static final C72621b f162802b = new C72621b();

    private C72621b() {
    }

    static {
        Covode.recordClassIndex(85304);
    }

    /* renamed from: a */
    public static AbstractC63178ak.C63184f m128091a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        AbstractC63178ak.C63184f fVar = new AbstractC63178ak.C63184f();
        String editEffectList = videoPublishEditModel.getEditEffectList();
        C89219l.m154716b(editEffectList, "");
        boolean z = true;
        if (editEffectList.length() != 0 && !TextUtils.isEmpty(videoPublishEditModel.getStickers())) {
            editEffectList = editEffectList + "," + videoPublishEditModel.getStickers();
        }
        if (editEffectList.length() == 0 && (editEffectList = videoPublishEditModel.getStickers()) == null) {
            editEffectList = "";
        }
        fVar.f143523b = editEffectList;
        fVar.f143522a = videoPublishEditModel.musicId;
        fVar.f143524c = "";
        if (TextUtils.isEmpty(videoPublishEditModel.mUploadPath)) {
            videoPublishEditModel.mUploadPath = f162801a.get(videoPublishEditModel.creationId);
        }
        fVar.f143525d = videoPublishEditModel.mUploadPath;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mShootWay", videoPublishEditModel.mShootWay);
        jSONObject.put("mIsFromDraft", videoPublishEditModel.mIsFromDraft);
        jSONObject.put("method", "getFromVideoEditModel");
        fVar.f143526e = jSONObject.toString();
        fVar.f143528g = m128092a(videoPublishEditModel.creationId, "");
        String str = fVar.f143525d;
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        C72619ak.m128090a(z);
        return fVar;
    }

    /* renamed from: a */
    private static String m128092a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        jSONObject.put("creation_id", str);
        jSONObject.put("title", str2);
        String jSONObject2 = jSONObject.toString();
        C89219l.m154716b(jSONObject2, "");
        return jSONObject2;
    }
}
