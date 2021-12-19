package com.p2082ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.services.e */
public final class C68431e implements ISettingDependService {

    /* renamed from: a */
    public static final C68431e f153187a = new C68431e();

    /* renamed from: b */
    private final /* synthetic */ ISettingDependService f153188b;

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingDependService
    /* renamed from: a */
    public final List<String> mo108853a() {
        return this.f153188b.mo108853a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingDependService
    /* renamed from: b */
    public final List<String> mo108854b() {
        return this.f153188b.mo108854b();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingDependService
    /* renamed from: c */
    public final String mo108855c() {
        return this.f153188b.mo108855c();
    }

    static {
        Covode.recordClassIndex(80676);
    }

    private C68431e() {
        ISettingDependService d = SettingDependServiceImpl.m120778d();
        C89219l.m154716b(d, "");
        this.f153188b = d;
    }
}
