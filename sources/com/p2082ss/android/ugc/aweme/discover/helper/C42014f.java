package com.p2082ss.android.ugc.aweme.discover.helper;

import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.search.C67361d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.f */
public final class C42014f {

    /* renamed from: b */
    public static final AbstractC89244h f97969b = C89250i.m154773a((AbstractC89171a) C42016b.f97972a);

    /* renamed from: c */
    public static final C42015a f97970c = new C42015a((byte) 0);

    /* renamed from: a */
    public final AbstractC42017c f97971a;

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.f$c */
    public interface AbstractC42017c {
        static {
            Covode.recordClassIndex(49947);
        }

        /* renamed from: a */
        List<C67361d> mo70843a();

        /* renamed from: a */
        List<Object> mo70844a(String str, String str2, Position position);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.f$a */
    public static final class C42015a {
        static {
            Covode.recordClassIndex(49945);
        }

        /* renamed from: a */
        public static WeakHashMap<Object, Map<String, C67361d>> m84100a() {
            return (WeakHashMap) C42014f.f97969b.getValue();
        }

        private C42015a() {
        }

        public /* synthetic */ C42015a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.f$b */
    static final class C42016b extends AbstractC89220m implements AbstractC89171a<WeakHashMap<Object, Map<String, C67361d>>> {

        /* renamed from: a */
        public static final C42016b f97972a = new C42016b();

        static {
            Covode.recordClassIndex(49946);
        }

        C42016b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakHashMap<Object, Map<String, C67361d>> invoke() {
            return new WeakHashMap();
        }
    }

    static {
        Covode.recordClassIndex(49944);
    }

    public C42014f(AbstractC42017c cVar) {
        C89219l.m154721d(cVar, "");
        this.f97971a = cVar;
    }

    /* renamed from: a */
    public final SpannableString mo71198a(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        SpannableString spannableString = new SpannableString(str);
        mo71199a(spannableString, str2, i);
        return spannableString;
    }

    /* renamed from: a */
    public final void mo71199a(Spannable spannable, String str, int i) {
        C67361d dVar;
        List<Position> positions;
        List<C67361d> a;
        C89219l.m154721d(spannable, "");
        C89219l.m154721d(str, "");
        List<C67361d> a2 = this.f97971a.mo70843a();
        if (!(a2 == null || a2.isEmpty())) {
            Map<String, C67361d> map = C42015a.m84100a().get(a2);
            if ((map == null || map.isEmpty()) && (a = this.f97971a.mo70843a()) != null) {
                C89219l.m154721d(a, "");
                if (!a.isEmpty()) {
                    Map<String, C67361d> map2 = C42015a.m84100a().get(a);
                    if (map2 == null) {
                        map2 = new LinkedHashMap<>();
                    }
                    for (T t : a) {
                        String field = t.getField();
                        if (field != null) {
                            map2.put(field, t);
                        }
                    }
                    C42015a.m84100a().put(a, map2);
                }
            }
            Map<String, C67361d> map3 = C42015a.m84100a().get(a2);
            if (!(map3 == null || (dVar = map3.get(str)) == null || (positions = dVar.getPositions()) == null)) {
                for (T t2 : positions) {
                    String obj = spannable.toString();
                    int length = obj.length();
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    int codePointCount = obj.codePointCount(0, length);
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    int codePointCount2 = obj.codePointCount(0, i);
                    int begin = t2.getBegin() + codePointCount2;
                    int end = t2.getEnd() + codePointCount2;
                    if (begin >= 0 && codePointCount >= begin && end >= 0 && codePointCount >= end) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        int offsetByCodePoints = obj.offsetByCodePoints(0, begin);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        int offsetByCodePoints2 = obj.offsetByCodePoints(0, end);
                        AbstractC42017c cVar = this.f97971a;
                        Position position = new Position();
                        position.setBegin(offsetByCodePoints);
                        position.setEnd(offsetByCodePoints2);
                        List<Object> a3 = cVar.mo70844a(obj, str, position);
                        if (a3 != null) {
                            Iterator<T> it = a3.iterator();
                            while (it.hasNext()) {
                                spannable.setSpan(it.next(), offsetByCodePoints, offsetByCodePoints2, 33);
                            }
                        }
                    }
                }
            }
        }
    }
}
