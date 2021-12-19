package com.bytedance.hox;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.p1106a.AbstractC15495b;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hox.c */
public interface AbstractC15499c extends AbstractC1202k {
    static {
        Covode.recordClassIndex(17758);
    }

    /* renamed from: X_ */
    List<AbstractC15495b> mo25221X_();

    /* renamed from: com.bytedance.hox.c$a */
    public static final class C15500a {
        static {
            Covode.recordClassIndex(17759);
        }

        /* renamed from: a */
        public static void m28549a(AbstractC15499c cVar, AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            C89219l.m154719c(mVar, "");
            C89219l.m154719c(aVar, "");
            List<AbstractC15495b> X_ = cVar.mo25221X_();
            if (X_ != null) {
                Iterator<T> it = X_.iterator();
                while (it.hasNext()) {
                    it.next();
                    aVar.ordinal();
                }
            }
        }
    }
}
