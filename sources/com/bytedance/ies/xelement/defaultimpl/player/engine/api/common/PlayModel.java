package com.bytedance.ies.xelement.defaultimpl.player.engine.api.common;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4417j.C86537q;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class PlayModel {
    @AbstractC27891c(mo46611a = StringSet.type)
    private final String encryptType;
    @AbstractC27891c(mo46611a = "quality")
    private final String quality;
    @AbstractC27891c(mo46611a = "video_model")
    private final C28022o videoModelJsonObj;

    static {
        Covode.recordClassIndex(21955);
    }

    public PlayModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PlayModel copy$default(PlayModel playModel, String str, String str2, C28022o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playModel.quality;
        }
        if ((i & 2) != 0) {
            str2 = playModel.encryptType;
        }
        if ((i & 4) != 0) {
            oVar = playModel.videoModelJsonObj;
        }
        return playModel.copy(str, str2, oVar);
    }

    public final String component1() {
        return this.quality;
    }

    public final String component2() {
        return this.encryptType;
    }

    public final C28022o component3() {
        return this.videoModelJsonObj;
    }

    public final PlayModel copy(String str, String str2, C28022o oVar) {
        return new PlayModel(str, str2, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayModel)) {
            return false;
        }
        PlayModel playModel = (PlayModel) obj;
        return C89219l.m154714a(this.quality, playModel.quality) && C89219l.m154714a(this.encryptType, playModel.encryptType) && C89219l.m154714a(this.videoModelJsonObj, playModel.videoModelJsonObj);
    }

    public final int hashCode() {
        String str = this.quality;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.encryptType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C28022o oVar = this.videoModelJsonObj;
        if (oVar != null) {
            i = oVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "PlayModel(quality=" + this.quality + ", encryptType=" + this.encryptType + ", videoModelJsonObj=" + this.videoModelJsonObj + ")";
    }

    public final String getEncryptType() {
        return this.encryptType;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final C28022o getVideoModelJsonObj() {
        return this.videoModelJsonObj;
    }

    public final C86535p getVideoModel() {
        C28022o oVar = this.videoModelJsonObj;
        if (oVar != null) {
            return makeVideoModel(oVar);
        }
        return null;
    }

    public final EnumC86649v getResolution() {
        String str = this.quality;
        if (C89219l.m154714a((Object) str, (Object) EnumC19195d.EXCELLENT.getDesc())) {
            return EnumC86649v.SuperHigh;
        }
        if (C89219l.m154714a((Object) str, (Object) EnumC19195d.GOOD.getDesc())) {
            return EnumC86649v.H_High;
        }
        C89219l.m154714a((Object) str, (Object) EnumC19195d.REGULAR.getDesc());
        return EnumC86649v.Standard;
    }

    private final boolean isValid(C86537q qVar) {
        if (qVar.f194933v == 10) {
            return true;
        }
        return false;
    }

    private final C86535p makeVideoModel(C28022o oVar) {
        try {
            C86535p pVar = new C86535p();
            C86537q qVar = new C86537q();
            qVar.mo137796a(new JSONObject(oVar.toString()));
            if (!isValid(qVar)) {
                return null;
            }
            pVar.mo137788a(qVar);
            return pVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public PlayModel(String str, String str2, C28022o oVar) {
        this.quality = str;
        this.encryptType = str2;
        this.videoModelJsonObj = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayModel(String str, String str2, C28022o oVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : oVar);
    }
}
