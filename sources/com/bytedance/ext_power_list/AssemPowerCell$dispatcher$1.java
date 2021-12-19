package com.bytedance.ext_power_list;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.p795b.AbstractC12711w;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import p4600h.p4611f.p4613b.C89219l;

final class AssemPowerCell$dispatcher$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ AssemPowerCell f35094a;

    static {
        Covode.recordClassIndex(16599);
    }

    AssemPowerCell$dispatcher$1(AssemPowerCell assemPowerCell) {
        this.f35094a = assemPowerCell;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        switch (C14517c.f35101a[aVar.ordinal()]) {
            case 1:
                AbstractC12711w d = this.f35094a.mo23351d();
                if (d.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                    d.mo20518f();
                } else {
                    if (d.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                        d.mo20537l();
                    }
                    if (d.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) > 0) {
                        d.mo20526n();
                    }
                }
                d.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
                return;
            case 2:
                AbstractC12711w d2 = this.f35094a.mo23351d();
                if (d2.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                    if (d2.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                        d2.mo20518f();
                    }
                    d2.bU_();
                } else if (d2.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                    d2.mo20537l();
                }
                d2.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
                return;
            case 3:
                AbstractC12711w d3 = this.f35094a.mo23351d();
                if (d3.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) < 0) {
                    if (d3.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                        d3.mo20518f();
                    }
                    if (d3.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                        d3.bU_();
                    }
                    d3.mo20525j();
                }
                d3.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
                return;
            case 4:
                AbstractC12711w d4 = this.f35094a.mo23351d();
                d4.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
                d4.mo20537l();
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                AbstractC12711w d5 = this.f35094a.mo23351d();
                d5.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
                d5.mo20526n();
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                AbstractC12711w d6 = this.f35094a.mo23351d();
                d6.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
                d6.mo20527p();
                return;
            default:
                return;
        }
    }
}
