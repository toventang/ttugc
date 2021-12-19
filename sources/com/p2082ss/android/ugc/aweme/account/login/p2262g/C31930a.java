package com.p2082ss.android.ugc.aweme.account.login.p2262g;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.g.a */
public final class C31930a {

    /* renamed from: b */
    public static final C31931a f76274b = new C31931a((byte) 0);

    /* renamed from: a */
    public AbstractC31932b f76275a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.g.a$b */
    public interface AbstractC31932b {
        static {
            Covode.recordClassIndex(38676);
        }

        /* renamed from: a */
        void mo57858a();

        /* renamed from: b */
        void mo57859b();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.g.a$d */
    public final /* synthetic */ class C31934d implements OnActivityResultCallback {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89187q f76276a;

        static {
            Covode.recordClassIndex(38678);
        }

        public C31934d(AbstractC89187q qVar) {
            this.f76276a = qVar;
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
            C89219l.m154716b(this.f76276a.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent), "");
        }
    }

    static {
        Covode.recordClassIndex(38674);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.g.a$a */
    public static final class C31931a {
        static {
            Covode.recordClassIndex(38675);
        }

        private C31931a() {
        }

        public /* synthetic */ C31931a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.g.a$c */
    public static final /* synthetic */ class C31933c extends C89217j implements AbstractC89187q<Integer, Integer, Intent, C89391z> {
        static {
            Covode.recordClassIndex(38677);
        }

        public C31933c(C31930a aVar) {
            super(3, aVar, C31930a.class, "onActivityResult", "onActivityResult(IILandroid/content/Intent;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Integer num, Integer num2, Intent intent) {
            AbstractC31932b bVar;
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            C31930a aVar = (C31930a) this.receiver;
            if (intValue == 10086) {
                if (intValue2 == -1) {
                    AbstractC31932b bVar2 = aVar.f76275a;
                    if (bVar2 != null) {
                        bVar2.mo57858a();
                    }
                } else if (intValue2 == 0 && (bVar = aVar.f76275a) != null) {
                    bVar.mo57859b();
                }
            }
            return C89391z.f203057a;
        }
    }
}
