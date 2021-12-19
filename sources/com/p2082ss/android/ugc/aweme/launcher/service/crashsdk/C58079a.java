package com.p2082ss.android.ugc.aweme.launcher.service.crashsdk;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.launcher.service.crashsdk.a */
public final class C58079a implements ICrashSdkApi {

    /* renamed from: a */
    public static final C58079a f132320a = new C58079a();

    /* renamed from: b */
    private final /* synthetic */ ICrashSdkApi f132321b;

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    /* renamed from: a */
    public final void mo95582a() {
        this.f132321b.mo95582a();
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    /* renamed from: a */
    public final void mo95583a(Throwable th, String str) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(str, "");
        this.f132321b.mo95583a(th, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    /* renamed from: a */
    public final boolean mo95584a(long j) {
        return this.f132321b.mo95584a(j);
    }

    static {
        Covode.recordClassIndex(68127);
    }

    private C58079a() {
        ICrashSdkApi b = CrashSdkImpl.m104974b();
        C89219l.m154716b(b, "");
        this.f132321b = b;
    }
}
