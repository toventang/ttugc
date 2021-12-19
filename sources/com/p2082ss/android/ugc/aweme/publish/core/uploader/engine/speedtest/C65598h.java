package com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.h */
public final class C65598h {

    /* renamed from: b */
    public static final C65599a f147835b = new C65599a((byte) 0);

    /* renamed from: a */
    long f147836a;

    /* renamed from: c */
    private final int f147837c;

    /* renamed from: d */
    private final boolean f147838d;

    static {
        Covode.recordClassIndex(77089);
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.h$a */
    public static final class C65599a {
        static {
            Covode.recordClassIndex(77090);
        }

        private C65599a() {
        }

        public /* synthetic */ C65599a(byte b) {
            this();
        }
    }

    private C65598h(int i) {
        this.f147837c = i;
        this.f147838d = false;
    }

    public /* synthetic */ C65598h(int i, byte b) {
        this(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m117390a(int i, AbstractC89171a<C89391z> aVar) {
        boolean z;
        C89219l.m154721d(aVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f147836a > ((long) i)) {
            z = true;
        } else {
            z = false;
        }
        String str = "allow:" + z + " gap:" + (currentTimeMillis - this.f147836a) + " filterGap:" + i;
        if (z) {
            if (this.f147838d) {
                this.f147836a = currentTimeMillis;
            }
            aVar.invoke();
            return;
        }
        C73991bj.m130128a("InvokeFilter ".concat(String.valueOf(str)));
    }
}
