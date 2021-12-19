package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ChooseLogAdExtraData */
public final class ChooseLogAdExtraData implements AbstractC81914b {
    private final JSONObject adExtraData;

    static {
        Covode.recordClassIndex(45693);
    }

    public static /* synthetic */ ChooseLogAdExtraData copy$default(ChooseLogAdExtraData chooseLogAdExtraData, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = chooseLogAdExtraData.adExtraData;
        }
        return chooseLogAdExtraData.copy(jSONObject);
    }

    public final JSONObject component1() {
        return this.adExtraData;
    }

    public final ChooseLogAdExtraData copy(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        return new ChooseLogAdExtraData(jSONObject);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ChooseLogAdExtraData) && C89219l.m154714a(this.adExtraData, ((ChooseLogAdExtraData) obj).adExtraData);
        }
        return true;
    }

    public final int hashCode() {
        JSONObject jSONObject = this.adExtraData;
        if (jSONObject != null) {
            return jSONObject.hashCode();
        }
        return 0;
    }

    public final AbstractC81914b post() {
        return AbstractC81915c.m141874a(this);
    }

    public final AbstractC81914b postSticky() {
        return AbstractC81915c.m141875b(this);
    }

    public final String toString() {
        return "ChooseLogAdExtraData(adExtraData=" + this.adExtraData + ")";
    }

    public final JSONObject getAdExtraData() {
        return this.adExtraData;
    }

    public ChooseLogAdExtraData(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        this.adExtraData = jSONObject;
    }
}
