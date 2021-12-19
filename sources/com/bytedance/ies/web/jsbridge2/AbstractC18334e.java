package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.e */
public abstract class AbstractC18334e<P, R> extends AbstractC18332c<P, R> {
    public C18338g callContext;
    private AbstractC18335a callback;
    private boolean isValid = true;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.web.jsbridge2.e$a */
    public interface AbstractC18335a {
        static {
            Covode.recordClassIndex(21007);
        }

        /* renamed from: a */
        void mo29353a(Object obj);

        /* renamed from: a */
        void mo29354a(Throwable th);

        /* renamed from: a */
        void mo29355a(JSONObject jSONObject);
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.e$b */
    public interface AbstractC18336b {
        static {
            Covode.recordClassIndex(21008);
        }

        /* renamed from: a */
        AbstractC18334e mo13316a();
    }

    static {
        Covode.recordClassIndex(21006);
    }

    /* access modifiers changed from: protected */
    public abstract void invoke(P p, C18338g gVar);

    /* access modifiers changed from: protected */
    public abstract void onTerminate();

    public final void finishWithFailure() {
        finishWithFailure(null);
    }

    public final void finishWithSuccess() {
        finishWithResult(null);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18332c
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    public void onDestroy() {
        this.isValid = false;
        this.callContext = null;
    }

    /* access modifiers changed from: package-private */
    public void terminateActual() {
        onTerminate();
        onDestroy();
    }

    private boolean checkInvalid() {
        if (this.isValid) {
            return true;
        }
        C18344j.m34123a((RuntimeException) new IllegalStateException("Jsb async call already finished: " + getName() + ", hashcode: " + hashCode()));
        return false;
    }

    public final void finishWithFailure(Throwable th) {
        if (checkInvalid()) {
            this.callback.mo29354a(th);
            onDestroy();
        }
    }

    public final void finishWithRawResult(JSONObject jSONObject) {
        if (checkInvalid()) {
            this.callback.mo29355a(jSONObject);
            onDestroy();
        }
    }

    public final void finishWithResult(R r) {
        if (checkInvalid()) {
            this.callback.mo29353a((Object) r);
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    public void invokeActual(P p, C18338g gVar, AbstractC18335a aVar) {
        this.callContext = gVar;
        this.callback = aVar;
        invoke(p, gVar);
    }
}
