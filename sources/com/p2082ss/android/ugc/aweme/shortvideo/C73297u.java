package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.draft.model.C43222b;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.tools.p4082b.AbstractC77811b;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77815f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.u */
public final /* synthetic */ class C73297u implements AbstractC77811b {

    /* renamed from: a */
    private final C43222b f164606a;

    static {
        Covode.recordClassIndex(86016);
    }

    C73297u(C43222b bVar) {
        this.f164606a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4082b.AbstractC77811b
    /* renamed from: a */
    public final String mo114971a(EnumC77815f fVar) {
        C43222b bVar = this.f164606a;
        switch (C72700q.C727033.f162996a[fVar.ordinal()]) {
            case 1:
                return bVar.f100866o;
            case 2:
                return bVar.f100867p;
            case 3:
                return bVar.f100868q;
            case 4:
                return bVar.f100869r;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return bVar.f100870s;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return bVar.f100871t;
            default:
                return null;
        }
    }
}
