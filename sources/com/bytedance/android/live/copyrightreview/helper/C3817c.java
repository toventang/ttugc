package com.bytedance.android.live.copyrightreview.helper;

import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.copyrightreview.helper.c */
final /* synthetic */ class C3817c implements AbstractC88433f {

    /* renamed from: a */
    private final CopyrightViolationHelper f10554a;

    static {
        Covode.recordClassIndex(4346);
    }

    C3817c(CopyrightViolationHelper copyrightViolationHelper) {
        this.f10554a = copyrightViolationHelper;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        CopyrightViolationHelper copyrightViolationHelper = this.f10554a;
        copyrightViolationHelper.f10546b.dismiss();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            copyrightViolationHelper.mo9162a(room, CopyrightViolationHelper.m9378b(room), 103);
            CopyrightViolationHelper.m9376a(room);
        }
    }
}
