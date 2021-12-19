package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.base.model.e */
public final class C2970e implements AbstractC2724b<ImageModel.Content> {
    static {
        Covode.recordClassIndex(3415);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ ImageModel.Content mo7304a(C2730f fVar) {
        return m8295b(fVar);
    }

    /* renamed from: b */
    public static ImageModel.Content m8295b(C2730f fVar) {
        ImageModel.Content content = new ImageModel.Content();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return content;
            } else if (b == 1) {
                content.f8700a = fVar.mo7312d();
            } else if (b == 2) {
                content.f8701b = fVar.mo7312d();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                content.f8702c = fVar.mo7314f();
            }
        }
    }
}
