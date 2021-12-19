package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.hd */
public final class C80527hd {

    /* renamed from: a */
    static final AbstractC89172b<String, String> f180141a = C80529b.f180143a;

    static {
        Covode.recordClassIndex(93800);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.hd$a */
    static final class C80528a extends AbstractC89220m implements AbstractC89172b<String, CharSequence> {

        /* renamed from: a */
        public static final C80528a f180142a = new C80528a();

        static {
            Covode.recordClassIndex(93801);
        }

        C80528a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            String obj = C89361p.m154910b((CharSequence) str2).toString();
            if (C89361p.m154874b(obj, ",", false)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String substring = obj.substring(1);
                C89219l.m154716b(substring, "");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type kotlin.CharSequence");
                obj = C89361p.m154910b((CharSequence) substring).toString();
            }
            return C80527hd.f180141a.invoke(obj) + "\n";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.hd$b */
    static final class C80529b extends AbstractC89220m implements AbstractC89172b<String, String> {

        /* renamed from: a */
        public static final C80529b f180143a = new C80529b();

        static {
            Covode.recordClassIndex(93802);
        }

        C80529b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return "| " + C89361p.m154910b((CharSequence) str2).toString() + C89361p.m154867a((CharSequence) " ", Math.max(0, 197 - C89361p.m154910b((CharSequence) str2).toString().length())) + '|';
        }
    }

    /* renamed from: a */
    public static void m139598a(Object[] objArr) {
        C89219l.m154721d(objArr, "");
        Object[] array = C89064i.m154505f(objArr).toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String.valueOf(objArr[0]);
        C89361p.m154867a((CharSequence) "-", 198);
        String a = C89064i.m154484a(array, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
        Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.CharSequence");
        C89070n.m154551a(C89361p.m154921c(C89361p.m154910b((CharSequence) a).toString(), new String[]{"\n"}), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C80528a.f180142a, 30);
    }
}
