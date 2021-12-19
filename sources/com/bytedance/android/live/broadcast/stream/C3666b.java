package com.bytedance.android.live.broadcast.stream;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCaptureVideoRecordDurationSetting;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import java.io.File;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.stream.b */
public final class C3666b implements ILiveStream.CatchVideoCallback {

    /* renamed from: d */
    public static final C3667a f10098d = new C3667a((byte) 0);

    /* renamed from: a */
    public int f10099a;

    /* renamed from: b */
    public final AbstractC3055a f10100b;

    /* renamed from: c */
    public final boolean f10101c;

    /* renamed from: e */
    private final AbstractC89244h f10102e = C89250i.m154773a((AbstractC89171a) C3672e.f10111a);

    /* renamed from: f */
    private final AbstractC89244h f10103f = C89250i.m154773a((AbstractC89171a) C3669c.f10108a);

    /* renamed from: g */
    private final AbstractC89244h f10104g = C89250i.m154773a((AbstractC89171a) C3668b.f10107a);

    /* renamed from: h */
    private final int f10105h;

    /* renamed from: i */
    private final int f10106i;

    static {
        Covode.recordClassIndex(4178);
    }

    /* renamed from: a */
    public final String mo8946a() {
        return (String) this.f10102e.getValue();
    }

    /* renamed from: b */
    public final String mo8948b() {
        return (String) this.f10103f.getValue();
    }

    /* renamed from: c */
    public final C88411a mo8949c() {
        return (C88411a) this.f10104g.getValue();
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.b$a */
    public static final class C3667a {
        static {
            Covode.recordClassIndex(4179);
        }

        private C3667a() {
        }

        public /* synthetic */ C3667a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.b$b */
    static final class C3668b extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C3668b f10107a = new C3668b();

        static {
            Covode.recordClassIndex(4180);
        }

        C3668b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.b$d */
    static final class C3670d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3666b f10109a;

        static {
            Covode.recordClassIndex(4182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3670d(C3666b bVar) {
            super(0);
            this.f10109a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C3854a.m9453a(3, "CaptureVideoUploadController", "origin file update success");
            this.f10109a.mo8947a(new File(this.f10109a.mo8948b()), "2", C36711.f10110a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
    public final void onComplete() {
        C3854a.m9453a(3, "CaptureVideoUploadController", "onComplete");
        mo8947a(new File(mo8946a()), "1", new C3670d(this));
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.b$c */
    static final class C3669c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C3669c f10108a = new C3669c();

        static {
            Covode.recordClassIndex(4181);
        }

        C3669c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            StringBuilder sb = new StringBuilder();
            File dir = C3966y.m9669e().getDir("live_capture_video", 0);
            C89219l.m154716b(dir, "");
            return sb.append(dir.getAbsolutePath()).append(File.separator).append("effect_video.h264").toString();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.b$e */
    static final class C3672e extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C3672e f10111a = new C3672e();

        static {
            Covode.recordClassIndex(4184);
        }

        C3672e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            StringBuilder sb = new StringBuilder();
            File dir = C3966y.m9669e().getDir("live_capture_video", 0);
            C89219l.m154716b(dir, "");
            return sb.append(dir.getAbsolutePath()).append(File.separator).append("origin_video.h264").toString();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.b$g */
    public static final class C3674g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C3674g f10113a = new C3674g();

        static {
            Covode.recordClassIndex(4186);
        }

        C3674g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9458a("CaptureVideoUploadController", (Throwable) obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.stream.b$h */
    public static final class C3675h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f10114a;

        /* renamed from: b */
        final /* synthetic */ File f10115b;

        static {
            Covode.recordClassIndex(4187);
        }

        C3675h(AbstractC89171a aVar, File file) {
            this.f10114a = aVar;
            this.f10115b = file;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f10114a.invoke();
            m9107a(this.f10115b);
        }

        /* renamed from: a */
        private static boolean m9107a(File file) {
            MethodCollector.m26663i(6083);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(6083);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(6083);
            return delete;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.stream.b$i */
    public static final class C3676i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ File f10116a;

        static {
            Covode.recordClassIndex(4188);
        }

        C3676i(File file) {
            this.f10116a = file;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9458a("CaptureVideoUploadController", (Throwable) obj);
            m9108a(this.f10116a);
        }

        /* renamed from: a */
        private static boolean m9108a(File file) {
            MethodCollector.m26663i(7766);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(7766);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(7766);
            return delete;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.b$f */
    public static final class C3673f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3666b f10112a;

        static {
            Covode.recordClassIndex(4185);
        }

        public C3673f(C3666b bVar) {
            this.f10112a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9453a(3, "CaptureVideoUploadController", "catchVideo");
            Bundle bundle = new Bundle();
            bundle.putInt("mode", 0);
            bundle.putString("outputPathOrigin", this.f10112a.mo8946a());
            bundle.putString("outputPathWithEffect", this.f10112a.mo8948b());
            bundle.putBoolean("hardwareEncode", this.f10112a.f10101c);
            bundle.putFloat("duration", LiveCaptureVideoRecordDurationSetting.INSTANCE.getValue());
            this.f10112a.f10100b.mo8286a(bundle, this.f10112a);
        }
    }

    /* renamed from: a */
    public static boolean m9102a(File file) {
        MethodCollector.m26663i(7925);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7925);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7925);
        return delete;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
    public final void onError(int i, String str) {
        C3854a.m9453a(6, "CaptureVideoUploadController", "error code:" + i + " error msg:" + str);
    }

    /* renamed from: a */
    public final void mo8947a(File file, String str, AbstractC89171a<C89391z> aVar) {
        if (file.exists() && file.isFile()) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("video_type", new TypedString(str));
            multipartTypedOutput.addPart("file_type", new TypedString("4"));
            multipartTypedOutput.addPart("pixel_x", new TypedString(String.valueOf(this.f10105h)));
            multipartTypedOutput.addPart("pixel_y", new TypedString(String.valueOf(this.f10106i)));
            multipartTypedOutput.addPart("data_size", new TypedString(String.valueOf(file.length())));
            multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
            mo8949c().mo142945a(C3719d.C3720a.m9229a().mo9038a().updateCaptureVideo(multipartTypedOutput).mo143271a(new C11191f()).mo143254a(new C3675h(aVar, file), new C3676i(file)));
        }
    }

    public C3666b(AbstractC3055a aVar, int i, int i2, boolean z) {
        C89219l.m154721d(aVar, "");
        this.f10100b = aVar;
        this.f10105h = i;
        this.f10106i = i2;
        this.f10101c = z;
    }
}
