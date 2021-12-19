package com.bytedance.android.live.liveinteract.multiguest.p316a.p319c;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.app.p231a.C4060b;
import com.bytedance.android.live.liveinteract.api.AbstractC4444o;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.model.C7687g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p542g.C8779e;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.a */
public final class C5140a {
    static {
        Covode.recordClassIndex(5732);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.a$b */
    public static final class C5142b implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        public static final C5142b f13328a = new C5142b();

        static {
            Covode.recordClassIndex(5734);
        }

        C5142b() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.a$d */
    public static final class C5144d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5144d f13330a = new C5144d();

        static {
            Covode.recordClassIndex(5736);
        }

        C5144d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11264f.m19957a(C3966y.m9669e(), (Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.a$c */
    public static final class C5143c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC4444o.EnumC4445a f13329a;

        static {
            Covode.recordClassIndex(5735);
        }

        public C5143c(AbstractC4444o.EnumC4445a aVar) {
            this.f13329a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            if (dVar != null) {
                try {
                    if (dVar.data != null) {
                        String a = C5140a.m11378a((C7687g) dVar.data, this.f13329a);
                        if (!TextUtils.isEmpty(a)) {
                            C11226ao.m19883a(C3966y.m9669e(), a, 0);
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } catch (IllegalArgumentException unused) {
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.a$a */
    public static final class View$OnClickListenerC5141a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f13326a;

        /* renamed from: b */
        final /* synthetic */ LiveDialog f13327b;

        static {
            Covode.recordClassIndex(5733);
        }

        View$OnClickListenerC5141a(Context context, LiveDialog liveDialog) {
            this.f13326a = context;
            this.f13327b = liveDialog;
        }

        public final void onClick(View view) {
            String str;
            Context context = this.f13326a;
            Uri.Builder appendQueryParameter = Uri.parse(C8779e.m17078a()).buildUpon().appendQueryParameter("enter_from", "popup").appendQueryParameter("ban_type", String.valueOf(AbstractC4444o.EnumC4445a.BAN_FOR_LINK.type));
            String str2 = "anchor";
            if (C11279p.m20029f()) {
                str = str2;
            } else {
                str = "guest";
            }
            String uri = appendQueryParameter.appendQueryParameter("user_type", str).build().toString();
            C89219l.m154716b(uri, "");
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(uri);
            b.f17379c = true;
            ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13248a(context, b);
            this.f13327b.dismiss();
            C6501b f = C6501b.C6502a.m13948a("livesdk_guest_linkmic_ban_details_click").mo12639a().mo12661f("click");
            if (!C11279p.m20029f()) {
                str2 = "guest";
            }
            f.mo12651a("user_type", str2).mo12655b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0057, code lost:
        if (r0 == null) goto L_0x0059;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String m11377a(com.bytedance.android.livesdk.chatroom.model.C7687g r6) {
        /*
            java.lang.String r4 = ""
            if (r6 == 0) goto L_0x0059
            boolean r1 = r6.f19045a
            r0 = 1
            if (r1 != r0) goto L_0x0014
            r0 = 2131827218(0x7f111a12, float:1.9287342E38)
            java.lang.String r0 = com.bytedance.android.live.core.p218f.C3966y.m9657a(r0)
        L_0x0010:
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r4)
            return r0
        L_0x0014:
            java.util.Date r5 = new java.util.Date
            long r2 = r6.f19047c
            long r0 = r6.f19048d
            long r2 = r2 + r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r5.<init>(r2)
            r0 = 2131827222(0x7f111a16, float:1.928735E38)
            java.lang.String r3 = com.bytedance.android.live.core.p218f.C3966y.m9657a(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = "HH:mm"
            r2.<init>(r0, r1)
            java.lang.String r1 = r2.format(r5)
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)
            java.lang.String r0 = "{time}"
            java.lang.String r3 = p4600h.p4622m.C89361p.m154868a(r3, r0, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = "dd-MM-yyyy"
            r2.<init>(r0, r1)
            java.lang.String r1 = r2.format(r5)
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)
            java.lang.String r0 = "{date}"
            java.lang.String r0 = p4600h.p4622m.C89361p.m154868a(r3, r0, r1)
            if (r0 != 0) goto L_0x0010
        L_0x0059:
            r0 = 2131827526(0x7f111b46, float:1.9287967E38)
            java.lang.String r0 = com.bytedance.android.live.core.p218f.C3966y.m9657a(r0)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5140a.m11377a(com.bytedance.android.livesdk.chatroom.model.g):java.lang.String");
    }

    /* renamed from: a */
    public static final String m11378a(C7687g gVar, AbstractC4444o.EnumC4445a aVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (aVar == null) {
            try {
                throw new IllegalArgumentException("Required value was null.".toString());
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (gVar.f19045a) {
            int i = C5145b.f13331a[aVar.ordinal()];
            if (i == 1) {
                C5713h.m12525c("suspend_permanent_guest");
                return C3966y.m9657a((int) R.string.ea1);
            } else if (i == 2) {
                C5713h.m12525c("suspend_permanent_host");
                return C3966y.m9657a((int) R.string.e_z);
            } else {
                throw new C89376n();
            }
        } else {
            Date date = new Date((gVar.f19047c + gVar.f19048d) * 1000);
            int i2 = C5145b.f13332b[aVar.ordinal()];
            if (i2 == 1) {
                C5713h.m12525c("suspend_temporarily_guest");
                String a = C3966y.m9657a((int) R.string.ea2);
                C89219l.m154716b(a, "");
                String format = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date);
                C89219l.m154716b(format, "");
                String a2 = C89361p.m154868a(a, "{0}", format);
                String format2 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(date);
                C89219l.m154716b(format2, "");
                return C89361p.m154868a(a2, "{1}", format2);
            } else if (i2 == 2) {
                C5713h.m12525c("suspend_temporarily_host");
                String a3 = C3966y.m9657a((int) R.string.ea0);
                C89219l.m154716b(a3, "");
                String format3 = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date);
                C89219l.m154716b(format3, "");
                String a4 = C89361p.m154868a(a3, "{0}", format3);
                String format4 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(date);
                C89219l.m154716b(format4, "");
                return C89361p.m154868a(a4, "{1}", format4);
            } else {
                throw new C89376n();
            }
        }
    }

    /* renamed from: a */
    public static final void m11379a(C7687g gVar, Context context, AbstractC1204m mVar) {
        LiveDialog.C4056a aVar = new LiveDialog.C4056a(context);
        aVar.f11192a = mVar;
        aVar.f11241q = false;
        LiveDialog a = aVar.mo9499a(R.string.e3l).mo9502a(m11377a(gVar)).mo9500a(R.string.e3m, C5142b.f13328a).mo9503a();
        C4060b.C4061a a2 = new C4060b.C4061a().mo9508a(context);
        a2.f11255b = new View$OnClickListenerC5141a(context, a);
        a.mo9497a(a2.mo9509a());
        a.show();
        C5713h.m12522b();
    }
}
