package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager */
public interface ILinkTypeTagsPriorityManager {
    static {
        Covode.recordClassIndex(79631);
    }

    boolean shouldShowAnchor(Aweme aweme);

    boolean shouldShowCommerce(Aweme aweme, boolean z, int i);

    boolean shouldShowMovie(Aweme aweme, boolean z, int i);

    boolean shouldShowOpenPlatform(Aweme aweme, boolean z, int i);

    boolean shouldShowSticker(Aweme aweme, boolean z, int i);

    /* renamed from: com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager$DefaultImpls */
    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(79632);
        }

        public static /* synthetic */ boolean shouldShowCommerce$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    aweme = null;
                }
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowCommerce(aweme, z, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowCommerce");
        }

        public static /* synthetic */ boolean shouldShowMovie$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    aweme = null;
                }
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowMovie(aweme, z, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowMovie");
        }

        public static /* synthetic */ boolean shouldShowOpenPlatform$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    aweme = null;
                }
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowOpenPlatform(aweme, z, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowOpenPlatform");
        }

        public static /* synthetic */ boolean shouldShowSticker$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    aweme = null;
                }
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowSticker(aweme, z, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowSticker");
        }
    }
}
