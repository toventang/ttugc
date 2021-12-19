package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.c */
public final class C71441c {

    /* renamed from: a */
    public long f160063a;

    /* renamed from: b */
    public long f160064b;

    /* renamed from: c */
    public float f160065c;

    /* renamed from: d */
    public float f160066d;

    /* renamed from: e */
    public boolean f160067e;

    /* renamed from: f */
    public boolean f160068f;

    /* renamed from: g */
    public boolean f160069g;

    /* renamed from: h */
    public boolean f160070h;

    /* renamed from: i */
    public int f160071i = -1;

    /* renamed from: j */
    public int f160072j;

    /* renamed from: k */
    public int f160073k;

    static {
        Covode.recordClassIndex(83975);
    }

    /* renamed from: a */
    public final void mo113057a() {
        this.f160063a = 0;
        this.f160064b = 0;
        this.f160065c = 0.0f;
        this.f160066d = 0.0f;
    }

    /* renamed from: a */
    public final void mo113058a(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            this.f160063a = multiEditVideoRecordData.startTime;
            this.f160064b = multiEditVideoRecordData.endTime;
            this.f160065c = multiEditVideoRecordData.leftSlideX;
            this.f160066d = multiEditVideoRecordData.rightSlideX;
        }
    }

    /* renamed from: b */
    public final void mo113059b(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.leftSlideX = this.f160065c;
            multiEditVideoRecordData.rightSlideX = this.f160066d;
            multiEditVideoRecordData.startTime = this.f160063a;
            multiEditVideoRecordData.endTime = this.f160064b;
        }
    }
}
