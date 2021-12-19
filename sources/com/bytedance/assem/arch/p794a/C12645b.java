package com.bytedance.assem.arch.p794a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.a.b */
public final class C12645b {

    /* renamed from: a */
    public static final C12645b f30803a = new C12645b();

    private C12645b() {
    }

    static {
        Covode.recordClassIndex(14465);
    }

    /* renamed from: a */
    public static <OPT extends AbstractC12649d> AbstractC12644a<OPT> m22776a(AbstractC89277c<? extends AbstractC12644a<OPT>> cVar) {
        C89219l.m154719c(cVar, "");
        if (AbstractC12644a.class.isAssignableFrom(C89170a.m154665a(cVar))) {
            try {
                return (AbstractC12644a) C89170a.m154665a(cVar).newInstance();
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cVar)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cVar)), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cVar)), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cVar)), e4);
            }
        } else {
            throw new IllegalArgumentException("Custom Model must be a subclass of AssemModel<ModelOperator>.");
        }
    }
}
