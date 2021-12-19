package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.i */
public abstract class AbstractC1196i {

    /* renamed from: a */
    AtomicReference<Object> f3983a = new AtomicReference<>();

    static {
        Covode.recordClassIndex(1303);
    }

    /* renamed from: a */
    public abstract EnumC1199b mo4011a();

    /* renamed from: a */
    public abstract void mo4012a(AbstractC1203l lVar);

    /* renamed from: b */
    public abstract void mo4013b(AbstractC1203l lVar);

    /* renamed from: androidx.lifecycle.i$a */
    public enum EnumC1198a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static EnumC1198a upFrom(EnumC1199b bVar) {
            return m3894x70effc41(bVar);
        }

        public final EnumC1199b getTargetState() {
            switch (C11971.f3985b[ordinal()]) {
                case 1:
                case 2:
                    return EnumC1199b.CREATED;
                case 3:
                case 4:
                    return EnumC1199b.STARTED;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return EnumC1199b.RESUMED;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    return EnumC1199b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }

        static {
            Covode.recordClassIndex(1305);
        }

        /* renamed from: androidx_lifecycle_Lifecycle$Event_com_ss_android_ugc_aweme_lancet_ActivityLancet_upEvent */
        public static EnumC1198a m3894x70effc41(EnumC1199b bVar) {
            if (bVar == EnumC1199b.DESTROYED) {
                return ON_CREATE;
            }
            return Lifecycle$Event__upFrom$___twin___(bVar);
        }

        public static EnumC1198a Lifecycle$Event__upFrom$___twin___(EnumC1199b bVar) {
            int i = C11971.f3984a[bVar.ordinal()];
            if (i == 1) {
                return ON_START;
            }
            if (i == 2) {
                return ON_RESUME;
            }
            if (i != 5) {
                return null;
            }
            return ON_CREATE;
        }

        public static EnumC1198a downFrom(EnumC1199b bVar) {
            int i = C11971.f3984a[bVar.ordinal()];
            if (i == 1) {
                return ON_DESTROY;
            }
            if (i == 2) {
                return ON_STOP;
            }
            if (i != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        public static EnumC1198a downTo(EnumC1199b bVar) {
            int i = C11971.f3984a[bVar.ordinal()];
            if (i == 1) {
                return ON_STOP;
            }
            if (i == 2) {
                return ON_PAUSE;
            }
            if (i != 4) {
                return null;
            }
            return ON_DESTROY;
        }

        public static EnumC1198a upTo(EnumC1199b bVar) {
            int i = C11971.f3984a[bVar.ordinal()];
            if (i == 1) {
                return ON_CREATE;
            }
            if (i == 2) {
                return ON_START;
            }
            if (i != 3) {
                return null;
            }
            return ON_RESUME;
        }
    }

    /* renamed from: androidx.lifecycle.i$b */
    public enum EnumC1199b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        static {
            Covode.recordClassIndex(1306);
        }

        public final boolean isAtLeast(EnumC1199b bVar) {
            if (compareTo((Enum) bVar) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.i$1 */
    public static /* synthetic */ class C11971 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3984a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3985b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0074 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0088 */
        static {
            /*
            // Method dump skipped, instructions count: 147
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.AbstractC1196i.C11971.<clinit>():void");
        }
    }
}
