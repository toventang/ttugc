package com.p2082ss.android.ugc.aweme.commercialize.track;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AdTrackDependImpl;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.track.a */
public final class C38525a implements IAdTrackDepend {

    /* renamed from: a */
    public static final C38525a f91037a = new C38525a();

    /* renamed from: b */
    private final /* synthetic */ IAdTrackDepend f91038b;

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: a */
    public final int mo65631a(Exception exc) {
        C89219l.m154721d(exc, "");
        return this.f91038b.mo65631a(exc);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: a */
    public final String mo65632a() {
        return this.f91038b.mo65632a();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: a */
    public final String mo65633a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f91038b.mo65633a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: a */
    public final void mo65634a(boolean z, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f91038b.mo65634a(z, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: b */
    public final SharedPreferences mo65635b() {
        return this.f91038b.mo65635b();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: c */
    public final boolean mo65636c() {
        return this.f91038b.mo65636c();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: d */
    public final String mo65637d() {
        return this.f91038b.mo65637d();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: e */
    public final String mo65638e() {
        return this.f91038b.mo65638e();
    }

    static {
        Covode.recordClassIndex(46055);
    }

    private C38525a() {
        IAdTrackDepend f = AdTrackDependImpl.m75959f();
        C89219l.m154716b(f, "");
        this.f91038b = f;
    }
}
