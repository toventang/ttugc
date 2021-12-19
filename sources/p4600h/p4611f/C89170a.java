package p4600h.p4611f;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.AbstractC89210d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: h.f.a */
public final class C89170a {
    static {
        Covode.recordClassIndex(105254);
    }

    /* renamed from: a */
    public static final <T> Class<T> m154665a(AbstractC89277c<T> cVar) {
        C89219l.m154721d(cVar, "");
        Class<T> cls = (Class<T>) ((AbstractC89210d) cVar).mo143612a();
        Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
        return cls;
    }

    /* renamed from: b */
    public static final <T> Class<T> m154666b(AbstractC89277c<T> cVar) {
        C89219l.m154721d(cVar, "");
        Class<T> cls = (Class<T>) ((AbstractC89210d) cVar).mo143612a();
        if (!cls.isPrimitive()) {
            Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
            return cls;
        }
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        cls = (Class<T>) Double.class;
                        break;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        cls = (Class<T>) Integer.class;
                        break;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        cls = (Class<T>) Byte.class;
                        break;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        cls = (Class<T>) Character.class;
                        break;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        cls = (Class<T>) Long.class;
                        break;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        cls = (Class<T>) Void.class;
                        break;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        cls = (Class<T>) Boolean.class;
                        break;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        cls = (Class<T>) Float.class;
                        break;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        cls = (Class<T>) Short.class;
                        break;
                    }
                    break;
            }
        }
        Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
        return cls;
    }
}
