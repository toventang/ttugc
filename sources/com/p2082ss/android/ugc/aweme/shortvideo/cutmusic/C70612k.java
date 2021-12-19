package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.model.VEMusicWaveBean;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70596e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.k */
public final class C70612k {

    /* renamed from: f */
    public static volatile C70612k f158036f = new C70612k();

    /* renamed from: g */
    public static final HashMap<String, C70625d> f158037g = new HashMap<>();

    /* renamed from: h */
    public static final C70614b f158038h = new C70614b((byte) 0);

    /* renamed from: a */
    public int f158039a;

    /* renamed from: b */
    public int f158040b;

    /* renamed from: c */
    public int f158041c;

    /* renamed from: d */
    public int f158042d;

    /* renamed from: e */
    public int f158043e;

    /* renamed from: i */
    private int f158044i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.k$a */
    public interface AbstractC70613a {
        static {
            Covode.recordClassIndex(83079);
        }

        /* renamed from: a */
        void mo87581a(C70625d dVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.k$c */
    public interface AbstractC70617c {
        static {
            Covode.recordClassIndex(83083);
        }

        /* renamed from: a */
        void mo87655a(Object obj);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.k$b */
    public static final class C70614b {
        static {
            Covode.recordClassIndex(83080);
        }

        private C70614b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.k$b$a */
        public static final class CallableC70615a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ String f158045a;

            static {
                Covode.recordClassIndex(83081);
            }

            CallableC70615a(String str) {
                this.f158045a = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                TextUtils.isEmpty(this.f158045a);
                String str = this.f158045a;
                if (str == null) {
                    C89219l.m154715b();
                }
                return C70614b.m124757a(str);
            }
        }

        public /* synthetic */ C70614b(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m124761a(float[] fArr) {
            if (fArr == null || fArr.length == 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.k$b$b */
        public static final class C70616b<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ AbstractC70617c f158046a;

            static {
                Covode.recordClassIndex(83082);
            }

            C70616b(AbstractC70617c cVar) {
                this.f158046a = cVar;
            }

            @Override // p077b.AbstractC1729g
            public final Object then(C1731i<C70625d> iVar) {
                AbstractC70617c cVar = this.f158046a;
                if (cVar != null) {
                    if (iVar == null) {
                        cVar.mo87655a(null);
                    } else {
                        cVar.mo87655a(iVar.mo5545d());
                    }
                }
                return null;
            }
        }

        /* renamed from: a */
        public static C70596e.C70597a m124756a(Context context) {
            C70596e.C70597a aVar = new C70596e.C70597a();
            if (context == null) {
                return aVar;
            }
            aVar.f158000c = (int) C13628n.m24520b(context, 16.0f);
            aVar.f157999b = (int) C13628n.m24520b(context, 6.0f);
            aVar.f157998a = (int) C13628n.m24520b(context, 10.0f);
            aVar.f158005h = -1073741824;
            aVar.f158004g = -1;
            aVar.f158002e = (int) C13628n.m24520b(context, 4.0f);
            aVar.f158003f = (int) C13628n.m24520b(context, 2.0f);
            aVar.f158006i = (int) C13628n.m24520b(context, 11.0f);
            aVar.f158001d = (int) C13628n.m24520b(context, 8.0f);
            return aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
            if (r0 <= 0) goto L_0x0035;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p2082ss.android.ugc.aweme.shortvideo.C70625d m124757a(java.lang.String r4) {
            /*
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
                java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.d> r0 = com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.f158037g
                java.lang.Object r0 = r0.get(r4)
                com.ss.android.ugc.aweme.shortvideo.d r0 = (com.p2082ss.android.ugc.aweme.shortvideo.C70625d) r0
                if (r0 == 0) goto L_0x0014
                com.ss.android.ugc.aweme.shortvideo.d r0 = com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.m124745a(r0)
                return r0
            L_0x0014:
                com.ss.android.ugc.aweme.port.in.aj r0 = com.p2082ss.android.ugc.aweme.port.p3561in.C63253l.f143623a
                com.ss.android.ugc.aweme.port.in.aa r0 = r0.mo73306b()
                int r3 = r0.mo101542b(r4)
                r1 = 0
                if (r3 >= 0) goto L_0x0022
                return r1
            L_0x0022:
                r0 = 90000(0x15f90, float:1.26117E-40)
                if (r3 <= r0) goto L_0x0028
                return r1
            L_0x0028:
                r2 = 2000(0x7d0, float:2.803E-42)
                if (r3 <= 0) goto L_0x0048
                com.ss.android.ugc.aweme.shortvideo.cutmusic.k r1 = com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.f158036f
                r0 = 1
                int r0 = r1.mo111415a(r3, r0)
                if (r0 > 0) goto L_0x004a
            L_0x0035:
                r0 = 0
                com.ss.android.ttve.model.VEMusicWaveBean r0 = com.p2082ss.android.vesdk.VEUtils.getMusicWaveData(r4, r0, r2)
                com.ss.android.ugc.aweme.shortvideo.d r2 = com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.m124743a(r0)
                java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.d> r1 = com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.f158037g
                com.ss.android.ugc.aweme.shortvideo.d r0 = com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.m124745a(r2)
                r1.put(r4, r0)
                return r2
            L_0x0048:
                r0 = 2000(0x7d0, float:2.803E-42)
            L_0x004a:
                r2 = r0
                goto L_0x0035
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.C70614b.m124757a(java.lang.String):com.ss.android.ugc.aweme.shortvideo.d");
        }

        /* renamed from: a */
        public static String m124759a(long j) {
            try {
                long j2 = j / 1000;
                String a = C1764a.m5929a(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}, 2));
                C89219l.m154716b(a, "");
                return a;
            } catch (Exception unused) {
                C73991bj.m130131b("cut music duration:".concat(String.valueOf(j)));
                return "00:00";
            }
        }

        /* renamed from: a */
        public static void m124760a(VEMusicWaveBean vEMusicWaveBean) {
            float[] waveBean;
            if (!(vEMusicWaveBean == null || (waveBean = vEMusicWaveBean.getWaveBean()) == null)) {
                C89219l.m154716b(waveBean, "");
                if (waveBean.length != 0) {
                    int length = waveBean.length;
                    for (int i = 0; i < length; i++) {
                        if (Float.isNaN(waveBean[i])) {
                            waveBean[i] = 0.0f;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public static C70625d m124758a(String str, boolean z, AbstractC70617c cVar) {
            if (!z) {
                C1731i.m5640b(new CallableC70615a(str), C1731i.f5562a).mo5534a(new C70616b(cVar), C1731i.f5564c, null);
                return null;
            } else if (TextUtils.isEmpty(str)) {
                return null;
            } else {
                if (str == null) {
                    C89219l.m154715b();
                }
                return m124757a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo111418a(C70625d dVar, long j, long j2) {
        if (j > 0) {
            this.f158043e = (int) j;
        }
        int a = mo111415a((int) j2, false);
        if (dVar != null && C70614b.m124761a(dVar.getMusicWavePointArray()) && a > 0) {
            float[] musicWavePointArray = dVar.getMusicWavePointArray();
            if (musicWavePointArray == null) {
                C89219l.m154715b();
            }
            if (musicWavePointArray.length > a) {
                VEMusicWaveBean resampleMusicWaveData = VEUtils.getResampleMusicWaveData(dVar.getMusicWavePointArray(), 0, a);
                C70614b.m124760a(resampleMusicWaveData);
                if (resampleMusicWaveData != null && C70614b.m124761a(resampleMusicWaveData.getWaveBean())) {
                    float[] waveBean = resampleMusicWaveData.getWaveBean();
                    C89219l.m154716b(waveBean, "");
                    float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
                    C89219l.m154716b(copyOf, "");
                    dVar.setMusicWavePointArray(copyOf);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(83078);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.k$d */
    public static final class C70618d implements AbstractC70617c {

        /* renamed from: a */
        final /* synthetic */ AbstractC70613a f158047a;

        static {
            Covode.recordClassIndex(83084);
        }

        C70618d(AbstractC70613a aVar) {
            this.f158047a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.AbstractC70617c
        /* renamed from: a */
        public final void mo87655a(Object obj) {
            boolean z;
            StringBuilder sb = new StringBuilder("OLD_DRAFT AudioWaveDataIsNull:");
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            C73991bj.m130128a(sb.append(z).toString());
            AbstractC70613a aVar = this.f158047a;
            if (aVar == null) {
                return;
            }
            if (obj == null || !(obj instanceof C70625d)) {
                aVar.mo87581a(null);
            } else {
                aVar.mo87581a((C70625d) obj);
            }
        }
    }

    /* renamed from: b */
    public final int mo111419b(Context context) {
        C89219l.m154721d(context, "");
        int i = this.f158042d;
        return ((C13628n.m24504a(context) - ((int) C13628n.m24520b(context, 20.0f))) + i) / (i + this.f158040b);
    }

    /* renamed from: a */
    public static C70625d m124743a(VEMusicWaveBean vEMusicWaveBean) {
        if (vEMusicWaveBean == null || !C70614b.m124761a(vEMusicWaveBean.getWaveBean())) {
            return null;
        }
        C70614b.m124760a(vEMusicWaveBean);
        C70625d dVar = new C70625d();
        float[] waveBean = vEMusicWaveBean.getWaveBean();
        C89219l.m154716b(waveBean, "");
        float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
        C89219l.m154716b(copyOf, "");
        dVar.setMusicWavePointArray(copyOf);
        return dVar;
    }

    /* renamed from: b */
    public static C70625d m124748b(C69905c cVar) {
        if (cVar == null || !C70614b.m124761a(cVar.getMusicWaveData())) {
            return null;
        }
        C70625d dVar = new C70625d();
        float[] musicWaveData = cVar.getMusicWaveData();
        C89219l.m154716b(musicWaveData, "");
        float[] copyOf = Arrays.copyOf(musicWaveData, musicWaveData.length);
        C89219l.m154716b(copyOf, "");
        dVar.setMusicWavePointArray(copyOf);
        return dVar;
    }

    /* renamed from: a */
    public static C70625d m124744a(C69905c cVar) {
        if (cVar == null || !C70614b.m124761a(cVar.getMusicWaveData())) {
            return null;
        }
        C70625d dVar = new C70625d();
        float[] musicWaveData = cVar.getMusicWaveData();
        C89219l.m154716b(musicWaveData, "");
        float[] copyOf = Arrays.copyOf(musicWaveData, musicWaveData.length);
        C89219l.m154716b(copyOf, "");
        dVar.setMusicWavePointArray(copyOf);
        dVar.setMusicPath(C63253l.f143623a.mo73306b().mo101748b(cVar));
        return dVar;
    }

    /* renamed from: b */
    public static void m124749b(C70625d dVar) {
        if (dVar != null && C70614b.m124761a(dVar.getMusicWavePointArray())) {
            int length = dVar.getMusicWavePointArray().length;
            for (int i = 0; i < length; i++) {
                if (dVar.getMusicWavePointArray()[i] < 0.1f) {
                    dVar.getMusicWavePointArray()[i] = 0.1f;
                }
            }
        }
    }

    /* renamed from: a */
    public static C70625d m124745a(C70625d dVar) {
        if (dVar == null || !C70614b.m124761a(dVar.getMusicWavePointArray())) {
            return dVar;
        }
        C70625d dVar2 = new C70625d();
        float[] musicWavePointArray = dVar.getMusicWavePointArray();
        float[] copyOf = Arrays.copyOf(musicWavePointArray, musicWavePointArray.length);
        C89219l.m154716b(copyOf, "");
        dVar2.setMusicWavePointArray(copyOf);
        dVar2.setMusicPath(dVar.getMusicPath());
        dVar2.setMusicLength(dVar.getMusicLength());
        dVar2.setVideoLenght(dVar.getVideoLenght());
        return dVar2;
    }

    /* renamed from: a */
    public final int mo111416a(long j) {
        if (j <= 0) {
            return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        int i = this.f158044i;
        int i2 = this.f158040b;
        return (i + i2) / (this.f158039a + i2);
    }

    /* renamed from: a */
    public final void mo111417a(Context context) {
        C89219l.m154721d(context, "");
        this.f158039a = (int) C13628n.m24520b(context, 3.0f);
        this.f158040b = (int) C13628n.m24520b(context, 2.0f);
        this.f158041c = (int) C13628n.m24520b(context, 90.0f);
        this.f158042d = (int) C13628n.m24520b(context, 2.0f);
        this.f158044i = C13628n.m24504a(context) + 0;
    }

    /* renamed from: a */
    public static void m124747a(String str, AbstractC70613a aVar) {
        if (TextUtils.isEmpty(str)) {
            aVar.mo87581a(null);
        } else {
            C70614b.m124758a(str, false, new C70618d(aVar));
        }
    }

    /* renamed from: a */
    public final int mo111415a(int i, boolean z) {
        int i2 = this.f158043e;
        if (i2 <= 0) {
            return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        int i3 = this.f158044i;
        int i4 = this.f158040b;
        int i5 = (int) (((float) ((i3 + i4) / (this.f158039a + i4))) * 1.0f * ((((float) i) * 1.0f) / ((float) i2)));
        if (!z || i5 >= 2000) {
            return i5;
        }
        return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }

    /* renamed from: a */
    public static void m124746a(C70625d dVar, int i, int i2, int i3) {
        if (dVar != null) {
            float[] musicWavePointArray = dVar.getMusicWavePointArray();
            if (musicWavePointArray == null) {
                C89219l.m154715b();
            }
            float f = (float) i3;
            int length = (int) (((((float) musicWavePointArray.length) * 1.0f) * ((float) i)) / f);
            float[] musicWavePointArray2 = dVar.getMusicWavePointArray();
            if (musicWavePointArray2 == null) {
                C89219l.m154715b();
            }
            int length2 = (int) (((((float) musicWavePointArray2.length) * 1.0f) * ((float) i2)) / f);
            if (length2 > 0) {
                float[] fArr = new float[length2];
                float[] musicWavePointArray3 = dVar.getMusicWavePointArray();
                if (musicWavePointArray3 == null) {
                    C89219l.m154715b();
                }
                int length3 = musicWavePointArray3.length;
                boolean z = false;
                int i4 = length2 + length;
                int i5 = length;
                while (i5 < i4 && i5 < length3) {
                    fArr[i5 - length] = dVar.getMusicWavePointArray()[i5];
                    i5++;
                    z = true;
                }
                if (C70614b.m124761a(fArr) && z) {
                    dVar.setMusicWavePointArray(fArr);
                }
            }
        }
    }
}
