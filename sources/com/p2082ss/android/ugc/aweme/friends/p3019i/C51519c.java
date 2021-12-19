package com.p2082ss.android.ugc.aweme.friends.p3019i;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.Phonenumber;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.ugc.aweme.friends.api.AbstractC51474a;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModel;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.p2082ss.android.ugc.aweme.relation.C66823a;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.aweme.utils.C80577ik;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.i.c */
public final class C51519c {

    /* renamed from: a */
    public static final C51519c f118730a = new C51519c();

    private C51519c() {
    }

    static {
        Covode.recordClassIndex(60784);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.i.c$a */
    public static final class C51520a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC74739d f118731a;

        static {
            Covode.recordClassIndex(60785);
        }

        C51520a(AbstractC74739d dVar) {
            this.f118731a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f118731a.mo117789e();
            this.f118731a.mo117791g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.i.c$b */
    public static final class C51521b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC74739d f118732a;

        static {
            Covode.recordClassIndex(60786);
        }

        C51521b(AbstractC74739d dVar) {
            this.f118732a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC74739d dVar = this.f118732a;
            C89219l.m154716b(th, "");
            dVar.mo117783a(th);
            this.f118732a.mo117791g();
        }
    }

    /* renamed from: a */
    public static final AbstractC88979t<C66823a> m95981a(List<? extends ContactModelV2> list, AbstractC74739d dVar, int i) {
        String str;
        String str2;
        C89219l.m154721d(list, "");
        C89219l.m154721d(dVar, "");
        if (C80580in.m139691e()) {
            AbstractC88979t<C66823a> b = AbstractC88979t.m154310b(new C66823a());
            C89219l.m154716b(b, "");
            return b;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(list.size());
        if (!C13603b.m24435a((Collection) list)) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            for (ContactModelV2 contactModelV2 : list) {
                for (String str3 : contactModelV2.phoneNumber) {
                    String str4 = null;
                    if (str3 != null) {
                        Phonenumber.PhoneNumber b2 = C80577ik.m139672b(str3);
                        if (b2 != null) {
                            str3 = String.valueOf(b2.getNationalNumber());
                            String valueOf = String.valueOf(b2.getCountryCode());
                            Charset forName = Charset.forName("UTF-8");
                            C89219l.m154716b(forName, "");
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                            byte[] bytes = valueOf.getBytes(forName);
                            C89219l.m154716b(bytes, "");
                            str4 = C13607d.m24439a(instance.digest(bytes));
                        }
                        Charset forName2 = Charset.forName("UTF-8");
                        C89219l.m154716b(forName2, "");
                        Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                        byte[] bytes2 = str3.getBytes(forName2);
                        C89219l.m154716b(bytes2, "");
                        str = C13607d.m24439a(instance.digest(bytes2));
                        C89219l.m154716b(str, "");
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(contactModelV2.name)) {
                        String str5 = contactModelV2.name;
                        C89219l.m154716b(str5, "");
                        Charset forName3 = Charset.forName("UTF-8");
                        C89219l.m154716b(forName3, "");
                        Objects.requireNonNull(str5, "null cannot be cast to non-null type java.lang.String");
                        byte[] bytes3 = str5.getBytes(forName3);
                        C89219l.m154716b(bytes3, "");
                        str2 = C13607d.m24439a(instance.digest(bytes3));
                        C89219l.m154716b(str2, "");
                    } else {
                        str2 = "";
                    }
                    ContactModel contactModel = new ContactModel(str, str2);
                    if (str4 != null) {
                        contactModel.regionCode = str4;
                    }
                    arrayList.add(contactModel);
                }
            }
            dVar.mo117788d();
            String b3 = C80361dw.m139332a().mo46677a().mo46682b().mo46674b(arrayList);
            C89219l.m154716b(b3, "");
            hashMap.put("contact", b3);
        }
        C29803q.m60037b(hashMap, true);
        AbstractC88979t<C66823a> a = AbstractC51474a.m95881a().uploadHashContacts("0", hashMap, Integer.valueOf(i)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143280b(new C51520a(dVar)).mo143264a(new C51521b(dVar));
        C89219l.m154716b(a, "");
        return a;
    }
}
