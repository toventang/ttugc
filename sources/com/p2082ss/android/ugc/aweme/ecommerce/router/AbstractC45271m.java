package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.C0242i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.router.view.AbstractC45290a;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.m */
public abstract class AbstractC45271m {

    /* renamed from: n */
    public static final C45272a f105509n = new C45272a((byte) 0);

    /* renamed from: a */
    private final Strategy$lifecycleObserver$1 f105510a;

    /* renamed from: b */
    private final AbstractC89244h f105511b;

    /* renamed from: g */
    public EnumC45273b f105512g;

    /* renamed from: h */
    public Uri f105513h;

    /* renamed from: i */
    public Uri f105514i;

    /* renamed from: j */
    public boolean f105515j;

    /* renamed from: k */
    public boolean f105516k;

    /* renamed from: l */
    public final ActivityC0945e f105517l;

    /* renamed from: m */
    public final C0242i f105518m;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.m$b */
    public enum EnumC45273b {
        UNKNOWN,
        NATIVE,
        FALLBACK;

        static {
            Covode.recordClassIndex(53725);
        }
    }

    static {
        Covode.recordClassIndex(53723);
    }

    public AbstractC45271m() {
        this(null, null, 3);
    }

    /* renamed from: i */
    public final AbstractC45290a mo76360i() {
        return (AbstractC45290a) this.f105511b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.m$a */
    public static final class C45272a {
        static {
            Covode.recordClassIndex(53724);
        }

        private C45272a() {
        }

        public /* synthetic */ C45272a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.m$c */
    static final class C45274c extends AbstractC89220m implements AbstractC89171a<AbstractC45290a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC45271m f105520a;

        static {
            Covode.recordClassIndex(53726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45274c(AbstractC45271m mVar) {
            super(0);
            this.f105520a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC45290a invoke() {
            ActivityC0945e eVar = null;
            if (C45275n.f105521a[this.f105520a.f105512g.ordinal()] != 1) {
                return null;
            }
            ActivityC0945e eVar2 = this.f105520a.f105517l;
            if (eVar2 == null) {
                C0242i iVar = this.f105520a.f105518m;
                if (iVar != null) {
                    eVar = iVar.getActivity();
                }
            } else {
                eVar = eVar2;
            }
            IStrategyService b = StrategyService.m87825b();
            if (eVar == null) {
                C89219l.m154715b();
            }
            Uri uri = this.f105520a.f105514i;
            if (uri == null) {
                C89219l.m154715b();
            }
            return b.mo76331a(eVar, uri, this.f105520a.f105515j);
        }
    }

    /* renamed from: a */
    public final void mo76358a(EnumC45273b bVar) {
        C89219l.m154721d(bVar, "");
        this.f105512g = bVar;
    }

    /* renamed from: a */
    public void mo73991a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        int i = C45275n.f105522b[this.f105512g.ordinal()];
        if (i == 1) {
            AbstractC45290a i2 = mo76360i();
            if (i2 == null || !i2.mo76364a()) {
                aVar.invoke();
            }
        } else if (i != 2) {
            aVar.invoke();
        } else {
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public final void mo76357a(Activity activity, Bundle bundle) {
        boolean z;
        AbstractC45290a i;
        C89219l.m154721d(activity, "");
        if (bundle != null) {
            z = bundle.getBoolean("tiktokec_fallback_is_reconstructed");
        } else {
            z = false;
        }
        this.f105516k = z;
        if (C45275n.f105523c[this.f105512g.ordinal()] == 1 && (i = mo76360i()) != null) {
            i.mo76361a(activity, bundle);
        }
    }

    /* renamed from: b */
    public final void mo76359b(Activity activity, Bundle bundle) {
        AbstractC45290a i;
        C89219l.m154721d(activity, "");
        if (bundle != null) {
            bundle.putBoolean("tiktokec_fallback_is_reconstructed", true);
        }
        if (C45275n.f105524d[this.f105512g.ordinal()] == 1 && (i = mo76360i()) != null) {
            i.mo76365b(activity, bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r4 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AbstractC45271m(androidx.fragment.app.ActivityC0945e r3, androidx.appcompat.app.C0242i r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.f105517l = r3
            r2.f105518m = r4
            com.ss.android.ugc.aweme.ecommerce.router.m$b r0 = com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m.EnumC45273b.UNKNOWN
            r2.f105512g = r0
            r0 = 1
            r2.f105515j = r0
            com.ss.android.ugc.aweme.ecommerce.router.Strategy$lifecycleObserver$1 r1 = new com.ss.android.ugc.aweme.ecommerce.router.Strategy$lifecycleObserver$1
            r1.<init>(r2)
            r2.f105510a = r1
            if (r3 != 0) goto L_0x002e
            if (r4 == 0) goto L_0x003b
        L_0x0019:
            androidx.lifecycle.i r0 = r4.getLifecycle()
            if (r0 == 0) goto L_0x0022
            r0.mo4012a(r1)
        L_0x0022:
            com.ss.android.ugc.aweme.ecommerce.router.m$c r0 = new com.ss.android.ugc.aweme.ecommerce.router.m$c
            r0.<init>(r2)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r2.f105511b = r0
            return
        L_0x002e:
            androidx.lifecycle.i r0 = r3.getLifecycle()
            if (r0 == 0) goto L_0x0038
            r0.mo4012a(r1)
            goto L_0x0022
        L_0x0038:
            if (r4 == 0) goto L_0x0022
            goto L_0x0019
        L_0x003b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "At least one of theContext or theFragment should be initialized"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m.<init>(androidx.fragment.app.e, androidx.appcompat.app.i):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC45271m(ActivityC0945e eVar, C0242i iVar, int i) {
        this((i & 1) != 0 ? null : eVar, (i & 2) != 0 ? null : iVar);
    }
}
