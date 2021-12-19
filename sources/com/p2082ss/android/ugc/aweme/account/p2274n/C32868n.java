package com.p2082ss.android.ugc.aweme.account.p2274n;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.n.n */
public final class C32868n {

    /* renamed from: a */
    public static final C32868n f78248a = new C32868n();

    /* renamed from: b */
    private static final Set<String> f78249b = new LinkedHashSet();

    /* renamed from: c */
    private static final AbstractC89244h f78250c = C89250i.m154773a((AbstractC89171a) C32869a.f78251a);

    private C32868n() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.n.n$a */
    static final class C32869a extends AbstractC89220m implements AbstractC89171a<List<WhatsAppCodeItem>> {

        /* renamed from: a */
        public static final C32869a f78251a = new C32869a();

        static {
            Covode.recordClassIndex(39654);
        }

        C32869a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<WhatsAppCodeItem> invoke() {
            return m67472a();
        }

        /* renamed from: a */
        private static List<WhatsAppCodeItem> m67472a() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                List<WhatsAppCodeItem> showWhatsappByCallingCode = iESSettingsProxy.getShowWhatsappByCallingCode();
                C89219l.m154716b(showWhatsappByCallingCode, "");
                if (!showWhatsappByCallingCode.isEmpty()) {
                    return showWhatsappByCallingCode;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(39653);
    }

    /* renamed from: a */
    public static final boolean m67469a(String str) {
        if (m67471c(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m67470b(String str) {
        Boolean whatsappFirst;
        try {
            WhatsAppCodeItem c = m67471c(str);
            if (c == null || (whatsappFirst = c.getWhatsappFirst()) == null) {
                return true;
            }
            return whatsappFirst.booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: c */
    private static WhatsAppCodeItem m67471c(String str) {
        List list;
        Object obj = null;
        if (str == null || (list = (List) f78250c.getValue()) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            boolean z = false;
            try {
                String callingCode = ((WhatsAppCodeItem) next).getCallingCode();
                C89219l.m154716b(callingCode, "");
                if (callingCode != null) {
                    String a = C89361p.m154868a(C89361p.m154910b((CharSequence) callingCode).toString(), "+", "");
                    String a2 = C89361p.m154868a(C89361p.m154910b((CharSequence) str).toString(), "+", "");
                    if (!TextUtils.isEmpty(a)) {
                        z = TextUtils.equals(a, a2);
                        if (z) {
                            obj = next;
                            break;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } catch (Exception unused) {
            }
        }
        return (WhatsAppCodeItem) obj;
    }
}
