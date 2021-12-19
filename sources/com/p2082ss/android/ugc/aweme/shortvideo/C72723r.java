package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.draft.model.C43222b;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.tools.p4082b.AbstractC77808a;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77815f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.r */
public final /* synthetic */ class C72723r implements AbstractC77808a {

    /* renamed from: a */
    private final C43222b f163051a;

    static {
        Covode.recordClassIndex(85406);
    }

    C72723r(C43222b bVar) {
        this.f163051a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4082b.AbstractC77808a
    /* renamed from: a */
    public final void mo114970a(EnumC77815f fVar, String str) {
        C43222b bVar = this.f163051a;
        switch (C72700q.C727033.f162996a[fVar.ordinal()]) {
            case 1:
                bVar.f100866o = str;
                return;
            case 2:
                bVar.f100867p = str;
                return;
            case 3:
                bVar.f100868q = str;
                return;
            case 4:
                bVar.f100869r = str;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                bVar.f100870s = str;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                bVar.f100871t = str;
                return;
            default:
                return;
        }
    }
}
