package com.p2082ss.android.ugc.aweme.choosemusic.model;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.s */
public final class C35917s {

    /* renamed from: c */
    public static final C35918a f84769c = new C35918a((byte) 0);

    /* renamed from: a */
    public final int f84770a;

    /* renamed from: b */
    public final Intent f84771b;

    static {
        Covode.recordClassIndex(43157);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35917s)) {
            return false;
        }
        C35917s sVar = (C35917s) obj;
        return this.f84770a == sVar.f84770a && C89219l.m154714a(this.f84771b, sVar.f84771b);
    }

    public final int hashCode() {
        int i = this.f84770a * 31;
        Intent intent = this.f84771b;
        return i + (intent != null ? intent.hashCode() : 0);
    }

    public final String toString() {
        return "ChooseMusicResult(resultCode=" + this.f84770a + ", intent=" + this.f84771b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.model.s$a */
    public static final class C35918a {
        static {
            Covode.recordClassIndex(43158);
        }

        private C35918a() {
        }

        public /* synthetic */ C35918a(byte b) {
            this();
        }
    }

    public /* synthetic */ C35917s() {
        this(Integer.MAX_VALUE, null);
    }

    public C35917s(int i, Intent intent) {
        this.f84770a = i;
        this.f84771b = intent;
    }
}
