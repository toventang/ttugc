package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.controller.FirebaseStateController;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

/* renamed from: com.snapchat.kit.sdk.core.controller.b */
public final class C28971b implements FirebaseStateController, LoginStateController {

    /* renamed from: a */
    final WeakHashMap<LoginStateController.OnLoginStartListener, Void> f68446a = new WeakHashMap<>();

    /* renamed from: b */
    public final Handler f68447b;

    /* renamed from: c */
    private final WeakHashMap<LoginStateController.OnLoginStateChangedListener, Void> f68448c = new WeakHashMap<>();

    /* renamed from: d */
    private final WeakHashMap<FirebaseStateController.OnFirebaseCustomTokenResultListener, Void> f68449d = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(35162);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Collection<LoginStateController.OnLoginStateChangedListener> mo50332a() {
        return new ArrayList(this.f68448c.keySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Collection<FirebaseStateController.OnFirebaseCustomTokenResultListener> mo50334b() {
        return new ArrayList(this.f68449d.keySet());
    }

    /* renamed from: c */
    public final void mo50335c() {
        this.f68447b.post(new Runnable() {
            /* class com.snapchat.kit.sdk.core.controller.C28971b.RunnableC289721 */

            static {
                Covode.recordClassIndex(35163);
            }

            public final void run() {
                for (LoginStateController.OnLoginStartListener onLoginStartListener : new ArrayList(C28971b.this.f68446a.keySet())) {
                    onLoginStartListener.onLoginStart();
                }
            }
        });
    }

    /* renamed from: d */
    public final void mo50336d() {
        this.f68447b.post(new Runnable() {
            /* class com.snapchat.kit.sdk.core.controller.C28971b.RunnableC289732 */

            static {
                Covode.recordClassIndex(35164);
            }

            public final void run() {
                for (LoginStateController.OnLoginStateChangedListener onLoginStateChangedListener : C28971b.this.mo50332a()) {
                    onLoginStateChangedListener.onLoginFailed();
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo50337e() {
        this.f68447b.post(new Runnable() {
            /* class com.snapchat.kit.sdk.core.controller.C28971b.RunnableC289754 */

            static {
                Covode.recordClassIndex(35166);
            }

            public final void run() {
                for (LoginStateController.OnLoginStateChangedListener onLoginStateChangedListener : C28971b.this.mo50332a()) {
                    onLoginStateChangedListener.onLogout();
                }
            }
        });
    }

    @Override // com.snapchat.kit.sdk.core.controller.FirebaseStateController
    public final void addOnFirebaseCustomTokenResultListener(FirebaseStateController.OnFirebaseCustomTokenResultListener onFirebaseCustomTokenResultListener) {
        this.f68449d.put(onFirebaseCustomTokenResultListener, null);
    }

    @Override // com.snapchat.kit.sdk.core.controller.LoginStateController
    public final void addOnLoginStartListener(LoginStateController.OnLoginStartListener onLoginStartListener) {
        this.f68446a.put(onLoginStartListener, null);
    }

    @Override // com.snapchat.kit.sdk.core.controller.LoginStateController
    public final void addOnLoginStateChangedListener(LoginStateController.OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f68448c.put(onLoginStateChangedListener, null);
    }

    @Override // com.snapchat.kit.sdk.core.controller.FirebaseStateController
    public final void removeOnFirebaseCustomTokenResultListener(FirebaseStateController.OnFirebaseCustomTokenResultListener onFirebaseCustomTokenResultListener) {
        this.f68449d.remove(onFirebaseCustomTokenResultListener);
    }

    @Override // com.snapchat.kit.sdk.core.controller.LoginStateController
    public final void removeOnLoginStartListener(LoginStateController.OnLoginStartListener onLoginStartListener) {
        this.f68446a.remove(onLoginStartListener);
    }

    @Override // com.snapchat.kit.sdk.core.controller.LoginStateController
    public final void removeOnLoginStateChangedListener(LoginStateController.OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f68448c.remove(onLoginStateChangedListener);
    }

    C28971b(Handler handler) {
        this.f68447b = handler;
    }

    /* renamed from: a */
    public final void mo50333a(final EnumC28970a aVar) {
        this.f68447b.post(new Runnable() {
            /* class com.snapchat.kit.sdk.core.controller.C28971b.RunnableC289776 */

            static {
                Covode.recordClassIndex(35168);
            }

            public final void run() {
                for (FirebaseStateController.OnFirebaseCustomTokenResultListener onFirebaseCustomTokenResultListener : C28971b.this.mo50334b()) {
                    onFirebaseCustomTokenResultListener.onFailure(aVar);
                }
            }
        });
    }
}
