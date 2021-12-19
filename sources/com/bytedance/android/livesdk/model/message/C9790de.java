package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.de */
public final class C9790de implements AbstractC2724b<FlexImageModel> {
    static {
        Covode.recordClassIndex(11332);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ FlexImageModel mo7304a(C2730f fVar) {
        return m18083b(fVar);
    }

    /* renamed from: b */
    public static FlexImageModel m18083b(C2730f fVar) {
        FlexImageModel flexImageModel = new FlexImageModel();
        flexImageModel.mUrls = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return flexImageModel;
            } else if (b == 1) {
                flexImageModel.mUrls.add(fVar.mo7312d());
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                flexImageModel.mUri = fVar.mo7312d();
            }
        }
    }
}
