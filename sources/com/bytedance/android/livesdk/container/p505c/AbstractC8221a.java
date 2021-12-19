package com.bytedance.android.livesdk.container.p505c;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.container.p511h.AbstractC8249a;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxDelayDestroyJSB;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.c.a */
public abstract class AbstractC8221a {

    /* renamed from: a */
    public C7038b f20419a;

    /* renamed from: b */
    public final Activity f20420b;

    /* renamed from: c */
    public final HybridConfig f20421c;

    /* renamed from: d */
    public final String f20422d;

    /* renamed from: e */
    public final AbstractC8249a f20423e;

    static {
        Covode.recordClassIndex(9046);
    }

    /* renamed from: a */
    public void mo14488a(int i, int i2, Intent intent) {
        C89219l.m154721d(intent, "");
    }

    /* renamed from: a */
    public abstract void mo14489a(C7038b bVar);

    /* renamed from: a */
    public abstract void mo14490a(String str);

    /* renamed from: b */
    public abstract C7038b mo14492b();

    /* renamed from: c */
    public abstract void mo14493c();

    /* renamed from: d */
    public abstract void mo14494d();

    /* renamed from: f */
    public abstract View mo14496f();

    /* renamed from: g */
    public boolean mo14497g() {
        return false;
    }

    /* renamed from: h */
    public void mo14498h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.container.c.a$a */
    public static final class RunnableC8222a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC8221a f20424a;

        static {
            Covode.recordClassIndex(9047);
        }

        RunnableC8222a(AbstractC8221a aVar) {
            this.f20424a = aVar;
        }

        public final void run() {
            C7038b bVar = this.f20424a.f20419a;
            if (bVar != null) {
                bVar.mo13238b();
            }
        }
    }

    /* renamed from: a */
    public void mo14487a() {
        mo14493c();
        mo14494d();
        C7038b b = mo14492b();
        this.f20419a = b;
        if (b != null) {
            mo14489a(b);
        }
    }

    /* renamed from: e */
    public void mo14495e() {
        if (LynxDelayDestroyJSB.INSTANCE.getValue()) {
            C3940j.m9595a(new RunnableC8222a(this));
            return;
        }
        C7038b bVar = this.f20419a;
        if (bVar != null) {
            bVar.mo13238b();
        }
    }

    /* renamed from: a */
    public final void mo14491a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        C7038b bVar = this.f20419a;
        if (bVar != null) {
            bVar.mo13332a(str, jSONObject);
        }
    }

    public AbstractC8221a(Activity activity, HybridConfig hybridConfig, String str, AbstractC8249a aVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(hybridConfig, "");
        C89219l.m154721d(str, "");
        this.f20420b = activity;
        this.f20421c = hybridConfig;
        this.f20422d = str;
        this.f20423e = aVar;
    }
}
