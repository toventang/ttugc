package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import java.util.regex.Matcher;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: h.m.m */
public final class C89357m {
    static {
        Covode.recordClassIndex(105441);
    }

    /* renamed from: h.m.m$a */
    public static final class C89358a extends AbstractC89220m implements AbstractC89172b<T, Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f203031a;

        static {
            Covode.recordClassIndex(105442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89358a(int i) {
            super(1);
            this.f203031a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(invoke((Enum) obj));
        }

        public final boolean invoke(T t) {
            T t2 = t;
            if ((this.f203031a & t2.getMask()) == t2.getValue()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final int m154849a(Iterable<? extends AbstractC89341f> iterable) {
        int i = 0;
        for (AbstractC89341f fVar : iterable) {
            i |= fVar.getValue();
        }
        return i;
    }

    /* renamed from: a */
    public static final AbstractC89345j m154850a(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C89346k(matcher, charSequence);
    }
}
