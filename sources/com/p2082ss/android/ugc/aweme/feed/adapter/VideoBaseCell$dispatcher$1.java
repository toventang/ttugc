package com.p2082ss.android.ugc.aweme.feed.adapter;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.extensions.AbstractC12789k;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.feed.assem.C48442b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell$dispatcher$1 */
final class VideoBaseCell$dispatcher$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ VideoBaseCell f111324a;

    static {
        Covode.recordClassIndex(56783);
    }

    VideoBaseCell$dispatcher$1(VideoBaseCell videoBaseCell) {
        this.f111324a = videoBaseCell;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        AbstractC12789k kVar = C12787j.f31108b;
        if (kVar != null) {
            kVar.mo20640a("AssemList", "dispatcher: cell=" + this.f111324a + ", cellProxy=" + this.f111324a.f111311m + ", rootAssem=" + this.f111324a.f111312n + ", event=" + aVar + ", currentState: " + this.f111324a.getLifecycle().mo4011a());
        }
        C48442b bVar = this.f111324a.f111312n;
        if (bVar != null) {
            switch (C48190az.f111620c[aVar.ordinal()]) {
                case 1:
                    if (bVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                        bVar.mo20518f();
                    } else {
                        if (bVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                            bVar.mo20537l();
                        }
                        if (bVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) > 0) {
                            bVar.mo20526n();
                        }
                    }
                    bVar.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
                    return;
                case 2:
                    if (bVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                        if (bVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                            bVar.mo20518f();
                        }
                        bVar.bU_();
                    } else if (bVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                        bVar.mo20537l();
                    }
                    bVar.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
                    return;
                case 3:
                    if (bVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) < 0) {
                        if (bVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                            bVar.mo20518f();
                        }
                        if (bVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                            bVar.bU_();
                        }
                        bVar.mo20525j();
                    }
                    bVar.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
                    return;
                case 4:
                    bVar.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
                    bVar.mo20537l();
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    bVar.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
                    bVar.mo20526n();
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    bVar.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
                    bVar.mo20527p();
                    return;
                default:
                    return;
            }
        }
    }
}
