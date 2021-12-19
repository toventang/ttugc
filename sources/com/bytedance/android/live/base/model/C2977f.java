package com.bytedance.android.live.base.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.base.model.f */
public final class C2977f implements AbstractC2724b<ImageModel> {
    static {
        Covode.recordClassIndex(3423);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ ImageModel mo7304a(C2730f fVar) {
        return m8301b(fVar);
    }

    /* renamed from: b */
    public static ImageModel m8301b(C2730f fVar) {
        ImageModel imageModel = new ImageModel();
        imageModel.mUrls = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        imageModel.mUrls.add(fVar.mo7312d());
                        break;
                    case 2:
                        imageModel.mUri = fVar.mo7312d();
                        break;
                    case 3:
                        imageModel.height = (int) C2731g.m7902b(fVar);
                        break;
                    case 4:
                        imageModel.width = (int) C2731g.m7902b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        imageModel.avgColor = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        imageModel.imageType = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        imageModel.schema = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        imageModel.content = C2970e.m8295b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        imageModel.isAnimated = C2731g.m7901a(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return imageModel;
            }
        }
    }
}
