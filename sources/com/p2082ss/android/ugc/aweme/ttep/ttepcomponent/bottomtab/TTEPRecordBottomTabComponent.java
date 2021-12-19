package com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.bottomtab;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83442i;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.bottomtab.TTEPRecordBottomTabComponent */
public final class TTEPRecordBottomTabComponent extends C83442i implements AbstractC83406b {
    static {
        Covode.recordClassIndex(92513);
    }

    @Override // com.bytedance.als.AbstractC2562j, com.p2082ss.android.ugc.gamora.recorder.p4294b.C83442i
    public final void onCreate() {
        super.onCreate();
        showBottomTab(false);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b, com.p2082ss.android.ugc.gamora.recorder.p4294b.C83442i
    public final void showBottomTab(boolean z) {
        super.showBottomTab(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTEPRecordBottomTabComponent(AbstractC22186b bVar, C21582f fVar, List<? extends AbstractC83405a> list) {
        super(bVar, fVar, list);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(list, "");
    }
}
