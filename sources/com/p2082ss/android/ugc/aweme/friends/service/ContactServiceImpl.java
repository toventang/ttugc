package com.p2082ss.android.ugc.aweme.friends.service;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39145n;
import com.p2082ss.android.ugc.aweme.friends.p3012b.C51476a;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.service.ContactServiceImpl */
public final class ContactServiceImpl implements IContactService {
    static {
        Covode.recordClassIndex(60970);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IContactService
    /* renamed from: a */
    public final AbstractC39145n mo87291a() {
        return C51476a.f118658a;
    }

    /* renamed from: b */
    public static IContactService m96112b() {
        MethodCollector.m26663i(12081);
        Object a = C81908b.m141854a(IContactService.class, false);
        if (a != null) {
            IContactService iContactService = (IContactService) a;
            MethodCollector.m26664o(12081);
            return iContactService;
        }
        if (C81908b.f183239bp == null) {
            synchronized (IContactService.class) {
                try {
                    if (C81908b.f183239bp == null) {
                        C81908b.f183239bp = new ContactServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12081);
                    throw th;
                }
            }
        }
        ContactServiceImpl contactServiceImpl = (ContactServiceImpl) C81908b.f183239bp;
        MethodCollector.m26664o(12081);
        return contactServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IContactService
    /* renamed from: a */
    public final InboxAdapterWidget mo87292a(Fragment fragment, LiveData<InboxAdapterWidget.EnumC56518b> liveData) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(liveData, "");
        return new ContactAdapterWidget(fragment, liveData);
    }
}
