package com.bytedance.android.live.broadcast.stream;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageCompressRateSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageIntervalSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageWidthSetting;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.filter.VideoCatcher;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.stream.a */
public final class C3656a {

    /* renamed from: j */
    public static final C3657a f10078j = new C3657a((byte) 0);

    /* renamed from: a */
    public AbstractC88412b f10079a;

    /* renamed from: b */
    public AbstractC88412b f10080b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<C89378p<byte[], Long>> f10081c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public boolean f10082d;

    /* renamed from: e */
    public boolean f10083e;

    /* renamed from: f */
    public AbstractC3055a f10084f;

    /* renamed from: g */
    public long f10085g;

    /* renamed from: h */
    public boolean f10086h = true;

    /* renamed from: i */
    public long f10087i;

    /* renamed from: k */
    private AbstractC88412b f10088k;

    static {
        Covode.recordClassIndex(4168);
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$a */
    public static final class C3657a {
        static {
            Covode.recordClassIndex(4169);
        }

        private C3657a() {
        }

        public /* synthetic */ C3657a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo8940a() {
        if (this.f10082d && this.f10086h) {
            this.f10086h = false;
            C3854a.m9453a(3, "CaptureImageUploadController", "resume");
            this.f10080b = C11231b.m19899b(LiveBroadcastUploadVideoImageIntervalSetting.INSTANCE.getValue(), TimeUnit.SECONDS).mo143268a(new C3659c(this)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C3660d(this));
        }
    }

    /* renamed from: b */
    public final void mo8941b() {
        long j = this.f10087i - 1;
        this.f10087i = j;
        if (j <= 0) {
            AbstractC88412b bVar = this.f10079a;
            if (bVar != null && !bVar.isDisposed()) {
                AbstractC88412b bVar2 = this.f10079a;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                this.f10079a = null;
            }
            this.f10079a = AbstractC88979t.m154307b(1, TimeUnit.SECONDS).mo143289d(new C3661e(this));
        }
    }

    /* renamed from: c */
    public final synchronized void mo8942c() {
        AbstractC88412b bVar;
        MethodCollector.m26663i(8079);
        if (this.f10083e) {
            MethodCollector.m26664o(8079);
        } else if (this.f10081c.size() <= 0) {
            MethodCollector.m26664o(8079);
        } else {
            C3854a.m9453a(3, "CaptureImageUploadController", "upload start cache size:" + this.f10081c.size());
            C89378p<byte[], Long> remove = this.f10081c.remove(0);
            byte[] first = remove.getFirst();
            long longValue = remove.getSecond().longValue();
            this.f10083e = true;
            AbstractC88412b bVar2 = this.f10088k;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f10088k) == null)) {
                bVar.dispose();
            }
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("data", new TypedByteArray("application/octet-stream", first, String.valueOf(System.currentTimeMillis())));
            this.f10088k = C3719d.C3720a.m9229a().mo9038a().uploadOriginScreen(multipartTypedOutput, Long.valueOf(this.f10085g)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C3662f(this, longValue), new C3663g(this, longValue));
            MethodCollector.m26664o(8079);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.stream.a$c */
    public static final class C3659c<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ C3656a f10091a;

        static {
            Covode.recordClassIndex(4171);
        }

        C3659c(C3656a aVar) {
            this.f10091a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C89219l.m154721d(obj, "");
            if (this.f10091a.f10081c.size() < 5) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.stream.a$d */
    public static final class C3660d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3656a f10092a;

        static {
            Covode.recordClassIndex(4172);
        }

        C3660d(C3656a aVar) {
            this.f10092a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC3055a aVar = this.f10092a.f10084f;
            if (aVar != null) {
                C3656a aVar2 = this.f10092a;
                C3854a.m9453a(3, "CaptureImageUploadController", "capture start");
                Bundle bundle = new Bundle();
                long currentTimeMillis = System.currentTimeMillis();
                bundle.putInt("mode", 1);
                bundle.putBoolean("outputPixelBufferOrigin", true);
                bundle.putBoolean("outputPixelBufferWithEffect", false);
                bundle.putInt("frameCount", 1);
                bundle.putBoolean("keepVideoCatcherAlive", true);
                aVar.mo8285a(bundle, new C3658b(aVar2, currentTimeMillis));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.stream.a$e */
    public static final class C3661e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3656a f10093a;

        static {
            Covode.recordClassIndex(4173);
        }

        C3661e(C3656a aVar) {
            this.f10093a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC88412b bVar;
            C3854a.m9453a(3, "CaptureImageUploadController", "stop");
            this.f10093a.f10082d = false;
            this.f10093a.f10086h = true;
            AbstractC88412b bVar2 = this.f10093a.f10080b;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f10093a.f10080b) == null)) {
                bVar.dispose();
            }
            this.f10093a.f10081c.clear();
            this.f10093a.f10084f = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.stream.a$f */
    public static final class C3662f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3656a f10094a;

        /* renamed from: b */
        final /* synthetic */ long f10095b;

        static {
            Covode.recordClassIndex(4174);
        }

        C3662f(C3656a aVar, long j) {
            this.f10094a = aVar;
            this.f10095b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f10094a.f10083e = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f10095b;
            C3854a.m9453a(3, "CaptureImageUploadController", "upload complete duration:".concat(String.valueOf(currentTimeMillis)));
            C3868c.m9488a("ttlive_sticker_upload_image_all", 0, currentTimeMillis);
            this.f10094a.mo8942c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.stream.a$g */
    public static final class C3663g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3656a f10096a;

        /* renamed from: b */
        final /* synthetic */ long f10097b;

        static {
            Covode.recordClassIndex(4175);
        }

        C3663g(C3656a aVar, long j) {
            this.f10096a = aVar;
            this.f10097b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f10096a.f10083e = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f10097b;
            C3854a.m9453a(3, "CaptureImageUploadController", "upload error msg:" + th.getMessage() + " duration:" + currentTimeMillis);
            JSONObject jSONObject = new JSONObject();
            if (th instanceof C2908a) {
                C3866a.m9474a(jSONObject, "error_code", (long) ((C2908a) th).getErrorCode());
            } else {
                C3866a.m9474a(jSONObject, "error_code", -1L);
            }
            C3866a.m9475a(jSONObject, "error_msg", th.getMessage());
            C3868c.m9490a("ttlive_sticker_upload_image_error", 0, currentTimeMillis, jSONObject);
            this.f10096a.mo8942c();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$b */
    public static final class C3658b implements ILiveStream.CatchPicCallback {

        /* renamed from: a */
        final /* synthetic */ C3656a f10089a;

        /* renamed from: b */
        final /* synthetic */ long f10090b;

        static {
            Covode.recordClassIndex(4170);
        }

        @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
        public final void onComplete() {
        }

        C3658b(C3656a aVar, long j) {
            this.f10089a = aVar;
            this.f10090b = j;
        }

        @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
        public final void onError(int i, String str) {
            C3854a.m9453a(3, "CaptureImageUploadController", "capture error code:" + i + " msg " + str);
        }

        @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.CatchPicCallback
        public final void onCatchedPic(boolean z, VideoCatcher videoCatcher) {
            if (videoCatcher != null && !z) {
                C3854a.m9453a(3, "CaptureImageUploadController", "capture catched pic");
                try {
                    this.f10089a.f10081c.add(new C89378p<>(videoCatcher.getCompressedStream(LiveBroadcastUploadVideoImageWidthSetting.INSTANCE.getValue(), LiveBroadcastUploadVideoImageHeightSetting.INSTANCE.getValue(), LiveBroadcastUploadVideoImageCompressRateSetting.INSTANCE.getValue()), Long.valueOf(this.f10090b)));
                    this.f10089a.mo8942c();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
