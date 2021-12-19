package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.List;

/* renamed from: dmt.av.video.q */
public final class C88293q {
    static {
        Covode.recordClassIndex(104328);
    }

    /* renamed from: a */
    public static void m153433a(List<EffectPointModel> list, C88271g<C88292p> gVar) {
        for (int i = 0; i < list.size(); i++) {
            EffectPointModel effectPointModel = list.get(i);
            if (effectPointModel.getType() != 2) {
                C88292p b = C88292p.m153431b(effectPointModel.getResDir(), (long) effectPointModel.getStartPoint());
                b.f200339e = (long) effectPointModel.getUiStartPoint();
                b.f200340f = (long) effectPointModel.getUiEndPoint();
                b.f200343i = effectPointModel.getSelectedColor();
                b.f200345k = effectPointModel.getKey();
                b.f200342h = effectPointModel.isFromEnd();
                b.f200348n = effectPointModel.getCategory();
                b.f200347m = effectPointModel.getDuration();
                b.f200349o = effectPointModel.getExtra();
                gVar.setValue(b);
                C88292p a = C88292p.m153426a((long) effectPointModel.getEndPoint());
                a.f200339e = (long) effectPointModel.getUiStartPoint();
                a.f200340f = (long) effectPointModel.getUiEndPoint();
                a.f200342h = effectPointModel.isFromEnd();
                gVar.setValue(a);
            }
        }
    }
}
