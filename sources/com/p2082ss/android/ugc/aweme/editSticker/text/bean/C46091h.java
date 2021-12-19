package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45850a;
import com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45851b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.h */
public final class C46091h extends C45850a {

    /* renamed from: c */
    public final C46093i f107336c;

    static {
        Covode.recordClassIndex(54649);
    }

    public final int hashCode() {
        return this.f106810b.getEffectId().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46079a) {
            return C89219l.m154714a((Object) ((C45850a) obj).f106810b.getResourceId(), (Object) this.f106810b.getResourceId());
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.h$a */
    public static final class C46092a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Boolean>, Object> {

        /* renamed from: a */
        int f107337a;

        /* renamed from: b */
        final /* synthetic */ C46091h f107338b;

        static {
            Covode.recordClassIndex(54650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46092a(C46091h hVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f107338b = hVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46092a(this.f107338b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Boolean> dVar) {
            return ((C46092a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f107337a == 0) {
                C89382r.m154942a(obj);
                try {
                    if (!C45851b.m88478a(this.f107338b.f106810b)) {
                        return false;
                    }
                    return Boolean.valueOf(new File(this.f107338b.f107336c.f107340b).exists());
                } catch (Exception unused) {
                    return false;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46091h(Effect effect, C46093i iVar) {
        super(effect);
        C89219l.m154721d(effect, "");
        C89219l.m154721d(iVar, "");
        this.f107336c = iVar;
    }
}
