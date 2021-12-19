package com.p2082ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sdk.p1625a.C22332b;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p2082ss.android.C29845d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.token.C30625b;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.token.C30630f;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.C43107dn;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58179c;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.net.C61463q;
import com.p2082ss.android.ugc.aweme.net.interceptor.TokenSdkCommonParamsInterceptorTTNet;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.task.TokenSdkTask */
public class TokenSdkTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68739);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        String str;
        int i;
        String str2;
        C51423a.m95787a("TokenSdkTask");
        if (C29843f.m60129a(C17867d.m33078a())) {
            int i2 = C17867d.f42588l;
            if (i2 == 5 || i2 == 4) {
                str = "lite";
            } else {
                str = "normal";
            }
            RetrofitUtils.m43285a(new TokenSdkCommonParamsInterceptorTTNet(str));
            AccountService.m65215a().mo57079o();
            C29845d.f71194a = C58466d.f133101a;
            C30625b bVar = new C30625b();
            bVar.f73189e = 600000;
            boolean z = true;
            bVar.f73188d = true;
            List asList = Arrays.asList("tiktokv.com", "tiktok.com", "byteoversea.com");
            if (!(asList == null || asList.size() == 0)) {
                bVar.f73186b.addAll(asList);
            }
            Context a = C17867d.m33078a();
            if (!C30628d.f73193a) {
                C30630f fVar = new C30630f(a, bVar);
                C30630f.f73196a = fVar;
                fVar.mo54904a(C30628d.f73194b);
                C30628d.f73193a = true;
                if (C30628d.f73195c.size() != 0) {
                    C30630f.f73196a.mo54903a((Collection<String>) C30628d.f73195c);
                    C30628d.f73195c.clear();
                    C30628d.f73195c = null;
                }
                C22332b a2 = C22332b.m42039a();
                if (a2.f52771a != null && a2.f52772b) {
                    if (TextUtils.isEmpty(bVar.f73185a)) {
                        i = 202;
                        str2 = "token beat host == null";
                    } else {
                        Set<String> set = bVar.f73186b;
                        if (set == null || set.isEmpty()) {
                            i = 203;
                            str2 = "host list is empty";
                        } else {
                            str2 = null;
                            i = 0;
                        }
                    }
                    a2.f52771a.mo38216a("1002", i, str2);
                }
            }
            if (C61463q.f139527a == null) {
                if (C36145b.m73641b().mo63267b(C17867d.m33078a(), "awe_network_x_token_disabled") != 0) {
                    z = false;
                }
                C61463q.f139527a = Boolean.valueOf(z);
            }
            boolean booleanValue = C61463q.f139527a.booleanValue();
            if (C30628d.f73193a && booleanValue != C30628d.f73194b) {
                C30630f.f73196a.mo54904a(booleanValue);
                C30628d.f73194b = booleanValue;
            }
            C1731i.m5631a(600).mo5534a(C58467e.f133102a, C1731i.f5562a, null);
            long j = 1000;
            if (((Boolean) C58179c.f132484i.getValue()).booleanValue()) {
                j = 5000;
            } else if (((Boolean) C58179c.f132485j.getValue()).booleanValue()) {
                j = 7000;
            }
            C1731i.m5631a(j).mo5534a(C58468f.f133103a, C1731i.f5562a, null);
            C31575b.m65859a();
            C31575b.f75524a.mo57064a(new IAccountService.AbstractC31272b() {
                /* class com.p2082ss.android.ugc.aweme.legoImpl.task.TokenSdkTask.C584611 */

                static {
                    Covode.recordClassIndex(68740);
                }

                @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
                public final void onAccountResult(int i, boolean z, int i2, User user) {
                    if (i == 1 || i == 2) {
                        C43107dn.m86004a();
                    } else if (i == 3) {
                        C43107dn.m86006b();
                    }
                }
            });
        }
    }
}
