package com.p2082ss.android.ugc.aweme.commerce_sticker_impl.service;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.AbstractC37571a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.p2531a.C37572a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.sticker.model.C75441c;
import com.p2082ss.android.ugc.aweme.sticker.model.C75442d;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.service.a */
public final class C37576a implements AbstractC37571a {

    /* renamed from: a */
    public static final C37577a f88801a = new C37577a((byte) 0);

    static {
        Covode.recordClassIndex(44979);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.service.a$a */
    public static final class C37577a {
        static {
            Covode.recordClassIndex(44980);
        }

        private C37577a() {
        }

        public /* synthetic */ C37577a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m75799a(C75445g gVar) {
            AbstractC37569a a;
            if (gVar == null || gVar.f169545id == null || gVar.extra == null) {
                return false;
            }
            AbstractC37569a a2 = C37572a.m75786a();
            if (a2 != null) {
                String str = gVar.f169545id;
                C89219l.m154716b(str, "");
                if (a2.mo65415b(str)) {
                    return false;
                }
            }
            if (!(gVar.commerceSticker == null || (a = C37572a.m75786a()) == null)) {
                String str2 = gVar.extra;
                C89219l.m154716b(str2, "");
                if (a.mo65416c(str2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.service.a$a$a */
        static final class DialogInterface$OnClickListenerC37578a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public static final DialogInterface$OnClickListenerC37578a f88802a = new DialogInterface$OnClickListenerC37578a();

            static {
                Covode.recordClassIndex(44981);
            }

            DialogInterface$OnClickListenerC37578a() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.service.a$a$b */
        static final class DialogInterface$OnClickListenerC37579b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C75445g f88803a;

            /* renamed from: b */
            final /* synthetic */ String f88804b;

            /* renamed from: c */
            final /* synthetic */ Context f88805c;

            static {
                Covode.recordClassIndex(44982);
            }

            DialogInterface$OnClickListenerC37579b(C75445g gVar, String str, Context context) {
                this.f88803a = gVar;
                this.f88804b = str;
                this.f88805c = context;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
                if (r0 == null) goto L_0x0078;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.content.DialogInterface r7, int r8) {
                /*
                // Method dump skipped, instructions count: 141
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commerce_sticker_impl.service.C37576a.C37577a.DialogInterface$OnClickListenerC37579b.onClick(android.content.DialogInterface, int):void");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.AbstractC37571a
    /* renamed from: a */
    public final boolean mo65428a(C75445g gVar) {
        return C37577a.m75799a(gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.AbstractC37571a
    /* renamed from: a */
    public final boolean mo65427a(Context context, C75445g gVar, String str) {
        C75442d dVar;
        String str2;
        String str3 = "";
        C89219l.m154721d(context, str3);
        C89219l.m154721d(str, str3);
        if (gVar == null || gVar.f169545id == null || !C37577a.m75799a(gVar)) {
            return false;
        }
        AbstractC37569a a = C37572a.m75786a();
        if (a != null) {
            String str4 = gVar.f169545id;
            C89219l.m154716b(str4, str3);
            if (a.mo65415b(str4)) {
                return false;
            }
        }
        C39162r.m79460a("show_toast", new C33744d().mo59983a("prop_id", gVar.f169545id).mo59983a("scene_id", "1001").mo59983a("enter_from", str).f79943a);
        C75441c cVar = gVar.commerceSticker;
        if (cVar != null) {
            dVar = cVar.getCommerceStickerUnlockInfo();
        } else {
            dVar = null;
        }
        C17197a.C17200a aVar = new C17197a.C17200a(context);
        if (!(dVar == null || (str2 = dVar.desc) == null)) {
            str3 = str2;
        }
        aVar.f41071b = str3;
        aVar.mo27189a(R.string.gej).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) C37577a.DialogInterface$OnClickListenerC37578a.f88802a, false).mo27190a(R.string.b68, (DialogInterface.OnClickListener) new C37577a.DialogInterface$OnClickListenerC37579b(gVar, str, context), false).mo27193a().mo27185c();
        return true;
    }
}
