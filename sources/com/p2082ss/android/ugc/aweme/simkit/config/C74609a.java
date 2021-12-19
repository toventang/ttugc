package com.p2082ss.android.ugc.aweme.simkit.config;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.p2082ss.android.ugc.aweme.simkit.impl.p3911b.C74627a;
import com.p2082ss.android.ugc.aweme.simkit.impl.p3911b.C74628b;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84272h;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84282p;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simkit.config.a */
public final class C74609a {

    /* renamed from: a */
    public static final C74609a f167751a = new C74609a();

    private C74609a() {
    }

    static {
        Covode.recordClassIndex(87430);
    }

    /* renamed from: a */
    public static AbstractC84272h m131031a() {
        ArrayList arrayList = new ArrayList();
        AbstractC74608c a = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a, "");
        ISimKitConfig b = a.mo117290b();
        C89219l.m154709a((Object) b, "");
        ICommonConfig commonConfig = b.getCommonConfig();
        C89219l.m154709a((Object) commonConfig, "");
        if (commonConfig.getVideoUrlHooks() != null) {
            AbstractC74608c a2 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a2, "");
            ISimKitConfig b2 = a2.mo117290b();
            C89219l.m154709a((Object) b2, "");
            ICommonConfig commonConfig2 = b2.getCommonConfig();
            C89219l.m154709a((Object) commonConfig2, "");
            List<AbstractC84278n> videoUrlHooks = commonConfig2.getVideoUrlHooks();
            C89219l.m154709a((Object) videoUrlHooks, "");
            arrayList.addAll(videoUrlHooks);
        }
        AbstractC74608c a3 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a3, "");
        ISimKitConfig b3 = a3.mo117290b();
        C89219l.m154709a((Object) b3, "");
        if (b3.getPreloaderExperiment().PreloadTypeExperiment() == AbstractC80918i.EnumC80919a.VideoCache) {
            arrayList.add(new C74628b(C80937s.m140453b()));
        } else {
            AbstractC80918i b4 = C80937s.m140453b();
            AbstractC74608c a4 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a4, "");
            ISimKitConfig b5 = a4.mo117290b();
            C89219l.m154709a((Object) b5, "");
            ICommonConfig commonConfig3 = b5.getCommonConfig();
            C89219l.m154709a((Object) commonConfig3, "");
            arrayList.add(new C74627a(b4, commonConfig3.getVideoUrlHookHook()));
        }
        AbstractC74608c a5 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a5, "");
        ISimKitConfig b6 = a5.mo117290b();
        C89219l.m154709a((Object) b6, "");
        ICommonConfig commonConfig4 = b6.getCommonConfig();
        C89219l.m154709a((Object) commonConfig4, "");
        return new C84282p(arrayList, (long) commonConfig4.getDefaultCDNTimeoutTime());
    }
}
