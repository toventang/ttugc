package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.p3069a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18423d;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18424e;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53516b;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import java.lang.ref.WeakReference;
import java.util.List;
import p078c.p080b.C1757e;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.b */
public final class C53566b implements AbstractC53515a {

    /* renamed from: c */
    public static final C53567a f122951c = new C53567a((byte) 0);

    /* renamed from: a */
    final WeakReference<Activity> f122952a;

    /* renamed from: b */
    public final AbstractC53516b f122953b;

    static {
        Covode.recordClassIndex(63142);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.b$a */
    public static final class C53567a {
        static {
            Covode.recordClassIndex(63143);
        }

        private C53567a() {
        }

        public /* synthetic */ C53567a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.b$b */
    static final class C53568b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53566b f122954a;

        static {
            Covode.recordClassIndex(63144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53568b(C53566b bVar) {
            super(0);
            this.f122954a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C53566b bVar = this.f122954a;
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("video/*");
            Activity activity = bVar.f122952a.get();
            if (activity != null) {
                activity.startActivityForResult(intent, 700);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a
    /* renamed from: a */
    public final void mo90104a(C18423d dVar) {
        C89219l.m154721d(dVar, "");
        C53568b bVar = new C53568b(this);
        C89219l.m154721d(bVar, "");
        Activity activity = this.f122952a.get();
        if (activity == null) {
            return;
        }
        if (C80620e.m139781c(activity) == 0) {
            bVar.invoke();
        } else {
            C35444b.m72473a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C53569c(this, bVar));
        }
    }

    public C53566b(WeakReference<Activity> weakReference, AbstractC53516b bVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(bVar, "");
        this.f122952a = weakReference;
        this.f122953b = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.b$c */
    static final class C53569c implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C53566b f122955a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f122956b;

        static {
            Covode.recordClassIndex(63145);
        }

        C53569c(C53566b bVar, AbstractC89171a aVar) {
            this.f122955a = bVar;
            this.f122956b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0) {
                this.f122956b.invoke();
            } else {
                this.f122955a.f122953b.mo90106a(-6, "Permission not granted");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a
    /* renamed from: a */
    public final boolean mo90105a(int i, int i2, Intent intent) {
        if (i == 700) {
            if (i2 == 0 || intent == null) {
                this.f122953b.mo90106a(-7, "User cancelled");
                return true;
            }
            Activity activity = this.f122952a.get();
            if (activity == null) {
                this.f122953b.mo90106a(0, "Activity not found");
                return true;
            }
            Uri data = intent.getData();
            if (data == null || C13627m.m24498a(data.toString())) {
                this.f122953b.mo90106a(0, "Video doesn't exist");
                return true;
            }
            String uri = data.toString();
            C89219l.m154716b(uri, "");
            List<C18424e.C18425a> a = C89070n.m154516a(new C18424e.C18425a(uri, C1757e.m5900a(activity, data), "video"));
            AbstractC53516b bVar = this.f122953b;
            C18424e eVar = new C18424e();
            eVar.f44026a = a;
            bVar.mo90107a(eVar);
        }
        return true;
    }
}
