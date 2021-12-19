package com.bytedance.android.livesdkapi.host;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.host.i */
public interface AbstractC11812i extends AbstractC2953a {

    /* renamed from: a */
    public static final AbstractC11812i f28174a = new C11814b();

    /* renamed from: b */
    public static final C11813a f28175b = new C11813a((byte) 0);

    /* renamed from: a */
    void mo18876a(String str, String str2);

    /* renamed from: com.bytedance.android.livesdkapi.host.i$a */
    public static final class C11813a {
        static {
            Covode.recordClassIndex(13511);
        }

        private C11813a() {
        }

        public /* synthetic */ C11813a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.i$b */
    public static final class C11814b implements AbstractC11812i {
        static {
            Covode.recordClassIndex(13512);
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11812i
        /* renamed from: a */
        public final void mo18876a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
        }

        @Override // com.bytedance.android.live.base.AbstractC2953a
        public final void onInit() {
        }

        C11814b() {
        }
    }

    static {
        Covode.recordClassIndex(13510);
    }
}
