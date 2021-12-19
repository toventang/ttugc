package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70089d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel */
public class VideoEditViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public boolean f157676a;

    /* renamed from: b */
    public C1213t<Integer> f157677b = new C1213t<>();

    /* renamed from: c */
    public C1213t<Boolean> f157678c = new C1213t<>();

    /* renamed from: d */
    public C1213t<Float> f157679d = new C1213t<>();

    /* renamed from: e */
    public C1213t<Long> f157680e = new C1213t<>();

    /* renamed from: f */
    public C1213t<Void> f157681f = new C1213t<>();

    /* renamed from: g */
    public C1213t<Void> f157682g = new C1213t<>();

    /* renamed from: h */
    public C1213t<Void> f157683h = new C1213t<>();

    /* renamed from: i */
    public C1213t<Void> f157684i = new C1213t<>();

    /* renamed from: j */
    public C1213t<Void> f157685j = new C1213t<>();

    /* renamed from: k */
    public C1213t<Void> f157686k = new C1213t<>();

    /* renamed from: l */
    public C1213t<Void> f157687l = new C1213t<>();

    /* renamed from: m */
    public C1213t<Void> f157688m = new C1213t<>();

    /* renamed from: n */
    public C1213t<Float> f157689n = new C1213t<>();

    /* renamed from: o */
    public C1213t<C0692e<Integer, Integer>> f157690o = new C1213t<>();

    /* renamed from: p */
    public C1213t<Void> f157691p = new C1213t<>();

    /* renamed from: q */
    public C1213t<Void> f157692q = new C1213t<>();

    /* renamed from: r */
    public C1213t<VideoSegment> f157693r = new C1213t<>();

    /* renamed from: s */
    public C1213t<Boolean> f157694s = new C1213t<>();

    /* renamed from: t */
    public C1213t<Void> f157695t = new C1213t<>();

    /* renamed from: u */
    public C1213t<Void> f157696u = new C1213t<>();

    /* renamed from: v */
    public C1213t<Void> f157697v = new C1213t<>();

    /* renamed from: w */
    public C1213t<CutVideoContext> f157698w = new C1213t<>();

    /* renamed from: x */
    HashMap<String, Integer> f157699x = new HashMap<>();

    /* renamed from: y */
    public AbstractC70515a f157700y;

    /* renamed from: z */
    private HashMap<String, Integer> f157701z = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel$a */
    public interface AbstractC70515a {
        static {
            Covode.recordClassIndex(82971);
        }

        /* renamed from: a */
        void mo110973a(VideoSegment videoSegment);

        /* renamed from: b */
        void mo110974b(VideoSegment videoSegment);
    }

    static {
        Covode.recordClassIndex(82970);
    }

    /* renamed from: a */
    public final void mo111215a(boolean z) {
        this.f157678c.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo111214a(List<MediaModel> list) {
        CutVideoContext cutVideoContext = new CutVideoContext();
        cutVideoContext.setVideoSegmentList(C70528i.m124562a(list));
        cutVideoContext.totalSpeed = EnumC78601i.NORMAL.value();
        m124481a(cutVideoContext);
    }

    /* renamed from: b */
    public final void mo111217b() {
        this.f157681f.setValue(null);
    }

    /* renamed from: c */
    public final void mo111222c() {
        this.f157683h.setValue(null);
    }

    /* renamed from: d */
    public final void mo111225d() {
        this.f157686k.setValue(null);
    }

    /* renamed from: e */
    public final void mo111226e() {
        this.f157695t.setValue(null);
    }

    /* renamed from: f */
    public final void mo111227f() {
        this.f157687l.setValue(null);
    }

    /* renamed from: g */
    public final void mo111228g() {
        this.f157688m.setValue(null);
    }

    /* renamed from: h */
    public final void mo111229h() {
        this.f157691p.setValue(null);
    }

    /* renamed from: i */
    public final void mo111230i() {
        this.f157692q.setValue(null);
    }

    /* renamed from: a */
    public final void mo111206a() {
        this.f157682g.setValue(null);
    }

    /* renamed from: j */
    public final List<VideoSegment> mo111231j() {
        return this.f157698w.getValue().getVideoSegmentList();
    }

    /* renamed from: k */
    public final List<VideoSegment> mo111232k() {
        return this.f157698w.getValue().getVideoSegmentList();
    }

    /* renamed from: l */
    public final float mo111233l() {
        return this.f157698w.getValue().totalSpeed;
    }

    /* renamed from: m */
    public final boolean mo111234m() {
        for (VideoSegment videoSegment : this.f157698w.getValue().getVideoSegmentList()) {
            if (videoSegment.mo110582f() != EnumC78601i.NORMAL.value()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo111235n() {
        if (!(this.f157698w.getValue() == null || this.f157698w.getValue().getVideoSegmentList() == null || this.f157698w.getValue().getVideoSegmentList().isEmpty())) {
            VideoSegment videoSegment = this.f157698w.getValue().getVideoSegmentList().get(0);
            if (videoSegment.f156714f <= 0 || videoSegment.f156715g <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m124481a(CutVideoContext cutVideoContext) {
        this.f157698w.setValue(cutVideoContext);
    }

    /* renamed from: b */
    public final void mo111218b(float f) {
        this.f157689n.setValue(Float.valueOf(f));
    }

    /* renamed from: c */
    public final void mo111223c(float f) {
        this.f157698w.getValue().totalSpeed = f;
    }

    /* renamed from: a */
    public final void mo111207a(float f) {
        this.f157679d.setValue(Float.valueOf(f));
    }

    /* renamed from: b */
    public final void mo111220b(List<VideoSegment> list) {
        CutVideoContext cutVideoContext = new CutVideoContext();
        cutVideoContext.setVideoSegmentList(list);
        cutVideoContext.totalSpeed = EnumC78601i.NORMAL.value();
        m124481a(cutVideoContext);
    }

    /* renamed from: c */
    public final VideoSegment mo111221c(int i) {
        return this.f157698w.getValue().getVideoSegmentList().get(i);
    }

    /* renamed from: a */
    public final int mo111205a(String str) {
        int i = 0;
        for (VideoSegment videoSegment : this.f157698w.getValue().getVideoSegmentList()) {
            if (videoSegment.mo110571a(true).equals(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo111216b(int i) {
        VideoSegment videoSegment = this.f157698w.getValue().getVideoSegmentList().get(i);
        if (this.f157701z.containsKey(videoSegment.mo110571a(true))) {
            return this.f157701z.get(videoSegment.mo110571a(true)).intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo111224c(List<VideoSegment> list) {
        if (list != null && !list.isEmpty()) {
            this.f157698w.getValue().getVideoSegmentList().addAll(list);
            C1213t<CutVideoContext> tVar = this.f157698w;
            tVar.postValue(tVar.getValue());
        }
    }

    /* renamed from: a */
    public final void mo111208a(int i) {
        this.f157677b.setValue(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo111219b(String str) {
        for (VideoSegment videoSegment : this.f157698w.getValue().getVideoSegmentList()) {
            if (videoSegment.mo110571a(true).equals(str)) {
                videoSegment.f156717i = true;
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo111210a(long j) {
        this.f157680e.setValue(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo111211a(C0692e<Integer, Integer> eVar) {
        this.f157690o.setValue(eVar);
    }

    /* renamed from: a */
    public final void mo111212a(VideoSegment videoSegment) {
        this.f157693r.setValue(videoSegment);
    }

    /* renamed from: a */
    public final void mo111209a(int i, int i2) {
        this.f157701z.put(this.f157698w.getValue().getVideoSegmentList().get(i).mo110571a(true), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final void mo111213a(C70089d dVar, int i) {
        VideoSegment videoSegment = this.f157698w.getValue().getVideoSegmentList().get(i);
        videoSegment.mo110572a(dVar.f156750d);
        videoSegment.mo110573a(dVar.f156747a);
        videoSegment.mo110576b(dVar.f156748b);
        videoSegment.f156718j = dVar.f156749c;
        AbstractC70515a aVar = this.f157700y;
        if (aVar != null) {
            aVar.mo110973a(videoSegment);
        }
    }
}
