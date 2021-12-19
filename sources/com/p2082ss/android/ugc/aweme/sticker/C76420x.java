package com.p2082ss.android.ugc.aweme.sticker;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.C14389e;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import java.lang.reflect.Type;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.x */
public final class C76420x {
    static {
        Covode.recordClassIndex(89383);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.x$a */
    public static final class C76421a extends AbstractC89220m implements AbstractC89172b<C14389e.C14390a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21582f f171664a;

        /* renamed from: b */
        final /* synthetic */ C75972r.AbstractC75974b f171665b;

        static {
            Covode.recordClassIndex(89384);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76421a(C21582f fVar, C75972r.AbstractC75974b bVar) {
            super(1);
            this.f171664a = fVar;
            this.f171665b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14389e.C14390a aVar) {
            C14389e.C14390a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f34834a = C75393k.m132225a((ActivityC0945e) this.f171664a.mo35249a((Type) ActivityC0945e.class, (String) null));
            aVar2.f34835b = C75393k.m132224a(this.f171664a);
            C21582f fVar = this.f171664a;
            C75972r.AbstractC75974b bVar = this.f171665b;
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(bVar, "");
            aVar2.f34836c = new C76109u(fVar, bVar);
            return C89391z.f203057a;
        }
    }
}
