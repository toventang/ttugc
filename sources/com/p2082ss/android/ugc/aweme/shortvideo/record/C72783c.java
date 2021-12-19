package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31192e;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.c */
public final class C72783c implements AbstractC31192e {

    /* renamed from: a */
    private final File f163204a;

    /* renamed from: b */
    private final File f163205b;

    /* renamed from: c */
    private final File f163206c;

    /* renamed from: d */
    private final File f163207d;

    /* renamed from: e */
    private final File f163208e;

    static {
        Covode.recordClassIndex(85469);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31192e
    /* renamed from: a */
    public final File mo56219a() {
        return this.f163204a;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31192e
    /* renamed from: b */
    public final File mo56220b() {
        return this.f163205b;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31192e
    /* renamed from: c */
    public final File mo56221c() {
        return this.f163206c;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31192e
    /* renamed from: d */
    public final File mo56222d() {
        return this.f163207d;
    }

    public C72783c(Workspace workspace) {
        C89219l.m154721d(workspace, "");
        File e = workspace.mo110096e();
        e.mkdirs();
        this.f163204a = e;
        this.f163205b = workspace.mo110096e();
        this.f163206c = workspace.mo110089a();
        this.f163207d = workspace.mo110091b();
        this.f163208e = new File(e, UGCMonitor.TYPE_PHOTO);
    }
}
