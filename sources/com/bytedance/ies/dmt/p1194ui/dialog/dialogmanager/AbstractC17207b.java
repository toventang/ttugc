package com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.b */
public interface AbstractC17207b {

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.b$a */
    public enum EnumC17208a {
        TERMS_PRIVACY_COOKIE,
        SWIPE_UP_GUIDE,
        AGE_GATE,
        POLICY_NOTICE,
        PRIVATE_ACCOUNT_TIP,
        TERMS_CONSENT,
        PERSONALIZED_AD,
        UNDER_16_ALERT,
        GRADIENT_PUNISH_WARNING,
        FRIEND_INVITATION,
        LOCATION_PERMISSION_HINT,
        LOCATION_PERMISSION,
        SOCIAL_REC_FRIENDS,
        GROUP_CHAT_INVITE,
        FRIENDSLIST_PERMISSION,
        SEARCH_ICON_TIPS,
        TWO_FACTOR_AUTH,
        SAVE_LOGIN_INFO;

        static {
            Covode.recordClassIndex(19669);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.b$b */
    public enum EnumC17209b {
        EVENT_INIT;
        

        /* renamed from: b */
        private int f41119b;

        /* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.b$b$a */
        static final class C17210a {

            /* renamed from: a */
            static int f41120a;

            /* renamed from: b */
            public static final C17210a f41121b = new C17210a();

            private C17210a() {
            }

            static {
                Covode.recordClassIndex(19671);
            }
        }

        public final int getValue() {
            return this.f41119b;
        }

        static {
            Covode.recordClassIndex(19670);
        }

        public final void setValue(int i) {
            this.f41119b = i;
        }

        private EnumC17209b() {
            this.f41119b = r3;
            C17210a.f41120a = r3 + 1;
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.b$c */
    public interface AbstractC17211c {
        static {
            Covode.recordClassIndex(19672);
        }

        /* renamed from: a */
        void mo27201a();

        /* renamed from: a */
        void mo27202a(List<Integer> list);

        /* renamed from: a */
        void mo27203a(List<Integer> list, int i);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.b$d */
    public enum EnumC17212d {
        TERMS_PRIVACY_COOKIE,
        SWITCH_ACCOUNT_PENDING,
        AGE_GATE,
        POLICY_NOTICE;

        static {
            Covode.recordClassIndex(19673);
        }
    }

    static {
        Covode.recordClassIndex(19668);
    }
}
