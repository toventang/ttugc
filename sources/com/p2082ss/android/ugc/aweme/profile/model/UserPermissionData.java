package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.HashMap;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserPermissionData */
public final class UserPermissionData {

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.ss.android.ugc.aweme.profile.model.UserPermissionData$UserPermissionRequestType */
    public static final class UserPermissionRequestType extends Enum<UserPermissionRequestType> {
        private static final /* synthetic */ UserPermissionRequestType[] $VALUES;
        public static final Companion Companion = new Companion(null);
        public static final UserPermissionRequestType DEFAULT_TYPE;
        private int type;

        static {
            Covode.recordClassIndex(75234);
            DEFAULT_TYPE default_type = new DEFAULT_TYPE("DEFAULT_TYPE", 0);
            DEFAULT_TYPE = default_type;
            $VALUES = new UserPermissionRequestType[]{default_type};
        }

        public static UserPermissionRequestType valueOf(String str) {
            return (UserPermissionRequestType) Enum.valueOf(UserPermissionRequestType.class, str);
        }

        public static UserPermissionRequestType[] values() {
            return (UserPermissionRequestType[]) $VALUES.clone();
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.model.UserPermissionData$UserPermissionRequestType$Companion */
        public static final class Companion {
            static {
                Covode.recordClassIndex(75235);
            }

            private Companion() {
            }

            public /* synthetic */ Companion(C89214g gVar) {
                this();
            }

            public final UserPermissionRequestType fromInt(int i) {
                UserPermissionRequestType[] values = UserPermissionRequestType.values();
                for (UserPermissionRequestType userPermissionRequestType : values) {
                    if (userPermissionRequestType.getType() == i) {
                        return userPermissionRequestType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        public final int getType() {
            return this.type;
        }

        public final void setType(int i) {
            this.type = i;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.model.UserPermissionData$UserPermissionRequestType$DEFAULT_TYPE */
        static final class DEFAULT_TYPE extends UserPermissionRequestType {
            static {
                Covode.recordClassIndex(75236);
            }

            public final String toString() {
                return "DEFAULT_TYPE";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            DEFAULT_TYPE(String str, int i) {
                super(str, i, 0, null);
            }
        }

        private UserPermissionRequestType(String str, int i, int i2) {
            this.type = i2;
        }

        public /* synthetic */ UserPermissionRequestType(String str, int i, int i2, C89214g gVar) {
            this(str, i, i2);
        }
    }

    static {
        Covode.recordClassIndex(75232);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.model.UserPermissionData$UserPermissionInfo */
    public static final class UserPermissionInfo implements Serializable {
        @AbstractC27891c(mo46611a = "age_gate_region")
        private String ageGateRegion = "";
        @AbstractC27891c(mo46611a = "permissions")
        private String permissions = "";

        static {
            Covode.recordClassIndex(75233);
        }

        public final String getAgeGateRegion() {
            return this.ageGateRegion;
        }

        public final String getPermissions() {
            return this.permissions;
        }

        public final HashMap<String, Boolean> permissionsMap() {
            Object a = new C27910f().mo46670a(this.permissions, (Class) new HashMap().getClass());
            C89219l.m154716b(a, "");
            return (HashMap) a;
        }

        public final String toString() {
            String str;
            String str2;
            if (!C89361p.m154870a((CharSequence) this.ageGateRegion)) {
                str = "age_gate_region=" + this.ageGateRegion + ',';
            } else {
                str = "";
            }
            StringBuilder append = new StringBuilder("{").append(str).append("permissions=\"");
            String str3 = this.permissions;
            if (str3 != null) {
                str2 = C89361p.m154868a(str3, "\"", "");
            } else {
                str2 = null;
            }
            return append.append(str2).append('\"').append("}").toString();
        }

        public final void setPermissions(String str) {
            this.permissions = str;
        }

        public final void setAgeGateRegion(String str) {
            C89219l.m154721d(str, "");
            this.ageGateRegion = str;
        }
    }
}
