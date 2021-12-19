package com.p2082ss.android.ugc.aweme.qna.p3645c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.qna.fragment.EnumC66102c;
import java.util.Locale;
import java.util.Objects;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.c.b */
public interface AbstractC66019b {

    /* renamed from: a */
    public static final C66020a f148635a = C66020a.f148636a;

    /* renamed from: com.ss.android.ugc.aweme.qna.c.b$b */
    public enum EnumC66021b {
        TRANSLATE,
        SHOW_ORIGINAL,
        REPORT,
        VIEW_MORE_ANSWERS,
        DELETE;
        
        public static final C66022a Companion = new C66022a((byte) 0);

        static {
            Covode.recordClassIndex(77527);
        }

        /* renamed from: com.ss.android.ugc.aweme.qna.c.b$b$a */
        public static final class C66022a {
            static {
                Covode.recordClassIndex(77528);
            }

            private C66022a() {
            }

            public /* synthetic */ C66022a(byte b) {
                this();
            }

            /* renamed from: a */
            public static EnumC66021b m117833a(EnumC66102c cVar) {
                C89219l.m154721d(cVar, "");
                int i = C66023c.f148638a[cVar.ordinal()];
                if (i == 1) {
                    return EnumC66021b.SHOW_ORIGINAL;
                }
                if (i == 2) {
                    return EnumC66021b.TRANSLATE;
                }
                if (i == 3) {
                    return EnumC66021b.DELETE;
                }
                if (i == 4) {
                    return EnumC66021b.VIEW_MORE_ANSWERS;
                }
                throw new C89376n();
            }
        }
    }

    static {
        Covode.recordClassIndex(77525);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.c.b$a */
    public static final class C66020a {

        /* renamed from: a */
        static final /* synthetic */ C66020a f148636a = new C66020a();

        /* renamed from: a */
        public static String m117830a(boolean z) {
            return z ? "qa_personal_profile" : "qa_others_profile";
        }

        private C66020a() {
        }

        static {
            Covode.recordClassIndex(77526);
        }

        /* renamed from: a */
        public static void m117832a(String str, boolean z) {
            String str2;
            C89219l.m154721d(str, "");
            C33744d dVar = new C33744d();
            if (z) {
                str2 = "qa_personal_profile";
            } else {
                str2 = "qa_others_profile";
            }
            C39162r.m79460a("tap_question", dVar.mo59983a("enter_from", str2).mo59983a("question_id", str).f79943a);
        }

        /* renamed from: a */
        public static void m117831a(String str, EnumC66102c cVar, boolean z) {
            String str2;
            C89219l.m154721d(str, "");
            C89219l.m154721d(cVar, "");
            EnumC66021b a = EnumC66021b.C66022a.m117833a(cVar);
            C33744d dVar = new C33744d();
            if (z) {
                str2 = "qa_personal_profile";
            } else {
                str2 = "qa_others_profile";
            }
            C33744d a2 = dVar.mo59983a("enter_from", str2).mo59983a("question_id", str);
            String name = a.name();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase(Locale.ROOT);
            C89219l.m154716b(lowerCase, "");
            C39162r.m79460a("click_qa_option", a2.mo59983a("question_type", lowerCase).f79943a);
        }
    }
}
