package com.p2082ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.UpdateSettingServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.services.h */
public final class C68434h implements IUpdateSettingService {

    /* renamed from: a */
    public static final C68434h f153192a = new C68434h();

    /* renamed from: b */
    private final /* synthetic */ IUpdateSettingService f153193b;

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IUpdateSettingService
    /* renamed from: a */
    public final C68348f mo108581a() {
        return this.f153193b.mo108581a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IUpdateSettingService
    /* renamed from: a */
    public final void mo108582a(String str, int i) {
        this.f153193b.mo108582a(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IUpdateSettingService
    /* renamed from: a */
    public final void mo108583a(JSONObject jSONObject) {
        this.f153193b.mo108583a(jSONObject);
    }

    static {
        Covode.recordClassIndex(80679);
    }

    private C68434h() {
        IUpdateSettingService b = UpdateSettingServiceImpl.m120294b();
        C89219l.m154716b(b, "");
        this.f153193b = b;
    }
}
