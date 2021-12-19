package com.p2082ss.android.ugc.asve.context;

import android.view.SurfaceHolder;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31020c;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31024f;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31192e;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VECameraSettings;
import com.p2082ss.android.vesdk.VEDisplaySettings;
import java.io.File;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.asve.context.h */
public interface AbstractC31040h {

    /* renamed from: com.ss.android.ugc.asve.context.h$a */
    public static final class C31041a {
        static {
            Covode.recordClassIndex(37671);
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$a */
        public static final class C31043a implements AbstractC31034c {
            static {
                Covode.recordClassIndex(37673);
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: c */
            public final boolean mo56140c() {
                return true;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: e */
            public final int mo56142e() {
                return 10;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: f */
            public final boolean mo56143f() {
                return false;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: h */
            public final int mo56145h() {
                return 0;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: i */
            public final boolean mo56146i() {
                return false;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: j */
            public final int mo56147j() {
                return 2131232051;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: k */
            public final int[] mo56148k() {
                return new int[0];
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: l */
            public final boolean mo56149l() {
                return false;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: m */
            public final VEDisplaySettings mo56150m() {
                return null;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: n */
            public final boolean mo56151n() {
                return true;
            }

            C31043a() {
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: a */
            public final EnumC31020c mo56138a() {
                return EnumC31020c.AS_CAMERA_LENS_FRONT;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: b */
            public final VECameraSettings.CAMERA_TYPE mo56139b() {
                return VECameraSettings.CAMERA_TYPE.TYPE1;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: d */
            public final byte mo56141d() {
                return EnumC31024f.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
            }
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$b */
        public static final class C31044b implements AbstractC31038f {
            static {
                Covode.recordClassIndex(37674);
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
            /* renamed from: a */
            public final boolean mo56206a() {
                return false;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
            /* renamed from: b */
            public final String mo56207b() {
                return "";
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
            /* renamed from: c */
            public final String mo56208c() {
                return "";
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
            /* renamed from: d */
            public final int mo56209d() {
                return 0;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
            /* renamed from: e */
            public final int mo56210e() {
                return 0;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31038f
            /* renamed from: f */
            public final boolean mo56211f() {
                return false;
            }

            C31044b() {
            }
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$d */
        public static final class C31046d implements AbstractC31039g {
            static {
                Covode.recordClassIndex(37676);
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: a */
            public final String mo56212a() {
                return "";
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: b */
            public final String mo56213b() {
                return "";
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: c */
            public final float mo56214c() {
                return 0.66f;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: d */
            public final boolean mo56215d() {
                return true;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: e */
            public final int mo56216e() {
                return R.array.ak;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: f */
            public final int mo56217f() {
                return R.array.aj;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: g */
            public final int mo56218g() {
                return R.drawable.bbj;
            }

            C31046d() {
            }
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$e */
        public static final class C31047e implements AbstractC31192e {

            /* renamed from: a */
            private final File f74373a;

            /* renamed from: b */
            private final File f74374b;

            /* renamed from: c */
            private final File f74375c;

            /* renamed from: d */
            private final File f74376d;

            /* renamed from: e */
            private final File f74377e;

            static {
                Covode.recordClassIndex(37677);
            }

            @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31192e
            /* renamed from: a */
            public final File mo56219a() {
                return this.f74373a;
            }

            @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31192e
            /* renamed from: b */
            public final File mo56220b() {
                return this.f74374b;
            }

            @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31192e
            /* renamed from: c */
            public final File mo56221c() {
                return this.f74375c;
            }

            @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31192e
            /* renamed from: d */
            public final File mo56222d() {
                return this.f74376d;
            }

            C31047e() {
                File e = C31012a.m63724a().mo56191e();
                this.f74373a = e;
                File file = new File(C31012a.m63724a().mo56191e(), "segs");
                this.f74374b = file;
                this.f74375c = new File(file, "video");
                this.f74376d = new File(file, DataType.AUDIO);
                this.f74377e = new File(e, UGCMonitor.TYPE_PHOTO);
            }
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$c */
        static final class C31045c extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C31045c f74372a = new C31045c();

            static {
                Covode.recordClassIndex(37675);
            }

            C31045c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }
    }

    static {
        Covode.recordClassIndex(37670);
    }

    /* renamed from: A */
    boolean mo56152A();

    /* renamed from: B */
    boolean mo56153B();

    /* renamed from: a */
    boolean mo56154a();

    /* renamed from: b */
    boolean mo56155b();

    /* renamed from: c */
    boolean mo56156c();

    /* renamed from: d */
    SurfaceHolder mo56157d();

    /* renamed from: e */
    AbstractC31192e mo56158e();

    /* renamed from: f */
    C89378p<Integer, Integer> mo56159f();

    /* renamed from: g */
    boolean mo56160g();

    /* renamed from: h */
    boolean mo56161h();

    /* renamed from: i */
    boolean mo56162i();

    /* renamed from: j */
    boolean mo56163j();

    /* renamed from: k */
    AbstractC89171a<Boolean> mo56164k();

    /* renamed from: l */
    AbstractC31038f mo56165l();

    /* renamed from: m */
    AbstractC31039g mo56166m();

    /* renamed from: n */
    AbstractC31035d mo56167n();

    /* renamed from: o */
    AbstractC31034c mo56168o();

    /* renamed from: p */
    boolean mo56169p();

    /* renamed from: q */
    boolean mo56170q();

    /* renamed from: r */
    boolean mo56171r();

    /* renamed from: s */
    long mo56172s();

    /* renamed from: t */
    boolean mo56173t();

    /* renamed from: u */
    int mo56174u();

    /* renamed from: v */
    boolean mo56175v();

    /* renamed from: w */
    boolean mo56176w();

    /* renamed from: x */
    boolean mo56177x();

    /* renamed from: y */
    boolean mo56178y();

    /* renamed from: z */
    boolean mo56179z();
}
