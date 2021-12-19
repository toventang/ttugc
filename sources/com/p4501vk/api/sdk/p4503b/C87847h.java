package com.p4501vk.api.sdk.p4503b;

import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.AbstractC87878f;
import com.p4501vk.api.sdk.C87860d;
import com.p4501vk.api.sdk.p4504c.C87852a;
import com.p4501vk.api.sdk.p4504c.C87854b;
import java.util.concurrent.CountDownLatch;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89216i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89278d;

/* renamed from: com.vk.api.sdk.b.h */
public final class C87847h<T> extends AbstractC87844f<T> {

    /* renamed from: b */
    public final AbstractC87840b<T> f199554b;

    static {
        Covode.recordClassIndex(103857);
    }

    /* renamed from: com.vk.api.sdk.b.h$a */
    static final /* synthetic */ class C87848a extends C89216i implements AbstractC89187q<AbstractC87878f, String, AbstractC87878f.C87879a<String>, C89391z> {

        /* renamed from: a */
        public static final C87848a f199555a = new C87848a();

        static {
            Covode.recordClassIndex(103858);
        }

        C87848a() {
            super(3);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "handleCaptcha";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "handleCaptcha(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(AbstractC87878f.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC87878f fVar, String str, AbstractC87878f.C87879a<String> aVar) {
            AbstractC87878f fVar2 = fVar;
            String str2 = str;
            AbstractC87878f.C87879a<String> aVar2 = aVar;
            C89219l.m154719c(fVar2, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(aVar2, "");
            fVar2.mo142359a(str2, aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.vk.api.sdk.b.h$b */
    static final /* synthetic */ class C87849b extends C89216i implements AbstractC89187q<AbstractC87878f, String, AbstractC87878f.C87879a<Boolean>, C89391z> {

        /* renamed from: a */
        public static final C87849b f199556a = new C87849b();

        static {
            Covode.recordClassIndex(103859);
        }

        C87849b() {
            super(3);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "handleConfirm";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "handleConfirm(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(AbstractC87878f.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC87878f fVar, String str, AbstractC87878f.C87879a<Boolean> aVar) {
            AbstractC87878f fVar2 = fVar;
            String str2 = str;
            AbstractC87878f.C87879a<Boolean> aVar2 = aVar;
            C89219l.m154719c(fVar2, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(aVar2, "");
            fVar2.mo142361c(str2, aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.vk.api.sdk.b.h$c */
    static final /* synthetic */ class C87850c extends C89216i implements AbstractC89187q<AbstractC87878f, String, AbstractC87878f.C87879a<AbstractC87878f.C87880b>, C89391z> {

        /* renamed from: a */
        public static final C87850c f199557a = new C87850c();

        static {
            Covode.recordClassIndex(103860);
        }

        C87850c() {
            super(3);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "handleValidation";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "handleValidation(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(AbstractC87878f.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC87878f fVar, String str, AbstractC87878f.C87879a<AbstractC87878f.C87880b> aVar) {
            AbstractC87878f fVar2 = fVar;
            String str2 = str;
            AbstractC87878f.C87879a<AbstractC87878f.C87880b> aVar2 = aVar;
            C89219l.m154719c(fVar2, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(aVar2, "");
            fVar2.mo142360b(str2, aVar2);
            return C89391z.f203057a;
        }
    }

    @Override // com.p4501vk.api.sdk.p4503b.AbstractC87840b
    /* renamed from: a */
    public final T mo142304a(C87839a aVar) {
        C89219l.m154719c(aVar, "");
        int i = this.f199550c;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                try {
                    return this.f199554b.mo142304a(aVar);
                } catch (C87854b e) {
                    if (e.isCaptchaError()) {
                        String str = (String) m152854a(e.getCaptchaImg(), this.f199541a.f199565a, C87848a.f199555a);
                        if (str != null) {
                            String captchaSid = e.getCaptchaSid();
                            C89219l.m154719c(captchaSid, "");
                            aVar.f199538a = captchaSid;
                            C89219l.m154719c(str, "");
                            aVar.f199539b = str;
                        } else {
                            throw e;
                        }
                    } else if (e.isValidationRequired()) {
                        AbstractC87878f.C87880b bVar = (AbstractC87878f.C87880b) m152854a(e.getValidationUrl(), this.f199541a.f199565a, C87850c.f199557a);
                        C89219l.m154719c(e, "");
                        if (bVar == null || !bVar.f199608a) {
                            throw e;
                        }
                        C87860d dVar = this.f199541a;
                        String str2 = bVar.f199610c;
                        if (str2 == null) {
                            C89219l.m154707a();
                        }
                        dVar.mo142340a(str2, bVar.f199609b);
                    } else if (e.isUserConfirmRequired()) {
                        Boolean bool = (Boolean) m152854a(e.getUserConfirmText(), this.f199541a.f199565a, C87849b.f199556a);
                        if (bool == null) {
                            throw e;
                        } else if (!C89219l.m154714a((Object) bool, (Object) false)) {
                            aVar.f199540c = bool.booleanValue();
                        } else {
                            throw e;
                        }
                    } else {
                        AbstractC87878f fVar = this.f199541a.f199565a;
                        if (fVar != null) {
                            fVar.mo142358a(e, this.f199541a);
                        } else {
                            throw e;
                        }
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
        }
        throw new C87852a("Can't confirm validation due to retry limit!");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.vk.api.sdk.b.b<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87847h(C87860d dVar, int i, AbstractC87840b<? extends T> bVar) {
        super(dVar, i);
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(bVar, "");
        this.f199554b = bVar;
    }

    /* renamed from: a */
    private static <T, H> T m152854a(String str, H h, AbstractC89187q<? super H, ? super String, ? super AbstractC87878f.C87879a<T>, C89391z> qVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(qVar, "");
        if (h == null) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AbstractC87878f.C87879a aVar = new AbstractC87878f.C87879a(countDownLatch);
        qVar.invoke(h, str, aVar);
        countDownLatch.await();
        return aVar.f199606a;
    }
}
