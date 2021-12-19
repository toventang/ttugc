package com.p2082ss.android.ugc.aweme.services.external;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69907ca;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70661b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig */
public interface IPrivacyConfig {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig$IPermissionModule */
    public interface IPermissionModule {
        public static final Companion Companion = Companion.$$INSTANCE;

        static {
            Covode.recordClassIndex(79806);
        }

        boolean isEnablePublishExclusionExperiment();

        void onSaveInstanceState(Bundle bundle);

        void receivePermissionResult(int i);

        void restoreSavedInstanceState(Bundle bundle);

        void setOnPermissionSetListener(AbstractC69907ca caVar);

        void setupV2(AbstractC69923ce ceVar, IPermissionPostCallback iPermissionPostCallback);

        /* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig$IPermissionModule$Companion */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            static {
                Covode.recordClassIndex(79807);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig$IPermissionPostCallback */
    public interface IPermissionPostCallback {
        static {
            Covode.recordClassIndex(79808);
        }

        void doPostData(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig$IPermissionSettingItem */
    public interface IPermissionSettingItem {
        static {
            Covode.recordClassIndex(79809);
        }

        View asView();

        TextView getPrivateHint();

        ImageView getPrivateIcon();

        void setAdvPromotable(boolean z);

        void setAllowRecommend(int i);

        void setFromChangePrivacy(boolean z);

        void setMission(int i, String str);

        void setPermission(int i, List<? extends User> list, int i2);

        void setPermission(int i, boolean z, String str);
    }

    static {
        Covode.recordClassIndex(79804);
    }

    C70661b checkDuetReactPermission(String str, int i);

    IPermissionModule createPermissionModule(Fragment fragment, IPermissionSettingItem iPermissionSettingItem, int i, boolean z);

    IPermissionSettingItem createPermissionSettingItem(Context context);

    /* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79805);
        }
    }
}
