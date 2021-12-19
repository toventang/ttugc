package com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27258s;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.asve.editor.C31079j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73872d;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.p3883a.C73867a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.watermark.C81504n;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.f */
public final class C73878f {

    /* renamed from: h */
    public static final C73879a f165854h = new C73879a((byte) 0);

    /* renamed from: a */
    public AbstractC88969g<AbstractC73872d> f165855a;

    /* renamed from: b */
    long f165856b = -1;

    /* renamed from: c */
    final C73883g f165857c;

    /* renamed from: d */
    final SynthetiseResult f165858d;

    /* renamed from: e */
    final VEVideoEncodeSettings f165859e;

    /* renamed from: f */
    public final C73867a f165860f;

    /* renamed from: g */
    final String f165861g;

    static {
        Covode.recordClassIndex(86624);
    }

    /* renamed from: a */
    private static String m129961a(int i) {
        switch (i) {
            case -104:
                return "ending watermark video concat failed";
            case -103:
            default:
                return "Unknown error";
            case -102:
                return "synthesis ending watermak failed, init failed";
            case -101:
                return "current user is null while synthesis finished";
            case -100:
                return "end watermark encode settings is null";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.f$a */
    public static final class C73879a {
        static {
            Covode.recordClassIndex(86625);
        }

        private C73879a() {
        }

        public /* synthetic */ C73879a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.f$b */
    public static final class C73880b implements VEListener.AbstractC85248q {

        /* renamed from: a */
        final /* synthetic */ C73878f f165862a;

        /* renamed from: b */
        final /* synthetic */ C31060a f165863b;

        /* renamed from: c */
        final /* synthetic */ SynthetiseResult f165864c;

        /* renamed from: d */
        final /* synthetic */ long f165865d;

        /* renamed from: e */
        final /* synthetic */ String f165866e;

        static {
            Covode.recordClassIndex(86626);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileDone() {
            C84911q.m145922a("PublishEndingWatermarkComposer", "ending watermark video generate cost: " + (System.currentTimeMillis() - this.f165865d) + "ms");
            this.f165863b.mo56387s();
            C73878f fVar = this.f165862a;
            SynthetiseResult synthetiseResult = this.f165864c;
            String str = this.f165866e;
            C84911q.m145922a("PublishEndingWatermarkComposer", "ending watermark synthesis finished.");
            AbstractC88969g<AbstractC73872d> gVar = fVar.f165855a;
            if (gVar == null) {
                C89219l.m154710a("mSubject");
            }
            gVar.onNext(new AbstractC73872d.C73874b(EnumC73871c.WatermarkVideoConcat));
            AbstractC88969g<AbstractC73872d> gVar2 = fVar.f165855a;
            if (gVar2 == null) {
                C89219l.m154710a("mSubject");
            }
            gVar2.onNext(new AbstractC73872d.C73873a(0));
            long currentTimeMillis = System.currentTimeMillis();
            if (C80720e.m139927b(fVar.f165857c.f165876e)) {
                C84911q.m145922a("PublishEndingWatermarkComposer", "delete existed file under watermark video file path, path: " + fVar.f165857c.f165876e);
                C80720e.m139931c(fVar.f165857c.f165876e);
            }
            int concatVideo = VEUtils.concatVideo(new String[]{fVar.f165861g, str}, fVar.f165857c.f165876e);
            if (concatVideo != 0) {
                fVar.mo116332a(-104, synthetiseResult, String.valueOf(concatVideo));
                return;
            }
            C80720e.m139931c(fVar.f165861g);
            AbstractC88969g<AbstractC73872d> gVar3 = fVar.f165855a;
            if (gVar3 == null) {
                C89219l.m154710a("mSubject");
            }
            gVar3.onNext(new AbstractC73872d.C73873a(1000));
            C84911q.m145922a("PublishEndingWatermarkComposer", "ending watermark video concat cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            synthetiseResult.outputFile = fVar.f165857c.f165876e;
            fVar.mo116333a(synthetiseResult, false);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileProgress(float f) {
            AbstractC88969g<AbstractC73872d> gVar = this.f165862a.f165855a;
            if (gVar == null) {
                C89219l.m154710a("mSubject");
            }
            gVar.onNext(new AbstractC73872d.C73873a(C89241a.m154730a(f * 1000.0f)));
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileError(int i, int i2, float f, String str) {
            this.f165863b.mo56387s();
            this.f165862a.mo116332a(-103, this.f165864c, "end watermark compile failed. error = " + i + " ext = " + i2 + " f = " + f + " msg = " + str);
        }

        C73880b(C73878f fVar, C31060a aVar, SynthetiseResult synthetiseResult, long j, String str) {
            this.f165862a = fVar;
            this.f165863b = aVar;
            this.f165864c = synthetiseResult;
            this.f165865d = j;
            this.f165866e = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.f$d */
    public static final class C73882d extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73878f f165870a;

        /* renamed from: b */
        final /* synthetic */ SynthetiseResult f165871b;

        static {
            Covode.recordClassIndex(86628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73882d(C73878f fVar, SynthetiseResult synthetiseResult) {
            super(1);
            this.f165870a = fVar;
            this.f165871b = synthetiseResult;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f165870a.mo116332a(-105, this.f165871b, C27258s.m54268b(th2));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static boolean m129962a(String str) {
        long min = Math.min(C80720e.m139940f(), 2147483647L);
        if (C89219l.m154714a((Object) str, (Object) "write failed: ENOSPC (No space left on device)") || min < 100) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116333a(SynthetiseResult synthetiseResult, boolean z) {
        C84911q.m145922a("PublishEndingWatermarkComposer", "watermark video concat finished.");
        AbstractC88969g<AbstractC73872d> gVar = this.f165855a;
        if (gVar == null) {
            C89219l.m154710a("mSubject");
        }
        gVar.onNext(new AbstractC73872d.C73875c(synthetiseResult));
        AbstractC88969g<AbstractC73872d> gVar2 = this.f165855a;
        if (gVar2 == null) {
            C89219l.m154710a("mSubject");
        }
        gVar2.onComplete();
        if (!z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - this.f165856b);
            jSONObject.put("file_size", new File(synthetiseResult.outputFile).length());
            C12290b.m22060a("aweme_publish_watermark_rate", 0, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo116332a(int i, SynthetiseResult synthetiseResult, String str) {
        String str2;
        StringBuilder append = new StringBuilder("end watermark synthesis error, will fallback to inter-watermark. error code: ").append(i).append(", error message: ");
        if (str == null || str.length() == 0) {
            str2 = m129961a(i);
        } else {
            str2 = str;
        }
        C84911q.m145922a("PublishEndingWatermarkComposer", append.append(str2).toString());
        C80720e.m139931c(this.f165857c.f165876e);
        if (C80720e.m139932c(this.f165861g, this.f165857c.f165876e)) {
            mo116333a(synthetiseResult, true);
        } else {
            SynthetiseResult clone = synthetiseResult.clone();
            clone.ret = 100103;
            C89219l.m154716b(clone, "");
            AbstractC88969g<AbstractC73872d> gVar = this.f165855a;
            if (gVar == null) {
                C89219l.m154710a("mSubject");
            }
            gVar.onError(new C71798ef("", clone));
        }
        if (m129962a(str)) {
            i = -106;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", System.currentTimeMillis() - this.f165856b);
        jSONObject.put("error_code", i);
        if (str != null) {
            jSONObject.put("error_msg", str);
        }
        C12290b.m22060a("aweme_publish_watermark_rate", 1, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.f$c */
    public static final class C73881c extends AbstractC89220m implements AbstractC89188r<Boolean, List<? extends String>, String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73878f f165867a;

        /* renamed from: b */
        final /* synthetic */ VEVideoEncodeSettings f165868b;

        /* renamed from: c */
        final /* synthetic */ SynthetiseResult f165869c;

        static {
            Covode.recordClassIndex(86627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73881c(C73878f fVar, VEVideoEncodeSettings vEVideoEncodeSettings, SynthetiseResult synthetiseResult) {
            super(4);
            this.f165867a = fVar;
            this.f165868b = vEVideoEncodeSettings;
            this.f165869c = synthetiseResult;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Boolean bool, List<? extends String> list, String str, String str2) {
            String str3;
            boolean booleanValue = bool.booleanValue();
            List<? extends String> list2 = list;
            String str4 = str;
            String str5 = str2;
            C89219l.m154721d(list2, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C84911q.m145922a("wangyong.1996", "load ending watermark resource success. isRealLoad: ".concat(String.valueOf(booleanValue)));
            String path = C63244g.m114602a().mo73279g().mo69470c().mo69474a(C63244g.m114602a().mo73279g().mo69470c().mo69481g(this.f165867a.f165860f.mo116328a()), "ending_watermark_video.mp4").getPath();
            C73878f fVar = this.f165867a;
            C81504n nVar = new C81504n(list2, str4, str5, C89086z.INSTANCE, (byte) 0);
            C89219l.m154716b(path, "");
            VEVideoEncodeSettings vEVideoEncodeSettings = this.f165868b;
            SynthetiseResult synthetiseResult = this.f165869c;
            long currentTimeMillis = System.currentTimeMillis();
            C80720e.m139931c(path);
            C31060a aVar = new C31060a(fVar.f165857c.f165875d);
            boolean z = true;
            C31079j jVar = new C31079j(new String[]{nVar.f182222b});
            jVar.mo56409a(C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
            jVar.f74439a = new int[]{0};
            jVar.f74440b = new int[]{nVar.f182225e + nVar.f182226f};
            jVar.f74441c = null;
            if (aVar.mo56274a(jVar) != 0) {
                fVar.mo116332a(-102, synthetiseResult, null);
            } else {
                if (fVar.f165860f.mo116331d() && (str3 = nVar.f182223c) != null && new File(str3).exists()) {
                    aVar.mo56285a(str3, 0, nVar.f182225e, 0, nVar.f182225e + 0, false);
                }
                if (!nVar.f182221a.isEmpty()) {
                    String str6 = nVar.f182221a.get(0);
                    List<Integer> list3 = fVar.f165857c.f165872a;
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(it.next().intValue()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    aVar.mo56255a(aVar.mo56292a(str6, (String[]) array), 0, nVar.f182225e + 0 + nVar.f182226f);
                }
                vEVideoEncodeSettings.setWatermark(null);
                vEVideoEncodeSettings.adjustVideoCompileEncodeSetting(1);
                int isWatermarkCompileEncode = aVar.mo56244E().f191765B.isWatermarkCompileEncode();
                if (isWatermarkCompileEncode >= 0) {
                    VEVideoCompileEncodeSettings videoCompileEncodeSetting = vEVideoEncodeSettings.getVideoCompileEncodeSetting();
                    if (isWatermarkCompileEncode <= 0) {
                        z = false;
                    }
                    videoCompileEncodeSetting.useHWEncoder = z;
                    vEVideoEncodeSettings.getVideoCompileEncodeSetting().isSupportHWEncoder = vEVideoEncodeSettings.getVideoCompileEncodeSetting().useHWEncoder;
                }
                aVar.mo56316a(path, (String) null, vEVideoEncodeSettings, new C73880b(fVar, aVar, synthetiseResult, currentTimeMillis, path));
            }
            return C89391z.f203057a;
        }
    }

    public C73878f(C73883g gVar, SynthetiseResult synthetiseResult, VEVideoEncodeSettings vEVideoEncodeSettings, C73867a aVar, String str) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(synthetiseResult, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        this.f165857c = gVar;
        this.f165858d = synthetiseResult;
        this.f165859e = vEVideoEncodeSettings;
        this.f165860f = aVar;
        this.f165861g = str;
    }
}
