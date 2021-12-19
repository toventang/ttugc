package com.p2082ss.android.ugc.aweme.friends.api;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.i18n.phonenumbers.Phonenumber;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModel;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.p2082ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.aweme.utils.C80577ik;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.api.UploadContactsApi */
public final class UploadContactsApi {

    /* renamed from: a */
    private static final UploadContactsService f118657a = ((UploadContactsService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(UploadContactsService.class));

    /* renamed from: com.ss.android.ugc.aweme.friends.api.UploadContactsApi$UploadContactsService */
    public interface UploadContactsService {
        static {
            Covode.recordClassIndex(60738);
        }

        @AbstractC22012t(mo35799a = "/aweme/v1/upload/contacts/")
        @AbstractC21999g
        AbstractC21983b<String> uploadContacts(@AbstractC22018z(mo35807a = "need_unregistered_user") String str, @AbstractC21998f Map<String, String> map);

        @AbstractC22012t(mo35799a = "/aweme/v1/upload/hashcontacts/")
        @AbstractC21999g
        AbstractC21983b<UploadContactsResult> uploadHashContacts(@AbstractC22018z(mo35807a = "need_unregistered_user") String str, @AbstractC21998f Map<String, String> map, @AbstractC22018z(mo35807a = "scene") Integer num);
    }

    static {
        Covode.recordClassIndex(60737);
    }

    /* renamed from: a */
    public static UploadContactsResult m95880a(List<ContactModelV2> list, AbstractC74739d dVar, int i, int i2) {
        String str;
        String str2;
        if (C80580in.m139691e() || !C51648a.f118980a.mo87325e()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!C13603b.m24435a((Collection) list)) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            ArrayList arrayList = new ArrayList(list.size());
            for (ContactModelV2 contactModelV2 : list) {
                for (String str3 : contactModelV2.phoneNumber) {
                    String str4 = "";
                    if (str3 != null) {
                        Phonenumber.PhoneNumber b = C80577ik.m139672b(str3);
                        if (b != null) {
                            str3 = String.valueOf(b.getNationalNumber());
                            b.getCountryCode();
                            b.getNationalNumber();
                            str = C13607d.m24439a(instance.digest(String.valueOf(b.getCountryCode()).getBytes("UTF-8")));
                        } else {
                            str = null;
                        }
                        str2 = C13607d.m24439a(instance.digest(str3.getBytes("UTF-8")));
                    } else {
                        str = null;
                        str2 = str4;
                    }
                    if (!TextUtils.isEmpty(contactModelV2.name)) {
                        str4 = C13607d.m24439a(instance.digest(contactModelV2.name.getBytes("UTF-8")));
                    }
                    ContactModel contactModel = new ContactModel(str2, str4);
                    if (str != null) {
                        contactModel.regionCode = str;
                    }
                    arrayList.add(contactModel);
                }
            }
            if (dVar != null) {
                dVar.mo117788d();
            }
            hashMap.put("contact", C80361dw.m139332a().mo46677a().mo46682b().mo46674b(arrayList));
        }
        C29803q.m60037b(hashMap, true);
        return f118657a.uploadHashContacts(String.valueOf(i), hashMap, Integer.valueOf(i2)).execute().f52262b;
    }
}
