package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70091f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel */
public class CutMultiVideoViewModel extends AbstractC1174ac implements AbstractC33974au {

    /* renamed from: a */
    public C1213t<C0692e<Integer, Integer>> f156529a = new C1213t<>();

    /* renamed from: b */
    public C1213t<Long> f156530b = new C1213t<>();

    /* renamed from: c */
    public C1213t<Long> f156531c = new C1213t<>();

    /* renamed from: d */
    public C1213t<Float> f156532d = new C1213t<>();

    /* renamed from: e */
    public C1213t<Void> f156533e = new C1213t<>();

    /* renamed from: f */
    public C1213t<VideoSegment> f156534f = new C1213t<>();

    /* renamed from: g */
    public C1213t<C0692e<Integer, Integer>> f156535g = new C1213t<>();

    /* renamed from: h */
    public C1213t<Void> f156536h = new C1213t<>();

    /* renamed from: i */
    public C1213t<Void> f156537i = new C1213t<>();

    /* renamed from: j */
    public C1213t<C70091f> f156538j = new C1213t<>();

    /* renamed from: k */
    public boolean f156539k;

    /* renamed from: l */
    public int f156540l;

    /* renamed from: m */
    public long f156541m;

    /* renamed from: n */
    private HashMap<String, Integer> f156542n = new HashMap<>();

    static {
        Covode.recordClassIndex(82428);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: b */
    public final void mo110478b() {
        this.f156533e.setValue(null);
    }

    /* renamed from: c */
    public final void mo110479c() {
        this.f156536h.setValue(null);
    }

    /* renamed from: d */
    public final void mo110480d() {
        this.f156537i.setValue(null);
    }

    /* renamed from: a */
    public final void mo110472a() {
        this.f156529a.setValue(C0692e.m2449a(0, 0));
    }

    /* renamed from: a */
    public final void mo110475a(VideoSegment videoSegment) {
        this.f156534f.setValue(videoSegment);
    }

    /* renamed from: a */
    public final void mo110476a(C70091f fVar) {
        this.f156538j.setValue(fVar);
    }

    /* renamed from: a */
    public final void mo110477a(String str) {
        this.f156542n.put(str, 1);
    }

    /* renamed from: a */
    public final void mo110473a(int i, int i2) {
        this.f156535g.setValue(C0692e.m2449a(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: a */
    public final void mo110474a(long j, List<VideoSegment> list, float f) {
        int i;
        this.f156531c.setValue(Long.valueOf(j));
        if (this.f156529a.getValue() != null) {
            i = this.f156529a.getValue().f2751b.intValue();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!list.get(i2).f156717i) {
                arrayList.add(list.get(i2));
            }
        }
        long j2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            VideoSegment videoSegment = (VideoSegment) arrayList.get(i3);
            j2 = (long) (((float) j2) + (((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / (videoSegment.mo110582f() * f)));
            if (j2 > j) {
                this.f156529a.setValue(C0692e.m2449a(Integer.valueOf(i), Integer.valueOf(i3)));
                return;
            }
        }
    }
}
