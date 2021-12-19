package com.p2082ss.android.ugc.aweme.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl */
public final class AVCommerceServiceImpl implements IInternalCommerceService {
    static {
        Covode.recordClassIndex(66673);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: c */
    public final void mo93966c() {
        CommerceChallengeServiceImpl.m75741e().mo65390b();
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: d */
    public final LinkedHashMap<String, Bitmap> mo93967d() {
        return CommerceChallengeServiceImpl.m75741e().mo65394c();
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: e */
    public final boolean mo93968e() {
        return CommerceMediaServiceImpl.m77578f().mo66515c();
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: f */
    public final boolean mo93969f() {
        return CommerceMediaServiceImpl.m77578f().mo66517e();
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: g */
    public final void mo93970g() {
        CommerceMediaServiceImpl.m77578f().mo66510a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: b */
    public final boolean mo93965b() {
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            return false;
        }
        return CommerceMediaServiceImpl.m77578f().mo66511a();
    }

    /* renamed from: h */
    public static IInternalCommerceService m102988h() {
        MethodCollector.m26663i(6575);
        Object a = C81908b.m141854a(IInternalCommerceService.class, false);
        if (a != null) {
            IInternalCommerceService iInternalCommerceService = (IInternalCommerceService) a;
            MethodCollector.m26664o(6575);
            return iInternalCommerceService;
        }
        if (C81908b.f183204bG == null) {
            synchronized (IInternalCommerceService.class) {
                try {
                    if (C81908b.f183204bG == null) {
                        C81908b.f183204bG = new AVCommerceServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6575);
                    throw th;
                }
            }
        }
        AVCommerceServiceImpl aVCommerceServiceImpl = (AVCommerceServiceImpl) C81908b.f183204bG;
        MethodCollector.m26664o(6575);
        return aVCommerceServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: a */
    public final boolean mo93962a() {
        return CommerceMediaServiceImpl.m77578f().mo66513b();
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: a */
    public final void mo93960a(int i) {
        CommerceChallengeServiceImpl.m75741e().mo65379a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: a */
    public final UrlModel mo93959a(String str) {
        return CommerceChallengeServiceImpl.m75741e().mo65376a(str, true, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: a */
    public final boolean mo93964a(Music music) {
        return CommerceMediaServiceImpl.m77578f().mo66512a(music);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: a */
    public final void mo93961a(String str, String str2) {
        CommerceChallengeServiceImpl.m75741e().mo65391b(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService
    /* renamed from: a */
    public final /* synthetic */ boolean mo93963a(Context context, String str, TextView textView, Boolean bool, String str2) {
        boolean booleanValue = bool.booleanValue();
        C89219l.m154721d(context, "");
        C89219l.m154721d(textView, "");
        return CommerceChallengeServiceImpl.m75741e().mo65389a(context, str, true, textView, booleanValue, str2);
    }
}
