package com.p2082ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.b */
public final class C70087b {

    /* renamed from: a */
    HashMap<String, Float> f156734a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, Float> f156735b = new HashMap<>();

    /* renamed from: c */
    public long f156736c;

    /* renamed from: d */
    public long f156737d;

    /* renamed from: e */
    public float f156738e;

    /* renamed from: f */
    public long f156739f;

    /* renamed from: g */
    public float f156740g;

    /* renamed from: h */
    public long f156741h;

    /* renamed from: i */
    public long f156742i;

    /* renamed from: j */
    private float f156743j;

    static {
        Covode.recordClassIndex(82510);
    }

    /* renamed from: a */
    public final void mo110589a(String str, float f) {
        this.f156734a.put(str, Float.valueOf(f));
    }

    public C70087b(List<VideoSegment> list, float f) {
        this.f156743j = f;
        for (VideoSegment videoSegment : list) {
            this.f156734a.put(videoSegment.mo110571a(true), Float.valueOf(videoSegment.mo110582f()));
        }
    }

    /* renamed from: a */
    public final void mo110590a(List<VideoSegment> list, float f) {
        long j;
        int size;
        if (C84892d.m145850a(list)) {
            C84401c.f188722f.mo123661c("videoSegmentList is empty");
            j = 0;
        } else {
            float f2 = 0.0f;
            for (VideoSegment videoSegment : list) {
                if (!videoSegment.f156717i) {
                    f2 += ((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / (videoSegment.mo110582f() * f);
                }
            }
            j = (long) f2;
        }
        this.f156736c = j;
        this.f156739f = C70082m.m123738a(j);
        AbstractC84903j jVar = C84401c.f188722f;
        StringBuilder append = new StringBuilder("videoMultiDur: ").append(this.f156736c).append(" maxCutDuration is ").append(this.f156739f).append(" videoSize is ");
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        jVar.mo123661c(append.append(size).toString());
        long j2 = this.f156741h;
        if (j2 > 0) {
            this.f156739f = Math.min(this.f156736c, j2);
        }
        float f3 = ((float) this.f156739f) / this.f156743j;
        this.f156738e = f3;
        this.f156740g = (((float) C84370a.f188623l.f188632h) * 1.0f) / f3;
        long j3 = this.f156742i;
        if (j3 > 0) {
            this.f156740g = ((float) j3) / this.f156738e;
        }
        for (Map.Entry<String, Float> entry : this.f156734a.entrySet()) {
            this.f156735b.put(entry.getKey(), Float.valueOf(this.f156738e * entry.getValue().floatValue() * f));
        }
    }

    /* renamed from: a */
    public static long m123760a(List<VideoSegment> list, float f, float f2) {
        float d;
        float f3;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!list.get(i2).f156717i) {
                arrayList.add(list.get(i2));
            }
        }
        long j = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                break;
            }
            VideoSegment videoSegment = (VideoSegment) arrayList.get(i3);
            long e = (long) (((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / (videoSegment.mo110582f() * f2));
            float f4 = (float) e;
            if (f <= f4) {
                i = i3;
                break;
            }
            j += e;
            f -= f4;
            i3++;
        }
        if (i3 == arrayList.size()) {
            return j;
        }
        if (i != 0 || ((VideoSegment) arrayList.get(i)).mo110582f() == 0.0f) {
            d = (float) (j + ((VideoSegment) arrayList.get(i)).mo110578d());
            f3 = ((VideoSegment) arrayList.get(i)).mo110582f();
        } else {
            d = (float) j;
            f3 = ((VideoSegment) arrayList.get(i)).mo110582f();
        }
        return (long) (d + (f * f3 * f2));
    }

    /* renamed from: a */
    public final void mo110588a(long j, String str, float f, int i) {
        long j2 = (long) (((float) j) / f);
        this.f156737d = j2;
        this.f156739f = C70082m.m123738a(j2);
        C84401c.f188722f.mo123661c("path: " + str + " maxCutDuration is " + this.f156739f);
        long j3 = this.f156741h;
        if (j3 > 0) {
            this.f156739f = Math.min(j3, this.f156737d);
        }
        float f2 = ((float) this.f156739f) / this.f156743j;
        this.f156738e = f2;
        if (i == 0) {
            this.f156740g = (((float) C84370a.f188623l.f188632h) * 1.0f) / f2;
        } else {
            this.f156740g = 500.0f / f2;
        }
        long j4 = this.f156742i;
        if (j4 > 0) {
            this.f156740g = ((float) j4) / this.f156738e;
        }
        this.f156735b.put(str, Float.valueOf(this.f156738e * f));
    }
}
