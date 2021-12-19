package com.p2082ss.android.ugc.aweme.story.record.p4066f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import com.p2082ss.android.ugc.aweme.shortvideo.C71862h;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.story.base.model.ETParams;
import com.p2082ss.android.ugc.aweme.story.base.model.EditContext;
import com.p2082ss.android.ugc.aweme.story.record.recordcontrol.StoryWorkspaceImpl;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.f.a */
public final class C77561a {

    /* renamed from: a */
    public String f173949a;

    /* renamed from: b */
    public String f173950b;

    /* renamed from: c */
    public String f173951c;

    /* renamed from: d */
    public String f173952d;

    /* renamed from: e */
    public String f173953e;

    /* renamed from: f */
    public boolean f173954f;

    /* renamed from: g */
    public StoryWorkspaceImpl f173955g;

    /* renamed from: h */
    public String f173956h;

    /* renamed from: i */
    public String f173957i = "";

    /* renamed from: j */
    public long f173958j = -1;

    /* renamed from: k */
    public final CameraComponentModel f173959k;

    static {
        Covode.recordClassIndex(90598);
    }

    /* renamed from: a */
    public final String mo121120a() {
        if (this.f173949a == null) {
            this.f173949a = C71862h.m126882a(this.f173950b);
        }
        return this.f173949a;
    }

    /* renamed from: b */
    public final Workspace mo121123b() {
        Workspace workspace = this.f173959k.f155652h;
        C89219l.m154716b(workspace, "");
        return workspace;
    }

    /* renamed from: d */
    public final ExtractFramesModel mo121125d() {
        ExtractFramesModel extractFramesModel = this.f173959k.f155667w;
        C89219l.m154716b(extractFramesModel, "");
        return extractFramesModel;
    }

    /* renamed from: g */
    private final float m135555g() {
        return new BigDecimal((double) this.f173959k.f155636A).setScale(1, 4).floatValue();
    }

    /* renamed from: c */
    public final void mo121124c() {
        this.f173949a = C71862h.m126882a(this.f173950b);
        StoryWorkspaceImpl storyWorkspaceImpl = this.f173955g;
        if (storyWorkspaceImpl != null) {
            storyWorkspaceImpl.mo121154e(mo121120a());
        }
    }

    /* renamed from: e */
    public final ShortVideoContext mo121126e() {
        ShortVideoContext shortVideoContext = new ShortVideoContext(this.f173959k);
        shortVideoContext.f155831p = this.f173951c;
        shortVideoContext.f155830o = this.f173950b;
        shortVideoContext.f155829n = mo121120a();
        shortVideoContext.f155780aN = true;
        shortVideoContext.f155781aO = this.f173954f;
        shortVideoContext.mo110005a(mo121123b());
        shortVideoContext.mo110024d(false);
        return shortVideoContext;
    }

    /* renamed from: f */
    public final EditContext mo121127f() {
        boolean z;
        C70650dt j;
        TimeSpeedModelExtension timeSpeedModelExtension;
        List<String> aRTexts;
        C70650dt j2;
        TimeSpeedModelExtension timeSpeedModelExtension2;
        ETParams eTParams = new ETParams(this.f173951c, this.f173952d, this.f173956h, 0, 0, m135555g(), 24, null);
        boolean z2 = this.f173954f;
        File e = mo121123b().mo110096e();
        C70650dt j3 = this.f173959k.mo109898j();
        if (j3 == null || j3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        List<String> list = null;
        if (z || (j = this.f173959k.mo109898j()) == null || (timeSpeedModelExtension = (TimeSpeedModelExtension) j.get(0)) == null) {
            aRTexts = null;
        } else {
            aRTexts = timeSpeedModelExtension.getARTexts();
        }
        C70650dt j4 = this.f173959k.mo109898j();
        if (!(j4 == null || j4.isEmpty() || (j2 = this.f173959k.mo109898j()) == null || (timeSpeedModelExtension2 = (TimeSpeedModelExtension) j2.get(0)) == null)) {
            list = timeSpeedModelExtension2.getBubbleTexts();
        }
        return new EditContext(eTParams, null, null, z2, e, aRTexts, list, ShortVideoContext.m123166a((ArrayList<TimeSpeedModelExtension>) this.f173959k.f155650f), 0, null, null, null, null, this.f173959k.mo109897i(), this.f173958j, this.f173957i, 7942, null);
    }

    /* renamed from: a */
    public final void mo121122a(String str) {
        C89219l.m154721d(str, "");
        this.f173957i = str;
    }

    public C77561a(CameraComponentModel cameraComponentModel) {
        C89219l.m154721d(cameraComponentModel, "");
        this.f173959k = cameraComponentModel;
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        this.f173950b = uuid;
    }

    /* renamed from: a */
    public final void mo121121a(ExtractFramesModel extractFramesModel) {
        C89219l.m154721d(extractFramesModel, "");
        this.f173959k.f155667w = extractFramesModel;
    }
}
