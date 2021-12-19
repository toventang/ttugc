package com.p2082ss.android.ugc.aweme.video.p4211e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84264a;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84273i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84274j;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84276l;

/* renamed from: com.ss.android.ugc.aweme.video.e.b */
public final class C80722b implements AbstractC84278n {
    static {
        Covode.recordClassIndex(94009);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: a */
    public final C84274j mo117450a(AbstractC84278n.AbstractC84280a aVar) {
        C84273i a = aVar.mo129301a();
        String a2 = LocalVideoPlayerManager.m140055a().mo123959a(C80942a.m140472a(a.f188459a));
        if (TextUtils.isEmpty(a2)) {
            return aVar.mo129303a(a);
        }
        C73991bj.m130128a("LocalVideoCache=>play video using cache,filePath:".concat(String.valueOf(a2)));
        C84274j jVar = new C84274j(a2);
        if (C16048b.m29633a().mo25412a(true, "force_software_play", 1) == 1) {
            jVar.f188463b = true;
        }
        return jVar;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: b */
    public final C84274j mo117451b(AbstractC84278n.AbstractC84280a aVar) {
        C84264a b = aVar.mo129305b();
        String a = LocalVideoPlayerManager.m140055a().mo123959a(C80942a.m140471a(b.f188450a));
        if (TextUtils.isEmpty(a)) {
            return aVar.mo129302a(b);
        }
        C73991bj.m130128a("LocalVideoCache=>play audio using cache,filePath:".concat(String.valueOf(a)));
        C84274j jVar = new C84274j(a);
        if (C16048b.m29633a().mo25412a(true, "force_software_play", 1) == 1) {
            jVar.f188463b = true;
        }
        return jVar;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: c */
    public final C84274j mo117452c(AbstractC84278n.AbstractC84280a aVar) {
        C84276l c = aVar.mo129306c();
        String a = LocalVideoPlayerManager.m140055a().mo123959a(C80942a.m140470a(c.f188464a));
        if (TextUtils.isEmpty(a)) {
            return aVar.mo129304a(c);
        }
        C73991bj.m130128a("LocalVideoCache=>play subtitle using cache,filePath:".concat(String.valueOf(a)));
        C84274j jVar = new C84274j(a);
        if (C16048b.m29633a().mo25412a(true, "force_software_play", 1) == 1) {
            jVar.f188463b = true;
        }
        return jVar;
    }
}
