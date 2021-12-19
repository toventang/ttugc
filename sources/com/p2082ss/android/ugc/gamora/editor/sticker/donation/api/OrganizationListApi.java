package com.p2082ss.android.ugc.gamora.editor.sticker.donation.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82773d;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationListApi */
public interface OrganizationListApi {

    /* renamed from: a */
    public static final C82738a f184942a = C82738a.f184944b;

    static {
        Covode.recordClassIndex(96585);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/donation/orgs/")
    AbstractC88979t<C82773d> getOrganizationList(@AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2);

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationListApi$a */
    public static final class C82738a {

        /* renamed from: a */
        static final String f184943a = "https://api.tiktokv.com";

        /* renamed from: b */
        static final /* synthetic */ C82738a f184944b = new C82738a();

        private C82738a() {
        }

        static {
            Covode.recordClassIndex(96586);
        }
    }
}
