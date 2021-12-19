package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.C87459h;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: com.ttnet.org.chromium.net.s */
public final class C87654s extends NetworkChangeNotifierAutoDetect.AbstractC87520f implements ApplicationStatus.AbstractC87427b {

    /* renamed from: b */
    private boolean f199099b;

    static {
        Covode.recordClassIndex(103636);
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.AbstractC87520f
    /* renamed from: c */
    public final void mo141640c() {
        if (!this.f199099b) {
            C87459h<ApplicationStatus.AbstractC87427b> hVar = ApplicationStatus.f198221e;
            int indexOf = hVar.f198360a.indexOf(this);
            if (indexOf != -1) {
                if (hVar.f198361b == 0) {
                    hVar.f198360a.remove(indexOf);
                } else {
                    hVar.f198363d = true;
                    hVar.f198360a.set(indexOf, null);
                }
                hVar.f198362c--;
                if (!C87459h.f198359e && hVar.f198362c < 0) {
                    throw new AssertionError();
                }
            }
            this.f199099b = true;
        }
    }

    @Override // com.ttnet.org.chromium.base.ApplicationStatus.AbstractC87427b
    /* renamed from: a */
    public final void mo141480a(int i) {
        if (i == 1) {
            mo141637a();
        } else if (i == 2) {
            mo141639b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.AbstractC87520f
    /* renamed from: a */
    public final void mo141638a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.mo141638a(networkChangeNotifierAutoDetect);
        ApplicationStatus.m151714a(this);
        mo141480a(ApplicationStatus.getStateForApplication());
    }
}
