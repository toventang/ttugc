package com.p2082ss.android.ugc.aweme.ecommerce.coupon.event;

import android.os.SystemClock;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.event.Logger */
public final class Logger implements AbstractC33974au {

    /* renamed from: a */
    public String f103375a;

    /* renamed from: b */
    private String f103376b;

    /* renamed from: c */
    private String f103377c;

    /* renamed from: d */
    private boolean f103378d;

    /* renamed from: e */
    private boolean f103379e;

    /* renamed from: f */
    private final List<String> f103380f;

    /* renamed from: g */
    private final LinkedHashMap<String, Object> f103381g;

    /* renamed from: h */
    private C44329b f103382h;

    static {
        Covode.recordClassIndex(52641);
    }

    private Logger(char c) {
        this((byte) 0);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    private Logger() {
        this.f103380f = new ArrayList();
        this.f103381g = new LinkedHashMap<>();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        String str;
        C44329b bVar = this.f103382h;
        if (bVar != null) {
            bVar.mo75230a(this.f103381g);
            bVar.mo75231a(this.f103378d);
            if (this.f103379e) {
                str = "return";
            } else {
                str = "close";
            }
            C89219l.m154721d(str, "");
            bVar.f106050k.put("quit_type", str);
            if (bVar.f103384b > 0) {
                bVar.f106050k.put("stay_time", Long.valueOf(SystemClock.uptimeMillis() - bVar.f103384b));
                bVar.mo76747d();
            }
        }
        this.f103382h = null;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        C44329b bVar = new C44329b();
        bVar.mo75230a(this.f103381g);
        String str = this.f103376b;
        if (str == null) {
            C89219l.m154710a("pageName");
        }
        C89219l.m154721d(str, "");
        bVar.f106050k.put("page_name", str);
        String str2 = this.f103377c;
        if (str2 == null) {
            C89219l.m154710a("previousPage");
        }
        C89219l.m154721d(str2, "");
        bVar.f106050k.put("previous_page", str2);
        String str3 = this.f103375a;
        if (str3 != null) {
            bVar.f106050k.put("entrance_info", str3);
        }
        bVar.mo75231a(true);
        bVar.f103384b = SystemClock.uptimeMillis();
        this.f103382h = bVar;
    }

    private /* synthetic */ Logger(byte b) {
        this();
    }
}
