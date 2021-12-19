package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34854e;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74603b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.w */
public final class C74672w implements AbstractC74603b {

    /* renamed from: a */
    private AbstractC74603b f167834a;

    static {
        Covode.recordClassIndex(87495);
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.w$a */
    public static class C74673a {

        /* renamed from: a */
        public static final C74672w f167835a = new C74672w((byte) 0);

        static {
            Covode.recordClassIndex(87496);
        }
    }

    private C74672w() {
        int bitrateBusinessType = AbstractC74616d.m131036a().mo117290b().getCommonConfig().getBitrateBusinessType();
        if (bitrateBusinessType == 1) {
            this.f167834a = new C74660m(AbstractC34854e.m71211a(1).build());
        } else if (bitrateBusinessType != 2) {
            this.f167834a = new C74662o();
        } else if (AbstractC34854e.m71211a(2) == null) {
            this.f167834a = new C74660m(AbstractC34854e.m71211a(1).build());
            if (C84231a.m144834a().isDebug()) {
                throw new RuntimeException("no runtime cloud type bitrateselector module");
            }
        } else {
            this.f167834a = new C74660m(AbstractC34854e.m71211a(2).build());
        }
    }

    /* synthetic */ C74672w(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74603b
    /* renamed from: a */
    public final EnumC63056b mo117325a(String str, AbstractC63057c cVar) {
        return this.f167834a.mo117325a(str, cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74603b
    /* renamed from: a */
    public final AbstractC81964c mo117326a(C84241i iVar, boolean z) {
        return this.f167834a.mo117326a(iVar, z);
    }
}
