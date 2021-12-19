package com.p2082ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IStickerService */
public interface IStickerService {
    static {
        Covode.recordClassIndex(60670);
    }

    /* renamed from: com.ss.android.ugc.aweme.framework.services.IStickerService$FaceSticker */
    public static class FaceSticker {
        public String extra;
        public ToolsUrlModel fileUrl;
        public String hint;
        public ToolsUrlModel iconUrl;

        /* renamed from: id */
        public String f118514id;
        public boolean isVideoUsedSticker;
        public String localPath;
        public String name;
        public List<String> requirements = new ArrayList();
        public String sdkExtra;
        public long stickerId;
        public List<String> tags;
        public List<String> types;
        private boolean usedFromRecover;

        static {
            Covode.recordClassIndex(60671);
        }

        public boolean isUsedFromRecover() {
            return this.usedFromRecover;
        }

        public void setUsedFromRecover(boolean z) {
            this.usedFromRecover = z;
        }
    }
}
