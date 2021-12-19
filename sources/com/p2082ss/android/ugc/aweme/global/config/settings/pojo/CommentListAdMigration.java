package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CommentListAdMigration */
public class CommentListAdMigration {
    @AbstractC27891c(mo46611a = "enterprise_tag")
    private String enterpriseTag;
    @AbstractC27891c(mo46611a = "link_tag")
    private String linkTag;
    @AbstractC27891c(mo46611a = "star_atlas_tag")
    private String starAtlasTag;
    @AbstractC27891c(mo46611a = "task_tag")
    private String taskTag;

    static {
        Covode.recordClassIndex(62338);
    }

    public String getEnterpriseTag() {
        String str = this.enterpriseTag;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getLinkTag() {
        String str = this.linkTag;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getStarAtlasTag() {
        String str = this.starAtlasTag;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getTaskTag() {
        String str = this.taskTag;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
