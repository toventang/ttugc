package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.media.AudioManager;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p379n.AbstractC5770d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.livesdk.event.C8456i;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.utils.C11260d;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.a */
public class C7428a implements AbstractC5770d {

    /* renamed from: a */
    public int f18421a;

    /* renamed from: b */
    final AudioManager.OnAudioFocusChangeListener f18422b = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.bytedance.android.livesdk.chatroom.detail.C7428a.C74291 */

        static {
            Covode.recordClassIndex(8199);
        }

        public final void onAudioFocusChange(int i) {
            C3854a.m9453a(3, "AudioFocusController", "change audio:" + i + ", mFocusRespondEnabled:" + C7428a.this.f18423c);
            C7428a.this.f18421a = i;
            if (C7428a.this.f18423c) {
                if (i == -2 || i == -3) {
                    C7428a.this.f18424d = System.currentTimeMillis();
                    C7428a aVar = C7428a.this;
                    aVar.mo13645a(true, aVar.f18425e, C7428a.this.f18426f);
                    C6779a.m14563a().mo13053a(new C8456i(true, true));
                } else if (i == 1) {
                    if (!(C7428a.this.f18425e instanceof ActivityC0945e) || ((ActivityC0580d) C7428a.this.f18425e).getLifecycle().mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED)) {
                        C7428a.this.f18424d = -1;
                        C7428a aVar2 = C7428a.this;
                        aVar2.mo13645a(false, aVar2.f18425e, C7428a.this.f18426f);
                    }
                } else if (i == -1) {
                    C7428a.this.f18424d = System.currentTimeMillis();
                    C7428a aVar3 = C7428a.this;
                    aVar3.mo13645a(true, aVar3.f18425e, C7428a.this.f18426f);
                    C6779a.m14563a().mo13053a(new C8456i(true, true));
                }
            }
        }
    };

    /* renamed from: c */
    public boolean f18423c = false;

    /* renamed from: d */
    public long f18424d = -1;

    /* renamed from: e */
    public Context f18425e;

    /* renamed from: f */
    public String f18426f;

    /* renamed from: g */
    private final AbstractC11643g f18427g;

    static {
        Covode.recordClassIndex(8198);
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5770d
    /* renamed from: a */
    public final void mo11509a(Context context) {
        mo13643a(context, AbstractC11643g.C11644a.m20504a(context));
    }

    /* renamed from: b */
    public final void mo13646b(Context context) {
        mo13647b(context, AbstractC11643g.C11644a.m20504a(context));
    }

    public C7428a(AbstractC11643g gVar) {
        this.f18427g = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13644a(boolean z) {
        this.f18423c = z;
        if (z && this.f18421a == -1) {
            this.f18424d = System.currentTimeMillis();
            mo13645a(true, this.f18425e, this.f18426f);
            C6779a.m14563a().mo13053a(new C8456i(true, true));
        }
    }

    /* renamed from: b */
    public final void mo13647b(Context context, String str) {
        mo13645a(true, context, str);
        C11260d.m19954b(this.f18422b);
        C11260d.m19953b();
    }

    /* renamed from: a */
    public final void mo13643a(Context context, String str) {
        this.f18425e = context;
        this.f18426f = str;
        C11260d.m19952a(this.f18422b);
        boolean z = true;
        if (C11260d.m19950a() == 1) {
            this.f18424d = -1;
            z = false;
        } else if (this.f18423c) {
            this.f18424d = System.currentTimeMillis();
        } else {
            this.f18424d = -1;
            z = false;
        }
        mo13645a(z, context, str);
    }

    /* renamed from: a */
    public final void mo13645a(boolean z, Context context, String str) {
        AbstractC11643g gVar = this.f18427g;
        if (gVar == null) {
            return;
        }
        if (gVar instanceof AbstractC5777j) {
            ((AbstractC5777j) gVar).mo11531a(z, str);
        } else {
            gVar.mo12914a(z, context);
        }
    }
}
