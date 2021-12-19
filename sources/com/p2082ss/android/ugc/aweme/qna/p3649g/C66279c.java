package com.p2082ss.android.ugc.aweme.qna.p3649g;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.qna.p3647e.C66061b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.g.c */
public final class C66279c {

    /* renamed from: a */
    public static final C66279c f149007a = new C66279c();

    private C66279c() {
    }

    static {
        Covode.recordClassIndex(77787);
    }

    /* renamed from: a */
    public static String m117958a(int i) {
        String string = C17867d.m33078a().getString(i);
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.g.c$b */
    public static final class C66281b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C66281b f149010a = new C66281b();

        static {
            Covode.recordClassIndex(77789);
        }

        C66281b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_wifi_slash;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.g.c$c */
    public static final class C66282c extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f149011a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView f149012b;

        static {
            Covode.recordClassIndex(77790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66282c(AbstractC89171a aVar, TuxStatusView tuxStatusView) {
            super(1);
            this.f149011a = aVar;
            this.f149012b = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setText(C66279c.m117958a(R.string.bh));
            tuxButton2.setButtonSize(3);
            tuxButton2.setButtonVariant(1);
            tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise));
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.qna.p3649g.C66279c.C66282c.View$OnClickListenerC662831 */

                /* renamed from: a */
                final /* synthetic */ C66282c f149013a;

                static {
                    Covode.recordClassIndex(77791);
                }

                {
                    this.f149013a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f149013a.f149011a.invoke();
                    this.f149013a.f149012b.mo37867a();
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.g.c$d */
    public static final class C66284d extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f149014a;

        static {
            Covode.recordClassIndex(77792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66284d(boolean z) {
            super(1);
            this.f149014a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            int i;
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (!this.f149014a || !C66061b.m117871a()) {
                i = R.raw.icon_large_error_qa;
            } else {
                i = R.raw.icon_large_lightbulb;
            }
            aVar2.f54431a = i;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.g.c$a */
    public static final class C66280a {

        /* renamed from: a */
        public final String f149008a;

        /* renamed from: b */
        public final String f149009b;

        static {
            Covode.recordClassIndex(77788);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C66280a)) {
                return false;
            }
            C66280a aVar = (C66280a) obj;
            return C89219l.m154714a(this.f149008a, aVar.f149008a) && C89219l.m154714a(this.f149009b, aVar.f149009b);
        }

        public final int hashCode() {
            String str = this.f149008a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f149009b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "TitleMessagePair(title=" + this.f149008a + ", message=" + this.f149009b + ")";
        }

        public C66280a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f149008a = str;
            this.f149009b = str2;
        }
    }

    /* renamed from: a */
    public static String m117959a(int i, String str) {
        String string = C17867d.m33078a().getString(i, str);
        C89219l.m154716b(string, "");
        return string;
    }
}
