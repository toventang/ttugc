package com.p2082ss.android.ugc.aweme.video.simplayer.p4228tt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62970h;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import com.p2082ss.android.ugc.aweme.video.simplayer.C81014l;
import com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.ttm.player.C86239b;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.p4430s.AbstractC86642j;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.tt.TTSimPlayerServiceImpl */
public class TTSimPlayerServiceImpl implements ISimPlayerService {
    static {
        Covode.recordClassIndex(94349);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    /* renamed from: c */
    public final void mo124402c() {
        C86313ai.f192839bB = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    /* renamed from: b */
    public final AbstractC63041i mo124401b() {
        return new C81034b(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    /* renamed from: a */
    public final AbstractC81002f mo124396a() {
        return new C81035c(new C62970h(new C62976i(C84209m.EnumC84214e.TT)), false, new C81014l());
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    /* renamed from: a */
    public final void mo124399a(final ISimPlayerService.AbstractC80989a aVar) {
        C86641i.f195275b = new AbstractC86642j() {
            /* class com.p2082ss.android.ugc.aweme.video.simplayer.p4228tt.TTSimPlayerServiceImpl.C810311 */

            static {
                Covode.recordClassIndex(94350);
            }

            @Override // com.p2082ss.ttvideoengine.p4430s.AbstractC86642j
            /* renamed from: a */
            public final void mo124485a(String str) {
                aVar.mo117299a(str);
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    /* renamed from: a */
    public final void mo124398a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        C86641i.m150109a(i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    /* renamed from: a */
    public final void mo124400a(ExecutorService executorService) {
        C86641i.m150110a("TTVideoEngine", "set player threadpool");
        C86239b.m148298a(executorService);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    /* renamed from: a */
    public final AbstractC81002f mo124397a(boolean z, boolean z2) {
        return new C81036d().mo124480a(z).mo124481b(z2).mo124479a();
    }
}
