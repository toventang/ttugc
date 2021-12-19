package com.p2082ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.ac */
public final class C78513ac extends AbstractC78487a {

    /* renamed from: e */
    private int f176438e;

    /* renamed from: f */
    private EditPreviewInfo f176439f;

    static {
        Covode.recordClassIndex(91645);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l
    /* renamed from: e */
    public final String mo122447e() {
        return "extract_upload";
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: d */
    public final List<C78595z> mo122412d() {
        return C78506aa.m137069a(this.f176439f.getVideoList());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ Void mo122448f() {
        EditPreviewInfo editPreviewInfo = this.f176439f;
        if (editPreviewInfo != null && !editPreviewInfo.getVideoList().isEmpty()) {
            String str = this.f176393c.f176546b;
            if (!str.endsWith(File.separator)) {
                str = str + File.separator;
            }
            int i = 0;
            for (EditVideoSegment editVideoSegment : this.f176439f.getVideoList()) {
                VEUtils.saveVideoFrames(editVideoSegment.getVideoPath(), m137085a(editVideoSegment), C78549k.f176544a[0], -1, false, str, i + "extract_frame", 1);
                i++;
            }
            File[] listFiles = new File(str).listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    this.f176391a.addFrameAtLastSegment(new FrameItem(file.getAbsolutePath()));
                }
            }
        }
        return null;
    }

    public C78513ac(EditPreviewInfo editPreviewInfo) {
        this.f176439f = editPreviewInfo;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: a */
    public final void mo122409a(AbstractC78550l.AbstractC78551a aVar) {
        super.mo122409a(aVar);
        if (m137043b()) {
            C1731i.m5640b(new CallableC78514ad(this), C1731i.f5562a).mo5532a((AbstractC1729g) new C78515ae(this, aVar));
        }
    }

    /* renamed from: a */
    private int[] m137085a(EditVideoSegment editVideoSegment) {
        int[] iArr;
        int i = 0;
        if (editVideoSegment.getVideoCutInfo() != null) {
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            int end = ((int) (videoCutInfo.getEnd() - videoCutInfo.getStart())) / 500;
            this.f176438e = end;
            iArr = new int[end];
            while (i < this.f176438e) {
                iArr[i] = (int) (videoCutInfo.getStart() + ((long) (i * 500)));
                i++;
            }
        } else {
            int duration = (int) (editVideoSegment.getVideoFileInfo().getDuration() / 500);
            this.f176438e = duration;
            iArr = new int[duration];
            while (i < this.f176438e) {
                iArr[i] = i * 500;
                i++;
            }
        }
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("split_extract_frame", "upload frame size: " + iArr.length);
        return iArr;
    }
}
