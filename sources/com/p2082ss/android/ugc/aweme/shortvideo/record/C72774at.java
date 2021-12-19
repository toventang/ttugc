package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.context.AbstractC31039g;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.at */
public final class C72774at implements AbstractC31039g {

    /* renamed from: a */
    public boolean f163163a;

    /* renamed from: b */
    private String f163164b;

    /* renamed from: c */
    private String f163165c;

    static {
        Covode.recordClassIndex(85460);
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
    /* renamed from: c */
    public final float mo56214c() {
        return 0.66f;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
    /* renamed from: e */
    public final int mo56216e() {
        return R.array.ak;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
    /* renamed from: f */
    public final int mo56217f() {
        return R.array.aj;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
    /* renamed from: g */
    public final int mo56218g() {
        return R.drawable.bbj;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
    /* renamed from: a */
    public final String mo56212a() {
        return this.f163164b;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
    /* renamed from: b */
    public final String mo56213b() {
        return this.f163165c;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
    /* renamed from: d */
    public final boolean mo56215d() {
        return this.f163163a;
    }

    public C72774at(CameraComponentModel cameraComponentModel) {
        String str;
        boolean z;
        String str2;
        String str3 = "";
        C89219l.m154721d(cameraComponentModel, str3);
        ReactionParams reactionParams = cameraComponentModel.f155660p.f155723a;
        this.f163164b = (reactionParams == null || (str = reactionParams.wavPath) == null) ? str3 : str;
        ReactionParams reactionParams2 = cameraComponentModel.f155660p.f155723a;
        if (!(reactionParams2 == null || (str2 = reactionParams2.videoPath) == null)) {
            str3 = str2;
        }
        this.f163165c = str3;
        ReactionParams reactionParams3 = cameraComponentModel.f155660p.f155723a;
        if (reactionParams3 != null) {
            z = reactionParams3.nonReacted;
        } else {
            z = false;
        }
        this.f163163a = !z;
    }
}
