package com.p4501vk.api.sdk;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import okhttp3.C90208y;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.j */
public abstract class AbstractC87907j {

    /* renamed from: com.vk.api.sdk.j$a */
    public interface AbstractC87908a {
        static {
            Covode.recordClassIndex(103919);
        }

        /* renamed from: a */
        C90208y.C90210a mo142344a(C90208y.C90210a aVar);
    }

    static {
        Covode.recordClassIndex(103918);
    }

    /* renamed from: a */
    public abstract C90208y mo142384a();

    /* renamed from: a */
    public abstract void mo142385a(AbstractC87908a aVar);

    /* renamed from: com.vk.api.sdk.j$b */
    public static final class C87909b extends AbstractC87907j {

        /* renamed from: a */
        private volatile C90208y f199652a;

        static {
            Covode.recordClassIndex(103920);
        }

        @Override // com.p4501vk.api.sdk.AbstractC87907j
        /* renamed from: a */
        public final C90208y mo142384a() {
            if (this.f199652a == null) {
                this.f199652a = new C90208y().mo145086b().mo145088a(20, TimeUnit.SECONDS).mo145098b(30, TimeUnit.SECONDS).mo145102c(20, TimeUnit.SECONDS).mo145097b().mo145087a().mo145103d();
            }
            C90208y yVar = this.f199652a;
            if (yVar == null) {
                C89219l.m154707a();
            }
            return yVar;
        }

        @Override // com.p4501vk.api.sdk.AbstractC87907j
        /* renamed from: a */
        public final void mo142385a(AbstractC87908a aVar) {
            C89219l.m154719c(aVar, "");
            C90208y.C90210a b = mo142384a().mo145086b();
            C89219l.m154709a((Object) b, "");
            this.f199652a = aVar.mo142344a(b).mo145103d();
        }
    }
}
