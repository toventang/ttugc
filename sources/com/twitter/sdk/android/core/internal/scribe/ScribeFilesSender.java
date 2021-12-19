package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.AbstractC87793j;
import com.twitter.sdk.android.core.C87686e;
import com.twitter.sdk.android.core.C87691i;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C87728g;
import com.twitter.sdk.android.core.internal.C87733l;
import com.twitter.sdk.android.core.internal.p4498a.C87712a;
import com.twitter.sdk.android.core.internal.p4498a.C87715d;
import com.twitter.sdk.android.core.internal.p4498a.C87716e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90208y;
import okhttp3.Request;
import p4640l.AbstractC89716b;
import p4640l.C89781l;
import p4640l.C89782m;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89727k;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89735s;

/* access modifiers changed from: package-private */
public final class ScribeFilesSender implements AbstractC87778q {

    /* renamed from: a */
    static final byte[] f199305a = {44};

    /* renamed from: b */
    private static final byte[] f199306b = {91};

    /* renamed from: c */
    private static final byte[] f199307c = {93};

    /* renamed from: d */
    private final Context f199308d;

    /* renamed from: e */
    private final C87786u f199309e;

    /* renamed from: f */
    private final long f199310f;

    /* renamed from: g */
    private final TwitterAuthConfig f199311g;

    /* renamed from: h */
    private final AbstractC87793j<? extends C87691i<TwitterAuthToken>> f199312h;

    /* renamed from: i */
    private final C87686e f199313i;

    /* renamed from: j */
    private final AtomicReference<ScribeService> f199314j = new AtomicReference<>();

    /* renamed from: k */
    private final ExecutorService f199315k;

    /* renamed from: l */
    private final C87733l f199316l;

    /* access modifiers changed from: package-private */
    public interface ScribeService {
        static {
            Covode.recordClassIndex(103750);
        }

        @AbstractC89731o(mo144285a = "/{version}/jot/{type}")
        @AbstractC89721e
        @AbstractC89727k(mo144282a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        AbstractC89716b<AbstractC90031ad> upload(@AbstractC89735s(mo144290a = "version") String str, @AbstractC89735s(mo144290a = "type") String str2, @AbstractC89719c(mo144273a = "log[]") String str3);

        @AbstractC89731o(mo144285a = "/scribe/{sequence}")
        @AbstractC89721e
        @AbstractC89727k(mo144282a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        AbstractC89716b<AbstractC90031ad> uploadSequence(@AbstractC89735s(mo144290a = "sequence") String str, @AbstractC89719c(mo144273a = "log[]") String str2);
    }

    static {
        Covode.recordClassIndex(103749);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.util.concurrent.atomic.AtomicReference<com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender$ScribeService> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private synchronized ScribeService m152720a() {
        ScribeService scribeService;
        C90208y d;
        MethodCollector.m26663i(4951);
        if (this.f199314j.get() == null) {
            C87691i a = this.f199312h.mo142122a(this.f199310f);
            if (a == null || a.f199192a == null) {
                d = new C90208y.C90210a().mo145092a(C87716e.m152644a()).mo145096a(new C87753a(this.f199309e, this.f199316l)).mo145096a(new C87712a(this.f199313i)).mo145103d();
            } else {
                d = new C90208y.C90210a().mo145092a(C87716e.m152644a()).mo145096a(new C87753a(this.f199309e, this.f199316l)).mo145096a(new C87715d(a, this.f199311g)).mo145103d();
            }
            this.f199314j.compareAndSet(null, new C89782m.C89784a().mo144323a(this.f199309e.f199403b).mo144325a(d).mo144326a().mo144318a(ScribeService.class));
        }
        scribeService = this.f199314j.get();
        MethodCollector.m26664o(4951);
        return scribeService;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender$a */
    public static class C87753a implements AbstractC90202u {

        /* renamed from: a */
        private final C87786u f199317a;

        /* renamed from: b */
        private final C87733l f199318b;

        static {
            Covode.recordClassIndex(103751);
        }

        @Override // okhttp3.AbstractC90202u
        public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
            Request.C90016a newBuilder = aVar.mo144856a().newBuilder();
            if (!TextUtils.isEmpty(this.f199317a.f199407f)) {
                newBuilder.mo144692a("User-Agent", this.f199317a.f199407f);
            }
            if (!TextUtils.isEmpty(this.f199318b.mo142178a())) {
                newBuilder.mo144692a("X-Client-UUID", this.f199318b.mo142178a());
            }
            newBuilder.mo144692a("X-Twitter-Polling", "true");
            return aVar.mo144857a(newBuilder.mo144698a());
        }

        C87753a(C87786u uVar, C87733l lVar) {
            this.f199317a = uVar;
            this.f199318b = lVar;
        }
    }

    /* renamed from: b */
    private static String m152721b(List<File> list) {
        Throwable th;
        MethodCollector.m26663i(4815);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        boolean[] zArr = new boolean[1];
        byteArrayOutputStream.write(f199306b);
        for (File file : list) {
            C87779r rVar = null;
            try {
                C87779r rVar2 = new C87779r(file);
                try {
                    rVar2.mo142245a(new C87791y(zArr, byteArrayOutputStream));
                    C87728g.m152672a(rVar2);
                } catch (Throwable th2) {
                    th = th2;
                    rVar = rVar2;
                    C87728g.m152672a(rVar);
                    MethodCollector.m26664o(4815);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C87728g.m152672a(rVar);
                MethodCollector.m26664o(4815);
                throw th;
            }
        }
        byteArrayOutputStream.write(f199307c);
        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
        MethodCollector.m26664o(4815);
        return byteArrayOutputStream2;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87778q
    /* renamed from: a */
    public final boolean mo142205a(List<File> list) {
        C89781l<AbstractC90031ad> a;
        if (m152720a() != null) {
            try {
                String b = m152721b(list);
                C87728g.m152671a(this.f199308d, b);
                ScribeService a2 = m152720a();
                if (!TextUtils.isEmpty(this.f199309e.f199406e)) {
                    a = a2.uploadSequence(this.f199309e.f199406e, b).mo144267a();
                } else {
                    a = a2.upload(this.f199309e.f199404c, this.f199309e.f199405d, b).mo144267a();
                }
                if (a.f203560a.f204107c == 200) {
                    return true;
                }
                C87728g.m152677b(this.f199308d, "Failed sending files");
                if (a.f203560a.f204107c == 500 || a.f203560a.f204107c == 400) {
                    return true;
                }
            } catch (Exception unused) {
                C87728g.m152677b(this.f199308d, "Failed sending files");
            }
        } else {
            C87728g.m152671a(this.f199308d, "Cannot attempt upload at this time");
        }
        return false;
    }

    ScribeFilesSender(Context context, C87786u uVar, long j, TwitterAuthConfig twitterAuthConfig, AbstractC87793j<? extends C87691i<TwitterAuthToken>> jVar, C87686e eVar, ExecutorService executorService, C87733l lVar) {
        this.f199308d = context;
        this.f199309e = uVar;
        this.f199310f = j;
        this.f199311g = twitterAuthConfig;
        this.f199312h = jVar;
        this.f199313i = eVar;
        this.f199315k = executorService;
        this.f199316l = lVar;
    }
}
