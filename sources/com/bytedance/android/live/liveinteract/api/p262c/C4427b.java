package com.bytedance.android.live.liveinteract.api.p262c;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.api.c.b */
public class C4427b implements AbstractC4425a {

    /* renamed from: a */
    private final AbstractC89244h f12032a = C89250i.m154773a((AbstractC89171a) C4428a.f12033a);

    static {
        Covode.recordClassIndex(5003);
    }

    /* renamed from: a */
    public final HashMap<String, Object> mo10200a() {
        return (HashMap) this.f12032a.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.api.c.b$a */
    static final class C4428a extends AbstractC89220m implements AbstractC89171a<HashMap<String, Object>> {

        /* renamed from: a */
        public static final C4428a f12033a = new C4428a();

        static {
            Covode.recordClassIndex(5004);
        }

        C4428a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, Object> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: a */
    public final Object mo10199a(String str) {
        C89219l.m154721d(str, "");
        return mo10200a().get(str);
    }

    /* renamed from: a */
    public final void mo10201a(Object obj) {
        boolean z;
        String str;
        C89219l.m154721d(obj, "");
        Class<?> cls = obj.getClass();
        ArrayList arrayList = new ArrayList();
        while (cls != null && (!C89219l.m154714a(cls, Object.class))) {
            Field[] declaredFields = cls.getDeclaredFields();
            C89219l.m154716b(declaredFields, "");
            C89070n.m154536a((Collection) arrayList, (Object[]) declaredFields);
            cls = cls.getSuperclass();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Field) obj2).getAnnotation(AbstractC4430d.class) != null) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<Field> arrayList3 = arrayList2;
        ArrayList<C89378p> arrayList4 = new ArrayList(C89070n.m154526a((Iterable) arrayList3, 10));
        for (Field field : arrayList3) {
            AbstractC4430d dVar = (AbstractC4430d) field.getAnnotation(AbstractC4430d.class);
            if (dVar != null) {
                str = dVar.mo10204a();
            } else {
                str = null;
            }
            arrayList4.add(C89387v.m154943a(field, str));
        }
        for (C89378p pVar : arrayList4) {
            Object obj3 = mo10200a().get(pVar.getSecond());
            AbstractC4430d dVar2 = (AbstractC4430d) ((Field) pVar.getFirst()).getAnnotation(AbstractC4430d.class);
            if (dVar2 != null) {
                z = dVar2.mo10205b();
            } else {
                z = false;
            }
            if (obj3 != null) {
                ((Field) pVar.getFirst()).setAccessible(true);
                ((Field) pVar.getFirst()).set(obj, mo10200a().get(pVar.getSecond()));
            } else if (!z) {
                throw new IllegalStateException(((String) pVar.getSecond()) + " has not provided, please check it's provider");
            }
        }
    }

    /* renamed from: b */
    public final void mo10202b(Object obj) {
        String str;
        C89219l.m154721d(obj, "");
        Class<?> cls = obj.getClass();
        ArrayList arrayList = new ArrayList();
        while (cls != null && (!C89219l.m154714a(cls, Object.class))) {
            Field[] declaredFields = cls.getDeclaredFields();
            C89219l.m154716b(declaredFields, "");
            C89070n.m154536a((Collection) arrayList, (Object[]) declaredFields);
            cls = cls.getSuperclass();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Field) obj2).getAnnotation(AbstractC4429c.class) != null) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<Field> arrayList3 = arrayList2;
        ArrayList<C89378p> arrayList4 = new ArrayList(C89070n.m154526a((Iterable) arrayList3, 10));
        for (Field field : arrayList3) {
            AbstractC4429c cVar = (AbstractC4429c) field.getAnnotation(AbstractC4429c.class);
            if (cVar != null) {
                str = cVar.mo10203a();
            } else {
                str = null;
            }
            arrayList4.add(C89387v.m154943a(field, str));
        }
        for (C89378p pVar : arrayList4) {
            if (mo10200a().get(pVar.getSecond()) == null) {
                C3854a.m9458a("Injector", new IllegalStateException(((String) pVar.getSecond()) + " has not provided, please check it's provider"));
            } else {
                ((Field) pVar.getFirst()).setAccessible(true);
                ((Field) pVar.getFirst()).set(obj, mo10200a().get(pVar.getSecond()));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.p262c.AbstractC4425a
    /* renamed from: a */
    public final void mo10198a(Object obj, String str) {
        String a;
        C89219l.m154721d(obj, "");
        AbstractC4432f fVar = (AbstractC4432f) obj.getClass().getAnnotation(AbstractC4432f.class);
        if (fVar != null && (a = fVar.mo10206a()) != null) {
            str = a;
        } else if (str == null) {
            return;
        }
        mo10200a().get(str);
        mo10200a().put(str, obj);
    }
}
