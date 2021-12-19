package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior;

import android.content.Context;
import androidx.room.AbstractC1533j;
import androidx.room.C1532i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.a */
public final class C50577a {

    /* renamed from: b */
    public static C50577a f116881b = C50579b.f116884a;

    /* renamed from: c */
    public static final C50578a f116882c = new C50578a((byte) 0);

    /* renamed from: a */
    final RuntimeBehaviorDataBase f116883a;

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.a$a */
    public static final class C50578a {
        static {
            Covode.recordClassIndex(59729);
        }

        private C50578a() {
        }

        public /* synthetic */ C50578a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.a$b */
    static final class C50579b {

        /* renamed from: a */
        static final C50577a f116884a = new C50577a(C17867d.m33078a(), (byte) 0);

        /* renamed from: b */
        public static final C50579b f116885b = new C50579b();

        private C50579b() {
        }

        static {
            Covode.recordClassIndex(59730);
        }
    }

    static {
        Covode.recordClassIndex(59728);
    }

    private C50577a(Context context) {
        AbstractC1533j a = C1532i.m5166a(context, RuntimeBehaviorDataBase.class, "runtimeBehavior").mo5096a();
        C89219l.m154716b(a, "");
        this.f116883a = (RuntimeBehaviorDataBase) a;
    }

    public /* synthetic */ C50577a(Context context, byte b) {
        this(context);
    }
}
