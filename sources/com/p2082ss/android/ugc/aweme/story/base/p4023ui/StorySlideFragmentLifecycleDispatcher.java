package com.p2082ss.android.ugc.aweme.story.base.p4023ui;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.story.base.widget.C76653a;

/* renamed from: com.ss.android.ugc.aweme.story.base.ui.StorySlideFragmentLifecycleDispatcher */
public final class StorySlideFragmentLifecycleDispatcher implements AbstractC33974au {

    /* renamed from: a */
    boolean f172005a;

    /* renamed from: b */
    C76653a f172006b;

    /* renamed from: c */
    AbstractC22219j f172007c;

    /* renamed from: d */
    Bundle f172008d;

    /* renamed from: e */
    private boolean f172009e;

    /* renamed from: f */
    private boolean f172010f;

    /* renamed from: g */
    private boolean f172011g;

    /* renamed from: h */
    private boolean f172012h;

    /* renamed from: i */
    private boolean f172013i;

    static {
        Covode.recordClassIndex(89631);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroyView();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    private final void onPause() {
        C76653a aVar;
        if (!this.f172013i) {
            this.f172009e = false;
            if (this.f172012h && (aVar = this.f172006b) != null) {
                aVar.f52525b.mo36576c();
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    private final void onResume() {
        C76653a aVar;
        if (!this.f172013i) {
            this.f172009e = true;
            if (this.f172012h && (aVar = this.f172006b) != null) {
                aVar.f52525b.mo36575b();
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    private final void onStart() {
        C76653a aVar;
        if (!this.f172013i) {
            this.f172010f = true;
            if (this.f172012h && (aVar = this.f172006b) != null) {
                aVar.f52525b.mo36573a();
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    private final void onStop() {
        C76653a aVar;
        if (!this.f172013i) {
            this.f172010f = false;
            if (this.f172012h && (aVar = this.f172006b) != null) {
                aVar.f52525b.mo36577d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo120402a() {
        C76653a aVar;
        AbstractC22219j jVar = this.f172007c;
        if (jVar != null && this.f172012h && !this.f172011g && 1 != 0 && (aVar = this.f172006b) != null) {
            aVar.mo120416a(jVar);
            aVar.mo36462a();
            this.f172008d = null;
            this.f172011g = true;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroyView() {
        C76653a aVar;
        if (this.f172011g && (aVar = this.f172006b) != null) {
            aVar.f52525b.mo36578e();
            aVar.f52524a.f52595a = null;
        }
    }

    /* renamed from: b */
    public final void mo120404b(boolean z) {
        if (!z || !this.f172010f) {
            this.f172013i = z;
        }
    }

    /* renamed from: a */
    public final void mo120403a(boolean z) {
        C76653a aVar;
        C76653a aVar2;
        C76653a aVar3;
        C76653a aVar4;
        this.f172012h = z;
        if (z) {
            mo120402a();
            if (this.f172010f && (aVar4 = this.f172006b) != null) {
                aVar4.f52525b.mo36573a();
            }
            if (this.f172009e && (aVar3 = this.f172006b) != null) {
                aVar3.f52525b.mo36575b();
                return;
            }
            return;
        }
        if (this.f172009e && (aVar2 = this.f172006b) != null) {
            aVar2.f52525b.mo36576c();
        }
        if (this.f172010f && (aVar = this.f172006b) != null) {
            aVar.f52525b.mo36577d();
        }
    }
}
