package com.p2082ss.android.ugc.aweme.emoji.p2905h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46639a;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.a */
public final class C46535a {

    /* renamed from: a */
    static List<? extends C46534a> f108507a = C89086z.INSTANCE;

    /* renamed from: b */
    public static int f108508b;

    /* renamed from: c */
    static boolean f108509c;

    /* renamed from: d */
    public static final C46535a f108510d = new C46535a();

    /* renamed from: e */
    private static final AbstractC89516am f108511e = C89517an.m155448a(C89546bf.f203266a);

    private C46535a() {
    }

    static {
        Covode.recordClassIndex(55122);
    }

    /* renamed from: a */
    public static void m89810a() {
        if (C46639a.m90020a()) {
            f108509c = true;
            f108508b = 0;
            AbstractC89568bz unused = C89624i.m155555a(f108511e, C89546bf.f203267b, null, new C46536a(null), 2);
        }
    }

    /* renamed from: b */
    public static String m89811b() {
        return "SELF_EMOJIS" + C46639a.m90022c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a$a */
    public static final class C46536a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f108512a;

        /* renamed from: b */
        int f108513b;

        /* renamed from: c */
        private /* synthetic */ Object f108514c;

        static {
            Covode.recordClassIndex(55123);
        }

        C46536a(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C46536a aVar = new C46536a(dVar);
            aVar.f108514c = obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46536a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 232
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.p2905h.C46535a.C46536a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
