package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.b */
public final class C70558b {

    /* renamed from: e */
    public static final C70559a f157807e = new C70559a((byte) 0);

    /* renamed from: a */
    public float f157808a;

    /* renamed from: b */
    public long f157809b;

    /* renamed from: c */
    public long f157810c;

    /* renamed from: d */
    public long f157811d;

    /* renamed from: f */
    private float f157812f;

    static {
        Covode.recordClassIndex(83021);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.b$a */
    public static final class C70559a {
        static {
            Covode.recordClassIndex(83022);
        }

        private C70559a() {
        }

        public /* synthetic */ C70559a(byte b) {
            this();
        }
    }

    public C70558b(float f) {
        this.f157812f = f;
    }

    /* renamed from: b */
    public final void mo111305b(long j) {
        long min = Math.min(this.f157809b, j);
        this.f157809b = min;
        this.f157808a = ((float) min) / this.f157812f;
    }

    /* renamed from: a */
    public final void mo111303a(long j) {
        long min = Math.min(Math.min(this.f157809b, j), this.f157810c);
        this.f157809b = min;
        this.f157808a = ((float) min) / this.f157812f;
    }

    /* renamed from: a */
    public static final long m124608a(List<? extends VideoSegment> list, float f) {
        C89219l.m154721d(list, "");
        if (C13617h.m24465a(list)) {
            return 0;
        }
        float f2 = 0.0f;
        for (VideoSegment videoSegment : list) {
            if (!videoSegment.f156717i) {
                f2 += ((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / (videoSegment.mo110582f() * f);
            }
        }
        return (long) f2;
    }

    /* renamed from: a */
    public final void mo111304a(long j, float f) {
        long min = Math.min(Math.min(this.f157809b, (long) (((float) j) / f)), this.f157810c);
        this.f157809b = min;
        this.f157808a = ((float) min) / this.f157812f;
    }

    /* renamed from: a */
    public static final C89378p<Integer, Float> m124609a(long j, float f, int i, List<? extends VideoSegment> list) {
        C89219l.m154721d(list, "");
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        for (VideoSegment videoSegment : list) {
            if (!videoSegment.f156717i) {
                float f4 = (float) j;
                if (f4 < f2) {
                    break;
                }
                float e = ((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / videoSegment.mo110582f();
                float f5 = f2 + e;
                if (f4 >= f5) {
                    i2 += C89241a.m154730a((float) Math.ceil((double) (e / f)));
                } else {
                    float f6 = f4 - f2;
                    int i3 = (int) (f6 / f);
                    i2 += i3;
                    f3 = ((f6 - (((float) i3) * f)) / f) * ((float) i);
                }
                f2 = f5;
            }
        }
        return new C89378p<>(Integer.valueOf(i2), Float.valueOf(f3));
    }
}
