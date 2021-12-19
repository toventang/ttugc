package com.p2082ss.android.ugc.aweme.setting.p3722j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32176a;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32178aa;
import com.p2082ss.android.ugc.aweme.setting.api.C67996a;
import com.p2082ss.android.ugc.aweme.setting.api.C67998b;
import com.p2082ss.android.ugc.aweme.setting.api.IChangePhoneHelperApi;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.j.b */
public final class C68114b {

    /* renamed from: a */
    public static SoftReference<AbstractC68113a> f152519a;

    /* renamed from: b */
    public static final C68114b f152520b = new C68114b();

    private C68114b() {
    }

    static {
        Covode.recordClassIndex(80310);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.j.b$c */
    public static final class C68117c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C68117c f152523a = new C68117c();

        static {
            Covode.recordClassIndex(80313);
        }

        C68117c() {
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC68113a aVar;
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                C67998b.C67999a aVar2 = ((C67998b) iVar.mo5545d()).f152345b;
                if (aVar2 != null && aVar2.f152347b) {
                    IChangePhoneHelperApi.C67991a.f152327a.check2sv().mo5532a(C68115a.f152521a);
                    return C89391z.f203057a;
                }
            }
            SoftReference<AbstractC68113a> softReference = C68114b.f152519a;
            if (!(softReference == null || (aVar = softReference.get()) == null)) {
                aVar.mo108572a(false, false);
            }
            C68114b.f152519a = null;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.j.b$a */
    static final class C68115a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C68115a f152521a = new C68115a();

        static {
            Covode.recordClassIndex(80311);
        }

        C68115a() {
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC68113a aVar;
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                if (((C32176a) iVar.mo5545d()).getData() != null) {
                    C32176a.C32177a data = ((C32176a) iVar.mo5545d()).getData();
                    if (data == null) {
                        C89219l.m154715b();
                    }
                    List<C32178aa> two_step_verify_ways = data.getTwo_step_verify_ways();
                    if (two_step_verify_ways != null) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : two_step_verify_ways) {
                            if (C89219l.m154714a((Object) t.is_available(), (Object) true)) {
                                arrayList.add(t);
                            }
                        }
                        if (arrayList.size() < 2) {
                            IChangePhoneHelperApi.C67991a.f152327a.availableVerifyWays().mo5532a(C68116b.f152522a);
                            return C89391z.f203057a;
                        }
                    }
                }
            }
            SoftReference<AbstractC68113a> softReference = C68114b.f152519a;
            if (!(softReference == null || (aVar = softReference.get()) == null)) {
                aVar.mo108572a(false, false);
            }
            C68114b.f152519a = null;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.j.b$b */
    static final class C68116b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C68116b f152522a = new C68116b();

        static {
            Covode.recordClassIndex(80312);
        }

        C68116b() {
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC68113a aVar;
            AbstractC68113a aVar2;
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                if (((C67996a) iVar.mo5545d()).f152340b != null) {
                    C67996a.C67997a aVar3 = ((C67996a) iVar.mo5545d()).f152340b;
                    if (aVar3 == null) {
                        C89219l.m154715b();
                    }
                    SoftReference<AbstractC68113a> softReference = C68114b.f152519a;
                    if (!(softReference == null || (aVar2 = softReference.get()) == null)) {
                        aVar2.mo108572a(aVar3.f152343c, aVar3.f152342b);
                    }
                    C68114b.f152519a = null;
                    return C89391z.f203057a;
                }
            }
            SoftReference<AbstractC68113a> softReference2 = C68114b.f152519a;
            if (!(softReference2 == null || (aVar = softReference2.get()) == null)) {
                aVar.mo108572a(false, false);
            }
            C68114b.f152519a = null;
            return C89391z.f203057a;
        }
    }
}
