package com.bytedance.lynx.hybrid.resource;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21278d;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21279e;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21281g;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21283i;
import com.bytedance.lynx.hybrid.resource.config.C21277c;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.service.IResourceService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.f */
public final class C21303f {

    /* renamed from: c */
    public static final C21304a f50574c = new C21304a((byte) 0);

    /* renamed from: a */
    Map<IResourceService, C21277c> f50575a;

    /* renamed from: b */
    public Application f50576b;

    /* renamed from: d */
    private C21277c f50577d;

    static {
        Covode.recordClassIndex(24921);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.f$a */
    public static final class C21304a {
        static {
            Covode.recordClassIndex(24922);
        }

        private C21304a() {
        }

        public /* synthetic */ C21304a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.f$b */
    public static final class C21305b {

        /* renamed from: a */
        public static final C21303f f50578a = new C21303f((byte) 0);

        /* renamed from: b */
        public static final C21305b f50579b = new C21305b();

        private C21305b() {
        }

        static {
            Covode.recordClassIndex(24923);
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.f$c */
    public static final class C21306c implements AbstractC21279e {

        /* renamed from: a */
        private IResourceService f50580a;

        static {
            Covode.recordClassIndex(24924);
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21279e
        /* renamed from: a */
        public final void mo34882a(C21284j jVar, List<String> list, AbstractC21281g gVar) {
            C89219l.m154719c(jVar, "");
            C89219l.m154719c(list, "");
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21279e
        /* renamed from: a */
        public final boolean mo34884a(String str, String str2, String str3) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(str3, "");
            return false;
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21279e
        /* renamed from: b */
        public final String mo34885b(String str, String str2, String str3) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(str3, "");
            return "";
        }

        C21306c() {
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21279e
        /* renamed from: a */
        public final void mo34883a(IResourceService iResourceService) {
            this.f50580a = iResourceService;
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21279e
        /* renamed from: a */
        public final Map<String, String> mo34881a(String str, String str2) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.f$d */
    public static final class C21307d implements AbstractC21278d {
        static {
            Covode.recordClassIndex(24925);
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21278d
        /* renamed from: a */
        public final void mo34880a(String str, boolean z, C21284j jVar, AbstractC21283i iVar) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(jVar, "");
        }

        C21307d() {
        }
    }

    private C21303f() {
        List c = C89070n.m154524c("");
        GeckoConfig geckoConfig = new GeckoConfig("", "", false, false, 12, null);
        geckoConfig.setGeckoDepender(new C21306c());
        C21277c cVar = new C21277c("", c, geckoConfig, null, null, 56);
        cVar.f50494a = new C21307d();
        this.f50577d = cVar;
        this.f50575a = new LinkedHashMap();
    }

    public /* synthetic */ C21303f(byte b) {
        this();
    }

    /* renamed from: a */
    public final C21277c mo34909a(IResourceService iResourceService) {
        if (iResourceService == null) {
            C21210c.m39924a("getConfig service is null,return placeholder", EnumC21209b.E, "ResLoaderConfigManager");
        }
        C21277c cVar = this.f50575a.get(iResourceService);
        if (cVar == null) {
            return this.f50577d;
        }
        return cVar;
    }
}
