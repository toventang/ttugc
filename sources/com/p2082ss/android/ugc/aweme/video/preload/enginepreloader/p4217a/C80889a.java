package com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.p4217a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g;
import com.p2082ss.mediakit.net.AVMDLNetClient;
import com.p2082ss.mediakit.net.AVMDLNetClientMaker;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.a.a */
public final class C80889a implements AVMDLNetClientMaker {

    /* renamed from: a */
    private final AbstractC80890a f180876a;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.a.a$a */
    public interface AbstractC80890a {
        static {
            Covode.recordClassIndex(94189);
        }

        /* renamed from: a */
        AbstractC63037g mo124259a();
    }

    static {
        Covode.recordClassIndex(94188);
    }

    @Override // com.p2082ss.mediakit.net.AVMDLNetClientMaker
    public final AVMDLNetClient getNetClient() {
        return new C80891b(this.f180876a.mo124259a());
    }

    public C80889a(AbstractC80890a aVar) {
        this.f180876a = aVar;
    }
}
