package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55717a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.f */
public class C55083f {

    /* renamed from: a */
    private static C55083f f126062a;

    static {
        Covode.recordClassIndex(64811);
    }

    private C55083f() {
    }

    /* renamed from: a */
    public static C55083f m100744a() {
        MethodCollector.m26663i(5282);
        if (f126062a == null) {
            synchronized (C55083f.class) {
                try {
                    if (f126062a == null) {
                        f126062a = new C55083f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5282);
                    throw th;
                }
            }
        }
        C55083f fVar = f126062a;
        MethodCollector.m26664o(5282);
        return fVar;
    }

    /* renamed from: a */
    public static IMUser m100745a(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return (IMUser) iMContact;
        }
        if (iMContact instanceof IMConversation) {
            return m100746a((IMConversation) iMContact);
        }
        return null;
    }

    /* renamed from: a */
    private static IMUser m100746a(IMConversation iMConversation) {
        if (iMConversation.getConversationType() == C19489e.AbstractC19490a.f46180a) {
            return C55085g.m100751a(String.valueOf(AbstractC17427b.C17428a.m32311c(iMConversation.getConversationId())), C55080c.m100730a(iMConversation.getConversationId()));
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m100747a(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final List<IMUser> mo92004a(List<IMUser> list, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty() && !TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                } else if (C55717a.m101461a(str.charAt(i))) {
                    str = C55717a.m101465c(str).toLowerCase();
                    break;
                } else {
                    i++;
                }
            }
            for (IMUser iMUser : list) {
                if ((z || iMUser.getType() == 0 || iMUser.getType() == 3) && !C55197c.m100918a(iMUser)) {
                    if (!TextUtils.isEmpty(iMUser.getUniqueId())) {
                        if (m100747a(iMUser.getUniqueId(), lowerCase)) {
                            iMUser.setSearchType(1);
                            arrayList.add(iMUser);
                        }
                    } else if (m100747a(iMUser.getShortId(), lowerCase)) {
                        iMUser.setSearchType(1);
                        arrayList.add(iMUser);
                    }
                    if (!TextUtils.isEmpty(iMUser.getRemarkName()) && m100747a(iMUser.getRemarkName(), lowerCase)) {
                        iMUser.setSearchType(5);
                        arrayList.add(iMUser);
                    } else if (!TextUtils.isEmpty(iMUser.getContactName()) && (m100747a(iMUser.getContactName(), lowerCase) || m100748a(iMUser.getContactName(), iMUser.getContactNamePinyin(), lowerCase, str))) {
                        iMUser.setSearchType(2);
                        arrayList.add(iMUser);
                    } else if (!TextUtils.isEmpty(iMUser.getNickName()) && m100747a(iMUser.getNickName(), lowerCase)) {
                        iMUser.setSearchType(3);
                        arrayList.add(iMUser);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<IMUser>() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f.C550841 */

                static {
                    Covode.recordClassIndex(64812);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(IMUser iMUser, IMUser iMUser2) {
                    IMUser iMUser3 = iMUser;
                    IMUser iMUser4 = iMUser2;
                    if (iMUser3 == null) {
                        if (iMUser4 == null) {
                            return 0;
                        }
                        return -1;
                    } else if (iMUser4 == null) {
                        return 1;
                    } else {
                        return Integer.compare(iMUser3.getSearchType(), iMUser4.getSearchType());
                    }
                }
            });
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m100748a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str4)) {
            if (str2.contains(str3)) {
                return true;
            }
            if (str2.contains(str4)) {
                int i = 0;
                int i2 = 0;
                for (char c : str3.toCharArray()) {
                    if (C55717a.m101461a(c)) {
                        if (i > i2 && !str.contains(str3.substring(i2, i))) {
                            return false;
                        }
                        i++;
                        i2 = i;
                    } else if (i != str3.length() - 1) {
                        i++;
                    } else if (!str.contains(str3.substring(i2, i + 1))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
