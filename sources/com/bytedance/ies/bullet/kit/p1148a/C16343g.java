package com.bytedance.ies.bullet.kit.p1148a;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16660c;
import com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d;
import com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16663f;
import com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16665h;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16666i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.a.g */
public final class C16343g {

    /* renamed from: c */
    public static final C16344a f39282c = new C16344a((byte) 0);

    /* renamed from: a */
    Map<IResourceLoaderService, C16666i> f39283a;

    /* renamed from: b */
    public Application f39284b;

    /* renamed from: d */
    private C16666i f39285d;

    static {
        Covode.recordClassIndex(18636);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.g$a */
    public static final class C16344a {
        static {
            Covode.recordClassIndex(18637);
        }

        private C16344a() {
        }

        public /* synthetic */ C16344a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.g$b */
    public static final class C16345b {

        /* renamed from: a */
        public static final C16343g f39286a = new C16343g((byte) 0);

        /* renamed from: b */
        public static final C16345b f39287b = new C16345b();

        private C16345b() {
        }

        static {
            Covode.recordClassIndex(18638);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.g$c */
    public static final class C16346c implements AbstractC16661d {

        /* renamed from: a */
        private IResourceLoaderService f39288a;

        static {
            Covode.recordClassIndex(18639);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d
        /* renamed from: a */
        public final void mo25884a(C16667j jVar, List<String> list, AbstractC16663f fVar) {
            C89219l.m154719c(jVar, "");
            C89219l.m154719c(list, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d
        /* renamed from: a_ */
        public final boolean mo25885a_(String str, String str2, String str3) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(str3, "");
            return false;
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d
        /* renamed from: b */
        public final String mo25886b(String str, String str2, String str3) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(str3, "");
            return "";
        }

        C16346c() {
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d
        /* renamed from: a */
        public final void mo25883a(IResourceLoaderService iResourceLoaderService) {
            this.f39288a = iResourceLoaderService;
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d
        /* renamed from: a */
        public final Map<String, String> mo25882a(String str, String str2) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.g$d */
    public static final class C16347d implements AbstractC16660c {
        static {
            Covode.recordClassIndex(18640);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16660c
        /* renamed from: a */
        public final void mo25877a(String str, boolean z, C16667j jVar, AbstractC16665h hVar) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(jVar, "");
        }

        C16347d() {
        }
    }

    private C16343g() {
        this.f39285d = new C16666i("", "", C89070n.m154524c(""), "", "", "", new GeckoConfig("", "", new C16346c(), false, false, 24, null), null, new C16347d(), null, 1664);
        this.f39283a = new LinkedHashMap();
    }

    public /* synthetic */ C16343g(byte b) {
        this();
    }

    /* renamed from: a */
    public final C16666i mo25918a(IResourceLoaderService iResourceLoaderService) {
        C16666i iVar = this.f39283a.get(iResourceLoaderService);
        if (iVar == null) {
            return this.f39285d;
        }
        return iVar;
    }
}
