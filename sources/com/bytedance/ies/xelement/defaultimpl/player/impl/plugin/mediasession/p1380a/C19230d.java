package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.p1380a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p010v4.media.session.MediaSessionCompat;
import androidx.core.app.C0595i;
import androidx.media.p066a.C1271a;
import androidx.media.p067b.C1274a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.p1380a.p1381a.AbstractC19220b;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.p1380a.p1381a.C19219a;
import com.bytedance.ies.xelement.p1364b.C19004g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.d */
public final class C19230d {

    /* renamed from: b */
    public static final C19231a f45418b = new C19231a((byte) 0);

    /* renamed from: a */
    public final Context f45419a;

    /* renamed from: c */
    private final AbstractC89244h f45420c;

    /* renamed from: d */
    private final AbstractC89244h f45421d;

    /* renamed from: e */
    private final AbstractC89244h f45422e;

    /* renamed from: f */
    private final AbstractC89244h f45423f;

    /* renamed from: g */
    private final AbstractC89244h f45424g;

    /* renamed from: h */
    private final AbstractC89244h f45425h;

    /* renamed from: i */
    private final AbstractC89244h f45426i = C89250i.m154773a((AbstractC89171a) C19238h.f45441a);

    /* renamed from: j */
    private final MediaSessionCompat.Token f45427j;

    /* renamed from: k */
    private final int f45428k;

    static {
        Covode.recordClassIndex(21997);
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.d$a */
    public static final class C19231a {
        static {
            Covode.recordClassIndex(21998);
        }

        private C19231a() {
        }

        public /* synthetic */ C19231a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.d$h */
    static final class C19238h extends AbstractC89220m implements AbstractC89171a<AbstractC19220b> {

        /* renamed from: a */
        public static final C19238h f45441a = new C19238h();

        static {
            Covode.recordClassIndex(22005);
        }

        C19238h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC19220b invoke() {
            return new C19219a();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.d$e */
    static final class C19235e extends AbstractC89220m implements AbstractC89171a<PendingIntent> {

        /* renamed from: a */
        final /* synthetic */ C19230d f45435a;

        /* renamed from: b */
        final /* synthetic */ ComponentName f45436b;

        static {
            Covode.recordClassIndex(22002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19235e(C19230d dVar, ComponentName componentName) {
            super(0);
            this.f45435a = dVar;
            this.f45436b = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PendingIntent invoke() {
            return C1274a.m4043a(this.f45435a.f45419a, this.f45436b, 512);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.d$f */
    static final class C19236f extends AbstractC89220m implements AbstractC89171a<PendingIntent> {

        /* renamed from: a */
        final /* synthetic */ C19230d f45437a;

        /* renamed from: b */
        final /* synthetic */ ComponentName f45438b;

        static {
            Covode.recordClassIndex(22003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19236f(C19230d dVar, ComponentName componentName) {
            super(0);
            this.f45437a = dVar;
            this.f45438b = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PendingIntent invoke() {
            return C1274a.m4043a(this.f45437a.f45419a, this.f45438b, 32);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.d$g */
    static final class C19237g extends AbstractC89220m implements AbstractC89171a<PendingIntent> {

        /* renamed from: a */
        final /* synthetic */ C19230d f45439a;

        /* renamed from: b */
        final /* synthetic */ ComponentName f45440b;

        static {
            Covode.recordClassIndex(22004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19237g(C19230d dVar, ComponentName componentName) {
            super(0);
            this.f45439a = dVar;
            this.f45440b = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PendingIntent invoke() {
            return C1274a.m4043a(this.f45439a.f45419a, this.f45440b, 16);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.d$b */
    static final class C19232b extends AbstractC89220m implements AbstractC89171a<PendingIntent> {

        /* renamed from: a */
        final /* synthetic */ C19230d f45429a;

        /* renamed from: b */
        final /* synthetic */ ComponentName f45430b;

        static {
            Covode.recordClassIndex(21999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19232b(C19230d dVar, ComponentName componentName) {
            super(0);
            this.f45429a = dVar;
            this.f45430b = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PendingIntent invoke() {
            Context context = this.f45429a.f45419a;
            Intent intent = new Intent();
            intent.setComponent(this.f45430b);
            intent.putExtra("command_from_notification", 2);
            return PendingIntent.getBroadcast(context, 2, intent, 134217728);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.d$c */
    static final class C19233c extends AbstractC89220m implements AbstractC89171a<PendingIntent> {

        /* renamed from: a */
        final /* synthetic */ C19230d f45431a;

        /* renamed from: b */
        final /* synthetic */ ComponentName f45432b;

        static {
            Covode.recordClassIndex(22000);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19233c(C19230d dVar, ComponentName componentName) {
            super(0);
            this.f45431a = dVar;
            this.f45432b = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PendingIntent invoke() {
            Context context = this.f45431a.f45419a;
            Intent intent = new Intent();
            intent.setComponent(this.f45432b);
            intent.putExtra("command_from_notification", 1);
            return PendingIntent.getBroadcast(context, 1, intent, 134217728);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.d$d */
    static final class C19234d extends AbstractC89220m implements AbstractC89171a<PendingIntent> {

        /* renamed from: a */
        final /* synthetic */ C19230d f45433a;

        /* renamed from: b */
        final /* synthetic */ ComponentName f45434b;

        static {
            Covode.recordClassIndex(22001);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19234d(C19230d dVar, ComponentName componentName) {
            super(0);
            this.f45433a = dVar;
            this.f45434b = componentName;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PendingIntent invoke() {
            Context context = this.f45433a.f45419a;
            Intent intent = new Intent();
            intent.setComponent(this.f45434b);
            intent.putExtra("command_from_notification", 3);
            return PendingIntent.getBroadcast(context, 3, intent, 134217728);
        }
    }

    /* renamed from: a */
    public final Notification mo30589a(C19239e eVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        C89219l.m154719c(eVar, "");
        try {
            Context context = this.f45419a;
            if (this.f45428k == -1) {
                return null;
            }
            C0595i.C0600e eVar2 = new C0595i.C0600e(context, "X_AUDIO_DEFAULT_PLAY_SERVICE");
            eVar2.mo2622b(false);
            eVar2.mo2605a(this.f45428k);
            eVar2.mo2611a((Uri) null);
            eVar2.mo2604a();
            this.f45426i.getValue();
            eVar2.mo2623c();
            eVar2.mo2609a((PendingIntent) this.f45422e.getValue());
            String str = eVar.f45445d;
            if (str == null) {
                str = "";
            }
            eVar2.mo2613a((CharSequence) str);
            String str2 = eVar.f45446e;
            if (str2 == null) {
                str2 = "";
            }
            eVar2.mo2621b(str2);
            String str3 = eVar.f45447f;
            if (str3 == null) {
                str3 = "";
            }
            eVar2.mo2625c(str3);
            eVar2.mo2615a(C89219l.m154714a((Object) eVar.f45442a, (Object) true));
            eVar2.mo2620b((PendingIntent) this.f45420c.getValue());
            eVar2.mo2614a("x_audio_default_player_service");
            Bitmap bitmap = eVar.f45448g;
            if (bitmap == null || !bitmap.isRecycled()) {
                eVar2.mo2610a(eVar.f45448g);
            } else {
                C19004g.f44970a.mo30156b("NotificationFactory", "coverBitmap(" + eVar.f45448g + ") already recycled.");
            }
            Boolean bool = eVar.f45443b;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                i = 2131235027;
            } else {
                i = 2131235028;
            }
            eVar2.mo2607a(i, "SkipToPrevious", (PendingIntent) this.f45423f.getValue());
            Boolean bool2 = eVar.f45442a;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            if (z2) {
                i2 = 2131235026;
            } else {
                i2 = 2131235023;
            }
            eVar2.mo2607a(i2, "PlayOrPause", (PendingIntent) this.f45424g.getValue());
            Boolean bool3 = eVar.f45444c;
            if (bool3 != null) {
                z3 = bool3.booleanValue();
            } else {
                z3 = false;
            }
            if (z3) {
                i3 = 2131235024;
            } else {
                i3 = 2131235025;
            }
            eVar2.mo2607a(i3, "SkipToNext", (PendingIntent) this.f45425h.getValue());
            eVar2.mo2612a(new C1271a.C1272a().mo4248a(0, 1, 2).mo4249c().mo4247a(this.f45427j).mo4246a((PendingIntent) this.f45421d.getValue()));
            return eVar2.mo2626d();
        } catch (Exception e) {
            C19004g.f44970a.mo30157c("NotificationFactory", e.getMessage());
            return null;
        }
    }

    public C19230d(Context context, MediaSessionCompat.Token token, ComponentName componentName, int i) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(componentName, "");
        this.f45419a = context;
        this.f45427j = token;
        this.f45428k = i;
        this.f45420c = C89250i.m154773a((AbstractC89171a) new C19233c(this, componentName));
        this.f45421d = C89250i.m154773a((AbstractC89171a) new C19232b(this, componentName));
        this.f45422e = C89250i.m154773a((AbstractC89171a) new C19234d(this, componentName));
        this.f45423f = C89250i.m154773a((AbstractC89171a) new C19237g(this, componentName));
        this.f45424g = C89250i.m154773a((AbstractC89171a) new C19235e(this, componentName));
        this.f45425h = C89250i.m154773a((AbstractC89171a) new C19236f(this, componentName));
    }
}
