package com.p2082ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.f */
public final class C78536f extends AbstractC78487a {

    /* renamed from: e */
    private int f176487e;

    /* renamed from: f */
    private List<EditVideoSegment> f176488f;

    static {
        Covode.recordClassIndex(91668);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l
    /* renamed from: e */
    public final String mo122447e() {
        return "extract_movie";
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: a */
    public final void mo122408a() {
        super.mo122408a();
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: d */
    public final List<C78595z> mo122412d() {
        return C78506aa.m137069a(this.f176488f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ Void mo122460f() {
        if (C84904k.m145909a(this.f176488f)) {
            return null;
        }
        ArrayList<EditVideoSegment> arrayList = new ArrayList();
        ArrayList<EditVideoSegment> arrayList2 = new ArrayList();
        for (EditVideoSegment editVideoSegment : this.f176488f) {
            if (C72440e.m127817b(editVideoSegment.getVideoPath())) {
                arrayList.add(editVideoSegment);
            } else {
                arrayList2.add(editVideoSegment);
            }
        }
        HashSet hashSet = new HashSet();
        for (EditVideoSegment editVideoSegment2 : arrayList) {
            Bitmap a = C84891c.m145844a(editVideoSegment2.getVideoPath(), C78549k.f176544a);
            if (a != null) {
                String a2 = this.f176393c.mo122482a();
                C84891c.m145848a(a, new File(a2), 70, Bitmap.CompressFormat.JPEG);
                hashSet.add(a2);
            }
        }
        String str = this.f176393c.f176546b;
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        int i = 0;
        for (EditVideoSegment editVideoSegment3 : arrayList2) {
            VEUtils.saveVideoFrames(editVideoSegment3.getVideoPath().toString(), m137105a(editVideoSegment3), C78549k.f176544a[0], -1, false, str, i + "extract_frame", 1);
            i++;
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                hashSet.add(file.getAbsolutePath());
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList3.add(it.next());
        }
        ArrayList<FrameItem> arrayList4 = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new FrameItem((String) it2.next()));
        }
        this.f176391a.clearAllFrames();
        this.f176391a.addFrameSegment(arrayList4, null);
        return null;
    }

    public C78536f(List<EditVideoSegment> list) {
        this.f176488f = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: a */
    public final void mo122410a(boolean z) {
        super.mo122410a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: a */
    public final void mo122409a(AbstractC78550l.AbstractC78551a aVar) {
        super.mo122409a(aVar);
        if (m137043b()) {
            C1731i.m5640b(new CallableC78537g(this), C1731i.f5562a).mo5532a((AbstractC1729g) new C78538h(this, aVar));
        }
    }

    /* renamed from: a */
    private int[] m137105a(EditVideoSegment editVideoSegment) {
        int[] iArr;
        int i = 0;
        if (editVideoSegment.getVideoCutInfo() != null) {
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            int end = ((int) (videoCutInfo.getEnd() - videoCutInfo.getStart())) / 500;
            this.f176487e = end;
            iArr = new int[end];
            while (i < this.f176487e) {
                iArr[i] = (int) (videoCutInfo.getStart() + ((long) (i * 500)));
                i++;
            }
        } else {
            int duration = (int) (editVideoSegment.getVideoFileInfo().getDuration() / 500);
            this.f176487e = duration;
            iArr = new int[duration];
            while (i < this.f176487e) {
                iArr[i] = i * 500;
                i++;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo122459a(AbstractC78550l.AbstractC78551a aVar, C1731i iVar) {
        aVar.mo122481a(iVar.mo5535a());
        super.mo122410a(true);
        super.mo122408a();
        return null;
    }
}
