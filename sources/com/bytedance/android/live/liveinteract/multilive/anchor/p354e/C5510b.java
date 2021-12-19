package com.bytedance.android.live.liveinteract.multilive.anchor.p354e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.p456as.C6878k;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.e.b */
public final class C5510b {

    /* renamed from: a */
    public static final C88411a f14087a = new C88411a();

    /* renamed from: b */
    public static final C5510b f14088b = new C5510b();

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.e.b$b */
    public static final class C5512b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC5509a f14090a;

        static {
            Covode.recordClassIndex(6107);
        }

        public C5512b(AbstractC5509a aVar) {
            this.f14090a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C5510b() {
    }

    static {
        Covode.recordClassIndex(6105);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.e.b$a */
    public static final class C5511a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC5509a f14089a;

        static {
            Covode.recordClassIndex(6106);
        }

        public C5511a(AbstractC5509a aVar) {
            this.f14089a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f14089a.mo11307a((C11688a) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.e.b$d */
    public static final class C5516d implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        public static final C5516d f14097a = new C5516d();

        static {
            Covode.recordClassIndex(6111);
        }

        C5516d() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.e.b$c */
    public static final class C5513c implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        final /* synthetic */ Context f14091a;

        /* renamed from: b */
        final /* synthetic */ User f14092b;

        /* renamed from: c */
        final /* synthetic */ Room f14093c;

        /* renamed from: d */
        final /* synthetic */ AbstractC5509a f14094d;

        static {
            Covode.recordClassIndex(6108);
        }

        public C5513c(Context context, User user, Room room, AbstractC5509a aVar) {
            this.f14091a = context;
            this.f14092b = user;
            this.f14093c = room;
            this.f14094d = aVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            Activity activity;
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            C6878k.C6881c cVar = new C6878k.C6881c();
            Context context = this.f14091a;
            while (true) {
                activity = null;
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            C6878k.AbstractC6879a a = ((C6878k.AbstractC6879a) cVar.mo13175a(activity).mo13134a(this.f14092b.getId())).mo13178b(this.f14093c.getId()).mo13176a("");
            FollowInfo followInfo = this.f14092b.getFollowInfo();
            C89219l.m154716b(followInfo, "");
            C5510b.f14087a.mo142945a(C11115u.m19743a().mo17915b().mo13152a(new C6878k(a.mo13174a((int) followInfo.getFollowStatus()))).mo143254a(new AbstractC88433f(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5510b.C5513c.C55141 */

                /* renamed from: a */
                final /* synthetic */ C5513c f14095a;

                static {
                    Covode.recordClassIndex(6109);
                }

                {
                    this.f14095a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    this.f14095a.f14094d.mo11307a((C11688a) obj);
                }
            }, new AbstractC88433f(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5510b.C5513c.C55152 */

                /* renamed from: a */
                final /* synthetic */ C5513c f14096a;

                static {
                    Covode.recordClassIndex(6110);
                }

                {
                    this.f14096a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }));
        }
    }
}
