package com.p2082ss.ttvideoengine.p4418k;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.k.a */
public class C86541a {

    /* renamed from: a */
    protected Handler f194973a = new HandlerC86542a(this);

    /* renamed from: b */
    protected boolean f194974b;

    /* renamed from: c */
    protected String f194975c;

    /* renamed from: d */
    public AbstractC86543b f194976d;

    /* renamed from: e */
    protected AbstractC86561j f194977e;

    static {
        Covode.recordClassIndex(101769);
    }

    /* renamed from: b */
    public void mo137804b() {
    }

    /* renamed from: c */
    public void mo137806c() {
    }

    /* renamed from: d */
    public void mo137808d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo137809e() {
        this.f194973a.sendEmptyMessage(0);
    }

    /* renamed from: com.ss.ttvideoengine.k.a$a */
    static class HandlerC86542a extends Handler {

        /* renamed from: a */
        private final WeakReference<C86541a> f194978a;

        static {
            Covode.recordClassIndex(101770);
        }

        public HandlerC86542a(C86541a aVar) {
            super(C86640h.m150077a());
            this.f194978a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            AbstractC86543b bVar;
            C86541a aVar = this.f194978a.get();
            if (aVar != null && (bVar = aVar.f194976d) != null && !aVar.f194974b) {
                int i = message.what;
                if (i == 0) {
                    bVar.mo137278a();
                } else if (i == 1) {
                    aVar.mo137808d();
                    bVar.mo137279a((C86633c) message.obj);
                } else if (i == 2) {
                    aVar.mo137808d();
                    bVar.mo137280a(null, (C86633c) message.obj);
                } else if (i == 3) {
                    aVar.mo137808d();
                    bVar.mo137280a((JSONObject) message.obj, null);
                }
            }
        }
    }

    public C86541a(String str) {
        this.f194975c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo137803a(JSONObject jSONObject) {
        this.f194973a.sendMessage(this.f194973a.obtainMessage(3, jSONObject));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo137805b(C86633c cVar) {
        this.f194973a.sendMessage(this.f194973a.obtainMessage(1, cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo137807c(C86633c cVar) {
        this.f194973a.sendMessage(this.f194973a.obtainMessage(2, cVar));
    }

    public C86541a(String str, AbstractC86561j jVar) {
        this.f194975c = str;
        this.f194977e = jVar == null ? new C86557i() : jVar;
    }
}
