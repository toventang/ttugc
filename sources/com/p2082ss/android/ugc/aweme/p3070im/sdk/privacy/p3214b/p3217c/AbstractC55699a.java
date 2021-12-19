package com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3217c;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.AbstractC23219c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.c.a */
public abstract class AbstractC55699a extends AbstractC23219c.C23221b {
    static {
        Covode.recordClassIndex(65482);
    }

    private AbstractC55699a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.c.a$a */
    public static final class C55700a extends AbstractC55699a {

        /* renamed from: a */
        public static final C55700a f127054a = new C55700a();

        private C55700a() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(65483);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.c.a$b */
    public static final class C55701b extends AbstractC55699a {

        /* renamed from: a */
        public final int f127055a;

        static {
            Covode.recordClassIndex(65484);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C55701b) && this.f127055a == ((C55701b) obj).f127055a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f127055a;
        }

        public final String toString() {
            return "SelectValue(value=" + this.f127055a + ")";
        }

        public C55701b(int i) {
            super((byte) 0);
            this.f127055a = i;
        }
    }

    public /* synthetic */ AbstractC55699a(byte b) {
        this();
    }
}
