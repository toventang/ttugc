package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.p3133a;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.ChatDiggLayout;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Set;
import p4600h.p4601a.C89036ab;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a */
public abstract class AbstractC54376a extends AbstractC54386c {

    /* renamed from: v */
    public static final Set<EnumC53772b> f124546v = C89036ab.INSTANCE;

    /* renamed from: w */
    public static final C54377a f124547w = new C54377a((byte) 0);

    /* renamed from: t */
    public long f124548t;

    /* renamed from: u */
    public String f124549u;

    /* renamed from: x */
    private final ChatDiggLayout f124550x;

    /* renamed from: y */
    private final Handler f124551y = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public abstract boolean mo91168b();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a$a */
    public static final class C54377a {
        static {
            Covode.recordClassIndex(64080);
        }

        private C54377a() {
        }

        public /* synthetic */ C54377a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a$b */
    public static final class RunnableC54378b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC54376a f124552a;

        static {
            Covode.recordClassIndex(64081);
        }

        RunnableC54378b(AbstractC54376a aVar) {
            this.f124552a = aVar;
        }

        public final void run() {
            this.f124552a.mo91460g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c
    /* renamed from: c */
    public void mo91411c() {
        super.mo91411c();
        this.f124549u = C54881c.m100490a(this.f124543b);
    }

    static {
        Covode.recordClassIndex(64079);
    }

    /* renamed from: g */
    public final void mo91460g() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f124548t < InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            C56244a.m102191c("DiggMessageAdapter", "findOtherLastUserMsgAndUpdate lower than two sec");
            this.f124551y.removeCallbacksAndMessages(null);
            this.f124551y.postDelayed(new RunnableC54378b(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            return;
        }
        this.f124548t = uptimeMillis;
        String a = C54881c.m100490a(this.f124543b);
        if (a != null && (!C89219l.m154714a((Object) this.f124549u, (Object) a))) {
            this.f124549u = a;
            C56244a.m102191c("DmHelper", "SingleMessageAdapter->updatePartly->fail to notify all due to like");
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private static boolean m99688a(EnumC53772b bVar) {
        if (C89070n.m154556a((Iterable) f124546v, (Object) bVar)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c
    /* renamed from: a */
    public final void mo91458a(AbstractC54482a<?> aVar, EnumC53772b bVar) {
        if (m99688a(bVar) || aVar == null) {
            return;
        }
        if (mo91168b()) {
            ChatDiggLayout chatDiggLayout = this.f124550x;
            if (aVar.f124816l != null) {
                aVar.f124816l.mo91338a(chatDiggLayout);
                return;
            }
            return;
        }
        aVar.f124816l = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c
    /* renamed from: b */
    public final void mo91459b(AbstractC54482a<?> aVar, EnumC53772b bVar) {
        if (m99688a(bVar) || aVar == null) {
            return;
        }
        if (mo91168b()) {
            aVar.mo91571a(this.f124584n);
        } else {
            aVar.f124816l = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC54376a(C53709a aVar, View view) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        this.f124550x = (ChatDiggLayout) view.findViewById(R.id.b48);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g.AbstractC53708a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54375a
    /* renamed from: a */
    public final void mo90257a(Object obj, int i) {
        super.mo90257a(obj, i);
        if (obj != null) {
            if (i == 1 || i == 3) {
                mo91460g();
            }
        }
    }
}
