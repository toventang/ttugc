package com.p2082ss.android.ugc.aweme.profile.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.profile.settings.d */
public final class C63877d {

    /* renamed from: a */
    public static final C63877d f144805a = new C63877d();

    /* renamed from: b */
    private static final AbstractC89244h f144806b = C89250i.m154773a((AbstractC89171a) C63878a.f144807a);

    private C63877d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.settings.d$a */
    static final class C63878a extends AbstractC89220m implements AbstractC89171a<ThirdPartyBindingEntry> {

        /* renamed from: a */
        public static final C63878a f144807a = new C63878a();

        static {
            Covode.recordClassIndex(75304);
        }

        C63878a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ThirdPartyBindingEntry invoke() {
            return new ThirdPartyBindingEntry(false, false, false, 7, null);
        }
    }

    static {
        Covode.recordClassIndex(75303);
    }

    /* renamed from: a */
    public static final ThirdPartyBindingEntry m115574a() {
        try {
            ThirdPartyBindingEntry thirdPartyBindingEntry = (ThirdPartyBindingEntry) SettingsManager.m29616a().mo25396a("third_party_binding", ThirdPartyBindingEntry.class);
            if (thirdPartyBindingEntry == null) {
                return (ThirdPartyBindingEntry) f144806b.getValue();
            }
            return thirdPartyBindingEntry;
        } catch (Throwable unused) {
        }
    }
}
