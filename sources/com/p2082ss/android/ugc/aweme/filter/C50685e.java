package com.p2082ss.android.ugc.aweme.filter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50749j;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63190ap;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.tools.p4081a.C77805a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84455l;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.e */
public final class C50685e implements AbstractC50749j {
    static {
        Covode.recordClassIndex(59847);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50749j
    /* renamed from: a */
    public final void mo86026a(C50698f fVar, String str, long j, AbstractC84455l lVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(lVar, "");
        C63244g.m114602a().mo73263I().mo101629a("filter_download_error_rate", 0, new C69840ar().mo110185a("tools_use_downloader", Boolean.valueOf(lVar instanceof C77805a)).mo110189a("url", str).mo110189a("duration", String.valueOf(j)).mo110191a());
        C80322d.m139251a("tool_performance_resource_download", new C84425b().mo129406a("resource_type", "color_filter").mo129404a("duration", j).mo129403a("status", 0).mo129403a("resource_id", fVar.f117047a).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50749j
    /* renamed from: a */
    public final void mo86027a(C50698f fVar, String str, long j, AbstractC84455l lVar, Exception exc, Integer num) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(exc, "");
        AbstractC63190ap I = C63244g.m114602a().mo73263I();
        C69840ar arVar = new C69840ar();
        String b = C84911q.m145925b(exc);
        C89219l.m154716b(b, "");
        I.mo101629a("filter_download_error_rate", 1, arVar.mo110189a("exception", b).mo110185a("tools_use_downloader", Boolean.valueOf(lVar instanceof C77805a)).mo110189a("url", str).mo110187a("filter_id", Integer.valueOf(fVar.f117047a)).mo110189a("filter_name", fVar.f117049c).mo110191a());
        C84425b a = new C84425b().mo129406a("resource_type", "color_filter").mo129404a("duration", j).mo129403a("status", 1).mo129403a("resource_id", fVar.f117047a).mo129405a("error_domain", EffectPlatformFactory.m89604a().getHosts().get(0)).mo129405a("error_code", num);
        String message = exc.getMessage();
        if (message == null) {
            message = "empty_error_msg";
        }
        C80322d.m139251a("tool_performance_resource_download", a.mo129406a("error_msg", message).f188764a);
    }
}
