package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63201ay;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63211ba;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.i */
public final class C72631i {

    /* renamed from: b */
    public static final C72632a f162807b = new C72632a((byte) 0);

    /* renamed from: a */
    public AbstractC72633b f162808a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.i$b */
    public interface AbstractC72633b {
        static {
            Covode.recordClassIndex(85316);
        }

        /* renamed from: a */
        void mo114916a();

        /* renamed from: b */
        void mo114917b();
    }

    static {
        Covode.recordClassIndex(85314);
    }

    /* renamed from: a */
    public static final void m128107a(String str, String str2, String str3, String str4, String str5) {
        C72632a.m128110a(str, str2, str3, str4, str5);
    }

    /* renamed from: a */
    public static final boolean m128108a() {
        return C72632a.m128111a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.i$a */
    public static final class C72632a {
        static {
            Covode.recordClassIndex(85315);
        }

        private C72632a() {
        }

        /* renamed from: a */
        public static boolean m128111a() {
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null || !cVar.isPreventDownload()) {
                return false;
            }
            AbstractC63201ay ayVar = C63238c.f143580g;
            C89219l.m154716b(ayVar, "");
            if (!C89361p.m154872a("JP", ayVar.mo93847a(), true) || C63238c.f143563A == null) {
                return false;
            }
            AbstractC63211ba baVar = C63238c.f143563A;
            C89219l.m154716b(baVar, "");
            if (baVar.mo93862a()) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C72632a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m128110a(String str, String str2, String str3, String str4, String str5) {
            C39162r.m79460a("download_alert", new C84425b().mo129406a("group_id", str).mo129406a("author_id", str2).mo129406a("enter_from", str3).mo129406a("download_method", str4).mo129406a("action_type", str5).f188764a);
        }
    }

    /* renamed from: a */
    public final Dialog mo114915a(Context context) {
        if (context == null) {
            return null;
        }
        C17197a.C17200a aVar = new C17197a.C17200a(context);
        aVar.f41071b = context.getString(R.string.h72);
        aVar.mo27190a(R.string.bb2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC72634c(this), false).mo27195b(R.string.bb5, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC72635d(this), false);
        Dialog c = aVar.mo27193a().mo27185c();
        c.setCanceledOnTouchOutside(false);
        c.setCancelable(false);
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.i$c */
    public static final class DialogInterface$OnClickListenerC72634c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72631i f162809a;

        static {
            Covode.recordClassIndex(85317);
        }

        DialogInterface$OnClickListenerC72634c(C72631i iVar) {
            this.f162809a = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC72633b bVar = this.f162809a.f162808a;
            if (bVar != null) {
                bVar.mo114916a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.i$d */
    public static final class DialogInterface$OnClickListenerC72635d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72631i f162810a;

        static {
            Covode.recordClassIndex(85318);
        }

        DialogInterface$OnClickListenerC72635d(C72631i iVar) {
            this.f162810a = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC72633b bVar = this.f162810a.f162808a;
            if (bVar != null) {
                bVar.mo114917b();
            }
        }
    }
}
