package com.p2082ss.android.ugc.aweme.shortvideo;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.p */
public abstract class AbstractC72463p {

    /* renamed from: a */
    public AbstractC63220bg.AbstractC63221a f162448a;

    static {
        Covode.recordClassIndex(85138);
    }

    /* renamed from: a */
    public abstract void mo110464a(Fragment fragment, View view);

    /* renamed from: a */
    public final void mo114730a() {
        this.f162448a.mo101700d();
    }

    /* renamed from: b */
    public final String mo114733b() {
        return this.f162448a.mo101692a();
    }

    /* renamed from: c */
    public final int mo114734c() {
        return this.f162448a.mo101698b();
    }

    /* renamed from: a */
    public final void mo114731a(int i) {
        AbstractC63220bg.AbstractC63221a aVar = this.f162448a;
        if (aVar != null) {
            aVar.mo101693a(i);
        }
    }

    /* renamed from: a */
    public final void mo114732a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("creation_id", videoPublishEditModel.creationId);
            hashMap.put("enter_from", "video_post_page");
            hashMap.put("content_type", "video");
            hashMap.put("shoot_way", videoPublishEditModel.mShootWay);
            this.f162448a.mo101699c().setTag(hashMap);
        }
    }

    protected AbstractC72463p(Fragment fragment, View view, int i, boolean z) {
        mo110464a(fragment, view);
    }
}
