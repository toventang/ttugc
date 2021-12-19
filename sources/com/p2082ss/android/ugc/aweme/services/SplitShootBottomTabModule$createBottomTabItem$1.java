package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.C14197p;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83409d;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a;
import com.p2082ss.android.ugc.gamora.recorder.permission.PermissionStateViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.SplitShootBottomTabModule$createBottomTabItem$1 */
public final class SplitShootBottomTabModule$createBottomTabItem$1 implements AbstractC83468l {
    final /* synthetic */ C82004a $tabEnv;
    final /* synthetic */ SplitShootBottomTabModule this$0;

    static {
        Covode.recordClassIndex(79731);
    }

    SplitShootBottomTabModule$createBottomTabItem$1(SplitShootBottomTabModule splitShootBottomTabModule, C82004a aVar) {
        this.this$0 = splitShootBottomTabModule;
        this.$tabEnv = aVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
    public final boolean onTabUnselected(C83409d dVar, AbstractC83468l.C83469a aVar) {
        AbstractC83881a splitShootApiComponent;
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        if ((!C89219l.m154714a((Object) aVar.f186421e, (Object) "RecordCombinePhoto")) && (splitShootApiComponent = this.this$0.getSplitShootApiComponent()) != null) {
            splitShootApiComponent.mo123006a(false);
        }
        AbstractC83869f speedApiComponent = this.this$0.getSpeedApiComponent();
        if (speedApiComponent != null) {
            speedApiComponent.mo128758a(0);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
    public final boolean onTabSelected(C83409d dVar, AbstractC83468l.C83469a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        this.this$0.getRecordControlApi().mo22882a(C14197p.class);
        AbstractC83881a splitShootApiComponent = this.this$0.getSplitShootApiComponent();
        if (splitShootApiComponent != null) {
            splitShootApiComponent.mo123006a(true);
        }
        AbstractC83869f speedApiComponent = this.this$0.getSpeedApiComponent();
        if (speedApiComponent != null) {
            speedApiComponent.mo128758a(-this.$tabEnv.mo127169a().getResources().getDimensionPixelOffset(R.dimen.cr));
        }
        SplitShootBottomTabModule.access$getPermissionStateViewModel$p(this.this$0).mo33689c(PermissionStateViewModel.C83941b.f187387a);
        AbstractC83881a splitShootApiComponent2 = this.this$0.getSplitShootApiComponent();
        if (splitShootApiComponent2 != null) {
            splitShootApiComponent2.mo123003a(aVar);
        }
        return true;
    }
}
