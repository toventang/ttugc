package com.bytedance.ies.dmt.p1194ui.p1198d;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.d.a */
public final class C17191a extends SpannableStringBuilder {

    /* renamed from: a */
    public static final C17193b f40971a = new C17193b((byte) 0);

    /* renamed from: b */
    private final List<Integer> f40972b = new ArrayList();

    static {
        Covode.recordClassIndex(19651);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.d.a$b */
    public static final class C17193b {
        static {
            Covode.recordClassIndex(19653);
        }

        private C17193b() {
        }

        public /* synthetic */ C17193b(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m31755a(int i) {
            String a = C1764a.m5929a(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C89219l.m154716b(a, "");
            return a;
        }
    }

    public final /* bridge */ int length() {
        return super.length();
    }

    /* renamed from: com.bytedance.ies.dmt.ui.d.a$a */
    public static final class C17192a {

        /* renamed from: a */
        public final C17191a f40973a;

        /* renamed from: b */
        public final C17194c f40974b = new C17194c();

        static {
            Covode.recordClassIndex(19652);
        }

        public C17192a() {
            char c;
            C17191a aVar = new C17191a();
            this.f40973a = aVar;
            if (C80471gb.m139482a()) {
                c = 8207;
            } else {
                c = 8206;
            }
            aVar.append(c);
            aVar.mo27172a(0);
        }

        /* renamed from: a */
        public final C17192a mo27177a(CharSequence charSequence) {
            C89219l.m154721d(charSequence, "");
            this.f40973a.append(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C17192a mo27179b(CharSequence charSequence) {
            C89219l.m154721d(charSequence, "");
            C17194c.m31757a(this.f40973a, charSequence);
            return this;
        }

        /* renamed from: c */
        public final C17192a mo27180c(CharSequence charSequence) {
            char c;
            C89219l.m154721d(charSequence, "");
            C17191a aVar = this.f40973a;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(charSequence, "");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (C80471gb.m139482a()) {
                c = 8207;
            } else {
                c = 8206;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(c);
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            C89219l.m154716b(spannableStringBuilder2, "");
            int length = aVar.length();
            aVar.mo27172a(length);
            aVar.mo27172a((length + spannableStringBuilder2.length()) - 1);
            aVar.append((CharSequence) spannableStringBuilder2);
            return this;
        }

        /* renamed from: a */
        public final C17192a mo27178a(CharSequence charSequence, Object obj, int i) {
            C89219l.m154721d(charSequence, "");
            int length = this.f40973a.length();
            this.f40973a.append(charSequence);
            if (obj != null) {
                this.f40973a.setSpan(obj, length, this.f40973a.length(), i);
            }
            return this;
        }

        /* renamed from: a */
        public final C17192a mo27176a(Resources resources, int i, String... strArr) {
            C89219l.m154721d(resources, "");
            C89219l.m154721d(strArr, "");
            ArrayList arrayList = new ArrayList(1);
            int i2 = 0;
            do {
                arrayList.add(C17194c.m31756a(strArr[0]));
                i2++;
            } while (i2 <= 0);
            Object[] array = arrayList.toArray(new CharSequence[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String string = resources.getString(i, Arrays.copyOf(array, array.length));
            C89219l.m154716b(string, "");
            this.f40973a.append((CharSequence) string);
            return this;
        }
    }

    public final /* bridge */ char charAt(int i) {
        return super.charAt(i);
    }

    /* renamed from: a */
    public final void mo27172a(int i) {
        this.f40972b.add(Integer.valueOf(i));
    }

    /* renamed from: com.bytedance.ies.dmt.ui.d.a$c */
    public static final class C17194c {
        static {
            Covode.recordClassIndex(19654);
        }

        /* renamed from: a */
        public static CharSequence m31756a(CharSequence charSequence) {
            C89219l.m154721d(charSequence, "");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((char) 8296);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8297);
            return spannableStringBuilder;
        }

        /* renamed from: a */
        public static void m31757a(C17191a aVar, CharSequence charSequence) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(charSequence, "");
            CharSequence a = m31756a(charSequence);
            int length = aVar.length();
            aVar.mo27172a(length);
            aVar.mo27172a((length + a.length()) - 1);
            aVar.append(a);
        }
    }

    /* renamed from: b */
    private final int m31747b(int i) {
        int size = this.f40972b.size();
        int i2 = 0;
        while (i2 < size && this.f40972b.get(i2).intValue() <= i) {
            i++;
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo27173a(Object obj, int i, int i2) {
        super.setSpan(obj, m31747b(i), m31747b(i2), 33);
    }
}
