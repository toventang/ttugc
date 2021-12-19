package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.EffectModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp */
public class VEEffectSelectOp {
    public int action;
    public EffectModel mEffectModel;
    public EffectPointModel mPreviousModel;
    public int mTimePosition;
    public final int mType;

    static {
        Covode.recordClassIndex(84628);
    }

    private VEEffectSelectOp(int i) {
        this.mType = i;
    }

    public static VEEffectSelectOp selectTime(int i) {
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(1);
        vEEffectSelectOp.mTimePosition = i;
        return vEEffectSelectOp;
    }

    public static VEEffectSelectOp selectTrans(EffectModel effectModel) {
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(2);
        vEEffectSelectOp.mEffectModel = effectModel;
        return vEEffectSelectOp;
    }

    public static VEEffectSelectOp selectFilter(int i, EffectModel effectModel) {
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(3);
        vEEffectSelectOp.mEffectModel = effectModel;
        vEEffectSelectOp.action = i;
        return vEEffectSelectOp;
    }

    public static VEEffectSelectOp selectSticker(EffectModel effectModel, EffectPointModel effectPointModel) {
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(4);
        vEEffectSelectOp.mEffectModel = effectModel;
        vEEffectSelectOp.mPreviousModel = effectPointModel;
        return vEEffectSelectOp;
    }
}
