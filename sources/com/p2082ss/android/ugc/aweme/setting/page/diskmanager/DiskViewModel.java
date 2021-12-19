package com.p2082ss.android.ugc.aweme.setting.page.diskmanager;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.p1713b.C23024a;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel */
public final class DiskViewModel extends AbstractC1174ac {

    /* renamed from: d */
    public static final C68278a f152849d = new C68278a((byte) 0);

    /* renamed from: a */
    public final C1213t<Boolean> f152850a;

    /* renamed from: b */
    public final C1213t<Integer> f152851b;

    /* renamed from: c */
    public final C1213t<C89378p<Integer, AbstractC89172b<C23024a, C89391z>>> f152852c = new C1213t<>();

    static {
        Covode.recordClassIndex(80491);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel$a */
    public static final class C68278a {
        static {
            Covode.recordClassIndex(80492);
        }

        private C68278a() {
        }

        public /* synthetic */ C68278a(byte b) {
            this();
        }
    }

    public DiskViewModel() {
        C1213t<Boolean> tVar = new C1213t<>();
        tVar.setValue(false);
        this.f152850a = tVar;
        C1213t<Integer> tVar2 = new C1213t<>();
        tVar2.setValue(0);
        this.f152851b = tVar2;
    }
}
