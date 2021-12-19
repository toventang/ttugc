package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.p1028b.C14978a;
import com.bytedance.geckox.utils.C15062l;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.p1349o.C18806a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.C53582d;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66378b;
import com.p2082ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import java.io.File;
import p4600h.C89386u;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.h */
public final class C53535h implements IHostOpenDepend {
    static {
        Covode.recordClassIndex(63111);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.h$a */
    public static final class C53536a implements AbstractC66380d {

        /* renamed from: a */
        final /* synthetic */ IHostOpenDepend.AbstractC18456c f122895a;

        static {
            Covode.recordClassIndex(63112);
        }

        @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d
        /* renamed from: a */
        public final String mo90115a() {
            return "";
        }

        C53536a(IHostOpenDepend.AbstractC18456c cVar) {
            this.f122895a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d
        /* renamed from: a */
        public final boolean mo90116a(String str, int i) {
            C89219l.m154721d(this, "");
            C66378b.f149285a.remove(this);
            IHostOpenDepend.AbstractC18456c cVar = this.f122895a;
            if (str == null) {
                str = "";
            }
            cVar.mo29559a(str);
            return true;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
    public final void scanCode(C18742c cVar, boolean z, IHostOpenDepend.AbstractC18456c cVar2) {
        C89219l.m154721d(cVar2, "");
        Context context = (Context) C53582d.m98794a(cVar, Context.class);
        if (context == null) {
            cVar2.mo29560b("Context cannot be null");
            return;
        }
        C39162r.m79460a("qr_code_scan_enter", new C33744d().mo59983a("enter_from", "h5").f79943a);
        C53536a aVar = new C53536a(cVar2);
        C89219l.m154721d(aVar, "");
        C66378b.f149285a.add(aVar);
        Activity a = C18806a.m34902a(context);
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - QRCodePermissionActivity.f149372c >= 1000) {
                QRCodePermissionActivity.f149372c = currentTimeMillis;
                Intent intent = new Intent(a, QRCodePermissionActivity.class);
                intent.putExtra("finishAfterScan", false);
                intent.putExtra("page_from", 3);
                intent.putExtra("camera_only", z);
                QRCodePermissionActivity.m118194a(a, intent);
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
    public final C89391z getGeckoInfo(String str, String str2, IHostOpenDepend.AbstractC18455b bVar) {
        C89386u uVar;
        long longValue;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        if (C14978a.f36587a == null || !C14978a.f36587a.containsKey(str + "-" + str2)) {
            uVar = new C89386u(false, null, null);
        } else {
            Long b = C15062l.m27736b(new File(C14930f.m27473a().f36475a.get(str)), str, str2);
            if (b == null) {
                longValue = 0;
            } else {
                longValue = b.longValue();
            }
            UpdatePackage updatePackage = C14978a.f36587a.get(str + "-" + str2);
            if (updatePackage == null || longValue == updatePackage.getVersion()) {
                uVar = new C89386u(false, null, null);
            } else {
                uVar = new C89386u(true, Long.valueOf(updatePackage.getFullPackage().getLength()), Long.valueOf(updatePackage.getVersion()));
            }
        }
        Boolean bool = (Boolean) uVar.getFirst();
        if (!bool.booleanValue()) {
            C89219l.m154716b(bool, "");
            bVar.mo29558a(new IHostOpenDepend.C18454a(bool.booleanValue()));
        } else {
            String valueOf = String.valueOf(((Number) uVar.getThird()).longValue());
            C89219l.m154716b(bool, "");
            IHostOpenDepend.C18454a aVar = new IHostOpenDepend.C18454a(bool.booleanValue());
            aVar.f44090a = (Long) uVar.getSecond();
            aVar.f44091b = valueOf;
            bVar.mo29558a(aVar);
        }
        return C89391z.f203057a;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
    public final C89391z updateGecko(String str, String str2, IHostOpenDepend.AbstractC18457d dVar, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(dVar, "");
        C80333dc.m139275b().mo23998a((String) null, C89041ag.m154412a(C89387v.m154943a(str, C89070n.m154516a(new CheckRequestBodyModel.TargetChannel(str2)))), new OptionCheckUpdateParams().setLazyUpdate(true).setListener(new C53518a(dVar, str2)).setEnableDownloadAutoRetry(z).setChannelUpdatePriority(3));
        return C89391z.f203057a;
    }
}
