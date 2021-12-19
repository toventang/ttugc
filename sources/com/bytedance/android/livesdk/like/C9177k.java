package com.bytedance.android.livesdk.like;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.livesdk.like.k */
final /* synthetic */ class C9177k implements AbstractC88434g {

    /* renamed from: a */
    private final ImageModel f22351a;

    static {
        Covode.recordClassIndex(10084);
    }

    C9177k(ImageModel imageModel) {
        this.f22351a = imageModel;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        ImageModel imageModel = this.f22351a;
        LikeHelper.C9166c cVar = new LikeHelper.C9166c((byte) 0);
        cVar.f22329c = (Bitmap) obj;
        cVar.f22327a = false;
        cVar.f22328b = imageModel.mUri;
        return cVar;
    }
}
