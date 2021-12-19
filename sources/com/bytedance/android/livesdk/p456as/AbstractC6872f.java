package com.bytedance.android.livesdk.p456as;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.C8461n;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.model.C11839e;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.livesdk.as.f */
public interface AbstractC6872f {
    static {
        Covode.recordClassIndex(7610);
    }

    /* renamed from: a */
    AbstractC2994b mo13147a();

    /* renamed from: a */
    AbstractC88403ab<User> mo13148a(HashMap<String, String> hashMap);

    /* renamed from: a */
    AbstractC88979t<AbstractC2994b> mo13149a(Context context, C6876j jVar);

    /* renamed from: a */
    AbstractC88979t<C11688a> mo13150a(C6865d dVar);

    /* renamed from: a */
    AbstractC88979t<C11688a> mo13151a(C6869e eVar);

    /* renamed from: a */
    AbstractC88979t<C11688a> mo13152a(C6878k kVar);

    /* renamed from: a */
    String mo13153a(long j);

    /* renamed from: a */
    void mo13154a(int i);

    /* renamed from: a */
    void mo13155a(AbstractC2994b bVar);

    /* renamed from: a */
    void mo13156a(C11688a aVar);

    /* renamed from: a */
    void mo13157a(String str, DialogInterface.OnClickListener onClickListener, Context context, String str2, String str3, long j);

    /* renamed from: a */
    boolean mo13158a(EnumC6874h hVar);

    /* renamed from: b */
    User mo13159b();

    /* renamed from: b */
    AbstractC88403ab<User> mo13160b(long j);

    /* renamed from: c */
    long mo13161c();

    /* renamed from: c */
    AbstractC88979t<AbstractC2994b> mo13162c(long j);

    /* renamed from: d */
    AbstractC88979t<C11688a> mo13163d(long j);

    /* renamed from: d */
    boolean mo13164d();

    /* renamed from: e */
    boolean mo13165e();

    /* renamed from: f */
    void mo13166f();

    /* renamed from: g */
    List<C11839e> mo13167g();

    /* renamed from: h */
    AbstractC88924h<C8461n> mo13168h();

    /* renamed from: i */
    AbstractC88403ab<AbstractC2994b> mo13169i();

    /* renamed from: j */
    AbstractC88979t<AbstractC2994b> mo13170j();

    /* renamed from: k */
    AbstractC88979t<C11688a> mo13171k();
}
