package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54848c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56202c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.d */
public final class C54994d {

    /* renamed from: a */
    public static final C54994d f125886a = new C54994d();

    private C54994d() {
    }

    static {
        Covode.recordClassIndex(64720);
    }

    /* renamed from: a */
    private static List<AbstractC54985b> m100600a(Context context, AbstractC56237a aVar, AbstractC17427b bVar, EnumC54977a aVar2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar2, "");
        List<AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b>> actionList = aVar2.getActionList();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) actionList, 10));
        Iterator<T> it = actionList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().invoke(context, bVar, aVar));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(obj instanceof C54995e) || !(aVar instanceof C54848c) || !C56202c.m102111a()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!((AbstractC54985b) obj2).mo91954e()) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    /* renamed from: a */
    public static void m100601a(ActivityC0945e eVar, IMContact iMContact, AbstractC56237a aVar, EnumC54977a aVar2) {
        String displayName;
        C19639i coreInfo;
        String str;
        String str2 = "";
        C89219l.m154721d(eVar, str2);
        C89219l.m154721d(aVar, str2);
        C89219l.m154721d(aVar2, str2);
        String bL_ = aVar.bL_();
        C89219l.m154716b(bL_, str2);
        AbstractC17427b a = AbstractC17427b.C17428a.m32308a(bL_);
        C19638h c = a.mo27749c();
        if (!(c == null || (coreInfo = c.getCoreInfo()) == null)) {
            if (iMContact != null) {
                str = iMContact.getDisplayName();
            } else {
                str = null;
            }
            coreInfo.setName(str);
        }
        List<AbstractC54985b> a2 = m100600a(eVar, aVar, a, aVar2);
        C23208a.C23211b bVar = new C23208a.C23211b();
        if (!(iMContact == null || (displayName = iMContact.getDisplayName()) == null)) {
            str2 = displayName;
        }
        C23208a.C23211b a3 = bVar.mo37794a(aVar2.getTitle(eVar, str2));
        if (C55052e.m100675f()) {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a2, 10));
            Iterator<T> it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo91956g());
            }
            a3.mo37795a(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) a2, 10));
            Iterator<T> it2 = a2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().mo91955f());
            }
            a3.mo37799b(arrayList2);
        }
        a3.mo37800b().show(eVar.getSupportFragmentManager(), "IMSessionLongPressHelper");
    }
}
