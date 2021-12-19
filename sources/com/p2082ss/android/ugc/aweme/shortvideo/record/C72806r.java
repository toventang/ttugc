package com.p2082ss.android.ugc.aweme.shortvideo.record;

import android.hardware.Camera;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71881g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.r */
public final class C72806r implements AbstractC71881g {

    /* renamed from: a */
    public static final C72807a f163290a = new C72807a((byte) 0);

    /* renamed from: c */
    private static int f163291c = -1;

    /* renamed from: b */
    private final AbstractC72769aq f163292b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.r$a */
    public static final class C72807a {
        static {
            Covode.recordClassIndex(85493);
        }

        private C72807a() {
        }

        public /* synthetic */ C72807a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(85492);
    }

    /* renamed from: b */
    private static int m128396b() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras <= 0) {
                return -1;
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i = 0;
            while (true) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    return 1;
                }
                i++;
                if (i >= numberOfCameras) {
                    return -1;
                }
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71881g
    /* renamed from: a */
    public final int mo113531a() {
        Integer a = this.f163292b.mo115058a();
        if (a != null) {
            return a.intValue();
        }
        if (f163291c == -1) {
            f163291c = m128396b();
        }
        int i = f163291c;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71881g
    /* renamed from: b */
    public final void mo113533b(int i) {
        this.f163292b.mo115059a(i);
    }

    public C72806r(AbstractC72769aq aqVar) {
        C89219l.m154721d(aqVar, "");
        this.f163292b = aqVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71881g
    /* renamed from: a */
    public final int mo113532a(int i) {
        if (i == 1) {
            i = m128396b();
        }
        if (i != -1) {
            return i;
        }
        return 0;
    }
}
