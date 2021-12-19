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

/* renamed from: com.ss.android.ugc.aweme.setting.services.ISettingService */
public interface ISettingService {
    static {
        Covode.recordClassIndex(80661);
    }

    /* renamed from: a */
    BaseResponse mo108856a(String str, int i);

    /* renamed from: a */
    AbstractC58069b mo108857a(Context context);

    /* renamed from: a */
    String mo108858a(String str, Map<String, String> map);

    /* renamed from: a */
    String mo108859a(Locale locale);

    /* renamed from: a */
    List<AbstractC68342a> mo108860a();

    /* renamed from: a */
    Locale mo108861a(String str);

    /* renamed from: a */
    void mo108862a(Activity activity);

    /* renamed from: a */
    void mo108863a(String str, String str2, Context context);

    /* renamed from: a */
    void mo108864a(boolean z, AbstractC0952i iVar);

    /* renamed from: b */
    boolean mo108865b();

    /* renamed from: b */
    boolean mo108866b(Context context);

    /* renamed from: c */
    boolean mo108867c();

    /* renamed from: d */
    boolean mo108868d();

    /* renamed from: e */
    boolean mo108869e();

    /* renamed from: f */
    boolean mo108870f();

    /* renamed from: g */
    boolean mo108871g();

    String getReleaseBuildString();

    /* renamed from: h */
    String mo108872h();

    /* renamed from: i */
    List<AbstractC58069b> mo108873i();

    /* renamed from: j */
    Map<String, AbstractC58069b> mo108874j();

    /* renamed from: k */
    String mo108875k();

    /* renamed from: l */
    String mo108876l();

    /* renamed from: m */
    String mo108877m();

    /* renamed from: n */
    String mo108878n();

    /* renamed from: o */
    boolean mo108879o();

    /* renamed from: p */
    boolean mo108880p();

    C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> providePrivateSettingChangePresenter();

    C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> providePushSettingChangePresenter();

    C39088c<AbstractC39085b<C68348f>, AbstractC68351c> providePushSettingFetchPresenter();

    /* renamed from: q */
    Locale mo108881q();

    /* renamed from: r */
    void mo108882r();

    /* renamed from: s */
    boolean mo108883s();

    /* renamed from: t */
    C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> mo108884t();

    /* renamed from: u */
    C39088c<AbstractC39085b<C68348f>, AbstractC68351c> mo108885u();
}
