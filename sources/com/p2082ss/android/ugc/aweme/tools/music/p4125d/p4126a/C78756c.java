package com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4126a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.c */
public final class C78756c {

    /* renamed from: b */
    public static final C78756c f176988b = C78758b.f176991a;

    /* renamed from: c */
    public static final C78757a f176989c = new C78757a((byte) 0);

    /* renamed from: a */
    public final SharedPreferences f176990a;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.c$a */
    public static final class C78757a {
        static {
            Covode.recordClassIndex(91900);
        }

        private C78757a() {
        }

        public /* synthetic */ C78757a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.c$b */
    static final class C78758b {

        /* renamed from: a */
        static final C78756c f176991a = new C78756c();

        /* renamed from: b */
        public static final C78758b f176992b = new C78758b();

        private C78758b() {
        }

        static {
            Covode.recordClassIndex(91901);
        }
    }

    static {
        Covode.recordClassIndex(91899);
    }

    public C78756c() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        AbstractC63167ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
        C89219l.m154716b(applicationService, "");
        this.f176990a = C34822d.m71158a(applicationService.mo93774c(), "collect_music", 0);
    }
}
