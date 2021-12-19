package com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import p4600h.p4611f.p4613b.C89219l;

public final class AdHomePageDataVM extends AbstractC1174ac {

    /* renamed from: e */
    public static final C17902a f42660e = new C17902a((byte) 0);

    /* renamed from: a */
    public boolean f42661a;

    /* renamed from: b */
    public C1213t<C18017a> f42662b = new C1213t<>();

    /* renamed from: c */
    public C1213t<Float> f42663c = new C1213t<>();

    /* renamed from: d */
    public C1213t<Boolean> f42664d = new C1213t<>();

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM$a */
    public static final class C17902a {
        static {
            Covode.recordClassIndex(20510);
        }

        /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM$a$a */
        public static final class C17903a implements C1175ad.AbstractC1177b {
            static {
                Covode.recordClassIndex(20511);
            }

            C17903a() {
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154721d(cls, "");
                return new AdHomePageDataVM();
            }
        }

        private C17902a() {
        }

        public /* synthetic */ C17902a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AdHomePageDataVM m33208a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, new C17903a()).mo3983a(AdHomePageDataVM.class);
            C89219l.m154716b(a, "");
            return (AdHomePageDataVM) a;
        }
    }

    static {
        Covode.recordClassIndex(20509);
    }

    /* renamed from: a */
    public final boolean mo28555a() {
        C18017a value = this.f42662b.getValue();
        if (value == null || value.f42891a == 4) {
            return false;
        }
        return true;
    }
}
