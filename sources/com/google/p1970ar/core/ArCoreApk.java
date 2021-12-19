package com.google.p1970ar.core;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.ArCoreApk */
public class ArCoreApk {
    static {
        Covode.recordClassIndex(32560);
    }

    protected ArCoreApk() {
    }

    public static ArCoreApk getInstance() {
        return C27117z.f64185a;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.google.ar.core.ArCoreApk$Availability */
    public static class Availability extends Enum<Availability> {
        private static final /* synthetic */ Availability[] $VALUES = $values();
        public static final Availability SUPPORTED_APK_TOO_OLD = new C27113v();
        public static final Availability SUPPORTED_INSTALLED = new C27114w();
        public static final Availability SUPPORTED_NOT_INSTALLED = new C27112u();
        public static final Availability UNKNOWN_CHECKING = new C27109r();
        public static final Availability UNKNOWN_ERROR = new C27108q();
        public static final Availability UNKNOWN_TIMED_OUT = new C27110s();
        public static final Availability UNSUPPORTED_DEVICE_NOT_CAPABLE = new C27111t();
        final int nativeCode;

        private static /* synthetic */ Availability[] $values() {
            return new Availability[]{UNKNOWN_ERROR, UNKNOWN_CHECKING, UNKNOWN_TIMED_OUT, UNSUPPORTED_DEVICE_NOT_CAPABLE, SUPPORTED_NOT_INSTALLED, SUPPORTED_APK_TOO_OLD, SUPPORTED_INSTALLED};
        }

        /* synthetic */ Availability(String str, int i, int i2, C27077a aVar) {
            this(str, i, i2);
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }

        public static Availability[] values() {
            return (Availability[]) $VALUES.clone();
        }

        static {
            Covode.recordClassIndex(32561);
        }

        public static Availability valueOf(String str) {
            return (Availability) Enum.valueOf(Availability.class, str);
        }

        static Availability forNumber(int i) {
            Availability[] values = values();
            for (Availability availability : values) {
                if (availability.nativeCode == i) {
                    return availability;
                }
            }
            StringBuilder sb = new StringBuilder(59);
            sb.append("Unexpected value for native Availability, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private Availability(String str, int i, int i2) {
            this.nativeCode = i2;
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$InstallBehavior */
    public enum InstallBehavior {
        REQUIRED(0),
        OPTIONAL(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32562);
        }

        static InstallBehavior forNumber(int i) {
            InstallBehavior[] values = values();
            for (InstallBehavior installBehavior : values) {
                if (installBehavior.nativeCode == i) {
                    return installBehavior;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native InstallBehavior, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private InstallBehavior(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$InstallStatus */
    public enum InstallStatus {
        INSTALLED(0),
        INSTALL_REQUESTED(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32563);
        }

        static InstallStatus forNumber(int i) {
            InstallStatus[] values = values();
            for (InstallStatus installStatus : values) {
                if (installStatus.nativeCode == i) {
                    return installStatus;
                }
            }
            StringBuilder sb = new StringBuilder(60);
            sb.append("Unexpected value for native InstallStatus, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private InstallStatus(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$UserMessageType */
    public enum UserMessageType {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32564);
        }

        static UserMessageType forNumber(int i) {
            UserMessageType[] values = values();
            for (UserMessageType userMessageType : values) {
                if (userMessageType.nativeCode == i) {
                    return userMessageType;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native UserMessageType, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private UserMessageType(int i) {
            this.nativeCode = i;
        }
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z, InstallBehavior installBehavior, UserMessageType userMessageType) {
        throw new UnsupportedOperationException("Stub");
    }
}
