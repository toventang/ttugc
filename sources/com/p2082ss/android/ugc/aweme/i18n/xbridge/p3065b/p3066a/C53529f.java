package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18423d;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18424e;
import com.bytedance.ies.xbridge.p1349o.C18806a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.AbstractC53583e;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.C53580b;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.C53587f;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.p3069a.C53558a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.p3069a.C53566b;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.p3069a.C53570c;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.p3069a.C53576d;
import java.lang.ref.WeakReference;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.f */
public final class C53529f implements IHostMediaDepend {
    static {
        Covode.recordClassIndex(63105);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.f$a */
    public static final class C53530a extends AbstractC53583e {

        /* renamed from: a */
        final /* synthetic */ Activity f122886a;

        /* renamed from: b */
        final /* synthetic */ IChooseMediaResultCallback f122887b;

        static {
            Covode.recordClassIndex(63106);
        }

        /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.f$a$a */
        static final class RunnableC53531a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53530a f122888a;

            /* renamed from: b */
            final /* synthetic */ int f122889b;

            /* renamed from: c */
            final /* synthetic */ String f122890c;

            static {
                Covode.recordClassIndex(63107);
            }

            RunnableC53531a(C53530a aVar, int i, String str) {
                this.f122888a = aVar;
                this.f122889b = i;
                this.f122890c = str;
            }

            public final void run() {
                this.f122888a.f122887b.onFailure(this.f122889b, this.f122890c);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.f$a$b */
        static final class RunnableC53532b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53530a f122891a;

            /* renamed from: b */
            final /* synthetic */ C18424e f122892b;

            static {
                Covode.recordClassIndex(63108);
            }

            RunnableC53532b(C53530a aVar, C18424e eVar) {
                this.f122891a = aVar;
                this.f122892b = eVar;
            }

            public final void run() {
                this.f122891a.f122887b.onSuccess(this.f122892b, "");
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53516b
        /* renamed from: a */
        public final void mo90107a(C18424e eVar) {
            C89219l.m154721d(eVar, "");
            this.f122886a.runOnUiThread(new RunnableC53532b(this, eVar));
        }

        @Override // com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53516b
        /* renamed from: a */
        public final void mo90106a(int i, String str) {
            C89219l.m154721d(str, "");
            this.f122886a.runOnUiThread(new RunnableC53531a(this, i, str));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53530a(Activity activity, IChooseMediaResultCallback iChooseMediaResultCallback, WeakReference weakReference) {
            super(weakReference);
            this.f122886a = activity;
            this.f122887b = iChooseMediaResultCallback;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend
    public final void handleJsInvoke(Context context, C18423d dVar, IChooseMediaResultCallback iChooseMediaResultCallback) {
        AbstractC53583e.EnumC53585b bVar;
        C89219l.m154721d(context, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(iChooseMediaResultCallback, "");
        Activity a = C18806a.m34902a(context);
        if (a == null) {
            iChooseMediaResultCallback.onFailure(0, "Context not provided");
            return;
        }
        C53530a aVar = new C53530a(a, iChooseMediaResultCallback, new WeakReference(a));
        C89219l.m154721d(dVar, "");
        Activity a2 = C53580b.m98792a(aVar.f122993c);
        if (!(a2 instanceof AbstractC34471f)) {
            aVar.mo90106a(0, "Failed to find proper activity");
            return;
        }
        ((AbstractC34471f) a2).setActivityResultListener(aVar);
        WeakReference weakReference = new WeakReference(a2);
        List<String> list = dVar.f44017e;
        if (list == null) {
            C89219l.m154715b();
        }
        String str = list.get(0);
        String str2 = dVar.f44018f;
        if (str == null || str2 == null) {
            bVar = AbstractC53583e.EnumC53585b.UNSUPPORTED;
        } else {
            String lowerCase = str.toLowerCase();
            C89219l.m154716b(lowerCase, "");
            if (C89219l.m154714a((Object) lowerCase, (Object) "image")) {
                String lowerCase2 = str2.toLowerCase();
                C89219l.m154716b(lowerCase2, "");
                if (C89219l.m154714a((Object) lowerCase2, (Object) "camera")) {
                    bVar = AbstractC53583e.EnumC53585b.TAKE_PHOTO;
                }
            }
            String lowerCase3 = str.toLowerCase();
            C89219l.m154716b(lowerCase3, "");
            if (C89219l.m154714a((Object) lowerCase3, (Object) "image")) {
                String lowerCase4 = str2.toLowerCase();
                C89219l.m154716b(lowerCase4, "");
                if (C89219l.m154714a((Object) lowerCase4, (Object) "album")) {
                    bVar = AbstractC53583e.EnumC53585b.PICK_PHOTO_FROM_ALBUM;
                }
            }
            String lowerCase5 = str.toLowerCase();
            C89219l.m154716b(lowerCase5, "");
            if (C89219l.m154714a((Object) lowerCase5, (Object) "video")) {
                String lowerCase6 = str2.toLowerCase();
                C89219l.m154716b(lowerCase6, "");
                if (C89219l.m154714a((Object) lowerCase6, (Object) "camera")) {
                    bVar = AbstractC53583e.EnumC53585b.TAKE_VIDEO;
                }
            }
            String lowerCase7 = str.toLowerCase();
            C89219l.m154716b(lowerCase7, "");
            if (C89219l.m154714a((Object) lowerCase7, (Object) "video")) {
                String lowerCase8 = str2.toLowerCase();
                C89219l.m154716b(lowerCase8, "");
                if (C89219l.m154714a((Object) lowerCase8, (Object) "album")) {
                    bVar = AbstractC53583e.EnumC53585b.PICK_VIDEO_FROM_ALBUM;
                }
            }
            bVar = AbstractC53583e.EnumC53585b.UNSUPPORTED;
        }
        if (bVar == AbstractC53583e.EnumC53585b.UNSUPPORTED) {
            aVar.mo90106a(-3, "Invalid fileType and sourceType in params");
            return;
        }
        int i = C53587f.f122996a[bVar.ordinal()];
        if (i == 1) {
            aVar.f122994d = new C53566b(weakReference, aVar);
            AbstractC53515a aVar2 = aVar.f122994d;
            if (aVar2 == null) {
                C89219l.m154710a("mIFileMediaFeature");
            }
            aVar2.mo90104a(dVar);
        } else if (i == 2) {
            aVar.f122994d = new C53576d(weakReference, aVar);
            AbstractC53515a aVar3 = aVar.f122994d;
            if (aVar3 == null) {
                C89219l.m154710a("mIFileMediaFeature");
            }
            aVar3.mo90104a(dVar);
        } else if (i == 3) {
            aVar.f122994d = new C53570c(weakReference, aVar);
            AbstractC53515a aVar4 = aVar.f122994d;
            if (aVar4 == null) {
                C89219l.m154710a("mIFileMediaFeature");
            }
            aVar4.mo90104a(dVar);
        } else if (i == 4) {
            aVar.f122994d = new C53558a(weakReference, aVar);
            AbstractC53515a aVar5 = aVar.f122994d;
            if (aVar5 == null) {
                C89219l.m154710a("mIFileMediaFeature");
            }
            aVar5.mo90104a(dVar);
        }
    }
}
