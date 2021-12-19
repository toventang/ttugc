package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.util.Pair;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45782c;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2870c.C45799c;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2871a.p2872a.C45805b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.g */
public final class C45725g extends AbstractC45717b {

    /* renamed from: b */
    private boolean f106496b;

    static {
        Covode.recordClassIndex(54243);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45717b
    /* renamed from: a */
    public final void mo77056a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45717b
    /* renamed from: b */
    public final void mo77060b(String str) {
        C89219l.m154721d(str, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.g$b */
    public static final class C45727b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45725g f106498a;

        static {
            Covode.recordClassIndex(54245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45727b(C45725g gVar) {
            super(0);
            this.f106498a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IFrameSlot.SlotViewModel slotViewModel = this.f106498a.f106476a.f106512d;
            if (slotViewModel != null) {
                C45799c.m88408a(slotViewModel, true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private final void m88273c() {
        this.f106476a.f106511c.mo77067b(new C45727b(this));
    }

    /* renamed from: b */
    private final void m88272b() {
        if (!this.f106496b) {
            this.f106476a.f106511c.f106555h = new C45726a(this);
            this.f106496b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.g$a */
    public static final class C45726a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45725g f106497a;

        static {
            Covode.recordClassIndex(54244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45726a(C45725g gVar) {
            super(1);
            this.f106497a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            this.f106497a.mo77059a(str2);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45725g(C45736i iVar) {
        super(iVar);
        C89219l.m154721d(iVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45717b
    /* renamed from: a */
    public final void mo77057a(C45782c cVar) {
        m88272b();
        if (this.f106476a.f106511c.f106552e != null) {
            m88273c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45717b
    /* renamed from: a */
    public final void mo77058a(C45805b bVar) {
        C89219l.m154721d(bVar, "");
        m88272b();
        if (this.f106476a.f106511c.f106552e != null) {
            m88273c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45717b
    /* renamed from: a */
    public final void mo77059a(String str) {
        Object obj;
        IFrameSlot.SlotViewModel slotViewModel;
        C1213t<Pair<Boolean, String>> tVar;
        Pair<Boolean, String> value;
        C89219l.m154721d(str, "");
        IFrameSlot.SlotViewModel slotViewModel2 = this.f106476a.f106512d;
        if (slotViewModel2 == null || (tVar = slotViewModel2.f15346a) == null || (value = tVar.getValue()) == null) {
            obj = null;
        } else {
            obj = value.first;
        }
        if (C89219l.m154714a(obj, (Object) true) && (slotViewModel = this.f106476a.f106512d) != null) {
            C45799c.m88408a(slotViewModel, false);
        }
        this.f106476a.f106511c.f106553f = null;
    }
}
