package com.p2082ss.android.ugc.aweme.setting.services;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.services.f */
public final class C68432f implements ISettingService {

    /* renamed from: a */
    public static final C68432f f153189a = new C68432f();

    /* renamed from: b */
    private final /* synthetic */ ISettingService f153190b;

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final BaseResponse mo108856a(String str, int i) {
        return this.f153190b.mo108856a(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final AbstractC58069b mo108857a(Context context) {
        C89219l.m154721d(context, "");
        return this.f153190b.mo108857a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final String mo108858a(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        return this.f153190b.mo108858a(str, map);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final String mo108859a(Locale locale) {
        return this.f153190b.mo108859a(locale);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final List<AbstractC68342a> mo108860a() {
        return this.f153190b.mo108860a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final Locale mo108861a(String str) {
        C89219l.m154721d(str, "");
        return this.f153190b.mo108861a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final void mo108862a(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f153190b.mo108862a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final void mo108863a(String str, String str2, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(context, "");
        this.f153190b.mo108863a(str, str2, context);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final void mo108864a(boolean z, AbstractC0952i iVar) {
        C89219l.m154721d(iVar, "");
        this.f153190b.mo108864a(z, iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: b */
    public final boolean mo108865b() {
        return this.f153190b.mo108865b();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: b */
    public final boolean mo108866b(Context context) {
        C89219l.m154721d(context, "");
        return this.f153190b.mo108866b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: c */
    public final boolean mo108867c() {
        return this.f153190b.mo108867c();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: d */
    public final boolean mo108868d() {
        return this.f153190b.mo108868d();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: e */
    public final boolean mo108869e() {
        return this.f153190b.mo108869e();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: f */
    public final boolean mo108870f() {
        return this.f153190b.mo108870f();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: g */
    public final boolean mo108871g() {
        return this.f153190b.mo108871g();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    public final String getReleaseBuildString() {
        return this.f153190b.getReleaseBuildString();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: h */
    public final String mo108872h() {
        return this.f153190b.mo108872h();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: i */
    public final List<AbstractC58069b> mo108873i() {
        return this.f153190b.mo108873i();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: j */
    public final Map<String, AbstractC58069b> mo108874j() {
        return this.f153190b.mo108874j();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: k */
    public final String mo108875k() {
        return this.f153190b.mo108875k();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: l */
    public final String mo108876l() {
        return this.f153190b.mo108876l();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: m */
    public final String mo108877m() {
        return this.f153190b.mo108877m();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: n */
    public final String mo108878n() {
        return this.f153190b.mo108878n();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: o */
    public final boolean mo108879o() {
        return this.f153190b.mo108879o();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: p */
    public final boolean mo108880p() {
        return this.f153190b.mo108880p();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    public final C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> providePrivateSettingChangePresenter() {
        return this.f153190b.providePrivateSettingChangePresenter();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    public final C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> providePushSettingChangePresenter() {
        return this.f153190b.providePushSettingChangePresenter();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    public final C39088c<AbstractC39085b<C68348f>, AbstractC68351c> providePushSettingFetchPresenter() {
        return this.f153190b.providePushSettingFetchPresenter();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: q */
    public final Locale mo108881q() {
        return this.f153190b.mo108881q();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: r */
    public final void mo108882r() {
        this.f153190b.mo108882r();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: s */
    public final boolean mo108883s() {
        return this.f153190b.mo108883s();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: t */
    public final C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> mo108884t() {
        return this.f153190b.mo108884t();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: u */
    public final C39088c<AbstractC39085b<C68348f>, AbstractC68351c> mo108885u() {
        return this.f153190b.mo108885u();
    }

    static {
        Covode.recordClassIndex(80677);
    }

    private C68432f() {
        ISettingService v = SettingServiceImpl.m120782v();
        C89219l.m154716b(v, "");
        this.f153190b = v;
    }
}
