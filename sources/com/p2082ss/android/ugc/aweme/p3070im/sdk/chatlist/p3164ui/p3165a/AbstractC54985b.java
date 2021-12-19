package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b */
public abstract class AbstractC54985b {

    /* renamed from: a */
    public final C19638h f125868a;

    /* renamed from: b */
    public final String f125869b;

    /* renamed from: c */
    public final Context f125870c;

    /* renamed from: d */
    public final AbstractC17427b f125871d;

    /* renamed from: e */
    public final AbstractC56237a f125872e;

    /* renamed from: f */
    private final int f125873f;

    static {
        Covode.recordClassIndex(64711);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo91950a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo91951b();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo91953d();

    /* renamed from: e */
    public boolean mo91954e() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo91952c() {
        return this.f125873f;
    }

    /* renamed from: f */
    public final C23208a.C23214e mo91955f() {
        return (C23208a.C23214e) new C23208a.C23214e().mo37785a(mo91950a()).mo37789b(mo91952c()).mo37786a(new View$OnClickListenerC54987b(this));
    }

    /* renamed from: g */
    public final C23208a.C23213d mo91956g() {
        return (C23208a.C23213d) new C23208a.C23213d().mo37801c(mo91951b()).mo37785a(mo91950a()).mo37789b(mo91952c()).mo37786a(new View$OnClickListenerC54986a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b$a */
    public static final class View$OnClickListenerC54986a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC54985b f125874a;

        static {
            Covode.recordClassIndex(64712);
        }

        View$OnClickListenerC54986a(AbstractC54985b bVar) {
            this.f125874a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125874a.mo91953d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b$b */
    public static final class View$OnClickListenerC54987b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC54985b f125875a;

        static {
            Covode.recordClassIndex(64713);
        }

        View$OnClickListenerC54987b(AbstractC54985b bVar) {
            this.f125875a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125875a.mo91953d();
        }
    }

    private AbstractC54985b(Context context, AbstractC17427b bVar, AbstractC56237a aVar) {
        this.f125870c = context;
        this.f125871d = bVar;
        this.f125872e = aVar;
        this.f125868a = bVar.mo27749c();
        this.f125869b = bVar.mo27743b();
    }

    public /* synthetic */ AbstractC54985b(Context context, AbstractC17427b bVar, AbstractC56237a aVar, byte b) {
        this(context, bVar, aVar);
    }
}
