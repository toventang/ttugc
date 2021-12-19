package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ai */
public class C69831ai extends BaseResponse {
    @AbstractC27891c(mo46611a = "save_model")
    public AVUploadSaveModel mSaveModel;
    public transient String materialId;
    @AbstractC27891c(mo46611a = "open_platform_name")
    public String openPlatformName;
    public int realVideoHeight;
    public int realVideoWidth;
    public int shoutOutsType = 0;
    public C74418d shoutoutData;
    public List<String> videoCoverPaths = new ArrayList();

    static {
        Covode.recordClassIndex(82237);
    }

    public String getVideoCoverPath() {
        if (!C84892d.m145850a(this.videoCoverPaths) && C80720e.m139927b(this.videoCoverPaths.get(0))) {
            return this.videoCoverPaths.get(0);
        }
        return null;
    }

    public void setVideoCoverPath(String str) {
        List<String> list = this.videoCoverPaths;
        if (list == null) {
            this.videoCoverPaths = new ArrayList();
        } else {
            list.clear();
        }
        this.videoCoverPaths.add(str);
    }
}
