package com.bytedance.crash;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.C14068q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.crash.a */
public final class C13814a extends C14068q<CrashType, AttachUserData> {

    /* renamed from: a */
    final Map<String, String> f33580a = new HashMap();
    public ICrashFilter mFilter;

    static {
        Covode.recordClassIndex(15871);
    }

    public final ICrashFilter getCrashFilter() {
        return this.mFilter;
    }

    public final Map<String, String> getTagMap() {
        return this.f33580a;
    }

    public final List<AttachUserData> getAttachUserData(CrashType crashType) {
        return getList(crashType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22251a(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            removeAll(attachUserData);
        } else {
            removeInList(crashType, attachUserData);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22252a(String str, String str2) {
        if (str2 == null) {
            this.f33580a.remove(str);
        } else {
            this.f33580a.put(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22250a(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            addMulti(attachUserData, CrashType.ANR, CrashType.LAUNCH, CrashType.JAVA, CrashType.DART, CrashType.GAME, CrashType.NATIVE, CrashType.CUSTOM_JAVA);
            return;
        }
        add(crashType, attachUserData);
    }
}
