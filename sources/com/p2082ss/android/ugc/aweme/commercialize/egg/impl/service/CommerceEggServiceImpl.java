package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.service;

import android.text.TextUtils;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.C37795a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2559c.C37818a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2560d.C37820a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2561e.C37823a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.view.C37829a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2553b.AbstractC37785b;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2554c.AbstractC37786a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37787a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37793a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p2082ss.android.ugc.aweme.feed.model.EditHint;
import com.p2082ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import com.p2082ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl */
public final class CommerceEggServiceImpl implements ICommerceEggService {
    static {
        Covode.recordClassIndex(45276);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    /* renamed from: b */
    public final AbstractC37786a mo65839b() {
        return C37820a.f89301a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    /* renamed from: a */
    public final void mo65835a() {
        C37795a.f89250d = null;
        C37795a.f89249c = null;
    }

    /* renamed from: c */
    public static ICommerceEggService m76488c() {
        MethodCollector.m26663i(10367);
        Object a = C81908b.m141854a(ICommerceEggService.class, false);
        if (a != null) {
            ICommerceEggService iCommerceEggService = (ICommerceEggService) a;
            MethodCollector.m26664o(10367);
            return iCommerceEggService;
        }
        if (C81908b.f183184an == null) {
            synchronized (ICommerceEggService.class) {
                try {
                    if (C81908b.f183184an == null) {
                        C81908b.f183184an = new CommerceEggServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10367);
                    throw th;
                }
            }
        }
        CommerceEggServiceImpl commerceEggServiceImpl = (CommerceEggServiceImpl) C81908b.f183184an;
        MethodCollector.m26664o(10367);
        return commerceEggServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    /* renamed from: a */
    public final AbstractC37793a mo65833a(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        return new C37829a(viewStub);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    /* renamed from: a */
    public final void mo65836a(AbstractC37785b bVar) {
        C89219l.m154721d(bVar, "");
        C37818a.f89298a.mo123715a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    /* renamed from: a */
    public final String mo65834a(String str) {
        boolean z;
        List<? extends EditHint> list;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (list = C37795a.f89250d) == null) {
            return null;
        }
        for (EditHint editHint : list) {
            if (TextUtils.equals(str, editHint.getLanguage())) {
                return editHint.getHint();
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    /* renamed from: a */
    public final void mo65837a(C37787a aVar, String str) {
        C89219l.m154721d(str, "");
        if (aVar != null && !TextUtils.isEmpty(aVar.f89212b) && !TextUtils.isEmpty(aVar.f89211a)) {
            int hashCode = str.hashCode();
            if (hashCode != -906336856) {
                if (hashCode == 3321751 && str.equals("like")) {
                    if (aVar == null) {
                        aVar = null;
                    } else if (aVar.f89217g) {
                        C37823a.m76482a(aVar);
                    }
                    C37795a.f89247a = aVar;
                }
            } else if (str.equals("search")) {
                if (aVar == null) {
                    aVar = null;
                } else if (aVar.f89217g) {
                    C37823a.m76482a(aVar);
                }
                C37795a.f89248b = aVar;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    /* renamed from: a */
    public final void mo65838a(String str, String str2, ItemCommentEggGroup itemCommentEggGroup) {
        List<EditHint> list;
        if (itemCommentEggGroup != null) {
            List<ItemCommentEggData> commentEggData = itemCommentEggGroup.getCommentEggData();
            if (commentEggData != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<ItemCommentEggData> it = commentEggData.iterator();
                while (it.hasNext()) {
                    T t = (T) it.next();
                    if (C37795a.m76435a(t)) {
                        C37787a.C37788a aVar = new C37787a.C37788a();
                        C89219l.m154716b(t, "");
                        aVar.f89227a = t;
                        aVar.f89228b = true;
                        C37787a a = aVar.mo65800a(str).mo65802b(str2).mo65801a();
                        arrayList.add(a);
                        C37823a.m76482a(a);
                    }
                }
                C37795a.f89249c = arrayList;
            }
            list = itemCommentEggGroup.getEditintist();
        } else {
            list = null;
        }
        C37795a.f89250d = list;
    }
}
