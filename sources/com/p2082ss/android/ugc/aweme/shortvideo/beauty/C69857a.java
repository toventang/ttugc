package com.p2082ss.android.ugc.aweme.shortvideo.beauty;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p938a.C14117i;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14104f;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.beauty.C34805b;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.filter.C50650d;
import com.p2082ss.android.ugc.aweme.filter.p2982b.C50647b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70645dp;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4092a.AbstractC77888b;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4092a.AbstractC77892f;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77896b;
import com.p2082ss.android.ugc.aweme.utils.C80249bj;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.HashMap;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.a */
public final class C69857a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.a$b */
    public static final class C69859b extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C69859b f156111a = new C69859b();

        static {
            Covode.recordClassIndex(82268);
        }

        C69859b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            return bool.booleanValue() ? "composer1" : "beautifynew1";
        }
    }

    static {
        Covode.recordClassIndex(82266);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.a$e */
    public static final class C69878e implements AbstractC14104f {
        static {
            Covode.recordClassIndex(82287);
        }

        C69878e() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.a$a */
    public static final class C69858a extends AbstractC89220m implements AbstractC89171a<AbstractC84398d> {

        /* renamed from: a */
        final /* synthetic */ boolean f156110a;

        static {
            Covode.recordClassIndex(82267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69858a(boolean z) {
            super(0);
            this.f156110a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84398d invoke() {
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            AbstractC46415f a = C46404c.m89554a(application, null);
            a.mo78913a(C89041ag.m154412a(C89387v.m154943a("is_story", Integer.valueOf(this.f156110a ? 1 : 0))));
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.a$d */
    public static final class C69874d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C69874d f156127a = new C69874d();

        static {
            Covode.recordClassIndex(82283);
        }

        C69874d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C77886a.f174745b = C63247i.f143610a;
            C77886a.f174751h = C34805b.m71107a();
            C77886a aVar = C77886a.f174762s;
            Boolean b = C63244g.m114602a().mo73297y().mo93848b();
            C89219l.m154716b(b, "");
            aVar.f174775a = b.booleanValue();
            C77886a.f174753j = C63244g.m114602a().mo73277e().getBeautificationMode(0);
            C698751 r0 = new AbstractC77896b() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.beauty.C69857a.C69874d.C698751 */

                static {
                    Covode.recordClassIndex(82284);
                }
            };
            C89219l.m154721d(r0, "");
            C77886a.f174750g = r0;
            C698762 r02 = new AbstractC77892f() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.beauty.C69857a.C69874d.C698762 */

                static {
                    Covode.recordClassIndex(82285);
                }
            };
            C89219l.m154721d(r02, "");
            C77886a.f174759p = r02;
            C698773 r03 = new AbstractC77888b() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.beauty.C69857a.C69874d.C698773 */

                static {
                    Covode.recordClassIndex(82286);
                }

                @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4092a.AbstractC77888b
                /* renamed from: a */
                public final void mo110214a(String str, HashMap<String, String> hashMap) {
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(hashMap, "");
                    C80322d.m139251a(str, hashMap);
                }
            };
            C89219l.m154721d(r03, "");
            C77886a.f174760q = r03;
            C50650d.m94912a();
            C77886a.f174761r = true;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.a$c */
    public static final class C69860c extends AbstractC89220m implements AbstractC89172b<C14117i.C14119b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f156112a;

        /* renamed from: b */
        final /* synthetic */ boolean f156113b;

        static {
            Covode.recordClassIndex(82269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69860c(boolean z, boolean z2) {
            super(1);
            this.f156112a = z;
            this.f156113b = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14117i.C14119b bVar) {
            C14117i.C14119b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C698611 r0 = C698611.f156114a;
            C89219l.m154721d(r0, "");
            bVar2.f34349a = r0;
            C698706 r02 = C698706.f156123a;
            C89219l.m154721d(r02, "");
            bVar2.f34350b = r02;
            C698717 r03 = C698717.f156124a;
            C89219l.m154721d(r03, "");
            bVar2.f34351c = r03;
            C698728 r04 = C698728.f156125a;
            C89219l.m154721d(r04, "");
            bVar2.f34352d = r04;
            bVar2.mo22691a(bVar2.f34352d);
            C698739 r05 = C698739.f156126a;
            C89219l.m154721d(r05, "");
            bVar2.f34354f = r05;
            C6986210 r06 = C6986210.f156115a;
            C89219l.m154721d(r06, "");
            bVar2.f34355g = r06;
            C6986311 r07 = C6986311.f156116a;
            C89219l.m154721d(r07, "");
            bVar2.f34356h = r07;
            C6986412 r08 = C6986412.f156117a;
            C89219l.m154721d(r08, "");
            bVar2.f34357i = r08;
            C6986513 r09 = C6986513.f156118a;
            C89219l.m154721d(r09, "");
            bVar2.f34358j = r09;
            C698662 r010 = C698662.f156119a;
            C89219l.m154721d(r010, "");
            bVar2.f34359k = r010;
            bVar2.f34362n = C698673.f156120a;
            bVar2.f34364p = C70645dp.m124866a().mo110180a();
            C698684 r011 = C698684.f156121a;
            C89219l.m154721d(r011, "");
            bVar2.f34363o = r011;
            bVar2.f34367s = C50647b.m94905a();
            bVar2.f34368t = this.f156112a;
            if (this.f156113b) {
                C69879b bVar3 = new C69879b("");
                C89219l.m154721d(bVar3, "");
                bVar2.f34369u = bVar3;
                bVar2.mo22691a(C698695.f156122a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final C14117i m123427a(C21582f fVar, boolean z) {
        C89219l.m154721d(fVar, "");
        C69874d dVar = C69874d.f156127a;
        C69878e eVar = new C69878e();
        ShortVideoContext shortVideoContext = (ShortVideoContext) fVar.mo35252b(ShortVideoContext.class, null);
        boolean z2 = true;
        if (shortVideoContext == null || !shortVideoContext.f155780aN) {
            z2 = false;
        }
        return new C14117i(fVar, new C69858a(z2), C69859b.f156111a, eVar, C80249bj.f179731a, dVar, new C69860c(z, z2));
    }
}
