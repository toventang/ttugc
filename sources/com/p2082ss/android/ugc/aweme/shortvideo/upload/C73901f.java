package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import androidx.core.p033d.C0646a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.shortvideo.C69807af;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73852c;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import dmt.p4542av.video.C88303z;
import java.io.File;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.f */
public final /* synthetic */ class C73901f implements C0646a.AbstractC0647a {

    /* renamed from: a */
    private final C73852c.C738531 f165921a;

    /* renamed from: b */
    private final SynthetiseResult f165922b;

    /* renamed from: c */
    private final VideoPublishEditModel f165923c;

    /* renamed from: d */
    private final C88303z f165924d;

    /* renamed from: e */
    private final VEWatermarkParam f165925e;

    static {
        Covode.recordClassIndex(86647);
    }

    C73901f(C73852c.C738531 r1, SynthetiseResult synthetiseResult, VideoPublishEditModel videoPublishEditModel, C88303z zVar, VEWatermarkParam vEWatermarkParam) {
        this.f165921a = r1;
        this.f165922b = synthetiseResult;
        this.f165923c = videoPublishEditModel;
        this.f165924d = zVar;
        this.f165925e = vEWatermarkParam;
    }

    @Override // androidx.core.p033d.C0646a.AbstractC0647a
    /* renamed from: a */
    public final void mo2678a() {
        String str;
        C73852c.C738531 r5 = this.f165921a;
        SynthetiseResult synthetiseResult = this.f165922b;
        VideoPublishEditModel videoPublishEditModel = this.f165923c;
        C88303z zVar = this.f165924d;
        VEWatermarkParam vEWatermarkParam = this.f165925e;
        SynthetiseResult clone = synthetiseResult.clone();
        clone.ret = -66666;
        if (!(C73852c.this.f165783b instanceof C69807af) || ((C69807af) C73852c.this.f165783b).f156001o != -1) {
            str = "VECompiler canceled";
        } else {
            str = "VECompiler stuck; " + C73852c.this.f165789h;
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            String a = C1764a.m5929a(Locale.US, "-6666601 videoSize:%d isRecordToEditFrameOptimizeAB:%b", new Object[]{Integer.valueOf(previewInfo != null ? previewInfo.getVideoList().size() : 0), true});
            C84911q.m145926b(a);
            C40971f.m82489a(a);
            clone.ret = -6666601;
        }
        if (r5.mo46226a((Throwable) new C71798ef(str, clone))) {
            C84911q.m145921a("ConcurrentUploadCompiler cancelUpload");
            if (C73852c.this.f165783b != null) {
                C73852c.this.f165783b.mo110157b();
            }
            zVar.f200423w.mo56387s();
        }
        if (synthetiseResult.outputFile != null) {
            File file = new File(synthetiseResult.outputFile);
            if (file.exists()) {
                C73852c.C738531.m129927a(file);
                C43213k.m86181a("incompleteFile delete incompleteFile : ".concat(String.valueOf(file)));
            }
            if (vEWatermarkParam != null) {
                File file2 = new File(vEWatermarkParam.extFile);
                if (file2.exists()) {
                    C73852c.C738531.m129927a(file2);
                    C43213k.m86181a("incompleteWatermarkFile delete incompleteWatermarkFile : ".concat(String.valueOf(file2)));
                }
            }
        }
    }
}
