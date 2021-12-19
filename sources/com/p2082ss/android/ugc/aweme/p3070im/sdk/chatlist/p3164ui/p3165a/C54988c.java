package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a;

import android.content.Context;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54823a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.c */
public final class C54988c extends AbstractC54985b {

    /* renamed from: h */
    public static final String f125876h = "DeleteAction";

    /* renamed from: i */
    public static final C54989a f125877i = new C54989a((byte) 0);

    /* renamed from: f */
    public final boolean f125878f;

    /* renamed from: g */
    final int f125879g;

    /* renamed from: j */
    private final int f125880j;

    /* renamed from: k */
    private final int f125881k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.c$a */
    public static final class C54989a {
        static {
            Covode.recordClassIndex(64715);
        }

        private C54989a() {
        }

        public /* synthetic */ C54989a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: a */
    public final int mo91950a() {
        return this.f125879g;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: b */
    public final int mo91951b() {
        return this.f125881k;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: c */
    public final int mo91952c() {
        return this.f125880j;
    }

    static {
        Covode.recordClassIndex(64714);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: d */
    public final void mo91953d() {
        int i;
        int i2;
        String str;
        C19639i coreInfo;
        Context context = this.f125870c;
        if (this.f125878f) {
            i = R.string.b90;
        } else {
            i = R.string.b8y;
        }
        String string = context.getString(i);
        C89219l.m154716b(string, "");
        Context context2 = this.f125870c;
        if (this.f125878f) {
            i2 = R.string.b91;
        } else {
            i2 = R.string.b8z;
        }
        String string2 = context2.getString(i2);
        C89219l.m154716b(string2, "");
        if (this.f125878f) {
            Object[] objArr = new Object[1];
            C19638h hVar = this.f125868a;
            if (hVar == null || (coreInfo = hVar.getCoreInfo()) == null || (str = coreInfo.getName()) == null) {
                str = "";
            }
            objArr[0] = str;
            C89219l.m154716b(C1764a.m5928a(string, Arrays.copyOf(objArr, 1)), "");
        }
        ((C23023b) C23028c.m43435a(new C23023b(this.f125870c).mo37411b(string).mo37413d(string2), new C54990b(this)).mo37482a(false)).mo37405a().mo37396b().show();
        C39162r.onEvent(MobClick.obtain().setEventName("delete").setLabelName("message").setValue(String.valueOf(AbstractC17427b.C17428a.m32311c(this.f125869b))));
        C54823a.m100425a("delete", this.f125872e.mo91860c());
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.c$c */
    public static final class C54993c implements AbstractC19479b<String> {

        /* renamed from: a */
        final /* synthetic */ C54988c f125885a;

        static {
            Covode.recordClassIndex(64719);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54993c(C54988c cVar) {
            this.f125885a = cVar;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            String str = "ChatSession delete conversation failed: ";
            if (uVar != null) {
                str = str + uVar.f46728a + ", " + uVar.f46730c;
            }
            C56244a.m102193e(C54988c.f125876h, str);
            new C79459a(C17867d.m33078a()).mo123050a(R.string.cdr).mo123053a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(String str) {
            C89219l.m154721d(str, "");
            if (!this.f125885a.f125878f) {
                long c = AbstractC17427b.C17428a.m32311c(this.f125885a.f125869b);
                if (c > 0) {
                    C55219n a = C55219n.m100965a();
                    String valueOf = String.valueOf(c);
                    if (!TextUtils.isEmpty(valueOf)) {
                        a.f126297a.edit().putBoolean("key_friend_rec_".concat(String.valueOf(valueOf)), true).commit();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.c$b */
    static final class C54990b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54988c f125882a;

        static {
            Covode.recordClassIndex(64716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54990b(C54988c cVar) {
            super(1);
            this.f125882a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(this.f125882a.f125879g, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.C54988c.C54990b.C549911 */

                /* renamed from: a */
                final /* synthetic */ C54990b f125883a;

                static {
                    Covode.recordClassIndex(64717);
                }

                {
                    this.f125883a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C54988c cVar = this.f125883a.f125882a;
                    AbstractC17420a.C17421a.m32276a().mo27732c(cVar.f125869b, new C54993c(cVar));
                    C54823a.m100427b("delete", this.f125883a.f125882a.f125872e.mo91860c());
                    return C89391z.f203057a;
                }
            });
            String string = this.f125882a.f125870c.getString(R.string.a8y);
            C89219l.m154716b(string, "");
            bVar2.mo37419b(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.C54988c.C54990b.C549922 */

                /* renamed from: a */
                final /* synthetic */ C54990b f125884a;

                static {
                    Covode.recordClassIndex(64718);
                }

                {
                    this.f125884a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C54823a.m100427b("cancel", this.f125884a.f125882a.f125872e.mo91860c());
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54988c(Context context, AbstractC17427b bVar, AbstractC56237a aVar) {
        super(context, bVar, aVar, (byte) 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        boolean z = false;
        C19638h c = bVar.mo27749c();
        this.f125878f = c != null ? c.isStranger() : z;
        this.f125880j = 1;
        this.f125879g = R.string.cdb;
        this.f125881k = R.raw.icon_trash_bin;
    }
}
